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
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class AppModule_ProvideApolloClient$app_debugFactory implements Factory<ApolloClient> {
  private final AppModule module;

  private AppModule_ProvideApolloClient$app_debugFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public ApolloClient get() {
    return provideApolloClient$app_debug(module);
  }

  public static AppModule_ProvideApolloClient$app_debugFactory create(AppModule module) {
    return new AppModule_ProvideApolloClient$app_debugFactory(module);
  }

  public static ApolloClient provideApolloClient$app_debug(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideApolloClient$app_debug());
  }
}
