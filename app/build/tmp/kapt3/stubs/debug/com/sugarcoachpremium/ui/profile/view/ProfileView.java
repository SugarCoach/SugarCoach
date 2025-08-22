package com.sugarcoachpremium.ui.profile.view;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0006H&J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H&J\u0016\u0010\u001d\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0006H&\u00a8\u0006#\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/profile/view/ProfileView;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "showSuccessToast", "", "createCongratsDialog", "points", "", "totalPoints", "getUserData", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "setBirthday", "value", "Ljava/util/Date;", "setDebut", "openLoginActivity", "setDateMedition", "date", "setSex", "sex", "", "sharedScreenShot", "uri", "Landroid/net/Uri;", "explain", "msg", "getDrawable", "Landroid/graphics/drawable/Drawable;", "name", "setAvatars", "avatars", "", "Lcom/sugarcoachpremium/ui/profile/view/ProfileItem;", "setAvatar", "id", "app_debug"})
public abstract interface ProfileView extends com.sugarcoachpremium.ui.base.view.BaseView {
    
    public abstract void showSuccessToast();
    
    public abstract void createCongratsDialog(int points, int totalPoints);
    
    public abstract void getUserData(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.user.User user);
    
    public abstract void setBirthday(@org.jetbrains.annotations.NotNull()
    java.util.Date value);
    
    public abstract void setDebut(@org.jetbrains.annotations.NotNull()
    java.util.Date value);
    
    public abstract void openLoginActivity();
    
    public abstract void setDateMedition(@org.jetbrains.annotations.NotNull()
    java.util.Date date);
    
    public abstract void setSex(@org.jetbrains.annotations.NotNull()
    java.lang.String sex);
    
    public abstract void sharedScreenShot(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri);
    
    public abstract void explain(int msg);
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.graphics.drawable.Drawable getDrawable(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    public abstract void setAvatars(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sugarcoachpremium.ui.profile.view.ProfileItem> avatars);
    
    public abstract void setAvatar(int id);
}