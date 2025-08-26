package com.sugarcoachpremium.ui.main.view;

import com.sugarcoachpremium.data.api_db.ApiRepository;
import com.sugarcoachpremium.ui.main.interactor.MainInteractorImp;
import com.sugarcoachpremium.ui.main.presenter.MainPresenterImp;
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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<MainPresenterImp<MainView, MainInteractorImp>> presenterProvider;

  private final Provider<ApiRepository> apiRepositoryProvider;

  private MainActivity_MembersInjector(
      Provider<MainPresenterImp<MainView, MainInteractorImp>> presenterProvider,
      Provider<ApiRepository> apiRepositoryProvider) {
    this.presenterProvider = presenterProvider;
    this.apiRepositoryProvider = apiRepositoryProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<MainPresenterImp<MainView, MainInteractorImp>> presenterProvider,
      Provider<ApiRepository> apiRepositoryProvider) {
    return new MainActivity_MembersInjector(presenterProvider, apiRepositoryProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectPresenter(instance, presenterProvider.get());
    injectApiRepository(instance, apiRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.main.view.MainActivity.presenter")
  public static void injectPresenter(MainActivity instance,
      MainPresenterImp<MainView, MainInteractorImp> presenter) {
    instance.presenter = presenter;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.main.view.MainActivity.apiRepository")
  public static void injectApiRepository(MainActivity instance, ApiRepository apiRepository) {
    instance.apiRepository = apiRepository;
  }
}
