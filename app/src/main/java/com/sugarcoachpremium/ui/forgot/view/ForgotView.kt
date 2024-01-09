package com.sugarcoachpremium.ui.forgot.view

import com.sugarcoachpremium.ui.base.view.BaseView


interface ForgotView : BaseView {

    fun onForgot()
    fun showValidationMessage(errorCode: Int)
}