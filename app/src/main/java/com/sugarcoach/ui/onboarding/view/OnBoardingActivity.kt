package com.sugarcoach.ui.onboarding.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.jem.liquidswipe.clippathprovider.LiquidSwipeClipPathProvider
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
    @Inject
    lateinit var itemList: ArrayList<BoardingItem>


    val onBoardingPageChangeCallback = object : ViewPager2.OnPageChangeCallback(){
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
            when (position){
                0 -> {
                    /*skipBtn.text = "Skip"
                    skipBtn.visible()
                    nextBtn.visible()
                    previousBtn.gone()*/
                    Log.i("On0","$itemList")
                }
                itemList.size - 1 -> {
                    Log.i("OnSize","$position, $itemList")
                    /*skipBtn.text = "Get Started"
                    nextBtn.gone()
                    skipBtn.visible()
                    previousBtn.visible()*/

                }
                else -> {
                    Log.i("OnElse","$position, $itemList")
                }
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("OnCreateBoarding", "Se esta creando el boarding")
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.onAttach(this)

        binding.boardingPager.apply {
            adapter = adapter
            registerOnPageChangeCallback(onBoardingPageChangeCallback)
            (getChildAt(0) as RecyclerView).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
        }
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
        /*binding.boardingPager.adapter = adapter
        adapter.setData(itemList)
        adapter.notifyDataSetChanged()*/
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