package com.sugarcoachpremium.ui.profile.view;

import androidx.recyclerview.widget.GridLayoutManager;
import com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp;
import com.sugarcoachpremium.ui.profile.presenter.ProfilePresenterImp;
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
public final class ProfileActivity_MembersInjector implements MembersInjector<ProfileActivity> {
  private final Provider<ProfilePresenterImp<ProfileView, ProfileInteractorImp>> presenterProvider;

  private final Provider<GridLayoutManager> managerProvider;

  private final Provider<ProfileAdapter> adapterProvider;

  public ProfileActivity_MembersInjector(
      Provider<ProfilePresenterImp<ProfileView, ProfileInteractorImp>> presenterProvider,
      Provider<GridLayoutManager> managerProvider, Provider<ProfileAdapter> adapterProvider) {
    this.presenterProvider = presenterProvider;
    this.managerProvider = managerProvider;
    this.adapterProvider = adapterProvider;
  }

  public static MembersInjector<ProfileActivity> create(
      Provider<ProfilePresenterImp<ProfileView, ProfileInteractorImp>> presenterProvider,
      Provider<GridLayoutManager> managerProvider, Provider<ProfileAdapter> adapterProvider) {
    return new ProfileActivity_MembersInjector(presenterProvider, managerProvider, adapterProvider);
  }

  @Override
  public void injectMembers(ProfileActivity instance) {
    injectPresenter(instance, presenterProvider.get());
    injectManager(instance, managerProvider.get());
    injectAdapter(instance, adapterProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.profile.view.ProfileActivity.presenter")
  public static void injectPresenter(ProfileActivity instance,
      ProfilePresenterImp<ProfileView, ProfileInteractorImp> presenter) {
    instance.presenter = presenter;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.profile.view.ProfileActivity.manager")
  public static void injectManager(ProfileActivity instance, GridLayoutManager manager) {
    instance.manager = manager;
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.profile.view.ProfileActivity.adapter")
  public static void injectAdapter(ProfileActivity instance, ProfileAdapter adapter) {
    instance.adapter = adapter;
  }
}
