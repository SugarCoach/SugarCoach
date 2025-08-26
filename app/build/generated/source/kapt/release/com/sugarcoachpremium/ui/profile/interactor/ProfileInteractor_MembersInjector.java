package com.sugarcoachpremium.ui.profile.interactor;

import com.sugarcoachpremium.data.api_db.ApiRepository;
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
public final class ProfileInteractor_MembersInjector implements MembersInjector<ProfileInteractor> {
  private final Provider<ApiRepository> apiRepoProvider;

  public ProfileInteractor_MembersInjector(Provider<ApiRepository> apiRepoProvider) {
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
