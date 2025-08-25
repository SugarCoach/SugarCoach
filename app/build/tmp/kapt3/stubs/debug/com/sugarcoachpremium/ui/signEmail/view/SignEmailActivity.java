package com.sugarcoachpremium.ui.signEmail.view;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\"\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u001bH\u0014J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u001bH\u0016J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u0019H\u0016J\b\u0010*\u001a\u00020\u001bH\u0002J\b\u0010+\u001a\u00020\u001bH\u0002J\b\u0010,\u001a\u00020\u001bH\u0002J\b\u0010-\u001a\u00020\u001bH\u0002J\b\u0010.\u001a\u00020\u001bH\u0016R*\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/sugarcoachpremium/ui/signEmail/view/SignEmailActivity;", "Lcom/sugarcoachpremium/ui/base/view/BaseActivity;", "Lcom/sugarcoachpremium/ui/signEmail/view/SignEmailView;", "<init>", "()V", "presenter", "Lcom/sugarcoachpremium/ui/signEmail/presenter/SignEmailPresenterImp;", "Lcom/sugarcoachpremium/ui/signEmail/interactor/SignEmailInteractorImp;", "getPresenter", "()Lcom/sugarcoachpremium/ui/signEmail/presenter/SignEmailPresenterImp;", "setPresenter", "(Lcom/sugarcoachpremium/ui/signEmail/presenter/SignEmailPresenterImp;)V", "binding", "Lcom/sugarcoachpremium/databinding/ActivitySignEmailBinding;", "getBinding", "()Lcom/sugarcoachpremium/databinding/ActivitySignEmailBinding;", "setBinding", "(Lcom/sugarcoachpremium/databinding/ActivitySignEmailBinding;)V", "callbackManager", "Lcom/facebook/CallbackManager;", "googleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "RC_SIGN_IN", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "showErrorToast", "msg", "", "onSign", "showValidationMessage", "errorCode", "setOnClickListeners", "configureFacebook", "googleLogin", "configureGoogle", "startMain", "app_debug"})
public final class SignEmailActivity extends com.sugarcoachpremium.ui.base.view.BaseActivity implements com.sugarcoachpremium.ui.signEmail.view.SignEmailView {
    @javax.inject.Inject()
    public com.sugarcoachpremium.ui.signEmail.presenter.SignEmailPresenterImp<com.sugarcoachpremium.ui.signEmail.view.SignEmailView, com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractorImp> presenter;
    public com.sugarcoachpremium.databinding.ActivitySignEmailBinding binding;
    private com.facebook.CallbackManager callbackManager;
    private com.google.android.gms.auth.api.signin.GoogleSignInClient googleSignInClient;
    private com.google.firebase.auth.FirebaseAuth auth;
    private final int RC_SIGN_IN = 123;
    
    public SignEmailActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.signEmail.presenter.SignEmailPresenterImp<com.sugarcoachpremium.ui.signEmail.view.SignEmailView, com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractorImp> getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.signEmail.presenter.SignEmailPresenterImp<com.sugarcoachpremium.ui.signEmail.view.SignEmailView, com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractorImp> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.databinding.ActivitySignEmailBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.databinding.ActivitySignEmailBinding p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void showErrorToast(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void onSign() {
    }
    
    @java.lang.Override()
    public void showValidationMessage(int errorCode) {
    }
    
    private final void setOnClickListeners() {
    }
    
    private final void configureFacebook() {
    }
    
    private final void googleLogin() {
    }
    
    private final void configureGoogle() {
    }
    
    @java.lang.Override()
    public void startMain() {
    }
}