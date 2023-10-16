package com.sugarcoach.data.network

import com.sugarcoach.BuildConfig


object ApiEndPoint {

    const val ENDPOINT_GOOGLE_LOGIN = BuildConfig.BASE_URL + "/588d14f4100000a9072d2943"
    const val ENDPOINT_FACEBOOK_LOGIN = BuildConfig.BASE_URL + "/588d15d3100000ae072d2944"
    const val ENDPOINT_SERVER_LOGIN = BuildConfig.BASE_URL + "/auth/local"
    const val ENDPOINT_SERVER_SIGN = BuildConfig.BASE_URL + "/auth/local/register"
    /* COMO ESTABA:*/
    //const val ENDPOINT_SERVER_REGISTERS = "BuildConfig.BASE_URL + "/dailyregisters"

    const val ENDPOINT_SERVER_REGISTERS = "/dailyregisters"
    const val ENDPOINT_SERVER_REGISTER = BuildConfig.BASE_URL + "/dailyregisters/{id}"
    const val ENDPOINT_SERVER_REGISTERS_PHOTO = BuildConfig.BASE_URL + "/upload"
    val ENDPOINT_LOGOUT = BuildConfig.BASE_URL + "/588d161c100000a9072d2946"
    val ENDPOINT_BLOG = BuildConfig.BASE_URL + "/5926ce9d11000096006ccb30"
    val ENDPOINT_OPEN_SOURCE = BuildConfig.BASE_URL + "/5926c34212000035026871cd"

}