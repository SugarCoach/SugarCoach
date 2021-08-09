package com.sugarcoach.ui.splash.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.sugarcoach.R
import com.sugarcoach.ui.base.view.BaseActivity
import com.sugarcoach.ui.login.view.LoginActivity
import com.sugarcoach.ui.main.view.MainActivity
import com.sugarcoach.ui.onboarding.view.OnBoardingActivity
import com.sugarcoach.ui.splash.interactor.SplashInteractorImp
import com.sugarcoach.ui.splash.presenter.SplashPresenterImp
import javax.inject.Inject

class SplashActivity : BaseActivity(), SplashView {

    @Inject
    lateinit var presenter: SplashPresenterImp<SplashView, SplashInteractorImp>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        presenter.onAttach(this)
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }


    override fun showSuccessToast() {
    }

    override fun showErrorToast() {
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun openBoardingActivity() {
        val intent = Intent(this, OnBoardingActivity::class.java)
        startActivity(intent)
        finish()
    }
}
