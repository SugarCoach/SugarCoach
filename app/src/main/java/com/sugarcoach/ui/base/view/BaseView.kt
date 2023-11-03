package com.sugarcoach.ui.base.view


interface BaseView {

    fun showProgress()

    fun hideProgress()

    fun showErrorToast(msg: String = "Intente Nuevamente")

}