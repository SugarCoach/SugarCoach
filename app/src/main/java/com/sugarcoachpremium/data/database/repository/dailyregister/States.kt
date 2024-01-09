package com.sugarcoachpremium.data.database.repository.dailyregister

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

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
