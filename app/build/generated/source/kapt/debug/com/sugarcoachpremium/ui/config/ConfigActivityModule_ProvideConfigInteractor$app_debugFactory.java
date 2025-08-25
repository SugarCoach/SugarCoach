package com.sugarcoachpremium.ui.config;

import com.sugarcoachpremium.ui.config.interactor.ConfigInteractor;
import com.sugarcoachpremium.ui.config.interactor.ConfigInteractorImp;
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
public final class ConfigActivityModule_ProvideConfigInteractor$app_debugFactory implements Factory<ConfigInteractorImp> {
  private final ConfigActivityModule module;

  private final Provider<ConfigInteractor> configInteractorProvider;

  private ConfigActivityModule_ProvideConfigInteractor$app_debugFactory(ConfigActivityModule module,
      Provider<ConfigInteractor> configInteractorProvider) {
    this.module = module;
    this.configInteractorProvider = configInteractorProvider;
  }

  @Override
  public ConfigInteractorImp get() {
    return provideConfigInteractor$app_debug(module, configInteractorProvider.get());
  }

  public static ConfigActivityModule_ProvideConfigInteractor$app_debugFactory create(
      ConfigActivityModule module, Provider<ConfigInteractor> configInteractorProvider) {
    return new ConfigActivityModule_ProvideConfigInteractor$app_debugFactory(module, configInteractorProvider);
  }

  public static ConfigInteractorImp provideConfigInteractor$app_debug(ConfigActivityModule instance,
      ConfigInteractor configInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.provideConfigInteractor$app_debug(configInteractor));
  }
}
