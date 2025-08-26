package com.sugarcoachpremium.ui.config;

import com.sugarcoachpremium.ui.config.interactor.ConfigInteractor;
import com.sugarcoachpremium.ui.config.interactor.ConfigInteractorImp;
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
public final class ConfigActivityModule_ProvideConfigInteractor$app_releaseFactory implements Factory<ConfigInteractorImp> {
  private final ConfigActivityModule module;

  private final Provider<ConfigInteractor> configInteractorProvider;

  public ConfigActivityModule_ProvideConfigInteractor$app_releaseFactory(
      ConfigActivityModule module, Provider<ConfigInteractor> configInteractorProvider) {
    this.module = module;
    this.configInteractorProvider = configInteractorProvider;
  }

  @Override
  public ConfigInteractorImp get() {
    return provideConfigInteractor$app_release(module, configInteractorProvider.get());
  }

  public static ConfigActivityModule_ProvideConfigInteractor$app_releaseFactory create(
      ConfigActivityModule module, Provider<ConfigInteractor> configInteractorProvider) {
    return new ConfigActivityModule_ProvideConfigInteractor$app_releaseFactory(module, configInteractorProvider);
  }

  public static ConfigInteractorImp provideConfigInteractor$app_release(
      ConfigActivityModule instance, ConfigInteractor configInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.provideConfigInteractor$app_release(configInteractor));
  }
}
