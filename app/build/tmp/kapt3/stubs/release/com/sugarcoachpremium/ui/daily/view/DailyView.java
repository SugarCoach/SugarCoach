package com.sugarcoachpremium.ui.daily.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH&J\"\u0010\u000b\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000eH&J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\fH&J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0004H&J\b\u0010\u0018\u001a\u00020\fH&J\b\u0010\u0019\u001a\u00020\fH&J\b\u0010\u001a\u001a\u00020\fH&J\b\u0010\u001b\u001a\u00020\fH&J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\fH&J\b\u0010 \u001a\u00020\fH&\u00a8\u0006!"}, d2 = {"Lcom/sugarcoachpremium/ui/daily/view/DailyView;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "getColorsCategory", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDrawable", "Landroid/graphics/drawable/Drawable;", "name", "", "getLabel", "getRegisters", "", "registers", "", "Lcom/hominoid/expandablerecyclerviewlib/models/ExpandableListItem;", "Lcom/sugarcoachpremium/ui/daily/view/DailyHeader;", "Lcom/sugarcoachpremium/ui/daily/view/DailyItem;", "getUserData", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "mirrorAccount", "openDailyDetailActivity", "id", "openMainActivity", "openRegisterActivity", "openStatisticActivity", "openTreamentActivity", "setDateMedition", "date", "Ljava/util/Date;", "setUp", "showSuccessToast", "app_release"})
public abstract interface DailyView extends com.sugarcoachpremium.ui.base.view.BaseView {
    
    public abstract void showSuccessToast();
    
    public abstract void getUserData(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User user);
    
    public abstract void getRegisters(@org.jetbrains.annotations.NotNull
    java.util.List<com.hominoid.expandablerecyclerviewlib.models.ExpandableListItem<com.sugarcoachpremium.ui.daily.view.DailyHeader, com.sugarcoachpremium.ui.daily.view.DailyItem>> registers);
    
    public abstract void setDateMedition(@org.jetbrains.annotations.NotNull
    java.util.Date date);
    
    public abstract void setUp();
    
    public abstract void openDailyDetailActivity(int id);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getLabel(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    public abstract void openTreamentActivity();
    
    public abstract void openStatisticActivity();
    
    public abstract void openRegisterActivity();
    
    public abstract void openMainActivity();
    
    public abstract void mirrorAccount();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.ArrayList<java.lang.Integer> getColorsCategory();
    
    @org.jetbrains.annotations.Nullable
    public abstract android.graphics.drawable.Drawable getDrawable(@org.jetbrains.annotations.NotNull
    java.lang.String name);
}