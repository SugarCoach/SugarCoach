package com.sugarcoachpremium.ui.splash;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J-\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\fH\u0001\u00a2\u0006\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lcom/sugarcoachpremium/ui/splash/SplashActivityModule;", "", "()V", "provideSplashInteractor", "Lcom/sugarcoachpremium/ui/splash/interactor/SplashInteractorImp;", "splashInteractor", "Lcom/sugarcoachpremium/ui/splash/interactor/SplashInteractor;", "provideSplashInteractor$app_debug", "provideSplashPresenter", "Lcom/sugarcoachpremium/ui/splash/presenter/SplashPresenterImp;", "Lcom/sugarcoachpremium/ui/splash/view/SplashView;", "splashPresenter", "Lcom/sugarcoachpremium/ui/splash/presenter/SplashPresenter;", "provideSplashPresenter$app_debug", "app_debug"})
public final class SplashActivityModule {
    
    public SplashActivityModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp provideSplashInteractor$app_debug(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.splash.interactor.SplashInteractor splashInteractor) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.splash.presenter.SplashPresenterImp<com.sugarcoachpremium.ui.splash.view.SplashView, com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp> provideSplashPresenter$app_debug(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.splash.presenter.SplashPresenter<com.sugarcoachpremium.ui.splash.view.SplashView, com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp> splashPresenter) {
        return null;
    }
}