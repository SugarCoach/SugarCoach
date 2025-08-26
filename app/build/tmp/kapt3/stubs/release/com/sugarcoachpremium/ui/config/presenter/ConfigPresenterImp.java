package com.sugarcoachpremium.ui.config.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\b\u0010\r\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0007H&J\b\u0010\u000f\u001a\u00020\u0007H&J\b\u0010\u0010\u001a\u00020\u0007H&J3\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&\u00a2\u0006\u0002\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&\u00a2\u0006\u0002\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&\u00a2\u0006\u0002\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&\u00a2\u0006\u0002\u0010\u001fJ\u0012\u0010 \u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\fH&J\u001f\u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&\u00a2\u0006\u0002\u0010\u001fJ\u0012\u0010\"\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\fH&\u00a8\u0006#"}, d2 = {"Lcom/sugarcoachpremium/ui/config/presenter/ConfigPresenterImp;", "V", "Lcom/sugarcoachpremium/ui/config/view/ConfigView;", "I", "Lcom/sugarcoachpremium/ui/config/interactor/ConfigInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/Presenter;", "checkAndRequestPermissions", "", "context", "Landroid/app/Activity;", "permission", "Ljava/util/ArrayList;", "", "goToActivityDaily", "goToActivityMain", "goToActivityStatistic", "goToActivityTreament", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(Landroid/app/Activity;I[Ljava/lang/String;[I)V", "updateControl", "value", "", "(Ljava/lang/Boolean;)V", "updateControlMedico", "updateGeo", "(Landroid/app/Activity;Ljava/lang/Boolean;)V", "updateNumber", "updateSms", "updateType", "app_release"})
public abstract interface ConfigPresenterImp<V extends com.sugarcoachpremium.ui.config.view.ConfigView, I extends com.sugarcoachpremium.ui.config.interactor.ConfigInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.Presenter<V, I> {
    
    public abstract void updateControl(@org.jetbrains.annotations.Nullable
    java.lang.Boolean value);
    
    public abstract void updateControlMedico(@org.jetbrains.annotations.Nullable
    java.lang.Boolean value);
    
    public abstract void updateSms(@org.jetbrains.annotations.NotNull
    android.app.Activity context, @org.jetbrains.annotations.Nullable
    java.lang.Boolean value);
    
    public abstract void updateGeo(@org.jetbrains.annotations.NotNull
    android.app.Activity context, @org.jetbrains.annotations.Nullable
    java.lang.Boolean value);
    
    public abstract void updateNumber(@org.jetbrains.annotations.Nullable
    java.lang.String value);
    
    public abstract void updateType(@org.jetbrains.annotations.Nullable
    java.lang.String value);
    
    public abstract void goToActivityDaily();
    
    public abstract void goToActivityMain();
    
    public abstract void goToActivityStatistic();
    
    public abstract void goToActivityTreament();
    
    public abstract void onRequestPermissionsResult(@org.jetbrains.annotations.NotNull
    android.app.Activity context, int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults);
    
    public abstract void checkAndRequestPermissions(@org.jetbrains.annotations.NotNull
    android.app.Activity context, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.String> permission);
}