package com.sugarcoachpremium.ui.forgot.presenter;

import com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractorImp;
import com.sugarcoachpremium.ui.forgot.view.ForgotView;
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
public final class ForgotPresenter_Factory<V extends ForgotView, I extends ForgotInteractorImp> implements Factory<ForgotPresenter<V, I>> {
  private final Provider<I> interactorProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> disposableProvider;

  private ForgotPresenter_Factory(Provider<I> interactorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> disposableProvider) {
    this.interactorProvider = interactorProvider;
    this.schedulerProvider = schedulerProvider;
    this.disposableProvider = disposableProvider;
  }

  @Override
  public ForgotPresenter<V, I> get() {
    return newInstance(interactorProvider.get(), schedulerProvider.get(), disposableProvider.get());
  }

  public static <V extends ForgotView, I extends ForgotInteractorImp> ForgotPresenter_Factory<V, I> create(
      Provider<I> interactorProvider, Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> disposableProvider) {
    return new ForgotPresenter_Factory<V, I>(interactorProvider, schedulerProvider, disposableProvider);
  }

  public static <V extends ForgotView, I extends ForgotInteractorImp> ForgotPresenter<V, I> newInstance(
      I interactor, SchedulerProvider schedulerProvider, CompositeDisposable disposable) {
    return new ForgotPresenter<V, I>(interactor, schedulerProvider, disposable);
  }
}
