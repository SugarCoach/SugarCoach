package com.sugarcoachpremium.ui.daily.presenter;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B!\b\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010*J\b\u00102\u001a\u00020(H\u0002J\u000f\u0010\u001f\u001a\u0004\u0018\u000103H\u0002\u00a2\u0006\u0002\u00104J\u000f\u0010%\u001a\u0004\u0018\u000103H\u0002\u00a2\u0006\u0002\u00104J\u000f\u00105\u001a\u0004\u0018\u000103H\u0002\u00a2\u0006\u0002\u00104J\b\u00106\u001a\u00020(H\u0016J\u0014\u00107\u001a\u00020(2\f\u00108\u001a\b\u0012\u0004\u0012\u0002090\u001dJ$\u0010:\u001a\u00020(2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u001d2\f\u00108\u001a\b\u0012\u0004\u0012\u0002090\u001dH\u0002J\b\u0010=\u001a\u00020\u0016H\u0002J\b\u0010>\u001a\u00020(H\u0002J\u0010\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020\u0016H\u0016J\b\u0010A\u001a\u00020(H\u0016J\u0010\u0010B\u001a\u00020\u00162\u0006\u0010C\u001a\u00020DH\u0002J\b\u0010E\u001a\u00020(H\u0016J\b\u0010F\u001a\u00020(H\u0016J\b\u0010G\u001a\u00020(H\u0016J\b\u0010H\u001a\u00020(H\u0016J\b\u0010I\u001a\u000201H\u0016J0\u0010J\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010K\u0018\u00010,0,2\u0018\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0-0,R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R \u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0-0,X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006L"}, d2 = {"Lcom/sugarcoachpremium/ui/daily/presenter/DailyPresenter;", "V", "Lcom/sugarcoachpremium/ui/daily/view/DailyView;", "I", "Lcom/sugarcoachpremium/ui/daily/interactor/DailyInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/BasePresenter;", "Lcom/sugarcoachpremium/ui/daily/presenter/DailyPresenterImp;", "interactor", "schedulerProvider", "Lcom/sugarcoachpremium/util/SchedulerProvider;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "<init>", "(Lcom/sugarcoachpremium/ui/daily/interactor/DailyInteractorImp;Lcom/sugarcoachpremium/util/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "getTreament", "()Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "setTreament", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;)V", "colors", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getColors", "()Ljava/util/ArrayList;", "setColors", "(Ljava/util/ArrayList;)V", "exercices", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Exercises;", "getExercices", "()Ljava/util/List;", "setExercices", "(Ljava/util/List;)V", "emotions", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/States;", "getEmotions", "setEmotions", "onAttach", "", "view", "(Lcom/sugarcoachpremium/ui/daily/view/DailyView;)V", "registers", "", "Lcom/hominoid/expandablerecyclerviewlib/models/ExpandableListItem;", "Lcom/sugarcoachpremium/ui/daily/view/DailyHeader;", "Lcom/sugarcoachpremium/ui/daily/view/DailyItem;", "path", "", "getTreatment", "", "()Ljava/lang/Boolean;", "getUser", "getRegisters", "getDates", "date", "Ljava/util/Date;", "getData", "dailyRegister", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCategory;", "generateRandomColor", "getMedition", "goToActivityDailyDetail", "id", "onResume", "getColorType", "value", "", "goToActivityTreament", "goToActivityMain", "goToActivityStatistic", "goToActivityRegister", "getPdfPath", "separateByDate", "Lcom/sugarcoachpremium/ui/daily/view/DayItem;", "app_debug"})
public final class DailyPresenter<V extends com.sugarcoachpremium.ui.daily.view.DailyView, I extends com.sugarcoachpremium.ui.daily.interactor.DailyInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.BasePresenter<V, I> implements com.sugarcoachpremium.ui.daily.presenter.DailyPresenterImp<V, I> {
    public com.sugarcoachpremium.data.database.repository.treament.Treament treament;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.Integer> colors;
    public java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises> exercices;
    public java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States> emotions;
    private java.util.List<com.hominoid.expandablerecyclerviewlib.models.ExpandableListItem<com.sugarcoachpremium.ui.daily.view.DailyHeader, com.sugarcoachpremium.ui.daily.view.DailyItem>> registers;
    private java.lang.String path;
    
    @javax.inject.Inject()
    public DailyPresenter(@org.jetbrains.annotations.NotNull()
    I interactor, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.treament.Treament getTreament() {
        return null;
    }
    
    public final void setTreament(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.Treament p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getColors() {
        return null;
    }
    
    public final void setColors(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises> getExercices() {
        return null;
    }
    
    public final void setExercices(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States> getEmotions() {
        return null;
    }
    
    public final void setEmotions(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States> p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    V view) {
    }
    
    private final void getTreatment() {
    }
    
    private final java.lang.Boolean getExercices() {
        return null;
    }
    
    private final java.lang.Boolean getEmotions() {
        return null;
    }
    
    private final java.lang.Boolean getUser() {
        return null;
    }
    
    @java.lang.Override()
    public void getRegisters() {
    }
    
    public final void getDates(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.util.Date> date) {
    }
    
    private final void getData(java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory> dailyRegister, java.util.List<? extends java.util.Date> date) {
    }
    
    private final int generateRandomColor() {
        return 0;
    }
    
    private final void getMedition() {
    }
    
    @java.lang.Override()
    public void goToActivityDailyDetail(int id) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final int getColorType(float value) {
        return 0;
    }
    
    @java.lang.Override()
    public void goToActivityTreament() {
    }
    
    @java.lang.Override()
    public void goToActivityMain() {
    }
    
    @java.lang.Override()
    public void goToActivityStatistic() {
    }
    
    @java.lang.Override()
    public void goToActivityRegister() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getPdfPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.List<com.sugarcoachpremium.ui.daily.view.DayItem>> separateByDate(@org.jetbrains.annotations.NotNull()
    java.util.List<com.hominoid.expandablerecyclerviewlib.models.ExpandableListItem<com.sugarcoachpremium.ui.daily.view.DailyHeader, com.sugarcoachpremium.ui.daily.view.DailyItem>> registers) {
        return null;
    }
}