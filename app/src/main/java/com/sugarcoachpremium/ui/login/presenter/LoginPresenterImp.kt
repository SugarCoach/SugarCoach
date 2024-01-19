package com.sugarcoachpremium.ui.login.presenter

import android.content.Intent
import com.sugarcoachpremium.ui.base.presenter.Presenter
import com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp
import com.sugarcoachpremium.ui.login.view.LoginView


interface LoginPresenterImp<V : LoginView, I : LoginInteractorImp> : Presenter<V, I>{
    fun onLogin(email: String, password: String, mirror: Boolean, medico: Boolean)
    fun emailSign()
    fun forgot()
    suspend fun activityResult(requestCode: Int, resultCode: Int, data: Intent?)
    fun getBarcode():Int

    fun feedInDatabase()

}