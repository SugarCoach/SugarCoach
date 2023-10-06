package com.sugarcoach.ui.signEmail.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.sugarcoach.R
import com.sugarcoach.databinding.ActivitySignEmailBinding
import com.sugarcoach.ui.base.view.BaseActivity
import com.sugarcoach.ui.main.view.MainActivity
import com.sugarcoach.ui.signEmail.interactor.SignEmailInteractorImp
import com.sugarcoach.ui.signEmail.presenter.SignEmailPresenterImp
import com.sugarcoach.util.AppConstants
import javax.inject.Inject

class SignEmailActivity: BaseActivity(), SignEmailView {

    @Inject
    lateinit var presenter: SignEmailPresenterImp<SignEmailView, SignEmailInteractorImp>
    lateinit var binding: ActivitySignEmailBinding
    lateinit var callbackManager: CallbackManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignEmailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.onAttach(this)
        configureFacebook()
        setOnClickListeners()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        callbackManager.onActivityResult(requestCode, resultCode, data)
        super.onActivityResult(requestCode, resultCode, data)
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
        Log.i("OnFacebookLogin", "Se loggeo correctamente")
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//        finish()
    }
    private fun setOnClickListeners() {
        binding.signGoogle.setOnClickListener { presenter.googleLogin(getString(R.string.google_id)) }
        binding.signFacebook.setOnClickListener { presenter.facebookLogin() }
        binding.signEmailBt.setOnClickListener { presenter.signIn(binding.signEmailUser.text.toString(), binding.signEmailMail.text.toString(), binding.signEmailPass.text.toString()) }
    }

    private fun configureFacebook(){
        callbackManager = CallbackManager.Factory.create()

        LoginManager.getInstance().registerCallback(callbackManager,
            object : FacebookCallback<LoginResult> {
                override fun onSuccess(loginResult: LoginResult) {
                    Log.i("OnSuccess", "Se Loggeo correctamente")
                    onFacebookLogin()
//                    facebookSuccess(loginResult.accessToken)
                }

                override fun onCancel() {
                    Log.i("OnCancel", "Se cancelo el login")
                    showErrorToast()
                }

                override fun onError(exception: FacebookException) {
                    Log.i("OnFacebookError", "Ocrurró un error al logear")
                    println(exception.message)
                    showErrorToast()
                }
            })
    }
}