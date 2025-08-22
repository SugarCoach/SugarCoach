package com.sugarcoachpremium.ui.onboarding;

import com.sugarcoachpremium.ui.onboarding.view.BoardingFragmentPagerAdapter;
import com.sugarcoachpremium.ui.onboarding.view.OnBoardingActivity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class OnBoardingActivityModule_ProvideBoardingFragmentPagerAdapter$app_debugFactory implements Factory<BoardingFragmentPagerAdapter> {
  private final OnBoardingActivityModule module;

  private final Provider<OnBoardingActivity> contextProvider;

  private OnBoardingActivityModule_ProvideBoardingFragmentPagerAdapter$app_debugFactory(
      OnBoardingActivityModule module, Provider<OnBoardingActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public BoardingFragmentPagerAdapter get() {
    return provideBoardingFragmentPagerAdapter$app_debug(module, contextProvider.get());
  }

  public static OnBoardingActivityModule_ProvideBoardingFragmentPagerAdapter$app_debugFactory create(
      OnBoardingActivityModule module, Provider<OnBoardingActivity> contextProvider) {
    return new OnBoardingActivityModule_ProvideBoardingFragmentPagerAdapter$app_debugFactory(module, contextProvider);
  }

  public static BoardingFragmentPagerAdapter provideBoardingFragmentPagerAdapter$app_debug(
      OnBoardingActivityModule instance, OnBoardingActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideBoardingFragmentPagerAdapter$app_debug(context));
  }
}
