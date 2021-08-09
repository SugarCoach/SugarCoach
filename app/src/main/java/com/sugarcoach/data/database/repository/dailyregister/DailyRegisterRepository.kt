package com.sugarcoach.data.database.repository.dailyregister

import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.internal.operators.single.SingleFromCallable
import io.reactivex.schedulers.Schedulers
import java.util.*
import javax.inject.Inject

class DailyRegisterRepository @Inject constructor(private val dailyRegisterDao: DailyRegisterDao): DailyRegisterRepo {

    override fun insertRegisters(dailyRegister: List<DailyRegister>): Observable<Boolean> {
        val dispoded = Observable.just(dailyRegisterDao)
            .subscribeOn(Schedulers.io())
            .subscribe { dailyRegisterDao ->   dailyRegisterDao.insertAll(dailyRegister)}
            .isDisposed
        return Observable.just(dispoded)
    }

    override fun insertCategories(category: List<Category>): Observable<Boolean> {
        val dispoded = Observable.just(dailyRegisterDao)
            .subscribeOn(Schedulers.io())
            .subscribe { dailyRegisterDao ->   dailyRegisterDao.insertAllCategories(category)}
            .isDisposed
        return Observable.just(dispoded)
    }

    override fun insertExercise(exercises: List<Exercises>): Observable<Boolean>{
        val dispoded = Observable.just(dailyRegisterDao)
            .subscribeOn(Schedulers.io())
            .subscribe { dailyRegisterDao ->   dailyRegisterDao.insertAllExercices(exercises)}
            .isDisposed
        return Observable.just(dispoded)
    }

    override fun insertStates(states: List<States>): Observable<Boolean>{
        val dispoded = Observable.just(dailyRegisterDao)
            .subscribeOn(Schedulers.io())
            .subscribe { dailyRegisterDao ->   dailyRegisterDao.insertAllStates(states)}
            .isDisposed
        return Observable.just(dispoded)
    }

    override fun deleteRegister(id: Int): Observable<Boolean> {
        val dispoded = Observable.just(dailyRegisterDao)
            .subscribeOn(Schedulers.io())
            .subscribe { it.deleteRegister(id)}
            .isDisposed
        return Observable.just(dispoded)
    }

    override fun updateRegister(dailyRegister: DailyRegister): Observable<Boolean> {
        val dispoded = Observable.just(dailyRegisterDao)
            .subscribeOn(Schedulers.io())
            .subscribe { dailyRegisterDao ->   dailyRegisterDao.update(dailyRegister)}
            .isDisposed
        return Observable.just(dispoded)
    }

    override fun insertRegister(dailyRegister: DailyRegister): Observable<Boolean> {
        val dispoded = Observable.just(dailyRegisterDao)
            .subscribeOn(Schedulers.io())
            .subscribe { dailyRegisterDao ->   dailyRegisterDao.insert(dailyRegister)}
            .isDisposed
        return Observable.just(dispoded)
    }

    override fun loadDailyRegister(id: Int): Single<DailyRegisterCategory>
            = Single.fromCallable { dailyRegisterDao.loadById(id) }

    override fun loadDailyRegisters(): Single<List<DailyRegisterCategory>>
            = Single.fromCallable { dailyRegisterDao.loadAll() }

    override fun loadCategories(): Single<List<Category>>
            = Single.fromCallable { dailyRegisterDao.loadAllCategories() }


    override fun loadStates(): Single<List<States>>
            = Single.fromCallable { dailyRegisterDao.loadAllStates() }


    override fun loadExercises(): Single<List<Exercises>>
            = Single.fromCallable { dailyRegisterDao.loadAllExercises() }

    override fun loadDailyRegistersDATES(): Single<List<Date>>
            = Single.fromCallable { dailyRegisterDao.loadDates() }

    override fun isRegisterRepoEmpty(): Boolean =  dailyRegisterDao.loadAll().isEmpty()

    override fun isCategoriesRepoEmpty(): Observable<Boolean> =   Observable.just(dailyRegisterDao.loadAllCategories().isEmpty())

    override fun isStatesRepoEmpty(): Observable<Boolean> =   Observable.just(dailyRegisterDao.loadAllStates().isEmpty())

    override fun isExercisesRepoEmpty(): Observable<Boolean> =   Observable.just(dailyRegisterDao.loadAllExercises().isEmpty())

    override fun lastDailyRegister(): Single<DailyRegisterCategory> = Single.fromCallable{ dailyRegisterDao.loadLast()}

    override fun loadDailyRegistersTotal(): Int = dailyRegisterDao.registersOffline()

    override fun loadAverages(): Single<DailyRegisterAverages> = Single.fromCallable { dailyRegisterDao.loadAverages() }


    override fun loadAveragesLast(hypo:Float, hyper: Float): Single<DailyRegisterAverages> = Single.fromCallable { dailyRegisterDao.loadAveragesLastDays(hypo, hyper) }
    override fun loadAveragesWeek(start: String, end: String, hypo:Float, hyper: Float): Single<DailyRegisterAverages> = Single.fromCallable { dailyRegisterDao.loadAveragesWeek(hypo, hyper, start, end) }

    override fun loadInsuline(breakfast_id: Int, snack_id: Int, lunch_id: Int, dinner_id: Int,date: String): Single<DailyRegisterInsuline> = Single.fromCallable{ dailyRegisterDao.loadInsuline(breakfast_id, snack_id, lunch_id, dinner_id, date)}

    override fun loadCar(breakfast_id: Int, snack_id: Int, lunch_id: Int, dinner_id: Int,date: String): Single<DailyRegisterCar> = Single.fromCallable { dailyRegisterDao.loadCar(breakfast_id, snack_id, lunch_id, dinner_id, date) }

    override fun loadExercisesDays(type1: String, type2: String, type3: String, type4: String): Single<DailyRegisterExercisesStates> = Single.fromCallable{ dailyRegisterDao.loadExercisesDays(type1, type2, type3, type4)}

    override fun loadExercisesWeek(type1: String, type2: String, type3: String, type4: String,start: String, end: String): Single<DailyRegisterExercisesStates> = Single.fromCallable{ dailyRegisterDao.loadExercisesWeek(type1, type2, type3, type4,start, end)}

    override fun loadStatesDays(type1: String, type2: String, type3: String, type4: String): Single<DailyRegisterExercisesStates> = Single.fromCallable{ dailyRegisterDao.loadStatesDays(type1, type2, type3, type4)}

    override fun loadStatesWeek(type1: String, type2: String, type3: String, type4: String,start: String, end: String): Single<DailyRegisterExercisesStates> = Single.fromCallable{ dailyRegisterDao.loadStatesWeek(type1, type2, type3, type4, start, end)}

    override fun deleteAll(): Observable<Boolean> {
        val dispoded = Observable.just(dailyRegisterDao)
            .subscribeOn(Schedulers.io())
            .subscribe { it.deleteAllRegister()}
            .isDisposed
        return Observable.just(dispoded)
    }
}