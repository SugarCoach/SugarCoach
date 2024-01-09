package com.sugarcoachpremium.data.preferences

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import com.sugarcoachpremium.di.PreferenceInfo
import com.sugarcoachpremium.di.preferences.PreferenceHelper
import javax.inject.Inject

class AppPreferenceHelper @Inject constructor(context: Context, @PreferenceInfo private val prefFileName: String) :
    PreferenceHelper {

    companion object {
        private val PREF_KEY_USER_LOGGED = "PREF_KEY_USER_LOGGED"
        private val PREF_KEY_CURRENT_USER_ID = "PREF_KEY_CURRENT_USER_ID"
        private val PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN"
    }

    private val mPrefs: SharedPreferences = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE)

    override fun isUserLoged() = mPrefs.getBoolean(PREF_KEY_USER_LOGGED, false)

    override fun getAccessToken(): String? = mPrefs.getString(PREF_KEY_ACCESS_TOKEN, "")

    override fun setAccessToken(accessToken: String?) = mPrefs.edit { putString(PREF_KEY_ACCESS_TOKEN, accessToken) }

    override fun getCurrentUserId(): String? = mPrefs.getString(PREF_KEY_CURRENT_USER_ID, "")

    override fun setCurrentUserId(userId: String?) {
        mPrefs.edit { putString(PREF_KEY_CURRENT_USER_ID, userId) }
    }

    override fun setUserLoged(loged: Boolean?) {
        val isLoged = loged ?: false
        mPrefs.edit { putBoolean(PREF_KEY_USER_LOGGED, isLoged) }
    }


}