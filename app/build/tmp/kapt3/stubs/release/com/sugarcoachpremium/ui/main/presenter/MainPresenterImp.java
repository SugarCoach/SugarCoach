package com.sugarcoachpremium.ui.main.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0007H&J\b\u0010\u000f\u001a\u00020\u0007H&J3\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H&\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0007H&\u00a8\u0006\u001a"}, d2 = {"Lcom/sugarcoachpremium/ui/main/presenter/MainPresenterImp;", "V", "Lcom/sugarcoachpremium/ui/main/view/MainView;", "I", "Lcom/sugarcoachpremium/ui/main/interactor/MainInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/Presenter;", "checkAndRequestPermissions", "", "context", "Landroid/app/Activity;", "goToActivityConfig", "goToActivityDaily", "goToActivityProfile", "goToActivityRegister", "goToActivityStatistics", "goToActivityTreatment", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(Landroid/app/Activity;I[Ljava/lang/String;[I)V", "onResume", "app_release"})
public abstract interface MainPresenterImp<V extends com.sugarcoachpremium.ui.main.view.MainView, I extends com.sugarcoachpremium.ui.main.interactor.MainInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.Presenter<V, I> {
    
    public abstract void goToActivityRegister();
    
    public abstract void goToActivityTreatment();
    
    public abstract void goToActivityDaily();
    
    public abstract void goToActivityProfile();
    
    public abstract void goToActivityConfig();
    
    public abstract void goToActivityStatistics();
    
    public abstract void onResume();
    
    public abstract void onRequestPermissionsResult(@org.jetbrains.annotations.NotNull
    android.app.Activity context, int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults);
    
    public abstract void checkAndRequestPermissions(@org.jetbrains.annotations.NotNull
    android.app.Activity context);
}