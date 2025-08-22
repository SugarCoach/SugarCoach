package com.sugarcoachpremium.data.network;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.jetbrains.annotations.Nullable;

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
public final class ApiHeader_ProtectedApiHeader_Factory implements Factory<ApiHeader.ProtectedApiHeader> {
  private final Provider<String> accessTokenProvider;

  private ApiHeader_ProtectedApiHeader_Factory(Provider<String> accessTokenProvider) {
    this.accessTokenProvider = accessTokenProvider;
  }

  @Override
  public ApiHeader.ProtectedApiHeader get() {
    return newInstance(accessTokenProvider.get());
  }

  public static ApiHeader_ProtectedApiHeader_Factory create(Provider<String> accessTokenProvider) {
    return new ApiHeader_ProtectedApiHeader_Factory(accessTokenProvider);
  }

  public static ApiHeader.ProtectedApiHeader newInstance(@Nullable String accessToken) {
    return new ApiHeader.ProtectedApiHeader(accessToken);
  }
}
