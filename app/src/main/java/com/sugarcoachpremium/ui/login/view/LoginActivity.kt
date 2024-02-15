package com.sugarcoachpremium.ui.login.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.notbytes.barcode_reader.BarcodeReaderActivity
import com.sugarcoachpremium.R
import com.sugarcoachpremium.databinding.ActivityLoginBinding
import com.sugarcoachpremium.ui.base.view.BaseActivity
import com.sugarcoachpremium.ui.forgot.view.ForgotActivity
import com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp
import com.sugarcoachpremium.ui.login.presenter.LoginPresenterImp
import com.sugarcoachpremium.ui.main.view.MainActivity
import com.sugarcoachpremium.ui.signEmail.view.SignEmailActivity
import com.sugarcoachpremium.util.AppConstants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class LoginActivity: BaseActivity(), LoginView {
    @Inject
    lateinit var presenter: LoginPresenterImp<LoginView,LoginInteractorImp>
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
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

        binding.loginBt.setOnClickListener {
            showProgress()
            presenter.onLogin(binding.loginMail.text.toString(),
                binding.loginPass.text.toString(),false, false)
        }
        binding.loginSignin.setOnClickListener { presenter.emailSign() }
        binding.loginForgot.setOnClickListener { presenter.forgot() }
        //binding.loginScan.setOnClickListener{ scanQR() }
        //binding.loginMedicoScan.setOnClickListener{ scanQR() }
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
        val launchIntent = BarcodeReaderActivity.getLaunchIntent(this, true, false)
        startActivityForResult(launchIntent, presenter.getBarcode())
    }
}