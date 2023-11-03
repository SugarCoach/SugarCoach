package com.sugarcoach.ui.signEmail.view

import com.google.firebase.auth.FirebaseUser
import com.sugarcoach.ui.base.view.BaseView


interface SignEmailView : BaseView {

    fun onSign()
    fun showValidationMessage(errorCode: Int)
    fun startMain()
}