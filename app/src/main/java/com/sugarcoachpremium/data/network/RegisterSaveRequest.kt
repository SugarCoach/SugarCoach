package com.sugarcoachpremium.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class RegisterSaveRequest {
    data class RegisterSaveRequest internal constructor(
        @Expose
        @SerializedName("glucose") internal val glucose: Float?,
        @Expose
        @SerializedName("insulin") internal val insulin: Float?,
        @Expose
        @SerializedName("carbohydrates") internal val carbohydrates: Float?,
        @Expose
        @SerializedName("emotional_state") internal val emotional_state: String?,
        @Expose
        @SerializedName("exercise") internal val exercise: String?,
        @Expose
        @SerializedName("category_id") internal val label: Int?,
        @Expose
        @SerializedName("basal") internal val basal: Float?,
        @Expose
        @SerializedName("colors") internal val colors: String?,
        @Expose
        @SerializedName("user") internal val user: String?
    )

}

