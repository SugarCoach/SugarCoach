package com.sugarcoach.ui.sign.presenter

import android.content.Context
import android.content.Intent
import com.sugarcoach.ui.base.presenter.Presenter
import com.sugarcoach.ui.sign.interactor.SignInteractorImp
import com.sugarcoach.ui.sign.view.SignActivity
import com.sugarcoach.ui.sign.view.SignView


interface SignPresenterImp<V : SignView, I : SignInteractorImp> : Presenter<V, I>{
    fun googleLogin(client: String)
    fun facebookLogin(context: Context)
    fun emailSign()
    fun activityResult(requestCode: Int, resultCode: Int, data: Intent?)

}