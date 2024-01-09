package com.sugarcoachpremium.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RegisterSaveResponse(@Expose
                            @SerializedName("id")
                            var id: String? = null,

                            @Expose
                            @SerializedName("createdAt")
                            var createdAt: String? = null,

                            @Expose
                            @SerializedName("updatedAt")
                            var updatedAt: String? = null)


