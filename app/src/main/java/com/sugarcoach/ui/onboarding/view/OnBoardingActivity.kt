package com.sugarcoach.ui.onboarding.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.sugarcoach.databinding.ActivityOnboardingBinding
import com.sugarcoach.ui.base.view.BaseActivity
import com.sugarcoach.ui.login.view.LoginActivity
import com.sugarcoach.ui.onboarding.interactor.OnBoardingInteractorImp
import com.sugarcoach.ui.onboarding.presenter.OnBoardingPresenterImp
import javax.inject.Inject

class OnBoardingActivity: BaseActivity(), OnBoardingView {
    @Inject
    lateinit var presenter: OnBoardingPresenterImp<OnBoardingView,OnBoardingInteractorImp>

    @Inject
    lateinit var adapter: BoardingFragmentPagerAdapter
    lateinit var binding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("OnCreateBoarding", "Se esta creando el boarding")
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.onAttach(this)
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

    override fun setData(itemList: ArrayList<BoardingItem>) {
        binding.boardingPager.adapter = adapter
        adapter.setData(itemList)
        adapter.notifyDataSetChanged()

    }

    override fun showErrorToast() {
    }

}