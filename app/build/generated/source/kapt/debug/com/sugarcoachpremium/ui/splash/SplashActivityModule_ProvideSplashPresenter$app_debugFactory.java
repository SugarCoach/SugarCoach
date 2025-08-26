package com.sugarcoachpremium.ui.splash;

import com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp;
import com.sugarcoachpremium.ui.splash.presenter.SplashPresenter;
import com.sugarcoachpremium.ui.splash.presenter.SplashPresenterImp;
import com.sugarcoachpremium.ui.splash.view.SplashView;
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
public final class SplashActivityModule_ProvideSplashPresenter$app_debugFactory implements Factory<SplashPresenterImp<SplashView, SplashInteractorImp>> {
  private final SplashActivityModule module;

  private final Provider<SplashPresenter<SplashView, SplashInteractorImp>> splashPresenterProvider;

  public SplashActivityModule_ProvideSplashPresenter$app_debugFactory(SplashActivityModule module,
      Provider<SplashPresenter<SplashView, SplashInteractorImp>> splashPresenterProvider) {
    this.module = module;
    this.splashPresenterProvider = splashPresenterProvider;
  }

  @Override
  public SplashPresenterImp<SplashView, SplashInteractorImp> get() {
    return provideSplashPresenter$app_debug(module, splashPresenterProvider.get());
  }

  public static SplashActivityModule_ProvideSplashPresenter$app_debugFactory create(
      SplashActivityModule module,
      Provider<SplashPresenter<SplashView, SplashInteractorImp>> splashPresenterProvider) {
    return new SplashActivityModule_ProvideSplashPresenter$app_debugFactory(module, splashPresenterProvider);
  }

  public static SplashPresenterImp<SplashView, SplashInteractorImp> provideSplashPresenter$app_debug(
      SplashActivityModule instance,
      SplashPresenter<SplashView, SplashInteractorImp> splashPresenter) {
    return Preconditions.checkNotNullFromProvides(instance.provideSplashPresenter$app_debug(splashPresenter));
  }
}
