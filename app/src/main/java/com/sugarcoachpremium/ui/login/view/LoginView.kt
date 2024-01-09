package com.sugarcoachpremium.ui.login.view

import com.sugarcoachpremium.ui.base.view.BaseView


interface LoginView : BaseView {

    fun onLogin()
    fun showValidationMessage(errorCode: Int)
    fun onEmailSign()
    fun onForgot()

    fun feedDatabase()

}