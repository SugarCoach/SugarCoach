package com.sugarcoachpremium.ui.signEmail;

import com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractorImp;
import com.sugarcoachpremium.ui.signEmail.presenter.SignEmailPresenter;
import com.sugarcoachpremium.ui.signEmail.presenter.SignEmailPresenterImp;
import com.sugarcoachpremium.ui.signEmail.view.SignEmailView;
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
public final class SignEmailActivityModule_ProvidesignPresenter$app_debugFactory implements Factory<SignEmailPresenterImp<SignEmailView, SignEmailInteractorImp>> {
  private final SignEmailActivityModule module;

  private final Provider<SignEmailPresenter<SignEmailView, SignEmailInteractorImp>> signEmailPresenterProvider;

  public SignEmailActivityModule_ProvidesignPresenter$app_debugFactory(
      SignEmailActivityModule module,
      Provider<SignEmailPresenter<SignEmailView, SignEmailInteractorImp>> signEmailPresenterProvider) {
    this.module = module;
    this.signEmailPresenterProvider = signEmailPresenterProvider;
  }

  @Override
  public SignEmailPresenterImp<SignEmailView, SignEmailInteractorImp> get() {
    return providesignPresenter$app_debug(module, signEmailPresenterProvider.get());
  }

  public static SignEmailActivityModule_ProvidesignPresenter$app_debugFactory create(
      SignEmailActivityModule module,
      Provider<SignEmailPresenter<SignEmailView, SignEmailInteractorImp>> signEmailPresenterProvider) {
    return new SignEmailActivityModule_ProvidesignPresenter$app_debugFactory(module, signEmailPresenterProvider);
  }

  public static SignEmailPresenterImp<SignEmailView, SignEmailInteractorImp> providesignPresenter$app_debug(
      SignEmailActivityModule instance,
      SignEmailPresenter<SignEmailView, SignEmailInteractorImp> signEmailPresenter) {
    return Preconditions.checkNotNullFromProvides(instance.providesignPresenter$app_debug(signEmailPresenter));
  }
}
