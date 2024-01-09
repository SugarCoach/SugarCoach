package com.sugarcoachpremium.ui.onboarding.view

import com.sugarcoachpremium.ui.base.view.BaseView


interface OnBoardingView : BaseView {

    fun openLoginActivity()

    fun setData(itemList: ArrayList<BoardingItem>)
    fun verifyLogin()

    fun startMain()
}