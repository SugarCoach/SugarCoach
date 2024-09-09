package com.sugarcoachpremium.ui.treatment;

import com.sugarcoachpremium.ui.treatment.view.TreatmentActivity;
import com.sugarcoachpremium.ui.treatment.view.TreatmentAdapter;
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
public final class TreatmentActivityModule_ProvideTreatmentAdapter$app_debugFactory implements Factory<TreatmentAdapter> {
  private final TreatmentActivityModule module;

  private final Provider<TreatmentActivity> contextProvider;

  public TreatmentActivityModule_ProvideTreatmentAdapter$app_debugFactory(
      TreatmentActivityModule module, Provider<TreatmentActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public TreatmentAdapter get() {
    return provideTreatmentAdapter$app_debug(module, contextProvider.get());
  }

  public static TreatmentActivityModule_ProvideTreatmentAdapter$app_debugFactory create(
      TreatmentActivityModule module, Provider<TreatmentActivity> contextProvider) {
    return new TreatmentActivityModule_ProvideTreatmentAdapter$app_debugFactory(module, contextProvider);
  }

  public static TreatmentAdapter provideTreatmentAdapter$app_debug(TreatmentActivityModule instance,
      TreatmentActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideTreatmentAdapter$app_debug(context));
  }
}
