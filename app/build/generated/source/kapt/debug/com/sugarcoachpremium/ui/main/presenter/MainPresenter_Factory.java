package com.sugarcoachpremium.ui.main.presenter;

import com.sugarcoachpremium.ui.main.interactor.MainInteractorImp;
import com.sugarcoachpremium.ui.main.view.MainView;
import com.sugarcoachpremium.util.SchedulerProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.reactivex.disposables.CompositeDisposable;
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
public final class MainPresenter_Factory<V extends MainView, I extends MainInteractorImp> implements Factory<MainPresenter<V, I>> {
  private final Provider<I> interactorProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> disposableProvider;

  private MainPresenter_Factory(Provider<I> interactorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> disposableProvider) {
    this.interactorProvider = interactorProvider;
    this.schedulerProvider = schedulerProvider;
    this.disposableProvider = disposableProvider;
  }

  @Override
  public MainPresenter<V, I> get() {
    return newInstance(interactorProvider.get(), schedulerProvider.get(), disposableProvider.get());
  }

  public static <V extends MainView, I extends MainInteractorImp> MainPresenter_Factory<V, I> create(
      Provider<I> interactorProvider, Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> disposableProvider) {
    return new MainPresenter_Factory<V, I>(interactorProvider, schedulerProvider, disposableProvider);
  }

  public static <V extends MainView, I extends MainInteractorImp> MainPresenter<V, I> newInstance(
      I interactor, SchedulerProvider schedulerProvider, CompositeDisposable disposable) {
    return new MainPresenter<V, I>(interactor, schedulerProvider, disposable);
  }
}
