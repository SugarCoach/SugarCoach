package com.sugarcoachpremium.di.module;

import com.apollographql.apollo3.ApolloClient;
import com.sugarcoachpremium.data.api_db.ApiClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
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
public final class AppModule_GetRepository$app_debugFactory implements Factory<ApiClient> {
  private final AppModule module;

  private final Provider<ApolloClient> clientProvider;

  private AppModule_GetRepository$app_debugFactory(AppModule module,
      Provider<ApolloClient> clientProvider) {
    this.module = module;
    this.clientProvider = clientProvider;
  }

  @Override
  public ApiClient get() {
    return getRepository$app_debug(module, clientProvider.get());
  }

  public static AppModule_GetRepository$app_debugFactory create(AppModule module,
      Provider<ApolloClient> clientProvider) {
    return new AppModule_GetRepository$app_debugFactory(module, clientProvider);
  }

  public static ApiClient getRepository$app_debug(AppModule instance, ApolloClient client) {
    return Preconditions.checkNotNullFromProvides(instance.getRepository$app_debug(client));
  }
}
