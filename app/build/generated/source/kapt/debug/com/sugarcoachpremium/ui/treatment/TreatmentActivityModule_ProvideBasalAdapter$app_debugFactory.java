package com.sugarcoachpremium.ui.treatment;

import com.sugarcoachpremium.ui.treatment.view.BasalAdapter;
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
public final class TreatmentActivityModule_ProvideBasalAdapter$app_debugFactory implements Factory<BasalAdapter> {
  private final TreatmentActivityModule module;

  private final Provider<TreatmentActivity> contextProvider;

  public TreatmentActivityModule_ProvideBasalAdapter$app_debugFactory(
      TreatmentActivityModule module, Provider<TreatmentActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public BasalAdapter get() {
    return provideBasalAdapter$app_debug(module, contextProvider.get());
  }

  public static TreatmentActivityModule_ProvideBasalAdapter$app_debugFactory create(
      TreatmentActivityModule module, Provider<TreatmentActivity> contextProvider) {
    return new TreatmentActivityModule_ProvideBasalAdapter$app_debugFactory(module, contextProvider);
  }

  public static BasalAdapter provideBasalAdapter$app_debug(TreatmentActivityModule instance,
      TreatmentActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideBasalAdapter$app_debug(context));
  }
}
