package com.sugarcoachpremium.ui.register.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp;
import com.sugarcoachpremium.ui.register.presenter.RegisterPresenterImp;
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
public final class RegisterActivity_MembersInjector implements MembersInjector<RegisterActivity> {
  private final Provider<RegisterPresenterImp<RegisterView, RegisterInteractorImp>> presenterProvider;

  private final Provider<LinearLayoutManager> managerProvider;

  private final Provider<LinearLayoutManager> managerEmotionsProvider;

  private final Provider<LinearLayoutManager> managerExercicesProvider;

  private final Provider<ItemAdapter> adapterEmotionsProvider;

  private final Provider<ItemAdapter> adapterExercicesProvider;

  private final Provider<CategoryAdapter> adapterProvider;

  public RegisterActivity_MembersInjector(
      Provider<RegisterPresenterImp<RegisterView, RegisterInteractorImp>> presenterProvider,
      Provider<LinearLayoutManager> managerProvider,
      Provider<LinearLayoutManager> managerEmotionsProvider,
      Provider<LinearLayoutManager> managerExercicesProvider,
      Provider<ItemAdapter> adapterEmotionsProvider, Provider<ItemAdapter> adapterExercicesProvider,
      Provider<CategoryAdapter> adapterProvider) {
    this.presenterProvider = presenterProvider;
    this.managerProvider = managerProvider;
    this.managerEmotionsProvider = managerEmotionsProvider;
    this.managerExercicesProvider = managerExercicesProvider;
    this.adapterEmotionsProvider = adapterEmotionsProvider;
    this.adapterExercicesProvider = adapterExercicesProvider;
    this.adapterProvider = adapterProvider;
  }

  public static MembersInjector<RegisterActivity> create(
      Provider<RegisterPresenterImp<RegisterView, RegisterInteractorImp>> presenterProvider,
      Provider<LinearLayoutManager> managerProvider,
      Provider<LinearLayoutManager> managerEmotionsProvider,
      Provider<LinearLayoutManager> managerExercicesProvider,
      Provider<ItemAdapter> adapterEmotionsProvider, Provider<ItemAdapter> adapterExercicesProvider,
      Provider<CategoryAdapter> adapterProvider) {
    return new RegisterActivity_MembersInjector(presenterProvider, managerProvider, managerEmotionsProvider, managerExercicesProvider, adapterEmotionsProvider, adapterExercicesProvider, adapterProvider);
  }

  @Override
  public void injectMembers(RegisterActivity instance) {
    injectPresenter(instance, presenterProvider.get());
    injectManager(instance, managerProvider.get());
    injectManagerEmotions(instance, managerEmotionsProvider.get());
    injectManagerExercices(instance, managerExercicesProvider.get());
    injectAdapterEmotions(instance, adapterEmotionsProvider.get());
    injectAdapterExercices(instance, adapterExercicesProvider.get());
    injectAdapter(instance, adapterProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.register.view.RegisterActivity.presenter")
  public static void injectPresenter(RegisterActivity instance,
      RegisterPresenterImp<RegisterView, RegisterInteractorImp> presenter) {
    instance.presenter = presenter;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.register.view.RegisterActivity.manager")
  public static void injectManager(RegisterActivity instance, LinearLayoutManager manager) {
    instance.manager = manager;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.register.view.RegisterActivity.managerEmotions")
  public static void injectManagerEmotions(RegisterActivity instance,
      LinearLayoutManager managerEmotions) {
    instance.managerEmotions = managerEmotions;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.register.view.RegisterActivity.managerExercices")
  public static void injectManagerExercices(RegisterActivity instance,
      LinearLayoutManager managerExercices) {
    instance.managerExercices = managerExercices;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.register.view.RegisterActivity.adapterEmotions")
  public static void injectAdapterEmotions(RegisterActivity instance, ItemAdapter adapterEmotions) {
    instance.adapterEmotions = adapterEmotions;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.register.view.RegisterActivity.adapterExercices")
  public static void injectAdapterExercices(RegisterActivity instance,
      ItemAdapter adapterExercices) {
    instance.adapterExercices = adapterExercices;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.register.view.RegisterActivity.adapter")
  public static void injectAdapter(RegisterActivity instance, CategoryAdapter adapter) {
    instance.adapter = adapter;
  }
}
