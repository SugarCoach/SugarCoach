package com.sugarcoachpremium.ui.onboarding;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001\u00a2\u0006\u0002\b\fJ-\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u0011H\u0001\u00a2\u0006\u0002\b\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/sugarcoachpremium/ui/onboarding/OnBoardingActivityModule;", "", "()V", "provideBoardingFragmentPagerAdapter", "Lcom/sugarcoachpremium/ui/onboarding/view/BoardingFragmentPagerAdapter;", "context", "Lcom/sugarcoachpremium/ui/onboarding/view/OnBoardingActivity;", "provideBoardingFragmentPagerAdapter$app_release", "provideOnBoardingInteractor", "Lcom/sugarcoachpremium/ui/onboarding/interactor/OnBoardingInteractorImp;", "onboardingInteractor", "Lcom/sugarcoachpremium/ui/onboarding/interactor/OnBoardingInteractor;", "provideOnBoardingInteractor$app_release", "provideOnBoardingPresenter", "Lcom/sugarcoachpremium/ui/onboarding/presenter/OnBoardingPresenterImp;", "Lcom/sugarcoachpremium/ui/onboarding/view/OnBoardingView;", "onboardingPresenter", "Lcom/sugarcoachpremium/ui/onboarding/presenter/OnBoardingPresenter;", "provideOnBoardingPresenter$app_release", "app_release"})
public final class OnBoardingActivityModule {
    
    public OnBoardingActivityModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp provideOnBoardingInteractor$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractor onboardingInteractor) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenterImp<com.sugarcoachpremium.ui.onboarding.view.OnBoardingView, com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp> provideOnBoardingPresenter$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenter<com.sugarcoachpremium.ui.onboarding.view.OnBoardingView, com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp> onboardingPresenter) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.ui.onboarding.view.BoardingFragmentPagerAdapter provideBoardingFragmentPagerAdapter$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.ui.onboarding.view.OnBoardingActivity context) {
        return null;
    }
}