package com.sugarcoachpremium.di.module;

import com.sugarcoachpremium.data.network.ApiHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideApiHelper$app_releaseFactory implements Factory<ApiHelper> {
  private final AppModule module;

  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideApiHelper$app_releaseFactory(AppModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiHelper get() {
    return provideApiHelper$app_release(module, retrofitProvider.get());
  }

  public static AppModule_ProvideApiHelper$app_releaseFactory create(AppModule module,
      Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideApiHelper$app_releaseFactory(module, retrofitProvider);
  }

  public static ApiHelper provideApiHelper$app_release(AppModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.provideApiHelper$app_release(retrofit));
  }
}
