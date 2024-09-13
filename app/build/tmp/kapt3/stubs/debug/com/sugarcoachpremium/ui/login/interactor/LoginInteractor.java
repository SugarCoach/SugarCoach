package com.sugarcoachpremium.ui.login.interactor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0\u0017H\u0016J.\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0(2\b\u0010*\u001a\u0004\u0018\u00010\u001cH\u0096@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b+\u0010,J!\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010.\u001a\u0004\u0018\u00010)H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u00101\u001a\b\u0012\u0004\u0012\u0002020%H\u0016J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u00104\u001a\u000205H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J \u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u0018H\u0016R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006>"}, d2 = {"Lcom/sugarcoachpremium/ui/login/interactor/LoginInteractor;", "Lcom/sugarcoachpremium/data/ui/base/interactor/BaseInteractor;", "Lcom/sugarcoachpremium/ui/login/interactor/LoginInteractorImp;", "mContext", "Landroid/content/Context;", "dailyRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;", "treamentRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;", "userRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;", "preferenceHelper", "Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;", "apiHelper", "Lcom/sugarcoachpremium/data/network/ApiHelper;", "(Landroid/content/Context;Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;Lcom/sugarcoachpremium/data/network/ApiHelper;)V", "apiRepository", "Lcom/sugarcoachpremium/data/api_db/ApiRepository;", "getApiRepository", "()Lcom/sugarcoachpremium/data/api_db/ApiRepository;", "setApiRepository", "(Lcom/sugarcoachpremium/data/api_db/ApiRepository;)V", "category", "Lio/reactivex/Observable;", "", "doServerLoginpiCall", "Lcom/sugarcoachpremium/data/network/LoginResponse;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exercises", "getBasal", "getBombas", "getCorrectora", "getMedidor", "getRegistersCall", "", "Lcom/sugarcoachpremium/data/network/RegistersResponse;", "getUserData", "Lkotlin/Result;", "Lcom/sugarcoachpremium/GetUserByUIDQuery$Data1;", "userUID", "getUserData-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeLocalUser", "cloudUser", "(Lcom/sugarcoachpremium/GetUserByUIDQuery$Data1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveRegisters", "registersResponse", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "states", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "treamentHorarios", "treatmentBasalHora", "treatmentHorariosCorrectora", "updateUserInSharedPref", "", "loginResponse", "mirror", "medico", "app_debug"})
public final class LoginInteractor extends com.sugarcoachpremium.data.ui.base.interactor.BaseInteractor implements com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull
    private final com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo dailyRepoHelper = null;
    @org.jetbrains.annotations.NotNull
    private final com.sugarcoachpremium.data.database.repository.treament.TreamentRepo treamentRepoHelper = null;
    @javax.inject.Inject
    public com.sugarcoachpremium.data.api_db.ApiRepository apiRepository;
    
    @javax.inject.Inject
    public LoginInteractor(@org.jetbrains.annotations.NotNull
    android.content.Context mContext, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo dailyRepoHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentRepo treamentRepoHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.UserRepo userRepoHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.di.preferences.PreferenceHelper preferenceHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.network.ApiHelper apiHelper) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.api_db.ApiRepository getApiRepository() {
        return null;
    }
    
    public final void setApiRepository(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.api_db.ApiRepository p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object doServerLoginpiCall(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.reactivex.Observable<com.sugarcoachpremium.data.network.LoginResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object makeLocalUser(@org.jetbrains.annotations.Nullable
    com.sugarcoachpremium.GetUserByUIDQuery.Data1 cloudUser, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.reactivex.Observable<java.lang.Boolean>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.util.List<com.sugarcoachpremium.data.network.RegistersResponse>> getRegistersCall() {
        return null;
    }
    
    @java.lang.Override
    public void updateUserInSharedPref(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.network.LoginResponse loginResponse, boolean mirror, boolean medico) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> saveRegisters(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister> registersResponse) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> treament(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.Treament treament) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> category() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> exercises() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> states() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> treamentHorarios() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> treatmentHorariosCorrectora() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> treatmentBasalHora() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> getBasal() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> getMedidor() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> getCorrectora() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> getBombas() {
        return null;
    }
}