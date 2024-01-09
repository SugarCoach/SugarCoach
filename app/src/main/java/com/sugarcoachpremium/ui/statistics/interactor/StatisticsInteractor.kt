package com.sugarcoachpremium.ui.statistics.interactor

import com.sugarcoachpremium.data.database.repository.dailyregister.*
import com.sugarcoachpremium.data.database.repository.treament.TreamentRepo
import com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoachpremium.data.database.repository.user.UserRepo
import com.sugarcoachpremium.data.network.ApiHelper
import com.sugarcoachpremium.data.ui.base.interactor.BaseInteractor
import com.sugarcoachpremium.di.preferences.PreferenceHelper
import io.reactivex.Single
import javax.inject.Inject


class StatisticsInteractor @Inject constructor(private val treamentRepoHelper: TreamentRepo, private val dailyRepoHelper: DailyRegisterRepo, userRepoHelper: UserRepo, preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(userRepoHelper,preferenceHelper,apiHelper),
    StatisticsInteractorImp {


    override fun getAll() = dailyRepoHelper.loadDailyRegisters()
    override fun getUser() = userHelper.loadUser()
    override fun getGlucoseDays(hypo:Float, hyper: Float): Single<DailyRegisterAverages> {
        return dailyRepoHelper.loadAveragesLast(hypo, hyper)
    }

    override fun getGlucoseDates(start: String, end: String, hypo:Float, hyper: Float): Single<DailyRegisterAverages> {
        return dailyRepoHelper.loadAveragesWeek(start, end, hypo, hyper)
    }
    override fun getTreatment(): Single<TreatmentBasalCorrectora> = treamentRepoHelper.load()

    override fun getCategories(): Single<List<Category>> {
        return dailyRepoHelper.loadCategories()
    }

    override fun getExercises(): Single<List<Exercises>> = dailyRepoHelper.loadExercises()
    override fun getStates(): Single<List<States>> = dailyRepoHelper.loadStates()

    override fun getCar(breakfast_id: Int, snack_id: Int, lunch_id: Int, dinner_id: Int,date: String): Single<DailyRegisterCar> = dailyRepoHelper.loadCar(breakfast_id, snack_id, lunch_id, dinner_id, date)
    override fun getInsuline(breakfast_id: Int, snack_id: Int, lunch_id: Int, dinner_id: Int,date: String): Single<DailyRegisterInsuline> = dailyRepoHelper.loadInsuline(breakfast_id, snack_id, lunch_id, dinner_id, date)
    override fun getInsulineBasal(breakfast_id: Int, snack_id: Int, lunch_id: Int, dinner_id: Int): Single<DailyRegisterInsuline> = treamentRepoHelper.loadInsuline(breakfast_id, snack_id, lunch_id, dinner_id)
    override fun getExercisesDays(type1: String, type2: String, type3: String, type4: String): Single<DailyRegisterExercisesStates> = dailyRepoHelper.loadExercisesDays(type1, type2, type3, type4)
    override fun getExercisesDates(type1: String, type2: String, type3: String, type4: String,start: String, end: String): Single<DailyRegisterExercisesStates> = dailyRepoHelper.loadExercisesWeek(type1, type2, type3, type4, start, end)
    override fun getStatesDays(type1: String, type2: String, type3: String, type4: String): Single<DailyRegisterExercisesStates> = dailyRepoHelper.loadStatesDays(type1, type2, type3, type4)
    override fun getStatesDates(type1: String, type2: String, type3: String, type4: String,start: String, end: String): Single<DailyRegisterExercisesStates> = dailyRepoHelper.loadStatesWeek(type1, type2, type3, type4, start, end)
}