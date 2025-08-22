package com.sugarcoachpremium.ui.register;

import com.sugarcoachpremium.ui.register.interactor.RegisterInteractor;
import com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp;
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
public final class RegisterActivityModule_ProvideRegisterInteractor$app_debugFactory implements Factory<RegisterInteractorImp> {
  private final RegisterActivityModule module;

  private final Provider<RegisterInteractor> registerInteractorProvider;

  private RegisterActivityModule_ProvideRegisterInteractor$app_debugFactory(
      RegisterActivityModule module, Provider<RegisterInteractor> registerInteractorProvider) {
    this.module = module;
    this.registerInteractorProvider = registerInteractorProvider;
  }

  @Override
  public RegisterInteractorImp get() {
    return provideRegisterInteractor$app_debug(module, registerInteractorProvider.get());
  }

  public static RegisterActivityModule_ProvideRegisterInteractor$app_debugFactory create(
      RegisterActivityModule module, Provider<RegisterInteractor> registerInteractorProvider) {
    return new RegisterActivityModule_ProvideRegisterInteractor$app_debugFactory(module, registerInteractorProvider);
  }

  public static RegisterInteractorImp provideRegisterInteractor$app_debug(
      RegisterActivityModule instance, RegisterInteractor registerInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.provideRegisterInteractor$app_debug(registerInteractor));
  }
}
