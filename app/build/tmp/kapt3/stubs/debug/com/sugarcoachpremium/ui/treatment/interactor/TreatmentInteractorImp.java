package com.sugarcoachpremium.ui.treatment.interactor;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001e\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006H\u00a6@\u00a2\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H&J\u000e\u0010\u0011\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003H&J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00070\u0003H&J\u0014\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00070\u0003H&J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00070\u0003H&J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00070\u0003H&J\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00070\u0003H&J\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00070\u0003H&J\u0014\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00070\u0003H&J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0003H&J,\u0010\'\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u00a6@\u00a2\u0006\u0002\u0010-J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010/\u001a\u00020\"H&J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u00101\u001a\u000202H&J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u00101\u001a\u000204H&J\u0016\u00105\u001a\u00020\r2\u0006\u00106\u001a\u00020)H\u00a6@\u00a2\u0006\u0002\u00107\u00a8\u00068\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/treatment/interactor/TreatmentInteractorImp;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "getUser", "Lio/reactivex/Single;", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "getDailys", "Lkotlin/Result;", "", "Lcom/sugarcoachpremium/data/api_db/DailyRegister/DailyRegisterResponse;", "getDailys-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLocalPoints", "Lio/reactivex/Observable;", "", "user", "points", "", "updateUserPoints", "isDailyEmpty", "getAverages", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterAverages;", "getAverageBasal", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentAverage;", "getCategories", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentHorariosCategory;", "getCategoriesCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentHCorrectoraCategory;", "getBasals", "Lcom/sugarcoachpremium/data/database/repository/treament/BasalInsuline;", "getMedidores", "Lcom/sugarcoachpremium/data/database/repository/treament/Medidor;", "getBombas", "Lcom/sugarcoachpremium/data/database/repository/treament/BombaInfusora;", "getBasalHoras", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentBasalHora;", "getCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/CorrectoraInsuline;", "getTreatment", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "editTreatment", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "basalInsuline", "", "correctoraInsuline", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editBasalHora", "hora", "editBasalCategory", "horarios", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentHorarios;", "editCorrectoraCategory", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentCorrectoraHorarios;", "editCloudTreatment", "treatment", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TreatmentInteractorImp extends com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.user.User> getUser();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> updateLocalPoints(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.user.User user, int points);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateUserPoints(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> isDailyEmpty();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages> getAverages();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentAverage> getAverageBasal();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreatmentHorariosCategory>> getCategories();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreatmentHCorrectoraCategory>> getCategoriesCorrectora();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.BasalInsuline>> getBasals();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.Medidor>> getMedidores();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.BombaInfusora>> getBombas();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora>> getBasalHoras();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline>> getCorrectora();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora> getTreatment();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object editTreatment(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.Treament treament, @org.jetbrains.annotations.NotNull()
    java.lang.String basalInsuline, @org.jetbrains.annotations.NotNull()
    java.lang.String correctoraInsuline, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super io.reactivex.Observable<java.lang.Boolean>> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> editBasalHora(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora hora);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> editBasalCategory(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios horarios);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> editCorrectoraCategory(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.TreamentCorrectoraHorarios horarios);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object editCloudTreatment(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.Treament treatment, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
}