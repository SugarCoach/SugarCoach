package com.sugarcoachpremium.ui.daily_detail.view;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0012H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u0003H&J\b\u0010\u001f\u001a\u00020\u0003H&J\b\u0010 \u001a\u00020\u0003H&J\b\u0010!\u001a\u00020\u0003H&J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0012H&J\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010#\u001a\u00020\u0012H&J\u001e\u0010&\u001a\u00020\u00032\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010*\u001a\u00020\u001aH&J\b\u0010+\u001a\u00020\u0003H&J\u0016\u0010,\u001a\u00020\u00032\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0(H&J\u0016\u0010.\u001a\u00020\u00032\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0(H&J\b\u0010/\u001a\u00020\u0003H&\u00a8\u00060\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/daily_detail/view/DailyDetailView;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "showSuccessToast", "", "getData", "daily", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "setDateMedition", "date", "Ljava/util/Date;", "setEmotional", "item", "Lcom/sugarcoachpremium/ui/daily_detail/view/DailyItem;", "setExercise", "showSuccessToastUpdate", "enableViews", "setImage", "image", "", "setTime", "value", "setDate", "showDialogOK", "message", "explain", "msg", "", "sharedScreenShot", "uri", "Landroid/net/Uri;", "openTreamentActivity", "openStatisticActivity", "openRegisterActivity", "openMainActivity", "getLabel", "name", "getDrawable", "Landroid/graphics/drawable/Drawable;", "setCategories", "categories", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Category;", "index", "mirrorAccount", "setExercicesData", "items", "setEmotionsData", "init", "app_debug"})
public abstract interface DailyDetailView extends com.sugarcoachpremium.ui.base.view.BaseView {
    
    public abstract void showSuccessToast();
    
    public abstract void getData(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister daily);
    
    public abstract void setDateMedition(@org.jetbrains.annotations.NotNull()
    java.util.Date date);
    
    public abstract void setEmotional(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.daily_detail.view.DailyItem item);
    
    public abstract void setExercise(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.daily_detail.view.DailyItem item);
    
    public abstract void showSuccessToastUpdate();
    
    public abstract void enableViews();
    
    public abstract void setImage(@org.jetbrains.annotations.NotNull()
    java.lang.String image);
    
    public abstract void setTime(@org.jetbrains.annotations.NotNull()
    java.util.Date value);
    
    public abstract void setDate(@org.jetbrains.annotations.NotNull()
    java.util.Date value);
    
    public abstract void showDialogOK(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void explain(int msg);
    
    public abstract void sharedScreenShot(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri);
    
    public abstract void openTreamentActivity();
    
    public abstract void openStatisticActivity();
    
    public abstract void openRegisterActivity();
    
    public abstract void openMainActivity();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLabel(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.graphics.drawable.Drawable getDrawable(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    public abstract void setCategories(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> categories, int index);
    
    public abstract void mirrorAccount();
    
    public abstract void setExercicesData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.ui.daily_detail.view.DailyItem> items);
    
    public abstract void setEmotionsData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.ui.daily_detail.view.DailyItem> items);
    
    public abstract void init();
}