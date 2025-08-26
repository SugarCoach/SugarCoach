package com.sugarcoachpremium.ui.statistics;

import com.sugarcoachpremium.ui.statistics.view.StatisticsActivity;
import com.sugarcoachpremium.ui.statistics.view.StatisticsAdapter;
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
public final class StatisticsActivityModule_ProvideStatisticsAdapter$app_releaseFactory implements Factory<StatisticsAdapter> {
  private final StatisticsActivityModule module;

  private final Provider<StatisticsActivity> contextProvider;

  public StatisticsActivityModule_ProvideStatisticsAdapter$app_releaseFactory(
      StatisticsActivityModule module, Provider<StatisticsActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public StatisticsAdapter get() {
    return provideStatisticsAdapter$app_release(module, contextProvider.get());
  }

  public static StatisticsActivityModule_ProvideStatisticsAdapter$app_releaseFactory create(
      StatisticsActivityModule module, Provider<StatisticsActivity> contextProvider) {
    return new StatisticsActivityModule_ProvideStatisticsAdapter$app_releaseFactory(module, contextProvider);
  }

  public static StatisticsAdapter provideStatisticsAdapter$app_release(
      StatisticsActivityModule instance, StatisticsActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideStatisticsAdapter$app_release(context));
  }
}
