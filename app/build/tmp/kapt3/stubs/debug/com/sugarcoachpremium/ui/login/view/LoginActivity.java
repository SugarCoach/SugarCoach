package com.sugarcoachpremium.ui.login.view;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0014J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0002J\b\u0010 \u001a\u00020\u0013H\u0016J\b\u0010!\u001a\u00020\u0013H\u0016J\"\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0006\u0010\'\u001a\u00020\u0013R*\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006("}, d2 = {"Lcom/sugarcoachpremium/ui/login/view/LoginActivity;", "Lcom/sugarcoachpremium/ui/base/view/BaseActivity;", "Lcom/sugarcoachpremium/ui/login/view/LoginView;", "<init>", "()V", "presenter", "Lcom/sugarcoachpremium/ui/login/presenter/LoginPresenterImp;", "Lcom/sugarcoachpremium/ui/login/interactor/LoginInteractorImp;", "getPresenter", "()Lcom/sugarcoachpremium/ui/login/presenter/LoginPresenterImp;", "setPresenter", "(Lcom/sugarcoachpremium/ui/login/presenter/LoginPresenterImp;)V", "binding", "Lcom/sugarcoachpremium/databinding/ActivityLoginBinding;", "getBinding", "()Lcom/sugarcoachpremium/databinding/ActivityLoginBinding;", "setBinding", "(Lcom/sugarcoachpremium/databinding/ActivityLoginBinding;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "feedDatabase", "onDestroy", "showValidationMessage", "errorCode", "", "showErrorToast", "msg", "", "onLogin", "setOnClickListeners", "onEmailSign", "onForgot", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "scanQR", "app_debug"})
public final class LoginActivity extends com.sugarcoachpremium.ui.base.view.BaseActivity implements com.sugarcoachpremium.ui.login.view.LoginView {
    @javax.inject.Inject()
    public com.sugarcoachpremium.ui.login.presenter.LoginPresenterImp<com.sugarcoachpremium.ui.login.view.LoginView, com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp> presenter;
    public com.sugarcoachpremium.databinding.ActivityLoginBinding binding;
    
    public LoginActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.login.presenter.LoginPresenterImp<com.sugarcoachpremium.ui.login.view.LoginView, com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp> getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.login.presenter.LoginPresenterImp<com.sugarcoachpremium.ui.login.view.LoginView, com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.databinding.ActivityLoginBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.databinding.ActivityLoginBinding p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void feedDatabase() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void showValidationMessage(int errorCode) {
    }
    
    @java.lang.Override()
    public void showErrorToast(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void onLogin() {
    }
    
    private final void setOnClickListeners() {
    }
    
    @java.lang.Override()
    public void onEmailSign() {
    }
    
    @java.lang.Override()
    public void onForgot() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void scanQR() {
    }
}