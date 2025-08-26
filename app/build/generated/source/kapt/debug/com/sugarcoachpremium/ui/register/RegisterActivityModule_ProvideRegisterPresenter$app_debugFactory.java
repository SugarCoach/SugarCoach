package com.sugarcoachpremium.ui.register;

import com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp;
import com.sugarcoachpremium.ui.register.presenter.RegisterPresenter;
import com.sugarcoachpremium.ui.register.presenter.RegisterPresenterImp;
import com.sugarcoachpremium.ui.register.view.RegisterView;
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
public final class RegisterActivityModule_ProvideRegisterPresenter$app_debugFactory implements Factory<RegisterPresenterImp<RegisterView, RegisterInteractorImp>> {
  private final RegisterActivityModule module;

  private final Provider<RegisterPresenter<RegisterView, RegisterInteractorImp>> registerPresenterProvider;

  public RegisterActivityModule_ProvideRegisterPresenter$app_debugFactory(
      RegisterActivityModule module,
      Provider<RegisterPresenter<RegisterView, RegisterInteractorImp>> registerPresenterProvider) {
    this.module = module;
    this.registerPresenterProvider = registerPresenterProvider;
  }

  @Override
  public RegisterPresenterImp<RegisterView, RegisterInteractorImp> get() {
    return provideRegisterPresenter$app_debug(module, registerPresenterProvider.get());
  }

  public static RegisterActivityModule_ProvideRegisterPresenter$app_debugFactory create(
      RegisterActivityModule module,
      Provider<RegisterPresenter<RegisterView, RegisterInteractorImp>> registerPresenterProvider) {
    return new RegisterActivityModule_ProvideRegisterPresenter$app_debugFactory(module, registerPresenterProvider);
  }

  public static RegisterPresenterImp<RegisterView, RegisterInteractorImp> provideRegisterPresenter$app_debug(
      RegisterActivityModule instance,
      RegisterPresenter<RegisterView, RegisterInteractorImp> registerPresenter) {
    return Preconditions.checkNotNullFromProvides(instance.provideRegisterPresenter$app_debug(registerPresenter));
  }
}
