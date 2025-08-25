package com.sugarcoachpremium.ui.main;

import com.sugarcoachpremium.ui.main.interactor.MainInteractor;
import com.sugarcoachpremium.ui.main.interactor.MainInteractorImp;
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
public final class MainActivityModule_ProvideMainInteractor$app_debugFactory implements Factory<MainInteractorImp> {
  private final MainActivityModule module;

  private final Provider<MainInteractor> mainInteractorProvider;

  private MainActivityModule_ProvideMainInteractor$app_debugFactory(MainActivityModule module,
      Provider<MainInteractor> mainInteractorProvider) {
    this.module = module;
    this.mainInteractorProvider = mainInteractorProvider;
  }

  @Override
  public MainInteractorImp get() {
    return provideMainInteractor$app_debug(module, mainInteractorProvider.get());
  }

  public static MainActivityModule_ProvideMainInteractor$app_debugFactory create(
      MainActivityModule module, Provider<MainInteractor> mainInteractorProvider) {
    return new MainActivityModule_ProvideMainInteractor$app_debugFactory(module, mainInteractorProvider);
  }

  public static MainInteractorImp provideMainInteractor$app_debug(MainActivityModule instance,
      MainInteractor mainInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.provideMainInteractor$app_debug(mainInteractor));
  }
}
