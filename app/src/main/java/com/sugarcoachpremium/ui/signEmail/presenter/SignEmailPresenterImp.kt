package com.sugarcoachpremium.ui.signEmail.presenter

import com.facebook.AccessToken
import com.facebook.CallbackManager
import com.google.firebase.auth.FirebaseAuth
import com.sugarcoachpremium.databinding.ActivitySignEmailBinding
import com.sugarcoachpremium.ui.base.presenter.Presenter
import com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractorImp
import com.sugarcoachpremium.ui.signEmail.view.SignEmailView


interface SignEmailPresenterImp<V : SignEmailView, I : SignEmailInteractorImp> : Presenter<V, I>{
    fun signIn(username: String, email: String, password: String, auth: FirebaseAuth)
    fun facebookLogin(binding: ActivitySignEmailBinding, callbackManager: CallbackManager, auth: FirebaseAuth)
    //fun googleLogin(client: GoogleSignInClient)
    //fun activityResult(requestCode: Int, resultCode: Int, data: Intent?)
    fun authWithFirebase(idToken: String, auth: FirebaseAuth)
    fun handleFacebookAccessToken(idToken: AccessToken, auth: FirebaseAuth)

}