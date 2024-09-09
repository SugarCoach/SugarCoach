package com.sugarcoachpremium.ui.statistics.interactor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J6\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u0003H&J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u0003H&J>\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH&J.\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH&J.\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH&J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH&J6\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&J.\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH&J\u0014\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00040\u0003H&J>\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH&J.\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH&J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0003H&J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0003H&\u00a8\u0006-"}, d2 = {"Lcom/sugarcoachpremium/ui/statistics/interactor/StatisticsInteractorImp;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "getAll", "Lio/reactivex/Single;", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCategory;", "getCar", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCar;", "breakfast_id", "", "snack_id", "lunch_id", "dinner_id", "date", "", "getCategories", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Category;", "getExercises", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Exercises;", "getExercisesDates", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterExercisesStates;", "type1", "type2", "type3", "type4", "start", "end", "getExercisesDays", "getGlucoseDates", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterAverages;", "hypo", "", "hyper", "getGlucoseDays", "getInsuline", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterInsuline;", "getInsulineBasal", "getStates", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/States;", "getStatesDates", "getStatesDays", "getTreatment", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "getUser", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "app_debug"})
public abstract interface StatisticsInteractorImp extends com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory>> getAll();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.user.User> getUser();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora> getTreatment();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category>> getCategories();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises>> getExercises();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States>> getStates();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages> getGlucoseDays(float hypo, float hyper);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages> getGlucoseDates(@org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end, float hypo, float hyper);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterInsuline> getInsuline(int breakfast_id, int snack_id, int lunch_id, int dinner_id, @org.jetbrains.annotations.NotNull
    java.lang.String date);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterInsuline> getInsulineBasal(int breakfast_id, int snack_id, int lunch_id, int dinner_id);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCar> getCar(int breakfast_id, int snack_id, int lunch_id, int dinner_id, @org.jetbrains.annotations.NotNull
    java.lang.String date);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates> getExercisesDays(@org.jetbrains.annotations.NotNull
    java.lang.String type1, @org.jetbrains.annotations.NotNull
    java.lang.String type2, @org.jetbrains.annotations.NotNull
    java.lang.String type3, @org.jetbrains.annotations.NotNull
    java.lang.String type4);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates> getExercisesDates(@org.jetbrains.annotations.NotNull
    java.lang.String type1, @org.jetbrains.annotations.NotNull
    java.lang.String type2, @org.jetbrains.annotations.NotNull
    java.lang.String type3, @org.jetbrains.annotations.NotNull
    java.lang.String type4, @org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates> getStatesDays(@org.jetbrains.annotations.NotNull
    java.lang.String type1, @org.jetbrains.annotations.NotNull
    java.lang.String type2, @org.jetbrains.annotations.NotNull
    java.lang.String type3, @org.jetbrains.annotations.NotNull
    java.lang.String type4);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates> getStatesDates(@org.jetbrains.annotations.NotNull
    java.lang.String type1, @org.jetbrains.annotations.NotNull
    java.lang.String type2, @org.jetbrains.annotations.NotNull
    java.lang.String type3, @org.jetbrains.annotations.NotNull
    java.lang.String type4, @org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end);
}