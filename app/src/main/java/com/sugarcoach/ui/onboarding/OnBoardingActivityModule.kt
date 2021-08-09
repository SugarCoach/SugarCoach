package com.sugarcoach.ui.onboarding



import androidx.fragment.app.FragmentManager
import com.sugarcoach.ui.onboarding.interactor.OnBoardingInteractor
import com.sugarcoach.ui.onboarding.interactor.OnBoardingInteractorImp
import com.sugarcoach.ui.onboarding.presenter.OnBoardingPresenter
import com.sugarcoach.ui.onboarding.presenter.OnBoardingPresenterImp
import com.sugarcoach.ui.onboarding.view.BoardingFragmentPagerAdapter
import com.sugarcoach.ui.onboarding.view.OnBoardingActivity
import com.sugarcoach.ui.onboarding.view.OnBoardingView

import dagger.Module
import dagger.Provides

@Module
class OnBoardingActivityModule {

    @Provides
    internal fun provideOnBoardingInteractor(onboardingInteractor: OnBoardingInteractor): OnBoardingInteractorImp = onboardingInteractor

    @Provides
    internal fun provideOnBoardingPresenter(onboardingPresenter: OnBoardingPresenter<OnBoardingView, OnBoardingInteractorImp>)
            : OnBoardingPresenterImp<OnBoardingView, OnBoardingInteractorImp> = onboardingPresenter
    @Provides
    internal fun provideBoardingFragmentPagerAdapter(context: OnBoardingActivity): BoardingFragmentPagerAdapter = BoardingFragmentPagerAdapter(context.supportFragmentManager)
}