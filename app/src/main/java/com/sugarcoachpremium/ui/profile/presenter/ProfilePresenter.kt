package com.sugarcoachpremium.ui.profile.presenter

import android.Manifest
import android.app.Activity
import android.content.ContentValues
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Build
import android.provider.MediaStore
import android.util.Log
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.graphics.createBitmap
import androidx.core.graphics.toColorInt
import androidx.core.net.toUri
import androidx.fragment.app.FragmentManager
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.sugarcoachpremium.R
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.ui.base.presenter.BasePresenter
import com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp
import com.sugarcoachpremium.ui.profile.view.ProfileItem
import com.sugarcoachpremium.ui.profile.view.ProfileView
import com.sugarcoachpremium.util.SchedulerProvider
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import io.reactivex.disposables.CompositeDisposable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.joda.time.LocalDate
import org.joda.time.LocalDateTime
import java.io.ByteArrayOutputStream
import java.lang.Exception
import java.util.Calendar
import javax.inject.Inject
import kotlin.math.abs

class ProfilePresenter <V : ProfileView, I : ProfileInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable),
    ProfilePresenterImp<V, I> {

    lateinit var user: User
    val permissionRequest = 1
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override fun onAttach(view: V?) {
        super.onAttach(view)
        getAvatars()
        getMedition()
    }

    override fun onDetach() {
        super.onDetach()
        presenterScope.coroutineContext.cancelChildren()
    }

    override fun updateSex(name: String?) {
        val v = getView() ?: return
        name ?: return
        user.sex = name
        v.setSex(name)
    }

    override fun updateAvatar(position: Int, avatar: ProfileItem) {
        val v = getView() ?: return
        user.avatar = avatar.image
        v.setAvatar(position)
    }

    override fun setBirthday(year: Int, monthOfYear: Int, dayOfMonth: Int) {
        val v = getView() ?: return
        val date = LocalDate(year, monthOfYear + 1, dayOfMonth)
        user.birthday = date.toDate()
        v.setBirthday(date.toDate())
    }

    override fun setDebut(year: Int, monthOfYear: Int, dayOfMonth: Int) {
        val v = getView() ?: return
        val date = LocalDate(year, monthOfYear + 1, dayOfMonth)
        user.debut = date.toDate()
        v.setDebut(date.toDate())
    }

    private fun getUser() = interactor?.let {
        compositeDisposable.add(it.getUser()
            .compose(schedulerProvider.ioToMainSingleScheduler())
            .subscribe({
                val v = getView() ?: return@subscribe
                Log.i("OnGetUser", "La data fue $it") // Use explicit 'it'
                user = it
                v.getUserData(it)
                it.birthday?.let { birthdayDate ->
                    v.setBirthday(birthdayDate)
                }
                it.debut?.let { debutDate ->
                    v.setDebut(debutDate)
                }
            }, { err -> Log.i("OnGetUser", "No se pudo encontrar el usuario: $err") }))
    }

    fun getAvatars() {
        val v = getView() ?: return
        val items = ArrayList<ProfileItem>()
        for (i in 1..12) {
            val item = ProfileItem.Builder()
                .id(i)
                .image("avatar_$i")
                .selected(false)
                .build()
            items.add(item)
        }
        v.setAvatars(items)
        getUser()
    }

    override fun updateAll(name: String?, weight: Float?, height: Float?, username: String?, mail: String?) {
        val v = getView() ?: return
        v.showProgress()

        if (!this::user.isInitialized) {
            Log.e("ProfilePresenter", "User no ha sido inicializado en updateAll.")
            v.hideProgress(); v.showErrorToast("Error: Datos de usuario no disponibles."); return
        }

        val points = changedFieldsCount(user, name, weight, height, username, mail)
        user.points = (user.points ?: 0) + points

        name?.let { user.name = it }
        weight?.let { user.weight = it }
        height?.let { user.height = it }
        username?.let { user.username = it }
        mail?.let { user.email = it }

        if (user.birthday != null && user.debut != null && user.debut!!.before(user.birthday!!)) {
            v.hideProgress(); v.showErrorToast("La fecha de debut no puede ser anterior a la de nacimiento."); return
        }

        val inter = interactor ?: run { v.hideProgress(); v.showErrorToast("Operación cancelada"); return }
        compositeDisposable.add(
            inter.updateUser(user)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({
                    presenterScope.launch {
                        try {
                            val dataIdRes = withContext(Dispatchers.IO) { inter.getDataId() }
                            dataIdRes.fold(
                                onSuccess = { id ->
                                    val upRes = withContext(Dispatchers.IO) { inter.updateApiUser(user, id) }
                                    upRes.fold(
                                        onSuccess = {
                                            getView()?.hideProgress()
                                            getView()?.createCongratsDialog(points, user.points ?: 0)
                                        },
                                        onFailure = {errorUpdateApi ->
                                            Log.e("ProfilePresenter", "Error en updateApiUser: ", errorUpdateApi)
                                            getView()?.hideProgress()
                                            getView()?.showErrorToast("Error al actualizar en servidor. Verifique su conexión Wifi")
                                        }
                                    )
                                },
                                onFailure = {errorGetDataId ->
                                    Log.e("ProfilePresenter", "Error en getDataId: ", errorGetDataId)
                                    getView()?.hideProgress()
                                    getView()?.showErrorToast("Error al obtener ID de datos. Verifique su conexión Wifi")
                                }
                            )
                        } catch (e: Exception) {
                            Log.e("ProfilePresenter", "Excepción en corrutina de updateAll: ", e)
                            getView()?.hideProgress()
                            getView()?.showErrorToast("Ocurrió un error inesperado.")
                        }
                    }
                }, { t ->
                    getView()?.hideProgress()
                    getView()?.showErrorToast(t.localizedMessage ?: "Error al actualizar localmente.")
                })
        )
    }

    private fun neq(a: Float?, b: Float?, eps: Float = 1e-3f) =
        when {
            a == null && b == null -> false
            a == null || b == null -> true
            else -> abs(a - b) > eps
        }

    private fun changedFieldsCount(u: User, name: String?, w: Float?, h: Float?, username: String?, mail: String?): Int {
        var c = 0
        if (name != null && name != u.name) c++
        if (w != null && neq(w, u.weight)) c++
        if (h != null && neq(h, u.height)) c++
        if (username != null && username != u.username) c++
        if (mail != null && mail != u.email) c++
        return if (c == 0) 0 else 100 + (c - 1) * 50
    }

    override fun logout() {
        getView() ?: return
        val providerId = Firebase.auth.currentUser?.providerData

        Log.i("CurrentUser", "El usuario actual es: ${Firebase.auth.currentUser}")
        Log.i("CurrentProvider", "El provider actual es:$providerId")
        Firebase.auth.signOut()
        com.facebook.login.LoginManager.getInstance().logOut()
        interactor?.perfomLogout()

        interactor?.let { currentInteractor -> 
            compositeDisposable.add(
                currentInteractor.deleteUser()
                    .compose(schedulerProvider.ioToMainObservableScheduler()) 
                    .flatMap { currentInteractor.deleteTreament() } 
                    .subscribe(
                        {
                            Log.i("ProfilePresenter", "Logout cleanup successful, opening login activity.")
                            getView()?.openLoginActivity()
                         },
                        { e ->
                            Log.e("ProfilePresenter", "Error en logout cleanup", e)
                            getView()?.showErrorToast("Error durante la limpieza de datos.")
                            getView()?.openLoginActivity() 
                        }
                    )
            )
        } ?: getView()?.openLoginActivity()
    }

    /*fun deleteRegisters() {
        val v = getView() ?: return
        interactor?.let {
            compositeDisposable.add(it.deleteAll()
                .flatMap { interactor?.deleteTreament() }
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({
                    interactor?.perfomLogout()
                    v.openLoginActivity()
                }, { err -> Log.e("ProfilePresenter", "Error en deleteAll/deleteTreatment", err) }))
        }
    }*/

    private fun getMedition() {
        val v = getView() ?: return
        val currentDate = LocalDateTime()
        v.setDateMedition(currentDate.toDate())
    }

    override fun showDateDialog(
        fragmentManager: FragmentManager,
        dateSetListener: DatePickerDialog.OnDateSetListener,
        tag: String,
        date: LocalDate
    ) {
        if (getView() == null) return
        val dpd = DatePickerDialog.newInstance(
            dateSetListener,
            date.year,
            date.monthOfYear - 1,
            date.dayOfMonth
        )
        dpd.setCancelColor("#000000".toColorInt())
        dpd.setOkColor("#000000".toColorInt())

        val todayCalendar = Calendar.getInstance()
        dpd.maxDate = todayCalendar

        if (tag == "debut") {
            if (this::user.isInitialized && user.birthday != null) {
                val birthDateCalendar = Calendar.getInstance()
                birthDateCalendar.time = user.birthday!!
                dpd.minDate = birthDateCalendar
            }
        }
        dpd.show(fragmentManager, tag)
    }

    override fun getScreenShot(context: Activity, view: View) {
        val v = getView() ?: return
        if (checkAndRequestPermissions(context)) {
            val bitmap = getScreenShotImage(view)
            val uri = getImageUri(context, bitmap)
            if (uri == Uri.EMPTY) {
                v.showErrorToast("No se pudo guardar la captura")
                return
            }
            v.sharedScreenShot(uri)
        }
    }

    private fun getScreenShotImage(view: View): Bitmap {
        val w = view.width.takeIf { it > 0 } ?: view.measuredWidth
        val h = view.height.takeIf { it > 0 } ?: view.measuredHeight
        require(w > 0 && h > 0) { "View width and height must be > 0. Got $w x $h" }

        val bmp = createBitmap(w, h, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bmp)
        (view.background ?: ColorDrawable(Color.WHITE)).draw(canvas)
        view.draw(canvas)
        return bmp
    }


    fun checkAndRequestPermissions(context: Activity): Boolean {
        val requiredPermissions = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            listOf(Manifest.permission.READ_MEDIA_IMAGES)
        } else {
             listOf(Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE)
        }

        val listPermissionsNeeded = ArrayList<String>()
        for (permission in requiredPermissions) {
            if (ContextCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                listPermissionsNeeded.add(permission)
            }
        }

        if (listPermissionsNeeded.isNotEmpty()) {
            ActivityCompat.requestPermissions(context, listPermissionsNeeded.toTypedArray(), permissionRequest)
            return false
        }
        return true
    }

    private fun getImageUri(context: Context, bmp: Bitmap): Uri {
        val displayName = "${getRandomString(10)}.jpg"
        val mimeType = "image/jpeg"

        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) { // API 29
            val contentValues = ContentValues().apply {
                put(MediaStore.Images.Media.DISPLAY_NAME, displayName)
                put(MediaStore.Images.Media.MIME_TYPE, mimeType)
                put(MediaStore.Images.Media.RELATIVE_PATH, "Pictures/SugarCoach")
                put(MediaStore.Images.Media.IS_PENDING, 1)
            }
            val resolver = context.contentResolver
            var uri: Uri? = null
            try {
                uri = resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)
                uri?.let {
                    resolver.openOutputStream(it)?.use { out ->
                        bmp.compress(Bitmap.CompressFormat.JPEG, 95, out)
                    }
                    contentValues.clear()
                    contentValues.put(MediaStore.Images.Media.IS_PENDING, 0)
                    resolver.update(it, contentValues, null, null)
                }
                uri ?: Uri.EMPTY
            } catch (e: Exception) {
                Log.e("ProfilePresenter", "Error saving image with ContentResolver: $e")
                uri?.let { resolver.delete(it, null, null) } 
                Uri.EMPTY
            }
        } else {
            @Suppress("DEPRECATION")
            val path: String? = MediaStore.Images.Media.insertImage(context.contentResolver, bmp, displayName, null)
            path?.toUri() ?: run {
                 Log.e("ProfilePresenter", "MediaStore.Images.Media.insertImage returned null (legacy path)")
                 Uri.EMPTY
            }
        }
    }

    private fun getRandomString(length: Int): String {
        val allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz1234567890"
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }

    override fun onRequestPermissionsResult(context: Activity, requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        val v = getView() ?: return
        when (requestCode) {
            permissionRequest -> {
                if (grantResults.isNotEmpty()) {
                    var allGranted = true
                    for (i in grantResults.indices) {
                        if (grantResults[i] != PackageManager.PERMISSION_GRANTED) {
                            allGranted = false
                            Log.w("ProfilePresenter", "Permiso denegado: ${permissions[i]}")
                        }
                    }
                    if (!allGranted) {
                        v.explain(R.string.daily_detail_permission)
                    }
                } else {
                    Log.w("ProfilePresenter", "grantResults vacío, el usuario pudo cancelar.")
                    v.explain(R.string.daily_detail_permission)
                }
            }
        }
    }

    override fun commitChanges(name: String?, weight: Float?, height: Float?, username: String?, mail: String?) {
        getView() ?: return 
        updateAll(name, weight, height, username, mail)
    }
}
