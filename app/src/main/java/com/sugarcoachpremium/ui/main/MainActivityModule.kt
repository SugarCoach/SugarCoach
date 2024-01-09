package com.sugarcoachpremium.ui.main


import com.sugarcoachpremium.ui.main.interactor.MainInteractor
import com.sugarcoachpremium.ui.main.interactor.MainInteractorImp
import com.sugarcoachpremium.ui.main.presenter.MainPresenter
import com.sugarcoachpremium.ui.main.presenter.MainPresenterImp
import com.sugarcoachpremium.ui.main.view.MainView
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    internal fun provideMainInteractor(mainInteractor: MainInteractor): MainInteractorImp = mainInteractor

    @Provides
    internal fun provideMainPresenter(mainPresenter: MainPresenter<MainView, MainInteractorImp>)
            : MainPresenterImp<MainView, MainInteractorImp> = mainPresenter
}