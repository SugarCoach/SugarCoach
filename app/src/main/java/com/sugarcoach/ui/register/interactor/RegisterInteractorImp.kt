package com.sugarcoach.ui.register.interactor

import com.sugarcoach.data.database.repository.dailyregister.*
import com.sugarcoach.data.database.repository.treament.Treament
import com.sugarcoach.data.database.repository.treament.TreamentHorarios
import com.sugarcoach.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoach.data.database.repository.treament.TreatmentHorariosCategory
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.data.network.LoginResponse
import com.sugarcoach.data.network.RegisterSavePhotoResponse
import com.sugarcoach.data.network.RegisterSaveResponse
import com.sugarcoach.data.ui.base.interactor.Interactor
import io.reactivex.Observable
import io.reactivex.Single
import java.io.File


interface RegisterInteractorImp : Interactor {

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