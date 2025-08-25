package com.sugarcoachpremium.ui.daily_detail.presenter;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0007H&J\u0017\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&\u00a2\u0006\u0002\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H&\u00a2\u0006\u0002\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012H&\u00a2\u0006\u0002\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012H&\u00a2\u0006\u0002\u0010\u0013J\u0012\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J\u0017\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\tH&\u00a2\u0006\u0002\u0010\u001fJ\u0012\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u001cH&J\u0012\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u001cH&J\u0012\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u001cH&J\u0012\u0010&\u001a\u00020\u00072\b\u0010\'\u001a\u0004\u0018\u00010(H&J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H&J\u0018\u0010.\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+2\u0006\u0010/\u001a\u000200H&J\u0010\u00101\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH&J\"\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\t2\b\u00105\u001a\u0004\u0018\u000106H&J3\u00107\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00103\u001a\u00020\t2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001c092\u0006\u0010:\u001a\u00020;H&\u00a2\u0006\u0002\u0010<J\b\u0010=\u001a\u00020\u0007H&J\u0018\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\tH&J \u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\tH&J\u0010\u0010E\u001a\u00020F2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010G\u001a\u00020\u0007H&J\b\u0010H\u001a\u00020\u0007H&J\b\u0010I\u001a\u00020\u0007H&J\b\u0010J\u001a\u00020\u0007H&J\u0010\u0010K\u001a\u00020\t2\u0006\u0010L\u001a\u00020\u0012H&J\u0010\u0010M\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001cH&\u00a8\u0006N\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/daily_detail/presenter/DailyDetailPresenterImp;", "V", "Lcom/sugarcoachpremium/ui/daily_detail/view/DailyDetailView;", "I", "Lcom/sugarcoachpremium/ui/daily_detail/interactor/DailyDetailInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/Presenter;", "getRegister", "", "id", "", "getScreenShot", "context", "Landroid/app/Activity;", "view", "Landroid/view/View;", "deleteRegister", "updateGlucose", "glucose", "", "(Ljava/lang/Float;)V", "updateInsulin", "insulin", "updateBasal", "basal", "updateCarb", "carbohydrates", "updateExercise", "exercise", "", "updateLabel", "label", "(Ljava/lang/Integer;)V", "updateEmotional", "emotional", "updateComment", "comment", "updatePhoto", "photo", "updateDate", "date", "Ljava/util/Date;", "showDateDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "dateSetListener", "Lcom/wdullaer/materialdatetimepicker/date/DatePickerDialog$OnDateSetListener;", "showTimeDialog", "timeSetListener", "Lcom/wdullaer/materialdatetimepicker/time/TimePickerDialog$OnTimeSetListener;", "initChooser", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(Landroid/app/Activity;I[Ljava/lang/String;[I)V", "showChooser", "setTime", "hourOfDay", "minute", "setDate", "year", "monthOfYear", "dayOfMonth", "checkAndRequestPermissions", "", "goToActivityTreament", "goToActivityMain", "goToActivityStatistic", "goToActivityRegister", "getColorType", "value", "saveComment", "app_debug"})
public abstract interface DailyDetailPresenterImp<V extends com.sugarcoachpremium.ui.daily_detail.view.DailyDetailView, I extends com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.Presenter<V, I> {
    
    public abstract void getRegister(int id);
    
    public abstract void getScreenShot(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    public abstract void deleteRegister();
    
    public abstract void updateGlucose(@org.jetbrains.annotations.Nullable()
    java.lang.Float glucose);
    
    public abstract void updateInsulin(@org.jetbrains.annotations.Nullable()
    java.lang.Float insulin);
    
    public abstract void updateBasal(@org.jetbrains.annotations.Nullable()
    java.lang.Float basal);
    
    public abstract void updateCarb(@org.jetbrains.annotations.Nullable()
    java.lang.Float carbohydrates);
    
    public abstract void updateExercise(@org.jetbrains.annotations.Nullable()
    java.lang.String exercise);
    
    public abstract void updateLabel(@org.jetbrains.annotations.Nullable()
    java.lang.Integer label);
    
    public abstract void updateEmotional(@org.jetbrains.annotations.Nullable()
    java.lang.String emotional);
    
    public abstract void updateComment(@org.jetbrains.annotations.Nullable()
    java.lang.String comment);
    
    public abstract void updatePhoto(@org.jetbrains.annotations.Nullable()
    java.lang.String photo);
    
    public abstract void updateDate(@org.jetbrains.annotations.Nullable()
    java.util.Date date);
    
    public abstract void showDateDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    com.wdullaer.materialdatetimepicker.date.DatePickerDialog.OnDateSetListener dateSetListener);
    
    public abstract void showTimeDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener timeSetListener);
    
    public abstract void initChooser(@org.jetbrains.annotations.NotNull()
    android.app.Activity context);
    
    public abstract void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data);
    
    public abstract void onRequestPermissionsResult(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults);
    
    public abstract void showChooser();
    
    public abstract void setTime(int hourOfDay, int minute);
    
    public abstract void setDate(int year, int monthOfYear, int dayOfMonth);
    
    public abstract boolean checkAndRequestPermissions(@org.jetbrains.annotations.NotNull()
    android.app.Activity context);
    
    public abstract void goToActivityTreament();
    
    public abstract void goToActivityMain();
    
    public abstract void goToActivityStatistic();
    
    public abstract void goToActivityRegister();
    
    public abstract int getColorType(float value);
    
    public abstract void saveComment(@org.jetbrains.annotations.NotNull()
    java.lang.String comment);
}