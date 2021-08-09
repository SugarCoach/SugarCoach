package com.sugarcoach.data.database.repository.dailyregister

import io.reactivex.Observable
import io.reactivex.Single
import java.util.*


interface DailyRegisterRepo {

    fun isRegisterRepoEmpty(): Boolean

    fun isCategoriesRepoEmpty():  Observable<Boolean>

    fun isStatesRepoEmpty(): Observable<Boolean>

    fun isExercisesRepoEmpty(): Observable<Boolean>

    fun insertCategories(category: List<Category>): Observable<Boolean>

    fun insertStates(states: List<States>): Observable<Boolean>

    fun insertExercise(exercises: List<Exercises>): Observable<Boolean>

    fun insertRegister(dailyRegister: DailyRegister): Observable<Boolean>

    fun insertRegisters(dailyRegister: List<DailyRegister>): Observable<Boolean>

    fun loadDailyRegister(id: Int): Single<DailyRegisterCategory>

    fun loadDailyRegisters(): Single<List<DailyRegisterCategory>>

    fun loadStates(): Single<List<States>>

    fun loadExercises(): Single<List<Exercises>>

    fun loadCategories(): Single<List<Category>>

    fun loadDailyRegistersTotal(): Int

    fun loadDailyRegistersDATES(): Single<List<Date>>

    fun lastDailyRegister(): Single<DailyRegisterCategory>

    fun loadAverages(): Single<DailyRegisterAverages>

    fun loadAveragesLast(hypo:Float, hyper: Float): Single<DailyRegisterAverages>

    fun loadAveragesWeek(start: String, end: String,hypo:Float, hyper: Float): Single<DailyRegisterAverages>

    fun loadInsuline(breakfast_id: Int, snack_id: Int, lunch_id: Int, dinner_id: Int,date: String): Single<DailyRegisterInsuline>

    fun loadCar(breakfast_id: Int, snack_id: Int, lunch_id: Int, dinner_id: Int,date: String): Single<DailyRegisterCar>

    fun loadExercisesDays(type1: String, type2: String, type3: String, type4: String): Single<DailyRegisterExercisesStates>

    fun loadExercisesWeek(type1: String, type2: String, type3: String, type4: String,start: String, end: String): Single<DailyRegisterExercisesStates>

    fun loadStatesDays(type1: String, type2: String, type3: String, type4: String): Single<DailyRegisterExercisesStates>

    fun loadStatesWeek(type1: String, type2: String, type3: String, type4: String,start: String, end: String): Single<DailyRegisterExercisesStates>


    fun deleteAll(): Observable<Boolean>

    fun deleteRegister(id: Int): Observable<Boolean>

    fun updateRegister(dailyRegister: DailyRegister): Observable<Boolean>


}