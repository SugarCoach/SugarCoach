package com.sugarcoach.ui.daily_detail.interactor

import com.sugarcoach.data.database.repository.dailyregister.*
import com.sugarcoach.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.data.network.RegisterSavePhotoResponse
import com.sugarcoach.data.network.RegisterSaveResponse
import com.sugarcoach.data.network.RegistersResponse
import com.sugarcoach.data.ui.base.interactor.Interactor
import io.reactivex.Observable
import io.reactivex.Single
import java.io.File


interface DailyDetailInteractorImp : Interactor {


    fun getRegister(id: Int): Single<DailyRegisterCategory>
    fun updateRegisterCall(dailyRegister: DailyRegister): Observable<RegisterSaveResponse>
    fun saveRegisterPhotoCall(id: String, photo: File): Observable<RegisterSavePhotoResponse>
    fun deleteRegistersCall(id: String): Observable<RegisterSaveResponse>
    fun deleteRegister(id: Int): Observable<Boolean>
    fun updateRegister(dailyRegister: DailyRegister): Observable<Boolean>
    fun getCategories(): Single<List<Category>>
    fun getTreatment(): Single<TreatmentBasalCorrectora>
    fun getUser(): Single<User>
    fun getExercises(): Single<List<Exercises>>
    fun getEmotions(): Single<List<States>>



}