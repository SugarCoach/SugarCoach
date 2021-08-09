package com.sugarcoach.ui.forgot.presenter

import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.network.RegistersResponse
import com.sugarcoach.ui.base.presenter.Presenter
import com.sugarcoach.ui.forgot.interactor.ForgotInteractorImp
import com.sugarcoach.ui.forgot.view.ForgotView
import com.sugarcoach.ui.login.interactor.LoginInteractorImp
import com.sugarcoach.ui.login.view.LoginView
import io.reactivex.Observable


interface ForgotPresenterImp<V : ForgotView, I : ForgotInteractorImp> : Presenter<V, I>{
    fun onForgot(email: String)
}