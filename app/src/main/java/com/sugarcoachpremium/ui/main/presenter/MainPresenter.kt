package com.sugarcoachpremium.ui.main.presenter

import android.app.Activity
import android.content.pm.PackageManager
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.sugarcoachpremium.R
import com.sugarcoachpremium.data.database.repository.dailyregister.Category
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister
import com.sugarcoachpremium.data.database.repository.treament.Treament
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.ui.base.presenter.BasePresenter
import com.sugarcoachpremium.ui.main.interactor.MainInteractorImp
import com.sugarcoachpremium.ui.main.view.MainView
import com.sugarcoachpremium.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import org.joda.time.LocalDateTime
import org.joda.time.LocalTime
import java.util.*
import javax.inject.Inject


class MainPresenter<V : MainView, I : MainInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), MainPresenterImp<V, I> {


    lateinit var currentDate: LocalDateTime
    val permissionRequest = 101
    var permision: MutableList<String> = mutableListOf<String>()

    override fun onAttach(view: V?) {
        super.onAttach(view)
        currentDate = LocalDateTime()
        getView()?.setDate(currentDate.toDate())
        getUser()
        getTreatment()
    }

    override fun onResume() {
        currentDate = LocalDateTime()
        getView()?.setDate(currentDate.toDate())
        getUser()
        getTreatment()

    }

