package com.sugarcoachpremium.data.database.repository.treament

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "treament", foreignKeys = [(ForeignKey(entity = BasalInsuline::class,
    parentColumns = arrayOf("bid"),
    childColumns = arrayOf("basal_insuline"),
    onDelete = ForeignKey.SET_NULL)),
    (ForeignKey(entity = Medidor::class,
        parentColumns = arrayOf("mid"),
        childColumns = arrayOf("medidor"),
        onDelete = ForeignKey.SET_NULL)),
    (ForeignKey(entity = BombaInfusora::class,
        parentColumns = arrayOf("boid"),
        childColumns = arrayOf("bomba_infusora"),
        onDelete = ForeignKey.SET_NULL)),
    (ForeignKey(entity = CorrectoraInsuline::class,
    parentColumns = arrayOf("cid"),
    childColumns = arrayOf("correctora_insuline"),
    onDelete = ForeignKey.SET_NULL))])
data class Treament (
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "bomb") var bomb: Boolean?,
    @ColumnInfo(name = "object_glucose") var object_glucose:Float, //Objetivo de glucosa
    @ColumnInfo(name = "correctora_unit") var correctora_unit:Float, //Cuantas unidades de correción por glusemia alta
    @ColumnInfo(name = "hipoglucose") var hipoglucose:Float,
    @ColumnInfo(name = "hyperglucose") var hyperglucose:Float,
    @ColumnInfo(name = "basal_insuline" , index = true) var basal_insuline:Int?,
    @ColumnInfo(name = "medidor" , index = true) var medidor:Int?,
    @ColumnInfo(name = "bomba_infusora" , index = true) var bomba_infusora:Int?,
    @ColumnInfo(name = "correctora_insuline", index = true) var correctora_insuline:Int?,
    @ColumnInfo(name = "correctora") var correctora:Float, //Cada cuanto g/ml de glusemia por encima del objetivo hay que corregir
    @ColumnInfo(name = "insulina_unit") var insulina_unit:Float, //Unidad de correción por carbs
    @ColumnInfo(name = "carbono") var carbono:Float, //Cada cuantos g de carbs hay que corregir
    @ColumnInfo(name = "created") var created: Date
)
