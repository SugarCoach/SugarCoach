package com.sugarcoachpremium.ui.treatment;

import com.sugarcoachpremium.ui.treatment.view.TreatmentActivity;
import com.sugarcoachpremium.ui.treatment.view.TreatmentCorrectoraAdapter;
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
public final class TreatmentActivityModule_ProvideTreatmentCorrectoraAdapter$app_releaseFactory implements Factory<TreatmentCorrectoraAdapter> {
  private final TreatmentActivityModule module;

  private final Provider<TreatmentActivity> contextProvider;

  public TreatmentActivityModule_ProvideTreatmentCorrectoraAdapter$app_releaseFactory(
      TreatmentActivityModule module, Provider<TreatmentActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public TreatmentCorrectoraAdapter get() {
    return provideTreatmentCorrectoraAdapter$app_release(module, contextProvider.get());
  }

  public static TreatmentActivityModule_ProvideTreatmentCorrectoraAdapter$app_releaseFactory create(
      TreatmentActivityModule module, Provider<TreatmentActivity> contextProvider) {
    return new TreatmentActivityModule_ProvideTreatmentCorrectoraAdapter$app_releaseFactory(module, contextProvider);
  }

  public static TreatmentCorrectoraAdapter provideTreatmentCorrectoraAdapter$app_release(
      TreatmentActivityModule instance, TreatmentActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideTreatmentCorrectoraAdapter$app_release(context));
  }
}
