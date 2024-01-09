package com.sugarcoachpremium.ui.daily.interactor

import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo
import com.sugarcoachpremium.data.database.repository.dailyregister.Exercises
import com.sugarcoachpremium.data.database.repository.dailyregister.States
import com.sugarcoachpremium.data.database.repository.treament.TreamentRepo
import com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoachpremium.data.database.repository.user.UserRepo
import com.sugarcoachpremium.data.network.ApiHelper
import com.sugarcoachpremium.data.ui.base.interactor.BaseInteractor
import com.sugarcoachpremium.di.preferences.PreferenceHelper
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject


class DailyInteractor @Inject constructor(private val treamentRepo: TreamentRepo, private  val dailyRepoHelper: DailyRegisterRepo, userRepoHelper: UserRepo, preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(userRepoHelper,preferenceHelper,apiHelper),
    DailyInteractorImp {
    override fun isDailyEmpty(): Observable<Boolean> {
        return Observable.just(dailyRepoHelper.isRegisterRepoEmpty())
    }


    override
    fun getUser() = userHelper.loadUser()

    override fun getAll() = dailyRepoHelper.loadDailyRegisters()

    override fun getAllDates() = dailyRepoHelper.loadDailyRegistersDATES()
    override fun getTreatment(): Single<TreatmentBasalCorrectora> = treamentRepo.load()
    override fun getExercises(): Single<List<Exercises>> {
        return dailyRepoHelper.loadExercises()
    }

    override fun getEmotions(): Single<List<States>> {
        return dailyRepoHelper.loadStates()
    }
}