package com.sugarcoachpremium.ui.login.view;

import com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp;
import com.sugarcoachpremium.ui.login.presenter.LoginPresenterImp;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<LoginPresenterImp<LoginView, LoginInteractorImp>> presenterProvider;

  public LoginActivity_MembersInjector(
      Provider<LoginPresenterImp<LoginView, LoginInteractorImp>> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<LoginPresenterImp<LoginView, LoginInteractorImp>> presenterProvider) {
    return new LoginActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.login.view.LoginActivity.presenter")
  public static void injectPresenter(LoginActivity instance,
      LoginPresenterImp<LoginView, LoginInteractorImp> presenter) {
    instance.presenter = presenter;
  }
}
