package com.sugarcoach.ui.forgot.view

import com.sugarcoach.ui.base.view.BaseView


interface ForgotView : BaseView {

    fun onForgot()
    fun showValidationMessage(errorCode: Int)
}