package com.sugarcoachpremium.ui.main.presenter;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B!\b\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020 H\u0016J\b\u0010$\u001a\u00020 H\u0002J\u0006\u0010%\u001a\u00020 J\b\u0010&\u001a\u00020 H\u0016J\b\u0010\'\u001a\u00020 H\u0016J\b\u0010(\u001a\u00020 H\u0016J\b\u0010)\u001a\u00020 H\u0016J\b\u0010*\u001a\u00020 H\u0016J\b\u0010+\u001a\u00020 H\u0016J\u000f\u0010,\u001a\u0004\u0018\u00010-H\u0002\u00a2\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020 2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020 2\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020 H\u0002J\u0012\u00106\u001a\u00020 2\b\u00107\u001a\u0004\u0018\u000108H\u0002J \u00109\u001a\u00020 2\b\u00107\u001a\u0004\u0018\u0001082\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0002J\u001e\u0010=\u001a\u00020-2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?J3\u0010B\u001a\u00020 2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00152\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001a0G2\u0006\u0010H\u001a\u00020IH\u0016\u00a2\u0006\u0002\u0010JJ\u0010\u0010K\u001a\u00020 2\u0006\u0010C\u001a\u00020DH\u0016R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006L"}, d2 = {"Lcom/sugarcoachpremium/ui/main/presenter/MainPresenter;", "V", "Lcom/sugarcoachpremium/ui/main/view/MainView;", "I", "Lcom/sugarcoachpremium/ui/main/interactor/MainInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/BasePresenter;", "Lcom/sugarcoachpremium/ui/main/presenter/MainPresenterImp;", "interactor", "schedulerProvider", "Lcom/sugarcoachpremium/util/SchedulerProvider;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "<init>", "(Lcom/sugarcoachpremium/ui/main/interactor/MainInteractorImp;Lcom/sugarcoachpremium/util/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "currentDate", "Lorg/joda/time/LocalDateTime;", "getCurrentDate", "()Lorg/joda/time/LocalDateTime;", "setCurrentDate", "(Lorg/joda/time/LocalDateTime;)V", "permissionRequest", "", "getPermissionRequest", "()I", "permision", "", "", "getPermision", "()Ljava/util/List;", "setPermision", "(Ljava/util/List;)V", "onAttach", "", "view", "(Lcom/sugarcoachpremium/ui/main/view/MainView;)V", "onResume", "getTreatment", "deleteRegisters", "goToActivityTreatment", "goToActivityRegister", "goToActivityDaily", "goToActivityProfile", "goToActivityConfig", "goToActivityStatistics", "getUser", "", "()Ljava/lang/Boolean;", "getPromedios", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "checkDaily", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "getLastDaily", "getCategories", "dailyRegister", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "getMedition", "category", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Category;", "timeBetween", "time", "Lorg/joda/time/LocalTime;", "startTime", "endTime", "onRequestPermissionsResult", "context", "Landroid/app/Activity;", "requestCode", "permissions", "", "grantResults", "", "(Landroid/app/Activity;I[Ljava/lang/String;[I)V", "checkAndRequestPermissions", "app_debug"})
public final class MainPresenter<V extends com.sugarcoachpremium.ui.main.view.MainView, I extends com.sugarcoachpremium.ui.main.interactor.MainInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.BasePresenter<V, I> implements com.sugarcoachpremium.ui.main.presenter.MainPresenterImp<V, I> {
    public org.joda.time.LocalDateTime currentDate;
    private final int permissionRequest = 101;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> permision;
    
    @javax.inject.Inject()
    public MainPresenter(@org.jetbrains.annotations.NotNull()
    I interactor, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.joda.time.LocalDateTime getCurrentDate() {
        return null;
    }
    
    public final void setCurrentDate(@org.jetbrains.annotations.NotNull()
    org.joda.time.LocalDateTime p0) {
    }
    
    public final int getPermissionRequest() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPermision() {
        return null;
    }
    
    public final void setPermision(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    V view) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void getTreatment() {
    }
    
    public final void deleteRegisters() {
    }
    
    @java.lang.Override()
    public void goToActivityTreatment() {
    }
    
    @java.lang.Override()
    public void goToActivityRegister() {
    }
    
    @java.lang.Override()
    public void goToActivityDaily() {
    }
    
    @java.lang.Override()
    public void goToActivityProfile() {
    }
    
    @java.lang.Override()
    public void goToActivityConfig() {
    }
    
    @java.lang.Override()
    public void goToActivityStatistics() {
    }
    
    private final java.lang.Boolean getUser() {
        return null;
    }
    
    private final void getPromedios(com.sugarcoachpremium.data.database.repository.treament.Treament treament) {
    }
    
    private final void checkDaily(com.sugarcoachpremium.data.database.repository.user.User user) {
    }
    
    private final void getLastDaily() {
    }
    
    private final void getCategories(com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister) {
    }
    
    private final void getMedition(com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister, java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> category) {
    }
    
    public final boolean timeBetween(@org.jetbrains.annotations.NotNull()
    org.joda.time.LocalTime time, @org.jetbrains.annotations.NotNull()
    org.joda.time.LocalTime startTime, @org.jetbrains.annotations.NotNull()
    org.joda.time.LocalTime endTime) {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void checkAndRequestPermissions(@org.jetbrains.annotations.NotNull()
    android.app.Activity context) {
    }
}