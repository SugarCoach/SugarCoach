package com.sugarcoachpremium.ui.profile.presenter

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import java.util.Calendar // Aseguramos que esta sea la importación para Calendar
import android.net.Uri
import android.provider.MediaStore
import android.util.Log
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
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
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.joda.time.LocalDate
import org.joda.time.LocalDateTime
import java.io.ByteArrayOutputStream
import javax.inject.Inject
import kotlin.reflect.full.memberProperties

class ProfilePresenter <V : ProfileView, I : ProfileInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable),
    ProfilePresenterImp<V, I> {

    lateinit var user: User
    val permissionRequest = 1

    override fun onAttach(view: V?) {
        super.onAttach(view)
        getAvatars()
        getMedition()
    }
    override fun updateSex(name: String?) {
        user.sex = name!!.toString()
        getView()?.setSex(name)
    }

    override fun updateAvatar(position: Int, avatar: ProfileItem) {
        user.avatar = avatar.image
        getView()?.setAvatar(position)
    }

    override fun setBirthday(year: Int, monthOfYear: Int, dayOfMonth: Int) {
        val date = LocalDate(year, monthOfYear, dayOfMonth)
        user.birthday = date.toDate()
        getView()?.setBirthday(date.toDate())
    }

    override fun setDebut(year: Int, monthOfYear: Int, dayOfMonth: Int) {
        val date = LocalDate(year, monthOfYear, dayOfMonth)
        user.debut = date.toDate()
        getView()?.setDebut(date.toDate())
    }

    private fun getUser() = interactor?.let {
        compositeDisposable.add(it.getUser()
            .compose(schedulerProvider.ioToMainSingleScheduler())
            .subscribe({ userData ->
                Log.i("OnGetUser", "La data fue $userData")
                getView()?.let {
                    user = userData
                    getView()?.getUserData(userData)
                    userData.birthday?.let {
                        getView()?.setBirthday(it)
                    }
                    userData.debut?.let {
                        getView()?.setDebut(it)
                    }
                }
            }, { err -> Log.i("OnGetUser", "No se pudo encontrar el usuario") }))
    }

    fun getAvatars(){
        var items = ArrayList<ProfileItem>();
        for (i in 1 until 12){
            val item = ProfileItem.Builder()
                .id(i)
                .image("avatar_"+i)
                .selected(false)
                .build()
            items.add(item)
        }
        getView()?.setAvatars(items)
        getUser()
    }
    override fun updateAll(name: String?,weight: Float?,height: Float?,username: String?,mail: String?) {

        Log.i("UpdateAll", "Datos recibidos - name: $name, weight: $weight, height: $height, username: $username, mail: $mail")

        getView()?.showProgress()

        if(name != null){
            println(name)
            user.name = name.toString()
        }
        if (weight != null) {
            println(weight)
            user.weight = weight.toFloat()
        }
        if (height != null) {
            println(height)
            user.height = height.toFloat()
        }
        if(username != null){
            println(username)
            user.username = username.toString()
        }
        if(mail != null){
            println(mail)
            user.email = mail.toString()
        }
        val points = cantParametersChanged(name,weight,height,username,mail)
        user.points += points

        // Validación de fecha de debut vs nacimiento ANTES de guardar
        if (user.birthday != null && user.debut != null && user.debut!!.before(user.birthday!!)) {
            getView()?.showErrorToast("La fecha de debut no puede ser anterior a la de nacimiento.")
            getView()?.hideProgress()
            return
        }

        interactor?.let {
            compositeDisposable.add(it.updateUser(user)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({
                    CoroutineScope(Dispatchers.IO).launch {
                        interactor!!.getDataId().fold({
                            interactor!!.updateApiUser(user, it).fold({
                                withContext(Dispatchers.Main){
                                    getView()?.hideProgress()
                                    getView()?.createCongratsDialog(points, user.points)
                                }
                            },{
                                withContext(Dispatchers.Main){
                                    getView()?.hideProgress()
                                    getView()?.showErrorToast("Verifique su conexión Wifi")
                                }
                            })
                        },{
                            withContext(Dispatchers.Main){
                                getView()?.hideProgress()
                                getView()?.showErrorToast("Verifique su conexión Wifi")
                            }
                        })
                    }
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }

    private fun cantParametersChanged(name: String?,weight: Float?,height: Float?,username: String?,mail: String?): Int{
        val noNull = mutableListOf<String>()
        val listOfProperties = mutableListOf("username","email","sex", "name", "avatar", "weight",
            "birthday", "debut", "number", "height")
        val listOfValues = mutableListOf<String?>(user.name,user.weight.toString(),user.height.toString(),user.username,user.email,
            user.debut.toString(), user.avatar.toString(), user.birthday.toString(), user.sex.toString())

        val properties = User::class.memberProperties

        for (property in properties) {
            val valor = property.get(user)

            if ((valor != "" && valor != null) && (property.name in listOfProperties) && (valor.toString() !in listOfValues)) {
                Log.i("OnProfilePresenter", "cantParameterChanged: El valor es: $valor, ${property.name}")
                noNull.add(property.name)
            }
        }
        var points = 0
        var contr = true
        for(v in 1 until noNull.size){
            if(contr){
                points += 100
                contr = false
            }
            points += 50
        }
        return points
    }

    override fun logout() {
        val providerId = Firebase.auth.currentUser?.providerData

        Log.i("CurrentUser", "El usuario actual es: ${Firebase.auth.currentUser}")
        Log.i("CurrentProvider", "El provider actual es:$providerId")
        Firebase.auth.signOut()
        com.facebook.login.LoginManager.getInstance().logOut()
        interactor?.perfomLogout()
        getView()?.openLoginActivity()
        interactor?.let {
            compositeDisposable.add(it.deleteUser()
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ result ->
                    interactor?.perfomLogout()
                    getView()?.openLoginActivity()
                }, { err -> println(err) })
            )
        }
        interactor?.let {
            compositeDisposable.add(it.deleteUser()
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .flatMap { interactor?.deleteTreament() }
                .subscribe({ result ->
                    interactor?.perfomLogout()
                    getView()?.openLoginActivity()
                }, { err -> println(err) }))
        }
    }
    fun deleteRegisters() {
        interactor?.let {
            compositeDisposable.add(it.deleteAll()
                .flatMap { interactor?.deleteTreament() }
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ result ->
                    interactor?.perfomLogout()
                    getView()?.openLoginActivity()
                }, { err -> println(err) }))}

    }

    private fun getMedition(){
        var currentDate = LocalDateTime()
        getView()?.setDateMedition(currentDate.toDate())
    }

    override fun showDateDialog(
        fragmentManager: FragmentManager,
        dateSetListener: DatePickerDialog.OnDateSetListener,
        tag: String,
        date: LocalDate // Esta es la fecha inicial para el diálogo
    ) {
        val dpd = DatePickerDialog.newInstance(
            dateSetListener,
            date.year,
            date.monthOfYear - 1, // joda-time month es 1-12, DatePickerDialog espera 0-11
            date.dayOfMonth
        )
        dpd.setCancelColor(Color.parseColor("#000000"))
        dpd.setOkColor(Color.parseColor("#000000"))

        // --- RESTRICCIÓN GENERAL: NO FECHAS FUTURAS (aplica a ambos diálogos) ---
        val todayCalendar = Calendar.getInstance() // Esto ahora será java.util.Calendar
        dpd.maxDate = todayCalendar

        // --- RESTRICCIÓN ESPECÍFICA PARA LA FECHA DE DEBUT ---
        if (tag == "debut") {
            if (this::user.isInitialized && user.birthday != null) {
                val birthDateCalendar = Calendar.getInstance() // Esto ahora será java.util.Calendar
                birthDateCalendar.time = user.birthday!!
                dpd.minDate = birthDateCalendar
            }
        }
        dpd.show(fragmentManager, tag)
    }
    override fun getScreenShot(context: Activity, view: View) {
        if (checkAndRequestPermissions(context)){
            val bitmap = getScreenShotImage(view)
            val uri = getImageUri(context, bitmap)
            getView()?.sharedScreenShot(uri)
        }
    }
    private fun getScreenShotImage(view: View): Bitmap {
        val returnedBitmap = Bitmap.createBitmap(view.width, view.height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(returnedBitmap)
        val bgDrawable = view.background
        if (bgDrawable != null) bgDrawable.draw(canvas)
        else canvas.drawColor(Color.WHITE)
        view.draw(canvas)
        return returnedBitmap
    }
    fun checkAndRequestPermissions(context: Activity): Boolean {
        val readpermission = ContextCompat.checkSelfPermission(context, Manifest.permission.READ_EXTERNAL_STORAGE)
        val writepermission = ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE)


        val listPermissionsNeeded = ArrayList<String>()

        if (readpermission != PackageManager.PERMISSION_GRANTED) {
            listPermissionsNeeded.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
        }
        if (writepermission != PackageManager.PERMISSION_GRANTED) {
            listPermissionsNeeded.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
        }
        if (!listPermissionsNeeded.isEmpty()) {
            ActivityCompat.requestPermissions(context, listPermissionsNeeded.toTypedArray(), permissionRequest)
            return false
        }
        return true
    }

    private fun getImageUri(context: Context, inImage: Bitmap): Uri {
        val bytes = ByteArrayOutputStream()
        inImage.compress(Bitmap.CompressFormat.JPEG, 100, bytes)
        val path = MediaStore.Images.Media.insertImage(context.getContentResolver(), inImage, getRandomString(10), null)
        return Uri.parse(path)
    }
    private fun getRandomString(length: Int) : String {
        val allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz1234567890"
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
    override fun onRequestPermissionsResult(context: Activity, requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        when (requestCode) {
            permissionRequest -> {

                val perms = HashMap<String, Int>()
                if (grantResults.size > 0) {
                    for (i in permissions.indices) {
                        perms[permissions[i]] = grantResults[i]
                    }
                    val listPermissionsNeeded = java.util.ArrayList<Int>()
                    for (i in perms.keys)
                    { if (perms[i] == PackageManager.PERMISSION_GRANTED) {
                        listPermissionsNeeded.add(perms[i]!!)
                    }
                    }
                    if (listPermissionsNeeded.size != permissions.size) {
                        getView()?.explain(R.string.daily_detail_permission)
                    }
                }
            }
        }

    }
}
