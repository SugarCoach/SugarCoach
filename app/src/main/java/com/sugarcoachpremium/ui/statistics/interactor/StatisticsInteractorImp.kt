package com.sugarcoachpremium.ui.statistics.interactor

import com.sugarcoachpremium.data.database.repository.dailyregister.*
import com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.data.ui.base.interactor.Interactor
import io.reactivex.Single


interface StatisticsInteractorImp : Interactor {

    fun getAll(): Single<List<DailyRegisterCategory>>
    fun getUser(): Single<User>
    fun getTreatment(): Single<TreatmentBasalCorrectora>
    fun getCategories(): Single<List<Category>>
    fun getExercises(): Single<List<Exercises>>
    fun getStates(): Single<List<States>>
    fun getGlucoseDays(hypo:Float, hyper: Float): Single<DailyRegisterAverages>
    fun getGlucoseDates(start: String, end: String, hypo:Float, hyper: Float): Single<DailyRegisterAverages>
    fun getInsuline(breakfast_id: Int, snack_id: Int, lunch_id: Int, dinner_id: Int,date: String): Single<DailyRegisterInsuline>
    fun getInsulineBasal(breakfast_id: Int, snack_id: Int, lunch_id: Int, dinner_id: Int): Single<DailyRegisterInsuline>
    fun getCar(breakfast_id: Int, snack_id: Int, lunch_id: Int, dinner_id: Int,date: String): Single<DailyRegisterCar>
    fun getExercisesDays(type1: String, type2: String, type3: String, type4: String): Single<DailyRegisterExercisesStates>
    fun getExercisesDates(type1: String, type2: String, type3: String, type4: String,start: String, end: String): Single<DailyRegisterExercisesStates>
    fun getStatesDays(type1: String, type2: String, type3: String, type4: String): Single<DailyRegisterExercisesStates>
    fun getStatesDates(type1: String, type2: String, type3: String, type4: String,start: String, end: String): Single<DailyRegisterExercisesStates>
}