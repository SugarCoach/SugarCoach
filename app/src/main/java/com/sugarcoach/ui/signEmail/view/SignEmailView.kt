package com.sugarcoach.ui.signEmail.view

import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.sugarcoach.ui.base.view.BaseView


interface SignEmailView : BaseView {

    fun onSign()
    fun showValidationMessage(errorCode: Int)
    fun onGoogleLogin()
    fun googleSignIntent(mGoogleSignInClient: GoogleSignInClient, RC_SIGN_IN: Int)
    fun onFacebookLogin()
}