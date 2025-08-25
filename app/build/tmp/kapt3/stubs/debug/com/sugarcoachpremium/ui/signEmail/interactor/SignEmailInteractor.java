package com.sugarcoachpremium.ui.signEmail.interactor;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0017J \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0#2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096@\u00a2\u0006\u0004\b$\u0010%J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010.\u001a\u00020/H\u0016J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020\u001f0#2\u0006\u0010.\u001a\u00020/H\u0096@\u00a2\u0006\u0004\b1\u00102J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f0#H\u0096@\u00a2\u0006\u0004\b4\u00105J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006@"}, d2 = {"Lcom/sugarcoachpremium/ui/signEmail/interactor/SignEmailInteractor;", "Lcom/sugarcoachpremium/data/ui/base/interactor/BaseInteractor;", "Lcom/sugarcoachpremium/ui/signEmail/interactor/SignEmailInteractorImp;", "mContext", "Landroid/content/Context;", "treamentRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;", "dailyRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;", "userRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;", "preferenceHelper", "Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;", "apiHelper", "Lcom/sugarcoachpremium/data/network/ApiHelper;", "<init>", "(Landroid/content/Context;Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;Lcom/sugarcoachpremium/data/network/ApiHelper;)V", "apiRepository", "Lcom/sugarcoachpremium/data/api_db/ApiRepository;", "getApiRepository", "()Lcom/sugarcoachpremium/data/api_db/ApiRepository;", "setApiRepository", "(Lcom/sugarcoachpremium/data/api_db/ApiRepository;)V", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "getUser", "()Lcom/sugarcoachpremium/data/database/repository/user/User;", "setUser", "(Lcom/sugarcoachpremium/data/database/repository/user/User;)V", "updateUser", "Lio/reactivex/Observable;", "", "signResponse", "Lcom/google/firebase/auth/FirebaseUser;", "updateCloudUser", "Lkotlin/Result;", "updateCloudUser-gIAlu-s", "(Lcom/google/firebase/auth/FirebaseUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveRegisters", "registersResponse", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "updateUserSocial", "", "loginResponse", "Lcom/sugarcoachpremium/data/network/LoginResponse;", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "insertTreatment", "insertTreatment-gIAlu-s", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createUserData", "createUserData-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "category", "exercises", "states", "treamentHorarios", "treamentBasalHora", "treatmentHorariosCorrectora", "getBasal", "getMedidor", "getBombas", "getCorrectora", "app_debug"})
public final class SignEmailInteractor extends com.sugarcoachpremium.data.ui.base.interactor.BaseInteractor implements com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractorImp {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sugarcoachpremium.data.database.repository.treament.TreamentRepo treamentRepoHelper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo dailyRepoHelper = null;
    @javax.inject.Inject()
    public com.sugarcoachpremium.data.api_db.ApiRepository apiRepository;
    public com.sugarcoachpremium.data.database.repository.user.User user;
    
    @javax.inject.Inject()
    public SignEmailInteractor(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.TreamentRepo treamentRepoHelper, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo dailyRepoHelper, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.user.UserRepo userRepoHelper, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.di.preferences.PreferenceHelper preferenceHelper, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.network.ApiHelper apiHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.api_db.ApiRepository getApiRepository() {
        return null;
    }
    
    public final void setApiRepository(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.api_db.ApiRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.user.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.user.User p0) {
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> updateUser(@org.jetbrains.annotations.Nullable()
    com.google.firebase.auth.FirebaseUser signResponse) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> saveRegisters(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister> registersResponse) {
        return null;
    }
    
    @java.lang.Override()
    public void updateUserSocial(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.network.LoginResponse loginResponse) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> treament(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.Treament treament) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> category() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> exercises() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> states() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> treamentHorarios() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> treamentBasalHora() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> treatmentHorariosCorrectora() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> getBasal() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> getMedidor() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> getBombas() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> getCorrectora() {
        return null;
    }
}