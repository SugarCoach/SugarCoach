package com.sugarcoachpremium.ui.login.interactor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0003H&J.\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u00a6@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0011H&J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010 \u001a\u00020!H&J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J \u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004H&\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006*"}, d2 = {"Lcom/sugarcoachpremium/ui/login/interactor/LoginInteractorImp;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "category", "Lio/reactivex/Observable;", "", "doServerLoginpiCall", "Lcom/sugarcoachpremium/data/network/LoginResponse;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exercises", "getBasal", "getBombas", "getCorrectora", "getMedidor", "getRegistersCall", "", "Lcom/sugarcoachpremium/data/network/RegistersResponse;", "getUserData", "Lkotlin/Result;", "Lcom/sugarcoachpremium/GetUserByUIDQuery$Data1;", "userUID", "getUserData-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeLocalUser", "cloudUser", "(Lcom/sugarcoachpremium/GetUserByUIDQuery$Data1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveRegisters", "registersResponse", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "states", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "treamentHorarios", "treatmentBasalHora", "treatmentHorariosCorrectora", "updateUserInSharedPref", "", "loginResponse", "mirror", "medico", "app_debug"})
public abstract interface LoginInteractorImp extends com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object makeLocalUser(@org.jetbrains.annotations.Nullable
    com.sugarcoachpremium.GetUserByUIDQuery.Data1 cloudUser, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.reactivex.Observable<java.lang.Boolean>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object doServerLoginpiCall(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.reactivex.Observable<com.sugarcoachpremium.data.network.LoginResponse>> $completion);
    
    public abstract void updateUserInSharedPref(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.network.LoginResponse loginResponse, boolean mirror, boolean medico);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> treament(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.Treament treament);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> category();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> states();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> exercises();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> treamentHorarios();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> treatmentHorariosCorrectora();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> treatmentBasalHora();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> getBasal();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> getCorrectora();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.util.List<com.sugarcoachpremium.data.network.RegistersResponse>> getRegistersCall();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> saveRegisters(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister> registersResponse);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> getMedidor();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> getBombas();
}