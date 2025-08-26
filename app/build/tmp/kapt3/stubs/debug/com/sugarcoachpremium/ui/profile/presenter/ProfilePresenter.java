package com.sugarcoachpremium.ui.profile.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B\u001f\b\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ?\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020%J\u0018\u0010\'\u001a\u00020(2\u0006\u0010\"\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020%H\u0002J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u000eH\u0002J\u0018\u0010/\u001a\u00020%2\u0006\u0010\"\u001a\u00020#2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020+2\u0006\u00100\u001a\u000201H\u0002J\u000f\u0010\u0013\u001a\u0004\u0018\u00010!H\u0002\u00a2\u0006\u0002\u00103J\b\u00104\u001a\u00020%H\u0016J\u0017\u00105\u001a\u00020%2\b\u00100\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u00106J3\u00107\u001a\u00020%2\u0006\u0010\"\u001a\u00020#2\u0006\u00108\u001a\u00020\u000e2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00190:2\u0006\u0010;\u001a\u00020<H\u0016\u00a2\u0006\u0002\u0010=J \u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000eH\u0016J \u0010B\u001a\u00020%2\u0006\u0010?\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000eH\u0016J(\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u00192\u0006\u0010I\u001a\u00020JH\u0016J?\u0010K\u001a\u00020%2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019H\u0016\u00a2\u0006\u0002\u0010LJ\u0018\u0010M\u001a\u00020%2\u0006\u0010N\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020PH\u0016J\u0012\u0010Q\u001a\u00020%2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u0014\u0010\r\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006R"}, d2 = {"Lcom/sugarcoachpremium/ui/profile/presenter/ProfilePresenter;", "V", "Lcom/sugarcoachpremium/ui/profile/view/ProfileView;", "I", "Lcom/sugarcoachpremium/ui/profile/interactor/ProfileInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/BasePresenter;", "Lcom/sugarcoachpremium/ui/profile/presenter/ProfilePresenterImp;", "interactor", "schedulerProvider", "Lcom/sugarcoachpremium/util/SchedulerProvider;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/sugarcoachpremium/ui/profile/interactor/ProfileInteractorImp;Lcom/sugarcoachpremium/util/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "permissionRequest", "", "getPermissionRequest", "()I", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "getUser", "()Lcom/sugarcoachpremium/data/database/repository/user/User;", "setUser", "(Lcom/sugarcoachpremium/data/database/repository/user/User;)V", "cantParametersChanged", "name", "", "weight", "", "height", "username", "mail", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)I", "checkAndRequestPermissions", "", "context", "Landroid/app/Activity;", "deleteRegisters", "", "getAvatars", "getImageUri", "Landroid/net/Uri;", "Landroid/content/Context;", "inImage", "Landroid/graphics/Bitmap;", "getMedition", "getRandomString", "length", "getScreenShot", "view", "Landroid/view/View;", "getScreenShotImage", "()Ljava/lang/Boolean;", "logout", "onAttach", "(Lcom/sugarcoachpremium/ui/profile/view/ProfileView;)V", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(Landroid/app/Activity;I[Ljava/lang/String;[I)V", "setBirthday", "year", "monthOfYear", "dayOfMonth", "setDebut", "showDateDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "dateSetListener", "Lcom/wdullaer/materialdatetimepicker/date/DatePickerDialog$OnDateSetListener;", "tag", "date", "Lorg/joda/time/LocalDate;", "updateAll", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)V", "updateAvatar", "position", "avatar", "Lcom/sugarcoachpremium/ui/profile/view/ProfileItem;", "updateSex", "app_debug"})
public final class ProfilePresenter<V extends com.sugarcoachpremium.ui.profile.view.ProfileView, I extends com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.BasePresenter<V, I> implements com.sugarcoachpremium.ui.profile.presenter.ProfilePresenterImp<V, I> {
    public com.sugarcoachpremium.data.database.repository.user.User user;
    private final int permissionRequest = 1;
    
    @javax.inject.Inject
    public ProfilePresenter(@org.jetbrains.annotations.NotNull
    I interactor, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull
    io.reactivex.disposables.CompositeDisposable disposable) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.database.repository.user.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User p0) {
    }
    
    public final int getPermissionRequest() {
        return 0;
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.Nullable
    V view) {
    }
    
    @java.lang.Override
    public void updateSex(@org.jetbrains.annotations.Nullable
    java.lang.String name) {
    }
    
    @java.lang.Override
    public void updateAvatar(int position, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.profile.view.ProfileItem avatar) {
    }
    
    @java.lang.Override
    public void setBirthday(int year, int monthOfYear, int dayOfMonth) {
    }
    
    @java.lang.Override
    public void setDebut(int year, int monthOfYear, int dayOfMonth) {
    }
    
    private final java.lang.Boolean getUser() {
        return null;
    }
    
    public final void getAvatars() {
    }
    
    @java.lang.Override
    public void updateAll(@org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.Float weight, @org.jetbrains.annotations.Nullable
    java.lang.Float height, @org.jetbrains.annotations.Nullable
    java.lang.String username, @org.jetbrains.annotations.Nullable
    java.lang.String mail) {
    }
    
    private final int cantParametersChanged(java.lang.String name, java.lang.Float weight, java.lang.Float height, java.lang.String username, java.lang.String mail) {
        return 0;
    }
    
    @java.lang.Override
    public void logout() {
    }
    
    public final void deleteRegisters() {
    }
    
    private final void getMedition() {
    }
    
    @java.lang.Override
    public void showDateDialog(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull
    com.wdullaer.materialdatetimepicker.date.DatePickerDialog.OnDateSetListener dateSetListener, @org.jetbrains.annotations.NotNull
    java.lang.String tag, @org.jetbrains.annotations.NotNull
    org.joda.time.LocalDate date) {
    }
    
    @java.lang.Override
    public void getScreenShot(@org.jetbrains.annotations.NotNull
    android.app.Activity context, @org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    private final android.graphics.Bitmap getScreenShotImage(android.view.View view) {
        return null;
    }
    
    public final boolean checkAndRequestPermissions(@org.jetbrains.annotations.NotNull
    android.app.Activity context) {
        return false;
    }
    
    private final android.net.Uri getImageUri(android.content.Context context, android.graphics.Bitmap inImage) {
        return null;
    }
    
    private final java.lang.String getRandomString(int length) {
        return null;
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(@org.jetbrains.annotations.NotNull
    android.app.Activity context, int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
}