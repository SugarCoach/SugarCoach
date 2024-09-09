package com.sugarcoachpremium.ui.treatment.interactor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0019\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u000fH&J/\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017H&J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001c0\u0017H&J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001c0\u0017H&J\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001c0\u0017H&J\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001c0\u0017H&J\u0014\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001c0\u0017H&J\u0014\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001c0\u0017H&J*\u0010\'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020)\u0018\u00010\u001c0(H\u00a6@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b*\u0010+J\u0014\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u001c0\u0017H&J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0017H&J\u000e\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0017H&J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001e\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u00104\u001a\u0002012\u0006\u00105\u001a\u000206H&J\u0011\u00107\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u00068"}, d2 = {"Lcom/sugarcoachpremium/ui/treatment/interactor/TreatmentInteractorImp;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "editBasalCategory", "Lio/reactivex/Observable;", "", "horarios", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentHorarios;", "editBasalHora", "hora", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentBasalHora;", "editCloudTreatment", "treatment", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editCorrectoraCategory", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentCorrectoraHorarios;", "editTreatment", "treament", "basalInsuline", "", "correctoraInsuline", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAverageBasal", "Lio/reactivex/Single;", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentAverage;", "getAverages", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterAverages;", "getBasalHoras", "", "getBasals", "Lcom/sugarcoachpremium/data/database/repository/treament/BasalInsuline;", "getBombas", "Lcom/sugarcoachpremium/data/database/repository/treament/BombaInfusora;", "getCategories", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentHorariosCategory;", "getCategoriesCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentHCorrectoraCategory;", "getCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/CorrectoraInsuline;", "getDailys", "Lkotlin/Result;", "Lcom/sugarcoachpremium/data/api_db/DailyRegister/DailyRegisterResponse;", "getDailys-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMedidores", "Lcom/sugarcoachpremium/data/database/repository/treament/Medidor;", "getTreatment", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "getUser", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "isDailyEmpty", "updateLocalPoints", "user", "points", "", "updateUserPoints", "app_debug"})
public abstract interface TreatmentInteractorImp extends com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.user.User> getUser();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> updateLocalPoints(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User user, int points);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateUserPoints(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> isDailyEmpty();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages> getAverages();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentAverage> getAverageBasal();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreatmentHorariosCategory>> getCategories();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreatmentHCorrectoraCategory>> getCategoriesCorrectora();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.BasalInsuline>> getBasals();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.Medidor>> getMedidores();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.BombaInfusora>> getBombas();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora>> getBasalHoras();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline>> getCorrectora();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora> getTreatment();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object editTreatment(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.Treament treament, @org.jetbrains.annotations.NotNull
    java.lang.String basalInsuline, @org.jetbrains.annotations.NotNull
    java.lang.String correctoraInsuline, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.reactivex.Observable<java.lang.Boolean>> $completion);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> editBasalHora(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora hora);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> editBasalCategory(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios horarios);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> editCorrectoraCategory(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentCorrectoraHorarios horarios);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object editCloudTreatment(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.Treament treatment, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
}