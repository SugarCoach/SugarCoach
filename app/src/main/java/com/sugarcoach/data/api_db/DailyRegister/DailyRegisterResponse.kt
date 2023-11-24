package com.sugarcoach.data.api_db.DailyRegister

import com.sugarcoach.data.api_db.DailyRegister.domain.DailyRegisterComponent

data class DailyRegisterResponse(
    var glucose: Double?,
    var insulin: Double?,
    var carbohydrates: Double?,
    var comment: String?,
    var basal: Double?,
    var colors: String?,
    var emotionalState: String?,
    var excersise: String?,
    var category: String?
)
