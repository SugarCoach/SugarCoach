package com.sugarcoachpremium.ui.login;

import com.sugarcoachpremium.ui.login.interactor.LoginInteractor;
import com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp;
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
public final class LoginActivityModule_ProvideloginInteractor$app_debugFactory implements Factory<LoginInteractorImp> {
  private final LoginActivityModule module;

  private final Provider<LoginInteractor> loginInteractorProvider;

  public LoginActivityModule_ProvideloginInteractor$app_debugFactory(LoginActivityModule module,
      Provider<LoginInteractor> loginInteractorProvider) {
    this.module = module;
    this.loginInteractorProvider = loginInteractorProvider;
  }

  @Override
  public LoginInteractorImp get() {
    return provideloginInteractor$app_debug(module, loginInteractorProvider.get());
  }

  public static LoginActivityModule_ProvideloginInteractor$app_debugFactory create(
      LoginActivityModule module, Provider<LoginInteractor> loginInteractorProvider) {
    return new LoginActivityModule_ProvideloginInteractor$app_debugFactory(module, loginInteractorProvider);
  }

  public static LoginInteractorImp provideloginInteractor$app_debug(LoginActivityModule instance,
      LoginInteractor loginInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.provideloginInteractor$app_debug(loginInteractor));
  }
}
