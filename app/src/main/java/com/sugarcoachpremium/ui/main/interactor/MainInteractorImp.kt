package com.sugarcoachpremium.ui.main.interactor

import com.sugarcoachpremium.data.database.repository.dailyregister.Category
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory
import com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.data.ui.base.interactor.Interactor
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