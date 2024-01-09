package com.sugarcoachpremium.ui.splash.view

import com.sugarcoachpremium.ui.base.view.BaseView


interface SplashView : BaseView {

    fun showSuccessToast()
    fun openMainActivity()
    fun openBoardingActivity()
}