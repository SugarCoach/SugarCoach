package com.sugarcoachpremium.ui.daily.interactor;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0003H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H&J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\u0003H&J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00060\u0003H&\u00a8\u0006\u0013\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/daily/interactor/DailyInteractorImp;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "getUser", "Lio/reactivex/Single;", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "getAll", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCategory;", "getAllDates", "Ljava/util/Date;", "isDailyEmpty", "Lio/reactivex/Observable;", "", "getTreatment", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "getExercises", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Exercises;", "getEmotions", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/States;", "app_debug"})
public abstract interface DailyInteractorImp extends com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.user.User> getUser();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory>> getAll();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<java.util.Date>> getAllDates();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> isDailyEmpty();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora> getTreatment();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises>> getExercises();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States>> getEmotions();
}