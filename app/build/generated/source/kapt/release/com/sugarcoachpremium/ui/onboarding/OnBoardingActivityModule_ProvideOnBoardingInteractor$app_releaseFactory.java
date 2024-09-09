package com.sugarcoachpremium.ui.onboarding;

import com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractor;
import com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp;
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
public final class OnBoardingActivityModule_ProvideOnBoardingInteractor$app_releaseFactory implements Factory<OnBoardingInteractorImp> {
  private final OnBoardingActivityModule module;

  private final Provider<OnBoardingInteractor> onboardingInteractorProvider;

  public OnBoardingActivityModule_ProvideOnBoardingInteractor$app_releaseFactory(
      OnBoardingActivityModule module,
      Provider<OnBoardingInteractor> onboardingInteractorProvider) {
    this.module = module;
    this.onboardingInteractorProvider = onboardingInteractorProvider;
  }

  @Override
  public OnBoardingInteractorImp get() {
    return provideOnBoardingInteractor$app_release(module, onboardingInteractorProvider.get());
  }

  public static OnBoardingActivityModule_ProvideOnBoardingInteractor$app_releaseFactory create(
      OnBoardingActivityModule module,
      Provider<OnBoardingInteractor> onboardingInteractorProvider) {
    return new OnBoardingActivityModule_ProvideOnBoardingInteractor$app_releaseFactory(module, onboardingInteractorProvider);
  }

  public static OnBoardingInteractorImp provideOnBoardingInteractor$app_release(
      OnBoardingActivityModule instance, OnBoardingInteractor onboardingInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.provideOnBoardingInteractor$app_release(onboardingInteractor));
  }
}
