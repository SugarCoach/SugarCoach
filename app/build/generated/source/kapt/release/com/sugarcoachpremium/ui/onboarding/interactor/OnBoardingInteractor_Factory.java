package com.sugarcoachpremium.ui.onboarding.interactor;

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
public final class OnBoardingInteractor_Factory implements Factory<OnBoardingInteractor> {
  private final Provider<UserRepo> userRepoHelperProvider;

  private final Provider<PreferenceHelper> preferenceHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  public OnBoardingInteractor_Factory(Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider) {
    this.userRepoHelperProvider = userRepoHelperProvider;
    this.preferenceHelperProvider = preferenceHelperProvider;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public OnBoardingInteractor get() {
    return newInstance(userRepoHelperProvider.get(), preferenceHelperProvider.get(), apiHelperProvider.get());
  }

  public static OnBoardingInteractor_Factory create(Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider) {
    return new OnBoardingInteractor_Factory(userRepoHelperProvider, preferenceHelperProvider, apiHelperProvider);
  }

  public static OnBoardingInteractor newInstance(UserRepo userRepoHelper,
      PreferenceHelper preferenceHelper, ApiHelper apiHelper) {
    return new OnBoardingInteractor(userRepoHelper, preferenceHelper, apiHelper);
  }
}
