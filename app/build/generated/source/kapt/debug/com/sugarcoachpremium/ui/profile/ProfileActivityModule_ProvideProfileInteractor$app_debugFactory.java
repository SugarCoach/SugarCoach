package com.sugarcoachpremium.ui.profile;

import com.sugarcoachpremium.ui.profile.interactor.ProfileInteractor;
import com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp;
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
public final class ProfileActivityModule_ProvideProfileInteractor$app_debugFactory implements Factory<ProfileInteractorImp> {
  private final ProfileActivityModule module;

  private final Provider<ProfileInteractor> profileInteractorProvider;

  private ProfileActivityModule_ProvideProfileInteractor$app_debugFactory(
      ProfileActivityModule module, Provider<ProfileInteractor> profileInteractorProvider) {
    this.module = module;
    this.profileInteractorProvider = profileInteractorProvider;
  }

  @Override
  public ProfileInteractorImp get() {
    return provideProfileInteractor$app_debug(module, profileInteractorProvider.get());
  }

  public static ProfileActivityModule_ProvideProfileInteractor$app_debugFactory create(
      ProfileActivityModule module, Provider<ProfileInteractor> profileInteractorProvider) {
    return new ProfileActivityModule_ProvideProfileInteractor$app_debugFactory(module, profileInteractorProvider);
  }

  public static ProfileInteractorImp provideProfileInteractor$app_debug(
      ProfileActivityModule instance, ProfileInteractor profileInteractor) {
    return Preconditions.checkNotNullFromProvides(instance.provideProfileInteractor$app_debug(profileInteractor));
  }
}
