package com.sugarcoach.ui.forgot.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.sugarcoach.R
import com.sugarcoach.ui.base.view.BaseActivity
import com.sugarcoach.ui.forgot.interactor.ForgotInteractorImp
import com.sugarcoach.ui.forgot.presenter.ForgotPresenterImp
import com.sugarcoach.ui.login.interactor.LoginInteractorImp
import com.sugarcoach.ui.login.presenter.LoginPresenterImp
import com.sugarcoach.ui.main.view.MainActivity
import com.sugarcoach.ui.signEmail.view.SignEmailActivity
import com.sugarcoach.util.AppConstants
import kotlinx.android.synthetic.main.activity_forgot.*
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

class ForgotActivity: BaseActivity(), ForgotView {
    @Inject
    lateinit var presenter: ForgotPresenterImp<ForgotView,ForgotInteractorImp>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)
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
    override fun onForgot() {
        Toast.makeText(this, getString(R.string.update_success), Toast.LENGTH_LONG).show()
        finish()
    }

    private fun setOnClickListeners() {
        forgot_bt.setOnClickListener { presenter.onForgot(forgot_mail.text.toString()) }
    }
}