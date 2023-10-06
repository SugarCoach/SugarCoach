package com.sugarcoach.ui.onboarding



import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import com.sugarcoach.R
import com.sugarcoach.ui.onboarding.interactor.OnBoardingInteractor
import com.sugarcoach.ui.onboarding.interactor.OnBoardingInteractorImp
import com.sugarcoach.ui.onboarding.presenter.OnBoardingPresenter
import com.sugarcoach.ui.onboarding.presenter.OnBoardingPresenterImp
import com.sugarcoach.ui.onboarding.view.BoardingFragmentPagerAdapter
import com.sugarcoach.ui.onboarding.view.BoardingItem
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
    internal fun provideBoardingFragmentPagerAdapter(context: OnBoardingActivity):
            BoardingFragmentPagerAdapter = BoardingFragmentPagerAdapter(FragmentActivity(), providesItemList())

    @Provides
    internal fun providesItemList(): ArrayList<BoardingItem> {
        val itemList = ArrayList<BoardingItem>()
        val oneItem = BoardingItem.Builder().bg(R.color.aqua).image(R.drawable.avatar_1).title(R.string.onboarding_item_one_title).subtitle(
            R.string.onboarding_item_one_subtitle).showButton(false).build()
        val twoItem = BoardingItem.Builder().bg(R.color.purple).image(R.drawable.avatar_2).title(R.string.onboarding_item_two_title).showButton(false).build()
        val threeItem = BoardingItem.Builder().bg(R.color.blue).image(R.drawable.avatar_3).title(R.string.onboarding_item_three_title).showButton(false).build()
        val fourItem = BoardingItem.Builder().bg(R.color.yellow).image(R.drawable.avatar_4).title(R.string.onboarding_item_four_title).subtitle(
            R.string.onboarding_item_four_subtitle).showButton(false).build()
        val fiveItem = BoardingItem.Builder().bg(R.color.pink).image(R.drawable.avatar_5).title(R.string.onboarding_item_five_title).subtitle(
            R.string.onboarding_item_five_subtitle).showButton(true).build()
        itemList.add(oneItem)
        itemList.add(twoItem)
        itemList.add(threeItem)
        itemList.add(fourItem)
        itemList.add(fiveItem)
        return itemList
    }
}