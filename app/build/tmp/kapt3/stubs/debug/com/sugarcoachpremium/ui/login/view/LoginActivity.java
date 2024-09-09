package com.sugarcoachpremium.ui.login.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\"\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0012H\u0014J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\u0006\u0010 \u001a\u00020\u0012J\b\u0010!\u001a\u00020\u0012H\u0002J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0015H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\'"}, d2 = {"Lcom/sugarcoachpremium/ui/login/view/LoginActivity;", "Lcom/sugarcoachpremium/ui/base/view/BaseActivity;", "Lcom/sugarcoachpremium/ui/login/view/LoginView;", "()V", "binding", "Lcom/sugarcoachpremium/databinding/ActivityLoginBinding;", "getBinding", "()Lcom/sugarcoachpremium/databinding/ActivityLoginBinding;", "setBinding", "(Lcom/sugarcoachpremium/databinding/ActivityLoginBinding;)V", "presenter", "Lcom/sugarcoachpremium/ui/login/presenter/LoginPresenterImp;", "Lcom/sugarcoachpremium/ui/login/interactor/LoginInteractorImp;", "getPresenter", "()Lcom/sugarcoachpremium/ui/login/presenter/LoginPresenterImp;", "setPresenter", "(Lcom/sugarcoachpremium/ui/login/presenter/LoginPresenterImp;)V", "feedDatabase", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEmailSign", "onForgot", "onLogin", "scanQR", "setOnClickListeners", "showErrorToast", "msg", "", "showValidationMessage", "errorCode", "app_debug"})
public final class LoginActivity extends com.sugarcoachpremium.ui.base.view.BaseActivity implements com.sugarcoachpremium.ui.login.view.LoginView {
    @javax.inject.Inject
    public com.sugarcoachpremium.ui.login.presenter.LoginPresenterImp<com.sugarcoachpremium.ui.login.view.LoginView, com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp> presenter;
    public com.sugarcoachpremium.databinding.ActivityLoginBinding binding;
    
    public LoginActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.login.presenter.LoginPresenterImp<com.sugarcoachpremium.ui.login.view.LoginView, com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp> getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.login.presenter.LoginPresenterImp<com.sugarcoachpremium.ui.login.view.LoginView, com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.databinding.ActivityLoginBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.databinding.ActivityLoginBinding p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void feedDatabase() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    @java.lang.Override
    public void showValidationMessage(int errorCode) {
    }
    
    @java.lang.Override
    public void showErrorToast(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    @java.lang.Override
    public void onLogin() {
    }
    
    private final void setOnClickListeners() {
    }
    
    @java.lang.Override
    public void onEmailSign() {
    }
    
    @java.lang.Override
    public void onForgot() {
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    public final void scanQR() {
    }
}