package com.sugarcoach.ui.statistics.presenter

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.net.Uri
import android.provider.MediaStore
import android.util.Log
import android.util.LruCache
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoach.R
import com.sugarcoach.data.database.repository.dailyregister.Category
import com.sugarcoach.data.database.repository.dailyregister.Exercises
import com.sugarcoach.data.database.repository.dailyregister.States
import com.sugarcoach.data.database.repository.treament.Treament
import com.sugarcoach.ui.base.presenter.BasePresenter
import com.sugarcoach.ui.statistics.interactor.StatisticsInteractorImp
import com.sugarcoach.ui.statistics.view.StatisticsAdapter
import com.sugarcoach.ui.statistics.view.StatisticsItem
import com.sugarcoach.ui.statistics.view.StatisticsView
import com.sugarcoach.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import org.joda.time.LocalDate
import org.joda.time.LocalDateTime
import java.io.ByteArrayOutputStream
import java.util.HashMap
import javax.inject.Inject
import kotlin.collections.ArrayList

class StatisticsPresenter <V : StatisticsView, I : StatisticsInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable),
    StatisticsPresenterImp<V,I> {


    lateinit var treament: Treament
    lateinit var category: List<Category>
    lateinit var states: List<States>
    lateinit var exercises: List<Exercises>
    val list = ArrayList<StatisticsItem>()
    val permissionRequest = 1

    override fun onAttach(view: V?) {
        super.onAttach(view)
        getMedition()
        getUser()
        getTreatment()
    }
    private fun getCategory() {
        interactor?.let {
            compositeDisposable.add(it.getCategories()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ categories ->
                    getView()?.let {
                        this.category = categories
                        getStates()

                    }
                }, { err -> println(err) })
            )
        }
    }

    private fun getTreatment() {
        interactor?.let {
            compositeDisposable.add(it.getTreatment()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ treament ->
                    getView()?.let {
                        this.treament = treament.treament!!
                        getCategory()

                    }
                }, { err -> println(err) })
            )
        }
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

    private fun getStates() {
        interactor?.let {
            compositeDisposable.add(it.getStates()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ states ->
                    getView()?.let {
                        this.states = states
                        getExercises()

                    }
                }, { err -> println(err) })
            )
        }
    }

    private fun getExercises() {
        interactor?.let {
            compositeDisposable.add(it.getExercises()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ exercises ->
                    getView()?.let {
                        this.exercises = exercises
                        getView()?.setUp()

                    }
                }, { err -> println(err) })
            )
        }
    }

    override fun goToActivityDaily() {
        getView()?.openDailyActivity()
    }

    override fun goToActivityMain() {
        getView()?.openMainActivity()
    }

    override fun goToActivityTreament() {
        getView()?.openTreatmentActivity()
    }

    fun getDataGlucose() {

        val values = ArrayList<Float>()
        interactor?.let {
            compositeDisposable.add(
                it.getGlucoseDays(treament.hipoglucose, treament.hyperglucose)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ glucoseAverages ->
                        values.add(glucoseAverages.min)
                        values.add(glucoseAverages.promedio)
                        values.add(glucoseAverages.max)
                        getView()?.let {
                            val content =
                                StatisticsItem.Builder()
                                    .index(0)
                                    .name(R.string.statistics_glucemia_label)
                                    .values(values)
                                    .types(getView()?.getGlucemiaType()!!)
                                    .build()
                            list.add(content)
                           getDataInsuline()
                        }
                    }, { err -> println(err) })
            )
        }
    }
    fun getDataInsuline() {
        val values = ArrayList<Float>()
        val break_id = category.filter { category -> category.cate_name.equals("register_breakfast_label")  }.single().cate_id
        val lunch_id = category.filter { category -> category.cate_name.equals("register_lunch_label")  }.single().cate_id
        val snack_id = category.filter { category -> category.cate_name.equals("register_snack_label")  }.single().cate_id
        val dinner_id = category.filter { category -> category.cate_name.equals("register_dinner_label")  }.single().cate_id
        val date = LocalDate.now().toString("yyyy-MM-dd")
        interactor?.let {
            compositeDisposable.add(
                it.getInsuline(break_id, snack_id, lunch_id, dinner_id, date)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ insuline ->
                        values.add(insuline.breakfast)
                        values.add(insuline.lunch)
                        values.add(insuline.snack)
                        values.add(insuline.dinner)
                        getDataBasal(values)
                    }, { err -> println(err) })
            )
        }
    }
    fun getDataBasal(values: ArrayList<Float>) {
        val break_id = category.filter { category -> category.cate_name.equals("register_breakfast_label")  }.single().cate_id
        val lunch_id = category.filter { category -> category.cate_name.equals("register_lunch_label")  }.single().cate_id
        val snack_id = category.filter { category -> category.cate_name.equals("register_snack_label")  }.single().cate_id
        val dinner_id = category.filter { category -> category.cate_name.equals("register_dinner_label")  }.single().cate_id
        interactor?.let {
            compositeDisposable.add(
                it.getInsulineBasal(break_id, snack_id, lunch_id, dinner_id)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ insuline ->
                        values.add(insuline.breakfast)
                        values.add(insuline.lunch)
                        values.add(insuline.snack)
                        values.add(insuline.dinner)
                        getView()?.let {
                            val content =
                                StatisticsItem.Builder()
                                    .index(0)
                                    .name(R.string.statistics_rapida_basal_label)
                                    .values(values)
                                    .types(getView()?.getInsulinaType()!!)
                                    .build()
                            list.add(content)
                            getDataCar()
                        }
                    }, { err -> println(err) })
            )
        }
    }
    fun getDataCar() {
        val values = ArrayList<Float>()
        val break_id = category.filter { category -> category.cate_name.equals("register_breakfast_label")  }.single().cate_id
        val lunch_id = category.filter { category -> category.cate_name.equals("register_lunch_label")  }.single().cate_id
        val snack_id = category.filter { category -> category.cate_name.equals("register_snack_label")  }.single().cate_id
        val dinner_id = category.filter { category -> category.cate_name.equals("register_dinner_label")  }.single().cate_id
        val date = LocalDate.now().toString("yyyy-MM-dd")
        interactor?.let {
            compositeDisposable.add(
                it.getCar(break_id, snack_id, lunch_id, dinner_id, date)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ carbo ->
                        values.add(carbo.breakfast)
                        values.add(carbo.lunch)
                        values.add(carbo.snack)
                        values.add(carbo.dinner)
                        getView()?.let {
                            val content =
                                StatisticsItem.Builder()
                                    .index(0)
                                    .name(R.string.statistics_carbohidratos_label)
                                    .values(values)
                                    .types(getView()?.getCarType()!!)
                                    .build()
                            list.add(content)
                            getDataExercises()
                        }
                    }, { err -> println(err) })
            )
        }
    }
    fun getDataExercises() {
        val values = ArrayList<Float>()
        val type1 = exercises.filter { exercises -> exercises.exercise_name.equals("activity_sedentary")  }.single().exercise_id
        val type2 = exercises.filter { exercises -> exercises.exercise_name.equals("activity_moderate")  }.single().exercise_id
        val type3 = exercises.filter { exercises -> exercises.exercise_name.equals("activity_party")  }.single().exercise_id
        val type4 = exercises.filter { exercises -> exercises.exercise_name.equals("activity_intense")  }.single().exercise_id
        interactor?.let {
            compositeDisposable.add(
                it.getExercisesDays(type1, type2, type3, type4)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ averages ->
                        values.add(averages.value)
                        values.add(averages.value2)
                        values.add(averages.value3)
                        values.add(averages.value4)
                        getView()?.let {
                            val content =
                                StatisticsItem.Builder()
                                    .index(0)
                                    .name(R.string.statistics_exercises_label)
                                    .values(values)
                                    .types(getView()?.getExcercisesType()!!)
                                    .build()
                            list.add(content)
                            getDataStates()
                        }
                    }, { err -> println(err) })
            )
        }
    }
    fun getDataStates() {
        val values = ArrayList<Float>()
        val type1 = states.filter { states -> states.state_name.equals("state_happy")  }.single().state_id
        val type2 = states.filter { states -> states.state_name.equals("state_worried")  }.single().state_id
        val type3 = states.filter { states -> states.state_name.equals("state_relax")  }.single().state_id
        val type4 = states.filter { states -> states.state_name.equals("state_angry")  }.single().state_id
        interactor?.let {
            compositeDisposable.add(
                it.getStatesDays(type1, type2, type3, type4)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ averages ->
                        values.add(averages.value)
                        values.add(averages.value2)
                        values.add(averages.value3)
                        values.add(averages.value4)
                        getView()?.let {
                            val content =
                                StatisticsItem.Builder()
                                    .index(0)
                                    .name(R.string.statistics_emotional_label)
                                    .values(values)
                                    .types(getView()?.getStatesType()!!)
                                    .build()
                            list.add(content)
                            getView()?.getData(list)
                        }
                    }, { err -> println(err) })
            )
        }
    }
    override fun getDataGlucoseLast(position: Int) {
        val values = ArrayList<Float>()
        interactor?.let {
            compositeDisposable.add(
                it.getGlucoseDays(treament.hipoglucose, treament.hyperglucose)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ glucoseAverages ->
                        values.add(glucoseAverages.min)
                        values.add(glucoseAverages.promedio)
                        values.add(glucoseAverages.max)
                        getView()?.let {
                            val content =
                                StatisticsItem.Builder()
                                    .index(0)
                                    .name(R.string.statistics_glucemia_label)
                                    .values(values)
                                    .types(getView()?.getGlucemiaType()!!)
                                    .build()
                            getView()?.setDataUpdated(position,content)
                        }
                    }, { err -> println(err) })
            )
        }
    }
    override fun getDataGlucoseDate(start: String, end: String, position: Int) {
        val values = ArrayList<Float>()
        interactor?.let {
            compositeDisposable.add(
                it.getGlucoseDates(start, end, treament.hipoglucose, treament.hyperglucose)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ glucoseAverages ->
                        values.add(glucoseAverages.min)
                        values.add(glucoseAverages.promedio)
                        values.add(glucoseAverages.max)
                        getView()?.let {
                            val content =
                                StatisticsItem.Builder()
                                    .index(1)
                                    .name(R.string.statistics_glucemia_label)
                                    .values(values)
                                    .types(getView()?.getGlucemiaType()!!)
                                    .build()
                            getView()?.setDataUpdated(position,content)
                        }
                    }, { err -> println(err) })
            )
        }
    }
    override fun getDataInsulineDate(position: Int,date: String, index: Int) {
        val values = ArrayList<Float>()
        val break_id = category.filter { category -> category.cate_name.equals("register_breakfast_label")  }.single().cate_id
        val lunch_id = category.filter { category -> category.cate_name.equals("register_lunch_label")  }.single().cate_id
        val snack_id = category.filter { category -> category.cate_name.equals("register_snack_label")  }.single().cate_id
        val dinner_id = category.filter { category -> category.cate_name.equals("register_dinner_label")  }.single().cate_id
        interactor?.let {
            compositeDisposable.add(
                it.getInsuline(break_id, snack_id, lunch_id, dinner_id, date)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ insuline ->
                        values.add(insuline.breakfast)
                        values.add(insuline.lunch)
                        values.add(insuline.snack)
                        values.add(insuline.dinner)
                        getDataBasal(values)
                    }, { err -> println(err) })
            )
        }
    }
    override fun getDataCarDate(position: Int,date: String, index: Int) {
        val values = ArrayList<Float>()
        val break_id = category.filter { category -> category.cate_name.equals("register_breakfast_label")  }.single().cate_id
        val lunch_id = category.filter { category -> category.cate_name.equals("register_lunch_label")  }.single().cate_id
        val snack_id = category.filter { category -> category.cate_name.equals("register_snack_label")  }.single().cate_id
        val dinner_id = category.filter { category -> category.cate_name.equals("register_dinner_label")  }.single().cate_id
        interactor?.let {
            compositeDisposable.add(
                it.getCar(break_id, snack_id, lunch_id, dinner_id, date)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ carbo ->
                        values.add(carbo.breakfast)
                        values.add(carbo.lunch)
                        values.add(carbo.snack)
                        values.add(carbo.dinner)
                        getView()?.let {
                            val content =
                                StatisticsItem.Builder()
                                    .index(index)
                                    .name(R.string.statistics_carbohidratos_label)
                                    .values(values)
                                    .types(getView()?.getCarType()!!)
                                    .build()
                            getView()?.setDataUpdated(position, content)
                        }
                    }, { err -> println(err) })
            )
        }
    }
    override fun getDataExercisesLast( position: Int) {
        val values = ArrayList<Float>()
        val type1 = exercises.filter { exercises -> exercises.exercise_name.equals("activity_sedentary")  }.single().exercise_id
        val type2 = exercises.filter { exercises -> exercises.exercise_name.equals("activity_moderate")  }.single().exercise_id
        val type3 = exercises.filter { exercises -> exercises.exercise_name.equals("activity_party")  }.single().exercise_id
        val type4 = exercises.filter { exercises -> exercises.exercise_name.equals("activity_intense")  }.single().exercise_id
        interactor?.let {
            compositeDisposable.add(
                it.getExercisesDays(type1, type2, type3, type4)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ averages ->
                        values.add(averages.value)
                        values.add(averages.value2)
                        values.add(averages.value3)
                        values.add(averages.value4)
                        getView()?.let {
                            val content =
                                StatisticsItem.Builder()
                                    .index(0)
                                    .name(R.string.statistics_exercises_label)
                                    .values(values)
                                    .types(getView()?.getExcercisesType()!!)
                                    .build()
                            getView()?.setDataUpdated(position, content)
                        }
                    }, { err -> println(err) })
            )
        }
    }
    override fun getDataExercisesDates(start: String, end: String, position: Int) {
        val values = ArrayList<Float>()
        val type1 = exercises.filter { exercises -> exercises.exercise_name.equals("activity_sedentary")  }.single().exercise_id
        val type2 = exercises.filter { exercises -> exercises.exercise_name.equals("activity_moderate")  }.single().exercise_id
        val type3 = exercises.filter { exercises -> exercises.exercise_name.equals("activity_party")  }.single().exercise_id
        val type4 = exercises.filter { exercises -> exercises.exercise_name.equals("activity_intense")  }.single().exercise_id
        interactor?.let {
            compositeDisposable.add(
                it.getExercisesDates(type1, type2, type3, type4, start, end)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ averages ->
                        values.add(averages.value)
                        values.add(averages.value2)
                        values.add(averages.value3)
                        values.add(averages.value4)
                        getView()?.let {
                            val content =
                                StatisticsItem.Builder()
                                    .index(1)
                                    .name(R.string.statistics_exercises_label)
                                    .values(values)
                                    .types(getView()?.getExcercisesType()!!)
                                    .build()
                            getView()?.setDataUpdated(position, content)
                        }
                    }, { err -> println(err) })
            )
        }
    }
    override fun getDataStatesLast(position: Int) {
        val values = ArrayList<Float>()
        val type1 = states.filter { states -> states.state_name.equals("state_happy")  }.single().state_id
        val type2 = states.filter { states -> states.state_name.equals("state_worried")  }.single().state_id
        val type3 = states.filter { states -> states.state_name.equals("state_relax")  }.single().state_id
        val type4 = states.filter { states -> states.state_name.equals("state_angry")  }.single().state_id
        interactor?.let {
            compositeDisposable.add(
                it.getStatesDays(type1, type2, type3, type4)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ averages ->
                        values.add(averages.value)
                        values.add(averages.value2)
                        values.add(averages.value3)
                        values.add(averages.value4)
                        getView()?.let {
                            val content =
                                StatisticsItem.Builder()
                                    .index(0)
                                    .name(R.string.statistics_emotional_label)
                                    .values(values)
                                    .types(getView()?.getStatesType()!!)
                                    .build()
                            getView()?.setDataUpdated(position,content)
                        }
                    }, { err -> println(err) })
            )
        }
    }
    override fun getDataStatesDates(start: String, end: String,position: Int) {
        val values = ArrayList<Float>()
        val type1 = states.filter { states -> states.state_name.equals("state_happy")  }.single().state_id
        val type2 = states.filter { states -> states.state_name.equals("state_worried")  }.single().state_id
        val type3 = states.filter { states -> states.state_name.equals("state_relax")  }.single().state_id
        val type4 = states.filter { states -> states.state_name.equals("state_angry")  }.single().state_id
        interactor?.let {
            compositeDisposable.add(
                it.getStatesDates(type1, type2, type3, type4, start, end)
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ averages ->
                        values.add(averages.value)
                        values.add(averages.value2)
                        values.add(averages.value3)
                        values.add(averages.value4)
                        getView()?.let {
                            val content =
                                StatisticsItem.Builder()
                                    .index(1)
                                    .name(R.string.statistics_emotional_label)
                                    .values(values)
                                    .types(getView()?.getStatesType()!!)
                                    .build()
                            getView()?.setDataUpdated(position,content)
                        }
                    }, { err -> println(err) })
            )
        }
    }

    override fun getData() {
       getDataGlucose()
    }

    private fun getMedition(){
        var currentDate = LocalDateTime()
        getView()?.setDate(currentDate.toDate())
    }




    override fun getDataUpdated(position: Int, index: Int) {
        when(position){
            0 -> {
                when(index){
                    0 ->{
                        getDataGlucoseLast(position)
                    }
                    1 -> {
                        val values = ArrayList<Float>()
                        values.add(30f)
                        values.add(60f)
                        values.add(80f)
                        val content =
                            StatisticsItem.Builder()
                                .name(R.string.statistics_glucemia_label)
                                .values(values)
                                .types(getView()?.getGlucemiaType()!!)
                                .build()
                        getView()?.setDataUpdated(position, content)
                    }
                }
            }
            1 -> {
                if (index == 0){
                    val values = ArrayList<Float>()
                    val content =
                        StatisticsItem.Builder()
                            .name(R.string.statistics_glucemia_label)
                            .values(values)
                            .types(getView()?.getGlucemiaType()!!)
                            .build()
                    getView()?.setDataUpdated(position, content)
                }else{
                    val values = ArrayList<Float>()
                    val content =
                        StatisticsItem.Builder()
                            .name(R.string.statistics_glucemia_label)
                            .values(values)
                            .types(getView()?.getGlucemiaType()!!)
                            .build()
                    getView()?.setDataUpdated(position, content)
                }

            }
            2 -> {
                if (index == 0){
                    val values = ArrayList<Float>()
                    val content =
                        StatisticsItem.Builder()
                            .name(R.string.statistics_glucemia_label)
                            .values(values)
                            .types(getView()?.getGlucemiaType()!!)
                            .build()
                    getView()?.setDataUpdated(position, content)
                }else{
                    val values = ArrayList<Float>()
                    val content =
                        StatisticsItem.Builder()
                            .name(R.string.statistics_glucemia_label)
                            .values(values)
                            .types(getView()?.getGlucemiaType()!!)
                            .build()
                    getView()?.setDataUpdated(position, content)
                }
            }
            3 -> {
                if (index == 0){
                    val values = ArrayList<Float>()
                    val content =
                        StatisticsItem.Builder()
                            .name(R.string.statistics_glucemia_label)
                            .values(values)
                            .types(getView()?.getGlucemiaType()!!)
                            .build()
                    getView()?.setDataUpdated(position, content)
                }else{
                    val values = ArrayList<Float>()
                    val content =
                        StatisticsItem.Builder()
                            .name(R.string.statistics_glucemia_label)
                            .values(values)
                            .types(getView()?.getGlucemiaType()!!)
                            .build()
                    getView()?.setDataUpdated(position, content)
                }
            }
            4 -> {
                if (index == 0){
                    val values = ArrayList<Float>()
                    val content =
                        StatisticsItem.Builder()
                            .name(R.string.statistics_glucemia_label)
                            .values(values)
                            .types(getView()?.getGlucemiaType()!!)
                            .build()
                    getView()?.setDataUpdated(position, content)
                }else{
                    val values = ArrayList<Float>()
                    val content =
                        StatisticsItem.Builder()
                            .name(R.string.statistics_glucemia_label)
                            .values(values)
                            .types(getView()?.getGlucemiaType()!!)
                            .build()
                    getView()?.setDataUpdated(position, content)
                }
            }
        }
    }

    override fun getScreenShot(context: Activity, view: RecyclerView) {
        if (checkAndRequestPermissions(context)){
            val bitmap = getScreenShotImage(view)
            bitmap?.let {
                val uri =                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    getImageUri(context, bitmap)
                getView()?.sharedScreenShot(uri)
            }
        }
    }
    private fun getScreenShotImage(view: RecyclerView): Bitmap? {
        var adapter = view.adapter
        var bigBitmap: Bitmap? = null
        if (adapter != null) {
            var size = adapter.itemCount
            var height = 0;
            var paint = Paint()
            var iHeight = 0
            var maxMemory =  (Runtime.getRuntime().maxMemory() / 1024).toInt()

            // Use 1/8th of the available memory for this memory cache.
            var cacheSize = maxMemory / 8
             var bitmaCache = LruCache<String, Bitmap>(cacheSize)
            for (i in 0..size) {
                var holder = adapter.createViewHolder(view, adapter.getItemViewType(i))
                adapter.onBindViewHolder(holder, i);
                holder.itemView.measure(View.MeasureSpec.makeMeasureSpec(view.width, View.MeasureSpec.EXACTLY),
                    View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));
                holder.itemView.layout(0, 0, holder.itemView.measuredWidth, holder.itemView.measuredHeight);
                holder.itemView.isDrawingCacheEnabled = true
                holder.itemView.buildDrawingCache();
                var drawingCache = holder.itemView.getDrawingCache()
                if (drawingCache != null) {
                    bitmaCache.put(i.toString(), drawingCache)
                }
//                holder.itemView.setDrawingCacheEnabled(false);
//                holder.itemView.destroyDrawingCache();
                height += holder.itemView.measuredHeight
            }

            bigBitmap = Bitmap.createBitmap(view.measuredWidth, height, Bitmap.Config.ARGB_8888);
            var bigCanvas = Canvas(bigBitmap)
            bigCanvas.drawColor(Color.WHITE)

            for (i in 1..size) {
                var bitmap = bitmaCache.get(i.toString())
                bigCanvas.drawBitmap(bitmap, 0f, iHeight.toFloat(), paint);
                iHeight += bitmap.height
                bitmap.recycle()
            }

        }
        return bigBitmap
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
