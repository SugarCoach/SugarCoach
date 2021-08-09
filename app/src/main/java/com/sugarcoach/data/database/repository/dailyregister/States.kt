package com.sugarcoach.data.database.repository.dailyregister

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import org.jetbrains.annotations.NotNull
import java.util.*

@Entity(tableName = "states")
data class States(
    @PrimaryKey
    @Expose
    @ColumnInfo(name = "state_id")
    var state_id: String,
    @Expose
    @ColumnInfo(name = "state_name") var state_name:String,
    @Expose
    @ColumnInfo(name = "state_icono") var state_icono:String
)
