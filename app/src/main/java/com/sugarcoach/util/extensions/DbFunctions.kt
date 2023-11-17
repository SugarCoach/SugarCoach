package com.sugarcoach.util.extensions

import android.util.Log
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
import com.sugarcoach.data.database.repository.dailyregister.States
import com.sugarcoach.data.database.repository.treament.Treament
import com.sugarcoach.type.ComponentDailyRegisterDailyRegisterComponentInput
import com.sugarcoach.type.DailyRegisterInput
import com.sugarcoach.type.Treatment
import com.sugarcoach.type.TreatmentInput

fun CreateUserMutation.Attributes?.toUser(id: String): UserResponse {
    return UserResponse(
        username = this?.username!!,
        email = this.email,
        id = id
    )
}

fun TreatmentQuery.Attributes?.toTreatment(id: String): TreatmentResponse {
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
        correctora_insuline = this.correctora_insuline,
        id = id
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
fun DailyRegister.toDailyInput(id: String?): DailyRegisterInput{
    Log.i("OnDBFunctions","El id del usuario es: $id")
    return DailyRegisterInput(
        glucose = Optional.present(glucose?.toDouble()),
        insulin = Optional.present(insulin?.toDouble()),
        carbohydrates = Optional.present(carbohydrates?.toDouble()),
        comment = Optional.present(comment),
        basal = Optional.present(basal?.toDouble()),
        colors = Optional.present(colors),
        users_permissions_user = Optional.present(id)
    )
}
fun States.toDailyEmotions(): ComponentDailyRegisterDailyRegisterComponentInput{
    return ComponentDailyRegisterDailyRegisterComponentInput(
        id = Optional.present(state_id),
        name = Optional.present(state_name),
        icon = Optional.present(state_icono)
    )
}

fun Treament.toTreatmentInput(id: String): TreatmentInput{
    return TreatmentInput(
        bomb = Optional.present(bomb),
        object_glucose = Optional.present(object_glucose.toDouble()),
        correctora_unit = Optional.present(correctora_unit.toDouble()),
        hyperglucose = Optional.present(hyperglucose.toDouble()),
        hipoglucose = Optional.present(hipoglucose.toDouble()),
        users_permissions_user = Optional.present(id)
    )
}
