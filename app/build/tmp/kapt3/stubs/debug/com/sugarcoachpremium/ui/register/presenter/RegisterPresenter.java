package com.sugarcoachpremium.ui.register.presenter;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u00d0\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B!\b\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010c\u001a\u00020d2\b\u0010e\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010fJ\b\u0010g\u001a\u00020dH\u0016J\b\u0010h\u001a\u00020dH\u0016J\u000f\u0010S\u001a\u0004\u0018\u00010iH\u0002\u00a2\u0006\u0002\u0010jJ\u000f\u0010*\u001a\u0004\u0018\u00010iH\u0002\u00a2\u0006\u0002\u0010jJ\u000f\u0010%\u001a\u0004\u0018\u00010iH\u0002\u00a2\u0006\u0002\u0010jJ\u0016\u0010k\u001a\u00020d2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J\b\u0010\u0016\u001a\u00020dH\u0002J\b\u0010m\u001a\u00020dH\u0002J\b\u0010n\u001a\u00020dH\u0002J\u0016\u0010o\u001a\u00020d2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J\b\u0010p\u001a\u00020dH\u0016J\u0006\u0010q\u001a\u00020dJ\u0018\u0010r\u001a\u00020d2\b\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010s\u001a\u00020d2\u0006\u0010t\u001a\u00020-H\u0002J\b\u0010u\u001a\u00020-H\u0002J \u0010v\u001a\u00020d2\b\u0010w\u001a\u0004\u0018\u00010;2\u0006\u0010:\u001a\u00020x2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010y\u001a\u00020dH\u0016J\u0010\u0010z\u001a\u00020d2\u0006\u0010{\u001a\u00020/H\u0016J\u0010\u0010|\u001a\u00020d2\u0006\u0010K\u001a\u00020;H\u0016J\u0018\u0010}\u001a\u00020i2\u0006\u0010,\u001a\u00020-2\u0006\u0010~\u001a\u00020/H\u0002J \u0010\u007f\u001a\u00020d2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J%\u0010\u0080\u0001\u001a\u00020i2\b\u0010\u0081\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00012\b\u0010\u0084\u0001\u001a\u00030\u0082\u0001J\u0011\u0010\u0085\u0001\u001a\u00020d2\u0006\u0010~\u001a\u00020;H\u0016J\u0011\u0010\u0086\u0001\u001a\u00020d2\u0006\u0010~\u001a\u00020;H\u0016J\u0011\u0010\u0087\u0001\u001a\u00020d2\u0006\u0010~\u001a\u00020-H\u0016J\u001b\u0010\u0088\u0001\u001a\u00020d2\u0007\u0010\u0089\u0001\u001a\u00020-2\u0007\u0010\u008a\u0001\u001a\u00020-H\u0016J#\u0010[\u001a\u00020d2\u0007\u0010\u008b\u0001\u001a\u00020-2\u0007\u0010\u008c\u0001\u001a\u00020-2\u0007\u0010\u008d\u0001\u001a\u00020-H\u0016J\u001d\u0010\u008e\u0001\u001a\u00020d2\b\u0010\u008f\u0001\u001a\u00030\u0090\u00012\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0016J\u001d\u0010\u0093\u0001\u001a\u00020d2\b\u0010\u008f\u0001\u001a\u00030\u0090\u00012\b\u0010\u0094\u0001\u001a\u00030\u0095\u0001H\u0016J\u0013\u0010\u0096\u0001\u001a\u00020d2\b\u0010\u0097\u0001\u001a\u00030\u0098\u0001H\u0016J\'\u0010\u0099\u0001\u001a\u00020d2\u0007\u0010\u009a\u0001\u001a\u00020-2\u0007\u0010\u009b\u0001\u001a\u00020-2\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u0001H\u0016J2\u0010\u009e\u0001\u001a\u00020d2\u0007\u0010\u009a\u0001\u001a\u00020-2\u000e\u0010\u009f\u0001\u001a\t\u0012\u0004\u0012\u00020;0\u00a0\u00012\b\u0010\u00a1\u0001\u001a\u00030\u00a2\u0001H\u0016\u00a2\u0006\u0003\u0010\u00a3\u0001J\t\u0010\u00a4\u0001\u001a\u00020dH\u0016J\t\u0010\u00a5\u0001\u001a\u00020dH\u0016J\t\u0010\u00a6\u0001\u001a\u00020dH\u0016J\t\u0010\u00a7\u0001\u001a\u00020dH\u0016J\t\u0010\u00a8\u0001\u001a\u00020dH\u0016R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010!\u001a\u0012\u0012\u0004\u0012\u00020#0\"j\b\u0012\u0004\u0012\u00020#`$X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R*\u0010)\u001a\u0012\u0012\u0004\u0012\u00020#0\"j\b\u0012\u0004\u0012\u00020#`$X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u000e\u0010,\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u00020/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\u001a\u00107\u001a\u00020/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\u001a\u0010:\u001a\u00020;X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010@\u001a\u0004\u0018\u00010;X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R\u001c\u0010C\u001a\u0004\u0018\u00010;X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010=\"\u0004\bE\u0010?R\u001a\u0010F\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020;X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010=\"\u0004\bM\u0010?R\u001a\u0010N\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010H\"\u0004\bP\u0010JR\u001a\u0010Q\u001a\u00020RX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001e\u0010W\u001a\u00020X8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R \u0010]\u001a\b\u0012\u0004\u0012\u00020#0\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u001e\"\u0004\b_\u0010 R \u0010`\u001a\b\u0012\u0004\u0012\u00020#0\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u001e\"\u0004\bb\u0010 \u00a8\u0006\u00a9\u0001"}, d2 = {"Lcom/sugarcoachpremium/ui/register/presenter/RegisterPresenter;", "V", "Lcom/sugarcoachpremium/ui/register/view/RegisterView;", "I", "Lcom/sugarcoachpremium/ui/register/interactor/RegisterInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/BasePresenter;", "Lcom/sugarcoachpremium/ui/register/presenter/RegisterPresenterImp;", "interactor", "schedulerProvider", "Lcom/sugarcoachpremium/util/SchedulerProvider;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "<init>", "(Lcom/sugarcoachpremium/ui/register/interactor/RegisterInteractorImp;Lcom/sugarcoachpremium/util/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "dailyRegister", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "getDailyRegister", "()Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "setDailyRegister", "(Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;)V", "treatment", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "getTreatment", "()Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "setTreatment", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;)V", "category", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Category;", "getCategory", "()Ljava/util/List;", "setCategory", "(Ljava/util/List;)V", "emotions", "Ljava/util/ArrayList;", "Lcom/sugarcoachpremium/ui/register/view/RegisterItem;", "Lkotlin/collections/ArrayList;", "getEmotions", "()Ljava/util/ArrayList;", "setEmotions", "(Ljava/util/ArrayList;)V", "exercices", "getExercices", "setExercices", "type", "", "glucose", "", "getGlucose", "()F", "setGlucose", "(F)V", "carbohydrates", "getCarbohydrates", "setCarbohydrates", "insulin", "getInsulin", "setInsulin", "photo", "", "getPhoto", "()Ljava/lang/String;", "setPhoto", "(Ljava/lang/String;)V", "exercise", "getExercise", "setExercise", "emotionalState", "getEmotionalState", "setEmotionalState", "label", "getLabel", "()I", "setLabel", "(I)V", "comment", "getComment", "setComment", "color", "getColor", "setColor", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "getUser", "()Lcom/sugarcoachpremium/data/database/repository/user/User;", "setUser", "(Lcom/sugarcoachpremium/data/database/repository/user/User;)V", "date", "Lorg/joda/time/LocalDateTime;", "getDate", "()Lorg/joda/time/LocalDateTime;", "setDate", "(Lorg/joda/time/LocalDateTime;)V", "dailyExcercises", "getDailyExcercises", "setDailyExcercises", "dailyEmotions", "getDailyEmotions", "setDailyEmotions", "onAttach", "", "view", "(Lcom/sugarcoachpremium/ui/register/view/RegisterView;)V", "nextLoad", "prevLoad", "", "()Ljava/lang/Boolean;", "checkDaily", "categories", "getTreatmentHorario", "getCategories", "getLastDaily", "finishLoad", "finishRegister", "saveRegister", "updatePoints", "points", "cantParametersChanged", "uploadPhoto", "id", "Ljava/io/File;", "backLoad", "checkValue", "floatValue", "saveComment", "getRange", "value", "getMedition", "timeBetween", "time", "Lorg/joda/time/LocalTime;", "startTime", "endTime", "setExercises", "setEmocional", "setMedition", "setTime", "hourOfDay", "minute", "year", "monthOfYear", "dayOfMonth", "showDateDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "dateSetListener", "Lcom/wdullaer/materialdatetimepicker/date/DatePickerDialog$OnDateSetListener;", "showTimeDialog", "timeSetListener", "Lcom/wdullaer/materialdatetimepicker/time/TimePickerDialog$OnTimeSetListener;", "initChooser", "context", "Landroid/app/Activity;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "showChooser", "goToActivityDaily", "goToActivityMain", "goToActivityStatistic", "goToActivityTreament", "app_debug"})
public final class RegisterPresenter<V extends com.sugarcoachpremium.ui.register.view.RegisterView, I extends com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.BasePresenter<V, I> implements com.sugarcoachpremium.ui.register.presenter.RegisterPresenterImp<V, I> {
    public com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister;
    public com.sugarcoachpremium.data.database.repository.treament.Treament treatment;
    public java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> category;
    public java.util.ArrayList<com.sugarcoachpremium.ui.register.view.RegisterItem> emotions;
    public java.util.ArrayList<com.sugarcoachpremium.ui.register.view.RegisterItem> exercices;
    private int type = 0;
    private float glucose = 0.0F;
    private float carbohydrates = 0.0F;
    private float insulin = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String photo = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String exercise;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String emotionalState;
    private int label = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String comment = "";
    private int color = 0;
    public com.sugarcoachpremium.data.database.repository.user.User user;
    @javax.inject.Inject()
    public org.joda.time.LocalDateTime date;
    public java.util.List<com.sugarcoachpremium.ui.register.view.RegisterItem> dailyExcercises;
    public java.util.List<com.sugarcoachpremium.ui.register.view.RegisterItem> dailyEmotions;
    
