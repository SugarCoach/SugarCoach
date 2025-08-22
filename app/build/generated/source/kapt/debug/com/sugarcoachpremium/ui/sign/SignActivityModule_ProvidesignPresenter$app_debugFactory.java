package com.sugarcoachpremium.ui.sign;

import com.sugarcoachpremium.ui.sign.interactor.SignInteractorImp;
import com.sugarcoachpremium.ui.sign.presenter.SignPresenter;
import com.sugarcoachpremium.ui.sign.presenter.SignPresenterImp;
import com.sugarcoachpremium.ui.sign.view.SignView;
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
public final class SignActivityModule_ProvidesignPresenter$app_debugFactory implements Factory<SignPresenterImp<SignView, SignInteractorImp>> {
  private final SignActivityModule module;

  private final Provider<SignPresenter<SignView, SignInteractorImp>> signPresenterProvider;

  private SignActivityModule_ProvidesignPresenter$app_debugFactory(SignActivityModule module,
      Provider<SignPresenter<SignView, SignInteractorImp>> signPresenterProvider) {
    this.module = module;
    this.signPresenterProvider = signPresenterProvider;
  }

  @Override
  public SignPresenterImp<SignView, SignInteractorImp> get() {
    return providesignPresenter$app_debug(module, signPresenterProvider.get());
  }

  public static SignActivityModule_ProvidesignPresenter$app_debugFactory create(
      SignActivityModule module,
      Provider<SignPresenter<SignView, SignInteractorImp>> signPresenterProvider) {
    return new SignActivityModule_ProvidesignPresenter$app_debugFactory(module, signPresenterProvider);
  }

  public static SignPresenterImp<SignView, SignInteractorImp> providesignPresenter$app_debug(
      SignActivityModule instance, SignPresenter<SignView, SignInteractorImp> signPresenter) {
    return Preconditions.checkNotNullFromProvides(instance.providesignPresenter$app_debug(signPresenter));
  }
}
