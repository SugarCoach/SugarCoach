package com.sugarcoach.ui.main


import com.sugarcoach.ui.main.interactor.MainInteractor
import com.sugarcoach.ui.main.interactor.MainInteractorImp
import com.sugarcoach.ui.main.presenter.MainPresenter
import com.sugarcoach.ui.main.presenter.MainPresenterImp
import com.sugarcoach.ui.main.view.MainView
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