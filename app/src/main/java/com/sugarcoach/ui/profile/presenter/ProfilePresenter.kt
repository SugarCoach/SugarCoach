package com.sugarcoach.ui.profile.presenter

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.net.Uri
import android.provider.MediaStore
import android.util.Log
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentManager
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.sugarcoach.R
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.ui.base.presenter.BasePresenter
import com.sugarcoach.ui.daily_detail.interactor.DailyDetailInteractorImp
import com.sugarcoach.ui.daily_detail.presenter.DailyDetailPresenterImp
import com.sugarcoach.ui.daily_detail.view.DailyDetailView
import com.sugarcoach.ui.profile.interactor.ProfileInteractorImp
import com.sugarcoach.ui.profile.view.ProfileItem
import com.sugarcoach.ui.profile.view.ProfileView
import com.sugarcoach.util.SchedulerProvider
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
import io.reactivex.disposables.CompositeDisposable
import org.joda.time.LocalDate
import org.joda.time.LocalDateTime
import java.io.ByteArrayOutputStream
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

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
            }, { err -> println(err) }))
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
        user.name = name!!.toString()
        user.weight = weight!!.toFloat()
        user.height = height!!.toFloat()
        user.username = username!!.toString()
        user.email = mail!!.toString()
        interactor?.let {
            compositeDisposable.add(it.updateUser(user)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ getView()?.showSuccessToast()
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }

    override fun logout() {
        val providerId = Firebase.auth.currentUser?.providerData

        Log.i("CurrentUser", "El usuario actual es: ${Firebase.auth.currentUser}")
        Log.i("CurrentProvider", "El provider actual es:$providerId")
        Firebase.auth.signOut()
        com.facebook.login.LoginManager.getInstance().logOut()

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

    override fun showDateDialog(fragmentManager: FragmentManager, dateSetListener: DatePickerDialog.OnDateSetListener, tag: String, date: LocalDate) {
        var dpd: DatePickerDialog = DatePickerDialog.newInstance(dateSetListener,date.year, date.monthOfYear-1, date.dayOfMonth)
        dpd.setCancelColor(Color.parseColor("#000000"))
        dpd.setOkColor(Color.parseColor("#000000"))
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