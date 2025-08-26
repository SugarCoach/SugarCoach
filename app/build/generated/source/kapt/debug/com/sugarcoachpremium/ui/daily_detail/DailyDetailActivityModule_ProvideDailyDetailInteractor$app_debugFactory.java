package com.sugarcoachpremium.ui.daily_detail;

import com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp;
import com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInterador;
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
public final class DailyDetailActivityModule_ProvideDailyDetailInteractor$app_debugFactory implements Factory<DailyDetailInteractorImp> {
  private final DailyDetailActivityModule module;

  private final Provider<DailyDetailInterador> dailyDetailInteradorProvider;

  public DailyDetailActivityModule_ProvideDailyDetailInteractor$app_debugFactory(
      DailyDetailActivityModule module,
      Provider<DailyDetailInterador> dailyDetailInteradorProvider) {
    this.module = module;
    this.dailyDetailInteradorProvider = dailyDetailInteradorProvider;
  }

  @Override
  public DailyDetailInteractorImp get() {
    return provideDailyDetailInteractor$app_debug(module, dailyDetailInteradorProvider.get());
  }

  public static DailyDetailActivityModule_ProvideDailyDetailInteractor$app_debugFactory create(
      DailyDetailActivityModule module,
      Provider<DailyDetailInterador> dailyDetailInteradorProvider) {
    return new DailyDetailActivityModule_ProvideDailyDetailInteractor$app_debugFactory(module, dailyDetailInteradorProvider);
  }

  public static DailyDetailInteractorImp provideDailyDetailInteractor$app_debug(
      DailyDetailActivityModule instance, DailyDetailInterador dailyDetailInterador) {
    return Preconditions.checkNotNullFromProvides(instance.provideDailyDetailInteractor$app_debug(dailyDetailInterador));
  }
}
