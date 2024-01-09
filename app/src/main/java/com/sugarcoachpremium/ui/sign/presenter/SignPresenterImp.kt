package com.sugarcoachpremium.ui.sign.presenter

import android.content.Context
import android.content.Intent
import com.sugarcoachpremium.ui.base.presenter.Presenter
import com.sugarcoachpremium.ui.sign.interactor.SignInteractorImp
import com.sugarcoachpremium.ui.sign.view.SignView


interface SignPresenterImp<V : SignView, I : SignInteractorImp> : Presenter<V, I>{
    fun googleLogin(client: String)
    fun facebookLogin(context: Context)
    fun emailSign()
    fun activityResult(requestCode: Int, resultCode: Int, data: Intent?)

}