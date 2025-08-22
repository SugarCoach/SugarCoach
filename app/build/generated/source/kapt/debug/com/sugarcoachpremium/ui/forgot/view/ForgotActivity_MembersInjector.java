package com.sugarcoachpremium.ui.forgot.view;

import com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractorImp;
import com.sugarcoachpremium.ui.forgot.presenter.ForgotPresenterImp;
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
public final class ForgotActivity_MembersInjector implements MembersInjector<ForgotActivity> {
  private final Provider<ForgotPresenterImp<ForgotView, ForgotInteractorImp>> presenterProvider;

  private ForgotActivity_MembersInjector(
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
