package com.sugarcoachpremium.ui.profile;

import com.sugarcoachpremium.ui.profile.interactor.ProfileInteractor;
import com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp;
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
public final class ProfileActivityModule_ProvideProfileInteractor$app_releaseFactory implements Factory<ProfileInteractorImp> {
  private final ProfileActivityModule module;

  private final Provider<ProfileInteractor> profileInteractorProvider;

  public ProfileActivityModule_ProvideProfileInteractor$app_releaseFactory(
      ProfileActivityModule module, Provider<ProfileInteractor> profileInteractorProvider) {
    this.module = module;
    this.profileInteractorProvider = profileInteractorProvider;
  }

  @Override
  public ProfileInteractorImp get() {
    return provideProfileInteractor$app_release(module, profileInteractorProvider.get());
  }

  public static ProfileActivityModule_ProvideProfileInteractor$app_releaseFactory create(
      ProfileActivityModule module, Provider<ProfileInteractor> profileInteractorProvider) {
    return new ProfileActivityModule_ProvideProfileInteractor$app_releaseFactory(module, profileInteractorProvider);
  }

  public static ProfileInteractorImp provideProfileInteractor$app_release(
      ProfileActivityModule instance, ProfileInteractor profileInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.provideProfileInteractor$app_release(profileInteractor));
  }
}
