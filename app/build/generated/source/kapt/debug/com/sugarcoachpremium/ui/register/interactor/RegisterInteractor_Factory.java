package com.sugarcoachpremium.ui.register.interactor;

import com.sugarcoachpremium.data.api_db.ApiRepository;
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo;
import com.sugarcoachpremium.data.database.repository.treament.TreamentRepo;
import com.sugarcoachpremium.data.database.repository.user.UserRepo;
import com.sugarcoachpremium.data.network.ApiHelper;
import com.sugarcoachpremium.di.preferences.PreferenceHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class RegisterInteractor_Factory implements Factory<RegisterInteractor> {
  private final Provider<TreamentRepo> treamentRepoProvider;

  private final Provider<DailyRegisterRepo> dailyRepoHelperProvider;

  private final Provider<UserRepo> userRepoHelperProvider;

  private final Provider<PreferenceHelper> preferenceHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  private final Provider<ApiRepository> apiRepositoryProvider;

  public RegisterInteractor_Factory(Provider<TreamentRepo> treamentRepoProvider,
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider,
      Provider<ApiRepository> apiRepositoryProvider) {
    this.treamentRepoProvider = treamentRepoProvider;
    this.dailyRepoHelperProvider = dailyRepoHelperProvider;
    this.userRepoHelperProvider = userRepoHelperProvider;
    this.preferenceHelperProvider = preferenceHelperProvider;
    this.apiHelperProvider = apiHelperProvider;
    this.apiRepositoryProvider = apiRepositoryProvider;
  }

  @Override
  public RegisterInteractor get() {
    RegisterInteractor instance = newInstance(treamentRepoProvider.get(), dailyRepoHelperProvider.get(), userRepoHelperProvider.get(), preferenceHelperProvider.get(), apiHelperProvider.get());
    RegisterInteractor_MembersInjector.injectApiRepository(instance, apiRepositoryProvider.get());
    return instance;
  }

  public static RegisterInteractor_Factory create(Provider<TreamentRepo> treamentRepoProvider,
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider,
      Provider<ApiRepository> apiRepositoryProvider) {
    return new RegisterInteractor_Factory(treamentRepoProvider, dailyRepoHelperProvider, userRepoHelperProvider, preferenceHelperProvider, apiHelperProvider, apiRepositoryProvider);
  }

  public static RegisterInteractor newInstance(TreamentRepo treamentRepo,
      DailyRegisterRepo dailyRepoHelper, UserRepo userRepoHelper, PreferenceHelper preferenceHelper,
      ApiHelper apiHelper) {
    return new RegisterInteractor(treamentRepo, dailyRepoHelper, userRepoHelper, preferenceHelper, apiHelper);
  }
}
