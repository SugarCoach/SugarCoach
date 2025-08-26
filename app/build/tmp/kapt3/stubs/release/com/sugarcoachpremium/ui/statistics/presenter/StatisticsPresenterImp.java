package com.sugarcoachpremium.ui.statistics.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J\b\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH&J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J \u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J \u0010\u0014\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH&J \u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH&J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u0007H&J\b\u0010\u001e\u001a\u00020\u0007H&J\b\u0010\u001f\u001a\u00020\u0007H&J3\u0010 \u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0#2\u0006\u0010$\u001a\u00020%H&\u00a2\u0006\u0002\u0010&\u00a8\u0006\'"}, d2 = {"Lcom/sugarcoachpremium/ui/statistics/presenter/StatisticsPresenterImp;", "V", "Lcom/sugarcoachpremium/ui/statistics/view/StatisticsView;", "I", "Lcom/sugarcoachpremium/ui/statistics/interactor/StatisticsInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/Presenter;", "getData", "", "getDataCarDate", "position", "", "date", "", "index", "getDataExercisesDates", "start", "end", "getDataExercisesLast", "getDataGlucoseDate", "getDataGlucoseLast", "getDataInsulineDate", "getDataStatesDates", "getDataStatesLast", "getDataUpdated", "getScreenShot", "context", "Landroid/app/Activity;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "goToActivityDaily", "goToActivityMain", "goToActivityTreament", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(Landroid/app/Activity;I[Ljava/lang/String;[I)V", "app_release"})
public abstract interface StatisticsPresenterImp<V extends com.sugarcoachpremium.ui.statistics.view.StatisticsView, I extends com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.Presenter<V, I> {
    
    public abstract void getData();
    
    public abstract void getDataUpdated(int position, int index);
    
    public abstract void goToActivityDaily();
    
    public abstract void goToActivityMain();
    
    public abstract void goToActivityTreament();
    
    public abstract void getDataGlucoseLast(int position);
    
    public abstract void getDataGlucoseDate(@org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end, int position);
    
    public abstract void getDataInsulineDate(int position, @org.jetbrains.annotations.NotNull
    java.lang.String date, int index);
    
    public abstract void getDataCarDate(int position, @org.jetbrains.annotations.NotNull
    java.lang.String date, int index);
    
    public abstract void getDataExercisesLast(int position);
    
    public abstract void getDataExercisesDates(@org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end, int position);
    
    public abstract void getDataStatesLast(int position);
    
    public abstract void getDataStatesDates(@org.jetbrains.annotations.NotNull
    java.lang.String start, @org.jetbrains.annotations.NotNull
    java.lang.String end, int position);
    
    public abstract void getScreenShot(@org.jetbrains.annotations.NotNull
    android.app.Activity context, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView view);
    
    public abstract void onRequestPermissionsResult(@org.jetbrains.annotations.NotNull
    android.app.Activity context, int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults);
}