package com.sugarcoachpremium.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RegistersResponse(@Expose
                             @SerializedName("glucose") internal val glucose: Float? = null,
                             @Expose
                             @SerializedName("insulin") internal val insulin: Float? = null,
                             @Expose
                             @SerializedName("carbohydrates") internal val carbohydrates: Float? = null,
                             @Expose
                             @SerializedName("emotional_state") internal val emotional_state: String? = null,
                             @Expose
                             @SerializedName("exercise") internal val exercise: String? = null,
                             @Expose
                             @SerializedName("label") internal val label: String? = null,
                             @Expose
                             @SerializedName("user") var user: UserResponse? = null,
                             @Expose
                             @SerializedName("createdAt") var createdAt: String? = null,
                             @Expose
                             @SerializedName("updatedAt") var updatedAt: String? = null,
                             @Expose
                             @SerializedName("photo") var photo: RegisterPhotoResponse? = null,
                             @Expose
                             @SerializedName("_id") var id: String? = null
)
