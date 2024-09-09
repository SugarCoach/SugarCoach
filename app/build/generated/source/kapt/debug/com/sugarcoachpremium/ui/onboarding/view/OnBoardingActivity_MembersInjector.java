package com.sugarcoachpremium.ui.onboarding.view;

import com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp;
import com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenterImp;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class OnBoardingActivity_MembersInjector implements MembersInjector<OnBoardingActivity> {
  private final Provider<OnBoardingPresenterImp<OnBoardingView, OnBoardingInteractorImp>> presenterProvider;

  private final Provider<BoardingFragmentPagerAdapter> adapterProvider;

  public OnBoardingActivity_MembersInjector(
      Provider<OnBoardingPresenterImp<OnBoardingView, OnBoardingInteractorImp>> presenterProvider,
      Provider<BoardingFragmentPagerAdapter> adapterProvider) {
    this.presenterProvider = presenterProvider;
    this.adapterProvider = adapterProvider;
  }

  public static MembersInjector<OnBoardingActivity> create(
      Provider<OnBoardingPresenterImp<OnBoardingView, OnBoardingInteractorImp>> presenterProvider,
      Provider<BoardingFragmentPagerAdapter> adapterProvider) {
    return new OnBoardingActivity_MembersInjector(presenterProvider, adapterProvider);
  }

  @Override
  public void injectMembers(OnBoardingActivity instance) {
    injectPresenter(instance, presenterProvider.get());
    injectAdapter(instance, adapterProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.onboarding.view.OnBoardingActivity.presenter")
  public static void injectPresenter(OnBoardingActivity instance,
      OnBoardingPresenterImp<OnBoardingView, OnBoardingInteractorImp> presenter) {
    instance.presenter = presenter;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.onboarding.view.OnBoardingActivity.adapter")
  public static void injectAdapter(OnBoardingActivity instance,
      BoardingFragmentPagerAdapter adapter) {
    instance.adapter = adapter;
  }
}
