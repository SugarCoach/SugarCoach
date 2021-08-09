package com.sugarcoach.data.database.repository.treament

import com.sugarcoach.data.database.repository.dailyregister.DailyRegisterInsuline
import io.reactivex.Observable
import io.reactivex.Single

interface TreamentRepo {

    fun isTreamentRepoEmpty(): Observable<Boolean>

    fun loadAll(): Single<List<Treament>>

    fun load(): Single<TreatmentBasalCorrectora>

    fun insertTreament(treament: Treament): Observable<Boolean>

    fun insertTreamentCategory(horarios: List<TreamentHorarios>): Observable<Boolean>

    fun insertTreamentBasalHoras(horas: List<TreamentBasalHora>): Observable<Boolean>

    fun insertTreamentCategoryCorrectora(horarios: List<TreamentCorrectoraHorarios>): Observable<Boolean>

    fun loadAllCategory(): Single<List<TreatmentHorariosCategory>>

    fun loadAllBasalHora(): Single<List<TreamentBasalHora>>

    fun loadTreatmentByCategory(id: Int): Single<TreamentHorarios>

    fun loadAllCategoryCorrectora(): Single<List<TreatmentHCorrectoraCategory>>

    fun isTreamentCategoryRepoEmpty(): Observable<Boolean>

    fun isTreamentBasalHoraRepoEmpty(): Observable<Boolean>

    fun isTreamentCategoryCorrectoraRepoEmpty(): Observable<Boolean>

    fun isMedidorRepoEmpty(): Observable<Boolean>

    fun isBombasRepoEmpty(): Observable<Boolean>

    fun insertBasal(category: List<BasalInsuline>): Observable<Boolean>

    fun loadAllBasal(): Single<List<BasalInsuline>>

    fun insertMedidor(item: List<Medidor>): Observable<Boolean>

    fun loadAllMedidor(): Single<List<Medidor>>

    fun insertBombas(item: List<BombaInfusora>): Observable<Boolean>

    fun loadAllBombas(): Single<List<BombaInfusora>>

    fun loadInsuline(breakfast_id: Int, snack_id: Int, lunch_id: Int, dinner_id: Int): Single<DailyRegisterInsuline>

    fun getAverage(): Single<TreatmentAverage>

    fun isBasalRepoEmpty(): Observable<Boolean>

    fun insertCorrectora(item: List<CorrectoraInsuline>): Observable<Boolean>

    fun loadAllCorrectora(): Single<List<CorrectoraInsuline>>

    fun isCorrectoraRepoEmpty(): Observable<Boolean>

    fun deleteAllCategory(): Observable<Boolean>

    fun deleteAllCategoryCorrectora(): Observable<Boolean>

    fun deleteAllTreatment(): Observable<Boolean>

    fun deleteAllBasalHoras(): Observable<Boolean>

    fun updateTreatment(treament: Treament): Observable<Boolean>

    fun updateTreatmentBasalHora(hora: TreamentBasalHora): Observable<Boolean>

    fun updateBasalCategory(horarios: TreamentHorarios): Observable<Boolean>

    fun updateCorrectoraCategory(horarios: TreamentCorrectoraHorarios): Observable<Boolean>



}