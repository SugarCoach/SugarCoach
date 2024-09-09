package com.sugarcoachpremium.ui.treatment.interactor;

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
public final class TreatmentInteractor_MembersInjector implements MembersInjector<TreatmentInteractor> {
  private final Provider<ApiRepository> apiRepositoryProvider;

  public TreatmentInteractor_MembersInjector(Provider<ApiRepository> apiRepositoryProvider) {
    this.apiRepositoryProvider = apiRepositoryProvider;
  }

  public static MembersInjector<TreatmentInteractor> create(
      Provider<ApiRepository> apiRepositoryProvider) {
    return new TreatmentInteractor_MembersInjector(apiRepositoryProvider);
  }

  @Override
  public void injectMembers(TreatmentInteractor instance) {
    injectApiRepository(instance, apiRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractor.apiRepository")
  public static void injectApiRepository(TreatmentInteractor instance,
      ApiRepository apiRepository) {
    instance.apiRepository = apiRepository;
  }
}
