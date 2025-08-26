package com.sugarcoachpremium.ui.register;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\r\u0010\b\u001a\u00020\tH\u0001\u00a2\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0001\u00a2\u0006\u0002\b\u0015J-\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u001aH\u0001\u00a2\u0006\u0002\b\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/sugarcoachpremium/ui/register/RegisterActivityModule;", "", "()V", "provideCategoryAdapter", "Lcom/sugarcoachpremium/ui/register/view/CategoryAdapter;", "context", "Lcom/sugarcoachpremium/ui/register/view/RegisterActivity;", "provideCategoryAdapter$app_debug", "provideCurrentDate", "Lorg/joda/time/LocalDateTime;", "provideCurrentDate$app_debug", "provideItemAdapter", "Lcom/sugarcoachpremium/ui/register/view/ItemAdapter;", "provideItemAdapter$app_debug", "provideLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "provideLinearLayoutManager$app_debug", "provideRegisterInteractor", "Lcom/sugarcoachpremium/ui/register/interactor/RegisterInteractorImp;", "registerInteractor", "Lcom/sugarcoachpremium/ui/register/interactor/RegisterInteractor;", "provideRegisterInteractor$app_debug", "provideRegisterPresenter", "Lcom/sugarcoachpremium/ui/register/presenter/RegisterPresenterImp;", "Lcom/sugarcoachpremium/ui/register/view/RegisterView;", "registerPresenter", "Lcom/sugarcoachpremium/ui/register/presenter/RegisterPresenter;", "provideRegisterPresenter$app_debug", "app_debug"})
public final class RegisterActivityModule {
    
    public RegisterActivityModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp provideRegisterInteractor$app_debug(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.register.interactor.RegisterInteractor registerInteractor) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.register.presenter.RegisterPresenterImp<com.sugarcoachpremium.ui.register.view.RegisterView, com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp> provideRegisterPresenter$app_debug(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.register.presenter.RegisterPresenter<com.sugarcoachpremium.ui.register.view.RegisterView, com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp> registerPresenter) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.register.view.ItemAdapter provideItemAdapter$app_debug(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.register.view.RegisterActivity context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.register.view.CategoryAdapter provideCategoryAdapter$app_debug(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.register.view.RegisterActivity context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.LinearLayoutManager provideLinearLayoutManager$app_debug(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.register.view.RegisterActivity context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final org.joda.time.LocalDateTime provideCurrentDate$app_debug() {
        return null;
    }
}