package com.sugarcoachpremium.ui.treatment.presenter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u000bH&J\b\u0010\u0010\u001a\u00020\u000bH&J\u0019\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H&J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0007H&J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0016H&J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\"H&J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\"H&J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0016H&J\u0010\u0010\'\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020(H&J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u0016H&J\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u0016H&J\b\u0010-\u001a\u00020\u000bH&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"Lcom/sugarcoachpremium/ui/treatment/presenter/TreatmentPresenterImp;", "V", "Lcom/sugarcoachpremium/ui/treatment/view/TreatmentView;", "I", "Lcom/sugarcoachpremium/ui/treatment/interactor/TreatmentInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/Presenter;", "checkAndRequestPermissions", "", "context", "Landroid/app/Activity;", "getScreenShot", "", "view", "Landroid/view/View;", "goToActivityDaily", "goToActivityMain", "goToActivityStatistic", "makePdf", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAll", "obj", "", "hipo", "hyper", "saveBasal", "item", "Lcom/sugarcoachpremium/ui/treatment/view/BasalItem;", "saveBomb", "bomb", "saveBomba", "saveCarbono", "carbono", "saveCategory", "Lcom/sugarcoachpremium/ui/treatment/view/HorarioItem;", "saveCorrectora", "saveCorrectoraCategory", "saveCorrectoraGlu", "correctora", "saveHoraBasal", "Lcom/sugarcoachpremium/ui/treatment/view/BasalHoraItem;", "saveMedidor", "saveUnitCorrectora", "unit", "saveUnitInsulina", "updateAll", "app_debug"})
public abstract interface TreatmentPresenterImp<V extends com.sugarcoachpremium.ui.treatment.view.TreatmentView, I extends com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.Presenter<V, I> {
    
    public abstract void saveBasal(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.treatment.view.BasalItem item);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object makePdf(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    public abstract void getScreenShot(@org.jetbrains.annotations.NotNull
    android.app.Activity context, @org.jetbrains.annotations.NotNull
    android.view.View view);
    
    public abstract boolean checkAndRequestPermissions(@org.jetbrains.annotations.NotNull
    android.app.Activity context);
    
    public abstract void saveCorrectora(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.treatment.view.BasalItem item);
    
    public abstract void saveCategory(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.treatment.view.HorarioItem item);
    
    public abstract void saveHoraBasal(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.treatment.view.BasalHoraItem item);
    
    public abstract void saveCorrectoraCategory(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.treatment.view.HorarioItem item);
    
    public abstract void saveAll(float obj, float hipo, float hyper);
    
    public abstract void updateAll();
    
    public abstract void goToActivityDaily();
    
    public abstract void goToActivityMain();
    
    public abstract void goToActivityStatistic();
    
    public abstract void saveUnitCorrectora(float unit);
    
    public abstract void saveCorrectoraGlu(float correctora);
    
    public abstract void saveUnitInsulina(float unit);
    
    public abstract void saveCarbono(float carbono);
    
    public abstract void saveBomb(boolean bomb);
    
    public abstract void saveMedidor(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.treatment.view.BasalItem item);
    
    public abstract void saveBomba(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.treatment.view.BasalItem item);
}