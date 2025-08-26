package com.sugarcoachpremium.ui.onboarding;

import com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp;
import com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenter;
import com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenterImp;
import com.sugarcoachpremium.ui.onboarding.view.OnBoardingView;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class OnBoardingActivityModule_ProvideOnBoardingPresenter$app_debugFactory implements Factory<OnBoardingPresenterImp<OnBoardingView, OnBoardingInteractorImp>> {
  private final OnBoardingActivityModule module;

  private final Provider<OnBoardingPresenter<OnBoardingView, OnBoardingInteractorImp>> onboardingPresenterProvider;

  public OnBoardingActivityModule_ProvideOnBoardingPresenter$app_debugFactory(
      OnBoardingActivityModule module,
      Provider<OnBoardingPresenter<OnBoardingView, OnBoardingInteractorImp>> onboardingPresenterProvider) {
    this.module = module;
    this.onboardingPresenterProvider = onboardingPresenterProvider;
  }

  @Override
  public OnBoardingPresenterImp<OnBoardingView, OnBoardingInteractorImp> get() {
    return provideOnBoardingPresenter$app_debug(module, onboardingPresenterProvider.get());
  }

  public static OnBoardingActivityModule_ProvideOnBoardingPresenter$app_debugFactory create(
      OnBoardingActivityModule module,
      Provider<OnBoardingPresenter<OnBoardingView, OnBoardingInteractorImp>> onboardingPresenterProvider) {
    return new OnBoardingActivityModule_ProvideOnBoardingPresenter$app_debugFactory(module, onboardingPresenterProvider);
  }

  public static OnBoardingPresenterImp<OnBoardingView, OnBoardingInteractorImp> provideOnBoardingPresenter$app_debug(
      OnBoardingActivityModule instance,
      OnBoardingPresenter<OnBoardingView, OnBoardingInteractorImp> onboardingPresenter) {
    return Preconditions.checkNotNullFromProvides(instance.provideOnBoardingPresenter$app_debug(onboardingPresenter));
  }
}
