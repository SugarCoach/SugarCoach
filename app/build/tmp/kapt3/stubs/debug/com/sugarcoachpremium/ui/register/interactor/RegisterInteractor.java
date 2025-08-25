package com.sugarcoachpremium.ui.register.interactor;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@\u00a2\u0006\u0002\u0010 J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u001e\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0016J\u000e\u0010+\u001a\u00020(H\u0096@\u00a2\u0006\u0002\u0010,J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020(0\u001cH\u0016J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020(0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160/H\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u0002010/H\u0016J\u0014\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030/H\u0016J\u0014\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000206030/H\u0016J\u0014\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208030/H\u0016J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020:0/H\u0016J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020<0/2\u0006\u0010#\u001a\u00020*H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006="}, d2 = {"Lcom/sugarcoachpremium/ui/register/interactor/RegisterInteractor;", "Lcom/sugarcoachpremium/data/ui/base/interactor/BaseInteractor;", "Lcom/sugarcoachpremium/ui/register/interactor/RegisterInteractorImp;", "treamentRepo", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;", "dailyRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;", "userRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;", "preferenceHelper", "Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;", "apiHelper", "Lcom/sugarcoachpremium/data/network/ApiHelper;", "<init>", "(Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;Lcom/sugarcoachpremium/data/network/ApiHelper;)V", "apiRepository", "Lcom/sugarcoachpremium/data/api_db/ApiRepository;", "getApiRepository", "()Lcom/sugarcoachpremium/data/api_db/ApiRepository;", "setApiRepository", "(Lcom/sugarcoachpremium/data/api_db/ApiRepository;)V", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "getUser", "()Lcom/sugarcoachpremium/data/database/repository/user/User;", "setUser", "(Lcom/sugarcoachpremium/data/database/repository/user/User;)V", "saveRegisterCall", "Lio/reactivex/Observable;", "Lcom/sugarcoachpremium/data/network/RegisterSaveResponse;", "dailyRegister", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "(Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveRegisterPhotoCall", "Lcom/sugarcoachpremium/data/network/RegisterSavePhotoResponse;", "id", "", "photo", "Ljava/io/File;", "updateLocalPoints", "", "points", "", "updateUserPoints", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDailyEmpty", "insertDaily", "Lio/reactivex/Single;", "getLastDaily", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCategory;", "getCategories", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Category;", "getExercises", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Exercises;", "getEmotions", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/States;", "getTreatment", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "getTreatmentHorarios", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentHorarios;", "app_debug"})
public final class RegisterInteractor extends com.sugarcoachpremium.data.ui.base.interactor.BaseInteractor implements com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp {
    @org.jetbrains.annotations.NotNull()
    private final com.sugarcoachpremium.data.database.repository.treament.TreamentRepo treamentRepo = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo dailyRepoHelper = null;
    @javax.inject.Inject()
    public com.sugarcoachpremium.data.api_db.ApiRepository apiRepository;
    public com.sugarcoachpremium.data.database.repository.user.User user;
    
    @javax.inject.Inject()
    public RegisterInteractor(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.TreamentRepo treamentRepo, @org.jetbrains.annotations.NotNull()
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
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveRegisterCall(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super io.reactivex.Observable<com.sugarcoachpremium.data.network.RegisterSaveResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<com.sugarcoachpremium.data.network.RegisterSavePhotoResponse> saveRegisterPhotoCall(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.io.File photo) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> updateLocalPoints(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.user.User user, int points) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateUserPoints(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> isDailyEmpty() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> insertDaily(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.user.User> getUser() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory> getLastDaily() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category>> getCategories() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises>> getExercises() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States>> getEmotions() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora> getTreatment() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios> getTreatmentHorarios(int id) {
        return null;
    }
}