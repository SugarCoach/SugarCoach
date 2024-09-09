package com.sugarcoachpremium.ui.statistics;

import com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractor;
import com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp;
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
public final class StatisticsActivityModule_ProvideStatisticsInteractor$app_releaseFactory implements Factory<StatisticsInteractorImp> {
  private final StatisticsActivityModule module;

  private final Provider<StatisticsInteractor> statisticsInteractorProvider;

  public StatisticsActivityModule_ProvideStatisticsInteractor$app_releaseFactory(
      StatisticsActivityModule module,
      Provider<StatisticsInteractor> statisticsInteractorProvider) {
    this.module = module;
    this.statisticsInteractorProvider = statisticsInteractorProvider;
  }

  @Override
  public StatisticsInteractorImp get() {
    return provideStatisticsInteractor$app_release(module, statisticsInteractorProvider.get());
  }

  public static StatisticsActivityModule_ProvideStatisticsInteractor$app_releaseFactory create(
      StatisticsActivityModule module,
      Provider<StatisticsInteractor> statisticsInteractorProvider) {
    return new StatisticsActivityModule_ProvideStatisticsInteractor$app_releaseFactory(module, statisticsInteractorProvider);
  }

  public static StatisticsInteractorImp provideStatisticsInteractor$app_release(
      StatisticsActivityModule instance, StatisticsInteractor statisticsInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.provideStatisticsInteractor$app_release(statisticsInteractor));
  }
}
