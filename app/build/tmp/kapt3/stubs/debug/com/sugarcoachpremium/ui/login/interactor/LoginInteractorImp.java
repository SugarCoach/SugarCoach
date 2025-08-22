package com.sugarcoachpremium.ui.login.interactor;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u00a6@\u00a2\u0006\u0002\u0010\rJ$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0012J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH&J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\nH&J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0#H&J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&\u00a8\u0006*\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/login/interactor/LoginInteractorImp;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "getUserData", "Lkotlin/Result;", "Lcom/sugarcoachpremium/GetUserByUIDQuery$Data1;", "userUID", "", "getUserData-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeLocalUser", "Lio/reactivex/Observable;", "", "cloudUser", "(Lcom/sugarcoachpremium/GetUserByUIDQuery$Data1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doServerLoginpiCall", "Lcom/sugarcoachpremium/data/network/LoginResponse;", "email", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserInSharedPref", "", "loginResponse", "mirror", "medico", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "category", "states", "exercises", "treamentHorarios", "treatmentHorariosCorrectora", "treatmentBasalHora", "getBasal", "getCorrectora", "getRegistersCall", "", "Lcom/sugarcoachpremium/data/network/RegistersResponse;", "saveRegisters", "registersResponse", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "getMedidor", "getBombas", "app_debug"})
public abstract interface LoginInteractorImp extends com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object makeLocalUser(@org.jetbrains.annotations.Nullable()
    com.sugarcoachpremium.GetUserByUIDQuery.Data1 cloudUser, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super io.reactivex.Observable<java.lang.Boolean>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object doServerLoginpiCall(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super io.reactivex.Observable<com.sugarcoachpremium.data.network.LoginResponse>> $completion);
    
    public abstract void updateUserInSharedPref(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.network.LoginResponse loginResponse, boolean mirror, boolean medico);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> treament(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.Treament treament);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> category();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> states();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> exercises();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> treamentHorarios();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> treatmentHorariosCorrectora();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> treatmentBasalHora();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> getBasal();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> getCorrectora();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<com.sugarcoachpremium.data.network.RegistersResponse>> getRegistersCall();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> saveRegisters(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister> registersResponse);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> getMedidor();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> getBombas();
}