package com.sugarcoachpremium.ui.treatment;

@dagger.Module()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\bJ-\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\rH\u0001\u00a2\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u0016J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u0019J\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u001cJ\u0015\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\"J\u0015\u0010#\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b%\u00a8\u0006&"}, d2 = {"Lcom/sugarcoachpremium/ui/treatment/TreatmentActivityModule;", "", "<init>", "()V", "provideTreatmentInteractor", "Lcom/sugarcoachpremium/ui/treatment/interactor/TreatmentInteractorImp;", "registerInteractor", "Lcom/sugarcoachpremium/ui/treatment/interactor/TreatmentInteractor;", "provideTreatmentInteractor$app_debug", "provideTreatmentPresenter", "Lcom/sugarcoachpremium/ui/treatment/presenter/TreatmentPresenterImp;", "Lcom/sugarcoachpremium/ui/treatment/view/TreatmentView;", "registerPresenter", "Lcom/sugarcoachpremium/ui/treatment/presenter/TreatmentPresenter;", "provideTreatmentPresenter$app_debug", "provideBasalAdapter", "Lcom/sugarcoachpremium/ui/treatment/view/BasalAdapter;", "context", "Lcom/sugarcoachpremium/ui/treatment/view/TreatmentActivity;", "provideBasalAdapter$app_debug", "provideTreatmentAdapter", "Lcom/sugarcoachpremium/ui/treatment/view/TreatmentAdapter;", "provideTreatmentAdapter$app_debug", "provideTreatmentBasalHoraAdapter", "Lcom/sugarcoachpremium/ui/treatment/view/TreatmentBasalHoraAdapter;", "provideTreatmentBasalHoraAdapter$app_debug", "provideMedidorAdapter", "Lcom/sugarcoachpremium/ui/treatment/view/MedidorAdapter;", "provideMedidorAdapter$app_debug", "provideBombaAdapter", "Lcom/sugarcoachpremium/ui/treatment/view/BombaAdapter;", "provideBombaAdapter$app_debug", "provideTreatmentCorrectoraAdapter", "Lcom/sugarcoachpremium/ui/treatment/view/TreatmentCorrectoraAdapter;", "provideTreatmentCorrectoraAdapter$app_debug", "provideLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "provideLinearLayoutManager$app_debug", "app_debug"})
public final class TreatmentActivityModule {
    
    public TreatmentActivityModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractorImp provideTreatmentInteractor$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractor registerInteractor) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.treatment.presenter.TreatmentPresenterImp<com.sugarcoachpremium.ui.treatment.view.TreatmentView, com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractorImp> provideTreatmentPresenter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.presenter.TreatmentPresenter<com.sugarcoachpremium.ui.treatment.view.TreatmentView, com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractorImp> registerPresenter) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.treatment.view.BasalAdapter provideBasalAdapter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.TreatmentActivity context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.treatment.view.TreatmentAdapter provideTreatmentAdapter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.TreatmentActivity context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.treatment.view.TreatmentBasalHoraAdapter provideTreatmentBasalHoraAdapter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.TreatmentActivity context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.treatment.view.MedidorAdapter provideMedidorAdapter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.TreatmentActivity context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.treatment.view.BombaAdapter provideBombaAdapter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.TreatmentActivity context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.treatment.view.TreatmentCorrectoraAdapter provideTreatmentCorrectoraAdapter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.TreatmentActivity context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager provideLinearLayoutManager$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.treatment.view.TreatmentActivity context) {
        return null;
    }
}