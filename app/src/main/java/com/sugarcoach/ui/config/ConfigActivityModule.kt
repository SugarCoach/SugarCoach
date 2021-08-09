package com.sugarcoach.ui.config


import com.sugarcoach.ui.config.interactor.ConfigInteractor
import com.sugarcoach.ui.config.interactor.ConfigInteractorImp
import com.sugarcoach.ui.config.presenter.ConfigPresenter
import com.sugarcoach.ui.config.presenter.ConfigPresenterImp
import com.sugarcoach.ui.config.view.ConfigView

import dagger.Module
import dagger.Provides
import ro.andreidobrescu.emojilike.EmojiLikeTouchDetector

@Module
class ConfigActivityModule {

    @Provides
    internal fun provideConfigInteractor(configInteractor: ConfigInteractor): ConfigInteractorImp =
        configInteractor

    @Provides
    internal fun provideConfigPresenter(configPresenter: ConfigPresenter<ConfigView, ConfigInteractorImp>)
            : ConfigPresenterImp<ConfigView, ConfigInteractorImp> = configPresenter
}