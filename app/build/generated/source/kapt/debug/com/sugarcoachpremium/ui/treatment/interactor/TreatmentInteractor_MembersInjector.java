package com.sugarcoachpremium.ui.treatment.interactor;

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
public final class TreatmentInteractor_MembersInjector implements MembersInjector<TreatmentInteractor> {
  private final Provider<ApiRepository> apiRepositoryProvider;

  private TreatmentInteractor_MembersInjector(Provider<ApiRepository> apiRepositoryProvider) {
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
