package com.sugarcoachpremium.ui.register;

@dagger.Module()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\bJ-\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\rH\u0001\u00a2\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u0016J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\u001bH\u0001\u00a2\u0006\u0002\b\u001c\u00a8\u0006\u001d"}, d2 = {"Lcom/sugarcoachpremium/ui/register/RegisterActivityModule;", "", "<init>", "()V", "provideRegisterInteractor", "Lcom/sugarcoachpremium/ui/register/interactor/RegisterInteractorImp;", "registerInteractor", "Lcom/sugarcoachpremium/ui/register/interactor/RegisterInteractor;", "provideRegisterInteractor$app_debug", "provideRegisterPresenter", "Lcom/sugarcoachpremium/ui/register/presenter/RegisterPresenterImp;", "Lcom/sugarcoachpremium/ui/register/view/RegisterView;", "registerPresenter", "Lcom/sugarcoachpremium/ui/register/presenter/RegisterPresenter;", "provideRegisterPresenter$app_debug", "provideItemAdapter", "Lcom/sugarcoachpremium/ui/register/view/ItemAdapter;", "context", "Lcom/sugarcoachpremium/ui/register/view/RegisterActivity;", "provideItemAdapter$app_debug", "provideCategoryAdapter", "Lcom/sugarcoachpremium/ui/register/view/CategoryAdapter;", "provideCategoryAdapter$app_debug", "provideLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "provideLinearLayoutManager$app_debug", "provideCurrentDate", "Lorg/joda/time/LocalDateTime;", "provideCurrentDate$app_debug", "app_debug"})
public final class RegisterActivityModule {
    
    public RegisterActivityModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp provideRegisterInteractor$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.register.interactor.RegisterInteractor registerInteractor) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.register.presenter.RegisterPresenterImp<com.sugarcoachpremium.ui.register.view.RegisterView, com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp> provideRegisterPresenter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.register.presenter.RegisterPresenter<com.sugarcoachpremium.ui.register.view.RegisterView, com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp> registerPresenter) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.register.view.ItemAdapter provideItemAdapter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.register.view.RegisterActivity context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.register.view.CategoryAdapter provideCategoryAdapter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.register.view.RegisterActivity context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager provideLinearLayoutManager$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.register.view.RegisterActivity context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final org.joda.time.LocalDateTime provideCurrentDate$app_debug() {
        return null;
    }
}