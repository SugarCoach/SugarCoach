package com.sugarcoachpremium.ui.main;

import com.sugarcoachpremium.ui.main.interactor.MainInteractorImp;
import com.sugarcoachpremium.ui.main.presenter.MainPresenter;
import com.sugarcoachpremium.ui.main.presenter.MainPresenterImp;
import com.sugarcoachpremium.ui.main.view.MainView;
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
public final class MainActivityModule_ProvideMainPresenter$app_debugFactory implements Factory<MainPresenterImp<MainView, MainInteractorImp>> {
  private final MainActivityModule module;

  private final Provider<MainPresenter<MainView, MainInteractorImp>> mainPresenterProvider;

  private MainActivityModule_ProvideMainPresenter$app_debugFactory(MainActivityModule module,
      Provider<MainPresenter<MainView, MainInteractorImp>> mainPresenterProvider) {
    this.module = module;
    this.mainPresenterProvider = mainPresenterProvider;
  }

  @Override
  public MainPresenterImp<MainView, MainInteractorImp> get() {
    return provideMainPresenter$app_debug(module, mainPresenterProvider.get());
  }

  public static MainActivityModule_ProvideMainPresenter$app_debugFactory create(
      MainActivityModule module,
      Provider<MainPresenter<MainView, MainInteractorImp>> mainPresenterProvider) {
    return new MainActivityModule_ProvideMainPresenter$app_debugFactory(module, mainPresenterProvider);
  }

  public static MainPresenterImp<MainView, MainInteractorImp> provideMainPresenter$app_debug(
      MainActivityModule instance, MainPresenter<MainView, MainInteractorImp> mainPresenter) {
    return Preconditions.checkNotNullFromProvides(instance.provideMainPresenter$app_debug(mainPresenter));
  }
}
