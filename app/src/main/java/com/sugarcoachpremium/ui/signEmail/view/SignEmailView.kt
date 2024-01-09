package com.sugarcoachpremium.ui.signEmail.view

import com.sugarcoachpremium.ui.base.view.BaseView


interface SignEmailView : BaseView {

    fun onSign()
    fun showValidationMessage(errorCode: Int)
    fun startMain()

}