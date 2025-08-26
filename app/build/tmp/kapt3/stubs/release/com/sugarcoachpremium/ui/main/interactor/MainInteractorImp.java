package com.sugarcoachpremium.ui.main.interactor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\u0013"}, d2 = {"Lcom/sugarcoachpremium/ui/main/interactor/MainInteractorImp;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "deleteAll", "Lio/reactivex/Observable;", "", "deleteUser", "getAverages", "Lio/reactivex/Single;", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterAverages;", "getCategories", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Category;", "getLastDaily", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCategory;", "getTreatment", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "getUser", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "isDailyEmpty", "app_release"})
public abstract interface MainInteractorImp extends com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.user.User> getUser();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteUser();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory> getLastDaily();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> isDailyEmpty();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages> getAverages();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteAll();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora> getTreatment();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category>> getCategories();
}