package com.sugarcoachpremium.ui.forgot.view;

import com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractorImp;
import com.sugarcoachpremium.ui.forgot.presenter.ForgotPresenterImp;
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
public final class ForgotActivity_MembersInjector implements MembersInjector<ForgotActivity> {
  private final Provider<ForgotPresenterImp<ForgotView, ForgotInteractorImp>> presenterProvider;

  public ForgotActivity_MembersInjector(
      Provider<ForgotPresenterImp<ForgotView, ForgotInteractorImp>> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<ForgotActivity> create(
      Provider<ForgotPresenterImp<ForgotView, ForgotInteractorImp>> presenterProvider) {
    return new ForgotActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(ForgotActivity instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.forgot.view.ForgotActivity.presenter")
  public static void injectPresenter(ForgotActivity instance,
      ForgotPresenterImp<ForgotView, ForgotInteractorImp> presenter) {
    instance.presenter = presenter;
  }
}
