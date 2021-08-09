package com.sugarcoach.ui.daily.interactor

import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.dailyregister.DailyRegisterCategory
import com.sugarcoach.data.database.repository.dailyregister.Exercises
import com.sugarcoach.data.database.repository.dailyregister.States
import com.sugarcoach.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.data.ui.base.interactor.Interactor
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