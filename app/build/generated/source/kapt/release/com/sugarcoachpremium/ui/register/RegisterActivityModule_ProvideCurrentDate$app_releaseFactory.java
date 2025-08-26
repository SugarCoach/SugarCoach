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
    "KotlinInternalInJava"
})
public final class RegisterActivityModule_ProvideCurrentDate$app_releaseFactory implements Factory<LocalDateTime> {
  private final RegisterActivityModule module;

  public RegisterActivityModule_ProvideCurrentDate$app_releaseFactory(
      RegisterActivityModule module) {
    this.module = module;
  }

  @Override
  public LocalDateTime get() {
    return provideCurrentDate$app_release(module);
  }

  public static RegisterActivityModule_ProvideCurrentDate$app_releaseFactory create(
      RegisterActivityModule module) {
    return new RegisterActivityModule_ProvideCurrentDate$app_releaseFactory(module);
  }

  public static LocalDateTime provideCurrentDate$app_release(RegisterActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCurrentDate$app_release());
  }
}
