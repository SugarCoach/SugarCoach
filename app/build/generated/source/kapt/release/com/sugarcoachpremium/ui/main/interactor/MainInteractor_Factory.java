package com.sugarcoachpremium.ui.main.interactor;

import com.sugarcoachpremium.data.database.AppDatabase;
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
public final class MainInteractor_Factory implements Factory<MainInteractor> {
  private final Provider<TreamentRepo> treamentRepoProvider;

  private final Provider<DailyRegisterRepo> dailyRepoHelperProvider;

  private final Provider<AppDatabase> appDatabaseProvider;

  private final Provider<UserRepo> userRepoHelperProvider;

  private final Provider<PreferenceHelper> preferenceHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  public MainInteractor_Factory(Provider<TreamentRepo> treamentRepoProvider,
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<AppDatabase> appDatabaseProvider, Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider) {
    this.treamentRepoProvider = treamentRepoProvider;
    this.dailyRepoHelperProvider = dailyRepoHelperProvider;
    this.appDatabaseProvider = appDatabaseProvider;
    this.userRepoHelperProvider = userRepoHelperProvider;
    this.preferenceHelperProvider = preferenceHelperProvider;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public MainInteractor get() {
    return newInstance(treamentRepoProvider.get(), dailyRepoHelperProvider.get(), appDatabaseProvider.get(), userRepoHelperProvider.get(), preferenceHelperProvider.get(), apiHelperProvider.get());
  }

  public static MainInteractor_Factory create(Provider<TreamentRepo> treamentRepoProvider,
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<AppDatabase> appDatabaseProvider, Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider) {
    return new MainInteractor_Factory(treamentRepoProvider, dailyRepoHelperProvider, appDatabaseProvider, userRepoHelperProvider, preferenceHelperProvider, apiHelperProvider);
  }

  public static MainInteractor newInstance(TreamentRepo treamentRepo,
      DailyRegisterRepo dailyRepoHelper, AppDatabase appDatabase, UserRepo userRepoHelper,
      PreferenceHelper preferenceHelper, ApiHelper apiHelper) {
    return new MainInteractor(treamentRepo, dailyRepoHelper, appDatabase, userRepoHelper, preferenceHelper, apiHelper);
  }
}
