package com.sugarcoachpremium.ui.daily_detail.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp;
import com.sugarcoachpremium.ui.daily_detail.presenter.DailyDetailPresenter;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;

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
public final class DailyDetailActivity_MembersInjector implements MembersInjector<DailyDetailActivity> {
  private final Provider<DailyDetailPresenter<DailyDetailView, DailyDetailInteractorImp>> presenterProvider;

  private final Provider<LinearLayoutManager> managerProvider;

  private final Provider<CategoryAdapter> adapterProvider;

  private final Provider<LinearLayoutManager> managerEmotionsProvider;

  private final Provider<LinearLayoutManager> managerExercicesProvider;

  private final Provider<ItemAdapter> adapterEmotionsProvider;

  private final Provider<ItemAdapter> adapterExercicesProvider;

  private DailyDetailActivity_MembersInjector(
      Provider<DailyDetailPresenter<DailyDetailView, DailyDetailInteractorImp>> presenterProvider,
      Provider<LinearLayoutManager> managerProvider, Provider<CategoryAdapter> adapterProvider,
      Provider<LinearLayoutManager> managerEmotionsProvider,
      Provider<LinearLayoutManager> managerExercicesProvider,
      Provider<ItemAdapter> adapterEmotionsProvider,
      Provider<ItemAdapter> adapterExercicesProvider) {
    this.presenterProvider = presenterProvider;
    this.managerProvider = managerProvider;
    this.adapterProvider = adapterProvider;
    this.managerEmotionsProvider = managerEmotionsProvider;
    this.managerExercicesProvider = managerExercicesProvider;
    this.adapterEmotionsProvider = adapterEmotionsProvider;
    this.adapterExercicesProvider = adapterExercicesProvider;
  }

  public static MembersInjector<DailyDetailActivity> create(
      Provider<DailyDetailPresenter<DailyDetailView, DailyDetailInteractorImp>> presenterProvider,
      Provider<LinearLayoutManager> managerProvider, Provider<CategoryAdapter> adapterProvider,
      Provider<LinearLayoutManager> managerEmotionsProvider,
      Provider<LinearLayoutManager> managerExercicesProvider,
      Provider<ItemAdapter> adapterEmotionsProvider,
      Provider<ItemAdapter> adapterExercicesProvider) {
    return new DailyDetailActivity_MembersInjector(presenterProvider, managerProvider, adapterProvider, managerEmotionsProvider, managerExercicesProvider, adapterEmotionsProvider, adapterExercicesProvider);
  }

  @Override
  public void injectMembers(DailyDetailActivity instance) {
    injectPresenter(instance, presenterProvider.get());
    injectManager(instance, managerProvider.get());
    injectAdapter(instance, adapterProvider.get());
    injectManagerEmotions(instance, managerEmotionsProvider.get());
    injectManagerExercices(instance, managerExercicesProvider.get());
    injectAdapterEmotions(instance, adapterEmotionsProvider.get());
    injectAdapterExercices(instance, adapterExercicesProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity.presenter")
  public static void injectPresenter(DailyDetailActivity instance,
      DailyDetailPresenter<DailyDetailView, DailyDetailInteractorImp> presenter) {
    instance.presenter = presenter;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity.manager")
  public static void injectManager(DailyDetailActivity instance, LinearLayoutManager manager) {
    instance.manager = manager;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity.adapter")
  public static void injectAdapter(DailyDetailActivity instance, CategoryAdapter adapter) {
    instance.adapter = adapter;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity.managerEmotions")
  public static void injectManagerEmotions(DailyDetailActivity instance,
      LinearLayoutManager managerEmotions) {
    instance.managerEmotions = managerEmotions;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity.managerExercices")
  public static void injectManagerExercices(DailyDetailActivity instance,
      LinearLayoutManager managerExercices) {
    instance.managerExercices = managerExercices;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity.adapterEmotions")
  public static void injectAdapterEmotions(DailyDetailActivity instance,
      ItemAdapter adapterEmotions) {
    instance.adapterEmotions = adapterEmotions;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity.adapterExercices")
  public static void injectAdapterExercices(DailyDetailActivity instance,
      ItemAdapter adapterExercices) {
    instance.adapterExercices = adapterExercices;
  }
}
