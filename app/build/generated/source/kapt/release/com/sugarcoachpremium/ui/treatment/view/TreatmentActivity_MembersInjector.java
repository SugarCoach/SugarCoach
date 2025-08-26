package com.sugarcoachpremium.ui.treatment.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractorImp;
import com.sugarcoachpremium.ui.treatment.presenter.TreatmentPresenterImp;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class TreatmentActivity_MembersInjector implements MembersInjector<TreatmentActivity> {
  private final Provider<TreatmentPresenterImp<TreatmentView, TreatmentInteractorImp>> presenterProvider;

  private final Provider<LinearLayoutManager> linearLayoutManagerProvider;

  private final Provider<LinearLayoutManager> managerProvider;

  private final Provider<LinearLayoutManager> cmanagerProvider;

  private final Provider<LinearLayoutManager> lmanagerProvider;

  private final Provider<LinearLayoutManager> horamanagerProvider;

  private final Provider<LinearLayoutManager> medidorManagerProvider;

  private final Provider<LinearLayoutManager> bombaManagerProvider;

  private final Provider<BasalAdapter> adapterProvider;

  private final Provider<BasalAdapter> adapterCorrectoraProvider;

  private final Provider<MedidorAdapter> adapterMedidorProvider;

  private final Provider<BombaAdapter> adapterBombaProvider;

  private final Provider<TreatmentAdapter> adapterCategoryProvider;

  private final Provider<TreatmentCorrectoraAdapter> adapterCategoryCorrectoraProvider;

  private final Provider<TreatmentBasalHoraAdapter> adapterBasalHoraAdapterProvider;

  public TreatmentActivity_MembersInjector(
      Provider<TreatmentPresenterImp<TreatmentView, TreatmentInteractorImp>> presenterProvider,
      Provider<LinearLayoutManager> linearLayoutManagerProvider,
      Provider<LinearLayoutManager> managerProvider, Provider<LinearLayoutManager> cmanagerProvider,
      Provider<LinearLayoutManager> lmanagerProvider,
      Provider<LinearLayoutManager> horamanagerProvider,
      Provider<LinearLayoutManager> medidorManagerProvider,
      Provider<LinearLayoutManager> bombaManagerProvider, Provider<BasalAdapter> adapterProvider,
      Provider<BasalAdapter> adapterCorrectoraProvider,
      Provider<MedidorAdapter> adapterMedidorProvider, Provider<BombaAdapter> adapterBombaProvider,
      Provider<TreatmentAdapter> adapterCategoryProvider,
      Provider<TreatmentCorrectoraAdapter> adapterCategoryCorrectoraProvider,
      Provider<TreatmentBasalHoraAdapter> adapterBasalHoraAdapterProvider) {
    this.presenterProvider = presenterProvider;
    this.linearLayoutManagerProvider = linearLayoutManagerProvider;
    this.managerProvider = managerProvider;
    this.cmanagerProvider = cmanagerProvider;
    this.lmanagerProvider = lmanagerProvider;
    this.horamanagerProvider = horamanagerProvider;
    this.medidorManagerProvider = medidorManagerProvider;
    this.bombaManagerProvider = bombaManagerProvider;
    this.adapterProvider = adapterProvider;
    this.adapterCorrectoraProvider = adapterCorrectoraProvider;
    this.adapterMedidorProvider = adapterMedidorProvider;
    this.adapterBombaProvider = adapterBombaProvider;
    this.adapterCategoryProvider = adapterCategoryProvider;
    this.adapterCategoryCorrectoraProvider = adapterCategoryCorrectoraProvider;
    this.adapterBasalHoraAdapterProvider = adapterBasalHoraAdapterProvider;
  }

  public static MembersInjector<TreatmentActivity> create(
      Provider<TreatmentPresenterImp<TreatmentView, TreatmentInteractorImp>> presenterProvider,
      Provider<LinearLayoutManager> linearLayoutManagerProvider,
      Provider<LinearLayoutManager> managerProvider, Provider<LinearLayoutManager> cmanagerProvider,
      Provider<LinearLayoutManager> lmanagerProvider,
      Provider<LinearLayoutManager> horamanagerProvider,
      Provider<LinearLayoutManager> medidorManagerProvider,
      Provider<LinearLayoutManager> bombaManagerProvider, Provider<BasalAdapter> adapterProvider,
      Provider<BasalAdapter> adapterCorrectoraProvider,
      Provider<MedidorAdapter> adapterMedidorProvider, Provider<BombaAdapter> adapterBombaProvider,
      Provider<TreatmentAdapter> adapterCategoryProvider,
      Provider<TreatmentCorrectoraAdapter> adapterCategoryCorrectoraProvider,
      Provider<TreatmentBasalHoraAdapter> adapterBasalHoraAdapterProvider) {
    return new TreatmentActivity_MembersInjector(presenterProvider, linearLayoutManagerProvider, managerProvider, cmanagerProvider, lmanagerProvider, horamanagerProvider, medidorManagerProvider, bombaManagerProvider, adapterProvider, adapterCorrectoraProvider, adapterMedidorProvider, adapterBombaProvider, adapterCategoryProvider, adapterCategoryCorrectoraProvider, adapterBasalHoraAdapterProvider);
  }

  @Override
  public void injectMembers(TreatmentActivity instance) {
    injectPresenter(instance, presenterProvider.get());
    injectLinearLayoutManager(instance, linearLayoutManagerProvider.get());
    injectManager(instance, managerProvider.get());
    injectCmanager(instance, cmanagerProvider.get());
    injectLmanager(instance, lmanagerProvider.get());
    injectHoramanager(instance, horamanagerProvider.get());
    injectMedidorManager(instance, medidorManagerProvider.get());
    injectBombaManager(instance, bombaManagerProvider.get());
    injectAdapter(instance, adapterProvider.get());
    injectAdapterCorrectora(instance, adapterCorrectoraProvider.get());
    injectAdapterMedidor(instance, adapterMedidorProvider.get());
    injectAdapterBomba(instance, adapterBombaProvider.get());
    injectAdapterCategory(instance, adapterCategoryProvider.get());
    injectAdapterCategoryCorrectora(instance, adapterCategoryCorrectoraProvider.get());
    injectAdapterBasalHoraAdapter(instance, adapterBasalHoraAdapterProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.treatment.view.TreatmentActivity.presenter")
  public static void injectPresenter(TreatmentActivity instance,
      TreatmentPresenterImp<TreatmentView, TreatmentInteractorImp> presenter) {
    instance.presenter = presenter;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.treatment.view.TreatmentActivity.linearLayoutManager")
  public static void injectLinearLayoutManager(TreatmentActivity instance,
      LinearLayoutManager linearLayoutManager) {
    instance.linearLayoutManager = linearLayoutManager;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.treatment.view.TreatmentActivity.manager")
  public static void injectManager(TreatmentActivity instance, LinearLayoutManager manager) {
    instance.manager = manager;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.treatment.view.TreatmentActivity.cmanager")
  public static void injectCmanager(TreatmentActivity instance, LinearLayoutManager cmanager) {
    instance.cmanager = cmanager;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.treatment.view.TreatmentActivity.lmanager")
  public static void injectLmanager(TreatmentActivity instance, LinearLayoutManager lmanager) {
    instance.lmanager = lmanager;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.treatment.view.TreatmentActivity.horamanager")
  public static void injectHoramanager(TreatmentActivity instance,
      LinearLayoutManager horamanager) {
    instance.horamanager = horamanager;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.treatment.view.TreatmentActivity.medidorManager")
  public static void injectMedidorManager(TreatmentActivity instance,
      LinearLayoutManager medidorManager) {
    instance.medidorManager = medidorManager;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.treatment.view.TreatmentActivity.bombaManager")
  public static void injectBombaManager(TreatmentActivity instance,
      LinearLayoutManager bombaManager) {
    instance.bombaManager = bombaManager;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.treatment.view.TreatmentActivity.adapter")
  public static void injectAdapter(TreatmentActivity instance, BasalAdapter adapter) {
    instance.adapter = adapter;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.treatment.view.TreatmentActivity.adapterCorrectora")
  public static void injectAdapterCorrectora(TreatmentActivity instance,
      BasalAdapter adapterCorrectora) {
    instance.adapterCorrectora = adapterCorrectora;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.treatment.view.TreatmentActivity.adapterMedidor")
  public static void injectAdapterMedidor(TreatmentActivity instance,
      MedidorAdapter adapterMedidor) {
    instance.adapterMedidor = adapterMedidor;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.treatment.view.TreatmentActivity.adapterBomba")
  public static void injectAdapterBomba(TreatmentActivity instance, BombaAdapter adapterBomba) {
    instance.adapterBomba = adapterBomba;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.treatment.view.TreatmentActivity.adapterCategory")
  public static void injectAdapterCategory(TreatmentActivity instance,
      TreatmentAdapter adapterCategory) {
    instance.adapterCategory = adapterCategory;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.treatment.view.TreatmentActivity.adapterCategoryCorrectora")
  public static void injectAdapterCategoryCorrectora(TreatmentActivity instance,
      TreatmentCorrectoraAdapter adapterCategoryCorrectora) {
    instance.adapterCategoryCorrectora = adapterCategoryCorrectora;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.treatment.view.TreatmentActivity.adapterBasalHoraAdapter")
  public static void injectAdapterBasalHoraAdapter(TreatmentActivity instance,
      TreatmentBasalHoraAdapter adapterBasalHoraAdapter) {
    instance.adapterBasalHoraAdapter = adapterBasalHoraAdapter;
  }
}
