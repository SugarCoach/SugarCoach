package com.sugarcoach.data.api_db.Treatment

import com.sugarcoach.TreatmentQuery

data class TreatmentResponse(
    var bomb: Boolean?,
    var insuline_unit: Float?,
    var object_glucose:  Float?,
    var correctora: Float?,
    var correctora_unit: Float?,
    var hyperglucose: Float?,
    var hipoglucose: Float?,
    var carbono: Float?,
    var basal_insuline: String?,
    var medidor: String?,
    var bomba_infusora: String?,
    var correctora_insuline: String?,
    var id:  String)
