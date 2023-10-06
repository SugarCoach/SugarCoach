package com.sugarcoach.ui.onboarding.view

import com.sugarcoach.ui.base.view.BaseView


interface OnBoardingView : BaseView {

    fun openLoginActivity()

    fun setData(itemList: ArrayList<BoardingItem>)
}