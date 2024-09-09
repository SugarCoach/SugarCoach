package com.sugarcoachpremium.ui.config.interactor;

import android.content.Context;
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
public final class ConfigInteractor_Factory implements Factory<ConfigInteractor> {
  private final Provider<Context> mContextProvider;

  private final Provider<TreamentRepo> treamentRepoHelperProvider;

  private final Provider<DailyRegisterRepo> dailyRepoHelperProvider;

  private final Provider<UserRepo> userRepoHelperProvider;

  private final Provider<PreferenceHelper> preferenceHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  public ConfigInteractor_Factory(Provider<Context> mContextProvider,
      Provider<TreamentRepo> treamentRepoHelperProvider,
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider) {
    this.mContextProvider = mContextProvider;
    this.treamentRepoHelperProvider = treamentRepoHelperProvider;
    this.dailyRepoHelperProvider = dailyRepoHelperProvider;
    this.userRepoHelperProvider = userRepoHelperProvider;
    this.preferenceHelperProvider = preferenceHelperProvider;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public ConfigInteractor get() {
    return newInstance(mContextProvider.get(), treamentRepoHelperProvider.get(), dailyRepoHelperProvider.get(), userRepoHelperProvider.get(), preferenceHelperProvider.get(), apiHelperProvider.get());
  }

  public static ConfigInteractor_Factory create(Provider<Context> mContextProvider,
      Provider<TreamentRepo> treamentRepoHelperProvider,
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider) {
    return new ConfigInteractor_Factory(mContextProvider, treamentRepoHelperProvider, dailyRepoHelperProvider, userRepoHelperProvider, preferenceHelperProvider, apiHelperProvider);
  }

  public static ConfigInteractor newInstance(Context mContext, TreamentRepo treamentRepoHelper,
      DailyRegisterRepo dailyRepoHelper, UserRepo userRepoHelper, PreferenceHelper preferenceHelper,
      ApiHelper apiHelper) {
    return new ConfigInteractor(mContext, treamentRepoHelper, dailyRepoHelper, userRepoHelper, preferenceHelper, apiHelper);
  }
}
