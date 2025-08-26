package com.sugarcoachpremium.ui.daily.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B\u001f\b\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010,\u001a\u00020\u000fH\u0002J\u0010\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020/H\u0002J$\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00152\f\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0015H\u0002J\u0014\u00106\u001a\u0002012\f\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0015J\u000f\u0010\u0017\u001a\u0004\u0018\u000107H\u0002\u00a2\u0006\u0002\u00108J\u000f\u0010\u001d\u001a\u0004\u0018\u000107H\u0002\u00a2\u0006\u0002\u00108J\b\u00109\u001a\u000201H\u0002J\b\u0010:\u001a\u00020 H\u0016J\b\u0010;\u001a\u000201H\u0016J\b\u0010<\u001a\u000201H\u0002J\u000f\u0010=\u001a\u0004\u0018\u000107H\u0002\u00a2\u0006\u0002\u00108J\u0010\u0010>\u001a\u0002012\u0006\u0010?\u001a\u00020\u000fH\u0016J\b\u0010@\u001a\u000201H\u0016J\b\u0010A\u001a\u000201H\u0016J\b\u0010B\u001a\u000201H\u0016J\b\u0010C\u001a\u000201H\u0016J\u0017\u0010D\u001a\u0002012\b\u0010E\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010FJ\b\u0010G\u001a\u000201H\u0016J0\u0010H\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010I\u0018\u00010\"0\"2\u0018\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#0\"R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#0\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020\'X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u0006J"}, d2 = {"Lcom/sugarcoachpremium/ui/daily/presenter/DailyPresenter;", "V", "Lcom/sugarcoachpremium/ui/daily/view/DailyView;", "I", "Lcom/sugarcoachpremium/ui/daily/interactor/DailyInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/BasePresenter;", "Lcom/sugarcoachpremium/ui/daily/presenter/DailyPresenterImp;", "interactor", "schedulerProvider", "Lcom/sugarcoachpremium/util/SchedulerProvider;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/sugarcoachpremium/ui/daily/interactor/DailyInteractorImp;Lcom/sugarcoachpremium/util/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "colors", "Ljava/util/ArrayList;", "", "getColors", "()Ljava/util/ArrayList;", "setColors", "(Ljava/util/ArrayList;)V", "emotions", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/States;", "getEmotions", "()Ljava/util/List;", "setEmotions", "(Ljava/util/List;)V", "exercices", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Exercises;", "getExercices", "setExercices", "path", "", "registers", "", "Lcom/hominoid/expandablerecyclerviewlib/models/ExpandableListItem;", "Lcom/sugarcoachpremium/ui/daily/view/DailyHeader;", "Lcom/sugarcoachpremium/ui/daily/view/DailyItem;", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "getTreament", "()Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "setTreament", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;)V", "generateRandomColor", "getColorType", "value", "", "getData", "", "dailyRegister", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterCategory;", "date", "Ljava/util/Date;", "getDates", "", "()Ljava/lang/Boolean;", "getMedition", "getPdfPath", "getRegisters", "getTreatment", "getUser", "goToActivityDailyDetail", "id", "goToActivityMain", "goToActivityRegister", "goToActivityStatistic", "goToActivityTreament", "onAttach", "view", "(Lcom/sugarcoachpremium/ui/daily/view/DailyView;)V", "onResume", "separateByDate", "Lcom/sugarcoachpremium/ui/daily/view/DayItem;", "app_debug"})
public final class DailyPresenter<V extends com.sugarcoachpremium.ui.daily.view.DailyView, I extends com.sugarcoachpremium.ui.daily.interactor.DailyInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.BasePresenter<V, I> implements com.sugarcoachpremium.ui.daily.presenter.DailyPresenterImp<V, I> {
    public com.sugarcoachpremium.data.database.repository.treament.Treament treament;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<java.lang.Integer> colors;
    public java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises> exercices;
    public java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States> emotions;
    private java.util.List<com.hominoid.expandablerecyclerviewlib.models.ExpandableListItem<com.sugarcoachpremium.ui.daily.view.DailyHeader, com.sugarcoachpremium.ui.daily.view.DailyItem>> registers;
    private java.lang.String path;
    
    @javax.inject.Inject
    public DailyPresenter(@org.jetbrains.annotations.NotNull
    I interactor, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull
    io.reactivex.disposables.CompositeDisposable disposable) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.database.repository.treament.Treament getTreament() {
        return null;
    }
    
    public final void setTreament(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.Treament p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.Integer> getColors() {
        return null;
    }
    
    public final void setColors(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises> getExercices() {
        return null;
    }
    
    public final void setExercices(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States> getEmotions() {
        return null;
    }
    
    public final void setEmotions(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States> p0) {
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.Nullable
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
    
    @java.lang.Override
    public void getRegisters() {
    }
    
    public final void getDates(@org.jetbrains.annotations.NotNull
    java.util.List<? extends java.util.Date> date) {
    }
    
    private final void getData(java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterCategory> dailyRegister, java.util.List<? extends java.util.Date> date) {
    }
    
    private final int generateRandomColor() {
        return 0;
    }
    
    private final void getMedition() {
    }
    
    @java.lang.Override
    public void goToActivityDailyDetail(int id) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    private final int getColorType(float value) {
        return 0;
    }
    
    @java.lang.Override
    public void goToActivityTreament() {
    }
    
    @java.lang.Override
    public void goToActivityMain() {
    }
    
    @java.lang.Override
    public void goToActivityStatistic() {
    }
    
    @java.lang.Override
    public void goToActivityRegister() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getPdfPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.util.List<com.sugarcoachpremium.ui.daily.view.DayItem>> separateByDate(@org.jetbrains.annotations.NotNull
    java.util.List<com.hominoid.expandablerecyclerviewlib.models.ExpandableListItem<com.sugarcoachpremium.ui.daily.view.DailyHeader, com.sugarcoachpremium.ui.daily.view.DailyItem>> registers) {
        return null;
    }
}