package com.sugarcoachpremium.ui.statistics.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B\u001f\b\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\b\u0010\u0010\u001a\u00020/H\u0002J\b\u00100\u001a\u00020/H\u0016J\u001e\u00101\u001a\u00020/2\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u0002030\u0019j\b\u0012\u0004\u0012\u000203`4J\u0006\u00105\u001a\u00020/J \u00106\u001a\u00020/2\u0006\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u001eH\u0016J\u0006\u0010;\u001a\u00020/J \u0010<\u001a\u00020/2\u0006\u0010=\u001a\u0002092\u0006\u0010>\u001a\u0002092\u0006\u00107\u001a\u00020\u001eH\u0016J\u0010\u0010?\u001a\u00020/2\u0006\u00107\u001a\u00020\u001eH\u0016J\u0006\u0010@\u001a\u00020/J \u0010A\u001a\u00020/2\u0006\u0010=\u001a\u0002092\u0006\u0010>\u001a\u0002092\u0006\u00107\u001a\u00020\u001eH\u0016J\u0010\u0010B\u001a\u00020/2\u0006\u00107\u001a\u00020\u001eH\u0016J\u0006\u0010C\u001a\u00020/J \u0010D\u001a\u00020/2\u0006\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u001eH\u0016J\u0006\u0010E\u001a\u00020/J \u0010F\u001a\u00020/2\u0006\u0010=\u001a\u0002092\u0006\u0010>\u001a\u0002092\u0006\u00107\u001a\u00020\u001eH\u0016J\u0010\u0010G\u001a\u00020/2\u0006\u00107\u001a\u00020\u001eH\u0016J\u0018\u0010H\u001a\u00020/2\u0006\u00107\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u001eH\u0016J\b\u0010\u0016\u001a\u00020/H\u0002J\u0018\u0010I\u001a\u00020J2\u0006\u0010-\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0002J\b\u0010N\u001a\u00020/H\u0002J\u0010\u0010O\u001a\u0002092\u0006\u0010P\u001a\u00020\u001eH\u0002J\u0018\u0010Q\u001a\u00020/2\u0006\u0010-\u001a\u00020.2\u0006\u0010R\u001a\u00020SH\u0016J\u0012\u0010T\u001a\u0004\u0018\u00010M2\u0006\u0010R\u001a\u00020SH\u0002J\b\u0010#\u001a\u00020/H\u0002J\b\u0010U\u001a\u00020/H\u0002J\u000f\u0010V\u001a\u0004\u0018\u00010,H\u0002\u00a2\u0006\u0002\u0010WJ\b\u0010X\u001a\u00020/H\u0016J\b\u0010Y\u001a\u00020/H\u0016J\b\u0010Z\u001a\u00020/H\u0016J\u0017\u0010[\u001a\u00020/2\b\u0010R\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\\J3\u0010]\u001a\u00020/2\u0006\u0010-\u001a\u00020.2\u0006\u0010^\u001a\u00020\u001e2\f\u0010_\u001a\b\u0012\u0004\u0012\u0002090`2\u0006\u0010a\u001a\u00020bH\u0016\u00a2\u0006\u0002\u0010cR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R \u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R\u001a\u0010%\u001a\u00020&X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*\u00a8\u0006d"}, d2 = {"Lcom/sugarcoachpremium/ui/statistics/presenter/StatisticsPresenter;", "V", "Lcom/sugarcoachpremium/ui/statistics/view/StatisticsView;", "I", "Lcom/sugarcoachpremium/ui/statistics/interactor/StatisticsInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/BasePresenter;", "Lcom/sugarcoachpremium/ui/statistics/presenter/StatisticsPresenterImp;", "interactor", "schedulerProvider", "Lcom/sugarcoachpremium/util/SchedulerProvider;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/sugarcoachpremium/ui/statistics/interactor/StatisticsInteractorImp;Lcom/sugarcoachpremium/util/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "category", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Category;", "getCategory", "()Ljava/util/List;", "setCategory", "(Ljava/util/List;)V", "exercises", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Exercises;", "getExercises", "setExercises", "list", "Ljava/util/ArrayList;", "Lcom/sugarcoachpremium/ui/statistics/view/StatisticsItem;", "getList", "()Ljava/util/ArrayList;", "permissionRequest", "", "getPermissionRequest", "()I", "states", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/States;", "getStates", "setStates", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "getTreament", "()Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "setTreament", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;)V", "checkAndRequestPermissions", "", "context", "Landroid/app/Activity;", "", "getData", "getDataBasal", "values", "", "Lkotlin/collections/ArrayList;", "getDataCar", "getDataCarDate", "position", "date", "", "index", "getDataExercises", "getDataExercisesDates", "start", "end", "getDataExercisesLast", "getDataGlucose", "getDataGlucoseDate", "getDataGlucoseLast", "getDataInsuline", "getDataInsulineDate", "getDataStates", "getDataStatesDates", "getDataStatesLast", "getDataUpdated", "getImageUri", "Landroid/net/Uri;", "Landroid/content/Context;", "inImage", "Landroid/graphics/Bitmap;", "getMedition", "getRandomString", "length", "getScreenShot", "view", "Landroidx/recyclerview/widget/RecyclerView;", "getScreenShotImage", "getTreatment", "getUser", "()Ljava/lang/Boolean;", "goToActivityDaily", "goToActivityMain", "goToActivityTreament", "onAttach", "(Lcom/sugarcoachpremium/ui/statistics/view/StatisticsView;)V", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(Landroid/app/Activity;I[Ljava/lang/String;[I)V", "app_release"})
public final class StatisticsPresenter<V extends com.sugarcoachpremium.ui.statistics.view.StatisticsView, I extends com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.BasePresenter<V, I> implements com.sugarcoachpremium.ui.statistics.presenter.StatisticsPresenterImp<V, I> {
    public com.sugarcoachpremium.data.database.repository.treament.Treament treament;
    public java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> category;
    public java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States> states;
    public java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises> exercises;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.sugarcoachpremium.ui.statistics.view.StatisticsItem> list = null;
    private final int permissionRequest = 1;
    
