package com.sugarcoachpremium.ui.treatment;

import com.sugarcoachpremium.ui.treatment.view.TreatmentActivity;
import com.sugarcoachpremium.ui.treatment.view.TreatmentBasalHoraAdapter;
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
public final class TreatmentActivityModule_ProvideTreatmentBasalHoraAdapter$app_debugFactory implements Factory<TreatmentBasalHoraAdapter> {
  private final TreatmentActivityModule module;

  private final Provider<TreatmentActivity> contextProvider;

  private TreatmentActivityModule_ProvideTreatmentBasalHoraAdapter$app_debugFactory(
      TreatmentActivityModule module, Provider<TreatmentActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public TreatmentBasalHoraAdapter get() {
    return provideTreatmentBasalHoraAdapter$app_debug(module, contextProvider.get());
  }

  public static TreatmentActivityModule_ProvideTreatmentBasalHoraAdapter$app_debugFactory create(
      TreatmentActivityModule module, Provider<TreatmentActivity> contextProvider) {
    return new TreatmentActivityModule_ProvideTreatmentBasalHoraAdapter$app_debugFactory(module, contextProvider);
  }

  public static TreatmentBasalHoraAdapter provideTreatmentBasalHoraAdapter$app_debug(
      TreatmentActivityModule instance, TreatmentActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideTreatmentBasalHoraAdapter$app_debug(context));
  }
}
