package com.sugarcoachpremium.di.module;

import com.sugarcoachpremium.data.network.ApiHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
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
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class AppModule_ProvideApiHelper$app_debugFactory implements Factory<ApiHelper> {
  private final AppModule module;

  private final Provider<Retrofit> retrofitProvider;

  private AppModule_ProvideApiHelper$app_debugFactory(AppModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiHelper get() {
    return provideApiHelper$app_debug(module, retrofitProvider.get());
  }

  public static AppModule_ProvideApiHelper$app_debugFactory create(AppModule module,
      Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideApiHelper$app_debugFactory(module, retrofitProvider);
  }

  public static ApiHelper provideApiHelper$app_debug(AppModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.provideApiHelper$app_debug(retrofit));
  }
}
