package com.sugarcoach.ui.signEmail.presenter

import android.content.Intent
import com.facebook.AccessToken
import com.facebook.CallbackManager
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import com.sugarcoach.databinding.ActivitySignEmailBinding
import com.sugarcoach.ui.base.presenter.Presenter
import com.sugarcoach.ui.signEmail.interactor.SignEmailInteractorImp
import com.sugarcoach.ui.signEmail.view.SignEmailView


interface SignEmailPresenterImp<V : SignEmailView, I : SignEmailInteractorImp> : Presenter<V, I>{
    fun signIn(username: String, email: String, password: String)
    fun facebookLogin(binding: ActivitySignEmailBinding, callbackManager: CallbackManager, auth: FirebaseAuth)
    fun googleLogin(client: GoogleSignInClient)
    fun activityResult(requestCode: Int, resultCode: Int, data: Intent?)
    fun authWithFirebase(idToken: String, auth: FirebaseAuth)
    fun handleFacebookAccessToken(idToken: AccessToken, auth: FirebaseAuth)

}