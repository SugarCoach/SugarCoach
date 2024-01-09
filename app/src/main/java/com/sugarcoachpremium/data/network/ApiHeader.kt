package com.sugarcoachpremium.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import javax.inject.Inject

class ApiHeader @Inject constructor(internal val protectedApiHeader: ProtectedApiHeader) {


    class ProtectedApiHeader @Inject constructor(@Expose
                                                 @SerializedName("access_token") val accessToken: String?)

}