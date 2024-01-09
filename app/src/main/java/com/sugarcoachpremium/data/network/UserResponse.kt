package com.sugarcoachpremium.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserResponse(@Expose
                         var confirmed: Boolean? = null,

                        @SerializedName("_id")
                        @Expose
                         var id: String? = null,

                        @Expose
                         var username: String? = null,

                        @Expose
                         var blocked: Boolean? = null,

                        @Expose
                         var email: String? = null,

                        @Expose
                         var provider: String? = null
)



