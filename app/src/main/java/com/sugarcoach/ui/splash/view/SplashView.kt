package com.sugarcoach.ui.splash.view

import com.sugarcoach.ui.base.view.BaseView


interface SplashView : BaseView {

    fun showSuccessToast()
    fun openMainActivity()
    fun openBoardingActivity()
}