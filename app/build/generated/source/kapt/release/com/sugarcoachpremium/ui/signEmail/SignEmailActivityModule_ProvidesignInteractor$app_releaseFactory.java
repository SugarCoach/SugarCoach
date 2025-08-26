package com.sugarcoachpremium.ui.signEmail;

import com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractor;
import com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractorImp;
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
public final class SignEmailActivityModule_ProvidesignInteractor$app_releaseFactory implements Factory<SignEmailInteractorImp> {
  private final SignEmailActivityModule module;

  private final Provider<SignEmailInteractor> signEmailInteractorProvider;

  public SignEmailActivityModule_ProvidesignInteractor$app_releaseFactory(
      SignEmailActivityModule module, Provider<SignEmailInteractor> signEmailInteractorProvider) {
    this.module = module;
    this.signEmailInteractorProvider = signEmailInteractorProvider;
  }

  @Override
  public SignEmailInteractorImp get() {
    return providesignInteractor$app_release(module, signEmailInteractorProvider.get());
  }

  public static SignEmailActivityModule_ProvidesignInteractor$app_releaseFactory create(
      SignEmailActivityModule module, Provider<SignEmailInteractor> signEmailInteractorProvider) {
    return new SignEmailActivityModule_ProvidesignInteractor$app_releaseFactory(module, signEmailInteractorProvider);
  }

  public static SignEmailInteractorImp providesignInteractor$app_release(
      SignEmailActivityModule instance, SignEmailInteractor signEmailInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.providesignInteractor$app_release(signEmailInteractor));
  }
}
