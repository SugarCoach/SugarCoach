package com.sugarcoachpremium.ui.treatment.view;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0011H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0016\u0010\u0017\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\bH&J\u0016\u0010\u001a\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\bH&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0016\u0010\u001e\u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\bH&J\u0016\u0010!\u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\bH&J\u0016\u0010\"\u001a\u00020\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\bH&J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H&J\b\u0010\'\u001a\u00020\u0003H&J\b\u0010(\u001a\u00020\u0003H&J\b\u0010)\u001a\u00020\u0003H&J\u0016\u0010*\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\bH&J\u0016\u0010+\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\bH&J\u0018\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0016H&J\u0010\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u000201H&\u00a8\u00062\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/treatment/view/TreatmentView;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "showSuccessToast", "", "msg", "", "openTableActivity", "dailyRegisters", "", "Lcom/sugarcoachpremium/data/api_db/DailyRegister/DailyRegisterResponse;", "setData", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "date", "Ljava/util/Date;", "setPromedio", "prom", "", "setPromedioBasal", "total", "setPromColor", "color", "", "setInsulinasBasales", "basalInsuline", "Lcom/sugarcoachpremium/ui/treatment/view/BasalItem;", "setInsulinasCorrectoras", "setTreatment", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/TreatmentBasalCorrectora;", "setCategories", "category", "Lcom/sugarcoachpremium/ui/treatment/view/HorarioItem;", "setCategoriesCorrectora", "setBasalHoras", "horas", "Lcom/sugarcoachpremium/ui/treatment/view/BasalHoraItem;", "getLabel", "name", "openDailyActivity", "openMainActivity", "openStatisticActivity", "setMedidor", "setBomba", "showDataSave", "totalPoints", "points", "sharedScreenShot", "uri", "Landroid/net/Uri;", "app_debug"})
public abstract interface TreatmentView extends com.sugarcoachpremium.ui.base.view.BaseView {
    
    public abstract void showSuccessToast(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
    
    public abstract void openTableActivity(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.api_db.DailyRegister.DailyRegisterResponse> dailyRegisters);
    
    public abstract void setData(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.user.User user, @org.jetbrains.annotations.NotNull()
    java.util.Date date);
    
    public abstract void setPromedio(float prom);
    
    public abstract void setPromedioBasal(float total);
    
    public abstract void setPromColor(int color);
    
    public abstract void setInsulinasBasales(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.ui.treatment.view.BasalItem> basalInsuline);
    
    public abstract void setInsulinasCorrectoras(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.ui.treatment.view.BasalItem> basalInsuline);
    
    public abstract void setTreatment(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora treament);
    
    public abstract void setCategories(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.ui.treatment.view.HorarioItem> category);
    
    public abstract void setCategoriesCorrectora(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.ui.treatment.view.HorarioItem> category);
    
    public abstract void setBasalHoras(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.ui.treatment.view.BasalHoraItem> horas);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLabel(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    public abstract void openDailyActivity();
    
    public abstract void openMainActivity();
    
    public abstract void openStatisticActivity();
    
    public abstract void setMedidor(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.ui.treatment.view.BasalItem> basalInsuline);
    
    public abstract void setBomba(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.ui.treatment.view.BasalItem> basalInsuline);
    
    public abstract void showDataSave(int totalPoints, int points);
    
    public abstract void sharedScreenShot(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri);
}