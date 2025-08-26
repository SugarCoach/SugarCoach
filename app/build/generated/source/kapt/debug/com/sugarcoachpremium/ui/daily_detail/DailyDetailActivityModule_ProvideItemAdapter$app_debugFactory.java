package com.sugarcoachpremium.ui.daily_detail;

import com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity;
import com.sugarcoachpremium.ui.daily_detail.view.ItemAdapter;
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
public final class DailyDetailActivityModule_ProvideItemAdapter$app_debugFactory implements Factory<ItemAdapter> {
  private final DailyDetailActivityModule module;

  private final Provider<DailyDetailActivity> contextProvider;

  private DailyDetailActivityModule_ProvideItemAdapter$app_debugFactory(
      DailyDetailActivityModule module, Provider<DailyDetailActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public ItemAdapter get() {
    return provideItemAdapter$app_debug(module, contextProvider.get());
  }

  public static DailyDetailActivityModule_ProvideItemAdapter$app_debugFactory create(
      DailyDetailActivityModule module, Provider<DailyDetailActivity> contextProvider) {
    return new DailyDetailActivityModule_ProvideItemAdapter$app_debugFactory(module, contextProvider);
  }

  public static ItemAdapter provideItemAdapter$app_debug(DailyDetailActivityModule instance,
      DailyDetailActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideItemAdapter$app_debug(context));
  }
}
