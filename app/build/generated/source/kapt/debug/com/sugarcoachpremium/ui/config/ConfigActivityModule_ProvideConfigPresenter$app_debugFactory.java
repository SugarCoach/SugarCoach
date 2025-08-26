package com.sugarcoachpremium.ui.config;

import com.sugarcoachpremium.ui.config.interactor.ConfigInteractorImp;
import com.sugarcoachpremium.ui.config.presenter.ConfigPresenter;
import com.sugarcoachpremium.ui.config.presenter.ConfigPresenterImp;
import com.sugarcoachpremium.ui.config.view.ConfigView;
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
public final class ConfigActivityModule_ProvideConfigPresenter$app_debugFactory implements Factory<ConfigPresenterImp<ConfigView, ConfigInteractorImp>> {
  private final ConfigActivityModule module;

  private final Provider<ConfigPresenter<ConfigView, ConfigInteractorImp>> configPresenterProvider;

  public ConfigActivityModule_ProvideConfigPresenter$app_debugFactory(ConfigActivityModule module,
      Provider<ConfigPresenter<ConfigView, ConfigInteractorImp>> configPresenterProvider) {
    this.module = module;
    this.configPresenterProvider = configPresenterProvider;
  }

  @Override
  public ConfigPresenterImp<ConfigView, ConfigInteractorImp> get() {
    return provideConfigPresenter$app_debug(module, configPresenterProvider.get());
  }

  public static ConfigActivityModule_ProvideConfigPresenter$app_debugFactory create(
      ConfigActivityModule module,
      Provider<ConfigPresenter<ConfigView, ConfigInteractorImp>> configPresenterProvider) {
    return new ConfigActivityModule_ProvideConfigPresenter$app_debugFactory(module, configPresenterProvider);
  }

  public static ConfigPresenterImp<ConfigView, ConfigInteractorImp> provideConfigPresenter$app_debug(
      ConfigActivityModule instance,
      ConfigPresenter<ConfigView, ConfigInteractorImp> configPresenter) {
    return Preconditions.checkNotNullFromProvides(instance.provideConfigPresenter$app_debug(configPresenter));
  }
}
