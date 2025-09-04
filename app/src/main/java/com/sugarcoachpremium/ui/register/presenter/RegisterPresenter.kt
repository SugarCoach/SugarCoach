package com.sugarcoachpremium.ui.register.presenter

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.util.Log
import androidx.fragment.app.FragmentManager
//import com.aminography.//choosephotohelper.//ChoosePhotoHelper
//import com.aminography.//choosephotohelper.callback.ChoosePhotoCallback
import com.sugarcoachpremium.BuildConfig
import com.sugarcoachpremium.data.database.repository.dailyregister.Category
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister
import com.sugarcoachpremium.data.database.repository.treament.Treament
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.ui.base.presenter.BasePresenter
import com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp
import com.sugarcoachpremium.ui.register.view.RegisterItem
import com.sugarcoachpremium.ui.register.view.RegisterView
import com.sugarcoachpremium.util.AppConstants
import com.sugarcoachpremium.util.SchedulerProvider
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.joda.time.LocalDateTime
import org.joda.time.LocalTime
import org.joda.time.format.DateTimeFormat
import java.io.File
import javax.inject.Inject
import kotlin.collections.ArrayList
import kotlin.reflect.full.findParameterByName
import kotlin.reflect.full.instanceParameter
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.valueParameters

class RegisterPresenter<V : RegisterView, I : RegisterInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable),
    RegisterPresenterImp<V,I> {

    lateinit var dailyRegister: DailyRegister
    lateinit var treatment: Treament
    lateinit var category: List<Category>
    lateinit var emotions: ArrayList<RegisterItem>
    lateinit var exercices: ArrayList<RegisterItem>
    private  var  type: Int = 0
    var glucose: Float = 0f
    var carbohydrates: Float = 0f
    var insulin: Float = 0f
    var photo: String = ""
    var exercise: String? = null
    var emotionalState: String? = null
    var label: Int = 0
    var comment: String = ""
    var color: Int = 0
    lateinit var user: User
    @Inject
    lateinit var date: LocalDateTime

    //private lateinit var choosePhotoHelper: ChoosePhotoHelper

    lateinit var dailyExcercises: List<RegisterItem>
    lateinit var dailyEmotions: List<RegisterItem>

    override fun onAttach(view: V?) {
        super.onAttach(view)
        getUser()
        getCategories()
        getExercices()
    }

    override fun nextLoad() {
        if(type <= 4) {
            type++
            when(type) {
                1 -> {
                    getView()?.nextLoad(type,insulin, null)
                }
                2 -> {
                    getView()?.nextLoad(type,carbohydrates, null)
                }
                3 -> {
                    getView()?.nextLoad(type,null, emotionalState)
                }
                4 -> {
                    getView()?.nextLoad(type,null, exercise)
                }
            }
        }
    }

    override fun prevLoad() {
        if(type >= 0) {
                type--
            when(type) {
                0 -> {
                    getView()?.prevLoad(type,glucose.toFloat(), null)
                }
                1 -> {
                    getView()?.prevLoad(type,insulin, null)
                }
                2 -> {
                    getView()?.prevLoad(type,carbohydrates, null)
                }
                3 -> {
                    getView()?.prevLoad(type,null, emotionalState)
                }
            }

        }

    }

    private fun getUser() = interactor?.let {
        compositeDisposable.add(it.getUser()
            .subscribeOn(Schedulers.io())
            .subscribe({ userData ->
                user = userData
                getView()?.let {
                    getView()?.getUserData(userData)
                }
            }, { err -> println(err) }))
    }



    private fun getExercices() = interactor?.let {
        exercices = ArrayList<RegisterItem>()
        compositeDisposable.add(it.getExercises()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ items ->
                getView()?.let {
                    for(j in items.indices) {
                        val item = items[j]
                        val content = RegisterItem.Builder()
                            .id(item.exercise_id)
                            .image(item.exercise_icono)
                            .name(item.exercise_name)
                            .build()

                        exercices.add(content)
                    }
                    this.dailyExcercises = exercices
                    getView()?.setExercicesData(exercices)
                    getEmotions()
                }
            }, { err -> println(err) }))
    }

    private fun getEmotions() = interactor?.let {
        emotions = ArrayList<RegisterItem>()
        compositeDisposable.add(it.getEmotions()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ items ->
                getView()?.let {
                    for(j in items.indices) {
                        val item = items[j]
                        val content = RegisterItem.Builder()
                            .id(item.state_id)
                            .image(item.state_icono)
                            .name(item.state_name)
                            .build()

                        emotions.add(content)
                    }
                    this.dailyEmotions = emotions
                    getView()?.setEmotionsData(emotions)
                }
            }, { err -> println(err) }))
    }

    private fun checkDaily(categories: List<Category>) {
        interactor?.let {
            compositeDisposable.add(it.isDailyEmpty()
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe ({ check ->
                    Log.i("OnCheckDaily", "Todo funciono bien: $check, $categories")
                    if (!check){
                        getLastDaily(categories)
                    }else{
                        getMedition(null, categories)
                    }
                }, { err ->
                    Log.i("OnCheckDaily", "Ocurrió un error: $err")
                })
            )
        }

    }

    private fun getTreatment(){
        interactor?.let {
            compositeDisposable.add(it.getTreatment()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ treatment ->
                    this.treatment = treatment.treament!!
                }, { err -> println("error" + err) })
            )
        }
    }
    private fun getTreatmentHorario(){
        Log.i("OnGetHorario", "Se esta obteniendo el horario ${dailyRegister.category_id}")
        interactor?.let {
            compositeDisposable.add(it.getTreatmentHorarios(dailyRegister.category_id)
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ horario ->
                    if(horario.selected){
                        dailyRegister.basal = horario.units
                    }
                    finishRegister()
                }, { err -> println("error" + err) })
            )
        }
    }

    private fun getCategories(){
        interactor?.let {
            compositeDisposable.add(it.getCategories()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ categories ->
                    category = categories
                    Log.i("OnGetCategories", "Las categories fueron:$categories")
                    checkDaily(categories)
                }, { err -> Log.i("onGetCategories", "Ocurrió un error: $err") })
            )
        }
    }


    private fun getLastDaily(categories: List<Category>){
        interactor?.let {
            compositeDisposable.add(it.getLastDaily()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ daily ->
                    Log.i("lastDaily", daily.toString())
                    getMedition(daily.dailyRegister, categories)
                }, { err -> println("error" + err) })
            )
        }
    }

    override fun finishLoad() {
        Log.i("OnFinishLoad", "Se estan cargando los datos")
        dailyRegister = DailyRegister(0,"", glucose,insulin,carbohydrates,emotionalState, exercise, label, comment, photo,false,date.toDate(), date.toString(
            DateTimeFormat.forPattern("yyyy-MM-dd")),0f,"")
        getTreatmentHorario()
    }

    fun finishRegister(){
        Log.i("OnFinish","Se estan cargando los datos a la db")
        getView()?.showProgress()
        interactor?.let {
            CoroutineScope(Dispatchers.IO).launch {
                compositeDisposable.add(it.saveRegisterCall(dailyRegister)
                    .compose(schedulerProvider.ioToMainObservableScheduler())
                    .subscribe({ response ->
                        if(response.id != ""){
                            if (photo.isNotEmpty()){

                                var file = File(photo)
                                dailyRegister.idOnline = response.id
                                dailyRegister.online = true
                                uploadPhoto(response.id, file, dailyRegister)
                            }else{
                                dailyRegister.idOnline = response.id
                                dailyRegister.online = true

                                saveRegister(null, dailyRegister)
                            }
                        }else{
                            getView()?.hideProgress()
                            getView()?.showErrorToast()
                            getView()?.openMainActivity()
                        }

                    }, {
                        getView()?.hideProgress()
                        getView()?.showErrorToast()
                        saveRegister(null, dailyRegister)
                    }))
            }
        }
    }

    fun saveRegister(photo: String?, dailyRegister: DailyRegister) {
        photo?.let { dailyRegister.photo = BuildConfig.BASE_URL + photo }
        interactor?.let {
            compositeDisposable.add(it.insertDaily(dailyRegister)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({dispose ->
                        if (!dispose) {
                            updatePoints(cantParametersChanged())
                        }else {
                            getView()?.hideProgress()
                            goToActivityMain()
                            getView()?.showErrorToast()
                        }

                }, { throwable ->
                    getView()?.hideProgress()
                    showException(throwable)
                    goToActivityMain()
                })
            )
        }

    }

    private fun updatePoints(points: Int){
        interactor?.let { inte ->
            compositeDisposable.add(inte.updateLocalPoints(user, points)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ userInsert ->
                    Log.i("OnRegisterPresenter", "UserInsert: $userInsert")
                    if(userInsert){
                        getView()?.hideProgress()
                        getView()?.showErrorToast()
                        goToActivityMain()
                    }else {
                        CoroutineScope(Dispatchers.IO).launch {
                            val updatedPoints = inte.updateUserPoints()
                            if (updatedPoints) {
                                withContext(Dispatchers.Main){
                                    getView()?.hideProgress()
                                    getView()?.finishLoad(points, user.points)
                                }
                            }else{
                                withContext(Dispatchers.Main){
                                    getView()?.hideProgress()
                                    getView()?.showErrorToast()
                                    goToActivityMain()
                                }
                            }
                        }
                    }
                },{
                    getView()?.hideProgress()
                    getView()?.showErrorToast()
                    goToActivityMain()
                }))
        }
    }

    private fun cantParametersChanged(): Int{
        val noNull = mutableListOf<String>()
        val listOfProperties = mutableListOf("glucose","insulin","carbohydrates", "emotionalState", "exercise")

        val properties = DailyRegister::class.memberProperties

        for (property in properties) {
            val valor = property.get(dailyRegister)

            if ((valor != "" && valor != null) && (property.name in listOfProperties)) {
                Log.i("OnRegisterPresenter", "cantParameterChanged: El valor es: $valor, ${property.name}")
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

    fun uploadPhoto(id: String?,photo: File, dailyRegister: DailyRegister) {
        interactor?.let {
            compositeDisposable.add(it.saveRegisterPhotoCall(id.toString(), photo)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .subscribe({ response ->
                    saveRegister(response.url, dailyRegister)
                }, {
                    saveRegister(null, dailyRegister)
                })
            )
        }

    }

    override fun backLoad() {
        getView()?.backLoad()
    }


    override fun checkValue(floatValue: Float){
        when (type) {
            0 -> {
                if (!getRange(0, floatValue))
                    getView()?.showValidationMessage(AppConstants.EMPTY_GLUCOSE)
                glucose = floatValue
            }
            1 -> {
                if (!getRange(1, floatValue))
                    getView()?.showValidationMessage(AppConstants.EMPTY_INSULIN)
                insulin = floatValue
            }
            2 -> {
                if (!getRange(2, floatValue)) {
                    getView()?.showValidationMessage(AppConstants.EMPTY_CAR)
                }
                carbohydrates = floatValue
            }
        }

    }

    override fun saveComment(comment: String) {
        this.comment = comment
        this.comment = comment
    }
    private fun getRange(type: Int, value: Float): Boolean{
        val rangeGlucose = 20f..500f
        val rangeInsulin = 0.5f..100f
        val rangeCar = 1f..1000f
        when {
            type == 0 && value in rangeGlucose-> return true
            type == 1 && value in rangeInsulin-> return true
            type == 2 && value in rangeCar-> return true
        }
        return false
    }

    private fun getMedition(dailyRegister: DailyRegister?, category: List<Category>){
        var index = 0
        var currentDate = date
        var date = dailyRegister?.created

        Log.i("OnGetMedition", "$category, $currentDate, $date")

        val breakfastId = category.filter { category -> category.cate_name.equals("register_breakfast_label")  }.single().cate_id
        val pbreakfastId  = category.filter { category -> category.cate_name.equals("register_pbreakfast_label")  }.single().cate_id
        val lunchId  = category.filter { category -> category.cate_name.equals("register_lunch_label")  }.single().cate_id
        val plunchId  = category.filter { category -> category.cate_name.equals("register_plunch_label")  }.single().cate_id
        val snackId  = category.filter { category -> category.cate_name.equals("register_snack_label")  }.single().cate_id
        val psnackId  = category.filter { category -> category.cate_name.equals("register_psnack_label")  }.single().cate_id
        val dinnerId  = category.filter { category -> category.cate_name.equals("register_dinner_label")  }.single().cate_id
        val pdinnerId  = category.filter { category -> category.cate_name.equals("register_pdinner_label")  }.single().cate_id

        val breakfast = LocalTime(6,0)
        val breakfastEnd = LocalTime(11,59)
        val lunch = LocalTime(12,0)
        val lunchEnd = LocalTime(15,59)
        val snack = LocalTime(16,0)
        val snackEnd = LocalTime(20,59)
        val dinner = LocalTime(21,0)
        val dinnerEnd = LocalTime(23,59)
        val midnight = LocalTime(0,0)
        val midnightEnd = LocalTime(5,59)

        if (date == null){
            when {
                timeBetween(currentDate.toLocalTime(), breakfast, breakfastEnd) -> {
                    index = breakfastId
                    getView()?.setDateMedition(currentDate.toDate(), index, category )
                }

                timeBetween(currentDate.toLocalTime(),lunch, lunchEnd) ->{
                    index = lunchId
                    getView()?.setDateMedition(currentDate.toDate(),index, category)
                }

                timeBetween(currentDate.toLocalTime(),snack,snackEnd) ->{
                    index = snackId
                    getView()?.setDateMedition(currentDate.toDate(), index, category)
                }

                timeBetween(currentDate.toLocalTime(),dinner, dinnerEnd) ||  timeBetween(currentDate.toLocalTime(), midnight, midnightEnd) -> {
                    index = dinnerId
                    getView()?.setDateMedition(currentDate.toDate(),index, category)
                }
                else ->{
                    Log.i("OnElse", "No se entro a ningun when de arriba")
                }
            }
        }else{
            when {
                dailyRegister?.category_id == breakfastId && timeBetween(currentDate.toLocalTime(), breakfast, breakfastEnd)-> {
                    index = pbreakfastId
                    getView()?.setDateMedition(currentDate.toDate(), index, category)
                }
                ( dailyRegister?.category_id == breakfastId || dailyRegister?.category_id == pbreakfastId) && timeBetween(currentDate.toLocalTime(),breakfast, breakfastEnd) -> {
                    index = pbreakfastId
                    getView()?.setDateMedition(currentDate.toDate(), index, category)
                }
                ( dailyRegister?.category_id == breakfastId || dailyRegister?.category_id == pbreakfastId) && timeBetween(currentDate.toLocalTime(),lunch, lunchEnd) -> {
                    index = lunchId
                    getView()?.setDateMedition(currentDate.toDate(), index, category)
                }
                (dailyRegister?.category_id == breakfastId || dailyRegister?.category_id == pbreakfastId) && timeBetween(currentDate.toLocalTime(),snack,snackEnd) -> {
                    index = snackId
                    getView()?.setDateMedition(currentDate.toDate(),index, category)
                }
                (dailyRegister?.category_id == breakfastId || dailyRegister?.category_id == pbreakfastId) &&  (timeBetween(currentDate.toLocalTime(),dinner, dinnerEnd) ||  timeBetween(currentDate.toLocalTime(), midnight, midnightEnd)) -> {
                    index = dinnerId
                    getView()?.setDateMedition(currentDate.toDate(), index, category)
                }
                dailyRegister?.category_id == lunchId && timeBetween(currentDate.toLocalTime(),lunch, lunchEnd) -> {
                    index = plunchId
                    getView()?.setDateMedition(currentDate.toDate(),index, category)
                }
                (dailyRegister?.category_id == lunchId || dailyRegister?.category_id == plunchId) && timeBetween(currentDate.toLocalTime(), lunch, lunchEnd) -> {
                    index = plunchId
                    getView()?.setDateMedition(currentDate.toDate(),index, category)
                }
                (dailyRegister?.category_id == lunchId || dailyRegister?.category_id == plunchId) && timeBetween(currentDate.toLocalTime(),snack,snackEnd) -> {
                    index = snackId
                    getView()?.setDateMedition(currentDate.toDate(), index, category)
                }
                (dailyRegister?.category_id == lunchId || dailyRegister?.category_id == plunchId) && (timeBetween(currentDate.toLocalTime(),dinner, dinnerEnd) ||  timeBetween(currentDate.toLocalTime(), midnight, midnightEnd))-> {
                    index = dinnerId
                    getView()?.setDateMedition(currentDate.toDate(),index, category)
                }
                dailyRegister?.category_id == snackId && timeBetween(currentDate.toLocalTime(),snack,snackEnd) -> {
                    index = psnackId
                    getView()?.setDateMedition(currentDate.toDate(), index, category)
                }
                (dailyRegister?.category_id == snackId || dailyRegister?.category_id == psnackId) && (timeBetween(currentDate.toLocalTime(),snack, snackEnd)) -> {
                    index = psnackId
                    getView()?.setDateMedition(currentDate.toDate(), index, category)
                }
                (dailyRegister?.category_id == snackId || dailyRegister?.category_id == psnackId) && (timeBetween(currentDate.toLocalTime(),dinner, dinnerEnd) ||  timeBetween(currentDate.toLocalTime(), midnight, midnightEnd)) -> {
                    index = dinnerId
                    getView()?.setDateMedition(currentDate.toDate(), index, category)
                }
                dailyRegister?.category_id == dinnerId && (timeBetween(currentDate.toLocalTime(),dinner, dinnerEnd) ||  timeBetween(currentDate.toLocalTime(), midnight, midnightEnd)) -> {
                    index = pdinnerId
                    getView()?.setDateMedition(currentDate.toDate(), index, category)
                }
                dailyRegister?.category_id == dinnerId && (timeBetween(currentDate.toLocalTime(),dinner, dinnerEnd) ||  timeBetween(currentDate.toLocalTime(), midnight, midnightEnd)) -> {
                    index = pdinnerId
                    getView()?.setDateMedition(currentDate.toDate(), index, category)
                }
                (dailyRegister?.category_id == dinnerId  || dailyRegister?.category_id == pdinnerId) && timeBetween(currentDate.toLocalTime(), dinner, dinnerEnd) -> {
                    index = pdinnerId
                    getView()?.setDateMedition(currentDate.toDate(), index, category)
                }
                (dailyRegister?.category_id == dinnerId  || dailyRegister?.category_id == pdinnerId) && timeBetween(currentDate.toLocalTime(), dinner, dinnerEnd) -> {
                    index = pdinnerId
                    getView()?.setDateMedition(currentDate.toDate(), index, category)
                }
                (dailyRegister?.category_id == pdinnerId) -> {
                    index = breakfastId
                    getView()?.setDateMedition(currentDate.toDate(), index, category)
                }
                else ->{
                    Log.i("OnElse", "No se entro a ningun when")
                    index = 1
                    getView()?.setDateMedition(currentDate.toDate(), index, category)
                }
            }
        }
        this.label = index
    }

    fun timeBetween(time: LocalTime, startTime: LocalTime, endTime: LocalTime): Boolean{
        return time.isAfter(startTime) && time.isBefore(endTime) || time.isEqual(startTime) || time.isEqual(endTime)
    }
    override fun setExercises(value: String){
        this.exercise = value
        exercices.find { it.id == value }?.let { getView()?.setExercise(it) }
    }
    override fun setEmocional(value: String){
        this.emotionalState = value
        emotions.find { it.id == value }?.let { getView()?.setEmotional(it) }
    }

    override fun setMedition(value: Int) {
        label = value
    }

    override fun setTime(hourOfDay: Int, minute: Int) {
        val breakfast = LocalTime(6,0)
        val breakfastEnd = LocalTime(11,59)
        val lunch = LocalTime(12,0)
        val lunchEnd = LocalTime(15,59)
        val snack = LocalTime(16,0)
        val snackEnd = LocalTime(20,59)
        val dinner = LocalTime(21,0)
        val dinnerEnd = LocalTime(23,59)
        val midnight = LocalTime(0,0)
        val midnightEnd = LocalTime(5,59)
        date = LocalDateTime(date.year, date.monthOfYear, date.dayOfMonth,hourOfDay,minute)
        var medition = 0
        when {
            timeBetween(date.toLocalTime(), breakfast, breakfastEnd) -> medition = category.filter { category -> category.cate_name.equals("register_breakfast_label")  }.single().cate_id

            timeBetween(date.toLocalTime(),lunch, lunchEnd) -> medition =   category.filter { category -> category.cate_name.equals("register_lunch_label")  }.single().cate_id

            timeBetween(date.toLocalTime(),snack,snackEnd)-> medition =  category.filter { category -> category.cate_name.equals("register_snack_label")  }.single().cate_id

            timeBetween(date.toLocalTime(),dinner, dinnerEnd) ||  timeBetween(date.toLocalTime(), midnight, midnightEnd) -> medition =   category.filter { category -> category.cate_name.equals("register_dinner_label")  }.single().cate_id
        }
        this.label = medition
        getView()?.setTime(date.toDate(),medition)

    }
    override fun setDate(year: Int, monthOfYear: Int, dayOfMonth: Int) {
        date = LocalDateTime(year, monthOfYear, dayOfMonth, date.hourOfDay, date.minuteOfHour)
        getView()?.setDate(date.toDate())

    }

    override fun showDateDialog(fragmentManager: FragmentManager, dateSetListener: DatePickerDialog.OnDateSetListener) {
        var dpd: DatePickerDialog = DatePickerDialog.newInstance(dateSetListener,date.year, date.monthOfYear-1, date.dayOfMonth)
        dpd.setCancelColor(Color.parseColor("#000000"))
        dpd.setOkColor(Color.parseColor("#000000"))
        dpd.show(fragmentManager, "Datepickerdialog")
    }

    override fun showTimeDialog(fragmentManager: FragmentManager, timeSetListener: TimePickerDialog.OnTimeSetListener) {
        var tpd: TimePickerDialog = TimePickerDialog.newInstance(timeSetListener, date.hourOfDay, date.minuteOfHour, true)
        tpd.setCancelColor(Color.parseColor("#000000"))
        tpd.setOkColor(Color.parseColor("#000000"))
        tpd.show(fragmentManager, "timepicker")

    }

    override fun initChooser(context: Activity){
        /*choosePhotoHelper = ChoosePhotoHelper.with(context)
            .asFilePath()
            .build(ChoosePhotoCallback {
                photo = it!!
                getView()?.setImage(it!!)
            })*/
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        //choosePhotoHelper.onActivityResult(requestCode, resultCode, data)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        //choosePhotoHelper.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun showChooser() {
        //choosePhotoHelper.showChooser()
    }
    override fun goToActivityDaily() {
        getView()?.openDailyActivity()
    }

    override fun goToActivityMain() {
        getView()?.openMainActivity()
    }

    override fun goToActivityStatistic() {
        getView()?.openStatisticActivity()
    }

    override fun goToActivityTreament() {
        getView()?.openTreatmentActivity()
    }

    override fun rollBack() {
        getView()?.rollBack()
    }
}
