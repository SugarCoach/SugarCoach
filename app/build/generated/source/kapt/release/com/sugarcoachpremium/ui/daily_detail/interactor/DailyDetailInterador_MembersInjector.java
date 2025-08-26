package com.sugarcoachpremium.ui.daily_detail.interactor;

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
public final class DailyDetailInterador_MembersInjector implements MembersInjector<DailyDetailInterador> {
  private final Provider<ApiRepository> apiRepositoryProvider;

  public DailyDetailInterador_MembersInjector(Provider<ApiRepository> apiRepositoryProvider) {
    this.apiRepositoryProvider = apiRepositoryProvider;
  }

  public static MembersInjector<DailyDetailInterador> create(
      Provider<ApiRepository> apiRepositoryProvider) {
    return new DailyDetailInterador_MembersInjector(apiRepositoryProvider);
  }

  @Override
  public void injectMembers(DailyDetailInterador instance) {
    injectApiRepository(instance, apiRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInterador.apiRepository")
  public static void injectApiRepository(DailyDetailInterador instance,
      ApiRepository apiRepository) {
    instance.apiRepository = apiRepository;
  }
}
