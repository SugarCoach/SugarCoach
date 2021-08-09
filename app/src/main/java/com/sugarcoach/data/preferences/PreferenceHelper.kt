package com.sugarcoach.di.preferences


interface PreferenceHelper {


    fun isUserLoged(): Boolean?

    fun setUserLoged(loged: Boolean?)

    fun getCurrentUserId(): String?

    fun setCurrentUserId(userId: String?)

    fun getAccessToken(): String?

    fun setAccessToken(accessToken: String?)

}