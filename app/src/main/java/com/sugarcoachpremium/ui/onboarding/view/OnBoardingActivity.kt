package com.sugarcoachpremium.ui.onboarding.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.mazenrashed.dotsindicator.DotsIndicator
import com.sugarcoachpremium.databinding.ActivityOnboardingBinding
import com.sugarcoachpremium.ui.base.view.BaseActivity
import com.sugarcoachpremium.ui.login.view.LoginActivity
import com.sugarcoachpremium.ui.main.view.MainActivity
import com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp
import com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenterImp
import javax.inject.Inject

class OnBoardingActivity: BaseActivity(), OnBoardingView {
    @Inject
    lateinit var presenter: OnBoardingPresenterImp<OnBoardingView,OnBoardingInteractorImp>

    @Inject
    lateinit var adapter: BoardingFragmentPagerAdapter
    lateinit var binding: ActivityOnboardingBinding
    lateinit var dots: DotsIndicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.onAttach(this)
        verifyLogin()
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun openLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun setData(itemList: ArrayList<BoardingItem>) {
        binding.boardingPager.adapter = adapter
        binding.dotsIndicator.attachTo(binding.boardingPager)
        adapter.setData(itemList)
        adapter.notifyDataSetChanged()
    }

    override fun verifyLogin() {
        Log.i("Verifying login", "Se esta verificando el login")
        if(Firebase.auth.currentUser != null){
            Log.i("Verifying login", "El usuario esta loggeado")
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        Log.i("Verifying login", "El usuario no esta loggeado")
    }

    override fun startMain() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun showProgress() {
        TODO("Not yet implemented")
    }

    override fun hideProgress() {
        TODO("Not yet implemented")
    }

    override fun showErrorToast(msg: String) {
    }

}