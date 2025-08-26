package com.sugarcoachpremium.di.module;

import android.app.Application;
import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideContext$app_releaseFactory implements Factory<Context> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvideContext$app_releaseFactory(AppModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Context get() {
    return provideContext$app_release(module, applicationProvider.get());
  }

  public static AppModule_ProvideContext$app_releaseFactory create(AppModule module,
      Provider<Application> applicationProvider) {
    return new AppModule_ProvideContext$app_releaseFactory(module, applicationProvider);
  }

  public static Context provideContext$app_release(AppModule instance, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.provideContext$app_release(application));
  }
}
