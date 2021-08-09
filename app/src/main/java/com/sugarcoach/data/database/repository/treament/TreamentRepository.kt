package com.sugarcoach.data.database.repository.treament

import com.sugarcoach.data.database.repository.dailyregister.DailyRegisterInsuline
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class TreamentRepository @Inject constructor(private val treamentDao: TreamentDao): TreamentRepo{
    override fun getAverage(): Single<TreatmentAverage> {
        return Single.fromCallable{treamentDao.loadAverage()}
    }

    override fun updateTreatment(treament: Treament): Observable<Boolean> {
        val dispoded = Observable.just(treamentDao)
            .subscribeOn(Schedulers.io())
            .subscribe { it.editTreatment(treament)}
            .isDisposed
        return Observable.just(dispoded)
    }

    override fun updateTreatmentBasalHora(hora: TreamentBasalHora): Observable<Boolean> {
        val dispoded = Observable.just(treamentDao)
            .subscribeOn(Schedulers.io())
            .subscribe { it.editBasalHora(hora)}
            .isDisposed
        return Observable.just(dispoded)
    }

    override fun updateBasalCategory(horarios: TreamentHorarios): Observable<Boolean> {
        val dispoded = Observable.just(treamentDao)
            .subscribeOn(Schedulers.io())
            .subscribe { it.editBasalCategory(horarios)}
            .isDisposed
        return Observable.just(dispoded)
    }

    override fun updateCorrectoraCategory(horarios: TreamentCorrectoraHorarios): Observable<Boolean> {
        val dispoded = Observable.just(treamentDao)
            .subscribeOn(Schedulers.io())
            .subscribe { it.editCorrectoraCategory(horarios)}
            .isDisposed
        return Observable.just(dispoded)
    }

    override fun isTreamentRepoEmpty(): Observable<Boolean>
        = Observable.just(treamentDao.loadAll().isEmpty())


    override fun loadInsuline(breakfast_id: Int, snack_id: Int, lunch_id: Int, dinner_id: Int): Single<DailyRegisterInsuline> = Single.fromCallable{ treamentDao.loadInsuline(breakfast_id, snack_id, lunch_id, dinner_id)}

    override fun loadAll(): Single<List<Treament>>
            = Single.fromCallable{treamentDao.loadAll()}

    override fun load(): Single<TreatmentBasalCorrectora>
            = Single.fromCallable { treamentDao.loadById(1) }

    override fun insertTreament(treament: Treament): Observable<Boolean> {
        treamentDao.insert(treament)
        return Observable.just(true)
    }

    override fun isTreamentCategoryRepoEmpty(): Observable<Boolean>
            = Observable.just(treamentDao.loadAllCategory().isEmpty())

    override fun isTreamentBasalHoraRepoEmpty(): Observable<Boolean>
        = Observable.just(treamentDao.loadAllBasalHora().isEmpty())


    override fun loadAllCategory(): Single<List<TreatmentHorariosCategory>>
            = Single.fromCallable{treamentDao.loadAllCategory()}

    override fun loadAllBasalHora(): Single<List<TreamentBasalHora>>
        = Single.fromCallable{treamentDao.loadAllBasalHora()}

    override fun loadTreatmentByCategory(id: Int): Single<TreamentHorarios>
            = Single.fromCallable{treamentDao.loadTreatmentByCategory(id)}

    override fun insertTreamentCategoryCorrectora(horarios: List<TreamentCorrectoraHorarios>): Observable<Boolean> {
        treamentDao.insertCategoryCorrectora(horarios)
        return Observable.just(true)
    }

    override fun isTreamentCategoryCorrectoraRepoEmpty(): Observable<Boolean>
            = Observable.just(treamentDao.loadAllCategoryCorrectora().isEmpty())

    override fun loadAllCategoryCorrectora(): Single<List<TreatmentHCorrectoraCategory>>
            = Single.fromCallable{treamentDao.loadAllCategoryCorrectora()}

    override fun insertTreamentCategory(horarios: List<TreamentHorarios>): Observable<Boolean> {
        treamentDao.insertCategory(horarios)
        return Observable.just(true)
    }

    override fun insertTreamentBasalHoras(horas: List<TreamentBasalHora>): Observable<Boolean> {
        treamentDao.insertBasalHora(horas)
        return Observable.just(true)
    }


    override fun isBasalRepoEmpty(): Observable<Boolean>
            = Observable.just(treamentDao.loadAllBasal().isEmpty())

    override fun loadAllBasal(): Single<List<BasalInsuline>>
            = Single.fromCallable{treamentDao.loadAllBasal()}

    override fun insertMedidor(item: List<Medidor>): Observable<Boolean> {
        treamentDao.insertMedidor(item)
        return Observable.just(true)
    }

    override fun isMedidorRepoEmpty(): Observable<Boolean>
            = Observable.just(treamentDao.loadAllMedidor().isEmpty())

    override fun loadAllMedidor(): Single<List<Medidor>>
            = Single.fromCallable{treamentDao.loadAllMedidor()}
    override fun isBombasRepoEmpty(): Observable<Boolean>
            = Observable.just(treamentDao.loadAllBombas().isEmpty())
    override fun insertBombas(item: List<BombaInfusora>): Observable<Boolean> {
        treamentDao.insertBombas(item)
        return Observable.just(true)
    }

    override fun loadAllBombas(): Single<List<BombaInfusora>>
        = Single.fromCallable{treamentDao.loadAllBombas()}


    override fun insertBasal(basal: List<BasalInsuline>): Observable<Boolean> {
        treamentDao.insertBasal(basal)
        return Observable.just(true)
    }

    override fun isCorrectoraRepoEmpty(): Observable<Boolean>
            = Observable.just(treamentDao.loadAllCorrectora().isEmpty())

    override fun loadAllCorrectora(): Single<List<CorrectoraInsuline>>
            = Single.fromCallable{treamentDao.loadAllCorrectora()}

    override fun insertCorrectora(item: List<CorrectoraInsuline>): Observable<Boolean> {
        treamentDao.insertCorrectora(item)
        return Observable.just(true)
    }

    override fun deleteAllCategory(): Observable<Boolean> {
        val dispoded = Observable.just(treamentDao)
            .subscribeOn(Schedulers.io())
            .subscribe { it.deleteAllCategory()}
            .isDisposed
        return Observable.just(dispoded)
    }

    override fun deleteAllCategoryCorrectora(): Observable<Boolean> {
        val dispoded = Observable.just(treamentDao)
            .subscribeOn(Schedulers.io())
            .subscribe { it.deleteAllCategoryCorrectora()}
            .isDisposed
        return Observable.just(dispoded)
    }

    override fun deleteAllTreatment(): Observable<Boolean> {
        val dispoded = Observable.just(treamentDao)
            .subscribeOn(Schedulers.io())
            .subscribe { it.deleteAllTreatment()}
            .isDisposed
        return Observable.just(dispoded)
    }

    override fun deleteAllBasalHoras(): Observable<Boolean> {
        val dispoded = Observable.just(treamentDao)
            .subscribeOn(Schedulers.io())
            .subscribe { it.deleteAllTreatmentBasalHora()}
            .isDisposed
        return Observable.just(dispoded)
    }
}