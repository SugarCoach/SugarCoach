package com.sugarcoach.data.database.repository.treament

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import java.util.*

@Entity(tableName = "correctora_insuline")
data class CorrectoraInsuline (
    @PrimaryKey(autoGenerate = true) var cid: Int,
    @Expose
    @ColumnInfo(name = "cname") var cname:String //Nombre del tipo de insulina correctora o rápida
)
