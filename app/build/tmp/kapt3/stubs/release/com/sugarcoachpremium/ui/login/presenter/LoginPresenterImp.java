package com.sugarcoachpremium.ui.login.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J+\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0007H&J\b\u0010\u000f\u001a\u00020\u0007H&J\b\u0010\u0010\u001a\u00020\u0007H&J\b\u0010\u0011\u001a\u00020\tH&J(\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/sugarcoachpremium/ui/login/presenter/LoginPresenterImp;", "V", "Lcom/sugarcoachpremium/ui/login/view/LoginView;", "I", "Lcom/sugarcoachpremium/ui/login/interactor/LoginInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/Presenter;", "activityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "(IILandroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emailSign", "feedInDatabase", "forgot", "getBarcode", "onLogin", "email", "", "password", "mirror", "", "medico", "app_release"})
public abstract interface LoginPresenterImp<V extends com.sugarcoachpremium.ui.login.view.LoginView, I extends com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.Presenter<V, I> {
    
    public abstract void onLogin(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, boolean mirror, boolean medico);
    
    public abstract void emailSign();
    
    public abstract void forgot();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object activityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    public abstract int getBarcode();
    
    public abstract void feedInDatabase();
}