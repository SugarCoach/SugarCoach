package com.sugarcoachpremium.ui.forgot;

import com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractorImp;
import com.sugarcoachpremium.ui.forgot.presenter.ForgotPresenter;
import com.sugarcoachpremium.ui.forgot.presenter.ForgotPresenterImp;
import com.sugarcoachpremium.ui.forgot.view.ForgotView;
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
public final class ForgotActivityModule_ProvideforgotPresenter$app_debugFactory implements Factory<ForgotPresenterImp<ForgotView, ForgotInteractorImp>> {
  private final ForgotActivityModule module;

  private final Provider<ForgotPresenter<ForgotView, ForgotInteractorImp>> forgotPresenterProvider;

  private ForgotActivityModule_ProvideforgotPresenter$app_debugFactory(ForgotActivityModule module,
      Provider<ForgotPresenter<ForgotView, ForgotInteractorImp>> forgotPresenterProvider) {
    this.module = module;
    this.forgotPresenterProvider = forgotPresenterProvider;
  }

  @Override
  public ForgotPresenterImp<ForgotView, ForgotInteractorImp> get() {
    return provideforgotPresenter$app_debug(module, forgotPresenterProvider.get());
  }

  public static ForgotActivityModule_ProvideforgotPresenter$app_debugFactory create(
      ForgotActivityModule module,
      Provider<ForgotPresenter<ForgotView, ForgotInteractorImp>> forgotPresenterProvider) {
    return new ForgotActivityModule_ProvideforgotPresenter$app_debugFactory(module, forgotPresenterProvider);
  }

  public static ForgotPresenterImp<ForgotView, ForgotInteractorImp> provideforgotPresenter$app_debug(
      ForgotActivityModule instance,
      ForgotPresenter<ForgotView, ForgotInteractorImp> forgotPresenter) {
    return Preconditions.checkNotNullFromProvides(instance.provideforgotPresenter$app_debug(forgotPresenter));
  }
}
