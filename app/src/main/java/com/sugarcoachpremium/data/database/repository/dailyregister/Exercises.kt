package com.sugarcoachpremium.data.database.repository.dailyregister

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

@Entity(tableName = "exercises")
data class Exercises(
    @PrimaryKey
    @Expose
    @ColumnInfo(name = "exercise_id")
    var exercise_id: String,

    @Expose
    @ColumnInfo(name = "exercise_name") var exercise_name:String,
    @Expose
    @ColumnInfo(name = "exercise_icono") var exercise_icono:String
)
