package com.sugarcoachpremium.data.database.repository.treament

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.sugarcoachpremium.data.database.repository.dailyregister.Category

@Entity(tableName = "treamentHorarios", foreignKeys = [(ForeignKey(
    entity = Treament::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("treatment_id"),
    onDelete = ForeignKey.SET_NULL
)), (ForeignKey(
    entity = Category::class,
    parentColumns = arrayOf("cate_id"),
    childColumns = arrayOf("category_id"),
    onDelete = ForeignKey.SET_NULL
))])
data class TreamentHorarios(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @Expose
    @ColumnInfo(name = "category_id", index = true) var category_id:Int,
    @Expose
    @ColumnInfo(name = "selected") var selected: Boolean,
    @Expose
    @ColumnInfo(name = "treatment_id" , index = true) var treatment_id: Int?,
    @Expose
    @ColumnInfo(name = "units") var units:Float

)
