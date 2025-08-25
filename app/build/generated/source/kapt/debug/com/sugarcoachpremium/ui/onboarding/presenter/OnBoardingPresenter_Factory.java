package com.sugarcoachpremium.ui.onboarding.presenter;

import com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp;
import com.sugarcoachpremium.ui.onboarding.view.OnBoardingView;
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
public final class OnBoardingPresenter_Factory<V extends OnBoardingView, I extends OnBoardingInteractorImp> implements Factory<OnBoardingPresenter<V, I>> {
  private final Provider<I> interactorProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> disposableProvider;

  private OnBoardingPresenter_Factory(Provider<I> interactorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> disposableProvider) {
    this.interactorProvider = interactorProvider;
    this.schedulerProvider = schedulerProvider;
    this.disposableProvider = disposableProvider;
  }

  @Override
  public OnBoardingPresenter<V, I> get() {
    return newInstance(interactorProvider.get(), schedulerProvider.get(), disposableProvider.get());
  }

  public static <V extends OnBoardingView, I extends OnBoardingInteractorImp> OnBoardingPresenter_Factory<V, I> create(
      Provider<I> interactorProvider, Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> disposableProvider) {
    return new OnBoardingPresenter_Factory<V, I>(interactorProvider, schedulerProvider, disposableProvider);
  }

  public static <V extends OnBoardingView, I extends OnBoardingInteractorImp> OnBoardingPresenter<V, I> newInstance(
      I interactor, SchedulerProvider schedulerProvider, CompositeDisposable disposable) {
    return new OnBoardingPresenter<V, I>(interactor, schedulerProvider, disposable);
  }
}
