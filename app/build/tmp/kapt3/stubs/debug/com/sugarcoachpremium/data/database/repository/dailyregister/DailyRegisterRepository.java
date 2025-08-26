package com.sugarcoachpremium.data.database.repository.dailyregister;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0016J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nH\u0016J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\nH\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u000bH\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u000bH\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\n0\u001bH\u0016J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\u001bH\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\n0\u001bH\u0016J\u0014\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0\u001bH\u0016J\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\n0\u001bH\u0016J\b\u0010#\u001a\u00020\bH\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\b\u0010(\u001a\u00020\u0017H\u0016J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u001bH\u0016J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u001b2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0016J.\u0010/\u001a\b\u0012\u0004\u0012\u00020*0\u001b2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0016J6\u00103\u001a\b\u0012\u0004\u0012\u0002040\u001b2\u0006\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u00172\u0006\u00109\u001a\u000201H\u0016J6\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u001b2\u0006\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u00172\u0006\u00109\u001a\u000201H\u0016J.\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u001b2\u0006\u0010>\u001a\u0002012\u0006\u0010?\u001a\u0002012\u0006\u0010@\u001a\u0002012\u0006\u0010A\u001a\u000201H\u0016J>\u0010B\u001a\b\u0012\u0004\u0012\u00020=0\u001b2\u0006\u0010>\u001a\u0002012\u0006\u0010?\u001a\u0002012\u0006\u0010@\u001a\u0002012\u0006\u0010A\u001a\u0002012\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0016J.\u0010C\u001a\b\u0012\u0004\u0012\u00020=0\u001b2\u0006\u0010>\u001a\u0002012\u0006\u0010?\u001a\u0002012\u0006\u0010@\u001a\u0002012\u0006\u0010A\u001a\u000201H\u0016J>\u0010D\u001a\b\u0012\u0004\u0012\u00020=0\u001b2\u0006\u0010>\u001a\u0002012\u0006\u0010?\u001a\u0002012\u0006\u0010@\u001a\u0002012\u0006\u0010A\u001a\u0002012\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0016J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepository;", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;", "dailyRegisterDao", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterDao;", "<init>", "(Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterDao;)V", "insertRegisters", "Lio/reactivex/Observable;", "", "dailyRegister", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "insertCategories", "category", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Category;", "insertExercise", "exercises", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Exercises;", "insertStates", "states", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/States;", "deleteRegister", "id", "", "updateRegister", "insertRegister", "loadDailyRegister", "Lio/reactivex/Single;", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCategory;", "loadDailyRegisters", "loadCategories", "loadStates", "loadExercises", "loadDailyRegistersDATES", "Ljava/util/Date;", "isRegisterRepoEmpty", "isCategoriesRepoEmpty", "isStatesRepoEmpty", "isExercisesRepoEmpty", "lastDailyRegister", "loadDailyRegistersTotal", "loadAverages", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterAverages;", "loadAveragesLast", "hypo", "", "hyper", "loadAveragesWeek", "start", "", "end", "loadInsuline", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterInsuline;", "breakfast_id", "snack_id", "lunch_id", "dinner_id", "date", "loadCar", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCar;", "loadExercisesDays", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterExercisesStates;", "type1", "type2", "type3", "type4", "loadExercisesWeek", "loadStatesDays", "loadStatesWeek", "deleteAll", "app_debug"})
public final class DailyRegisterRepository implements com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo {
    @org.jetbrains.annotations.NotNull()
    private final com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterDao dailyRegisterDao = null;
    
    @javax.inject.Inject()
    public DailyRegisterRepository(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterDao dailyRegisterDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> insertRegisters(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister> dailyRegister) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> insertCategories(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> category) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> insertExercise(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises> exercises) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> insertStates(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States> states) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> deleteRegister(int id) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> updateRegister(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> insertRegister(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory> loadDailyRegister(int id) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory>> loadDailyRegisters() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category>> loadCategories() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States>> loadStates() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises>> loadExercises() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.util.List<java.util.Date>> loadDailyRegistersDATES() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isRegisterRepoEmpty() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> isCategoriesRepoEmpty() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> isStatesRepoEmpty() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> isExercisesRepoEmpty() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory> lastDailyRegister() {
        return null;
    }
    
    @java.lang.Override()
    public int loadDailyRegistersTotal() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages> loadAverages() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages> loadAveragesLast(float hypo, float hyper) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages> loadAveragesWeek(@org.jetbrains.annotations.NotNull()
    java.lang.String start, @org.jetbrains.annotations.NotNull()
    java.lang.String end, float hypo, float hyper) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterInsuline> loadInsuline(int breakfast_id, int snack_id, int lunch_id, int dinner_id, @org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCar> loadCar(int breakfast_id, int snack_id, int lunch_id, int dinner_id, @org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates> loadExercisesDays(@org.jetbrains.annotations.NotNull()
    java.lang.String type1, @org.jetbrains.annotations.NotNull()
    java.lang.String type2, @org.jetbrains.annotations.NotNull()
    java.lang.String type3, @org.jetbrains.annotations.NotNull()
    java.lang.String type4) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates> loadExercisesWeek(@org.jetbrains.annotations.NotNull()
    java.lang.String type1, @org.jetbrains.annotations.NotNull()
    java.lang.String type2, @org.jetbrains.annotations.NotNull()
    java.lang.String type3, @org.jetbrains.annotations.NotNull()
    java.lang.String type4, @org.jetbrains.annotations.NotNull()
    java.lang.String start, @org.jetbrains.annotations.NotNull()
    java.lang.String end) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates> loadStatesDays(@org.jetbrains.annotations.NotNull()
    java.lang.String type1, @org.jetbrains.annotations.NotNull()
    java.lang.String type2, @org.jetbrains.annotations.NotNull()
    java.lang.String type3, @org.jetbrains.annotations.NotNull()
    java.lang.String type4) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates> loadStatesWeek(@org.jetbrains.annotations.NotNull()
    java.lang.String type1, @org.jetbrains.annotations.NotNull()
    java.lang.String type2, @org.jetbrains.annotations.NotNull()
    java.lang.String type3, @org.jetbrains.annotations.NotNull()
    java.lang.String type4, @org.jetbrains.annotations.NotNull()
    java.lang.String start, @org.jetbrains.annotations.NotNull()
    java.lang.String end) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> deleteAll() {
        return null;
    }
}