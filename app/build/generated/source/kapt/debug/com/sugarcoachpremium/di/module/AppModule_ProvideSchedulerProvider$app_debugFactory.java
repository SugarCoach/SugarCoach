package com.sugarcoachpremium.di.module;

import com.sugarcoachpremium.util.SchedulerProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideSchedulerProvider$app_debugFactory implements Factory<SchedulerProvider> {
  private final AppModule module;

  private AppModule_ProvideSchedulerProvider$app_debugFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public SchedulerProvider get() {
    return provideSchedulerProvider$app_debug(module);
  }

  public static AppModule_ProvideSchedulerProvider$app_debugFactory create(AppModule module) {
    return new AppModule_ProvideSchedulerProvider$app_debugFactory(module);
  }

  public static SchedulerProvider provideSchedulerProvider$app_debug(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideSchedulerProvider$app_debug());
  }
}
