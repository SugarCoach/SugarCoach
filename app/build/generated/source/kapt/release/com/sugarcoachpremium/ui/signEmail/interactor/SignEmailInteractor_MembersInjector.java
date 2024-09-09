package com.sugarcoachpremium.ui.signEmail.interactor;

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
public final class SignEmailInteractor_MembersInjector implements MembersInjector<SignEmailInteractor> {
  private final Provider<ApiRepository> apiRepositoryProvider;

  public SignEmailInteractor_MembersInjector(Provider<ApiRepository> apiRepositoryProvider) {
    this.apiRepositoryProvider = apiRepositoryProvider;
  }

  public static MembersInjector<SignEmailInteractor> create(
      Provider<ApiRepository> apiRepositoryProvider) {
    return new SignEmailInteractor_MembersInjector(apiRepositoryProvider);
  }

  @Override
  public void injectMembers(SignEmailInteractor instance) {
    injectApiRepository(instance, apiRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractor.apiRepository")
  public static void injectApiRepository(SignEmailInteractor instance,
      ApiRepository apiRepository) {
    instance.apiRepository = apiRepository;
  }
}
