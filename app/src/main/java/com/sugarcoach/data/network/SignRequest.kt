package com.sugarcoach.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SignRequest {
    data class ServerSignRequest internal constructor(
        @Expose
        @SerializedName("username") internal val username: String,
        @Expose
        @SerializedName("email") internal val email: String,
        @Expose
        @SerializedName("password") internal val pass: String
    )

}





