package com.sugarcoachpremium.data.api_db.DailyRegister

import java.io.Serializable

data class DailyRegisterResponse(
    var glucose: Double?,
    var insulin: Double?,
    var carbohydrates: Double?,
    var comment: String?,
    var basal: Double?,
    var colors: String?,
    var emotionalState: String?,
    var excersise: String?,
    var date: String,
    var category: String
): Serializable
