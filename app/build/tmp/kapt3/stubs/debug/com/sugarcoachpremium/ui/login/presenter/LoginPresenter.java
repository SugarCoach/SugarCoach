package com.sugarcoachpremium.ui.login.presenter;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B!\b\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ(\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0016J\u0018\u0010#\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010\u0017H\u0082@\u00a2\u0006\u0002\u0010%J.\u0010&\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0082@\u00a2\u0006\u0002\u0010\'J\'\u0010(\u001a\u0004\u0018\u00010\u001d2\u0006\u0010)\u001a\u00020*2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0002\u0010+J\u0006\u0010,\u001a\u00020\u001dJ\u0014\u0010-\u001a\u00020\u001d2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/J\b\u00101\u001a\u00020\u001dH\u0016J\b\u00102\u001a\u00020\u001dH\u0016J\b\u00103\u001a\u00020\u001dH\u0016J\b\u00104\u001a\u00020\u001dH\u0002J\b\u00105\u001a\u00020\u001dH\u0002J\b\u00106\u001a\u00020\u001dH\u0002J\b\u00107\u001a\u00020\u001dH\u0002J\b\u00108\u001a\u00020\u001dH\u0002J(\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010=H\u0096@\u00a2\u0006\u0002\u0010>J\b\u0010?\u001a\u00020\u000fH\u0016R\u0014\u0010\u000e\u001a\u00020\u000fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006@"}, d2 = {"Lcom/sugarcoachpremium/ui/login/presenter/LoginPresenter;", "V", "Lcom/sugarcoachpremium/ui/login/view/LoginView;", "I", "Lcom/sugarcoachpremium/ui/login/interactor/LoginInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/BasePresenter;", "Lcom/sugarcoachpremium/ui/login/presenter/LoginPresenterImp;", "interactor", "schedulerProvider", "Lcom/sugarcoachpremium/util/SchedulerProvider;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "<init>", "(Lcom/sugarcoachpremium/ui/login/interactor/LoginInteractorImp;Lcom/sugarcoachpremium/util/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "barcodeREQUEST", "", "getBarcodeREQUEST", "()I", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "getAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "userId", "", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "onLogin", "", "email", "password", "mirror", "", "medico", "updateUser", "firebaseUID", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suspendLogin", "(Ljava/lang/String;Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserInSharedPref", "loginResponse", "Lcom/sugarcoachpremium/data/network/LoginResponse;", "(Lcom/sugarcoachpremium/data/network/LoginResponse;ZZ)Lkotlin/Unit;", "getRegisters", "saveRegisters", "registers", "", "Lcom/sugarcoachpremium/data/network/RegistersResponse;", "emailSign", "forgot", "feedInDatabase", "createdTreament", "createdCategories", "createdExercises", "createdStates", "createdTreatmentHorarios", "activityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "(IILandroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBarcode", "app_debug"})
public final class LoginPresenter<V extends com.sugarcoachpremium.ui.login.view.LoginView, I extends com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.BasePresenter<V, I> implements com.sugarcoachpremium.ui.login.presenter.LoginPresenterImp<V, I> {
    private final int barcodeREQUEST = 1002;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    public java.lang.String userId;
    
    @javax.inject.Inject()
    public LoginPresenter(@org.jetbrains.annotations.NotNull()
    I interactor, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable) {
        super(null, null, null);
    }
    
    public final int getBarcodeREQUEST() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.auth.FirebaseAuth getAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void onLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, boolean mirror, boolean medico) {
    }
    
    private final java.lang.Object updateUser(java.lang.String firebaseUID, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object suspendLogin(java.lang.String email, java.lang.String password, boolean mirror, boolean medico, kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    private final kotlin.Unit updateUserInSharedPref(com.sugarcoachpremium.data.network.LoginResponse loginResponse, boolean mirror, boolean medico) {
        return null;
    }
    
    public final void getRegisters() {
    }
    
    public final void saveRegisters(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.network.RegistersResponse> registers) {
    }
    
    @java.lang.Override()
    public void emailSign() {
    }
    
    @java.lang.Override()
    public void forgot() {
    }
    
    @java.lang.Override()
    public void feedInDatabase() {
    }
    
    private final void createdTreament() {
    }
    
    private final void createdCategories() {
    }
    
    private final void createdExercises() {
    }
    
    private final void createdStates() {
    }
    
    private final void createdTreatmentHorarios() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object activityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    public int getBarcode() {
        return 0;
    }
}