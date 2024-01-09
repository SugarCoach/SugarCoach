package com.sugarcoachpremium.data.database.repository.dailyregister

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

@Entity(tableName = "category")
data class Category(
    @PrimaryKey(autoGenerate = true) var cate_id: Int,
    @Expose
    @ColumnInfo(name = "cate_name") var cate_name:String
)
