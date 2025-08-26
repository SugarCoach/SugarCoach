package com.sugarcoachpremium.data.database.repository.treament;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\rH&J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00130\rH&J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00150\rH&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\rH&J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\rH&J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020 0\rH&J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\tH&J\u0014\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\r0\tH&J\u0014\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\tH&J\u0014\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\r0\tH&J\u0014\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\tH&J\u0014\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\r0\tH&J\u0014\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\r0\tH&J\u0014\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\tH&J\u0014\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\r0\tH&J.\u00105\u001a\b\u0012\u0004\u0012\u0002060\t2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u0002082\u0006\u0010;\u001a\u000208H&J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001e0\t2\u0006\u0010=\u001a\u000208H&J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001d\u001a\u00020\u001eH&J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001d\u001a\u00020 H&J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010B\u001a\u00020\u001bH&\u00a8\u0006C"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;", "", "deleteAllBasalHoras", "Lio/reactivex/Observable;", "", "deleteAllCategory", "deleteAllCategoryCorrectora", "deleteAllTreatment", "getAverage", "Lio/reactivex/Single;", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentAverage;", "insertBasal", "category", "", "Lcom/sugarcoachpremium/data/database/repository/treament/BasalInsuline;", "insertBombas", "item", "Lcom/sugarcoachpremium/data/database/repository/treament/BombaInfusora;", "insertCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/CorrectoraInsuline;", "insertMedidor", "Lcom/sugarcoachpremium/data/database/repository/treament/Medidor;", "insertTreament", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "insertTreamentBasalHoras", "horas", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentBasalHora;", "insertTreamentCategory", "horarios", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentHorarios;", "insertTreamentCategoryCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentCorrectoraHorarios;", "isBasalRepoEmpty", "isBombasRepoEmpty", "isCorrectoraRepoEmpty", "isMedidorRepoEmpty", "isTreamentBasalHoraRepoEmpty", "isTreamentCategoryCorrectoraRepoEmpty", "isTreamentCategoryRepoEmpty", "isTreamentRepoEmpty", "load", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "loadAll", "loadAllBasal", "loadAllBasalHora", "loadAllBombas", "loadAllCategory", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentHorariosCategory;", "loadAllCategoryCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentHCorrectoraCategory;", "loadAllCorrectora", "loadAllMedidor", "loadInsuline", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterInsuline;", "breakfast_id", "", "snack_id", "lunch_id", "dinner_id", "loadTreatmentByCategory", "id", "updateBasalCategory", "updateCorrectoraCategory", "updateTreatment", "updateTreatmentBasalHora", "hora", "app_release"})
public abstract interface TreamentRepo {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> isTreamentRepoEmpty();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.Treament>> loadAll();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora> load();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> insertTreament(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.Treament treament);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> insertTreamentCategory(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios> horarios);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> insertTreamentBasalHoras(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora> horas);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> insertTreamentCategoryCorrectora(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentCorrectoraHorarios> horarios);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreatmentHorariosCategory>> loadAllCategory();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora>> loadAllBasalHora();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios> loadTreatmentByCategory(int id);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreatmentHCorrectoraCategory>> loadAllCategoryCorrectora();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> isTreamentCategoryRepoEmpty();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> isTreamentBasalHoraRepoEmpty();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> isTreamentCategoryCorrectoraRepoEmpty();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> isMedidorRepoEmpty();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> isBombasRepoEmpty();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> insertBasal(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.BasalInsuline> category);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.BasalInsuline>> loadAllBasal();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> insertMedidor(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.Medidor> item);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.Medidor>> loadAllMedidor();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> insertBombas(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.BombaInfusora> item);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.BombaInfusora>> loadAllBombas();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterInsuline> loadInsuline(int breakfast_id, int snack_id, int lunch_id, int dinner_id);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentAverage> getAverage();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> isBasalRepoEmpty();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> insertCorrectora(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline> item);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline>> loadAllCorrectora();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> isCorrectoraRepoEmpty();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteAllCategory();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteAllCategoryCorrectora();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteAllTreatment();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteAllBasalHoras();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> updateTreatment(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.Treament treament);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> updateTreatmentBasalHora(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora hora);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> updateBasalCategory(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios horarios);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> updateCorrectoraCategory(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentCorrectoraHorarios horarios);
}