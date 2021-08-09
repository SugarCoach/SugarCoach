package com.sugarcoach.ui.daily_detail.presenter

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentManager
import com.aminography.choosephotohelper.ChoosePhotoHelper
import com.aminography.choosephotohelper.callback.ChoosePhotoCallback
import com.sugarcoach.R
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.ui.base.presenter.BasePresenter
import com.sugarcoach.ui.daily_detail.interactor.DailyDetailInteractorImp
import com.sugarcoach.ui.daily_detail.view.DailyDetailView
import com.sugarcoach.util.SchedulerProvider
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
import io.reactivex.disposables.CompositeDisposable
import org.joda.time.LocalDateTime
import java.util.*
import javax.inject.Inject
import android.provider.MediaStore
import android.content.Context
import android.net.Uri
import android.util.Log
import com.skydoves.submarine.iconForm
import com.sugarcoach.data.database.repository.treament.Treament
import com.sugarcoach.ui.daily_detail.view.DailyItem
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.io.ByteArrayOutputStream
import java.io.File
import kotlin.random.Random


class DailyDetailPresenter<V : DailyDetailView, I : DailyDetailInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable),
    DailyDetailPresenterImp<V, I> {


    lateinit var dailyRegister: DailyRegister
    lateinit var treament: Treament
    lateinit var emotions: ArrayList<DailyItem>
    lateinit var exercices: ArrayList<DailyItem>
    private lateinit var choosePhotoHelper: ChoosePhotoHelper
    lateinit var  date: LocalDateTime
    val permissionRequest = 1
    private fun getExercices() = interactor?.let {
        exercices = ArrayList<DailyItem>()
        compositeDisposable.add(it.getExercises()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ items ->
                getView()?.let {
                    for(j in items.indices) {
                        val item = items[j]
                        val content = DailyItem.Builder()
                            .id(item.exercise_id)
                            .image(item.exercise_icono)
                            .name(item.exercise_name)
                            .build()

                        exercices.add(content)
                    }
                    getView()?.setExercicesData(exercices)
                    getEmotions()
                }
            }, { err -> println(err) }))
    }
    private fun getEmotions() = interactor?.let {
        emotions = ArrayList<DailyItem>()
        compositeDisposable.add(it.getEmotions()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ items ->
                getView()?.let {
                    for(j in items.indices) {
                        val item = items[j]
                        val content = DailyItem.Builder()
                            .id(item.state_id)
                            .image(item.state_icono)
                            .name(item.state_name)
                            .build()

                        emotions.add(content)
                    }
                    getView()?.setEmotionsData(emotions)
                    getView()?.init()
                }
            }, { err -> println(err) }))
    }
    private fun getTreatment(){
        interactor?.let {
            compositeDisposable.add(it.getTreatment()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ treatment ->
                    this.treament = treatment.treament!!
                }, { err -> println("error" + err) })
            )
        }
    }
    override fun deleteRegister(dailyRegister: DailyRegister) {
        if (!dailyRegister.idOnline.isNullOrEmpty()) {
            interactor?.let {
                compositeDisposable.add(it.deleteRegistersCall(dailyRegister.idOnline!!)
                    .doOnSubscribe { getView()?.showProgress() }
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({ response ->
                        deleteRegisterLocal(dailyRegister.id)
                    }, { throwable ->
                        getView()?.showErrorToast()
                    })
                )
            }
        }else{
            deleteRegisterLocal(dailyRegister.id)
        }
    }

    fun deleteRegisterLocal(id: Int) {
        interactor?.let {
            compositeDisposable.add(it.deleteRegister(id)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({
                    getView()?.hideProgress()
                    getView()?.showSuccessToast()

                }, { err -> println(err) }))}
    }

    override fun onAttach(view: V?) {
        super.onAttach(view)
        getExercices()
        getMedition()
        getTreatment()
        getUser()

    }


    override fun getRegister(id: Int) {
        interactor?.let {
            compositeDisposable.add(it.getRegister(id)
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ register ->
                    getCategories()
                    this.dailyRegister = register.dailyRegister!!
                    getView()?.getData(register.dailyRegister!!)
                    date = LocalDateTime(dailyRegister.created)
                    setExercises(register.dailyRegister!!.exercise)
                    setEmotional(register.dailyRegister!!.emotionalState)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }

    override fun updateGlucose(glucose: Float?) {
        dailyRegister.glucose = glucose!!.toFloat()
        interactor?.let {
            compositeDisposable.add(it.updateRegisterCall(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .subscribe({ updateGlucoseLocal(glucose)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }
    override fun updateInsulin(insulin: Float?) {
        dailyRegister.insulin = insulin!!.toFloat()
        interactor?.let {
            compositeDisposable.add(it.updateRegisterCall(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .subscribe({ updateInsulinLocal(insulin)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }
    override fun updateBasal(basal: Float?) {
        dailyRegister.basal = basal!!.toFloat()
        interactor?.let {
            compositeDisposable.add(it.updateRegister(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .subscribe({ updateBasalLocal(basal)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }
    override fun updateCarb(carbohydrates: Float?) {
        dailyRegister.carbohydrates = carbohydrates!!.toFloat()
        interactor?.let {
            compositeDisposable.add(it.updateRegisterCall(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .subscribe({ updateCarbLocal(carbohydrates)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }



    override fun updateExercise(exercise: String?) {
        dailyRegister.exercise = exercise!!.toString()
        interactor?.let {
            compositeDisposable.add(it.updateRegisterCall(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .subscribe({
                    updateExerciseLocal(exercise)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }
    override fun updateLabel(label: Int?) {
        dailyRegister.category_id = label!!
        interactor?.let {
            compositeDisposable.add(it.updateRegisterCall(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .subscribe({
                    updateLabelLocal(label)

                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }
    override fun updateEmotional(emotional: String?) {
        dailyRegister.emotionalState = emotional!!.toString()
        interactor?.let {
            compositeDisposable.add(it.updateRegisterCall(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .subscribe({
                   updateEmotionalLocal(emotional)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }
    override fun updateComment(comment: String?) {
        dailyRegister.comment = comment!!.toString()
        interactor?.let {
            compositeDisposable.add(it.updateRegisterCall(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .subscribe({ updateCommentLocal(comment)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }
    override fun updatePhoto(photo: String?) {
        dailyRegister.photo = photo!!.toString()
        var file = File(photo)
        interactor?.let {
            compositeDisposable.add(it.saveRegisterPhotoCall(dailyRegister.idOnline!!, file)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .subscribe({ updatePhotoLocal(photo)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }
    fun updateExerciseLocal(exercise: String?) {
        dailyRegister.exercise = exercise!!.toString()
        interactor?.let {
            compositeDisposable.add(it.updateRegister(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .doOnNext { getView()?.hideProgress() }
                .subscribe({
                    getView()?.showSuccessToastUpdate()
                    setExercises(exercise)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }
     fun updateGlucoseLocal(glucose: Float?) {
        dailyRegister.glucose = glucose!!.toFloat()
        interactor?.let {
            compositeDisposable.add(it.updateRegister(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .doOnNext { getView()?.hideProgress() }
                .subscribe({ getView()?.showSuccessToastUpdate()
                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }
     fun updateInsulinLocal(insulin: Float?) {
        dailyRegister.insulin = insulin!!.toFloat()
        interactor?.let {
            compositeDisposable.add(it.updateRegister(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .doOnNext { getView()?.hideProgress() }
                .subscribe({ getView()?.showSuccessToastUpdate()
                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }
    fun updateBasalLocal(basal: Float?) {
        dailyRegister.basal = basal!!.toFloat()
        interactor?.let {
            compositeDisposable.add(it.updateRegister(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .doOnNext { getView()?.hideProgress() }
                .subscribe({ getView()?.showSuccessToastUpdate()
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }
     fun updateCarbLocal(carbohydrates: Float?) {
        dailyRegister.carbohydrates = carbohydrates!!.toFloat()
        interactor?.let {
            compositeDisposable.add(it.updateRegister(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .doOnNext { getView()?.hideProgress() }
                .subscribe({ getView()?.showSuccessToastUpdate()
                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }
     fun updateLabelLocal(label: Int?) {
        dailyRegister.category_id = label!!
        interactor?.let {
            compositeDisposable.add(it.updateRegister(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .doOnNext { getView()?.hideProgress() }
                .subscribe({
                    getView()?.showSuccessToastUpdate()

                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }
     fun updateEmotionalLocal(emotional: String?) {
        dailyRegister.emotionalState = emotional!!.toString()
        interactor?.let {
            compositeDisposable.add(it.updateRegister(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .doOnNext { getView()?.hideProgress() }
                .subscribe({
                    getView()?.showSuccessToastUpdate()
                    setEmotional(emotional)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }
     fun updateCommentLocal(comment: String?) {
        dailyRegister.comment = comment!!.toString()
        interactor?.let {
            compositeDisposable.add(it.updateRegister(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .doOnNext { getView()?.hideProgress() }
                .subscribe({ getView()?.showSuccessToastUpdate()
                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }
     fun updatePhotoLocal(photo: String?) {
        dailyRegister.photo = photo!!.toString()
        interactor?.let {
            compositeDisposable.add(it.updateRegister(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .doOnNext { getView()?.hideProgress() }
                .subscribe({ getView()?.showSuccessToastUpdate()
                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }

    override fun updateDate(date: Date?) {


    }

    override fun setTime(hourOfDay: Int, minute: Int) {
        date = LocalDateTime(date.year, date.monthOfYear, date.dayOfMonth,hourOfDay,minute)
        dailyRegister.created = date.toDate()
        interactor?.let {
            compositeDisposable.add(it.updateRegister(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({
                    getView()?.showSuccessToastUpdate()
                    getView()?.setTime(date.toDate())
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }


    override fun setDate(year: Int, monthOfYear: Int, dayOfMonth: Int) {
        date = LocalDateTime(year, monthOfYear, dayOfMonth, date.hourOfDay, date.minuteOfHour)
        dailyRegister.created = date.toDate()
        interactor?.let {
            compositeDisposable.add(it.updateRegister(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({
                    getView()?.showSuccessToastUpdate()
                    getView()?.setDate(date.toDate())
                }, { throwable ->
                    showException(throwable)
                })
            )
        }


    }

    private fun getMedition(){
        var currentDate = LocalDateTime()
        getView()?.setDateMedition(currentDate.toDate())
    }

    fun getCategories() {
        interactor?.let {
            compositeDisposable.add(it.getCategories()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ categories ->
                    getView()?.setCategories(categories, dailyRegister.category_id)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }

    private fun setEmotional(emotional: String?){
        emotions.find { it.id == emotional }?.let { getView()?.setEmotional(it) }
    }
    private fun setExercises(exercise: String?) {
        exercices.find { it.id == exercise }?.let { getView()?.setExercise(it) }
    }
    private fun getUser() = interactor?.let {
        compositeDisposable.add(it.getUser()
            .compose(schedulerProvider.ioToMainSingleScheduler())
            .subscribe({ userData ->
                getView()?.let {
                   if(userData.typeAccount == "2"){
                       getView()?.mirrorAccount()
                   }
                }
            }, { err -> println(err) }))
    }


    override fun getScreenShot(context: Activity,view: View) {
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

    override fun showDateDialog(fragmentManager: FragmentManager, dateSetListener: DatePickerDialog.OnDateSetListener) {
        var dpd: DatePickerDialog = DatePickerDialog.newInstance(dateSetListener,date.year, date.monthOfYear, date.dayOfMonth)
        dpd.show(fragmentManager, "Datepickerdialog")
    }

    override fun showTimeDialog(fragmentManager: FragmentManager, timeSetListener: TimePickerDialog.OnTimeSetListener) {
        var tpd: TimePickerDialog = TimePickerDialog.newInstance(timeSetListener, date.hourOfDay, date.minuteOfHour, true)
        tpd.show(fragmentManager, "timepicker")

    }

    override fun initChooser(context: Activity){
        choosePhotoHelper = ChoosePhotoHelper.with(context)
            .asFilePath()
            .build(ChoosePhotoCallback {
                updatePhoto(it)
                getView()?.setImage(it)
            })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        choosePhotoHelper.onActivityResult(requestCode, resultCode, data)
    }

    override fun onRequestPermissionsResult(context: Activity, requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        choosePhotoHelper.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            permissionRequest -> {

                val perms = HashMap<String, Int>()
                if (grantResults.size > 0) {
                    for (i in permissions.indices) {
                        perms[permissions[i]] = grantResults[i]
                    }
                    val listPermissionsNeeded = ArrayList<Int>()
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

    override fun showChooser() {
        choosePhotoHelper.showChooser()
    }


    override fun checkAndRequestPermissions(context: Activity): Boolean {
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

    override fun goToActivityTreament() {
        getView()?.openTreamentActivity()
    }

    override fun goToActivityMain() {
        getView()?.openMainActivity()
    }

    override fun goToActivityStatistic() {
        getView()?.openStatisticActivity()
    }

    override fun goToActivityRegister() {
        getView()?.openRegisterActivity()
    }

    override fun getColorType(value: Float): Int {
        val danger = treament.hyperglucose
        val good = treament.hipoglucose..treament.hyperglucose
        val low = 0f..treament.hipoglucose
        when {
            value in low ->  return  R.color.yellowLight
            value in good ->  return R.color.green
            value > danger -> return R.color.red
        }

        return R.color.green
    }

    override fun saveComment(comment: String) {
        dailyRegister.comment = comment
        interactor?.let {
            compositeDisposable.add(it.updateRegisterCall(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .doOnComplete { getView()?.hideProgress() }
                .subscribe({ saveCommentLocal(comment)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }

     fun saveCommentLocal(comment: String) {
        dailyRegister.comment = comment
        interactor?.let {
            compositeDisposable.add(it.updateRegister(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .subscribe({ getView()?.showSuccessToastUpdate()
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }
}
