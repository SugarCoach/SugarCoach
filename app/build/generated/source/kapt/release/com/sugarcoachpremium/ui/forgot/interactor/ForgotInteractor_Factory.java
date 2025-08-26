package com.sugarcoachpremium.ui.forgot.interactor;

import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo;
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
public final class ForgotInteractor_Factory implements Factory<ForgotInteractor> {
  private final Provider<DailyRegisterRepo> dailyRepoHelperProvider;

  private final Provider<UserRepo> userRepoHelperProvider;

  private final Provider<PreferenceHelper> preferenceHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  public ForgotInteractor_Factory(Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider) {
    this.dailyRepoHelperProvider = dailyRepoHelperProvider;
    this.userRepoHelperProvider = userRepoHelperProvider;
    this.preferenceHelperProvider = preferenceHelperProvider;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public ForgotInteractor get() {
    return newInstance(dailyRepoHelperProvider.get(), userRepoHelperProvider.get(), preferenceHelperProvider.get(), apiHelperProvider.get());
  }

  public static ForgotInteractor_Factory create(Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider) {
    return new ForgotInteractor_Factory(dailyRepoHelperProvider, userRepoHelperProvider, preferenceHelperProvider, apiHelperProvider);
  }

  public static ForgotInteractor newInstance(DailyRegisterRepo dailyRepoHelper,
      UserRepo userRepoHelper, PreferenceHelper preferenceHelper, ApiHelper apiHelper) {
    return new ForgotInteractor(dailyRepoHelper, userRepoHelper, preferenceHelper, apiHelper);
  }
}
