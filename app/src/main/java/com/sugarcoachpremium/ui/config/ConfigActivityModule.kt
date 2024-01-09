package com.sugarcoachpremium.ui.config


import com.sugarcoachpremium.ui.config.interactor.ConfigInteractor
import com.sugarcoachpremium.ui.config.interactor.ConfigInteractorImp
import com.sugarcoachpremium.ui.config.presenter.ConfigPresenter
import com.sugarcoachpremium.ui.config.presenter.ConfigPresenterImp
import com.sugarcoachpremium.ui.config.view.ConfigView

import dagger.Module
import dagger.Provides

@Module
class ConfigActivityModule {

    @Provides
    internal fun provideConfigInteractor(configInteractor: ConfigInteractor): ConfigInteractorImp =
        configInteractor

    @Provides
    internal fun provideConfigPresenter(configPresenter: ConfigPresenter<ConfigView, ConfigInteractorImp>)
            : ConfigPresenterImp<ConfigView, ConfigInteractorImp> = configPresenter
}