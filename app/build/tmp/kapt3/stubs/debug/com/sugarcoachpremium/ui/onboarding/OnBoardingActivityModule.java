package com.sugarcoachpremium.ui.onboarding;

@dagger.Module()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\bJ-\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\rH\u0001\u00a2\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\u00a2\u0006\u0002\b\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/sugarcoachpremium/ui/onboarding/OnBoardingActivityModule;", "", "<init>", "()V", "provideOnBoardingInteractor", "Lcom/sugarcoachpremium/ui/onboarding/interactor/OnBoardingInteractorImp;", "onboardingInteractor", "Lcom/sugarcoachpremium/ui/onboarding/interactor/OnBoardingInteractor;", "provideOnBoardingInteractor$app_debug", "provideOnBoardingPresenter", "Lcom/sugarcoachpremium/ui/onboarding/presenter/OnBoardingPresenterImp;", "Lcom/sugarcoachpremium/ui/onboarding/view/OnBoardingView;", "onboardingPresenter", "Lcom/sugarcoachpremium/ui/onboarding/presenter/OnBoardingPresenter;", "provideOnBoardingPresenter$app_debug", "provideBoardingFragmentPagerAdapter", "Lcom/sugarcoachpremium/ui/onboarding/view/BoardingFragmentPagerAdapter;", "context", "Lcom/sugarcoachpremium/ui/onboarding/view/OnBoardingActivity;", "provideBoardingFragmentPagerAdapter$app_debug", "app_debug"})
public final class OnBoardingActivityModule {
    
    public OnBoardingActivityModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp provideOnBoardingInteractor$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractor onboardingInteractor) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenterImp<com.sugarcoachpremium.ui.onboarding.view.OnBoardingView, com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp> provideOnBoardingPresenter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenter<com.sugarcoachpremium.ui.onboarding.view.OnBoardingView, com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp> onboardingPresenter) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.ui.onboarding.view.BoardingFragmentPagerAdapter provideBoardingFragmentPagerAdapter$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.ui.onboarding.view.OnBoardingActivity context) {
        return null;
    }
}