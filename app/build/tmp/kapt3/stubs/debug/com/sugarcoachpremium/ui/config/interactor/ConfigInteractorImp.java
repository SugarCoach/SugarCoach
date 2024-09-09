package com.sugarcoachpremium.ui.config.interactor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0003H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H&J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0013H&J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010!\u001a\u00020\u0017H&J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0004H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/sugarcoachpremium/ui/config/interactor/ConfigInteractorImp;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "category", "Lio/reactivex/Observable;", "", "deleteAll", "deleteTreament", "deleteUser", "doServerLoginpiCall", "Lcom/sugarcoachpremium/data/network/LoginResponse;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exercises", "getBasal", "getCorrectora", "getMedidor", "getRegistersCall", "", "Lcom/sugarcoachpremium/data/network/RegistersResponse;", "getUser", "Lio/reactivex/Single;", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "saveRegisters", "registersResponse", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "states", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "treamentHorarios", "treatmentHorariosCorrectora", "updateUser", "user", "updateUserInSharedPref", "", "loginResponse", "mirror", "app_debug"})
public abstract interface ConfigInteractorImp extends com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.user.User> getUser();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> updateUser(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User user);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object doServerLoginpiCall(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.reactivex.Observable<com.sugarcoachpremium.data.network.LoginResponse>> $completion);
    
    public abstract void updateUserInSharedPref(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.network.LoginResponse loginResponse, boolean mirror);
    
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
    public abstract io.reactivex.Observable<java.lang.Boolean> getBasal();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> getCorrectora();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.util.List<com.sugarcoachpremium.data.network.RegistersResponse>> getRegistersCall();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> saveRegisters(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister> registersResponse);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteUser();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteAll();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteTreament();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> getMedidor();
}