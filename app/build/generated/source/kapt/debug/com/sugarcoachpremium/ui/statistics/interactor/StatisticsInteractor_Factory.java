package com.sugarcoachpremium.ui.statistics.interactor;

import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo;
import com.sugarcoachpremium.data.database.repository.treament.TreamentRepo;
import com.sugarcoachpremium.data.database.repository.user.UserRepo;
import com.sugarcoachpremium.data.network.ApiHelper;
import com.sugarcoachpremium.di.preferences.PreferenceHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class StatisticsInteractor_Factory implements Factory<StatisticsInteractor> {
  private final Provider<TreamentRepo> treamentRepoHelperProvider;

  private final Provider<DailyRegisterRepo> dailyRepoHelperProvider;

  private final Provider<UserRepo> userRepoHelperProvider;

  private final Provider<PreferenceHelper> preferenceHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  private StatisticsInteractor_Factory(Provider<TreamentRepo> treamentRepoHelperProvider,
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider) {
    this.treamentRepoHelperProvider = treamentRepoHelperProvider;
    this.dailyRepoHelperProvider = dailyRepoHelperProvider;
    this.userRepoHelperProvider = userRepoHelperProvider;
    this.preferenceHelperProvider = preferenceHelperProvider;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public StatisticsInteractor get() {
    return newInstance(treamentRepoHelperProvider.get(), dailyRepoHelperProvider.get(), userRepoHelperProvider.get(), preferenceHelperProvider.get(), apiHelperProvider.get());
  }

  public static StatisticsInteractor_Factory create(
      Provider<TreamentRepo> treamentRepoHelperProvider,
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider) {
    return new StatisticsInteractor_Factory(treamentRepoHelperProvider, dailyRepoHelperProvider, userRepoHelperProvider, preferenceHelperProvider, apiHelperProvider);
  }

  public static StatisticsInteractor newInstance(TreamentRepo treamentRepoHelper,
      DailyRegisterRepo dailyRepoHelper, UserRepo userRepoHelper, PreferenceHelper preferenceHelper,
      ApiHelper apiHelper) {
    return new StatisticsInteractor(treamentRepoHelper, dailyRepoHelper, userRepoHelper, preferenceHelper, apiHelper);
  }
}
