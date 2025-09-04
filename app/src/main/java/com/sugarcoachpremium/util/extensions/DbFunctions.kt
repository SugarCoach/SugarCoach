package com.sugarcoachpremium.util.extensions

import android.util.Log
import com.apollographql.apollo3.api.Optional
import com.sugarcoachpremium.CreateUserMutation
import com.sugarcoachpremium.DailyRegisterQuery
import com.sugarcoachpremium.TreatmentQuery
import com.sugarcoachpremium.data.api_db.DailyRegister.DailyRegisterResponse
import com.sugarcoachpremium.data.api_db.DailyRegister.domain.DailyRegisterComponent
import com.sugarcoachpremium.data.api_db.Treatment.TreatmentResponse
import com.sugarcoachpremium.data.api_db.user.UserResponse
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister
import com.sugarcoachpremium.data.database.repository.treament.Treament
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.type.DailyRegisterInput
import com.sugarcoachpremium.type.TreatmentInput
import com.sugarcoachpremium.type.UserDataInput
import java.text.NumberFormat

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
        correctora = this?.correctora?.toFloat(),
        correctora_unit = this?.correctora_unit?.toFloat(),
        hyperglucose = this?.hyperglucose?.toFloat(),
        hipoglucose = this?.hipoglucose?.toFloat(),
        carbono = this?.carbono?.toFloat(),
        basal_insuline = this?.basal_insuline,
        medidor = this?.medidor,
        bomba_infusora = this?.bomba_infusora,
        correctora_insuline = this?.correctora_insuline,
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
        emotionalState = this?.emotional_state,
        excersise = this?.excercise,
        date = this?.createdAt.toString(),
        category = this?.category.toString()
    )
}

fun DailyComponentTrans(name: String?, icon: String?): DailyRegisterComponent{
    return DailyRegisterComponent(
        name = name,
        icon = icon
    )
}
fun DailyRegister.toDailyInput(id: String?): DailyRegisterInput{
    Log.i("OnDBFunctions","El ejercicio es: $exercise")
    return DailyRegisterInput(
        glucose = Optional.present(glucose?.toDouble()),
        insulin = Optional.present(insulin?.toDouble()),
        carbohydrates = Optional.present(carbohydrates?.toDouble()),
        comment = Optional.present(comment),
        basal = Optional.present(basal?.toDouble()),
        colors = Optional.present(colors),
        category = Optional.present(category_id.toString()),
        excercise = Optional.present(exercise),
        emotional_state = Optional.present(emotionalState),
        users_permissions_user = Optional.present(id)
    )
}

fun Treament.toTreatmentInput(id: String, basalInsuline: String = "", correctoraInsuline: String = ""): TreatmentInput{
    return TreatmentInput(
        bomb = Optional.present(bomb),
        object_glucose = Optional.present(object_glucose.toDouble()),
        correctora_unit = Optional.present(correctora_unit.toDouble()),
        hyperglucose = Optional.present(hyperglucose.toDouble()),
        hipoglucose = Optional.present(hipoglucose.toDouble()),
        correctora = Optional.present(correctora.toDouble()),
        insulina_unit = Optional.present(insulina_unit.toDouble()),
        carbono = Optional.present(carbono.toDouble()),
        basal_insuline = Optional.present(basalInsuline),
        correctora_insuline = Optional.present(correctoraInsuline),
        users_permissions_user = Optional.present(id)
    )
}

fun User.toDataInput(id: String): UserDataInput{
     // SE IMPLEMENTO LA EXTRACCION DEL ENTERO DEL STRING PARA CARGARLO A LA DB YA QUE POR DEFECTO CARGABA SIEMPRE 0

    val iconInt = try{
        if (avatar != null && avatar!!.startsWith("avatar_")){
            val numberPart = avatar!!.substringAfter("avatar_") // extrae el numero luego de avatar_
            numberPart.toInt() // convierte el numero a entero.
        } else {
            Log.w("toDataInput","Formato de avatar no esperado o nulo: $avatar. Usando 0 por defecto para icon.")
            0
        }
    } catch (e: NumberFormatException){
        Log.e("toDataInput", "Error al convertir a numero la parte del avatar: $avatar. Usando 0 ´pr defecto para icon.", e)
        0
    }
    //

    return UserDataInput(
        name = Optional.present(name),
        birth_date = Optional.present(birthday.toString()),
        sex = Optional.present(sex),
        height = Optional.present(height?.toDouble()),
        weight = Optional.present(weight?.toDouble()),
        debut_date = Optional.present(debut.toString()),
        icon = Optional.present(iconInt),
        sugar_points = Optional.present(points),
        users_permissions_user = Optional.present(id)
    )
}