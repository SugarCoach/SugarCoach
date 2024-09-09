package com.sugarcoachpremium.ui.config.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B\u001f\b\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ(\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\"j\b\u0012\u0004\u0012\u00020\u000e`#H\u0016J\u000f\u0010\u0019\u001a\u0004\u0018\u00010$H\u0002\u00a2\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u001eH\u0016J\b\u0010\'\u001a\u00020\u001eH\u0016J\b\u0010(\u001a\u00020\u001eH\u0016J\b\u0010)\u001a\u00020\u001eH\u0016J\u0017\u0010*\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010,J3\u0010-\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010.\u001a\u00020\u00142\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e002\u0006\u00101\u001a\u000202H\u0016\u00a2\u0006\u0002\u00103J\u0017\u00104\u001a\u00020\u001e2\b\u00105\u001a\u0004\u0018\u00010$H\u0016\u00a2\u0006\u0002\u00106J\u0017\u00107\u001a\u00020\u001e2\b\u00105\u001a\u0004\u0018\u00010$H\u0016\u00a2\u0006\u0002\u00106J\u001f\u00108\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u00105\u001a\u0004\u0018\u00010$H\u0016\u00a2\u0006\u0002\u00109J\u0012\u0010:\u001a\u00020\u001e2\b\u00105\u001a\u0004\u0018\u00010\u000eH\u0016J\u001f\u0010;\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u00105\u001a\u0004\u0018\u00010$H\u0016\u00a2\u0006\u0002\u00109J\u0012\u0010<\u001a\u00020\u001e2\b\u00105\u001a\u0004\u0018\u00010\u000eH\u0016R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006="}, d2 = {"Lcom/sugarcoachpremium/ui/config/presenter/ConfigPresenter;", "V", "Lcom/sugarcoachpremium/ui/config/view/ConfigView;", "I", "Lcom/sugarcoachpremium/ui/config/interactor/ConfigInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/BasePresenter;", "Lcom/sugarcoachpremium/ui/config/presenter/ConfigPresenterImp;", "interactor", "schedulerProvider", "Lcom/sugarcoachpremium/util/SchedulerProvider;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/sugarcoachpremium/ui/config/interactor/ConfigInteractorImp;Lcom/sugarcoachpremium/util/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "permision", "", "getPermision", "()Ljava/lang/String;", "setPermision", "(Ljava/lang/String;)V", "permissionRequest", "", "getPermissionRequest", "()I", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "getUser", "()Lcom/sugarcoachpremium/data/database/repository/user/User;", "setUser", "(Lcom/sugarcoachpremium/data/database/repository/user/User;)V", "checkAndRequestPermissions", "", "context", "Landroid/app/Activity;", "permission", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "", "()Ljava/lang/Boolean;", "goToActivityDaily", "goToActivityMain", "goToActivityStatistic", "goToActivityTreament", "onAttach", "view", "(Lcom/sugarcoachpremium/ui/config/view/ConfigView;)V", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(Landroid/app/Activity;I[Ljava/lang/String;[I)V", "updateControl", "value", "(Ljava/lang/Boolean;)V", "updateControlMedico", "updateGeo", "(Landroid/app/Activity;Ljava/lang/Boolean;)V", "updateNumber", "updateSms", "updateType", "app_debug"})
public final class ConfigPresenter<V extends com.sugarcoachpremium.ui.config.view.ConfigView, I extends com.sugarcoachpremium.ui.config.interactor.ConfigInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.BasePresenter<V, I> implements com.sugarcoachpremium.ui.config.presenter.ConfigPresenterImp<V, I> {
    public com.sugarcoachpremium.data.database.repository.user.User user;
    private final int permissionRequest = 101;
    public java.lang.String permision;
    
    @javax.inject.Inject
    public ConfigPresenter(@org.jetbrains.annotations.NotNull
    I interactor, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull
    io.reactivex.disposables.CompositeDisposable disposable) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.database.repository.user.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User p0) {
    }
    
    public final int getPermissionRequest() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPermision() {
        return null;
    }
    
    public final void setPermision(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.Nullable
    V view) {
    }
    
    @java.lang.Override
    public void updateControlMedico(@org.jetbrains.annotations.Nullable
    java.lang.Boolean value) {
    }
    
    @java.lang.Override
    public void updateControl(@org.jetbrains.annotations.Nullable
    java.lang.Boolean value) {
    }
    
    @java.lang.Override
    public void updateSms(@org.jetbrains.annotations.NotNull
    android.app.Activity context, @org.jetbrains.annotations.Nullable
    java.lang.Boolean value) {
    }
    
    @java.lang.Override
    public void updateGeo(@org.jetbrains.annotations.NotNull
    android.app.Activity context, @org.jetbrains.annotations.Nullable
    java.lang.Boolean value) {
    }
    
    @java.lang.Override
    public void updateNumber(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @java.lang.Override
    public void updateType(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    private final java.lang.Boolean getUser() {
        return null;
    }
    
    @java.lang.Override
    public void goToActivityDaily() {
    }
    
    @java.lang.Override
    public void goToActivityMain() {
    }
    
    @java.lang.Override
    public void goToActivityStatistic() {
    }
    
    @java.lang.Override
    public void goToActivityTreament() {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(@org.jetbrains.annotations.NotNull
    android.app.Activity context, int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    @java.lang.Override
    public void checkAndRequestPermissions(@org.jetbrains.annotations.NotNull
    android.app.Activity context, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.String> permission) {
    }
}