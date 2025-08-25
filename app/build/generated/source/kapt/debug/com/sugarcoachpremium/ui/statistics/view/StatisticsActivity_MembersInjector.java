package com.sugarcoachpremium.ui.statistics.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp;
import com.sugarcoachpremium.ui.statistics.presenter.StatisticsPresenterImp;
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
public final class StatisticsActivity_MembersInjector implements MembersInjector<StatisticsActivity> {
  private final Provider<StatisticsPresenterImp<StatisticsView, StatisticsInteractorImp>> presenterProvider;

  private final Provider<StatisticsAdapter> adapterProvider;

  private final Provider<LinearLayoutManager> linearLayoutManagerProvider;

  private StatisticsActivity_MembersInjector(
      Provider<StatisticsPresenterImp<StatisticsView, StatisticsInteractorImp>> presenterProvider,
      Provider<StatisticsAdapter> adapterProvider,
      Provider<LinearLayoutManager> linearLayoutManagerProvider) {
    this.presenterProvider = presenterProvider;
    this.adapterProvider = adapterProvider;
    this.linearLayoutManagerProvider = linearLayoutManagerProvider;
  }

  public static MembersInjector<StatisticsActivity> create(
      Provider<StatisticsPresenterImp<StatisticsView, StatisticsInteractorImp>> presenterProvider,
      Provider<StatisticsAdapter> adapterProvider,
      Provider<LinearLayoutManager> linearLayoutManagerProvider) {
    return new StatisticsActivity_MembersInjector(presenterProvider, adapterProvider, linearLayoutManagerProvider);
  }

  @Override
  public void injectMembers(StatisticsActivity instance) {
    injectPresenter(instance, presenterProvider.get());
    injectAdapter(instance, adapterProvider.get());
    injectLinearLayoutManager(instance, linearLayoutManagerProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.statistics.view.StatisticsActivity.presenter")
  public static void injectPresenter(StatisticsActivity instance,
      StatisticsPresenterImp<StatisticsView, StatisticsInteractorImp> presenter) {
    instance.presenter = presenter;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.statistics.view.StatisticsActivity.adapter")
  public static void injectAdapter(StatisticsActivity instance, StatisticsAdapter adapter) {
    instance.adapter = adapter;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.statistics.view.StatisticsActivity.linearLayoutManager")
  public static void injectLinearLayoutManager(StatisticsActivity instance,
      LinearLayoutManager linearLayoutManager) {
    instance.linearLayoutManager = linearLayoutManager;
  }
}
