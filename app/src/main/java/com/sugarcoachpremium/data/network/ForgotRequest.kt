package com.sugarcoachpremium.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ForgotRequest {
    data class ServerForgotRequest internal constructor(
        @Expose
        @SerializedName("identifier") internal val email: String
    )
}





