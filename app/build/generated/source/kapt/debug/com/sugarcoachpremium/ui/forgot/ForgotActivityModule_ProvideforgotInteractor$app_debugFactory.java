package com.sugarcoachpremium.ui.forgot;

import com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractor;
import com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractorImp;
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
public final class ForgotActivityModule_ProvideforgotInteractor$app_debugFactory implements Factory<ForgotInteractorImp> {
  private final ForgotActivityModule module;

  private final Provider<ForgotInteractor> forgotInteractorProvider;

  private ForgotActivityModule_ProvideforgotInteractor$app_debugFactory(ForgotActivityModule module,
      Provider<ForgotInteractor> forgotInteractorProvider) {
    this.module = module;
    this.forgotInteractorProvider = forgotInteractorProvider;
  }

  @Override
  public ForgotInteractorImp get() {
    return provideforgotInteractor$app_debug(module, forgotInteractorProvider.get());
  }

  public static ForgotActivityModule_ProvideforgotInteractor$app_debugFactory create(
      ForgotActivityModule module, Provider<ForgotInteractor> forgotInteractorProvider) {
    return new ForgotActivityModule_ProvideforgotInteractor$app_debugFactory(module, forgotInteractorProvider);
  }

  public static ForgotInteractorImp provideforgotInteractor$app_debug(ForgotActivityModule instance,
      ForgotInteractor forgotInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.provideforgotInteractor$app_debug(forgotInteractor));
  }
}
