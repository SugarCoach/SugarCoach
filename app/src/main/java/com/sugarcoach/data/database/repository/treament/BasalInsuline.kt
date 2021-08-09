package com.sugarcoach.data.database.repository.treament

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import java.util.*

@Entity(tableName = "basal_insuline")
data class BasalInsuline (
    @PrimaryKey(autoGenerate = true) var bid: Int,
    @Expose
    @ColumnInfo(name = "name") var name:String
)
