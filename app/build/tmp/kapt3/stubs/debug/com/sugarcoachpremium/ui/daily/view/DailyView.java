package com.sugarcoachpremium.ui.daily.view;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\"\u0010\u0007\u001a\u00020\u00032\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\tH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u0003H&J\u0018\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u001dj\b\u0012\u0004\u0012\u00020\u0013`\u001eH&J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0016\u001a\u00020\u0015H&J \u0010!\u001a\u00020\u00032\u0016\u0010\"\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\t0\tH&\u00a8\u0006$\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/daily/view/DailyView;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "showSuccessToast", "", "getUserData", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "getRegisters", "registers", "", "Lcom/hominoid/expandablerecyclerviewlib/models/ExpandableListItem;", "Lcom/sugarcoachpremium/ui/daily/view/DailyHeader;", "Lcom/sugarcoachpremium/ui/daily/view/DailyItem;", "setDateMedition", "date", "Ljava/util/Date;", "setUp", "openDailyDetailActivity", "id", "", "getLabel", "", "name", "openTreamentActivity", "openStatisticActivity", "openRegisterActivity", "openMainActivity", "mirrorAccount", "getColorsCategory", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getDrawable", "Landroid/graphics/drawable/Drawable;", "displayDailyItems", "organizedDays", "Lcom/sugarcoachpremium/ui/daily/view/DayItem;", "app_debug"})
public abstract interface DailyView extends com.sugarcoachpremium.ui.base.view.BaseView {
    
    public abstract void showSuccessToast();
    
    public abstract void getUserData(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.user.User user);
    
    public abstract void getRegisters(@org.jetbrains.annotations.NotNull()
    java.util.List<com.hominoid.expandablerecyclerviewlib.models.ExpandableListItem<com.sugarcoachpremium.ui.daily.view.DailyHeader, com.sugarcoachpremium.ui.daily.view.DailyItem>> registers);
    
    public abstract void setDateMedition(@org.jetbrains.annotations.NotNull()
    java.util.Date date);
    
    public abstract void setUp();
    
    public abstract void openDailyDetailActivity(int id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLabel(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    public abstract void openTreamentActivity();
    
    public abstract void openStatisticActivity();
    
    public abstract void openRegisterActivity();
    
    public abstract void openMainActivity();
    
    public abstract void mirrorAccount();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<java.lang.Integer> getColorsCategory();
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.graphics.drawable.Drawable getDrawable(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    public abstract void displayDailyItems(@org.jetbrains.annotations.NotNull()
    java.util.List<java.util.List<com.sugarcoachpremium.ui.daily.view.DayItem>> organizedDays);
}