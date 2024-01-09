package com.sugarcoachpremium.ui.daily.interactor

import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory
import com.sugarcoachpremium.data.database.repository.dailyregister.Exercises
import com.sugarcoachpremium.data.database.repository.dailyregister.States
import com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.data.ui.base.interactor.Interactor
import io.reactivex.Observable
import io.reactivex.Single
import java.util.*


interface DailyInteractorImp : Interactor {

    fun getUser(): Single<User>
    fun getAll(): Single<List<DailyRegisterCategory>>
    fun getAllDates(): Single<List<Date>>
    fun isDailyEmpty(): Observable<Boolean>
    fun getTreatment(): Single<TreatmentBasalCorrectora>
    fun getExercises(): Single<List<Exercises>>
    fun getEmotions(): Single<List<States>>

}