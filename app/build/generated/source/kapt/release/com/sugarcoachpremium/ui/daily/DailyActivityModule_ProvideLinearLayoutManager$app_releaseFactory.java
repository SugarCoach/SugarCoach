package com.sugarcoachpremium.ui.daily;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.sugarcoachpremium.ui.daily.view.DailyActivity;
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
public final class DailyActivityModule_ProvideLinearLayoutManager$app_releaseFactory implements Factory<LinearLayoutManager> {
  private final DailyActivityModule module;

  private final Provider<DailyActivity> contextProvider;

  public DailyActivityModule_ProvideLinearLayoutManager$app_releaseFactory(
      DailyActivityModule module, Provider<DailyActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public LinearLayoutManager get() {
    return provideLinearLayoutManager$app_release(module, contextProvider.get());
  }

  public static DailyActivityModule_ProvideLinearLayoutManager$app_releaseFactory create(
      DailyActivityModule module, Provider<DailyActivity> contextProvider) {
    return new DailyActivityModule_ProvideLinearLayoutManager$app_releaseFactory(module, contextProvider);
  }

  public static LinearLayoutManager provideLinearLayoutManager$app_release(
      DailyActivityModule instance, DailyActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideLinearLayoutManager$app_release(context));
  }
}
