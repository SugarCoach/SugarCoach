package com.sugarcoachpremium.ui.daily;

import com.sugarcoachpremium.ui.daily.interactor.DailyInteractor;
import com.sugarcoachpremium.ui.daily.interactor.DailyInteractorImp;
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
public final class DailyActivityModule_ProvideDailyInteractor$app_debugFactory implements Factory<DailyInteractorImp> {
  private final DailyActivityModule module;

  private final Provider<DailyInteractor> dailyInteractorProvider;

  private DailyActivityModule_ProvideDailyInteractor$app_debugFactory(DailyActivityModule module,
      Provider<DailyInteractor> dailyInteractorProvider) {
    this.module = module;
    this.dailyInteractorProvider = dailyInteractorProvider;
  }

  @Override
  public DailyInteractorImp get() {
    return provideDailyInteractor$app_debug(module, dailyInteractorProvider.get());
  }

  public static DailyActivityModule_ProvideDailyInteractor$app_debugFactory create(
      DailyActivityModule module, Provider<DailyInteractor> dailyInteractorProvider) {
    return new DailyActivityModule_ProvideDailyInteractor$app_debugFactory(module, dailyInteractorProvider);
  }

  public static DailyInteractorImp provideDailyInteractor$app_debug(DailyActivityModule instance,
      DailyInteractor dailyInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.provideDailyInteractor$app_debug(dailyInteractor));
  }
}
