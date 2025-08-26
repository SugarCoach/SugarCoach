package com.sugarcoachpremium.ui.daily_detail.interactor;

import com.sugarcoachpremium.data.api_db.ApiRepository;
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
public final class DailyDetailInterador_Factory implements Factory<DailyDetailInterador> {
  private final Provider<TreamentRepo> treamentRepoProvider;

  private final Provider<DailyRegisterRepo> dailyRepoHelperProvider;

  private final Provider<UserRepo> userRepoHelperProvider;

  private final Provider<PreferenceHelper> preferenceHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  private final Provider<ApiRepository> apiRepositoryProvider;

  private DailyDetailInterador_Factory(Provider<TreamentRepo> treamentRepoProvider,
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
  public DailyDetailInterador get() {
    DailyDetailInterador instance = newInstance(treamentRepoProvider.get(), dailyRepoHelperProvider.get(), userRepoHelperProvider.get(), preferenceHelperProvider.get(), apiHelperProvider.get());
    DailyDetailInterador_MembersInjector.injectApiRepository(instance, apiRepositoryProvider.get());
    return instance;
  }

  public static DailyDetailInterador_Factory create(Provider<TreamentRepo> treamentRepoProvider,
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider,
      Provider<ApiRepository> apiRepositoryProvider) {
    return new DailyDetailInterador_Factory(treamentRepoProvider, dailyRepoHelperProvider, userRepoHelperProvider, preferenceHelperProvider, apiHelperProvider, apiRepositoryProvider);
  }

  public static DailyDetailInterador newInstance(TreamentRepo treamentRepo,
      DailyRegisterRepo dailyRepoHelper, UserRepo userRepoHelper, PreferenceHelper preferenceHelper,
      ApiHelper apiHelper) {
    return new DailyDetailInterador(treamentRepo, dailyRepoHelper, userRepoHelper, preferenceHelper, apiHelper);
  }
}
