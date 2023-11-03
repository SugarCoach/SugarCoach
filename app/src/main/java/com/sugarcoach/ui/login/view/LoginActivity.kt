package com.sugarcoach.ui.login.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.notbytes.barcode_reader.BarcodeReaderActivity
import com.sugarcoach.R
import com.sugarcoach.databinding.ActivityLoginBinding
import com.sugarcoach.ui.base.view.BaseActivity
import com.sugarcoach.ui.forgot.view.ForgotActivity
import com.sugarcoach.ui.login.interactor.LoginInteractorImp
import com.sugarcoach.ui.login.presenter.LoginPresenterImp
import com.sugarcoach.ui.main.view.MainActivity
import com.sugarcoach.ui.signEmail.view.SignEmailActivity
import com.sugarcoach.util.AppConstants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import javax.inject.Inject
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class LoginActivity: BaseActivity(), LoginView {
    @Inject
    lateinit var presenter: LoginPresenterImp<LoginView,LoginInteractorImp>
    lateinit var binding: ActivityLoginBinding
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        feedDatabase()
        auth = Firebase.auth
        presenter.onAttach(this)
        setOnClickListeners()
    }

    override fun feedDatabase() {
        CoroutineScope(Dispatchers.IO).launch {
            presenter.feedInDatabase()
        }
    }
    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun showValidationMessage(errorCode: Int) {
        when (errorCode) {
            AppConstants.EMPTY_EMAIL_ERROR -> Toast.makeText(this, getString(R.string.empty_email_error_message), Toast.LENGTH_LONG).show()
            AppConstants.INVALID_EMAIL_ERROR -> Toast.makeText(this, getString(R.string.invalid_email_error_message), Toast.LENGTH_LONG).show()
            AppConstants.EMPTY_PASSWORD_ERROR -> Toast.makeText(this, getString(R.string.empty_password_error_message), Toast.LENGTH_LONG).show()
            AppConstants.LOGIN_FAILURE -> Toast.makeText(this, getString(R.string.login_failure), Toast.LENGTH_LONG).show()
        }
    }

    override fun showErrorToast(msg: String) {
        Toast.makeText(this, getString(R.string.login_failure), Toast.LENGTH_LONG).show()
    }
    override fun onLogin() {
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        finish()
    }

    private fun setOnClickListeners() {

        binding.loginBt.setOnClickListener { runBlocking {
            presenter.onLogin(binding.loginMail.text.toString(),
                binding.loginPass.text.toString(),false, false)}
        }
        binding.loginSignin.setOnClickListener { presenter.emailSign() }
        binding.loginForgot.setOnClickListener { presenter.forgot() }
        binding.loginScan.setOnClickListener{scanQR()}
        binding.loginMedicoScan.setOnClickListener{scanQR()}
    }
    override fun onEmailSign() {
        val intent = Intent(this, SignEmailActivity::class.java)
        startActivity(intent)
    }

    override fun onForgot() {
        val intent = Intent(this, ForgotActivity::class.java)
        startActivity(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        runBlocking { presenter.activityResult(requestCode, resultCode, data) }
    }

    fun scanQR(){
        Log.i("OnScan", "Entre al Scan QR en el LogACtivity")
        val launchIntent = BarcodeReaderActivity.getLaunchIntent(this, true, false)
        startActivityForResult(launchIntent, presenter.getBarcode())
    }
}