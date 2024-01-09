package com.sugarcoachpremium.data.database.repository.treament

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

@Entity(tableName = "basal_insuline")
data class BasalInsuline (
    @PrimaryKey(autoGenerate = true) var bid: Int,
    @Expose
    @ColumnInfo(name = "name") var name:String
)
