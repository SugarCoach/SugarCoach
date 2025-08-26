package com.sugarcoachpremium.ui.splash.interactor;

import android.content.Context;
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
public final class SplashInteractor_Factory implements Factory<SplashInteractor> {
  private final Provider<Context> mContextProvider;

  private final Provider<DailyRegisterRepo> dailyRepoHelperProvider;

  private final Provider<TreamentRepo> treamentRepoHelperProvider;

  private final Provider<UserRepo> userRepoHelperProvider;

  private final Provider<PreferenceHelper> preferenceHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  private SplashInteractor_Factory(Provider<Context> mContextProvider,
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<TreamentRepo> treamentRepoHelperProvider, Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider) {
    this.mContextProvider = mContextProvider;
    this.dailyRepoHelperProvider = dailyRepoHelperProvider;
    this.treamentRepoHelperProvider = treamentRepoHelperProvider;
    this.userRepoHelperProvider = userRepoHelperProvider;
    this.preferenceHelperProvider = preferenceHelperProvider;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public SplashInteractor get() {
    return newInstance(mContextProvider.get(), dailyRepoHelperProvider.get(), treamentRepoHelperProvider.get(), userRepoHelperProvider.get(), preferenceHelperProvider.get(), apiHelperProvider.get());
  }

  public static SplashInteractor_Factory create(Provider<Context> mContextProvider,
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<TreamentRepo> treamentRepoHelperProvider, Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider) {
    return new SplashInteractor_Factory(mContextProvider, dailyRepoHelperProvider, treamentRepoHelperProvider, userRepoHelperProvider, preferenceHelperProvider, apiHelperProvider);
  }

  public static SplashInteractor newInstance(Context mContext, DailyRegisterRepo dailyRepoHelper,
      TreamentRepo treamentRepoHelper, UserRepo userRepoHelper, PreferenceHelper preferenceHelper,
      ApiHelper apiHelper) {
    return new SplashInteractor(mContext, dailyRepoHelper, treamentRepoHelper, userRepoHelper, preferenceHelper, apiHelper);
  }
}
