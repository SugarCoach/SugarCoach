package com.sugarcoachpremium.ui.daily_detail;

import com.sugarcoachpremium.ui.daily_detail.view.CategoryAdapter;
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
public final class DailyDetailActivityModule_ProvideCategoryAdapter$app_releaseFactory implements Factory<CategoryAdapter> {
  private final DailyDetailActivityModule module;

  private final Provider<DailyDetailActivity> contextProvider;

  public DailyDetailActivityModule_ProvideCategoryAdapter$app_releaseFactory(
      DailyDetailActivityModule module, Provider<DailyDetailActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public CategoryAdapter get() {
    return provideCategoryAdapter$app_release(module, contextProvider.get());
  }

  public static DailyDetailActivityModule_ProvideCategoryAdapter$app_releaseFactory create(
      DailyDetailActivityModule module, Provider<DailyDetailActivity> contextProvider) {
    return new DailyDetailActivityModule_ProvideCategoryAdapter$app_releaseFactory(module, contextProvider);
  }

  public static CategoryAdapter provideCategoryAdapter$app_release(
      DailyDetailActivityModule instance, DailyDetailActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideCategoryAdapter$app_release(context));
  }
}
