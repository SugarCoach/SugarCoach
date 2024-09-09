package com.sugarcoachpremium.ui.main;

import com.sugarcoachpremium.ui.main.interactor.MainInteractor;
import com.sugarcoachpremium.ui.main.interactor.MainInteractorImp;
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
public final class MainActivityModule_ProvideMainInteractor$app_releaseFactory implements Factory<MainInteractorImp> {
  private final MainActivityModule module;

  private final Provider<MainInteractor> mainInteractorProvider;

  public MainActivityModule_ProvideMainInteractor$app_releaseFactory(MainActivityModule module,
      Provider<MainInteractor> mainInteractorProvider) {
    this.module = module;
    this.mainInteractorProvider = mainInteractorProvider;
  }

  @Override
  public MainInteractorImp get() {
    return provideMainInteractor$app_release(module, mainInteractorProvider.get());
  }

  public static MainActivityModule_ProvideMainInteractor$app_releaseFactory create(
      MainActivityModule module, Provider<MainInteractor> mainInteractorProvider) {
    return new MainActivityModule_ProvideMainInteractor$app_releaseFactory(module, mainInteractorProvider);
  }

  public static MainInteractorImp provideMainInteractor$app_release(MainActivityModule instance,
      MainInteractor mainInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.provideMainInteractor$app_release(mainInteractor));
  }
}
