package com.sugarcoachpremium.ui.signEmail.view;

import com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractorImp;
import com.sugarcoachpremium.ui.signEmail.presenter.SignEmailPresenterImp;
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
public final class SignEmailActivity_MembersInjector implements MembersInjector<SignEmailActivity> {
  private final Provider<SignEmailPresenterImp<SignEmailView, SignEmailInteractorImp>> presenterProvider;

  public SignEmailActivity_MembersInjector(
      Provider<SignEmailPresenterImp<SignEmailView, SignEmailInteractorImp>> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<SignEmailActivity> create(
      Provider<SignEmailPresenterImp<SignEmailView, SignEmailInteractorImp>> presenterProvider) {
    return new SignEmailActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(SignEmailActivity instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.signEmail.view.SignEmailActivity.presenter")
  public static void injectPresenter(SignEmailActivity instance,
      SignEmailPresenterImp<SignEmailView, SignEmailInteractorImp> presenter) {
    instance.presenter = presenter;
  }
}
