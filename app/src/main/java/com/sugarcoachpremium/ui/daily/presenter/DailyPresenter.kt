package com.sugarcoachpremium.ui.daily.presenter

import android.util.Log
import com.hominoid.expandablerecyclerviewlib.models.ExpandableListItem
import com.sugarcoachpremium.R
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory
import com.sugarcoachpremium.data.database.repository.dailyregister.Exercises
import com.sugarcoachpremium.data.database.repository.dailyregister.States
import com.sugarcoachpremium.data.database.repository.treament.Treament
import com.sugarcoachpremium.ui.base.presenter.BasePresenter
import com.sugarcoachpremium.ui.daily.interactor.DailyInteractorImp
import com.sugarcoachpremium.ui.daily.view.DailyItem
import com.sugarcoachpremium.ui.daily.view.DailyView
import com.sugarcoachpremium.ui.daily.view.DailyHeader
import com.sugarcoachpremium.util.SchedulerProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import org.joda.time.LocalDateTime
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

class DailyPresenter<V : DailyView, I : DailyInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable),
    DailyPresenterImp<V,I> {

    lateinit var treament: Treament
    var colors =  ArrayList<Int>()
    lateinit var exercices: List<Exercises>
    lateinit var emotions: List<States>
    override fun onAttach(view: V?) {
        super.onAttach(view)
        getExercices()
        getTreatment()
        getMedition()
        Log.i("OnAttach", "Se inicio el attach")
    }

    private fun getTreatment(){
        interactor?.let {
            compositeDisposable.add(it.getTreatment()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ treatment ->
                    this.treament = treatment.treament!!
                    getUser()
                }, { err -> println("error" + err) })
            )
        }
    }

    private fun getExercices() = interactor?.let {
        getView()?.showProgress()
        exercices = ArrayList<Exercises>()
        compositeDisposable.add(it.getExercises()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ items ->
                exercices = items
                getEmotions()
            }, { err -> println(err)
                getView()?.showErrorToast()
                getView()?.hideProgress()
            }))
    }
    private fun getEmotions() = interactor?.let {
        emotions = ArrayList<States>()
        compositeDisposable.add(it.getEmotions()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ items ->
                emotions = items
            }, { err ->
                println(err)
                getView()?.showErrorToast()
                getView()?.hideProgress()
            }))
    }
    private fun getUser() = interactor?.let {
        compositeDisposable.add(it.getUser()
            .compose(schedulerProvider.ioToMainSingleScheduler())
            .subscribe({ userData ->
                getView()?.let {
                    getView()?.getUserData(userData)
                    if(userData.typeAccount == "2"){
                        getView()?.mirrorAccount()
                    }
                }
            }, { err -> println(err) }))
    }

    override fun getRegisters() {
        interactor?.let {
            compositeDisposable.add(it.getAllDates()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ registers ->
                    getDates(registers)
                }, { throwable ->
                    showException(throwable)
                    getView()?.showErrorToast()
                    getView()?.hideProgress()
                })
            )
        }

    }

    fun getDates(date: List<Date>) {
        interactor?.let {
            compositeDisposable.add(it.getAll()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .doOnSubscribe { getView()?.showProgress() }
                .subscribe({ registers ->
                    getData(registers,date)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }

    }

    private fun getData(dailyRegister: List<DailyRegisterCategory>, date: List<Date>) {
        var registers: MutableList<ExpandableListItem<DailyHeader, DailyItem>> = ArrayList()
        for (i in date.indices) {
            var item: MutableList<DailyItem> = ArrayList()
            val color = generateRandomColor()
            val header = DailyHeader.Builder()
                .date(date[i])
                .bgColor(color)
                .build()

            val formatter =  SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())

            val onlyDate = dailyRegister.filter {
                it.dailyRegister?.dateS.equals(formatter.format(date[i]))

            }
            for(j in onlyDate.indices) {
                val daily = onlyDate[j].dailyRegister!!
                val category = onlyDate[j].category!!
                val label = getView()?.getLabel(category.cate_name)!!
                val gluColor = getColorType(daily.glucose!!)
                val exercise =  exercices.find { it.exercise_id == daily.exercise }
                val state =  emotions.find { it.state_id == daily.emotionalState }
                val content = DailyItem.Builder()
                    .category(label)
                    .id(daily.id)
                    .insulin(daily.insulin.toString())
                    .carbohydrates(daily.carbohydrates.toString())
                    .exercise(exercise)
                    .state(state)
                    .glucose(daily.glucose.toString())
                    .basal(daily.basal.toString())
                    .date(daily.created)
                    .bgColor(color)
                    .gluColor(gluColor)
                    .build()

                item.add(content)
            }
            registers.add(ExpandableListItem(header,item))
        }

        getView()?.getRegisters(registers)

    }

    private fun generateRandomColor() : Int {
        if (colors.isNullOrEmpty()){
           colors = getView()?.getColorsCategory()!!
        }
        var ran = Random()
        val randomValue = ran.nextInt(colors.size)
        var color = colors[randomValue]
        colors.remove(randomValue)
        return color
    }
    private fun getMedition(){
        var currentDate = LocalDateTime()
        getView()?.setDateMedition(currentDate.toDate())
    }

    override fun goToActivityDailyDetail(id: Int) {
        getView()?.openDailyDetailActivity(id)
    }

    override fun onResume() {
        getView()?.setUp()
        getView()?.let {
            getMedition()
        }
    }
    private fun getColorType(value: Float): Int {
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
}
