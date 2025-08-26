package com.sugarcoachpremium.ui.forgot.interactor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/sugarcoachpremium/ui/forgot/interactor/ForgotInteractorImp;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "doServerForgotApiCall", "Lio/reactivex/Observable;", "Lcom/sugarcoachpremium/data/network/LoginResponse;", "email", "", "app_release"})
public abstract interface ForgotInteractorImp extends com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<com.sugarcoachpremium.data.network.LoginResponse> doServerForgotApiCall(@org.jetbrains.annotations.NotNull
    java.lang.String email);
}