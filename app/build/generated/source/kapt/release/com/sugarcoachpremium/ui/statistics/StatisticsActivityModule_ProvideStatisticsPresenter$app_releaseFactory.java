package com.sugarcoachpremium.ui.statistics;

import com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp;
import com.sugarcoachpremium.ui.statistics.presenter.StatisticsPresenter;
import com.sugarcoachpremium.ui.statistics.presenter.StatisticsPresenterImp;
import com.sugarcoachpremium.ui.statistics.view.StatisticsView;
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
public final class StatisticsActivityModule_ProvideStatisticsPresenter$app_releaseFactory implements Factory<StatisticsPresenterImp<StatisticsView, StatisticsInteractorImp>> {
  private final StatisticsActivityModule module;

  private final Provider<StatisticsPresenter<StatisticsView, StatisticsInteractorImp>> statisticsPresenterProvider;

  public StatisticsActivityModule_ProvideStatisticsPresenter$app_releaseFactory(
      StatisticsActivityModule module,
      Provider<StatisticsPresenter<StatisticsView, StatisticsInteractorImp>> statisticsPresenterProvider) {
    this.module = module;
    this.statisticsPresenterProvider = statisticsPresenterProvider;
  }

  @Override
  public StatisticsPresenterImp<StatisticsView, StatisticsInteractorImp> get() {
    return provideStatisticsPresenter$app_release(module, statisticsPresenterProvider.get());
  }

  public static StatisticsActivityModule_ProvideStatisticsPresenter$app_releaseFactory create(
      StatisticsActivityModule module,
      Provider<StatisticsPresenter<StatisticsView, StatisticsInteractorImp>> statisticsPresenterProvider) {
    return new StatisticsActivityModule_ProvideStatisticsPresenter$app_releaseFactory(module, statisticsPresenterProvider);
  }

  public static StatisticsPresenterImp<StatisticsView, StatisticsInteractorImp> provideStatisticsPresenter$app_release(
      StatisticsActivityModule instance,
      StatisticsPresenter<StatisticsView, StatisticsInteractorImp> statisticsPresenter) {
    return Preconditions.checkNotNullFromProvides(instance.provideStatisticsPresenter$app_release(statisticsPresenter));
  }
}
