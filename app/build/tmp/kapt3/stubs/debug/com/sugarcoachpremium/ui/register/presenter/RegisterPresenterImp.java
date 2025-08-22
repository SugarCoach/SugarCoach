package com.sugarcoachpremium.ui.register.presenter;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H&J \u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H&J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"H&J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%H&J\"\u0010&\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010*H&J+\u0010+\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020\u00102\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0-2\u0006\u0010.\u001a\u00020/H&\u00a2\u0006\u0002\u00100J\b\u00101\u001a\u00020\u0007H&J\u0010\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\rH&J\b\u00104\u001a\u00020\u0007H&J\b\u00105\u001a\u00020\u0007H&J\b\u00106\u001a\u00020\u0007H&J\b\u00107\u001a\u00020\u0007H&\u00a8\u00068\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/register/presenter/RegisterPresenterImp;", "V", "Lcom/sugarcoachpremium/ui/register/view/RegisterView;", "I", "Lcom/sugarcoachpremium/ui/register/interactor/RegisterInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/Presenter;", "nextLoad", "", "prevLoad", "finishLoad", "backLoad", "setEmocional", "value", "", "setExercises", "setMedition", "", "setTime", "hourOfDay", "minute", "setDate", "year", "monthOfYear", "dayOfMonth", "showDateDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "dateSetListener", "Lcom/wdullaer/materialdatetimepicker/date/DatePickerDialog$OnDateSetListener;", "showTimeDialog", "timeSetListener", "Lcom/wdullaer/materialdatetimepicker/time/TimePickerDialog$OnTimeSetListener;", "checkValue", "floatValue", "", "initChooser", "context", "Landroid/app/Activity;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "showChooser", "saveComment", "comment", "goToActivityDaily", "goToActivityMain", "goToActivityStatistic", "goToActivityTreament", "app_debug"})
public abstract interface RegisterPresenterImp<V extends com.sugarcoachpremium.ui.register.view.RegisterView, I extends com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.Presenter<V, I> {
    
    public abstract void nextLoad();
    
    public abstract void prevLoad();
    
    public abstract void finishLoad();
    
    public abstract void backLoad();
    
    public abstract void setEmocional(@org.jetbrains.annotations.NotNull()
    java.lang.String value);
    
    public abstract void setExercises(@org.jetbrains.annotations.NotNull()
    java.lang.String value);
    
    public abstract void setMedition(int value);
    
    public abstract void setTime(int hourOfDay, int minute);
    
    public abstract void setDate(int year, int monthOfYear, int dayOfMonth);
    
    public abstract void showDateDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    com.wdullaer.materialdatetimepicker.date.DatePickerDialog.OnDateSetListener dateSetListener);
    
    public abstract void showTimeDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener timeSetListener);
    
    public abstract void checkValue(float floatValue);
    
    public abstract void initChooser(@org.jetbrains.annotations.NotNull()
    android.app.Activity context);
    
    public abstract void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data);
    
    public abstract void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults);
    
    public abstract void showChooser();
    
    public abstract void saveComment(@org.jetbrains.annotations.NotNull()
    java.lang.String comment);
    
    public abstract void goToActivityDaily();
    
    public abstract void goToActivityMain();
    
    public abstract void goToActivityStatistic();
    
    public abstract void goToActivityTreament();
}