package com.sugarcoach.util.extensions

import com.sugarcoach.CreateUserMutation
import com.sugarcoach.TreatmentQuery
import com.sugarcoach.data.api_db.Treatment.TreatmentResponse
import com.sugarcoach.data.api_db.user.UserResponse

fun CreateUserMutation.Attributes?.toUser(): UserResponse {
    return UserResponse(
        username = this?.username!!,
        email = this.email!!
    )
}

fun TreatmentQuery.Attributes?.toTreatment(): TreatmentResponse {
    return TreatmentResponse(
        bomb = this!!.bomb!!,
        insuline_unit = insulina_unit!!.toFloat(),
        object_glucose = object_glucose!!.toFloat(),
        correctora = correctora!!.toFloat(),
        correctora_unit = correctora_unit!!.toFloat(),
        hyperglucose = hyperglucose!!.toFloat(),
        hipoglucose = hipoglucose!!.toFloat(),
        carbono = carbono!!.toFloat(),
        basal_insuline = basal_insuline,
        medidor = medidor,
        bomba_infusora = bomba_infusora,
        correctora_insuline = correctora_insuline
    )
}

