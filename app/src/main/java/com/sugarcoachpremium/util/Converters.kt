package com.sugarcoachpremium.util

import androidx.room.TypeConverter
import java.text.SimpleDateFormat
import java.util.*

class Converters {
    private val formatter =  SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())

    @TypeConverter
    fun toOffsetDateTime(value: String?): Date? {
        return value?.let {
            return formatter.parse(value)
        }
    }

    @TypeConverter
    fun fromOffsetDateTime(date: Date?): String? {
        return date?.let {
            return formatter.format(date)
        }

    }

}


