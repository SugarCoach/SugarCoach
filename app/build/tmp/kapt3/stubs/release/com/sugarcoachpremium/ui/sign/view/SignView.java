package com.sugarcoachpremium.ui.sign.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\f"}, d2 = {"Lcom/sugarcoachpremium/ui/sign/view/SignView;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "googleSignIntent", "", "mGoogleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "RC_SIGN_IN", "", "onEmailSign", "onFacebookLogin", "onGoogleLogin", "showSuccessToast", "app_release"})
public abstract interface SignView extends com.sugarcoachpremium.ui.base.view.BaseView {
    
    public abstract void onGoogleLogin();
    
    public abstract void googleSignIntent(@org.jetbrains.annotations.NotNull
    com.google.android.gms.auth.api.signin.GoogleSignInClient mGoogleSignInClient, int RC_SIGN_IN);
    
    public abstract void onFacebookLogin();
    
    public abstract void onEmailSign();
    
    public abstract void showSuccessToast();
}