    @javax.inject.Inject()
    public RegisterPresenter(@org.jetbrains.annotations.NotNull()
    I interactor, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister getDailyRegister() {
        return null;
    }
    
    public final void setDailyRegister(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.treament.Treament getTreatment() {
        return null;
    }
    
    public final void setTreatment(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.Treament p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sugarcoachpremium.ui.register.view.RegisterItem> getEmotions() {
        return null;
    }
    
    public final void setEmotions(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.sugarcoachpremium.ui.register.view.RegisterItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sugarcoachpremium.ui.register.view.RegisterItem> getExercices() {
        return null;
    }
    
    public final void setExercices(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.sugarcoachpremium.ui.register.view.RegisterItem> p0) {
    }
    
    public final float getGlucose() {
        return 0.0F;
    }
    
    public final void setGlucose(float p0) {
    }
    
    public final float getCarbohydrates() {
        return 0.0F;
    }
    
    public final void setCarbohydrates(float p0) {
    }
    
    public final float getInsulin() {
        return 0.0F;
    }
    
    public final void setInsulin(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoto() {
        return null;
    }
    
    public final void setPhoto(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExercise() {
        return null;
    }
    
    public final void setExercise(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmotionalState() {
        return null;
    }
    
    public final void setEmotionalState(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getLabel() {
        return 0;
    }
    
    public final void setLabel(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getComment() {
        return null;
    }
    
    public final void setComment(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getColor() {
        return 0;
    }
    
    public final void setColor(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.user.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.user.User p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.joda.time.LocalDateTime getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    org.joda.time.LocalDateTime p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sugarcoachpremium.ui.register.view.RegisterItem> getDailyExcercises() {
        return null;
    }
    
    public final void setDailyExcercises(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.ui.register.view.RegisterItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sugarcoachpremium.ui.register.view.RegisterItem> getDailyEmotions() {
        return null;
    }
    
    public final void setDailyEmotions(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.ui.register.view.RegisterItem> p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    V view) {
    }
    
    @java.lang.Override()
    public void nextLoad() {
    }
    
    @java.lang.Override()
    public void prevLoad() {
    }
    
    private final java.lang.Boolean getUser() {
        return null;
    }
    
    private final java.lang.Boolean getExercices() {
        return null;
    }
    
    private final java.lang.Boolean getEmotions() {
        return null;
    }
    
    private final void checkDaily(java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> categories) {
    }
    
    private final void getTreatment() {
    }
    
    private final void getTreatmentHorario() {
    }
    
    private final void getCategories() {
    }
    
    private final void getLastDaily(java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> categories) {
    }
    
    @java.lang.Override()
    public void finishLoad() {
    }
    
    public final void finishRegister() {
    }
    
    public final void saveRegister(@org.jetbrains.annotations.Nullable()
    java.lang.String photo, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister) {
    }
    
    private final void updatePoints(int points) {
    }
    
    private final int cantParametersChanged() {
        return 0;
    }
    
    public final void uploadPhoto(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.io.File photo, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister) {
    }
    
    @java.lang.Override()
    public void backLoad() {
    }
    
    @java.lang.Override()
    public void checkValue(float floatValue) {
    }
    
    @java.lang.Override()
    public void saveComment(@org.jetbrains.annotations.NotNull()
    java.lang.String comment) {
    }
    
    private final boolean getRange(int type, float value) {
        return false;
    }
    
    private final void getMedition(com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister, java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> category) {
    }
    
    public final boolean timeBetween(@org.jetbrains.annotations.NotNull()
    org.joda.time.LocalTime time, @org.jetbrains.annotations.NotNull()
    org.joda.time.LocalTime startTime, @org.jetbrains.annotations.NotNull()
    org.joda.time.LocalTime endTime) {
        return false;
    }
    
    @java.lang.Override()
    public void setExercises(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public void setEmocional(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public void setMedition(int value) {
    }
    
    @java.lang.Override()
    public void setTime(int hourOfDay, int minute) {
    }
    
    @java.lang.Override()
    public void setDate(int year, int monthOfYear, int dayOfMonth) {
    }
    
    @java.lang.Override()
    public void showDateDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    com.wdullaer.materialdatetimepicker.date.DatePickerDialog.OnDateSetListener dateSetListener) {
    }
    
    @java.lang.Override()
    public void showTimeDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener timeSetListener) {
    }
    
    @java.lang.Override()
    public void initChooser(@org.jetbrains.annotations.NotNull()
    android.app.Activity context) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void showChooser() {
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
    public void goToActivityTreament() {
    }
}