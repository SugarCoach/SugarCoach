package com.sugarcoach.ui.main.interactor

import com.sugarcoach.data.database.repository.dailyregister.Category
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.dailyregister.DailyRegisterAverages
import com.sugarcoach.data.database.repository.dailyregister.DailyRegisterCategory
import com.sugarcoach.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.data.ui.base.interactor.Interactor
import io.reactivex.Observable
import io.reactivex.Single

interface MainInteractorImp : Interactor {
    fun getUser(): Single<User>
    fun deleteUser(): Observable<Boolean>
    fun getLastDaily(): Single<DailyRegisterCategory>
    fun isDailyEmpty(): Observable<Boolean>
    fun getAverages(): Single<DailyRegisterAverages>
    fun deleteAll(): Observable<Boolean>
    fun getTreatment(): Single<TreatmentBasalCorrectora>
    fun getCategories(): Single<List<Category>>
}