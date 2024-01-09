package com.sugarcoachpremium.ui.daily_detail.interactor

import com.sugarcoachpremium.data.database.repository.dailyregister.*
import com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.data.network.RegisterSavePhotoResponse
import com.sugarcoachpremium.data.ui.base.interactor.Interactor
import io.reactivex.Observable
import io.reactivex.Single
import java.io.File


interface DailyDetailInteractorImp : Interactor {


    fun getRegister(id: Int): Single<DailyRegisterCategory>
    suspend fun updateRegisterCall(dailyRegister: DailyRegister): Result<String?>
    fun saveRegisterPhotoCall(id: String, photo: File): Observable<RegisterSavePhotoResponse>
    suspend fun deleteRegistersCall(id: String): Result<String?>
    fun deleteRegister(id: Int): Observable<Boolean>
    fun updateRegister(dailyRegister: DailyRegister): Observable<Boolean>
    fun getCategories(): Single<List<Category>>
    fun getTreatment(): Single<TreatmentBasalCorrectora>
    fun getUser(): Single<User>
    fun getExercises(): Single<List<Exercises>>
    fun getEmotions(): Single<List<States>>
    fun setIdOnline(id: String)

}