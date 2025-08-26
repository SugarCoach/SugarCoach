package com.sugarcoachpremium.ui.sign;

import com.sugarcoachpremium.ui.sign.interactor.SignInteractorImp;
import com.sugarcoachpremium.ui.sign.presenter.SignPresenter;
import com.sugarcoachpremium.ui.sign.presenter.SignPresenterImp;
import com.sugarcoachpremium.ui.sign.view.SignView;
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
public final class SignActivityModule_ProvidesignPresenter$app_releaseFactory implements Factory<SignPresenterImp<SignView, SignInteractorImp>> {
  private final SignActivityModule module;

  private final Provider<SignPresenter<SignView, SignInteractorImp>> signPresenterProvider;

  public SignActivityModule_ProvidesignPresenter$app_releaseFactory(SignActivityModule module,
      Provider<SignPresenter<SignView, SignInteractorImp>> signPresenterProvider) {
    this.module = module;
    this.signPresenterProvider = signPresenterProvider;
  }

  @Override
  public SignPresenterImp<SignView, SignInteractorImp> get() {
    return providesignPresenter$app_release(module, signPresenterProvider.get());
  }

  public static SignActivityModule_ProvidesignPresenter$app_releaseFactory create(
      SignActivityModule module,
      Provider<SignPresenter<SignView, SignInteractorImp>> signPresenterProvider) {
    return new SignActivityModule_ProvidesignPresenter$app_releaseFactory(module, signPresenterProvider);
  }

  public static SignPresenterImp<SignView, SignInteractorImp> providesignPresenter$app_release(
      SignActivityModule instance, SignPresenter<SignView, SignInteractorImp> signPresenter) {
    return Preconditions.checkNotNullFromProvides(instance.providesignPresenter$app_release(signPresenter));
  }
}
