package com.sugarcoach.ui.splash

import com.sugarcoach.ui.splash.interactor.SplashInteractor
import com.sugarcoach.ui.splash.interactor.SplashInteractorImp
import com.sugarcoach.ui.splash.presenter.SplashPresenter
import com.sugarcoach.ui.splash.presenter.SplashPresenterImp
import com.sugarcoach.ui.splash.view.SplashView
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