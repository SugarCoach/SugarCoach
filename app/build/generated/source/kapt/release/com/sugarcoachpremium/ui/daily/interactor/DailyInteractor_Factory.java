package com.sugarcoachpremium.ui.daily.interactor;

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
public final class DailyInteractor_Factory implements Factory<DailyInteractor> {
  private final Provider<TreamentRepo> treamentRepoProvider;

  private final Provider<DailyRegisterRepo> dailyRepoHelperProvider;

  private final Provider<UserRepo> userRepoHelperProvider;

  private final Provider<PreferenceHelper> preferenceHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  public DailyInteractor_Factory(Provider<TreamentRepo> treamentRepoProvider,
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider) {
    this.treamentRepoProvider = treamentRepoProvider;
    this.dailyRepoHelperProvider = dailyRepoHelperProvider;
    this.userRepoHelperProvider = userRepoHelperProvider;
    this.preferenceHelperProvider = preferenceHelperProvider;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public DailyInteractor get() {
    return newInstance(treamentRepoProvider.get(), dailyRepoHelperProvider.get(), userRepoHelperProvider.get(), preferenceHelperProvider.get(), apiHelperProvider.get());
  }

  public static DailyInteractor_Factory create(Provider<TreamentRepo> treamentRepoProvider,
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider) {
    return new DailyInteractor_Factory(treamentRepoProvider, dailyRepoHelperProvider, userRepoHelperProvider, preferenceHelperProvider, apiHelperProvider);
  }

  public static DailyInteractor newInstance(TreamentRepo treamentRepo,
      DailyRegisterRepo dailyRepoHelper, UserRepo userRepoHelper, PreferenceHelper preferenceHelper,
      ApiHelper apiHelper) {
    return new DailyInteractor(treamentRepo, dailyRepoHelper, userRepoHelper, preferenceHelper, apiHelper);
  }
}
