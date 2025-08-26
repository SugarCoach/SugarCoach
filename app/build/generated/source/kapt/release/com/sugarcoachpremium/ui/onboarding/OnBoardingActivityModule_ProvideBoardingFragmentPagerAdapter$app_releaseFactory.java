package com.sugarcoachpremium.ui.onboarding;

import com.sugarcoachpremium.ui.onboarding.view.BoardingFragmentPagerAdapter;
import com.sugarcoachpremium.ui.onboarding.view.OnBoardingActivity;
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
public final class OnBoardingActivityModule_ProvideBoardingFragmentPagerAdapter$app_releaseFactory implements Factory<BoardingFragmentPagerAdapter> {
  private final OnBoardingActivityModule module;

  private final Provider<OnBoardingActivity> contextProvider;

  public OnBoardingActivityModule_ProvideBoardingFragmentPagerAdapter$app_releaseFactory(
      OnBoardingActivityModule module, Provider<OnBoardingActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public BoardingFragmentPagerAdapter get() {
    return provideBoardingFragmentPagerAdapter$app_release(module, contextProvider.get());
  }

  public static OnBoardingActivityModule_ProvideBoardingFragmentPagerAdapter$app_releaseFactory create(
      OnBoardingActivityModule module, Provider<OnBoardingActivity> contextProvider) {
    return new OnBoardingActivityModule_ProvideBoardingFragmentPagerAdapter$app_releaseFactory(module, contextProvider);
  }

  public static BoardingFragmentPagerAdapter provideBoardingFragmentPagerAdapter$app_release(
      OnBoardingActivityModule instance, OnBoardingActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideBoardingFragmentPagerAdapter$app_release(context));
  }
}
