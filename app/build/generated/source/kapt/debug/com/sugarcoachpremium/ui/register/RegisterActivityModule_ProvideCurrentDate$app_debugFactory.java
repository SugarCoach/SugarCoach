package com.sugarcoachpremium.ui.register;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.joda.time.LocalDateTime;

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
public final class RegisterActivityModule_ProvideCurrentDate$app_debugFactory implements Factory<LocalDateTime> {
  private final RegisterActivityModule module;

  private RegisterActivityModule_ProvideCurrentDate$app_debugFactory(
      RegisterActivityModule module) {
    this.module = module;
  }

  @Override
  public LocalDateTime get() {
    return provideCurrentDate$app_debug(module);
  }

  public static RegisterActivityModule_ProvideCurrentDate$app_debugFactory create(
      RegisterActivityModule module) {
    return new RegisterActivityModule_ProvideCurrentDate$app_debugFactory(module);
  }

  public static LocalDateTime provideCurrentDate$app_debug(RegisterActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCurrentDate$app_debug());
  }
}
