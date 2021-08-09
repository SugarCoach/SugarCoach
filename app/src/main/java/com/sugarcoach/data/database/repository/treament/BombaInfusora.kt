package com.sugarcoach.data.database.repository.treament

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import java.util.*

@Entity(tableName = "bomba_infusora")
data class BombaInfusora (
    @PrimaryKey(autoGenerate = true) var boid: Int,
    @Expose
    @ColumnInfo(name = "name") var name:String
)
