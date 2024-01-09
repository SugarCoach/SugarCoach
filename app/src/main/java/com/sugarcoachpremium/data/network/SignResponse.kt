package com.sugarcoachpremium.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SignResponse(@Expose
                         var user: UserResponse? = null,
                        @Expose
                         @SerializedName("jwt")
                         var accessToken: String? = null,

                        @Expose
                         @SerializedName("message")
                         var message: String? = null)




