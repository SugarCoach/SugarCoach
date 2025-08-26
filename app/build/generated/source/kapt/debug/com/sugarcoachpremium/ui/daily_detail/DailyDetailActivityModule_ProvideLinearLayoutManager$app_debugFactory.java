package com.sugarcoachpremium.ui.daily_detail;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity;
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
public final class DailyDetailActivityModule_ProvideLinearLayoutManager$app_debugFactory implements Factory<LinearLayoutManager> {
  private final DailyDetailActivityModule module;

  private final Provider<DailyDetailActivity> contextProvider;

  public DailyDetailActivityModule_ProvideLinearLayoutManager$app_debugFactory(
      DailyDetailActivityModule module, Provider<DailyDetailActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public LinearLayoutManager get() {
    return provideLinearLayoutManager$app_debug(module, contextProvider.get());
  }

  public static DailyDetailActivityModule_ProvideLinearLayoutManager$app_debugFactory create(
      DailyDetailActivityModule module, Provider<DailyDetailActivity> contextProvider) {
    return new DailyDetailActivityModule_ProvideLinearLayoutManager$app_debugFactory(module, contextProvider);
  }

  public static LinearLayoutManager provideLinearLayoutManager$app_debug(
      DailyDetailActivityModule instance, DailyDetailActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideLinearLayoutManager$app_debug(context));
  }
}
