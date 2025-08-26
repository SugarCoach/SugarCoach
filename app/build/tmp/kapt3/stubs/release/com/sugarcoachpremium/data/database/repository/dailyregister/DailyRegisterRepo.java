package com.sugarcoachpremium.data.database.repository.dailyregister;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nH&J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\nH&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0018\u001a\u00020\u0004H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH&J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bH&J\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H&J.\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H&J6\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u001b2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020%H&J\u0014\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u001bH&J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0014\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\n0\u001bH&J\u0014\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\n0\u001bH&J\b\u00103\u001a\u00020\u0007H&J\u0014\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\u001bH&J.\u00105\u001a\b\u0012\u0004\u0012\u0002060\u001b2\u0006\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020%H&J>\u0010;\u001a\b\u0012\u0004\u0012\u0002060\u001b2\u0006\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020%2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H&J6\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u001b2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020%H&J\u0014\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\n0\u001bH&J.\u0010?\u001a\b\u0012\u0004\u0012\u0002060\u001b2\u0006\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020%H&J>\u0010@\u001a\b\u0012\u0004\u0012\u0002060\u001b2\u0006\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020%2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H&J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&\u00a8\u0006B"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;", "", "deleteAll", "Lio/reactivex/Observable;", "", "deleteRegister", "id", "", "insertCategories", "category", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Category;", "insertExercise", "exercises", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Exercises;", "insertRegister", "dailyRegister", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "insertRegisters", "insertStates", "states", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/States;", "isCategoriesRepoEmpty", "isExercisesRepoEmpty", "isRegisterRepoEmpty", "isStatesRepoEmpty", "lastDailyRegister", "Lio/reactivex/Single;", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCategory;", "loadAverages", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterAverages;", "loadAveragesLast", "hypo", "", "hyper", "loadAveragesWeek", "start", "", "end", "loadCar", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCar;", "breakfast_id", "snack_id", "lunch_id", "dinner_id", "date", "loadCategories", "loadDailyRegister", "loadDailyRegisters", "loadDailyRegistersDATES", "Ljava/util/Date;", "loadDailyRegistersTotal", "loadExercises", "loadExercisesDays", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterExercisesStates;", "type1", "type2", "type3", "type4", "loadExercisesWeek", "loadInsuline", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterInsuline;", "loadStates", "loadStatesDays", "loadStatesWeek", "updateRegister", "app_release"})
public abstract interface DailyRegisterRepo {
    
    public abstract boolean isRegisterRepoEmpty();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> isCategoriesRepoEmpty();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> isStatesRepoEmpty();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> isExercisesRepoEmpty();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> insertCategories(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> category);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> insertStates(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States> states);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> insertExercise(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises> exercises);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> insertRegister(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> insertRegisters(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister> dailyRegister);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory> loadDailyRegister(int id);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory>> loadDailyRegisters();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States>> loadStates();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises>> loadExercises();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category>> loadCategories();
    
    public abstract int loadDailyRegistersTotal();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<java.util.Date>> loadDailyRegistersDATES();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory> lastDailyRegister();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages> loadAverages();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages> loadAveragesLast(float hypo, float hyper);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages> loadAveragesWeek(@org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end, float hypo, float hyper);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterInsuline> loadInsuline(int breakfast_id, int snack_id, int lunch_id, int dinner_id, @org.jetbrains.annotations.NotNull
    java.lang.String date);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCar> loadCar(int breakfast_id, int snack_id, int lunch_id, int dinner_id, @org.jetbrains.annotations.NotNull
    java.lang.String date);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates> loadExercisesDays(@org.jetbrains.annotations.NotNull
    java.lang.String type1, @org.jetbrains.annotations.NotNull
    java.lang.String type2, @org.jetbrains.annotations.NotNull
    java.lang.String type3, @org.jetbrains.annotations.NotNull
    java.lang.String type4);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates> loadExercisesWeek(@org.jetbrains.annotations.NotNull
    java.lang.String type1, @org.jetbrains.annotations.NotNull
    java.lang.String type2, @org.jetbrains.annotations.NotNull
    java.lang.String type3, @org.jetbrains.annotations.NotNull
    java.lang.String type4, @org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates> loadStatesDays(@org.jetbrains.annotations.NotNull
    java.lang.String type1, @org.jetbrains.annotations.NotNull
    java.lang.String type2, @org.jetbrains.annotations.NotNull
    java.lang.String type3, @org.jetbrains.annotations.NotNull
    java.lang.String type4);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates> loadStatesWeek(@org.jetbrains.annotations.NotNull
    java.lang.String type1, @org.jetbrains.annotations.NotNull
    java.lang.String type2, @org.jetbrains.annotations.NotNull
    java.lang.String type3, @org.jetbrains.annotations.NotNull
    java.lang.String type4, @org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteAll();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteRegister(int id);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> updateRegister(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister);
}