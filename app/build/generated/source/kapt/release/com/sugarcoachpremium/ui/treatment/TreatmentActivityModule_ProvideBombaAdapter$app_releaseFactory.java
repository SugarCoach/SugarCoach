package com.sugarcoachpremium.ui.treatment;

import com.sugarcoachpremium.ui.treatment.view.BombaAdapter;
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
public final class TreatmentActivityModule_ProvideBombaAdapter$app_releaseFactory implements Factory<BombaAdapter> {
  private final TreatmentActivityModule module;

  private final Provider<TreatmentActivity> contextProvider;

  public TreatmentActivityModule_ProvideBombaAdapter$app_releaseFactory(
      TreatmentActivityModule module, Provider<TreatmentActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public BombaAdapter get() {
    return provideBombaAdapter$app_release(module, contextProvider.get());
  }

  public static TreatmentActivityModule_ProvideBombaAdapter$app_releaseFactory create(
      TreatmentActivityModule module, Provider<TreatmentActivity> contextProvider) {
    return new TreatmentActivityModule_ProvideBombaAdapter$app_releaseFactory(module, contextProvider);
  }

  public static BombaAdapter provideBombaAdapter$app_release(TreatmentActivityModule instance,
      TreatmentActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideBombaAdapter$app_release(context));
  }
}
