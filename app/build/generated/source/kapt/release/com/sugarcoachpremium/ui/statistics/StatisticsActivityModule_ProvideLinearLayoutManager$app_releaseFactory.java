package com.sugarcoachpremium.ui.statistics;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.sugarcoachpremium.ui.statistics.view.StatisticsActivity;
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
public final class StatisticsActivityModule_ProvideLinearLayoutManager$app_releaseFactory implements Factory<LinearLayoutManager> {
  private final StatisticsActivityModule module;

  private final Provider<StatisticsActivity> contextProvider;

  public StatisticsActivityModule_ProvideLinearLayoutManager$app_releaseFactory(
      StatisticsActivityModule module, Provider<StatisticsActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public LinearLayoutManager get() {
    return provideLinearLayoutManager$app_release(module, contextProvider.get());
  }

  public static StatisticsActivityModule_ProvideLinearLayoutManager$app_releaseFactory create(
      StatisticsActivityModule module, Provider<StatisticsActivity> contextProvider) {
    return new StatisticsActivityModule_ProvideLinearLayoutManager$app_releaseFactory(module, contextProvider);
  }

  public static LinearLayoutManager provideLinearLayoutManager$app_release(
      StatisticsActivityModule instance, StatisticsActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideLinearLayoutManager$app_release(context));
  }
}
