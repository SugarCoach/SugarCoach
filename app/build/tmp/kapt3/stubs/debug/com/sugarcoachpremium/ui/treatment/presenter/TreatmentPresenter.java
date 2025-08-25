package com.sugarcoachpremium.ui.treatment.presenter;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u00f6\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B!\b\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ \u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u000202H\u0016J\b\u00105\u001a\u000200H\u0016J\u0010\u00106\u001a\u0002002\u0006\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u000208H\u0002J\u0010\u0010:\u001a\u0002002\u0006\u0010\u0014\u001a\u000202H\u0016J\u0010\u0010;\u001a\u0002002\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u000200H\u0016J\b\u0010?\u001a\u000200H\u0016J\b\u0010@\u001a\u000200H\u0016J\u0010\u0010A\u001a\u0002002\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u0002002\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010E\u001a\u0002002\u0006\u0010B\u001a\u00020FH\u0016J\u0010\u0010G\u001a\u0002002\u0006\u0010B\u001a\u00020FH\u0016J\u0010\u0010H\u001a\u0002002\u0006\u0010I\u001a\u000202H\u0016J\u0010\u0010J\u001a\u0002002\u0006\u0010B\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u0002002\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010M\u001a\u0002002\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010N\u001a\u0002002\u0006\u0010O\u001a\u000202H\u0016J\u0010\u0010P\u001a\u0002002\u0006\u0010I\u001a\u000202H\u0016J\u0006\u0010\u0016\u001a\u000200J\u0006\u0010\u001c\u001a\u000200J\u0006\u0010Q\u001a\u000200J\u0006\u0010R\u001a\u000200J\u0006\u0010S\u001a\u000200J\u0006\u0010T\u001a\u000200J\u0006\u0010U\u001a\u000200J\u0012\u0010V\u001a\u0002002\b\u0010W\u001a\u0004\u0018\u00010XH\u0016J\u0018\u0010Y\u001a\u0002002\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]H\u0016J\u0010\u0010^\u001a\u00020_2\u0006\u0010\\\u001a\u00020]H\u0002J\u0018\u0010`\u001a\u00020a2\u0006\u0010Z\u001a\u00020b2\u0006\u0010c\u001a\u00020_H\u0002J\u0010\u0010d\u001a\u00020!2\u0006\u0010e\u001a\u000208H\u0002J\u0010\u0010f\u001a\u00020=2\u0006\u0010Z\u001a\u00020[H\u0016J\u0017\u0010g\u001a\u0002002\b\u0010\\\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010hJ\b\u0010\u0010\u001a\u000200H\u0002J\b\u0010+\u001a\u000200H\u0002J\u0010\u0010i\u001a\u0002002\u0006\u0010j\u001a\u00020kH\u0002J\b\u0010l\u001a\u000200H\u0002J\u0016\u0010m\u001a\u0002002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020o0nH\u0002J\u0016\u0010p\u001a\u0002002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020q0nH\u0002J\u0016\u0010r\u001a\u0002002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020s0nH\u0002J\u0016\u0010t\u001a\u0002002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020u0nH\u0002J\u0016\u0010v\u001a\u0002002\f\u0010w\u001a\b\u0012\u0004\u0012\u00020x0nH\u0002J\u0016\u0010y\u001a\u0002002\f\u0010w\u001a\b\u0012\u0004\u0012\u00020z0nH\u0002J\u0016\u0010{\u001a\u0002002\f\u0010w\u001a\b\u0012\u0004\u0012\u00020|0nH\u0002J\u0016\u0010}\u001a\u0002002\u0006\u0010Z\u001a\u00020bH\u0096@\u00a2\u0006\u0002\u0010~J%\u0010\u007f\u001a\u000f\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u0002080\u0080\u00012\u000e\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0082\u00010nH\u0002J\'\u0010\u0083\u0001\u001a\u0002002\u0014\u0010\u0084\u0001\u001a\u000f\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u0002080\u0080\u00012\u0006\u0010Z\u001a\u00020bH\u0002R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010#\"\u0004\b(\u0010%R\u001a\u0010)\u001a\u00020*X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u00a8\u0006\u0085\u0001"}, d2 = {"Lcom/sugarcoachpremium/ui/treatment/presenter/TreatmentPresenter;", "V", "Lcom/sugarcoachpremium/ui/treatment/view/TreatmentView;", "I", "Lcom/sugarcoachpremium/ui/treatment/interactor/TreatmentInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/BasePresenter;", "Lcom/sugarcoachpremium/ui/treatment/presenter/TreatmentPresenterImp;", "interactor", "schedulerProvider", "Lcom/sugarcoachpremium/util/SchedulerProvider;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "<init>", "(Lcom/sugarcoachpremium/ui/treatment/interactor/TreatmentInteractorImp;Lcom/sugarcoachpremium/util/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "treatment", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "getTreatment", "()Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "setTreatment", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;)V", "correctora", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentCorrectoraHorarios;", "getCorrectora", "()Lcom/sugarcoachpremium/data/database/repository/treament/TreamentCorrectoraHorarios;", "setCorrectora", "(Lcom/sugarcoachpremium/data/database/repository/treament/TreamentCorrectoraHorarios;)V", "basal", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentHorarios;", "getBasal", "()Lcom/sugarcoachpremium/data/database/repository/treament/TreamentHorarios;", "setBasal", "(Lcom/sugarcoachpremium/data/database/repository/treament/TreamentHorarios;)V", "basalInsuline", "", "getBasalInsuline", "()Ljava/lang/String;", "setBasalInsuline", "(Ljava/lang/String;)V", "correctoraInsuline", "getCorrectoraInsuline", "setCorrectoraInsuline", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "getUser", "()Lcom/sugarcoachpremium/data/database/repository/user/User;", "setUser", "(Lcom/sugarcoachpremium/data/database/repository/user/User;)V", "saveAll", "", "obj", "", "hipo", "hyper", "updateAll", "updatePoints", "points", "", "cantParametersChanged", "saveCorrectoraGlu", "saveBomb", "bomb", "", "goToActivityDaily", "goToActivityMain", "goToActivityStatistic", "saveBasal", "item", "Lcom/sugarcoachpremium/ui/treatment/view/BasalItem;", "saveCorrectora", "saveCategory", "Lcom/sugarcoachpremium/ui/treatment/view/HorarioItem;", "saveCorrectoraCategory", "saveUnitCorrectora", "unit", "saveHoraBasal", "Lcom/sugarcoachpremium/ui/treatment/view/BasalHoraItem;", "saveMedidor", "saveBomba", "saveCarbono", "carbono", "saveUnitInsulina", "getMedidores", "getBombas", "getCategories", "getCategoriesCorrectora", "getBasalHoras", "showException", "throwable", "", "getScreenShot", "context", "Landroid/app/Activity;", "view", "Landroid/view/View;", "getScreenShotImage", "Landroid/graphics/Bitmap;", "getImageUri", "Landroid/net/Uri;", "Landroid/content/Context;", "inImage", "getRandomString", "length", "checkAndRequestPermissions", "onAttach", "(Lcom/sugarcoachpremium/ui/treatment/view/TreatmentView;)V", "getPromedio", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "getTotalBasal", "getDataBasal", "", "Lcom/sugarcoachpremium/data/database/repository/treament/BasalInsuline;", "getDataMedidor", "Lcom/sugarcoachpremium/data/database/repository/treament/Medidor;", "getDataBomba", "Lcom/sugarcoachpremium/data/database/repository/treament/BombaInfusora;", "getDataCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/CorrectoraInsuline;", "getDataCategories", "horarios", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentHorariosCategory;", "getDataCategoriesCorrectora", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentHCorrectoraCategory;", "getDataBasalHora", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentBasalHora;", "makePdf", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkCantColumns", "", "dailys", "Lcom/sugarcoachpremium/data/api_db/DailyRegister/DailyRegisterResponse;", "setUpTable", "columns", "app_debug"})
public final class TreatmentPresenter<V extends com.sugarcoachpremium.ui.treatment.view.TreatmentView, I extends com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.BasePresenter<V, I> implements com.sugarcoachpremium.ui.treatment.presenter.TreatmentPresenterImp<V, I> {
    public com.sugarcoachpremium.data.database.repository.treament.Treament treatment;
    public com.sugarcoachpremium.data.database.repository.treament.TreamentCorrectoraHorarios correctora;
    public com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios basal;
    public java.lang.String basalInsuline;
    public java.lang.String correctoraInsuline;
    public com.sugarcoachpremium.data.database.repository.user.User user;
    
    @javax.inject.Inject()
    public TreatmentPresenter(@org.jetbrains.annotations.NotNull()
    I interactor, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.treament.Treament getTreatment() {
        return null;
    }
    
    public final void setTreatment(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.Treament p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.treament.TreamentCorrectoraHorarios getCorrectora() {
        return null;
    }
    
    public final void setCorrectora(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.TreamentCorrectoraHorarios p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios getBasal() {
        return null;
    }
    
    public final void setBasal(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBasalInsuline() {
        return null;
    }
    
    public final void setBasalInsuline(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCorrectoraInsuline() {
        return null;
    }
    
    public final void setCorrectoraInsuline(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.user.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.user.User p0) {
    }
    
    @java.lang.Override()
    public void saveAll(float obj, float hipo, float hyper) {
    }
    
    @java.lang.Override()
    public void updateAll() {
    }
    
    private final void updatePoints(int points) {
    }
    
    private final int cantParametersChanged() {
        return 0;
    }
    
    @java.lang.Override()
    public void saveCorrectoraGlu(float correctora) {
    }
    
    @java.lang.Override()
    public void saveBomb(boolean bomb) {
    }
    
    @java.lang.Override()
    public void goToActivityDaily() {
    }
    
    @java.lang.Override()
    public void goToActivityMain() {
    }
    
    @java.lang.Override()
    public void goToActivityStatistic() {
    }
    
    @java.lang.Override()
    public void saveBasal(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.BasalItem item) {
    }
    
    @java.lang.Override()
    public void saveCorrectora(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.BasalItem item) {
    }
    
    @java.lang.Override()
    public void saveCategory(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.HorarioItem item) {
    }
    
    @java.lang.Override()
    public void saveCorrectoraCategory(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.HorarioItem item) {
    }
    
    @java.lang.Override()
    public void saveUnitCorrectora(float unit) {
    }
    
    @java.lang.Override()
    public void saveHoraBasal(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.BasalHoraItem item) {
    }
    
    @java.lang.Override()
    public void saveMedidor(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.BasalItem item) {
    }
    
    @java.lang.Override()
    public void saveBomba(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.BasalItem item) {
    }
    
    @java.lang.Override()
    public void saveCarbono(float carbono) {
    }
    
    @java.lang.Override()
    public void saveUnitInsulina(float unit) {
    }
    
    public final void getCorrectora() {
    }
    
    public final void getBasal() {
    }
    
    public final void getMedidores() {
    }
    
    public final void getBombas() {
    }
    
    public final void getCategories() {
    }
    
    public final void getCategoriesCorrectora() {
    }
    
    public final void getBasalHoras() {
    }
    
    @java.lang.Override()
    public void showException(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public void getScreenShot(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final android.graphics.Bitmap getScreenShotImage(android.view.View view) {
        return null;
    }
    
    private final android.net.Uri getImageUri(android.content.Context context, android.graphics.Bitmap inImage) {
        return null;
    }
    
    private final java.lang.String getRandomString(int length) {
        return null;
    }
    
    @java.lang.Override()
    public boolean checkAndRequestPermissions(@org.jetbrains.annotations.NotNull()
    android.app.Activity context) {
        return false;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    V view) {
    }
    
    private final void getTreatment() {
    }
    
    private final void getUser() {
    }
    
    private final void getPromedio(com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora treament) {
    }
    
    private final void getTotalBasal() {
    }
    
    private final void getDataBasal(java.util.List<com.sugarcoachpremium.data.database.repository.treament.BasalInsuline> basal) {
    }
    
    private final void getDataMedidor(java.util.List<com.sugarcoachpremium.data.database.repository.treament.Medidor> basal) {
    }
    
    private final void getDataBomba(java.util.List<com.sugarcoachpremium.data.database.repository.treament.BombaInfusora> basal) {
    }
    
    private final void getDataCorrectora(java.util.List<com.sugarcoachpremium.data.database.repository.treament.CorrectoraInsuline> basal) {
    }
    
    private final void getDataCategories(java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreatmentHorariosCategory> horarios) {
    }
    
    private final void getDataCategoriesCorrectora(java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreatmentHCorrectoraCategory> horarios) {
    }
    
    private final void getDataBasalHora(java.util.List<com.sugarcoachpremium.data.database.repository.treament.TreamentBasalHora> horarios) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object makePdf(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.Integer> checkCantColumns(java.util.List<com.sugarcoachpremium.data.api_db.DailyRegister.DailyRegisterResponse> dailys) {
        return null;
    }
    
    private final void setUpTable(java.util.Map<java.lang.String, java.lang.Integer> columns, android.content.Context context) {
    }
}