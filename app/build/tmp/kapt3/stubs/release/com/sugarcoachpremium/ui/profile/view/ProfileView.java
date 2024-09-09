package com.sugarcoachpremium.ui.profile.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H&J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0005H&J\u0016\u0010\u0013\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0019H&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\fH&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020\u0003H&\u00a8\u0006#"}, d2 = {"Lcom/sugarcoachpremium/ui/profile/view/ProfileView;", "Lcom/sugarcoachpremium/ui/base/view/BaseView;", "createCongratsDialog", "", "points", "", "totalPoints", "explain", "msg", "getDrawable", "Landroid/graphics/drawable/Drawable;", "name", "", "getUserData", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "openLoginActivity", "setAvatar", "id", "setAvatars", "avatars", "", "Lcom/sugarcoachpremium/ui/profile/view/ProfileItem;", "setBirthday", "value", "Ljava/util/Date;", "setDateMedition", "date", "setDebut", "setSex", "sex", "sharedScreenShot", "uri", "Landroid/net/Uri;", "showSuccessToast", "app_release"})
public abstract interface ProfileView extends com.sugarcoachpremium.ui.base.view.BaseView {
    
    public abstract void showSuccessToast();
    
    public abstract void createCongratsDialog(int points, int totalPoints);
    
    public abstract void getUserData(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User user);
    
    public abstract void setBirthday(@org.jetbrains.annotations.NotNull
    java.util.Date value);
    
    public abstract void setDebut(@org.jetbrains.annotations.NotNull
    java.util.Date value);
    
    public abstract void openLoginActivity();
    
    public abstract void setDateMedition(@org.jetbrains.annotations.NotNull
    java.util.Date date);
    
    public abstract void setSex(@org.jetbrains.annotations.NotNull
    java.lang.String sex);
    
    public abstract void sharedScreenShot(@org.jetbrains.annotations.NotNull
    android.net.Uri uri);
    
    public abstract void explain(int msg);
    
    @org.jetbrains.annotations.Nullable
    public abstract android.graphics.drawable.Drawable getDrawable(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    public abstract void setAvatars(@org.jetbrains.annotations.NotNull
    java.util.List<com.sugarcoachpremium.ui.profile.view.ProfileItem> avatars);
    
    public abstract void setAvatar(int id);
}