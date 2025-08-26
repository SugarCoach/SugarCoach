package com.sugarcoachpremium.ui.treatment;

import com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractorImp;
import com.sugarcoachpremium.ui.treatment.presenter.TreatmentPresenter;
import com.sugarcoachpremium.ui.treatment.presenter.TreatmentPresenterImp;
import com.sugarcoachpremium.ui.treatment.view.TreatmentView;
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
public final class TreatmentActivityModule_ProvideTreatmentPresenter$app_releaseFactory implements Factory<TreatmentPresenterImp<TreatmentView, TreatmentInteractorImp>> {
  private final TreatmentActivityModule module;

  private final Provider<TreatmentPresenter<TreatmentView, TreatmentInteractorImp>> registerPresenterProvider;

  public TreatmentActivityModule_ProvideTreatmentPresenter$app_releaseFactory(
      TreatmentActivityModule module,
      Provider<TreatmentPresenter<TreatmentView, TreatmentInteractorImp>> registerPresenterProvider) {
    this.module = module;
    this.registerPresenterProvider = registerPresenterProvider;
  }

  @Override
  public TreatmentPresenterImp<TreatmentView, TreatmentInteractorImp> get() {
    return provideTreatmentPresenter$app_release(module, registerPresenterProvider.get());
  }

  public static TreatmentActivityModule_ProvideTreatmentPresenter$app_releaseFactory create(
      TreatmentActivityModule module,
      Provider<TreatmentPresenter<TreatmentView, TreatmentInteractorImp>> registerPresenterProvider) {
    return new TreatmentActivityModule_ProvideTreatmentPresenter$app_releaseFactory(module, registerPresenterProvider);
  }

  public static TreatmentPresenterImp<TreatmentView, TreatmentInteractorImp> provideTreatmentPresenter$app_release(
      TreatmentActivityModule instance,
      TreatmentPresenter<TreatmentView, TreatmentInteractorImp> registerPresenter) {
    return Preconditions.checkNotNullFromProvides(instance.provideTreatmentPresenter$app_release(registerPresenter));
  }
}
