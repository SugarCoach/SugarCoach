package com.sugarcoachpremium.ui.register.view;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J)\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&\u00a2\u0006\u0002\u0010\u000bJ)\u0010\f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0006H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J&\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0016\u0010!\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001bH&J\u0016\u0010#\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001bH&J\u0010\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH&J\u0012\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010%\u001a\u00020\nH&J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\nH&J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006H&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0018H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\nH&J\b\u0010.\u001a\u00020\u0003H&J\b\u0010/\u001a\u00020\u0003H&J\b\u00100\u001a\u00020\u0003H&J\b\u00101\u001a\u00020\u0003H&\u00a8\u00062\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/register/view/RegisterView;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "showSuccessToast", "", "nextLoad", "type", "", "value", "", "position", "", "(ILjava/lang/Float;Ljava/lang/String;)V", "prevLoad", "finishLoad", "points", "totalPoints", "backLoad", "showValidationMessage", "errorCode", "getUserData", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "setDateMedition", "date", "Ljava/util/Date;", "medition", "categories", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Category;", "setEmotional", "item", "Lcom/sugarcoachpremium/ui/register/view/RegisterItem;", "setExercise", "setExercicesData", "items", "setEmotionsData", "getLabel", "name", "getDrawable", "Landroid/graphics/drawable/Drawable;", "setDialogValue", "id", "setTime", "setDate", "setImage", "image", "openDailyActivity", "openMainActivity", "openStatisticActivity", "openTreatmentActivity", "app_debug"})
public abstract interface RegisterView extends com.sugarcoachpremium.ui.base.view.BaseView {
    
    public abstract void showSuccessToast();
    
    public abstract void nextLoad(int type, @org.jetbrains.annotations.Nullable()
    java.lang.Float value, @org.jetbrains.annotations.Nullable()
    java.lang.String position);
    
    public abstract void prevLoad(int type, @org.jetbrains.annotations.Nullable()
    java.lang.Float value, @org.jetbrains.annotations.Nullable()
    java.lang.String position);
    
    public abstract void finishLoad(int points, int totalPoints);
    
    public abstract void backLoad();
    
    public abstract void showValidationMessage(int errorCode);
    
    public abstract void getUserData(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.user.User user);
    
    public abstract void setDateMedition(@org.jetbrains.annotations.NotNull()
    java.util.Date date, int medition, @org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> categories);
    
    public abstract void setEmotional(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.register.view.RegisterItem item);
    
    public abstract void setExercise(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.register.view.RegisterItem item);
    
    public abstract void setExercicesData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.ui.register.view.RegisterItem> items);
    
    public abstract void setEmotionsData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.ui.register.view.RegisterItem> items);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLabel(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.graphics.drawable.Drawable getDrawable(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    public abstract void setDialogValue(int type, @org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    public abstract void setTime(@org.jetbrains.annotations.NotNull()
    java.util.Date value, int medition);
    
    public abstract void setDate(@org.jetbrains.annotations.NotNull()
    java.util.Date value);
    
    public abstract void setImage(@org.jetbrains.annotations.NotNull()
    java.lang.String image);
    
    public abstract void openDailyActivity();
    
    public abstract void openMainActivity();
    
    public abstract void openStatisticActivity();
    
    public abstract void openTreatmentActivity();
}