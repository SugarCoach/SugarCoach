package com.sugarcoach.data.ui.base.interactor

interface Interactor {

    fun isUserLogged(): Boolean

    fun perfomLogout()

    fun getCurrentId(): String?

    fun setUserId(id: String)
}