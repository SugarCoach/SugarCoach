package com.sugarcoachpremium.ui.main.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0005H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0007H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0005H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0005H&J \u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020\u0003H&\u00a8\u0006\""}, d2 = {"Lcom/sugarcoachpremium/ui/main/view/MainView;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "explain", "", "msg", "", "getLabel", "", "name", "mirrorAccount", "openConfigActivity", "openDailyActivity", "openLoginActivity", "openProfileActivity", "openRegisterActivity", "openStatisticsActivity", "openTreatmentActivity", "setDate", "date", "Ljava/util/Date;", "setMaxColor", "color", "setMedition", "label", "setMinColor", "setPromColor", "setPromedios", "min", "max", "promedio", "setUser", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "showSuccessToast", "app_release"})
public abstract interface MainView extends com.sugarcoachpremium.ui.base.view.BaseView {
    
    public abstract void showSuccessToast();
    
    public abstract void openRegisterActivity();
    
    public abstract void openTreatmentActivity();
    
    public abstract void openLoginActivity();
    
    public abstract void openDailyActivity();
    
    public abstract void openProfileActivity();
    
    public abstract void openConfigActivity();
    
    public abstract void openStatisticsActivity();
    
    public abstract void setMedition(@org.jetbrains.annotations.NotNull
    java.lang.String label);
    
    public abstract void setUser(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User user);
    
    public abstract void setDate(@org.jetbrains.annotations.NotNull
    java.util.Date date);
    
    public abstract void setPromedios(int min, int max, int promedio);
    
    public abstract void setMinColor(int color);
    
    public abstract void setMaxColor(int color);
    
    public abstract void setPromColor(int color);
    
    public abstract void explain(int msg);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getLabel(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    public abstract void mirrorAccount();
}