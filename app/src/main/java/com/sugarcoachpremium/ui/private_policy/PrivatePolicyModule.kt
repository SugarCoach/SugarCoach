package com.sugarcoachpremium.ui.private_policy

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sugarcoachpremium.R
import com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractor
import com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp
import com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenter
import com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenterImp
import com.sugarcoachpremium.ui.onboarding.view.BoardingFragmentPagerAdapter
import com.sugarcoachpremium.ui.onboarding.view.OnBoardingActivity
import com.sugarcoachpremium.ui.onboarding.view.OnBoardingView
import dagger.Module
import dagger.Provides

@Module
class PrivatePolicyModule : AppCompatActivity() {

    //@Provides
    /*internal fun provideOnBoardingInteractor(onboardingInteractor: OnBoardingInteractor): OnBoardingInteractorImp = onboardingInteractor

    @Provides
    internal fun provideOnBoardingPresenter(onboardingPresenter: OnBoardingPresenter<OnBoardingView, OnBoardingInteractorImp>)
            : OnBoardingPresenterImp<OnBoardingView, OnBoardingInteractorImp> = onboardingPresenter
    @Provides
    internal fun provideBoardingFragmentPagerAdapter(context: OnBoardingActivity):
            BoardingFragmentPagerAdapter = BoardingFragmentPagerAdapter(context)*/
}