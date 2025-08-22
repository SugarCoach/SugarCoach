package com.sugarcoachpremium.ui.profile.interactor;

import com.sugarcoachpremium.data.api_db.ApiRepository;
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
public final class ProfileInteractor_MembersInjector implements MembersInjector<ProfileInteractor> {
  private final Provider<ApiRepository> apiRepoProvider;

  private ProfileInteractor_MembersInjector(Provider<ApiRepository> apiRepoProvider) {
    this.apiRepoProvider = apiRepoProvider;
  }

  public static MembersInjector<ProfileInteractor> create(Provider<ApiRepository> apiRepoProvider) {
    return new ProfileInteractor_MembersInjector(apiRepoProvider);
  }

  @Override
  public void injectMembers(ProfileInteractor instance) {
    injectApiRepo(instance, apiRepoProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.profile.interactor.ProfileInteractor.apiRepo")
  public static void injectApiRepo(ProfileInteractor instance, ApiRepository apiRepo) {
    instance.apiRepo = apiRepo;
  }
}
