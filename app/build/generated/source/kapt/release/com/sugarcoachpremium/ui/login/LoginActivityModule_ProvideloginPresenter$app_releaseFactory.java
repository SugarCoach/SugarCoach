package com.sugarcoachpremium.ui.login;

import com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp;
import com.sugarcoachpremium.ui.login.presenter.LoginPresenter;
import com.sugarcoachpremium.ui.login.presenter.LoginPresenterImp;
import com.sugarcoachpremium.ui.login.view.LoginView;
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
public final class LoginActivityModule_ProvideloginPresenter$app_releaseFactory implements Factory<LoginPresenterImp<LoginView, LoginInteractorImp>> {
  private final LoginActivityModule module;

  private final Provider<LoginPresenter<LoginView, LoginInteractorImp>> loginPresenterProvider;

  public LoginActivityModule_ProvideloginPresenter$app_releaseFactory(LoginActivityModule module,
      Provider<LoginPresenter<LoginView, LoginInteractorImp>> loginPresenterProvider) {
    this.module = module;
    this.loginPresenterProvider = loginPresenterProvider;
  }

  @Override
  public LoginPresenterImp<LoginView, LoginInteractorImp> get() {
    return provideloginPresenter$app_release(module, loginPresenterProvider.get());
  }

  public static LoginActivityModule_ProvideloginPresenter$app_releaseFactory create(
      LoginActivityModule module,
      Provider<LoginPresenter<LoginView, LoginInteractorImp>> loginPresenterProvider) {
    return new LoginActivityModule_ProvideloginPresenter$app_releaseFactory(module, loginPresenterProvider);
  }

  public static LoginPresenterImp<LoginView, LoginInteractorImp> provideloginPresenter$app_release(
      LoginActivityModule instance, LoginPresenter<LoginView, LoginInteractorImp> loginPresenter) {
    return Preconditions.checkNotNullFromProvides(instance.provideloginPresenter$app_release(loginPresenter));
  }
}
