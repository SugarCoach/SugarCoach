package com.sugarcoachpremium.ui.profile;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u00a2\u0006\u0002\b\u000fJ-\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0014H\u0001\u00a2\u0006\u0002\b\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/sugarcoachpremium/ui/profile/ProfileActivityModule;", "", "()V", "provideGridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "context", "Lcom/sugarcoachpremium/ui/profile/view/ProfileActivity;", "provideGridLayoutManager$app_debug", "provideProfileAdapter", "Lcom/sugarcoachpremium/ui/profile/view/ProfileAdapter;", "provideProfileAdapter$app_debug", "provideProfileInteractor", "Lcom/sugarcoachpremium/ui/profile/interactor/ProfileInteractorImp;", "profileInteractor", "Lcom/sugarcoachpremium/ui/profile/interactor/ProfileInteractor;", "provideProfileInteractor$app_debug", "provideProfilePresenter", "Lcom/sugarcoachpremium/ui/profile/presenter/ProfilePresenterImp;", "Lcom/sugarcoachpremium/ui/profile/view/ProfileView;", "profilePresenter", "Lcom/sugarcoachpremium/ui/profile/presenter/ProfilePresenter;", "provideProfilePresenter$app_debug", "app_debug"})
public final class ProfileActivityModule {
    
    public ProfileActivityModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp provideProfileInteractor$app_debug(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.profile.interactor.ProfileInteractor profileInteractor) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.profile.presenter.ProfilePresenterImp<com.sugarcoachpremium.ui.profile.view.ProfileView, com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp> provideProfilePresenter$app_debug(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.profile.presenter.ProfilePresenter<com.sugarcoachpremium.ui.profile.view.ProfileView, com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp> profilePresenter) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.profile.view.ProfileAdapter provideProfileAdapter$app_debug(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.profile.view.ProfileActivity context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.GridLayoutManager provideGridLayoutManager$app_debug(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.profile.view.ProfileActivity context) {
        return null;
    }
}