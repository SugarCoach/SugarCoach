package com.sugarcoach.ui.login.view

import com.sugarcoach.ui.base.view.BaseView


interface LoginView : BaseView {

    fun onLogin()
    fun showValidationMessage(errorCode: Int)
    fun onEmailSign()
    fun onForgot()

    fun feedDatabase()

}