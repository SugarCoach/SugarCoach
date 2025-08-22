package com.sugarcoachpremium.ui.signEmail.interactor;

import android.content.Context;
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
public final class SignEmailInteractor_Factory implements Factory<SignEmailInteractor> {
  private final Provider<Context> mContextProvider;

  private final Provider<TreamentRepo> treamentRepoHelperProvider;

  private final Provider<DailyRegisterRepo> dailyRepoHelperProvider;

  private final Provider<UserRepo> userRepoHelperProvider;

  private final Provider<PreferenceHelper> preferenceHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  private final Provider<ApiRepository> apiRepositoryProvider;

  private SignEmailInteractor_Factory(Provider<Context> mContextProvider,
      Provider<TreamentRepo> treamentRepoHelperProvider,
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider,
      Provider<ApiRepository> apiRepositoryProvider) {
    this.mContextProvider = mContextProvider;
    this.treamentRepoHelperProvider = treamentRepoHelperProvider;
    this.dailyRepoHelperProvider = dailyRepoHelperProvider;
    this.userRepoHelperProvider = userRepoHelperProvider;
    this.preferenceHelperProvider = preferenceHelperProvider;
    this.apiHelperProvider = apiHelperProvider;
    this.apiRepositoryProvider = apiRepositoryProvider;
  }

  @Override
  public SignEmailInteractor get() {
    SignEmailInteractor instance = newInstance(mContextProvider.get(), treamentRepoHelperProvider.get(), dailyRepoHelperProvider.get(), userRepoHelperProvider.get(), preferenceHelperProvider.get(), apiHelperProvider.get());
    SignEmailInteractor_MembersInjector.injectApiRepository(instance, apiRepositoryProvider.get());
    return instance;
  }

  public static SignEmailInteractor_Factory create(Provider<Context> mContextProvider,
      Provider<TreamentRepo> treamentRepoHelperProvider,
      Provider<DailyRegisterRepo> dailyRepoHelperProvider,
      Provider<UserRepo> userRepoHelperProvider,
      Provider<PreferenceHelper> preferenceHelperProvider, Provider<ApiHelper> apiHelperProvider,
      Provider<ApiRepository> apiRepositoryProvider) {
    return new SignEmailInteractor_Factory(mContextProvider, treamentRepoHelperProvider, dailyRepoHelperProvider, userRepoHelperProvider, preferenceHelperProvider, apiHelperProvider, apiRepositoryProvider);
  }

  public static SignEmailInteractor newInstance(Context mContext, TreamentRepo treamentRepoHelper,
      DailyRegisterRepo dailyRepoHelper, UserRepo userRepoHelper, PreferenceHelper preferenceHelper,
      ApiHelper apiHelper) {
    return new SignEmailInteractor(mContext, treamentRepoHelper, dailyRepoHelper, userRepoHelper, preferenceHelper, apiHelper);
  }
}
