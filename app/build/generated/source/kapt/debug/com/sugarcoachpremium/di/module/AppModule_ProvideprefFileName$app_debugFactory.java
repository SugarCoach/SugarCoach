package com.sugarcoachpremium.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata("com.sugarcoachpremium.di.PreferenceInfo")
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
public final class AppModule_ProvideprefFileName$app_debugFactory implements Factory<String> {
  private final AppModule module;

  public AppModule_ProvideprefFileName$app_debugFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideprefFileName$app_debug(module);
  }

  public static AppModule_ProvideprefFileName$app_debugFactory create(AppModule module) {
    return new AppModule_ProvideprefFileName$app_debugFactory(module);
  }

  public static String provideprefFileName$app_debug(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideprefFileName$app_debug());
  }
}
