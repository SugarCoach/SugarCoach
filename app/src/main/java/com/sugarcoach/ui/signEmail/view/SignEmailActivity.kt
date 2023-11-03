package com.sugarcoach.ui.signEmail.view

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.core.app.ActivityCompat
import com.facebook.AccessToken
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
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
    private lateinit var callbackManager: CallbackManager

    private lateinit var googleSignInClient: GoogleSignInClient
    private lateinit var auth: FirebaseAuth

    private val RC_SIGN_IN = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignEmailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.onAttach(this)
        auth = Firebase.auth
        configureFacebook()
        configureGoogle()
        setOnClickListeners()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                // Google Sign In was successful, authenticate with Firebase
                val account = task.getResult(ApiException::class.java)
                Log.i("OnActivityResult", "firebaseAuthWithGoogle:" + account.id)
                presenter.authWithFirebase(account.idToken!!, auth)

            } catch (e: ApiException) {
                // Google Sign In failed, update UI appropriately
                Log.i("OnActivityResult", "Google sign in failed", e)
            }
        }else{
            callbackManager.onActivityResult(requestCode, resultCode, data)
        }
    }

    override fun onDestroy() {
        presenter.onDetach()
        hideProgress()
        super.onDestroy()
    }


    override fun showErrorToast(msg: String) {
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

    private fun setOnClickListeners() {
        binding.signGoogle.setOnClickListener { googleLogin() }
        binding.signEmailBt.setOnClickListener { presenter.signIn(binding.signEmailUser.text.toString(), binding.signEmailMail.text.toString(), binding.signEmailPass.text.toString(), auth) }
    }

    private fun configureFacebook(){
        callbackManager = CallbackManager.Factory.create()
        presenter.facebookLogin(binding, callbackManager, auth)
    }

    private fun googleLogin(){
        val signInIntent = googleSignInClient.signInIntent
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }
    private fun configureGoogle(){

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.google_id))
            .requestEmail()
            .build()

        googleSignInClient = GoogleSignIn.getClient(this, gso)
    }

    override fun startMain(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}