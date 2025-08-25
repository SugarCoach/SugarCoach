package com.sugarcoachpremium.ui.sign.interactor;

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
public final class SignInteractor_Factory implements Factory<SignInteractor> {
  private final Provider<UserRepo> userRepoHelperProvider;

  private final Provider<PreferenceHelper> preferenceHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  private SignInteractor_Factory(Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider) {
    this.userRepoHelperProvider = userRepoHelperProvider;
    this.preferenceHelperProvider = preferenceHelperProvider;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public SignInteractor get() {
    return newInstance(userRepoHelperProvider.get(), preferenceHelperProvider.get(), apiHelperProvider.get());
  }

  public static SignInteractor_Factory create(Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider) {
    return new SignInteractor_Factory(userRepoHelperProvider, preferenceHelperProvider, apiHelperProvider);
  }

  public static SignInteractor newInstance(UserRepo userRepoHelper,
      PreferenceHelper preferenceHelper, ApiHelper apiHelper) {
    return new SignInteractor(userRepoHelper, preferenceHelper, apiHelper);
  }
}
