package com.sugarcoachpremium.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final AppModule module;

  private AppModule_ProvideRetrofitFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module);
  }

  public static AppModule_ProvideRetrofitFactory create(AppModule module) {
    return new AppModule_ProvideRetrofitFactory(module);
  }

  public static Retrofit provideRetrofit(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideRetrofit());
  }
}
