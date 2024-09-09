package com.sugarcoachpremium.ui.treatment.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0006H&J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0016\u0010\r\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH&J\u0016\u0010\u0010\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH&J\u0016\u0010\u0013\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH&J\u0016\u0010\u0016\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH&J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0016\u0010\u001c\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH&J\u0016\u0010\u001d\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH&J\u0016\u0010\u001e\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH&J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$H&J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020$H&J\u0010\u0010\'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)H&J\u0010\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,H&J\u0018\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020!H&J\u0010\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0003H&\u00a8\u00062"}, d2 = {"Lcom/sugarcoachpremium/ui/treatment/view/TreatmentView;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "getLabel", "", "name", "openDailyActivity", "", "openMainActivity", "openStatisticActivity", "openTableActivity", "dailyRegisters", "", "Lcom/sugarcoachpremium/data/api_db/DailyRegister/DailyRegisterResponse;", "setBasalHoras", "horas", "Lcom/sugarcoachpremium/ui/treatment/view/BasalHoraItem;", "setBomba", "basalInsuline", "Lcom/sugarcoachpremium/ui/treatment/view/BasalItem;", "setCategories", "category", "Lcom/sugarcoachpremium/ui/treatment/view/HorarioItem;", "setCategoriesCorrectora", "setData", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "date", "Ljava/util/Date;", "setInsulinasBasales", "setInsulinasCorrectoras", "setMedidor", "setPromColor", "color", "", "setPromedio", "prom", "", "setPromedioBasal", "total", "setTreatment", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "sharedScreenShot", "uri", "Landroid/net/Uri;", "showDataSave", "totalPoints", "points", "showSuccessToast", "msg", "app_debug"})
public abstract interface TreatmentView extends com.sugarcoachpremium.ui.base.view.BaseView {
    
    public abstract void showSuccessToast(@org.jetbrains.annotations.NotNull
    java.lang.String msg);
    
    public abstract void openTableActivity(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.api_db.DailyRegister.DailyRegisterResponse> dailyRegisters);
    
    public abstract void setData(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User user, @org.jetbrains.annotations.NotNull
    java.util.Date date);
    
    public abstract void setPromedio(float prom);
    
    public abstract void setPromedioBasal(float total);
    
    public abstract void setPromColor(int color);
    
    public abstract void setInsulinasBasales(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.ui.treatment.view.BasalItem> basalInsuline);
    
    public abstract void setInsulinasCorrectoras(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.ui.treatment.view.BasalItem> basalInsuline);
    
    public abstract void setTreatment(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora treament);
    
    public abstract void setCategories(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.ui.treatment.view.HorarioItem> category);
    
    public abstract void setCategoriesCorrectora(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.ui.treatment.view.HorarioItem> category);
    
    public abstract void setBasalHoras(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.ui.treatment.view.BasalHoraItem> horas);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getLabel(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    public abstract void openDailyActivity();
    
    public abstract void openMainActivity();
    
    public abstract void openStatisticActivity();
    
    public abstract void setMedidor(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.ui.treatment.view.BasalItem> basalInsuline);
    
    public abstract void setBomba(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.ui.treatment.view.BasalItem> basalInsuline);
    
    public abstract void showDataSave(int totalPoints, int points);
    
    public abstract void sharedScreenShot(@org.jetbrains.annotations.NotNull
    android.net.Uri uri);
}