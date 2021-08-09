package com.sugarcoach.ui.onboarding.presenter

import com.sugarcoach.ui.base.presenter.Presenter
import com.sugarcoach.ui.onboarding.interactor.OnBoardingInteractorImp
import com.sugarcoach.ui.onboarding.view.OnBoardingView


interface OnBoardingPresenterImp<V : OnBoardingView, I : OnBoardingInteractorImp> : Presenter<V, I>{
}