package com.sugarcoachpremium.ui.treatment.interactor

import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages
import com.sugarcoachpremium.data.database.repository.treament.*
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.data.ui.base.interactor.Interactor
import io.reactivex.Observable
import io.reactivex.Single


interface TreatmentInteractorImp : Interactor {
    fun getUser(): Single<User>
    fun isDailyEmpty(): Observable<Boolean>
    fun getAverages(): Single<DailyRegisterAverages>
    fun getAverageBasal(): Single<TreatmentAverage>
    fun getCategories(): Single<List<TreatmentHorariosCategory>>
    fun getCategoriesCorrectora(): Single<List<TreatmentHCorrectoraCategory>>
    fun getBasals(): Single<List<BasalInsuline>>
    fun getMedidores(): Single<List<Medidor>>
    fun getBombas(): Single<List<BombaInfusora>>
    fun getBasalHoras(): Single<List<TreamentBasalHora>>
    fun getCorrectora(): Single<List<CorrectoraInsuline>>
    fun getTreatment(): Single<TreatmentBasalCorrectora>
    suspend fun editTreatment(treament: Treament, basalInsuline: String, correctoraInsuline: String): Observable<Boolean>
    fun editBasalHora(hora: TreamentBasalHora): Observable<Boolean>
    fun editBasalCategory(horarios: TreamentHorarios): Observable<Boolean>
    fun editCorrectoraCategory(horarios: TreamentCorrectoraHorarios): Observable<Boolean>
    suspend fun editCloudTreatment(treatment: Treament): Boolean
}