package com.sugarcoachpremium.ui.register.presenter;

import com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp;
import com.sugarcoachpremium.ui.register.view.RegisterView;
import com.sugarcoachpremium.util.SchedulerProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.joda.time.LocalDateTime;

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
public final class RegisterPresenter_Factory<V extends RegisterView, I extends RegisterInteractorImp> implements Factory<RegisterPresenter<V, I>> {
  private final Provider<I> interactorProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> disposableProvider;

  private final Provider<LocalDateTime> dateProvider;

  public RegisterPresenter_Factory(Provider<I> interactorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> disposableProvider, Provider<LocalDateTime> dateProvider) {
    this.interactorProvider = interactorProvider;
    this.schedulerProvider = schedulerProvider;
    this.disposableProvider = disposableProvider;
    this.dateProvider = dateProvider;
  }

  @Override
  public RegisterPresenter<V, I> get() {
    RegisterPresenter<V, I> instance = newInstance(interactorProvider.get(), schedulerProvider.get(), disposableProvider.get());
    RegisterPresenter_MembersInjector.injectDate(instance, dateProvider.get());
    return instance;
  }

  public static <V extends RegisterView, I extends RegisterInteractorImp> RegisterPresenter_Factory<V, I> create(
      Provider<I> interactorProvider, Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> disposableProvider, Provider<LocalDateTime> dateProvider) {
    return new RegisterPresenter_Factory<V, I>(interactorProvider, schedulerProvider, disposableProvider, dateProvider);
  }

  public static <V extends RegisterView, I extends RegisterInteractorImp> RegisterPresenter<V, I> newInstance(
      I interactor, SchedulerProvider schedulerProvider, CompositeDisposable disposable) {
    return new RegisterPresenter<V, I>(interactor, schedulerProvider, disposable);
  }
}
