package com.sugarcoach.ui.login.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.notbytes.barcode_reader.BarcodeReaderActivity
import com.sugarcoach.R
import com.sugarcoach.ui.base.view.BaseActivity
import com.sugarcoach.ui.forgot.view.ForgotActivity
import com.sugarcoach.ui.login.interactor.LoginInteractorImp
import com.sugarcoach.ui.login.presenter.LoginPresenterImp
import com.sugarcoach.ui.main.view.MainActivity
import com.sugarcoach.ui.signEmail.view.SignEmailActivity
import com.sugarcoach.util.AppConstants
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject



class LoginActivity: BaseActivity(), LoginView {
    @Inject
    lateinit var presenter: LoginPresenterImp<LoginView,LoginInteractorImp>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        presenter.onAttach(this)
        setOnClickListeners()
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

    override fun showErrorToast() {
        Toast.makeText(this, getString(R.string.login_failure), Toast.LENGTH_LONG).show()
    }
    override fun onLogin() {
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        finish()
    }

    private fun setOnClickListeners() {
        login_bt.setOnClickListener { presenter.onLogin(login_mail.text.toString(), login_pass.text.toString(),false, false) }
        login_signin.setOnClickListener { presenter.emailSign() }
        login_forgot.setOnClickListener { presenter.forgot() }
        login_scan.setOnClickListener{scanQR()}
        login_medico_scan.setOnClickListener{scanQR()}
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
        presenter.activityResult(requestCode, resultCode, data)
    }

    fun scanQR(){
        val launchIntent = BarcodeReaderActivity.getLaunchIntent(this, true, false)
        startActivityForResult(launchIntent, presenter.getBarcode())
    }
}