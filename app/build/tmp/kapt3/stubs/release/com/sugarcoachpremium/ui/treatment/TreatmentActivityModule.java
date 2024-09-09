package com.sugarcoachpremium.ui.treatment;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0016J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0019J\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001\u00a2\u0006\u0002\b\u001eJ-\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001b0 2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001b0#H\u0001\u00a2\u0006\u0002\b$\u00a8\u0006%"}, d2 = {"Lcom/sugarcoachpremium/ui/treatment/TreatmentActivityModule;", "", "()V", "provideBasalAdapter", "Lcom/sugarcoachpremium/ui/treatment/view/BasalAdapter;", "context", "Lcom/sugarcoachpremium/ui/treatment/view/TreatmentActivity;", "provideBasalAdapter$app_release", "provideBombaAdapter", "Lcom/sugarcoachpremium/ui/treatment/view/BombaAdapter;", "provideBombaAdapter$app_release", "provideLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "provideLinearLayoutManager$app_release", "provideMedidorAdapter", "Lcom/sugarcoachpremium/ui/treatment/view/MedidorAdapter;", "provideMedidorAdapter$app_release", "provideTreatmentAdapter", "Lcom/sugarcoachpremium/ui/treatment/view/TreatmentAdapter;", "provideTreatmentAdapter$app_release", "provideTreatmentBasalHoraAdapter", "Lcom/sugarcoachpremium/ui/treatment/view/TreatmentBasalHoraAdapter;", "provideTreatmentBasalHoraAdapter$app_release", "provideTreatmentCorrectoraAdapter", "Lcom/sugarcoachpremium/ui/treatment/view/TreatmentCorrectoraAdapter;", "provideTreatmentCorrectoraAdapter$app_release", "provideTreatmentInteractor", "Lcom/sugarcoachpremium/ui/treatment/interactor/TreatmentInteractorImp;", "registerInteractor", "Lcom/sugarcoachpremium/ui/treatment/interactor/TreatmentInteractor;", "provideTreatmentInteractor$app_release", "provideTreatmentPresenter", "Lcom/sugarcoachpremium/ui/treatment/presenter/TreatmentPresenterImp;", "Lcom/sugarcoachpremium/ui/treatment/view/TreatmentView;", "registerPresenter", "Lcom/sugarcoachpremium/ui/treatment/presenter/TreatmentPresenter;", "provideTreatmentPresenter$app_release", "app_release"})
public final class TreatmentActivityModule {
    
    public TreatmentActivityModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractorImp provideTreatmentInteractor$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractor registerInteractor) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.treatment.presenter.TreatmentPresenterImp<com.sugarcoachpremium.ui.treatment.view.TreatmentView, com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractorImp> provideTreatmentPresenter$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.treatment.presenter.TreatmentPresenter<com.sugarcoachpremium.ui.treatment.view.TreatmentView, com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractorImp> registerPresenter) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.treatment.view.BasalAdapter provideBasalAdapter$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.treatment.view.TreatmentActivity context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.treatment.view.TreatmentAdapter provideTreatmentAdapter$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.treatment.view.TreatmentActivity context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.treatment.view.TreatmentBasalHoraAdapter provideTreatmentBasalHoraAdapter$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.treatment.view.TreatmentActivity context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.treatment.view.MedidorAdapter provideMedidorAdapter$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.treatment.view.TreatmentActivity context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.treatment.view.BombaAdapter provideBombaAdapter$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.treatment.view.TreatmentActivity context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.treatment.view.TreatmentCorrectoraAdapter provideTreatmentCorrectoraAdapter$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.treatment.view.TreatmentActivity context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.LinearLayoutManager provideLinearLayoutManager$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.treatment.view.TreatmentActivity context) {
        return null;
    }
}