package com.sugarcoachpremium.ui.register.presenter;

import com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp;
import com.sugarcoachpremium.ui.register.view.RegisterView;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import org.joda.time.LocalDateTime;

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
public final class RegisterPresenter_MembersInjector<V extends RegisterView, I extends RegisterInteractorImp> implements MembersInjector<RegisterPresenter<V, I>> {
  private final Provider<LocalDateTime> dateProvider;

  private RegisterPresenter_MembersInjector(Provider<LocalDateTime> dateProvider) {
    this.dateProvider = dateProvider;
  }

  public static <V extends RegisterView, I extends RegisterInteractorImp> MembersInjector<RegisterPresenter<V, I>> create(
      Provider<LocalDateTime> dateProvider) {
    return new RegisterPresenter_MembersInjector<V, I>(dateProvider);
  }

  @Override
  public void injectMembers(RegisterPresenter<V, I> instance) {
    injectDate(instance, dateProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.register.presenter.RegisterPresenter.date")
  public static <V extends RegisterView, I extends RegisterInteractorImp> void injectDate(
      RegisterPresenter<V, I> instance, LocalDateTime date) {
    instance.date = date;
  }
}