    @javax.inject.Inject
    public StatisticsPresenter(@org.jetbrains.annotations.NotNull
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
    public final java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States> getStates() {
        return null;
    }
    
    public final void setStates(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.States> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises> getExercises() {
        return null;
    }
    
    public final void setExercises(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Exercises> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.sugarcoachpremium.ui.statistics.view.StatisticsItem> getList() {
        return null;
    }
    
    public final int getPermissionRequest() {
        return 0;
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.Nullable
    V view) {
    }
    
    private final void getCategory() {
    }
    
    private final void getTreatment() {
    }
    
    private final java.lang.Boolean getUser() {
        return null;
    }
    
    private final void getStates() {
    }
    
    private final void getExercises() {
    }
    
    @java.lang.Override
    public void goToActivityDaily() {
    }
    
    @java.lang.Override
    public void goToActivityMain() {
    }
    
    @java.lang.Override
    public void goToActivityTreament() {
    }
    
    public final void getDataGlucose() {
    }
    
    public final void getDataInsuline() {
    }
    
    public final void getDataBasal(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.Float> values) {
    }
    
    public final void getDataCar() {
    }
    
    public final void getDataExercises() {
    }
    
    public final void getDataStates() {
    }
    
    @java.lang.Override
    public void getDataGlucoseLast(int position) {
    }
    
    @java.lang.Override
    public void getDataGlucoseDate(@org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end, int position) {
    }
    
    @java.lang.Override
    public void getDataInsulineDate(int position, @org.jetbrains.annotations.NotNull
    java.lang.String date, int index) {
    }
    
    @java.lang.Override
    public void getDataCarDate(int position, @org.jetbrains.annotations.NotNull
    java.lang.String date, int index) {
    }
    
    @java.lang.Override
    public void getDataExercisesLast(int position) {
    }
    
    @java.lang.Override
    public void getDataExercisesDates(@org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end, int position) {
    }
    
    @java.lang.Override
    public void getDataStatesLast(int position) {
    }
    
    @java.lang.Override
    public void getDataStatesDates(@org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end, int position) {
    }
    
    @java.lang.Override
    public void getData() {
    }
    
    private final void getMedition() {
    }
    
    @java.lang.Override
    public void getDataUpdated(int position, int index) {
    }
    
    @java.lang.Override
    public void getScreenShot(@org.jetbrains.annotations.NotNull
    android.app.Activity context, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView view) {
    }
    
    private final android.graphics.Bitmap getScreenShotImage(androidx.recyclerview.widget.RecyclerView view) {
        return null;
    }
    
    public final boolean checkAndRequestPermissions(@org.jetbrains.annotations.NotNull
    android.app.Activity context) {
        return false;
    }
    
    private final android.net.Uri getImageUri(android.content.Context context, android.graphics.Bitmap inImage) {
        return null;
    }
    
    private final java.lang.String getRandomString(int length) {
        return null;
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(@org.jetbrains.annotations.NotNull
    android.app.Activity context, int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
}