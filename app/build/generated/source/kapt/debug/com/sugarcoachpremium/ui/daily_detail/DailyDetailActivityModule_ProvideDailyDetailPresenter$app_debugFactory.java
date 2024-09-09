package com.sugarcoachpremium.ui.daily_detail;

import com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp;
import com.sugarcoachpremium.ui.daily_detail.presenter.DailyDetailPresenter;
import com.sugarcoachpremium.ui.daily_detail.presenter.DailyDetailPresenterImp;
import com.sugarcoachpremium.ui.daily_detail.view.DailyDetailView;
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
public final class DailyDetailActivityModule_ProvideDailyDetailPresenter$app_debugFactory implements Factory<DailyDetailPresenterImp<DailyDetailView, DailyDetailInteractorImp>> {
  private final DailyDetailActivityModule module;

  private final Provider<DailyDetailPresenter<DailyDetailView, DailyDetailInteractorImp>> dailyDetailPresenterProvider;

  public DailyDetailActivityModule_ProvideDailyDetailPresenter$app_debugFactory(
      DailyDetailActivityModule module,
      Provider<DailyDetailPresenter<DailyDetailView, DailyDetailInteractorImp>> dailyDetailPresenterProvider) {
    this.module = module;
    this.dailyDetailPresenterProvider = dailyDetailPresenterProvider;
  }

  @Override
  public DailyDetailPresenterImp<DailyDetailView, DailyDetailInteractorImp> get() {
    return provideDailyDetailPresenter$app_debug(module, dailyDetailPresenterProvider.get());
  }

  public static DailyDetailActivityModule_ProvideDailyDetailPresenter$app_debugFactory create(
      DailyDetailActivityModule module,
      Provider<DailyDetailPresenter<DailyDetailView, DailyDetailInteractorImp>> dailyDetailPresenterProvider) {
    return new DailyDetailActivityModule_ProvideDailyDetailPresenter$app_debugFactory(module, dailyDetailPresenterProvider);
  }

  public static DailyDetailPresenterImp<DailyDetailView, DailyDetailInteractorImp> provideDailyDetailPresenter$app_debug(
      DailyDetailActivityModule instance,
      DailyDetailPresenter<DailyDetailView, DailyDetailInteractorImp> dailyDetailPresenter) {
    return Preconditions.checkNotNullFromProvides(instance.provideDailyDetailPresenter$app_debug(dailyDetailPresenter));
  }
}
