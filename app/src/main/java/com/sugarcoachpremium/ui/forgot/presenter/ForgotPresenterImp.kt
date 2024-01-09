package com.sugarcoachpremium.ui.forgot.presenter

import com.sugarcoachpremium.ui.base.presenter.Presenter
import com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractorImp
import com.sugarcoachpremium.ui.forgot.view.ForgotView


interface ForgotPresenterImp<V : ForgotView, I : ForgotInteractorImp> : Presenter<V, I>{
    fun onForgot(email: String)
}