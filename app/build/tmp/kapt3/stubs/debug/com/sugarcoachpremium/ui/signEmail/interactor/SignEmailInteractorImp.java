package com.sugarcoachpremium.ui.signEmail.interactor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J,\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH&J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H&\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/sugarcoachpremium/ui/signEmail/interactor/SignEmailInteractorImp;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "category", "Lio/reactivex/Observable;", "", "createUserData", "Lkotlin/Result;", "createUserData-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exercises", "getBasal", "getBombas", "getCorrectora", "getMedidor", "insertTreatment", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "insertTreatment-gIAlu-s", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveRegisters", "registersResponse", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "states", "treamentBasalHora", "treamentHorarios", "treatmentHorariosCorrectora", "updateCloudUser", "signResponse", "Lcom/google/firebase/auth/FirebaseUser;", "updateCloudUser-gIAlu-s", "(Lcom/google/firebase/auth/FirebaseUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "updateUserSocial", "", "loginResponse", "Lcom/sugarcoachpremium/data/network/LoginResponse;", "app_debug"})
public abstract interface SignEmailInteractorImp extends com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> updateUser(@org.jetbrains.annotations.Nullable
    com.google.firebase.auth.FirebaseUser signResponse);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> saveRegisters(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister> registersResponse);
    
    public abstract void updateUserSocial(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.network.LoginResponse loginResponse);
    
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
    public abstract io.reactivex.Observable<java.lang.Boolean> treamentBasalHora();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> treatmentHorariosCorrectora();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> getBasal();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> getMedidor();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> getBombas();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> getCorrectora();
}