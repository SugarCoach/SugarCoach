package com.sugarcoach.data.database.repository.dailyregister

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import io.reactivex.annotations.Nullable
import java.util.*

@Entity(tableName = "daily_register", foreignKeys = [(ForeignKey(
    entity = Category::class,
    parentColumns = arrayOf("cate_id"),
    childColumns = arrayOf("category_id"),
    onDelete = ForeignKey.SET_NULL
))
    ,(ForeignKey(
    entity = States::class,
    parentColumns = arrayOf("state_id"),
    childColumns = arrayOf("emotional_state"),
    onDelete = ForeignKey.SET_NULL
)),
    (ForeignKey(
        entity = Exercises::class,
        parentColumns = arrayOf("exercise_id"),
        childColumns = arrayOf("exercise"),
        onDelete = ForeignKey.SET_NULL
    ))
])
data class DailyRegister(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "idOnline") var idOnline: String?,
    @ColumnInfo(name = "glucose") var glucose: Float?,
    @ColumnInfo(name = "insulin") var insulin: Float?,
    @ColumnInfo(name = "carbohydrates") var carbohydrates: Float?,
    @ColumnInfo(name = "emotional_state", index = true) var emotionalState: String?,
    @ColumnInfo(name = "exercise", index = true) var exercise: String?,
    @ColumnInfo(name = "category_id", index = true) var category_id: Int,
    @ColumnInfo(name = "comment") var comment: String?,
    @ColumnInfo(name = "photo") var photo: String?,
    @ColumnInfo(name = "online") var online: Boolean?,
    @ColumnInfo(name = "created") var created: Date,
    @ColumnInfo(name = "dateS") var dateS: String,
    @ColumnInfo(name = "basal") var basal: Float?,
    @ColumnInfo(name = "colors") var colors: String
)