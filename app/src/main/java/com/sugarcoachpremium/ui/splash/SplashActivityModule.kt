package com.sugarcoachpremium.ui.splash

import com.sugarcoachpremium.ui.splash.interactor.SplashInteractor
import com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp
import com.sugarcoachpremium.ui.splash.presenter.SplashPresenter
import com.sugarcoachpremium.ui.splash.presenter.SplashPresenterImp
import com.sugarcoachpremium.ui.splash.view.SplashView
import dagger.Module
import dagger.Provides

@Module
class SplashActivityModule {

    @Provides
    internal fun provideSplashInteractor(splashInteractor: SplashInteractor): SplashInteractorImp = splashInteractor

    @Provides
    internal fun provideSplashPresenter(splashPresenter: SplashPresenter<SplashView, SplashInteractorImp>)
            : SplashPresenterImp<SplashView, SplashInteractorImp> = splashPresenter


}