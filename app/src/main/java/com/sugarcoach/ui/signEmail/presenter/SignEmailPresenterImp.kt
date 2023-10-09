package com.sugarcoach.ui.signEmail.presenter

import android.content.Intent
import com.facebook.CallbackManager
import com.sugarcoach.databinding.ActivitySignEmailBinding
import com.sugarcoach.ui.base.presenter.Presenter
import com.sugarcoach.ui.signEmail.interactor.SignEmailInteractorImp
import com.sugarcoach.ui.signEmail.view.SignEmailView


interface SignEmailPresenterImp<V : SignEmailView, I : SignEmailInteractorImp> : Presenter<V, I>{
    fun signIn(username: String, email: String, password: String)
    fun googleLogin(idToken: String)
    fun facebookLogin(binding: ActivitySignEmailBinding, callbackManager: CallbackManager)
    fun activityResult(requestCode: Int, resultCode: Int, data: Intent?)

}