package com.sugarcoachpremium.ui.daily;

import com.sugarcoachpremium.ui.daily.interactor.DailyInteractor;
import com.sugarcoachpremium.ui.daily.interactor.DailyInteractorImp;
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
public final class DailyActivityModule_ProvideDailyInteractor$app_releaseFactory implements Factory<DailyInteractorImp> {
  private final DailyActivityModule module;

  private final Provider<DailyInteractor> dailyInteractorProvider;

  public DailyActivityModule_ProvideDailyInteractor$app_releaseFactory(DailyActivityModule module,
      Provider<DailyInteractor> dailyInteractorProvider) {
    this.module = module;
    this.dailyInteractorProvider = dailyInteractorProvider;
  }

  @Override
  public DailyInteractorImp get() {
    return provideDailyInteractor$app_release(module, dailyInteractorProvider.get());
  }

  public static DailyActivityModule_ProvideDailyInteractor$app_releaseFactory create(
      DailyActivityModule module, Provider<DailyInteractor> dailyInteractorProvider) {
    return new DailyActivityModule_ProvideDailyInteractor$app_releaseFactory(module, dailyInteractorProvider);
  }

  public static DailyInteractorImp provideDailyInteractor$app_release(DailyActivityModule instance,
      DailyInteractor dailyInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.provideDailyInteractor$app_release(dailyInteractor));
  }
}
