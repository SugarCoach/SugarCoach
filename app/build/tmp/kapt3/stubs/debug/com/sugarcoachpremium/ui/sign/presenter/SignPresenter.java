package com.sugarcoachpremium.ui.sign.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B\u001f\b\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\"\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020!H\u0016J\u0010\u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020\u001dH\u0016J\u0016\u0010/\u001a\u00020!2\f\u00100\u001a\b\u0012\u0004\u0012\u00020201H\u0002J\u0017\u00103\u001a\u0004\u0018\u00010!2\u0006\u00104\u001a\u000205H\u0002\u00a2\u0006\u0002\u00106R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR2\u0010\u001b\u001a&\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d \u001e*\u0012\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d\u0018\u00010\u001f0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/sugarcoachpremium/ui/sign/presenter/SignPresenter;", "V", "Lcom/sugarcoachpremium/ui/sign/view/SignView;", "I", "Lcom/sugarcoachpremium/ui/sign/interactor/SignInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/BasePresenter;", "Lcom/sugarcoachpremium/ui/sign/presenter/SignPresenterImp;", "interactor", "schedulerProvider", "Lcom/sugarcoachpremium/util/SchedulerProvider;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/sugarcoachpremium/ui/sign/interactor/SignInteractorImp;Lcom/sugarcoachpremium/util/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "RC_SIGN_IN", "", "getRC_SIGN_IN", "()I", "setRC_SIGN_IN", "(I)V", "callbackManager", "Lcom/facebook/CallbackManager;", "mGoogleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "getMGoogleSignInClient", "()Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "setMGoogleSignInClient", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;)V", "permissionNeeds", "", "", "kotlin.jvm.PlatformType", "", "activityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "emailSign", "facebookLogin", "context", "Landroid/content/Context;", "facebookSuccess", "accessToken", "Lcom/facebook/AccessToken;", "googleLogin", "client", "googleSuccess", "task", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "updateUser", "loginResponse", "Lcom/sugarcoachpremium/data/network/LoginResponse;", "(Lcom/sugarcoachpremium/data/network/LoginResponse;)Lkotlin/Unit;", "app_debug"})
public final class SignPresenter<V extends com.sugarcoachpremium.ui.sign.view.SignView, I extends com.sugarcoachpremium.ui.sign.interactor.SignInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.BasePresenter<V, I> implements com.sugarcoachpremium.ui.sign.presenter.SignPresenterImp<V, I> {
    @org.jetbrains.annotations.Nullable
    private com.facebook.CallbackManager callbackManager;
    private final java.util.List<java.lang.String> permissionNeeds = null;
    public com.google.android.gms.auth.api.signin.GoogleSignInClient mGoogleSignInClient;
    private int RC_SIGN_IN = 1010;
    
    @javax.inject.Inject
    public SignPresenter(@org.jetbrains.annotations.NotNull
    I interactor, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull
    io.reactivex.disposables.CompositeDisposable disposable) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.auth.api.signin.GoogleSignInClient getMGoogleSignInClient() {
        return null;
    }
    
    public final void setMGoogleSignInClient(@org.jetbrains.annotations.NotNull
    com.google.android.gms.auth.api.signin.GoogleSignInClient p0) {
    }
    
    public final int getRC_SIGN_IN() {
        return 0;
    }
    
    public final void setRC_SIGN_IN(int p0) {
    }
    
    @java.lang.Override
    public void facebookLogin(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    public void googleLogin(@org.jetbrains.annotations.NotNull
    java.lang.String client) {
    }
    
    @java.lang.Override
    public void emailSign() {
    }
    
    @java.lang.Override
    public void activityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    private final void facebookSuccess(com.facebook.AccessToken accessToken) {
    }
    
    private final void googleSuccess(com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> task) {
    }
    
    private final kotlin.Unit updateUser(com.sugarcoachpremium.data.network.LoginResponse loginResponse) {
        return null;
    }
}