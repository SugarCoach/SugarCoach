package com.sugarcoachpremium.ui.profile;

@dagger.Module()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\bJ-\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\rH\u0001\u00a2\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/sugarcoachpremium/ui/profile/ProfileActivityModule;", "", "<init>", "()V", "provideProfileInteractor", "Lcom/sugarcoachpremium/ui/profile/interactor/ProfileInteractorImp;", "profileInteractor", "Lcom/sugarcoachpremium/ui/profile/interactor/ProfileInteractor;", "provideProfileInteractor$app_debug", "provideProfilePresenter", "Lcom/sugarcoachpremium/ui/profile/presenter/ProfilePresenterImp;", "Lcom/sugarcoachpremium/ui/profile/view/ProfileView;", "profilePresenter", "Lcom/sugarcoachpremium/ui/profile/presenter/ProfilePresenter;", "provideProfilePresenter$app_debug", "provideProfileAdapter", "Lcom/sugarcoachpremium/ui/profile/view/ProfileAdapter;", "context", "Lcom/sugarcoachpremium/ui/profile/view/ProfileActivity;", "provideProfileAdapter$app_debug", "provideGridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "provideGridLayoutManager$app_debug", "app_debug"})
public final class ProfileActivityModule {
    
    public ProfileActivityModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp provideProfileInteractor$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.profile.interactor.ProfileInteractor profileInteractor) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.profile.presenter.ProfilePresenterImp<com.sugarcoachpremium.ui.profile.view.ProfileView, com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp> provideProfilePresenter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.profile.presenter.ProfilePresenter<com.sugarcoachpremium.ui.profile.view.ProfileView, com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp> profilePresenter) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.profile.view.ProfileAdapter provideProfileAdapter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.profile.view.ProfileActivity context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.GridLayoutManager provideGridLayoutManager$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.profile.view.ProfileActivity context) {
        return null;
    }
}