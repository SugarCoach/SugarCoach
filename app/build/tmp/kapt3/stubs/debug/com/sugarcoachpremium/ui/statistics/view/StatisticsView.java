package com.sugarcoachpremium.ui.statistics.view;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0006H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0013H&\u00a8\u0006\u001d\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/statistics/view/StatisticsView;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "getData", "", "data", "", "Lcom/sugarcoachpremium/ui/statistics/view/StatisticsItem;", "setUp", "setDate", "date", "Ljava/util/Date;", "getInsulinaType", "", "getGlucemiaType", "getCarType", "getExcercisesType", "getStatesType", "setDataUpdated", "position", "", "mirrorAccount", "openDailyActivity", "openMainActivity", "openTreatmentActivity", "sharedScreenShot", "uri", "Landroid/net/Uri;", "explain", "msg", "app_debug"})
public abstract interface StatisticsView extends com.sugarcoachpremium.ui.base.view.BaseView {
    
    public abstract void getData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.ui.statistics.view.StatisticsItem> data);
    
    public abstract void setUp();
    
    public abstract void setDate(@org.jetbrains.annotations.NotNull()
    java.util.Date date);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getInsulinaType();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getGlucemiaType();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getCarType();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getExcercisesType();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getStatesType();
    
    public abstract void setDataUpdated(int position, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.statistics.view.StatisticsItem data);
    
    public abstract void mirrorAccount();
    
    public abstract void openDailyActivity();
    
    public abstract void openMainActivity();
    
    public abstract void openTreatmentActivity();
    
    public abstract void sharedScreenShot(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri);
    
    public abstract void explain(int msg);
}