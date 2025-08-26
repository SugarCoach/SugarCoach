package com.sugarcoachpremium.ui.sign.interactor;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H&\u00a8\u0006\r\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/sign/interactor/SignInteractorImp;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "doFBLoginApiCall", "Lio/reactivex/Observable;", "Lcom/sugarcoachpremium/data/network/LoginResponse;", "accessToken", "Lcom/facebook/AccessToken;", "doGoogleLoginApiCall", "token", "", "updateUser", "", "loginResponse", "app_debug"})
public abstract interface SignInteractorImp extends com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.sugarcoachpremium.data.network.LoginResponse> doFBLoginApiCall(@org.jetbrains.annotations.NotNull()
    com.facebook.AccessToken accessToken);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.sugarcoachpremium.data.network.LoginResponse> doGoogleLoginApiCall(@org.jetbrains.annotations.Nullable()
    java.lang.String token);
    
    public abstract void updateUser(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.network.LoginResponse loginResponse);
}