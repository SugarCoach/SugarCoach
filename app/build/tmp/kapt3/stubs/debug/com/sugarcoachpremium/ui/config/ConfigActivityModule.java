package com.sugarcoachpremium.ui.config;

@dagger.Module()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\bJ-\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\rH\u0001\u00a2\u0006\u0002\b\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/sugarcoachpremium/ui/config/ConfigActivityModule;", "", "<init>", "()V", "provideConfigInteractor", "Lcom/sugarcoachpremium/ui/config/interactor/ConfigInteractorImp;", "configInteractor", "Lcom/sugarcoachpremium/ui/config/interactor/ConfigInteractor;", "provideConfigInteractor$app_debug", "provideConfigPresenter", "Lcom/sugarcoachpremium/ui/config/presenter/ConfigPresenterImp;", "Lcom/sugarcoachpremium/ui/config/view/ConfigView;", "configPresenter", "Lcom/sugarcoachpremium/ui/config/presenter/ConfigPresenter;", "provideConfigPresenter$app_debug", "app_debug"})
public final class ConfigActivityModule {
    
    public ConfigActivityModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.config.interactor.ConfigInteractorImp provideConfigInteractor$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.config.interactor.ConfigInteractor configInteractor) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.config.presenter.ConfigPresenterImp<com.sugarcoachpremium.ui.config.view.ConfigView, com.sugarcoachpremium.ui.config.interactor.ConfigInteractorImp> provideConfigPresenter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.config.presenter.ConfigPresenter<com.sugarcoachpremium.ui.config.view.ConfigView, com.sugarcoachpremium.ui.config.interactor.ConfigInteractorImp> configPresenter) {
        return null;
    }
}