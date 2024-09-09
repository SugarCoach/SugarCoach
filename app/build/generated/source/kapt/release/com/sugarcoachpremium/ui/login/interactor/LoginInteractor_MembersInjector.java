package com.sugarcoachpremium.ui.login.interactor;

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
public final class LoginInteractor_MembersInjector implements MembersInjector<LoginInteractor> {
  private final Provider<ApiRepository> apiRepositoryProvider;

  public LoginInteractor_MembersInjector(Provider<ApiRepository> apiRepositoryProvider) {
    this.apiRepositoryProvider = apiRepositoryProvider;
  }

  public static MembersInjector<LoginInteractor> create(
      Provider<ApiRepository> apiRepositoryProvider) {
    return new LoginInteractor_MembersInjector(apiRepositoryProvider);
  }

  @Override
  public void injectMembers(LoginInteractor instance) {
    injectApiRepository(instance, apiRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.login.interactor.LoginInteractor.apiRepository")
  public static void injectApiRepository(LoginInteractor instance, ApiRepository apiRepository) {
    instance.apiRepository = apiRepository;
  }
}
