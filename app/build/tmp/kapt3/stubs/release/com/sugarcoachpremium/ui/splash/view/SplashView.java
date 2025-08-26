package com.sugarcoachpremium.ui.splash.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/sugarcoachpremium/ui/splash/view/SplashView;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "openBoardingActivity", "", "openMainActivity", "showSuccessToast", "app_release"})
public abstract interface SplashView extends com.sugarcoachpremium.ui.base.view.BaseView {
    
    public abstract void showSuccessToast();
    
    public abstract void openMainActivity();
    
    public abstract void openBoardingActivity();
}