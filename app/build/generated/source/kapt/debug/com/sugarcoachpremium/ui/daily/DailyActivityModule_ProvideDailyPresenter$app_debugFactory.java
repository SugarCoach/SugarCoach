package com.sugarcoachpremium.ui.daily;

import com.sugarcoachpremium.ui.daily.interactor.DailyInteractorImp;
import com.sugarcoachpremium.ui.daily.presenter.DailyPresenter;
import com.sugarcoachpremium.ui.daily.presenter.DailyPresenterImp;
import com.sugarcoachpremium.ui.daily.view.DailyView;
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
public final class DailyActivityModule_ProvideDailyPresenter$app_debugFactory implements Factory<DailyPresenterImp<DailyView, DailyInteractorImp>> {
  private final DailyActivityModule module;

  private final Provider<DailyPresenter<DailyView, DailyInteractorImp>> dailyPresenterProvider;

  public DailyActivityModule_ProvideDailyPresenter$app_debugFactory(DailyActivityModule module,
      Provider<DailyPresenter<DailyView, DailyInteractorImp>> dailyPresenterProvider) {
    this.module = module;
    this.dailyPresenterProvider = dailyPresenterProvider;
  }

  @Override
  public DailyPresenterImp<DailyView, DailyInteractorImp> get() {
    return provideDailyPresenter$app_debug(module, dailyPresenterProvider.get());
  }

  public static DailyActivityModule_ProvideDailyPresenter$app_debugFactory create(
      DailyActivityModule module,
      Provider<DailyPresenter<DailyView, DailyInteractorImp>> dailyPresenterProvider) {
    return new DailyActivityModule_ProvideDailyPresenter$app_debugFactory(module, dailyPresenterProvider);
  }

  public static DailyPresenterImp<DailyView, DailyInteractorImp> provideDailyPresenter$app_debug(
      DailyActivityModule instance, DailyPresenter<DailyView, DailyInteractorImp> dailyPresenter) {
    return Preconditions.checkNotNullFromProvides(instance.provideDailyPresenter$app_debug(dailyPresenter));
  }
}
