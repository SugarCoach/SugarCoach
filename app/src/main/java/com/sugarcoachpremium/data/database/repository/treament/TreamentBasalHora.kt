package com.sugarcoachpremium.data.database.repository.treament

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

@Entity(tableName = "treament_basal_hora", foreignKeys = [(ForeignKey(
    entity = Treament::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("treatment_id"),
    onDelete = ForeignKey.SET_NULL
))])
data class TreamentBasalHora(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @Expose
    @ColumnInfo(name = "time", index = true) var time:String,
    @Expose
    @ColumnInfo(name = "treatment_id" , index = true) var treatment_id: Int?,
    @Expose
    @ColumnInfo(name = "units") var units:Float

)
