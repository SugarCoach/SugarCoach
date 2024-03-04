package com.sugarcoachpremium.data.api_db.DailyRegister

data class DailyRegisterResponse(
    var glucose: Double?,
    var insulin: Double?,
    var carbohydrates: Double?,
    var comment: String?,
    var basal: Double?,
    var colors: String?,
    var emotionalState: String?,
    var excersise: String?,

)
