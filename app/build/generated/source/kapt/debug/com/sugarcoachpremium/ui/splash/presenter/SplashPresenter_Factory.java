package com.sugarcoachpremium.ui.splash.presenter;

import com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp;
import com.sugarcoachpremium.ui.splash.view.SplashView;
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
public final class SplashPresenter_Factory<V extends SplashView, I extends SplashInteractorImp> implements Factory<SplashPresenter<V, I>> {
  private final Provider<I> interactorProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> disposableProvider;

  private SplashPresenter_Factory(Provider<I> interactorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> disposableProvider) {
    this.interactorProvider = interactorProvider;
    this.schedulerProvider = schedulerProvider;
    this.disposableProvider = disposableProvider;
  }

  @Override
  public SplashPresenter<V, I> get() {
    return newInstance(interactorProvider.get(), schedulerProvider.get(), disposableProvider.get());
  }

  public static <V extends SplashView, I extends SplashInteractorImp> SplashPresenter_Factory<V, I> create(
      Provider<I> interactorProvider, Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> disposableProvider) {
    return new SplashPresenter_Factory<V, I>(interactorProvider, schedulerProvider, disposableProvider);
  }

  public static <V extends SplashView, I extends SplashInteractorImp> SplashPresenter<V, I> newInstance(
      I interactor, SchedulerProvider schedulerProvider, CompositeDisposable disposable) {
    return new SplashPresenter<V, I>(interactor, schedulerProvider, disposable);
  }
}
