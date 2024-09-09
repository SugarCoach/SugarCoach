package com.sugarcoachpremium.ui.treatment;

import com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractor;
import com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractorImp;
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
public final class TreatmentActivityModule_ProvideTreatmentInteractor$app_releaseFactory implements Factory<TreatmentInteractorImp> {
  private final TreatmentActivityModule module;

  private final Provider<TreatmentInteractor> registerInteractorProvider;

  public TreatmentActivityModule_ProvideTreatmentInteractor$app_releaseFactory(
      TreatmentActivityModule module, Provider<TreatmentInteractor> registerInteractorProvider) {
    this.module = module;
    this.registerInteractorProvider = registerInteractorProvider;
  }

  @Override
  public TreatmentInteractorImp get() {
    return provideTreatmentInteractor$app_release(module, registerInteractorProvider.get());
  }

  public static TreatmentActivityModule_ProvideTreatmentInteractor$app_releaseFactory create(
      TreatmentActivityModule module, Provider<TreatmentInteractor> registerInteractorProvider) {
    return new TreatmentActivityModule_ProvideTreatmentInteractor$app_releaseFactory(module, registerInteractorProvider);
  }

  public static TreatmentInteractorImp provideTreatmentInteractor$app_release(
      TreatmentActivityModule instance, TreatmentInteractor registerInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.provideTreatmentInteractor$app_release(registerInteractor));
  }
}
