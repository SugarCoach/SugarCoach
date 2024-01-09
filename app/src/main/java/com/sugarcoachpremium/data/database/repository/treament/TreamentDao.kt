package com.sugarcoachpremium.data.database.repository.treament

import androidx.room.*
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterInsuline

@Dao
interface TreamentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(treament: Treament)

    @Query("SELECT * FROM treament ORDER BY created")
    fun loadAll(): List<Treament>

    @Query("SELECT *  FROM treament left join basal_insuline on treament.basal_id = basal_insuline.bid left join correctora_insuline on treament.correctora_id = correctora_insuline.cid  WHERE treament.id = :id")
    fun loadById(id: Int): TreatmentBasalCorrectora


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCategory(horarios: List<TreamentHorarios>)

    @Query("SELECT * FROM treamentHorarios inner join category on treamentHorarios.category_id = category.cate_id ORDER BY id")
    fun loadAllCategory(): List<TreatmentHorariosCategory>

    @Query("SELECT * FROM treamentHorarios WHERE category_id = :id")
    fun loadTreatmentByCategory(id: Int): TreamentHorarios


    @Query("SELECT avg(case when category_id = :breakfast_id then units end) as breakfast, avg(case when category_id = :snack_id then units end) as snack, avg(case when category_id = :lunch_id then units end) as lunch, avg(case when category_id = :dinner_id then units end) as dinner FROM TreamentHorarios")
    fun loadInsuline(breakfast_id: Int, snack_id: Int, lunch_id: Int, dinner_id: Int): DailyRegisterInsuline

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBasalHora(horas: List<TreamentBasalHora>)

    @Query("SELECT * FROM treament_basal_hora ORDER BY id")
    fun loadAllBasalHora(): List<TreamentBasalHora>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCategoryCorrectora(horarios: List<TreamentCorrectoraHorarios>)

    @Query("SELECT * FROM treamentCorrectoraHorarios inner join category on treamentCorrectoraHorarios.category_id = category.cate_id ORDER BY id")
    fun loadAllCategoryCorrectora(): List<TreatmentHCorrectoraCategory>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBasal(basal: List<BasalInsuline>)

    @Query("SELECT * FROM basal_insuline ORDER BY bid")
    fun loadAllBasal(): List<BasalInsuline>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMedidor(medidor: List<Medidor>)

    @Query("SELECT * FROM medidor ORDER BY mid")
    fun loadAllMedidor(): List<Medidor>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBombas(bombas: List<BombaInfusora>)

    @Query("SELECT * FROM bomba_infusora ORDER BY boid")
    fun loadAllBombas(): List<BombaInfusora>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCorrectora(correctora: List<CorrectoraInsuline>)

    @Query("SELECT * FROM correctora_insuline ORDER BY cid")
    fun loadAllCorrectora(): List<CorrectoraInsuline>

    @Query("SELECT sum(units) as total FROM treamentHorarios")
    fun loadAverage(): TreatmentAverage

    @Query("DELETE FROM treamentCorrectoraHorarios")
    fun deleteAllCategoryCorrectora()

    @Query("DELETE FROM treamentHorarios")
    fun deleteAllCategory()

    @Query("DELETE FROM treament")
    fun deleteAllTreatment()

    @Query("DELETE FROM treament_basal_hora")
    fun deleteAllTreatmentBasalHora()

    @Update
    fun editTreatment(treament: Treament)


    @Update
    fun editBasalCategory(horarios: TreamentHorarios)

    @Update
    fun editBasalHora(hora: TreamentBasalHora)

    @Update
    fun editCorrectoraCategory(horarios: TreamentCorrectoraHorarios)

}

