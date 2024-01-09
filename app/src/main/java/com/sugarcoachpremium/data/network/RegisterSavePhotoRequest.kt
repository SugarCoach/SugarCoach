package com.sugarcoachpremium.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.File

class RegisterSavePhotoRequest {
    data class RegisterSavePhotoRequest internal constructor(
        @Expose
        @SerializedName("refId") internal val refId: String,
        @Expose
        @SerializedName("ref") internal val ref: String,
        @Expose
        @SerializedName("field") internal val field: String,
        @Expose
        @SerializedName("files") internal val files: File
    )


}

