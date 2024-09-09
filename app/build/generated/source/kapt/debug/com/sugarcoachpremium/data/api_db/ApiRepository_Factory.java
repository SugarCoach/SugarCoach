package com.sugarcoachpremium.data.api_db;

import com.apollographql.apollo3.ApolloClient;
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
public final class ApiRepository_Factory implements Factory<ApiRepository> {
  private final Provider<ApolloClient> apolloClientProvider;

  public ApiRepository_Factory(Provider<ApolloClient> apolloClientProvider) {
    this.apolloClientProvider = apolloClientProvider;
  }

  @Override
  public ApiRepository get() {
    return newInstance(apolloClientProvider.get());
  }

  public static ApiRepository_Factory create(Provider<ApolloClient> apolloClientProvider) {
    return new ApiRepository_Factory(apolloClientProvider);
  }

  public static ApiRepository newInstance(ApolloClient apolloClient) {
    return new ApiRepository(apolloClient);
  }
}
