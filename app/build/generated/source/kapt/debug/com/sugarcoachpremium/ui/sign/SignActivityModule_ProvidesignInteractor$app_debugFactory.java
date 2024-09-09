package com.sugarcoachpremium.ui.sign;

import com.sugarcoachpremium.ui.sign.interactor.SignInteractor;
import com.sugarcoachpremium.ui.sign.interactor.SignInteractorImp;
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
public final class SignActivityModule_ProvidesignInteractor$app_debugFactory implements Factory<SignInteractorImp> {
  private final SignActivityModule module;

  private final Provider<SignInteractor> signInteractorProvider;

  public SignActivityModule_ProvidesignInteractor$app_debugFactory(SignActivityModule module,
      Provider<SignInteractor> signInteractorProvider) {
    this.module = module;
    this.signInteractorProvider = signInteractorProvider;
  }

  @Override
  public SignInteractorImp get() {
    return providesignInteractor$app_debug(module, signInteractorProvider.get());
  }

  public static SignActivityModule_ProvidesignInteractor$app_debugFactory create(
      SignActivityModule module, Provider<SignInteractor> signInteractorProvider) {
    return new SignActivityModule_ProvidesignInteractor$app_debugFactory(module, signInteractorProvider);
  }

  public static SignInteractorImp providesignInteractor$app_debug(SignActivityModule instance,
      SignInteractor signInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.providesignInteractor$app_debug(signInteractor));
  }
}
