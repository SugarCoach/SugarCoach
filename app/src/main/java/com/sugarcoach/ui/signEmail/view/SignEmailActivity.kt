package com.sugarcoach.ui.signEmail.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.sugarcoach.R
import com.sugarcoach.ui.base.view.BaseActivity
import com.sugarcoach.ui.main.view.MainActivity
import com.sugarcoach.ui.signEmail.interactor.SignEmailInteractorImp
import com.sugarcoach.ui.signEmail.presenter.SignEmailPresenterImp
import com.sugarcoach.util.AppConstants
import kotlinx.android.synthetic.main.activity_sign_email.*
import kotlinx.android.synthetic.main.activity_sign_email.sign_facebook
import javax.inject.Inject

class SignEmailActivity: BaseActivity(), SignEmailView {

    @Inject
    lateinit var presenter: SignEmailPresenterImp<SignEmailView, SignEmailInteractorImp>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_email)
        presenter.onAttach(this)
        setOnClickListeners()
    }

    override fun onDestroy() {
        presenter.onDetach()
        hideProgress()
        super.onDestroy()
    }


    override fun showErrorToast() {
        Toast.makeText(this, getString(R.string.sign_failure), Toast.LENGTH_LONG).show()
    }

    override fun onSign() {
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        finish()
    }
    override fun showValidationMessage(errorCode: Int) {
        when (errorCode) {
            AppConstants.EMPTY_USERNAME_ERROR -> Toast.makeText(this, getString(R.string.empty_username_error_message), Toast.LENGTH_LONG).show()
            AppConstants.EMPTY_EMAIL_ERROR -> Toast.makeText(this, getString(R.string.empty_email_error_message), Toast.LENGTH_LONG).show()
            AppConstants.INVALID_EMAIL_ERROR -> Toast.makeText(this, getString(R.string.invalid_email_error_message), Toast.LENGTH_LONG).show()
            AppConstants.EMPTY_PASSWORD_ERROR -> Toast.makeText(this, getString(R.string.empty_password_error_message), Toast.LENGTH_LONG).show()
        }
    }

    override fun onGoogleLogin() {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()

//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//        finish()
    }

    override fun googleSignIntent(mGoogleSignInClient: GoogleSignInClient, RC_SIGN_IN: Int) {
        val intent: Intent = mGoogleSignInClient.signInIntent
        startActivityForResult(intent, RC_SIGN_IN)
    }


    override fun onFacebookLogin() {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//        finish()
    }
    private fun setOnClickListeners() {
        sign_google.setOnClickListener { presenter.googleLogin(getString(R.string.google_id)) }
        sign_facebook.setOnClickListener { presenter.facebookLogin() }
        sign_email_bt.setOnClickListener { presenter.signIn(sign_email_user.text.toString(), sign_email_mail.text.toString(), sign_email_pass.text.toString()) }
    }
}