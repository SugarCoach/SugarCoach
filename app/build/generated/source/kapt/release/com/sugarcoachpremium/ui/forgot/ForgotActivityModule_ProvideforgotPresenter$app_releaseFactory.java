package com.sugarcoachpremium.ui.forgot;

import com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractorImp;
import com.sugarcoachpremium.ui.forgot.presenter.ForgotPresenter;
import com.sugarcoachpremium.ui.forgot.presenter.ForgotPresenterImp;
import com.sugarcoachpremium.ui.forgot.view.ForgotView;
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
public final class ForgotActivityModule_ProvideforgotPresenter$app_releaseFactory implements Factory<ForgotPresenterImp<ForgotView, ForgotInteractorImp>> {
  private final ForgotActivityModule module;

  private final Provider<ForgotPresenter<ForgotView, ForgotInteractorImp>> forgotPresenterProvider;

  public ForgotActivityModule_ProvideforgotPresenter$app_releaseFactory(ForgotActivityModule module,
      Provider<ForgotPresenter<ForgotView, ForgotInteractorImp>> forgotPresenterProvider) {
    this.module = module;
    this.forgotPresenterProvider = forgotPresenterProvider;
  }

  @Override
  public ForgotPresenterImp<ForgotView, ForgotInteractorImp> get() {
    return provideforgotPresenter$app_release(module, forgotPresenterProvider.get());
  }

  public static ForgotActivityModule_ProvideforgotPresenter$app_releaseFactory create(
      ForgotActivityModule module,
      Provider<ForgotPresenter<ForgotView, ForgotInteractorImp>> forgotPresenterProvider) {
    return new ForgotActivityModule_ProvideforgotPresenter$app_releaseFactory(module, forgotPresenterProvider);
  }

  public static ForgotPresenterImp<ForgotView, ForgotInteractorImp> provideforgotPresenter$app_release(
      ForgotActivityModule instance,
      ForgotPresenter<ForgotView, ForgotInteractorImp> forgotPresenter) {
    return Preconditions.checkNotNullFromProvides(instance.provideforgotPresenter$app_release(forgotPresenter));
  }
}
