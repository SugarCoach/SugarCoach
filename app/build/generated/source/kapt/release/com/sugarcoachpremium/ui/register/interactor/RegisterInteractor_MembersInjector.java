package com.sugarcoachpremium.ui.register.interactor;

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
public final class RegisterInteractor_MembersInjector implements MembersInjector<RegisterInteractor> {
  private final Provider<ApiRepository> apiRepositoryProvider;

  public RegisterInteractor_MembersInjector(Provider<ApiRepository> apiRepositoryProvider) {
    this.apiRepositoryProvider = apiRepositoryProvider;
  }

  public static MembersInjector<RegisterInteractor> create(
      Provider<ApiRepository> apiRepositoryProvider) {
    return new RegisterInteractor_MembersInjector(apiRepositoryProvider);
  }

  @Override
  public void injectMembers(RegisterInteractor instance) {
    injectApiRepository(instance, apiRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.register.interactor.RegisterInteractor.apiRepository")
  public static void injectApiRepository(RegisterInteractor instance, ApiRepository apiRepository) {
    instance.apiRepository = apiRepository;
  }
}
