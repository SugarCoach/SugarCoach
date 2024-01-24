package com.sugarcoachpremium.ui.register.interactor

import com.sugarcoachpremium.data.database.repository.dailyregister.*
import com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios
import com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.data.network.RegisterSavePhotoResponse
import com.sugarcoachpremium.data.network.RegisterSaveResponse
import com.sugarcoachpremium.data.ui.base.interactor.Interactor
import io.reactivex.Observable
import io.reactivex.Single
import java.io.File


interface RegisterInteractorImp : Interactor {

    suspend fun updateUserPoints(): Boolean

    fun updateLocalPoints(user:User, points: Int): Observable<Boolean>
    suspend fun saveRegisterCall(dailyRegister: DailyRegister): Observable<RegisterSaveResponse>
    fun saveRegisterPhotoCall(id: String, photo: File): Observable<RegisterSavePhotoResponse>
    fun insertDaily(dailyRegister: DailyRegister): Observable<Boolean>
    fun getUser(): Single<User>
    fun getLastDaily(): Single<DailyRegisterCategory>
    fun isDailyEmpty(): Observable<Boolean>
    fun getTreatmentHorarios(id: Int): Single<TreamentHorarios>
    fun getTreatment(): Single<TreatmentBasalCorrectora>
    fun getCategories(): Single<List<Category>>
    fun getExercises(): Single<List<Exercises>>
    fun getEmotions(): Single<List<States>>

}