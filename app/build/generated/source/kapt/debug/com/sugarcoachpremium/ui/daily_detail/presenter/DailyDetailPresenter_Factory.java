package com.sugarcoachpremium.ui.daily_detail.presenter;

import com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp;
import com.sugarcoachpremium.ui.daily_detail.view.DailyDetailView;
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
public final class DailyDetailPresenter_Factory<V extends DailyDetailView, I extends DailyDetailInteractorImp> implements Factory<DailyDetailPresenter<V, I>> {
  private final Provider<I> interactorProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> disposableProvider;

  private DailyDetailPresenter_Factory(Provider<I> interactorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> disposableProvider) {
    this.interactorProvider = interactorProvider;
    this.schedulerProvider = schedulerProvider;
    this.disposableProvider = disposableProvider;
  }

  @Override
  public DailyDetailPresenter<V, I> get() {
    return newInstance(interactorProvider.get(), schedulerProvider.get(), disposableProvider.get());
  }

  public static <V extends DailyDetailView, I extends DailyDetailInteractorImp> DailyDetailPresenter_Factory<V, I> create(
      Provider<I> interactorProvider, Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> disposableProvider) {
    return new DailyDetailPresenter_Factory<V, I>(interactorProvider, schedulerProvider, disposableProvider);
  }

  public static <V extends DailyDetailView, I extends DailyDetailInteractorImp> DailyDetailPresenter<V, I> newInstance(
      I interactor, SchedulerProvider schedulerProvider, CompositeDisposable disposable) {
    return new DailyDetailPresenter<V, I>(interactor, schedulerProvider, disposable);
  }
}
