package com.sugarcoachpremium.ui.onboarding.presenter

import com.sugarcoachpremium.ui.base.presenter.Presenter
import com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp
import com.sugarcoachpremium.ui.onboarding.view.OnBoardingView


interface OnBoardingPresenterImp<V : OnBoardingView, I : OnBoardingInteractorImp> : Presenter<V, I>{
}