    private fun getTreatment(){
        interactor?.let {
            compositeDisposable.add(it.getTreatment()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ treatment ->
                    getPromedios(treatment.treament!!)
                }, { err -> println("error" + err) })
            )
        }
    }
    fun deleteRegisters() {
        interactor?.let {
            compositeDisposable.add(it.deleteAll()
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ result ->
                    interactor?.perfomLogout()
                    getView()?.openLoginActivity()
                }, { err -> println(err) }))}

    }

    override fun goToActivityTreatment() {
        getView()?.openTreatmentActivity()
    }

    override fun goToActivityRegister() {
        getView()?.openRegisterActivity()
    }

    override fun goToActivityDaily() {
        getView()?.openDailyActivity()
    }
    override fun goToActivityProfile() {
        getView()?.openProfileActivity()
    }

    override fun goToActivityConfig() {
        Log.i("OnConfig", "Se inicia el Config activity")
        getView()?.openConfigActivity()
    }

    override fun goToActivityStatistics() {
        getView()?.openStatisticsActivity()
    }

    private fun getUser() = interactor?.let {
        compositeDisposable.add(it.getUser()
            .compose(schedulerProvider.ioToMainSingleScheduler())
            .subscribe({ userData ->
                getView()?.let {
                    checkDaily(userData)
                }
            }, { err -> println(err) }))
    }

    private fun getPromedios(treament: Treament) {
        val danger = treament.hyperglucose
        val good = treament.hipoglucose ..treament.hyperglucose
        val low = 0f..treament.hipoglucose
        interactor?.let {
            compositeDisposable.add(it.getAverages()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ average ->
                    getView()?.let {
                        it.setPromedios(average.min.toInt(), average.max.toInt(), average.promedio.toInt())
                        when{
                            average.min in low -> it.setMinColor(R.color.yellowLight)
                            average.min in good -> it.setMinColor(R.color.green)
                            average.min > danger -> it.setMinColor(R.color.red)
                        }
                        when{
                            average.max in low -> it.setMaxColor(R.color.yellowLight)
                            average.max in good -> it.setMaxColor(R.color.green)
                            average.max > danger -> it.setMaxColor(R.color.red)
                        }
                        when{
                            average.promedio in low -> it.setPromColor(R.color.yellowLight)
                            average.promedio in good -> it.setPromColor(R.color.green)
                            average.promedio > danger -> it.setPromColor(R.color.red)
                        }
                    }
                }, { err -> println(err) })
            )
        }
    }


    private fun checkDaily(user: User) {
        interactor?.let {
            compositeDisposable.add(it.isDailyEmpty()
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe {
                    check ->
                    getView()?.setUser(user)
                    if (!check){
                        getLastDaily()
                    }else{
                        getCategories(null)
                    }
                })
        }
    }

    private fun getLastDaily(){
        interactor?.let {
            compositeDisposable.add(it.getLastDaily()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ daily ->
                    getCategories(daily.dailyRegister)
                }, { err -> println("error" + err) })
            )
        }
    }
    private fun getCategories(dailyRegister: DailyRegister?){
        interactor?.let {
            compositeDisposable.add(it.getCategories()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ categories ->
                    Log.i("OnMainPresenter", "Las categories fueron: $categories")
                    getMedition(dailyRegister, categories)
                }, { err -> println("error" + err) })
            )
        }
    }

    private fun getMedition(dailyRegister: DailyRegister?, category: List<Category>){
        var date = dailyRegister?.created
        if (category.isEmpty()) {
            Log.e("OnMainPresenter", "La lista de categorías vino vacía")
            return
        }

        val breakfastname = category.firstOrNull { it.cate_name == "register_breakfast_label" }?.cate_name ?: "register_breakfast_label"
        val pbreakfastname  = category.firstOrNull { it.cate_name == "register_pbreakfast_label" }?.cate_name ?: "register_pbreakfast_label"
        val lunchname  = category.firstOrNull { it.cate_name == "register_lunch_label" }?.cate_name ?: "register_lunch_label"
        val plunchname  = category.firstOrNull { it.cate_name == "register_plunch_label" }?.cate_name ?: "register_plunch_label"
        val snackname  = category.firstOrNull { it.cate_name == "register_snack_label" }?.cate_name ?: "register_snack_label"
        val psnackname  = category.firstOrNull { it.cate_name == "register_psnack_label" }?.cate_name ?: "register_psnack_label"
        val dinnername  = category.firstOrNull { it.cate_name == "register_dinner_label" }?.cate_name ?: "register_dinner_label"
        val pdinnername  = category.firstOrNull { it.cate_name == "register_pdinner_label" }?.cate_name ?: "register_pdinner_label"

        val breakfastId = category.firstOrNull { it.cate_name == "register_breakfast_label" }?.cate_id
        val pbreakfastId  = category.firstOrNull { it.cate_name == "register_pbreakfast_label" }?.cate_id
        val lunchId  = category.firstOrNull { it.cate_name == "register_lunch_label" }?.cate_id
        val plunchId  = category.firstOrNull { it.cate_name == "register_plunch_label" }?.cate_id
        val snackId  = category.firstOrNull { it.cate_name == "register_snack_label" }?.cate_id
        val psnackId  = category.firstOrNull { it.cate_name == "register_psnack_label" }?.cate_id
        val dinnerId  = category.firstOrNull { it.cate_name == "register_dinner_label" }?.cate_id
        val pdinnerId  = category.firstOrNull { it.cate_name == "register_pdinner_label" }?.cate_id

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
                    getView()?.setMedition(breakfastname)

                }

                timeBetween(currentDate.toLocalTime(),lunch, lunchEnd) ->{
                    getView()?.setMedition(lunchname)
                }

                timeBetween(currentDate.toLocalTime(),snack,snackEnd) ->{
                    getView()?.setMedition(snackname)
                }


                timeBetween(currentDate.toLocalTime(),dinner, dinnerEnd) ||  timeBetween(currentDate.toLocalTime(), midnight, midnightEnd) -> {
                    getView()?.setMedition(dinnername)
                }

            }
        }else{
            when{
                (dailyRegister?.category_id == breakfastId || dailyRegister?.category_id == pbreakfastId ) && timeBetween(currentDate.toLocalTime(), breakfast, breakfastEnd)-> {
                    getView()?.setMedition(pbreakfastname)
                }
                ( dailyRegister?.category_id == breakfastId || dailyRegister?.category_id == pbreakfastId) && timeBetween(currentDate.toLocalTime(),lunch, lunchEnd) -> {
                    getView()?.setMedition(lunchname)
                }
                (dailyRegister?.category_id == breakfastId || dailyRegister?.category_id == pbreakfastId) && timeBetween(currentDate.toLocalTime(),snack,snackEnd) -> {
                    getView()?.setMedition(snackname)
                }
                (dailyRegister?.category_id == breakfastId || dailyRegister?.category_id == pbreakfastId) &&  (timeBetween(currentDate.toLocalTime(),dinner, dinnerEnd) ||  timeBetween(currentDate.toLocalTime(), midnight, midnightEnd)) -> {
                    getView()?.setMedition(dinnername)
                }
                (dailyRegister?.category_id == lunchId || dailyRegister?.category_id == plunchId   && timeBetween(currentDate.toLocalTime(),lunch, lunchEnd)) -> {
                    getView()?.setMedition(plunchname)
                }
                (dailyRegister?.category_id == lunchId || dailyRegister?.category_id == plunchId) && timeBetween(currentDate.toLocalTime(),snack,snackEnd) -> {
                    getView()?.setMedition(snackname)
                }
                (dailyRegister?.category_id == lunchId || dailyRegister?.category_id == plunchId) && (timeBetween(currentDate.toLocalTime(),dinner, dinnerEnd) ||  timeBetween(currentDate.toLocalTime(), midnight, midnightEnd))-> {
                    getView()?.setMedition(dinnername)
                }
                (dailyRegister?.category_id == snackId || dailyRegister?.category_id == psnackId) && timeBetween(currentDate.toLocalTime(),snack,snackEnd) -> {
                    getView()?.setMedition(psnackname)
                }
                (dailyRegister?.category_id == snackId || dailyRegister?.category_id == psnackId) && (timeBetween(currentDate.toLocalTime(),dinner, dinnerEnd) ||  timeBetween(currentDate.toLocalTime(), midnight, midnightEnd)) -> {
                    getView()?.setMedition(dinnername)
                }
                (dailyRegister?.category_id == dinnerId || dailyRegister?.category_id == pdinnerId ) && (timeBetween(currentDate.toLocalTime(),dinner, dinnerEnd) ||  timeBetween(currentDate.toLocalTime(), midnight, midnightEnd)) -> {
                    getView()?.setMedition(pdinnername)
                }
                (dailyRegister?.category_id == dinnerId  || dailyRegister?.category_id == pdinnerId) && timeBetween(currentDate.toLocalTime(), breakfast, breakfastEnd) -> {
                    getView()?.setMedition(breakfastname)
                }
                (dailyRegister?.category_id == pdinnerId) -> {
                    getView()?.setMedition(breakfastname)
                }
            }

        }

    }
    fun timeBetween(time: LocalTime, startTime: LocalTime, endTime: LocalTime): Boolean{
        return time.isAfter(startTime) && time.isBefore(endTime) || time.isEqual(startTime) || time.isEqual(endTime)
    }
    override fun onRequestPermissionsResult(context: Activity, requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        when (requestCode) {
            permissionRequest -> {

                val perms = HashMap<String, Int>()
                // Initialize the map with both permissions
                for (i in permissions){
                    perms[i] = PackageManager.PERMISSION_GRANTED

                }
                // Fill with actual results from user
                if (grantResults.size > 0) {
                    if (grantResults.size != permissions.size){
                        if (ActivityCompat.shouldShowRequestPermissionRationale(context, permision[0])) {
                            getView()?.explain(R.string.daily_detail_permission)
                        } else {
                            getView()?.explain(R.string.daily_detail_permission)
                        }
                    }
                }
            }
        }
    }

    override fun checkAndRequestPermissions(context: Activity){

        val listPermissionsNeeded = ArrayList<String>()

        for (i in permision.indices){

            if (ContextCompat.checkSelfPermission(context, permision[i]) != PackageManager.PERMISSION_GRANTED) {
                listPermissionsNeeded.add(permision[i])
            }
        }

        if (!listPermissionsNeeded.isEmpty()) {
            ActivityCompat.requestPermissions(context, listPermissionsNeeded.toTypedArray(), permissionRequest)
        }
    }


}