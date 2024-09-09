package com.sugarcoachpremium.ui.profile.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0007H&J3\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H&\u00a2\u0006\u0002\u0010\u0015J \u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH&J \u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH&J(\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H&J?\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u00122\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010&2\b\u0010(\u001a\u0004\u0018\u00010\u00122\b\u0010)\u001a\u0004\u0018\u00010\u0012H&\u00a2\u0006\u0002\u0010*J\u0018\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020.H&J\u0012\u0010/\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0012H&\u00a8\u00060"}, d2 = {"Lcom/sugarcoachpremium/ui/profile/presenter/ProfilePresenterImp;", "V", "Lcom/sugarcoachpremium/ui/profile/view/ProfileView;", "I", "Lcom/sugarcoachpremium/ui/profile/interactor/ProfileInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/Presenter;", "getScreenShot", "", "context", "Landroid/app/Activity;", "view", "Landroid/view/View;", "logout", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(Landroid/app/Activity;I[Ljava/lang/String;[I)V", "setBirthday", "year", "monthOfYear", "dayOfMonth", "setDebut", "showDateDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "dateSetListener", "Lcom/wdullaer/materialdatetimepicker/date/DatePickerDialog$OnDateSetListener;", "tag", "date", "Lorg/joda/time/LocalDate;", "updateAll", "name", "weight", "", "height", "username", "mail", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)V", "updateAvatar", "position", "avatar", "Lcom/sugarcoachpremium/ui/profile/view/ProfileItem;", "updateSex", "app_release"})
public abstract interface ProfilePresenterImp<V extends com.sugarcoachpremium.ui.profile.view.ProfileView, I extends com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.Presenter<V, I> {
    
    public abstract void logout();
    
    public abstract void updateSex(@org.jetbrains.annotations.Nullable
    java.lang.String name);
    
    public abstract void updateAvatar(int position, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.profile.view.ProfileItem avatar);
    
    public abstract void setBirthday(int year, int monthOfYear, int dayOfMonth);
    
    public abstract void setDebut(int year, int monthOfYear, int dayOfMonth);
    
    public abstract void updateAll(@org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.Float weight, @org.jetbrains.annotations.Nullable
    java.lang.Float height, @org.jetbrains.annotations.Nullable
    java.lang.String username, @org.jetbrains.annotations.Nullable
    java.lang.String mail);
    
    public abstract void showDateDialog(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull
    com.wdullaer.materialdatetimepicker.date.DatePickerDialog.OnDateSetListener dateSetListener, @org.jetbrains.annotations.NotNull
    java.lang.String tag, @org.jetbrains.annotations.NotNull
    org.joda.time.LocalDate date);
    
    public abstract void getScreenShot(@org.jetbrains.annotations.NotNull
    android.app.Activity context, @org.jetbrains.annotations.NotNull
    android.view.View view);
    
    public abstract void onRequestPermissionsResult(@org.jetbrains.annotations.NotNull
    android.app.Activity context, int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults);
}