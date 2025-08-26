package com.sugarcoachpremium.ui.register.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J)\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH&\u00a2\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u0003H&J)\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH&\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u001cH&J&\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H&J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u000bH&J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\'H&J\u0016\u0010(\u001a\u00020\u00032\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\'0!H&J\u0016\u0010*\u001a\u00020\u00032\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\'0!H&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\'H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u000bH&J\u0018\u0010.\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0006H&J\b\u0010/\u001a\u00020\u0003H&J\u0010\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0006H&\u00a8\u00062"}, d2 = {"Lcom/sugarcoachpremium/ui/register/view/RegisterView;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "backLoad", "", "finishLoad", "points", "", "totalPoints", "getDrawable", "Landroid/graphics/drawable/Drawable;", "name", "", "getLabel", "getUserData", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "nextLoad", "type", "value", "", "position", "(ILjava/lang/Float;Ljava/lang/String;)V", "openDailyActivity", "openMainActivity", "openStatisticActivity", "openTreatmentActivity", "prevLoad", "setDate", "Ljava/util/Date;", "setDateMedition", "date", "medition", "categories", "", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/Category;", "setDialogValue", "id", "setEmotional", "item", "Lcom/sugarcoachpremium/ui/register/view/RegisterItem;", "setEmotionsData", "items", "setExercicesData", "setExercise", "setImage", "image", "setTime", "showSuccessToast", "showValidationMessage", "errorCode", "app_debug"})
public abstract interface RegisterView extends com.sugarcoachpremium.ui.base.view.BaseView {
    
    public abstract void showSuccessToast();
    
    public abstract void nextLoad(int type, @org.jetbrains.annotations.Nullable
    java.lang.Float value, @org.jetbrains.annotations.Nullable
    java.lang.String position);
    
    public abstract void prevLoad(int type, @org.jetbrains.annotations.Nullable
    java.lang.Float value, @org.jetbrains.annotations.Nullable
    java.lang.String position);
    
    public abstract void finishLoad(int points, int totalPoints);
    
    public abstract void backLoad();
    
    public abstract void showValidationMessage(int errorCode);
    
    public abstract void getUserData(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User user);
    
    public abstract void setDateMedition(@org.jetbrains.annotations.NotNull
    java.util.Date date, int medition, @org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.data.database.repository.dailyregister.Category> categories);
    
    public abstract void setEmotional(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.register.view.RegisterItem item);
    
    public abstract void setExercise(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.register.view.RegisterItem item);
    
    public abstract void setExercicesData(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.ui.register.view.RegisterItem> items);
    
    public abstract void setEmotionsData(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.ui.register.view.RegisterItem> items);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getLabel(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    @org.jetbrains.annotations.Nullable
    public abstract android.graphics.drawable.Drawable getDrawable(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    public abstract void setDialogValue(int type, @org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    public abstract void setTime(@org.jetbrains.annotations.NotNull
    java.util.Date value, int medition);
    
    public abstract void setDate(@org.jetbrains.annotations.NotNull
    java.util.Date value);
    
    public abstract void setImage(@org.jetbrains.annotations.NotNull
    java.lang.String image);
    
    public abstract void openDailyActivity();
    
    public abstract void openMainActivity();
    
    public abstract void openStatisticActivity();
    
    public abstract void openTreatmentActivity();
}