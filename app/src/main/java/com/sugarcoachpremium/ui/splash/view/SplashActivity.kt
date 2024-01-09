package com.sugarcoachpremium.ui.splash.view

import android.content.Intent
import android.os.Bundle
import com.sugarcoachpremium.R
import com.sugarcoachpremium.ui.base.view.BaseActivity
import com.sugarcoachpremium.ui.main.view.MainActivity
import com.sugarcoachpremium.ui.onboarding.view.OnBoardingActivity
import com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp
import com.sugarcoachpremium.ui.splash.presenter.SplashPresenterImp
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

    override fun showErrorToast(msg: String) {
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
