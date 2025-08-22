package com.sugarcoachpremium.ui.treatment.presenter;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0012\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u00a6@\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u000fH&J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0016H&J \u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH&J\b\u0010\u001f\u001a\u00020\u0007H&J\b\u0010 \u001a\u00020\u0007H&J\b\u0010!\u001a\u00020\u0007H&J\b\u0010\"\u001a\u00020\u0007H&J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u001cH&J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u001cH&J\u0010\u0010\'\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u001cH&J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u001cH&J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0013H&J\u0010\u0010,\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006.\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/treatment/presenter/TreatmentPresenterImp;", "V", "Lcom/sugarcoachpremium/ui/treatment/view/TreatmentView;", "I", "Lcom/sugarcoachpremium/ui/treatment/interactor/TreatmentInteractorImp;", "Lcom/sugarcoachpremium/ui/base/presenter/Presenter;", "saveBasal", "", "item", "Lcom/sugarcoachpremium/ui/treatment/view/BasalItem;", "makePdf", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getScreenShot", "Landroid/app/Activity;", "view", "Landroid/view/View;", "checkAndRequestPermissions", "", "saveCorrectora", "saveCategory", "Lcom/sugarcoachpremium/ui/treatment/view/HorarioItem;", "saveHoraBasal", "Lcom/sugarcoachpremium/ui/treatment/view/BasalHoraItem;", "saveCorrectoraCategory", "saveAll", "obj", "", "hipo", "hyper", "updateAll", "goToActivityDaily", "goToActivityMain", "goToActivityStatistic", "saveUnitCorrectora", "unit", "saveCorrectoraGlu", "correctora", "saveUnitInsulina", "saveCarbono", "carbono", "saveBomb", "bomb", "saveMedidor", "saveBomba", "app_debug"})
public abstract interface TreatmentPresenterImp<V extends com.sugarcoachpremium.ui.treatment.view.TreatmentView, I extends com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractorImp> extends com.sugarcoachpremium.ui.base.presenter.Presenter<V, I> {
    
    public abstract void saveBasal(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.BasalItem item);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object makePdf(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    public abstract void getScreenShot(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    public abstract boolean checkAndRequestPermissions(@org.jetbrains.annotations.NotNull()
    android.app.Activity context);
    
    public abstract void saveCorrectora(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.BasalItem item);
    
    public abstract void saveCategory(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.HorarioItem item);
    
    public abstract void saveHoraBasal(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.BasalHoraItem item);
    
    public abstract void saveCorrectoraCategory(@org.jetbrains.annotations.NotNull()
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
    
    public abstract void saveMedidor(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.BasalItem item);
    
    public abstract void saveBomba(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.BasalItem item);
}