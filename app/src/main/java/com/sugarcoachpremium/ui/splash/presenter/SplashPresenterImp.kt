package com.sugarcoachpremium.ui.splash.presenter

import com.sugarcoachpremium.ui.base.presenter.Presenter
import com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp
import com.sugarcoachpremium.ui.splash.view.SplashView


interface SplashPresenterImp<V : SplashView, I : SplashInteractorImp> : Presenter<V, I>{
    fun decideActivityToOpen()
}


