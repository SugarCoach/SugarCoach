package com.sugarcoach.util.extensions

import com.apollographql.apollo3.api.Optional
import com.apollographql.apollo3.api.create
import com.sugarcoach.CreateUserMutation
import com.sugarcoach.DailyRegisterQuery
import com.sugarcoach.TreatmentQuery
import com.sugarcoach.data.api_db.DailyRegister.DailyRegisterResponse
import com.sugarcoach.data.api_db.DailyRegister.domain.DailyRegisterComponent
import com.sugarcoach.data.api_db.Treatment.TreatmentResponse
import com.sugarcoach.data.api_db.user.UserResponse
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.type.DailyRegisterInput

fun CreateUserMutation.Attributes?.toUser(): UserResponse {
    return UserResponse(
        username = this?.username!!,
        email = this.email!!
    )
}

fun TreatmentQuery.Attributes?.toTreatment(): TreatmentResponse {
    return TreatmentResponse(
        bomb = this?.bomb,
        insuline_unit = this?.insulina_unit?.toFloat(),
        object_glucose = this?.object_glucose?.toFloat(),
        correctora = this?.correctora!!.toFloat(),
        correctora_unit = correctora_unit?.toFloat(),
        hyperglucose = hyperglucose?.toFloat(),
        hipoglucose = hipoglucose?.toFloat(),
        carbono = carbono?.toFloat(),
        basal_insuline = basal_insuline,
        medidor = this.medidor,
        bomba_infusora = this.bomba_infusora,
        correctora_insuline = this.correctora_insuline
    )
}

fun DailyRegisterQuery.Attributes?.toDailyRegister(): DailyRegisterResponse {
    return DailyRegisterResponse(
        glucose = this?.glucose,
        insulin = this?.insulin,
        carbohydrates = this?.carbohydrates,
        comment = this?.comment,
        basal = this?.basal,
        colors = this?.colors,
        dataS = this?.dataS?.toString(),
        created = this?.created?.toString(),
        category = this?.category,
        emotionalState = this?.emotional_state?.toDailyComponent(),
        excersise = this?.excercise?.toDailyComponent()
    )
}
fun DailyRegisterQuery.Emotional_state?.toDailyComponent(): DailyRegisterComponent{
    return DailyComponentTrans(this?.name, this?.icon?.data?.attributes?.url)
}

fun DailyRegisterQuery.Excercise?.toDailyComponent(): DailyRegisterComponent{
    return DailyComponentTrans(this?.name, this?.icon?.data?.attributes?.url)
}

fun DailyComponentTrans(name: String?, icon: String?): DailyRegisterComponent{
    return DailyRegisterComponent(
        name = name,
        icon = icon
    )
}
fun DailyRegister.toDailyInput(): DailyRegisterInput{
    return DailyRegisterInput(
        glucose = Optional.present(glucose?.toDouble()),

    )
}
