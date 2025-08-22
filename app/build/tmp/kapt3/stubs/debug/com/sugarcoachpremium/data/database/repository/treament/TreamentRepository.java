package com.sugarcoachpremium.data.database.repository.treament;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001f0\u0007H\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0007H\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0014\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001f0\u0007H\u0016J\u0014\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001f0\u0007H\u0016J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\u0006\u0010)\u001a\u00020\u001aH\u0016J\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00150\u001fH\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0014\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u001f0\u0007H\u0016J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u001fH\u0016J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100\u001fH\u0016J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0014\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u001f0\u0007H\u0016J\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u00105\u001a\b\u0012\u0004\u0012\u0002060\u001fH\u0016J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0014\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u001f0\u0007H\u0016J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u00105\u001a\b\u0012\u0004\u0012\u00020;0\u001fH\u0016J\u0014\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u001f0\u0007H\u0016J\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010>\u001a\b\u0012\u0004\u0012\u0002030\u001fH\u0016J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0014\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\u001f0\u0007H\u0016J\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u00105\u001a\b\u0012\u0004\u0012\u00020A0\u001fH\u0016J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006G"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepository;", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;", "treamentDao", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentDao;", "<init>", "(Lcom/sugarcoachpremium/data/database/repository/treament/TreamentDao;)V", "getAverage", "Lio/reactivex/Single;", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentAverage;", "updateTreatment", "Lio/reactivex/Observable;", "", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "updateTreatmentBasalHora", "hora", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentBasalHora;", "updateBasalCategory", "horarios", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentHorarios;", "updateCorrectoraCategory", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentCorrectoraHorarios;", "isTreamentRepoEmpty", "loadInsuline", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterInsuline;", "breakfast_id", "", "snack_id", "lunch_id", "dinner_id", "loadAll", "", "load", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "insertTreament", "isTreamentCategoryRepoEmpty", "isTreamentBasalHoraRepoEmpty", "loadAllCategory", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentHorariosCategory;", "loadAllBasalHora", "loadTreatmentByCategory", "id", "insertTreamentCategoryCorrectora", "isTreamentCategoryCorrectoraRepoEmpty", "loadAllCategoryCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentHCorrectoraCategory;", "insertTreamentCategory", "insertTreamentBasalHoras", "horas", "isBasalRepoEmpty", "loadAllBasal", "Lcom/sugarcoachpremium/data/database/repository/treament/BasalInsuline;", "insertMedidor", "item", "Lcom/sugarcoachpremium/data/database/repository/treament/Medidor;", "isMedidorRepoEmpty", "loadAllMedidor", "isBombasRepoEmpty", "insertBombas", "Lcom/sugarcoachpremium/data/database/repository/treament/BombaInfusora;", "loadAllBombas", "insertBasal", "basal", "isCorrectoraRepoEmpty", "loadAllCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/CorrectoraInsuline;", "insertCorrectora", "deleteAllCategory", "deleteAllCategoryCorrectora", "deleteAllTreatment", "deleteAllBasalHoras", "app_debug"})
public final class TreamentRepository implements com.sugarcoachpremium.data.database.repository.treament.TreamentRepo {
    @org.jetbrains.annotations.NotNull()
    private final com.sugarcoachpremium.data.database.repository.treament.TreamentDao treamentDao = null;
    
    @javax.inject.Inject()
    public TreamentRepository(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.TreamentDao treamentDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentAverage> getAverage() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> updateTreatment(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.Treament treament) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> updateTreatmentBasalHora(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora hora) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> updateBasalCategory(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios horarios) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> updateCorrectoraCategory(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.TreamentCorrectoraHorarios horarios) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> isTreamentRepoEmpty() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterInsuline> loadInsuline(int breakfast_id, int snack_id, int lunch_id, int dinner_id) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.Treament>> loadAll() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora> load() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> insertTreament(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.Treament treament) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> isTreamentCategoryRepoEmpty() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> isTreamentBasalHoraRepoEmpty() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreatmentHorariosCategory>> loadAllCategory() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora>> loadAllBasalHora() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios> loadTreatmentByCategory(int id) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> insertTreamentCategoryCorrectora(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentCorrectoraHorarios> horarios) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> isTreamentCategoryCorrectoraRepoEmpty() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreatmentHCorrectoraCategory>> loadAllCategoryCorrectora() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> insertTreamentCategory(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios> horarios) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> insertTreamentBasalHoras(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora> horas) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> isBasalRepoEmpty() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.BasalInsuline>> loadAllBasal() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> insertMedidor(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.Medidor> item) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> isMedidorRepoEmpty() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.Medidor>> loadAllMedidor() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> isBombasRepoEmpty() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> insertBombas(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.BombaInfusora> item) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.BombaInfusora>> loadAllBombas() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> insertBasal(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.BasalInsuline> basal) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> isCorrectoraRepoEmpty() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline>> loadAllCorrectora() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> insertCorrectora(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline> item) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> deleteAllCategory() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> deleteAllCategoryCorrectora() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> deleteAllTreatment() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Observable<java.lang.Boolean> deleteAllBasalHoras() {
        return null;
    }
}