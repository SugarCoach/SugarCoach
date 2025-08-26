package com.sugarcoachpremium.data.database.repository.treament;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H\u0016J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010H\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0010H\u0016J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0010H\u0016J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020#0\u0010H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\fH\u0016J\u0014\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00100\fH\u0016J\u0014\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\fH\u0016J\u0014\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00100\fH\u0016J\u0014\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00100\fH\u0016J\u0014\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00100\fH\u0016J\u0014\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00100\fH\u0016J\u0014\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00100\fH\u0016J\u0014\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00100\fH\u0016J.\u00108\u001a\b\u0012\u0004\u0012\u0002090\f2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u00020;H\u0016J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020!0\f2\u0006\u0010@\u001a\u00020;H\u0016J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010 \u001a\u00020!H\u0016J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010 \u001a\u00020#H\u0016J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010E\u001a\u00020\u001eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepository;", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;", "treamentDao", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentDao;", "(Lcom/sugarcoachpremium/data/database/repository/treament/TreamentDao;)V", "deleteAllBasalHoras", "Lio/reactivex/Observable;", "", "deleteAllCategory", "deleteAllCategoryCorrectora", "deleteAllTreatment", "getAverage", "Lio/reactivex/Single;", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentAverage;", "insertBasal", "basal", "", "Lcom/sugarcoachpremium/data/database/repository/treament/BasalInsuline;", "insertBombas", "item", "Lcom/sugarcoachpremium/data/database/repository/treament/BombaInfusora;", "insertCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/CorrectoraInsuline;", "insertMedidor", "Lcom/sugarcoachpremium/data/database/repository/treament/Medidor;", "insertTreament", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "insertTreamentBasalHoras", "horas", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentBasalHora;", "insertTreamentCategory", "horarios", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentHorarios;", "insertTreamentCategoryCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentCorrectoraHorarios;", "isBasalRepoEmpty", "isBombasRepoEmpty", "isCorrectoraRepoEmpty", "isMedidorRepoEmpty", "isTreamentBasalHoraRepoEmpty", "isTreamentCategoryCorrectoraRepoEmpty", "isTreamentCategoryRepoEmpty", "isTreamentRepoEmpty", "load", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "loadAll", "loadAllBasal", "loadAllBasalHora", "loadAllBombas", "loadAllCategory", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentHorariosCategory;", "loadAllCategoryCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentHCorrectoraCategory;", "loadAllCorrectora", "loadAllMedidor", "loadInsuline", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterInsuline;", "breakfast_id", "", "snack_id", "lunch_id", "dinner_id", "loadTreatmentByCategory", "id", "updateBasalCategory", "updateCorrectoraCategory", "updateTreatment", "updateTreatmentBasalHora", "hora", "app_debug"})
public final class TreamentRepository implements com.sugarcoachpremium.data.database.repository.treament.TreamentRepo {
    @org.jetbrains.annotations.NotNull
    private final com.sugarcoachpremium.data.database.repository.treament.TreamentDao treamentDao = null;
    
    @javax.inject.Inject
    public TreamentRepository(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentDao treamentDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentAverage> getAverage() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> updateTreatment(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.Treament treament) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> updateTreatmentBasalHora(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora hora) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> updateBasalCategory(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios horarios) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> updateCorrectoraCategory(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentCorrectoraHorarios horarios) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> isTreamentRepoEmpty() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterInsuline> loadInsuline(int breakfast_id, int snack_id, int lunch_id, int dinner_id) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.Treament>> loadAll() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora> load() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> insertTreament(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.Treament treament) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> isTreamentCategoryRepoEmpty() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> isTreamentBasalHoraRepoEmpty() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreatmentHorariosCategory>> loadAllCategory() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora>> loadAllBasalHora() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios> loadTreatmentByCategory(int id) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> insertTreamentCategoryCorrectora(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentCorrectoraHorarios> horarios) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> isTreamentCategoryCorrectoraRepoEmpty() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreatmentHCorrectoraCategory>> loadAllCategoryCorrectora() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> insertTreamentCategory(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios> horarios) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> insertTreamentBasalHoras(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora> horas) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> isBasalRepoEmpty() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.BasalInsuline>> loadAllBasal() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> insertMedidor(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.Medidor> item) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> isMedidorRepoEmpty() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.Medidor>> loadAllMedidor() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> isBombasRepoEmpty() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> insertBombas(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.BombaInfusora> item) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.BombaInfusora>> loadAllBombas() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> insertBasal(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.BasalInsuline> basal) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> isCorrectoraRepoEmpty() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline>> loadAllCorrectora() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> insertCorrectora(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline> item) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> deleteAllCategory() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> deleteAllCategoryCorrectora() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> deleteAllTreatment() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> deleteAllBasalHoras() {
        return null;
    }
}