package com.sugarcoachpremium.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class LoginRequest {
    data class ServerLoginRequest internal constructor(
        @Expose
        @SerializedName("identifier") internal val email: String,
        @Expose
        @SerializedName("password") internal val pass: String
    )

    data class FacebookLoginRequest internal constructor(
        @Expose
        @SerializedName("fb_access_token") internal val token: String
    )

    data class GoogleLoginRequest internal constructor(
        @Expose
        @SerializedName("google_id_token") internal val token: String
    )
}





