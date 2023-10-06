package com.sugarcoach.ui.onboarding.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.jem.liquidswipe.clippathprovider.LiquidSwipeClipPathProvider
import com.mazenrashed.dotsindicator.DotsIndicator
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
    lateinit var dots: DotsIndicator

    override fun onCreate(savedInstanceState: Bundle?) {
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

    @SuppressLint("NotifyDataSetChanged")
    override fun setData(itemList: ArrayList<BoardingItem>) {
        binding.boardingPager.adapter = adapter
        binding.dotsIndicator.attachTo(binding.boardingPager)
        adapter.setData(itemList)
        adapter.notifyDataSetChanged()
    }

    override fun showProgress() {
        TODO("Not yet implemented")
    }

    override fun hideProgress() {
        TODO("Not yet implemented")
    }

    override fun showErrorToast() {
    }

}