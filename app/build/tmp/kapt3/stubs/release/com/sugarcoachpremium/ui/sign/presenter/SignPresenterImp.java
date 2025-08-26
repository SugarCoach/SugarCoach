package com.sugarcoachpremium.ui.sign.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H&\u00a8\u0006\u0014"}, d2 = {"Lcom/sugarcoachpremium/ui/sign/presenter/SignPresenterImp;", "V", "Lcom/sugarcoachpremium/ui/sign/view/SignView;", "I", "Lcom/sugarcoachpremium/ui/sign/interactor/SignInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/Presenter;", "activityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "emailSign", "facebookLogin", "context", "Landroid/content/Context;", "googleLogin", "client", "", "app_release"})
public abstract interface SignPresenterImp<V extends com.sugarcoachpremium.ui.sign.view.SignView, I extends com.sugarcoachpremium.ui.sign.interactor.SignInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.Presenter<V, I> {
    
    public abstract void googleLogin(@org.jetbrains.annotations.NotNull
    java.lang.String client);
    
    public abstract void facebookLogin(@org.jetbrains.annotations.NotNull
    android.content.Context context);
    
    public abstract void emailSign();
    
    public abstract void activityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data);
}