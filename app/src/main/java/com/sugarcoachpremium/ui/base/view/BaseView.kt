package com.sugarcoachpremium.ui.base.view


interface BaseView {

    fun showProgress()

    fun hideProgress()

    fun showErrorToast(msg: String = "Intente nuevamente")

}