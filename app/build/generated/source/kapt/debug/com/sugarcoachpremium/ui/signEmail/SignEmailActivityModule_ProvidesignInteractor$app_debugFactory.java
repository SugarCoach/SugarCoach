package com.sugarcoachpremium.ui.signEmail;

import com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractor;
import com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractorImp;
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
public final class SignEmailActivityModule_ProvidesignInteractor$app_debugFactory implements Factory<SignEmailInteractorImp> {
  private final SignEmailActivityModule module;

  private final Provider<SignEmailInteractor> signEmailInteractorProvider;

  private SignEmailActivityModule_ProvidesignInteractor$app_debugFactory(
      SignEmailActivityModule module, Provider<SignEmailInteractor> signEmailInteractorProvider) {
    this.module = module;
    this.signEmailInteractorProvider = signEmailInteractorProvider;
  }

  @Override
  public SignEmailInteractorImp get() {
    return providesignInteractor$app_debug(module, signEmailInteractorProvider.get());
  }

  public static SignEmailActivityModule_ProvidesignInteractor$app_debugFactory create(
      SignEmailActivityModule module, Provider<SignEmailInteractor> signEmailInteractorProvider) {
    return new SignEmailActivityModule_ProvidesignInteractor$app_debugFactory(module, signEmailInteractorProvider);
  }

  public static SignEmailInteractorImp providesignInteractor$app_debug(
      SignEmailActivityModule instance, SignEmailInteractor signEmailInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.providesignInteractor$app_debug(signEmailInteractor));
  }
}
