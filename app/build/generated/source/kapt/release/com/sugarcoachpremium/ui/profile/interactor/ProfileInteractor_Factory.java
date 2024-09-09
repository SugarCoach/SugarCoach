package com.sugarcoachpremium.ui.profile.interactor;

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
public final class ProfileInteractor_Factory implements Factory<ProfileInteractor> {
  private final Provider<DailyRegisterRepo> dailyRepoHelperProvider;

  private final Provider<TreamentRepo> treamentRepoProvider;

  private final Provider<UserRepo> userRepoHelperProvider;

  private final Provider<PreferenceHelper> preferenceHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  private final Provider<ApiRepository> apiRepoProvider;

  public ProfileInteractor_Factory(Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<TreamentRepo> treamentRepoProvider, Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider,
      Provider<ApiRepository> apiRepoProvider) {
    this.dailyRepoHelperProvider = dailyRepoHelperProvider;
    this.treamentRepoProvider = treamentRepoProvider;
    this.userRepoHelperProvider = userRepoHelperProvider;
    this.preferenceHelperProvider = preferenceHelperProvider;
    this.apiHelperProvider = apiHelperProvider;
    this.apiRepoProvider = apiRepoProvider;
  }

  @Override
  public ProfileInteractor get() {
    ProfileInteractor instance = newInstance(dailyRepoHelperProvider.get(), treamentRepoProvider.get(), userRepoHelperProvider.get(), preferenceHelperProvider.get(), apiHelperProvider.get());
    ProfileInteractor_MembersInjector.injectApiRepo(instance, apiRepoProvider.get());
    return instance;
  }

  public static ProfileInteractor_Factory create(
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<TreamentRepo> treamentRepoProvider, Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider,
      Provider<ApiRepository> apiRepoProvider) {
    return new ProfileInteractor_Factory(dailyRepoHelperProvider, treamentRepoProvider, userRepoHelperProvider, preferenceHelperProvider, apiHelperProvider, apiRepoProvider);
  }

  public static ProfileInteractor newInstance(DailyRegisterRepo dailyRepoHelper,
      TreamentRepo treamentRepo, UserRepo userRepoHelper, PreferenceHelper preferenceHelper,
      ApiHelper apiHelper) {
    return new ProfileInteractor(dailyRepoHelper, treamentRepo, userRepoHelper, preferenceHelper, apiHelper);
  }
}
