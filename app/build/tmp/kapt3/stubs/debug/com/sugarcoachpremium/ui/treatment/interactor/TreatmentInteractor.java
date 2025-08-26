package com.sugarcoachpremium.ui.treatment.interactor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020-H\u0016J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010/\u001a\u000200H\u0016J\u0019\u00101\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u000204H\u0016J/\u00105\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u00106\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0016J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020<09H\u0016J\u0014\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000>09H\u0016J\u0014\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0>09H\u0016J\u0014\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0>09H\u0016J\u0014\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0>09H\u0016J\u0014\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0>09H\u0016J\u0014\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0>09H\u0016J*\u0010I\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020K\u0018\u00010>0JH\u0096@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\bL\u0010MJ\u0014\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0>09H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020P09H\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020$09H\u0016J\u000e\u0010Q\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016J\u001e\u0010R\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010#\u001a\u00020$2\u0006\u0010S\u001a\u00020TH\u0016J\u0011\u0010U\u001a\u00020+H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006V"}, d2 = {"Lcom/sugarcoachpremium/ui/treatment/interactor/TreatmentInteractor;", "Lcom/sugarcoachpremium/data/ui/base/interactor/BaseInteractor;", "Lcom/sugarcoachpremium/ui/treatment/interactor/TreatmentInteractorImp;", "treamentRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;", "dailyRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;", "userRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;", "preferenceHelper", "Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;", "apiHelper", "Lcom/sugarcoachpremium/data/network/ApiHelper;", "(Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;Lcom/sugarcoachpremium/data/network/ApiHelper;)V", "apiRepository", "Lcom/sugarcoachpremium/data/api_db/ApiRepository;", "getApiRepository", "()Lcom/sugarcoachpremium/data/api_db/ApiRepository;", "setApiRepository", "(Lcom/sugarcoachpremium/data/api_db/ApiRepository;)V", "basalInsuline", "", "getBasalInsuline", "()Ljava/lang/String;", "setBasalInsuline", "(Ljava/lang/String;)V", "correctoraInsuline", "getCorrectoraInsuline", "setCorrectoraInsuline", "treatment", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "getTreatment", "()Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "setTreatment", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;)V", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "getUser", "()Lcom/sugarcoachpremium/data/database/repository/user/User;", "setUser", "(Lcom/sugarcoachpremium/data/database/repository/user/User;)V", "editBasalCategory", "Lio/reactivex/Observable;", "", "horarios", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentHorarios;", "editBasalHora", "hora", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentBasalHora;", "editCloudTreatment", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editCorrectoraCategory", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentCorrectoraHorarios;", "editTreatment", "treament", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAverageBasal", "Lio/reactivex/Single;", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentAverage;", "getAverages", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterAverages;", "getBasalHoras", "", "getBasals", "Lcom/sugarcoachpremium/data/database/repository/treament/BasalInsuline;", "getBombas", "Lcom/sugarcoachpremium/data/database/repository/treament/BombaInfusora;", "getCategories", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentHorariosCategory;", "getCategoriesCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentHCorrectoraCategory;", "getCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/CorrectoraInsuline;", "getDailys", "Lkotlin/Result;", "Lcom/sugarcoachpremium/data/api_db/DailyRegister/DailyRegisterResponse;", "getDailys-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMedidores", "Lcom/sugarcoachpremium/data/database/repository/treament/Medidor;", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "isDailyEmpty", "updateLocalPoints", "points", "", "updateUserPoints", "app_debug"})
public final class TreatmentInteractor extends com.sugarcoachpremium.data.ui.base.interactor.BaseInteractor implements com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractorImp {
    @org.jetbrains.annotations.NotNull
    private final com.sugarcoachpremium.data.database.repository.treament.TreamentRepo treamentRepoHelper = null;
    @org.jetbrains.annotations.NotNull
    private final com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo dailyRepoHelper = null;
    @javax.inject.Inject
    public com.sugarcoachpremium.data.api_db.ApiRepository apiRepository;
    public com.sugarcoachpremium.data.database.repository.treament.Treament treatment;
    public java.lang.String basalInsuline;
    public java.lang.String correctoraInsuline;
    public com.sugarcoachpremium.data.database.repository.user.User user;
    
    @javax.inject.Inject
    public TreatmentInteractor(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentRepo treamentRepoHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo dailyRepoHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.UserRepo userRepoHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.di.preferences.PreferenceHelper preferenceHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.network.ApiHelper apiHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.api_db.ApiRepository getApiRepository() {
        return null;
    }
    
    public final void setApiRepository(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.api_db.ApiRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.database.repository.treament.Treament getTreatment() {
        return null;
    }
    
    public final void setTreatment(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.Treament p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBasalInsuline() {
        return null;
    }
    
    public final void setBasalInsuline(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCorrectoraInsuline() {
        return null;
    }
    
    public final void setCorrectoraInsuline(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.database.repository.user.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User p0) {
    }
    
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @org.jetbrains.annotations.Nullable
    public java.lang.Object editTreatment(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.Treament treament, @org.jetbrains.annotations.NotNull
    java.lang.String basalInsuline, @org.jetbrains.annotations.NotNull
    java.lang.String correctoraInsuline, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.reactivex.Observable<java.lang.Boolean>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object editCloudTreatment(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.Treament treatment, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> updateLocalPoints(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User user, int points) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object updateUserPoints(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> editBasalHora(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora hora) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> editBasalCategory(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios horarios) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> editCorrectoraCategory(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentCorrectoraHorarios horarios) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> isDailyEmpty() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.user.User> getUser() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterAverages> getAverages() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentAverage> getAverageBasal() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreatmentHorariosCategory>> getCategories() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreatmentHCorrectoraCategory>> getCategoriesCorrectora() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.BasalInsuline>> getBasals() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.Medidor>> getMedidores() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.BombaInfusora>> getBombas() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora>> getBasalHoras() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<java.util.List<com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline>> getCorrectora() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora> getTreatment() {
        return null;
    }
}