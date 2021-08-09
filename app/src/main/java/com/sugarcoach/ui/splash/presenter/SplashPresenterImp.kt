package com.sugarcoach.ui.splash.presenter

import com.sugarcoach.ui.base.presenter.Presenter
import com.sugarcoach.ui.splash.interactor.SplashInteractorImp
import com.sugarcoach.ui.splash.view.SplashView


interface SplashPresenterImp<V : SplashView, I : SplashInteractorImp> : Presenter<V, I>{
    fun decideActivityToOpen()
}


