package com.sugarcoach.ui.login.presenter

import android.content.Intent
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.network.RegistersResponse
import com.sugarcoach.ui.base.presenter.Presenter
import com.sugarcoach.ui.login.interactor.LoginInteractorImp
import com.sugarcoach.ui.login.view.LoginView
import io.reactivex.Observable


interface LoginPresenterImp<V : LoginView, I : LoginInteractorImp> : Presenter<V, I>{
    fun onLogin(email: String, password: String, mirror: Boolean, medico: Boolean)
    fun emailSign()
    fun forgot()
    fun activityResult(requestCode: Int, resultCode: Int, data: Intent?)
    fun getBarcode():Int


}