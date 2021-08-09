package com.sugarcoach.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RegisterPhotoResponse(@Expose
                                 @SerializedName("_id")
                                 var id: String? = null,
                                 @Expose
                                var url: String? = null)
