package com.sugarcoachpremium.ui.statistics;

import com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp;
import com.sugarcoachpremium.ui.statistics.presenter.StatisticsPresenter;
import com.sugarcoachpremium.ui.statistics.presenter.StatisticsPresenterImp;
import com.sugarcoachpremium.ui.statistics.view.StatisticsView;
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
public final class StatisticsActivityModule_ProvideStatisticsPresenter$app_debugFactory implements Factory<StatisticsPresenterImp<StatisticsView, StatisticsInteractorImp>> {
  private final StatisticsActivityModule module;

  private final Provider<StatisticsPresenter<StatisticsView, StatisticsInteractorImp>> statisticsPresenterProvider;

  private StatisticsActivityModule_ProvideStatisticsPresenter$app_debugFactory(
      StatisticsActivityModule module,
      Provider<StatisticsPresenter<StatisticsView, StatisticsInteractorImp>> statisticsPresenterProvider) {
    this.module = module;
    this.statisticsPresenterProvider = statisticsPresenterProvider;
  }

  @Override
  public StatisticsPresenterImp<StatisticsView, StatisticsInteractorImp> get() {
    return provideStatisticsPresenter$app_debug(module, statisticsPresenterProvider.get());
  }

  public static StatisticsActivityModule_ProvideStatisticsPresenter$app_debugFactory create(
      StatisticsActivityModule module,
      Provider<StatisticsPresenter<StatisticsView, StatisticsInteractorImp>> statisticsPresenterProvider) {
    return new StatisticsActivityModule_ProvideStatisticsPresenter$app_debugFactory(module, statisticsPresenterProvider);
  }

  public static StatisticsPresenterImp<StatisticsView, StatisticsInteractorImp> provideStatisticsPresenter$app_debug(
      StatisticsActivityModule instance,
      StatisticsPresenter<StatisticsView, StatisticsInteractorImp> statisticsPresenter) {
    return Preconditions.checkNotNullFromProvides(instance.provideStatisticsPresenter$app_debug(statisticsPresenter));
  }
}
