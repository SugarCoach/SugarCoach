package com.sugarcoachpremium.data.database.repository.dailyregister

import androidx.room.Embedded

data class DailyRegisterCategory(
    @Embedded
    var dailyRegister: DailyRegister? = null,
    @Embedded
    var category: Category? = null
)