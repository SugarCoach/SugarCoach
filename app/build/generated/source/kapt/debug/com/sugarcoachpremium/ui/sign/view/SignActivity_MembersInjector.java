package com.sugarcoachpremium.ui.sign.view;

import com.sugarcoachpremium.ui.sign.interactor.SignInteractorImp;
import com.sugarcoachpremium.ui.sign.presenter.SignPresenterImp;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;

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
public final class SignActivity_MembersInjector implements MembersInjector<SignActivity> {
  private final Provider<SignPresenterImp<SignView, SignInteractorImp>> presenterProvider;

  private SignActivity_MembersInjector(
      Provider<SignPresenterImp<SignView, SignInteractorImp>> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<SignActivity> create(
      Provider<SignPresenterImp<SignView, SignInteractorImp>> presenterProvider) {
    return new SignActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(SignActivity instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.sign.view.SignActivity.presenter")
  public static void injectPresenter(SignActivity instance,
      SignPresenterImp<SignView, SignInteractorImp> presenter) {
    instance.presenter = presenter;
  }
}
