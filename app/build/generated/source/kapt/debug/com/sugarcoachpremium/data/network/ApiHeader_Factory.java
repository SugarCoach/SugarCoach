package com.sugarcoachpremium.data.network;

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
public final class ApiHeader_Factory implements Factory<ApiHeader> {
  private final Provider<ApiHeader.ProtectedApiHeader> protectedApiHeaderProvider;

  private ApiHeader_Factory(Provider<ApiHeader.ProtectedApiHeader> protectedApiHeaderProvider) {
    this.protectedApiHeaderProvider = protectedApiHeaderProvider;
  }

  @Override
  public ApiHeader get() {
    return newInstance(protectedApiHeaderProvider.get());
  }

  public static ApiHeader_Factory create(
      Provider<ApiHeader.ProtectedApiHeader> protectedApiHeaderProvider) {
    return new ApiHeader_Factory(protectedApiHeaderProvider);
  }

  public static ApiHeader newInstance(ApiHeader.ProtectedApiHeader protectedApiHeader) {
    return new ApiHeader(protectedApiHeader);
  }
}
