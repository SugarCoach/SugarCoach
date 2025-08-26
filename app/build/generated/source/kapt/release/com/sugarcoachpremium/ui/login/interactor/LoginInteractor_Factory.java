package com.sugarcoachpremium.ui.login.interactor;

import android.content.Context;
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
public final class LoginInteractor_Factory implements Factory<LoginInteractor> {
  private final Provider<Context> mContextProvider;

  private final Provider<DailyRegisterRepo> dailyRepoHelperProvider;

  private final Provider<TreamentRepo> treamentRepoHelperProvider;

  private final Provider<UserRepo> userRepoHelperProvider;

  private final Provider<PreferenceHelper> preferenceHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  private final Provider<ApiRepository> apiRepositoryProvider;

  public LoginInteractor_Factory(Provider<Context> mContextProvider,
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<TreamentRepo> treamentRepoHelperProvider, Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider,
      Provider<ApiRepository> apiRepositoryProvider) {
    this.mContextProvider = mContextProvider;
    this.dailyRepoHelperProvider = dailyRepoHelperProvider;
    this.treamentRepoHelperProvider = treamentRepoHelperProvider;
    this.userRepoHelperProvider = userRepoHelperProvider;
    this.preferenceHelperProvider = preferenceHelperProvider;
    this.apiHelperProvider = apiHelperProvider;
    this.apiRepositoryProvider = apiRepositoryProvider;
  }

  @Override
  public LoginInteractor get() {
    LoginInteractor instance = newInstance(mContextProvider.get(), dailyRepoHelperProvider.get(), treamentRepoHelperProvider.get(), userRepoHelperProvider.get(), preferenceHelperProvider.get(), apiHelperProvider.get());
    LoginInteractor_MembersInjector.injectApiRepository(instance, apiRepositoryProvider.get());
    return instance;
  }

  public static LoginInteractor_Factory create(Provider<Context> mContextProvider,
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<TreamentRepo> treamentRepoHelperProvider, Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider,
      Provider<ApiRepository> apiRepositoryProvider) {
    return new LoginInteractor_Factory(mContextProvider, dailyRepoHelperProvider, treamentRepoHelperProvider, userRepoHelperProvider, preferenceHelperProvider, apiHelperProvider, apiRepositoryProvider);
  }

  public static LoginInteractor newInstance(Context mContext, DailyRegisterRepo dailyRepoHelper,
      TreamentRepo treamentRepoHelper, UserRepo userRepoHelper, PreferenceHelper preferenceHelper,
      ApiHelper apiHelper) {
    return new LoginInteractor(mContext, dailyRepoHelper, treamentRepoHelper, userRepoHelper, preferenceHelper, apiHelper);
  }
}
