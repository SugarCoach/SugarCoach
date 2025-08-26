package com.sugarcoachpremium.ui.daily_detail.presenter;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B!\b\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\"\u001a\u0004\u0018\u00010.H\u0002\u00a2\u0006\u0002\u0010/J\u000f\u0010\u001d\u001a\u0004\u0018\u00010.H\u0002\u00a2\u0006\u0002\u0010/J\b\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000201H\u0016J\u000e\u00103\u001a\u0002012\u0006\u00104\u001a\u00020+J\u0017\u00105\u001a\u0002012\b\u00106\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u00107J\u0010\u00108\u001a\u0002012\u0006\u00104\u001a\u00020+H\u0016J\u0017\u00109\u001a\u0002012\b\u0010:\u001a\u0004\u0018\u00010;H\u0016\u00a2\u0006\u0002\u0010<J\u0017\u0010=\u001a\u0002012\b\u0010>\u001a\u0004\u0018\u00010;H\u0016\u00a2\u0006\u0002\u0010<J\u0017\u0010?\u001a\u0002012\b\u0010@\u001a\u0004\u0018\u00010;H\u0016\u00a2\u0006\u0002\u0010<J\u0017\u0010A\u001a\u0002012\b\u0010B\u001a\u0004\u0018\u00010;H\u0016\u00a2\u0006\u0002\u0010<J\u0012\u0010C\u001a\u0002012\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u0017\u0010F\u001a\u0002012\b\u0010G\u001a\u0004\u0018\u00010+H\u0016\u00a2\u0006\u0002\u0010HJ\u0012\u0010I\u001a\u0002012\b\u0010J\u001a\u0004\u0018\u00010EH\u0016J\u0012\u0010K\u001a\u0002012\b\u0010L\u001a\u0004\u0018\u00010EH\u0016J\u0012\u0010M\u001a\u0002012\b\u0010N\u001a\u0004\u0018\u00010EH\u0016J\u0010\u0010O\u001a\u0002012\b\u0010D\u001a\u0004\u0018\u00010EJ\u0015\u0010P\u001a\u0002012\b\u0010:\u001a\u0004\u0018\u00010;\u00a2\u0006\u0002\u0010<J\u0015\u0010Q\u001a\u0002012\b\u0010>\u001a\u0004\u0018\u00010;\u00a2\u0006\u0002\u0010<J\u0015\u0010R\u001a\u0002012\b\u0010@\u001a\u0004\u0018\u00010;\u00a2\u0006\u0002\u0010<J\u0015\u0010S\u001a\u0002012\b\u0010B\u001a\u0004\u0018\u00010;\u00a2\u0006\u0002\u0010<J\u0015\u0010T\u001a\u0002012\b\u0010G\u001a\u0004\u0018\u00010+\u00a2\u0006\u0002\u0010HJ\u0010\u0010U\u001a\u0002012\b\u0010J\u001a\u0004\u0018\u00010EJ\u0010\u0010V\u001a\u0002012\b\u0010L\u001a\u0004\u0018\u00010EJ\u0010\u0010W\u001a\u0002012\b\u0010N\u001a\u0004\u0018\u00010EJ\u0012\u0010X\u001a\u0002012\b\u0010$\u001a\u0004\u0018\u00010YH\u0016J\u0018\u0010Z\u001a\u0002012\u0006\u0010[\u001a\u00020+2\u0006\u0010\\\u001a\u00020+H\u0016J \u0010(\u001a\u0002012\u0006\u0010]\u001a\u00020+2\u0006\u0010^\u001a\u00020+2\u0006\u0010_\u001a\u00020+H\u0016J\b\u0010`\u001a\u000201H\u0002J\u0006\u0010a\u001a\u000201J\u0012\u0010b\u001a\u0002012\b\u0010J\u001a\u0004\u0018\u00010EH\u0002J\u0012\u0010c\u001a\u0002012\b\u0010D\u001a\u0004\u0018\u00010EH\u0002J\u000f\u0010d\u001a\u0004\u0018\u00010.H\u0002\u00a2\u0006\u0002\u0010/J\u0018\u0010e\u001a\u0002012\u0006\u0010f\u001a\u00020g2\u0006\u00106\u001a\u00020hH\u0016J\u0010\u0010i\u001a\u00020j2\u0006\u00106\u001a\u00020hH\u0002J\u0018\u0010k\u001a\u0002012\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020oH\u0016J\u0018\u0010p\u001a\u0002012\u0006\u0010l\u001a\u00020m2\u0006\u0010q\u001a\u00020rH\u0016J\u0010\u0010s\u001a\u0002012\u0006\u0010f\u001a\u00020gH\u0016J\"\u0010t\u001a\u0002012\u0006\u0010u\u001a\u00020+2\u0006\u0010v\u001a\u00020+2\b\u0010w\u001a\u0004\u0018\u00010xH\u0016J3\u0010y\u001a\u0002012\u0006\u0010f\u001a\u00020g2\u0006\u0010u\u001a\u00020+2\f\u0010z\u001a\b\u0012\u0004\u0012\u00020E0{2\u0006\u0010|\u001a\u00020}H\u0016\u00a2\u0006\u0002\u0010~J\b\u0010\u007f\u001a\u000201H\u0016J\u0011\u0010\u0080\u0001\u001a\u00020.2\u0006\u0010f\u001a\u00020gH\u0016J\u001c\u0010\u0081\u0001\u001a\u00030\u0082\u00012\u0007\u0010f\u001a\u00030\u0083\u00012\u0007\u0010\u0084\u0001\u001a\u00020jH\u0002J\u0012\u0010\u0085\u0001\u001a\u00020E2\u0007\u0010\u0086\u0001\u001a\u00020+H\u0002J\t\u0010\u0087\u0001\u001a\u000201H\u0016J\t\u0010\u0088\u0001\u001a\u000201H\u0016J\t\u0010\u0089\u0001\u001a\u000201H\u0016J\t\u0010\u008a\u0001\u001a\u000201H\u0016J\u0012\u0010\u008b\u0001\u001a\u00020+2\u0007\u0010\u008c\u0001\u001a\u00020;H\u0016J\u0011\u0010\u008d\u0001\u001a\u0002012\u0006\u0010L\u001a\u00020EH\u0016J\u000f\u0010\u008e\u0001\u001a\u0002012\u0006\u0010L\u001a\u00020ER\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u001a\u0010$\u001a\u00020%X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020+X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-\u00a8\u0006\u008f\u0001"}, d2 = {"Lcom/sugarcoachpremium/ui/daily_detail/presenter/DailyDetailPresenter;", "V", "Lcom/sugarcoachpremium/ui/daily_detail/view/DailyDetailView;", "I", "Lcom/sugarcoachpremium/ui/daily_detail/interactor/DailyDetailInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/BasePresenter;", "Lcom/sugarcoachpremium/ui/daily_detail/presenter/DailyDetailPresenterImp;", "interactor", "schedulerProvider", "Lcom/sugarcoachpremium/util/SchedulerProvider;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "<init>", "(Lcom/sugarcoachpremium/ui/daily_detail/interactor/DailyDetailInteractorImp;Lcom/sugarcoachpremium/util/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "dailyRegister", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "getDailyRegister", "()Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;", "setDailyRegister", "(Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegister;)V", "treament", "Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "getTreament", "()Lcom/sugarcoachpremium/data/database/repository/treament/Treament;", "setTreament", "(Lcom/sugarcoachpremium/data/database/repository/treament/Treament;)V", "emotions", "Ljava/util/ArrayList;", "Lcom/sugarcoachpremium/ui/daily_detail/view/DailyItem;", "getEmotions", "()Ljava/util/ArrayList;", "setEmotions", "(Ljava/util/ArrayList;)V", "exercices", "getExercices", "setExercices", "date", "Lorg/joda/time/LocalDateTime;", "getDate", "()Lorg/joda/time/LocalDateTime;", "setDate", "(Lorg/joda/time/LocalDateTime;)V", "permissionRequest", "", "getPermissionRequest", "()I", "", "()Ljava/lang/Boolean;", "getTreatment", "", "deleteRegister", "deleteRegisterLocal", "id", "onAttach", "view", "(Lcom/sugarcoachpremium/ui/daily_detail/view/DailyDetailView;)V", "getRegister", "updateGlucose", "glucose", "", "(Ljava/lang/Float;)V", "updateInsulin", "insulin", "updateBasal", "basal", "updateCarb", "carbohydrates", "updateExercise", "exercise", "", "updateLabel", "label", "(Ljava/lang/Integer;)V", "updateEmotional", "emotional", "updateComment", "comment", "updatePhoto", "photo", "updateExerciseLocal", "updateGlucoseLocal", "updateInsulinLocal", "updateBasalLocal", "updateCarbLocal", "updateLabelLocal", "updateEmotionalLocal", "updateCommentLocal", "updatePhotoLocal", "updateDate", "Ljava/util/Date;", "setTime", "hourOfDay", "minute", "year", "monthOfYear", "dayOfMonth", "getMedition", "getCategories", "setEmotional", "setExercises", "getUser", "getScreenShot", "context", "Landroid/app/Activity;", "Landroid/view/View;", "getScreenShotImage", "Landroid/graphics/Bitmap;", "showDateDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "dateSetListener", "Lcom/wdullaer/materialdatetimepicker/date/DatePickerDialog$OnDateSetListener;", "showTimeDialog", "timeSetListener", "Lcom/wdullaer/materialdatetimepicker/time/TimePickerDialog$OnTimeSetListener;", "initChooser", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(Landroid/app/Activity;I[Ljava/lang/String;[I)V", "showChooser", "checkAndRequestPermissions", "getImageUri", "Landroid/net/Uri;", "Landroid/content/Context;", "inImage", "getRandomString", "length", "goToActivityTreament", "goToActivityMain", "goToActivityStatistic", "goToActivityRegister", "getColorType", "value", "saveComment", "saveCommentLocal", "app_debug"})
public final class DailyDetailPresenter<V extends com.sugarcoachpremium.ui.daily_detail.view.DailyDetailView, I extends com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.BasePresenter<V, I> implements com.sugarcoachpremium.ui.daily_detail.presenter.DailyDetailPresenterImp<V, I> {
    public com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister dailyRegister;
    public com.sugarcoachpremium.data.database.repository.treament.Treament treament;
    public java.util.ArrayList<com.sugarcoachpremium.ui.daily_detail.view.DailyItem> emotions;
    public java.util.ArrayList<com.sugarcoachpremium.ui.daily_detail.view.DailyItem> exercices;
    public org.joda.time.LocalDateTime date;
    private final int permissionRequest = 1;
    
    @javax.inject.Inject()
    public DailyDetailPresenter(@org.jetbrains.annotations.NotNull()
    I interactor, @org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister getDailyRegister() {
        return null;
    }
    
    public final void setDailyRegister(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.treament.Treament getTreament() {
        return null;
    }
    
    public final void setTreament(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.treament.Treament p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sugarcoachpremium.ui.daily_detail.view.DailyItem> getEmotions() {
        return null;
    }
    
    public final void setEmotions(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.sugarcoachpremium.ui.daily_detail.view.DailyItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.sugarcoachpremium.ui.daily_detail.view.DailyItem> getExercices() {
        return null;
    }
    
    public final void setExercices(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.sugarcoachpremium.ui.daily_detail.view.DailyItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.joda.time.LocalDateTime getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    org.joda.time.LocalDateTime p0) {
    }
    
    public final int getPermissionRequest() {
        return 0;
    }
    
    private final java.lang.Boolean getExercices() {
        return null;
    }
    
    private final java.lang.Boolean getEmotions() {
        return null;
    }
    
    private final void getTreatment() {
    }
    
    @java.lang.Override()
    public void deleteRegister() {
    }
    
    public final void deleteRegisterLocal(int id) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    V view) {
    }
    
    @java.lang.Override()
    public void getRegister(int id) {
    }
    
    @java.lang.Override()
    public void updateGlucose(@org.jetbrains.annotations.Nullable()
    java.lang.Float glucose) {
    }
    
    @java.lang.Override()
    public void updateInsulin(@org.jetbrains.annotations.Nullable()
    java.lang.Float insulin) {
    }
    
    @java.lang.Override()
    public void updateBasal(@org.jetbrains.annotations.Nullable()
    java.lang.Float basal) {
    }
    
    @java.lang.Override()
    public void updateCarb(@org.jetbrains.annotations.Nullable()
    java.lang.Float carbohydrates) {
    }
    
    @java.lang.Override()
    public void updateExercise(@org.jetbrains.annotations.Nullable()
    java.lang.String exercise) {
    }
    
    @java.lang.Override()
    public void updateLabel(@org.jetbrains.annotations.Nullable()
    java.lang.Integer label) {
    }
    
    @java.lang.Override()
    public void updateEmotional(@org.jetbrains.annotations.Nullable()
    java.lang.String emotional) {
    }
    
    @java.lang.Override()
    public void updateComment(@org.jetbrains.annotations.Nullable()
    java.lang.String comment) {
    }
    
    @java.lang.Override()
    public void updatePhoto(@org.jetbrains.annotations.Nullable()
    java.lang.String photo) {
    }
    
    public final void updateExerciseLocal(@org.jetbrains.annotations.Nullable()
    java.lang.String exercise) {
    }
    
    public final void updateGlucoseLocal(@org.jetbrains.annotations.Nullable()
    java.lang.Float glucose) {
    }
    
    public final void updateInsulinLocal(@org.jetbrains.annotations.Nullable()
    java.lang.Float insulin) {
    }
    
    public final void updateBasalLocal(@org.jetbrains.annotations.Nullable()
    java.lang.Float basal) {
    }
    
    public final void updateCarbLocal(@org.jetbrains.annotations.Nullable()
    java.lang.Float carbohydrates) {
    }
    
    public final void updateLabelLocal(@org.jetbrains.annotations.Nullable()
    java.lang.Integer label) {
    }
    
    public final void updateEmotionalLocal(@org.jetbrains.annotations.Nullable()
    java.lang.String emotional) {
    }
    
    public final void updateCommentLocal(@org.jetbrains.annotations.Nullable()
    java.lang.String comment) {
    }
    
    public final void updatePhotoLocal(@org.jetbrains.annotations.Nullable()
    java.lang.String photo) {
    }
    
    @java.lang.Override()
    public void updateDate(@org.jetbrains.annotations.Nullable()
    java.util.Date date) {
    }
    
    @java.lang.Override()
    public void setTime(int hourOfDay, int minute) {
    }
    
    @java.lang.Override()
    public void setDate(int year, int monthOfYear, int dayOfMonth) {
    }
    
    private final void getMedition() {
    }
    
    public final void getCategories() {
    }
    
    private final void setEmotional(java.lang.String emotional) {
    }
    
    private final void setExercises(java.lang.String exercise) {
    }
    
    private final java.lang.Boolean getUser() {
        return null;
    }
    
    @java.lang.Override()
    public void getScreenShot(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final android.graphics.Bitmap getScreenShotImage(android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public void showDateDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    com.wdullaer.materialdatetimepicker.date.DatePickerDialog.OnDateSetListener dateSetListener) {
    }
    
    @java.lang.Override()
    public void showTimeDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener timeSetListener) {
    }
    
    @java.lang.Override()
    public void initChooser(@org.jetbrains.annotations.NotNull()
    android.app.Activity context) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void showChooser() {
    }
    
    @java.lang.Override()
    public boolean checkAndRequestPermissions(@org.jetbrains.annotations.NotNull()
    android.app.Activity context) {
        return false;
    }
    
    private final android.net.Uri getImageUri(android.content.Context context, android.graphics.Bitmap inImage) {
        return null;
    }
    
    private final java.lang.String getRandomString(int length) {
        return null;
    }
    
    @java.lang.Override()
    public void goToActivityTreament() {
    }
    
    @java.lang.Override()
    public void goToActivityMain() {
    }
    
    @java.lang.Override()
    public void goToActivityStatistic() {
    }
    
    @java.lang.Override()
    public void goToActivityRegister() {
    }
    
    @java.lang.Override()
    public int getColorType(float value) {
        return 0;
    }
    
    @java.lang.Override()
    public void saveComment(@org.jetbrains.annotations.NotNull()
    java.lang.String comment) {
    }
    
    public final void saveCommentLocal(@org.jetbrains.annotations.NotNull()
    java.lang.String comment) {
    }
}