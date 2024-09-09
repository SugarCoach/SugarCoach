package com.sugarcoachpremium.di.module;

import com.apollographql.apollo3.ApolloClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvideApolloClient$app_releaseFactory implements Factory<ApolloClient> {
  private final AppModule module;

  public AppModule_ProvideApolloClient$app_releaseFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public ApolloClient get() {
    return provideApolloClient$app_release(module);
  }

  public static AppModule_ProvideApolloClient$app_releaseFactory create(AppModule module) {
    return new AppModule_ProvideApolloClient$app_releaseFactory(module);
  }

  public static ApolloClient provideApolloClient$app_release(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideApolloClient$app_release());
  }
}
