package com.sugarcoachpremium.ui.daily_detail.interactor;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H&J \u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0005\u001a\u00020\tH\u00a6@\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f2\u0006\u0010\n\u001a\u00020\u000bH&J\u0014\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0003H&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003H&J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0003H&J\u0014\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001a0\u0003H&J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0\u0003H&J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\tH&\u00a8\u0006&\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/daily_detail/interactor/DailyDetailInteractorImp;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "getRegister", "Lio/reactivex/Single;", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCategory;", "id", "", "updateRegisterCall", "Lkotlin/Result;", "", "dailyRegister", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "updateRegisterCall-gIAlu-s", "(Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveRegisterPhotoCall", "Lio/reactivex/Observable;", "Lcom/sugarcoachpremium/data/network/RegisterSavePhotoResponse;", "photo", "Ljava/io/File;", "deleteRegistersCall", "deleteRegistersCall-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRegister", "", "updateRegister", "getCategories", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Category;", "getTreatment", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "getUser", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "getExercises", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Exercises;", "getEmotions", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/States;", "setIdOnline", "", "app_debug"})
public abstract interface DailyDetailInteractorImp extends com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory> getRegister(int id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.sugarcoachpremium.data.network.RegisterSavePhotoResponse> saveRegisterPhotoCall(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.io.File photo);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteRegister(int id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> updateRegister(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category>> getCategories();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora> getTreatment();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.user.User> getUser();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises>> getExercises();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States>> getEmotions();
    
    public abstract void setIdOnline(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
}