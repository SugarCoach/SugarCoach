package com.sugarcoachpremium.ui.splash.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B\u001f\b\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0017\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a8\u0006\u0017"}, d2 = {"Lcom/sugarcoachpremium/ui/splash/presenter/SplashPresenter;", "V", "Lcom/sugarcoachpremium/ui/splash/view/SplashView;", "I", "Lcom/sugarcoachpremium/ui/splash/interactor/SplashInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/BasePresenter;", "Lcom/sugarcoachpremium/ui/splash/presenter/SplashPresenterImp;", "interactor", "schedulerProvider", "Lcom/sugarcoachpremium/util/SchedulerProvider;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/sugarcoachpremium/ui/splash/interactor/SplashInteractorImp;Lcom/sugarcoachpremium/util/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "decideActivityToOpen", "", "getRegisters", "onAttach", "view", "(Lcom/sugarcoachpremium/ui/splash/view/SplashView;)V", "saveRegisters", "registers", "", "Lcom/sugarcoachpremium/data/network/RegistersResponse;", "app_release"})
public final class SplashPresenter<V extends com.sugarcoachpremium.ui.splash.view.SplashView, I extends com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.BasePresenter<V, I> implements com.sugarcoachpremium.ui.splash.presenter.SplashPresenterImp<V, I> {
    
    @javax.inject.Inject
    public SplashPresenter(@org.jetbrains.annotations.NotNull
    I interactor, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull
    io.reactivex.disposables.CompositeDisposable disposable) {
        super(null, null, null);
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.Nullable
    V view) {
    }
    
    @java.lang.Override
    public void decideActivityToOpen() {
    }
    
    public final void getRegisters() {
    }
    
    public final void saveRegisters(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.network.RegistersResponse> registers) {
    }
}