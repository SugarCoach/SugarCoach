package com.sugarcoach.data.database.repository.dailyregister

import androidx.room.*
import java.util.*

@Dao
interface DailyRegisterDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(dailyRegister: DailyRegister)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(dailyRegister: List<DailyRegister>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllCategories(category: List<Category>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllStates(states: List<States>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllExercices(exercises: List<Exercises>)

    @Query("SELECT * FROM daily_register left join category on daily_register.category_id = category.cate_id WHERE id = :id")
    fun loadById(id: Int): DailyRegisterCategory

    @Query("SELECT * FROM daily_register left join category on daily_register.category_id = category.cate_id ORDER BY category_id DESC")
    fun loadAll(): List<DailyRegisterCategory>

    @Query("SELECT * FROM category")
    fun loadAllCategories(): List<Category>

    @Query("SELECT * FROM states")
    fun loadAllStates(): List<States>

    @Query("SELECT * FROM exercises")
    fun loadAllExercises(): List<Exercises>

    @Query("SELECT * FROM daily_register left join category on daily_register.category_id = category.cate_id ORDER BY date(created) desc, category_id DESC LIMIT 1")
    fun loadLast(): DailyRegisterCategory

    @Query("SELECT MIN(glucose) as min, MAX(glucose) as max, AVG(glucose) as promedio   FROM daily_register")
    fun loadAverages(): DailyRegisterAverages

    @Query("SELECT avg(case when glucose BETWEEN 0 and :hypo then glucose end) as min, avg(case when glucose > :hypo and glucose <= :hyper then glucose end) as promedio, avg(case when glucose > :hyper then glucose end) as max from daily_register WHERE DATE(created) BETWEEN datetime('now', '-30 days') AND datetime('now')")
    fun loadAveragesLastDays(hypo: Float, hyper: Float): DailyRegisterAverages

    @Query("SELECT avg(case when glucose BETWEEN 0 and :hypo then glucose end) as min, avg(case when glucose > :hypo and glucose <= :hyper then glucose end) as promedio, avg(case when glucose > :hyper then glucose end) as max  FROM daily_register WHERE DATE(created) BETWEEN datetime(:start) AND datetime(:end)")
    fun loadAveragesWeek(hypo: Float, hyper: Float,start: String, end: String): DailyRegisterAverages

    @Query("SELECT avg(case when category_id = :breakfast_id then insulin end) as breakfast, avg(case when category_id = :snack_id then insulin end) as snack, avg(case when category_id = :lunch_id then insulin end) as lunch, avg(case when category_id = :dinner_id then insulin end) as dinner FROM daily_register WHERE DATE(created) = :date")
    fun loadInsuline(breakfast_id: Int, snack_id: Int, lunch_id: Int, dinner_id: Int,date: String): DailyRegisterInsuline


    @Query("SELECT avg(case when category_id = :breakfast_id then carbohydrates end) as breakfast, avg(case when category_id = :snack_id then carbohydrates end) as snack, avg(case when category_id = :lunch_id then carbohydrates end) as lunch, avg(case when category_id = :dinner_id then carbohydrates end) as dinner FROM daily_register WHERE DATE(created) = :date")
    fun loadCar(breakfast_id: Int, snack_id: Int, lunch_id: Int, dinner_id: Int,date: String): DailyRegisterCar

    @Query("SELECT count(case when exercise = :type1 then 1 end) as value, count(case when exercise = :type2 then 1 end) as value2, COUNT(case when exercise = :type3 then 1 end) as value3, COUNT(case when exercise = :type4 then 1 end) as value4 from daily_register WHERE DATE(created) BETWEEN datetime('now', '-30 days') AND datetime('now')")
    fun loadExercisesDays(type1: String, type2: String, type3: String, type4: String): DailyRegisterExercisesStates

    @Query("SELECT count(case when exercise = :type1 then 1 end) as value, count(case when exercise = :type2 then 1 end) as value2, COUNT(case when exercise = :type3 then 1 end) as value3, COUNT(case when exercise = :type4 then 1 end) as value4  FROM daily_register WHERE DATE(created) BETWEEN datetime(:start) AND datetime(:end)")
    fun loadExercisesWeek(type1: String, type2: String, type3: String, type4: String,start: String, end: String): DailyRegisterExercisesStates


    @Query("SELECT count(case when emotional_state = :type1 then 1 end) as value, count(case when emotional_state = :type2 then 1 end) as value2, COUNT(case when emotional_state = :type3 then 1 end) as value3, COUNT(case when emotional_state = :type4 then 1 end) as value4 from daily_register WHERE DATE(created) BETWEEN datetime('now', '-30 days') AND datetime('now')")
    fun loadStatesDays(type1: String, type2: String, type3: String, type4: String): DailyRegisterExercisesStates

    @Query("SELECT count(case when emotional_state = :type1 then 1 end) as value, count(case when emotional_state = :type2 then 1 end) as value2, COUNT(case when emotional_state = :type3 then 1 end) as value3, COUNT(case when emotional_state = :type4 then 1 end) as value4  FROM daily_register WHERE DATE(created) BETWEEN datetime(:start) AND datetime(:end)")
    fun loadStatesWeek(type1: String, type2: String, type3: String, type4: String,start: String, end: String): DailyRegisterExercisesStates


    @Query("SELECT created as fecha FROM daily_register group by DATE(created) ORDER BY date(created) DESC")
    fun loadDates(): List<Date>

    @Query("SELECT count(id) FROM daily_register where online = 0")
    fun registersOffline(): Int

    @Query("DELETE FROM daily_register")
    fun deleteAllRegister()

    @Update()
    fun update(dailyRegister: DailyRegister)

    @Query("DELETE FROM daily_register WHERE id = :id")
    fun deleteRegister(id: Int)

}