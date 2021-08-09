package com.sugarcoach.data.database.repository.dailyregister

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.jetbrains.annotations.NotNull
import java.util.*

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
