package com.sugarcoachpremium.ui.config.view;

import com.sugarcoachpremium.ui.config.interactor.ConfigInteractorImp;
import com.sugarcoachpremium.ui.config.presenter.ConfigPresenterImp;
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
public final class ConfigActivity_MembersInjector implements MembersInjector<ConfigActivity> {
  private final Provider<ConfigPresenterImp<ConfigView, ConfigInteractorImp>> presenterProvider;

  private ConfigActivity_MembersInjector(
      Provider<ConfigPresenterImp<ConfigView, ConfigInteractorImp>> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<ConfigActivity> create(
      Provider<ConfigPresenterImp<ConfigView, ConfigInteractorImp>> presenterProvider) {
    return new ConfigActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(ConfigActivity instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.config.view.ConfigActivity.presenter")
  public static void injectPresenter(ConfigActivity instance,
      ConfigPresenterImp<ConfigView, ConfigInteractorImp> presenter) {
    instance.presenter = presenter;
  }
}
