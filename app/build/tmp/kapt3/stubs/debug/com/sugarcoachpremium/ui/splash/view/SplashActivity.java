package com.sugarcoachpremium.ui.splash.view;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014J\b\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016R*\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/sugarcoachpremium/ui/splash/view/SplashActivity;", "Lcom/sugarcoachpremium/ui/base/view/BaseActivity;", "Lcom/sugarcoachpremium/ui/splash/view/SplashView;", "<init>", "()V", "presenter", "Lcom/sugarcoachpremium/ui/splash/presenter/SplashPresenterImp;", "Lcom/sugarcoachpremium/ui/splash/interactor/SplashInteractorImp;", "getPresenter", "()Lcom/sugarcoachpremium/ui/splash/presenter/SplashPresenterImp;", "setPresenter", "(Lcom/sugarcoachpremium/ui/splash/presenter/SplashPresenterImp;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "showSuccessToast", "showErrorToast", "msg", "", "openMainActivity", "openBoardingActivity", "app_debug"})
public final class SplashActivity extends com.sugarcoachpremium.ui.base.view.BaseActivity implements com.sugarcoachpremium.ui.splash.view.SplashView {
    @javax.inject.Inject()
    public com.sugarcoachpremium.ui.splash.presenter.SplashPresenterImp<com.sugarcoachpremium.ui.splash.view.SplashView, com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp> presenter;
    
    public SplashActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.splash.presenter.SplashPresenterImp<com.sugarcoachpremium.ui.splash.view.SplashView, com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp> getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.splash.presenter.SplashPresenterImp<com.sugarcoachpremium.ui.splash.view.SplashView, com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void showSuccessToast() {
    }
    
    @java.lang.Override()
    public void showErrorToast(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void openMainActivity() {
    }
    
    @java.lang.Override()
    public void openBoardingActivity() {
    }
}