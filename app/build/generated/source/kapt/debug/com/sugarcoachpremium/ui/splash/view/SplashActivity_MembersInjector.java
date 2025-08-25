package com.sugarcoachpremium.ui.splash.view;

import com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp;
import com.sugarcoachpremium.ui.splash.presenter.SplashPresenterImp;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;

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
public final class SplashActivity_MembersInjector implements MembersInjector<SplashActivity> {
  private final Provider<SplashPresenterImp<SplashView, SplashInteractorImp>> presenterProvider;

  private SplashActivity_MembersInjector(
      Provider<SplashPresenterImp<SplashView, SplashInteractorImp>> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<SplashActivity> create(
      Provider<SplashPresenterImp<SplashView, SplashInteractorImp>> presenterProvider) {
    return new SplashActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(SplashActivity instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.splash.view.SplashActivity.presenter")
  public static void injectPresenter(SplashActivity instance,
      SplashPresenterImp<SplashView, SplashInteractorImp> presenter) {
    instance.presenter = presenter;
  }
}
