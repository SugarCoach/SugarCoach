package com.sugarcoachpremium.data.ui.base.interactor

import com.sugarcoachpremium.data.database.repository.user.UserRepo
import com.sugarcoachpremium.data.network.ApiHelper
import com.sugarcoachpremium.di.preferences.PreferenceHelper

open class BaseInteractor(): Interactor{

    protected lateinit var apiHelper: ApiHelper

    protected lateinit var preferenceHelper: PreferenceHelper

    protected lateinit var userHelper: UserRepo

    constructor(userHelper: UserRepo, preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : this() {
        this.preferenceHelper = preferenceHelper
        this.apiHelper = apiHelper
        this.userHelper = userHelper
    }


    override fun isUserLogged() = this.preferenceHelper.isUserLoged() ?: false


    override fun perfomLogout() {
        preferenceHelper.let {
            it.setCurrentUserId(null)
            it.setAccessToken(null)
            it.setUserLoged(false)
        }
    }

    override fun getCurrentId(): String? {
        return preferenceHelper.getCurrentUserId()
    }

    override fun setUserId(id: String){
        preferenceHelper.setCurrentUserId(id)
    }
}