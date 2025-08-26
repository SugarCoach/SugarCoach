package com.sugarcoachpremium.ui.profile;

import com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp;
import com.sugarcoachpremium.ui.profile.presenter.ProfilePresenter;
import com.sugarcoachpremium.ui.profile.presenter.ProfilePresenterImp;
import com.sugarcoachpremium.ui.profile.view.ProfileView;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class ProfileActivityModule_ProvideProfilePresenter$app_debugFactory implements Factory<ProfilePresenterImp<ProfileView, ProfileInteractorImp>> {
  private final ProfileActivityModule module;

  private final Provider<ProfilePresenter<ProfileView, ProfileInteractorImp>> profilePresenterProvider;

  private ProfileActivityModule_ProvideProfilePresenter$app_debugFactory(
      ProfileActivityModule module,
      Provider<ProfilePresenter<ProfileView, ProfileInteractorImp>> profilePresenterProvider) {
    this.module = module;
    this.profilePresenterProvider = profilePresenterProvider;
  }

  @Override
  public ProfilePresenterImp<ProfileView, ProfileInteractorImp> get() {
    return provideProfilePresenter$app_debug(module, profilePresenterProvider.get());
  }

  public static ProfileActivityModule_ProvideProfilePresenter$app_debugFactory create(
      ProfileActivityModule module,
      Provider<ProfilePresenter<ProfileView, ProfileInteractorImp>> profilePresenterProvider) {
    return new ProfileActivityModule_ProvideProfilePresenter$app_debugFactory(module, profilePresenterProvider);
  }

  public static ProfilePresenterImp<ProfileView, ProfileInteractorImp> provideProfilePresenter$app_debug(
      ProfileActivityModule instance,
      ProfilePresenter<ProfileView, ProfileInteractorImp> profilePresenter) {
    return Preconditions.checkNotNullFromProvides(instance.provideProfilePresenter$app_debug(profilePresenter));
  }
}
