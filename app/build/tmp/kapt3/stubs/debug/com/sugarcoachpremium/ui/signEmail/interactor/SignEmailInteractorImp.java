package com.sugarcoachpremium.ui.signEmail.interactor;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u00a6@\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u00a6@\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006%\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/signEmail/interactor/SignEmailInteractorImp;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "updateUser", "Lio/reactivex/Observable;", "", "signResponse", "Lcom/google/firebase/auth/FirebaseUser;", "updateCloudUser", "Lkotlin/Result;", "updateCloudUser-gIAlu-s", "(Lcom/google/firebase/auth/FirebaseUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveRegisters", "registersResponse", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "updateUserSocial", "", "loginResponse", "Lcom/sugarcoachpremium/data/network/LoginResponse;", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "insertTreatment", "insertTreatment-gIAlu-s", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createUserData", "createUserData-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "category", "states", "exercises", "treamentHorarios", "treamentBasalHora", "treatmentHorariosCorrectora", "getBasal", "getMedidor", "getBombas", "getCorrectora", "app_debug"})
public abstract interface SignEmailInteractorImp extends com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> updateUser(@org.jetbrains.annotations.Nullable()
    com.google.firebase.auth.FirebaseUser signResponse);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> saveRegisters(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister> registersResponse);
    
    public abstract void updateUserSocial(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.network.LoginResponse loginResponse);
    
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
    public abstract io.reactivex.Observable<java.lang.Boolean> treamentBasalHora();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> treatmentHorariosCorrectora();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> getBasal();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> getMedidor();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> getBombas();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> getCorrectora();
}