package com.sugarcoachpremium.ui.statistics.interactor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00100\u000fH\u0016J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00100\u000fH\u0016J>\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000f2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001aH\u0016J.\u0010\'\u001a\b\u0012\u0004\u0012\u00020 0\u000f2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001aH\u0016J.\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u000f2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020)0\u000f2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J6\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J.\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0014\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00100\u000fH\u0016J>\u00103\u001a\b\u0012\u0004\u0012\u00020 0\u000f2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001aH\u0016J.\u00104\u001a\b\u0012\u0004\u0012\u00020 0\u000f2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001aH\u0016J\u000e\u00105\u001a\b\u0012\u0004\u0012\u0002060\u000fH\u0016J\u000e\u00107\u001a\b\u0012\u0004\u0012\u0002080\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/sugarcoachpremium/ui/statistics/interactor/StatisticsInteractor;", "Lcom/sugarcoachpremium/data/ui/base/interactor/BaseInteractor;", "Lcom/sugarcoachpremium/ui/statistics/interactor/StatisticsInteractorImp;", "treamentRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;", "dailyRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;", "userRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;", "preferenceHelper", "Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;", "apiHelper", "Lcom/sugarcoachpremium/data/network/ApiHelper;", "(Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;Lcom/sugarcoachpremium/data/network/ApiHelper;)V", "getAll", "Lio/reactivex/Single;", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCategory;", "getCar", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCar;", "breakfast_id", "", "snack_id", "lunch_id", "dinner_id", "date", "", "getCategories", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Category;", "getExercises", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Exercises;", "getExercisesDates", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterExercisesStates;", "type1", "type2", "type3", "type4", "start", "end", "getExercisesDays", "getGlucoseDates", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterAverages;", "hypo", "", "hyper", "getGlucoseDays", "getInsuline", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterInsuline;", "getInsulineBasal", "getStates", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/States;", "getStatesDates", "getStatesDays", "getTreatment", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "getUser", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "app_debug"})
public final class StatisticsInteractor extends com.sugarcoachpremium.data.ui.base.interactor.BaseInteractor implements com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp {
    @org.jetbrains.annotations.NotNull
    private final com.sugarcoachpremium.data.database.repository.treament.TreamentRepo treamentRepoHelper = null;
    @org.jetbrains.annotations.NotNull
    private final com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo dailyRepoHelper = null;
    
    @javax.inject.Inject
    public StatisticsInteractor(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentRepo treamentRepoHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo dailyRepoHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.UserRepo userRepoHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.di.preferences.PreferenceHelper preferenceHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.network.ApiHelper apiHelper) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory>> getAll() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.user.User> getUser() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages> getGlucoseDays(float hypo, float hyper) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages> getGlucoseDates(@org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end, float hypo, float hyper) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora> getTreatment() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category>> getCategories() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises>> getExercises() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States>> getStates() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCar> getCar(int breakfast_id, int snack_id, int lunch_id, int dinner_id, @org.jetbrains.annotations.NotNull
    java.lang.String date) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterInsuline> getInsuline(int breakfast_id, int snack_id, int lunch_id, int dinner_id, @org.jetbrains.annotations.NotNull
    java.lang.String date) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterInsuline> getInsulineBasal(int breakfast_id, int snack_id, int lunch_id, int dinner_id) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates> getExercisesDays(@org.jetbrains.annotations.NotNull
    java.lang.String type1, @org.jetbrains.annotations.NotNull
    java.lang.String type2, @org.jetbrains.annotations.NotNull
    java.lang.String type3, @org.jetbrains.annotations.NotNull
    java.lang.String type4) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates> getExercisesDates(@org.jetbrains.annotations.NotNull
    java.lang.String type1, @org.jetbrains.annotations.NotNull
    java.lang.String type2, @org.jetbrains.annotations.NotNull
    java.lang.String type3, @org.jetbrains.annotations.NotNull
    java.lang.String type4, @org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates> getStatesDays(@org.jetbrains.annotations.NotNull
    java.lang.String type1, @org.jetbrains.annotations.NotNull
    java.lang.String type2, @org.jetbrains.annotations.NotNull
    java.lang.String type3, @org.jetbrains.annotations.NotNull
    java.lang.String type4) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterExercisesStates> getStatesDates(@org.jetbrains.annotations.NotNull
    java.lang.String type1, @org.jetbrains.annotations.NotNull
    java.lang.String type2, @org.jetbrains.annotations.NotNull
    java.lang.String type3, @org.jetbrains.annotations.NotNull
    java.lang.String type4, @org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end) {
        return null;
    }
}