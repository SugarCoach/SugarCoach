package com.sugarcoachpremium.data.database.repository.treament;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\bH&J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H&J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H&J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H&J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u0006H&J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u0006H&J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00070\u0006H&J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0007H&J\u0014\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00070\u0006H&J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u0007H&J\u0014\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00070\u0006H&J\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020+0\u0007H&J\u0014\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00070\u0006H&J.\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00062\u0006\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001aH&J\u000e\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0006H&J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\'\u001a\b\u0012\u0004\u0012\u0002070\u0007H&J\u0014\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u00070\u0006H&J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\bH&J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010@\u001a\u00020\u0012H&J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u0014H&\u00a8\u0006C\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;", "", "isTreamentRepoEmpty", "Lio/reactivex/Observable;", "", "loadAll", "Lio/reactivex/Single;", "", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "load", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "insertTreament", "treament", "insertTreamentCategory", "horarios", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentHorarios;", "insertTreamentBasalHoras", "horas", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentBasalHora;", "insertTreamentCategoryCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentCorrectoraHorarios;", "loadAllCategory", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentHorariosCategory;", "loadAllBasalHora", "loadTreatmentByCategory", "id", "", "loadAllCategoryCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentHCorrectoraCategory;", "isTreamentCategoryRepoEmpty", "isTreamentBasalHoraRepoEmpty", "isTreamentCategoryCorrectoraRepoEmpty", "isMedidorRepoEmpty", "isBombasRepoEmpty", "insertBasal", "category", "Lcom/sugarcoachpremium/data/database/repository/treament/BasalInsuline;", "loadAllBasal", "insertMedidor", "item", "Lcom/sugarcoachpremium/data/database/repository/treament/Medidor;", "loadAllMedidor", "insertBombas", "Lcom/sugarcoachpremium/data/database/repository/treament/BombaInfusora;", "loadAllBombas", "loadInsuline", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterInsuline;", "breakfast_id", "snack_id", "lunch_id", "dinner_id", "getAverage", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentAverage;", "isBasalRepoEmpty", "insertCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/CorrectoraInsuline;", "loadAllCorrectora", "isCorrectoraRepoEmpty", "deleteAllCategory", "deleteAllCategoryCorrectora", "deleteAllTreatment", "deleteAllBasalHoras", "updateTreatment", "updateTreatmentBasalHora", "hora", "updateBasalCategory", "updateCorrectoraCategory", "app_debug"})
public abstract interface TreamentRepo {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> isTreamentRepoEmpty();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.Treament>> loadAll();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora> load();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> insertTreament(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.Treament treament);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> insertTreamentCategory(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios> horarios);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> insertTreamentBasalHoras(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora> horas);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> insertTreamentCategoryCorrectora(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentCorrectoraHorarios> horarios);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreatmentHorariosCategory>> loadAllCategory();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora>> loadAllBasalHora();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios> loadTreatmentByCategory(int id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreatmentHCorrectoraCategory>> loadAllCategoryCorrectora();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> isTreamentCategoryRepoEmpty();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> isTreamentBasalHoraRepoEmpty();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> isTreamentCategoryCorrectoraRepoEmpty();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> isMedidorRepoEmpty();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> isBombasRepoEmpty();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> insertBasal(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.BasalInsuline> category);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.BasalInsuline>> loadAllBasal();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> insertMedidor(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.Medidor> item);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.Medidor>> loadAllMedidor();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> insertBombas(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.BombaInfusora> item);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.BombaInfusora>> loadAllBombas();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterInsuline> loadInsuline(int breakfast_id, int snack_id, int lunch_id, int dinner_id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentAverage> getAverage();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> isBasalRepoEmpty();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> insertCorrectora(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline> item);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline>> loadAllCorrectora();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> isCorrectoraRepoEmpty();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteAllCategory();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteAllCategoryCorrectora();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteAllTreatment();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteAllBasalHoras();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> updateTreatment(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.Treament treament);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> updateTreatmentBasalHora(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora hora);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> updateBasalCategory(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios horarios);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> updateCorrectoraCategory(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.TreamentCorrectoraHorarios horarios);
}