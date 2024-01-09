package com.sugarcoachpremium.data.database.repository.treament

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

@Entity(tableName = "medidor")
data class Medidor (
    @PrimaryKey(autoGenerate = true) var mid: Int,
    @Expose
    @ColumnInfo(name = "name") var name:String
)
