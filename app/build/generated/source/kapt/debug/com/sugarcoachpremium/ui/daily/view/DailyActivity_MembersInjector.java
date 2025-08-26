package com.sugarcoachpremium.ui.daily.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.sugarcoachpremium.ui.daily.interactor.DailyInteractorImp;
import com.sugarcoachpremium.ui.daily.presenter.DailyPresenterImp;
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
public final class DailyActivity_MembersInjector implements MembersInjector<DailyActivity> {
  private final Provider<DailyPresenterImp<DailyView, DailyInteractorImp>> presenterProvider;

  private final Provider<LinearLayoutManager> linearLayoutManagerProvider;

  private DailyActivity_MembersInjector(
      Provider<DailyPresenterImp<DailyView, DailyInteractorImp>> presenterProvider,
      Provider<LinearLayoutManager> linearLayoutManagerProvider) {
    this.presenterProvider = presenterProvider;
    this.linearLayoutManagerProvider = linearLayoutManagerProvider;
  }

  public static MembersInjector<DailyActivity> create(
      Provider<DailyPresenterImp<DailyView, DailyInteractorImp>> presenterProvider,
      Provider<LinearLayoutManager> linearLayoutManagerProvider) {
    return new DailyActivity_MembersInjector(presenterProvider, linearLayoutManagerProvider);
  }

  @Override
  public void injectMembers(DailyActivity instance) {
    injectPresenter(instance, presenterProvider.get());
    injectLinearLayoutManager(instance, linearLayoutManagerProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.daily.view.DailyActivity.presenter")
  public static void injectPresenter(DailyActivity instance,
      DailyPresenterImp<DailyView, DailyInteractorImp> presenter) {
    instance.presenter = presenter;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.daily.view.DailyActivity.linearLayoutManager")
  public static void injectLinearLayoutManager(DailyActivity instance,
      LinearLayoutManager linearLayoutManager) {
    instance.linearLayoutManager = linearLayoutManager;
  }
}
