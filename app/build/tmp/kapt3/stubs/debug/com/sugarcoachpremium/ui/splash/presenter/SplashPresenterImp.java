package com.sugarcoachpremium.ui.splash.presenter;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/splash/presenter/SplashPresenterImp;", "V", "Lcom/sugarcoachpremium/ui/splash/view/SplashView;", "I", "Lcom/sugarcoachpremium/ui/splash/interactor/SplashInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/Presenter;", "decideActivityToOpen", "", "app_debug"})
public abstract interface SplashPresenterImp<V extends com.sugarcoachpremium.ui.splash.view.SplashView, I extends com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.Presenter<V, I> {
    
    public abstract void decideActivityToOpen();
}