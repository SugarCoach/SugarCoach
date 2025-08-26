package com.sugarcoachpremium.ui.treatment;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.sugarcoachpremium.ui.treatment.view.TreatmentActivity;
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
public final class TreatmentActivityModule_ProvideLinearLayoutManager$app_releaseFactory implements Factory<LinearLayoutManager> {
  private final TreatmentActivityModule module;

  private final Provider<TreatmentActivity> contextProvider;

  public TreatmentActivityModule_ProvideLinearLayoutManager$app_releaseFactory(
      TreatmentActivityModule module, Provider<TreatmentActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public LinearLayoutManager get() {
    return provideLinearLayoutManager$app_release(module, contextProvider.get());
  }

  public static TreatmentActivityModule_ProvideLinearLayoutManager$app_releaseFactory create(
      TreatmentActivityModule module, Provider<TreatmentActivity> contextProvider) {
    return new TreatmentActivityModule_ProvideLinearLayoutManager$app_releaseFactory(module, contextProvider);
  }

  public static LinearLayoutManager provideLinearLayoutManager$app_release(
      TreatmentActivityModule instance, TreatmentActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideLinearLayoutManager$app_release(context));
  }
}
