package com.sugarcoachpremium.ui.register.interactor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H&J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00152\u0006\u0010\u0010\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H&J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0011H&J\u0011\u0010%\u001a\u00020\u0016H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/sugarcoachpremium/ui/register/interactor/RegisterInteractorImp;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "getCategories", "Lio/reactivex/Single;", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Category;", "getEmotions", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/States;", "getExercises", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Exercises;", "getLastDaily", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCategory;", "getTreatment", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "getTreatmentHorarios", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentHorarios;", "id", "", "getUser", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "insertDaily", "Lio/reactivex/Observable;", "", "dailyRegister", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "isDailyEmpty", "saveRegisterCall", "Lcom/sugarcoachpremium/data/network/RegisterSaveResponse;", "(Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveRegisterPhotoCall", "Lcom/sugarcoachpremium/data/network/RegisterSavePhotoResponse;", "", "photo", "Ljava/io/File;", "updateLocalPoints", "user", "points", "updateUserPoints", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RegisterInteractorImp extends com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateUserPoints(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> updateLocalPoints(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User user, int points);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object saveRegisterCall(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.reactivex.Observable<com.sugarcoachpremium.data.network.RegisterSaveResponse>> $completion);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<com.sugarcoachpremium.data.network.RegisterSavePhotoResponse> saveRegisterPhotoCall(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.io.File photo);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> insertDaily(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.user.User> getUser();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory> getLastDaily();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> isDailyEmpty();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios> getTreatmentHorarios(int id);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora> getTreatment();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category>> getCategories();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises>> getExercises();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States>> getEmotions();
}