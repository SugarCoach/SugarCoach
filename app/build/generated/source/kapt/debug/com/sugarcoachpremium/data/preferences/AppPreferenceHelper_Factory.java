package com.sugarcoachpremium.data.preferences;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata("com.sugarcoachpremium.di.PreferenceInfo")
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
public final class AppPreferenceHelper_Factory implements Factory<AppPreferenceHelper> {
  private final Provider<Context> contextProvider;

  private final Provider<String> prefFileNameProvider;

  private AppPreferenceHelper_Factory(Provider<Context> contextProvider,
      Provider<String> prefFileNameProvider) {
    this.contextProvider = contextProvider;
    this.prefFileNameProvider = prefFileNameProvider;
  }

  @Override
  public AppPreferenceHelper get() {
    return newInstance(contextProvider.get(), prefFileNameProvider.get());
  }

  public static AppPreferenceHelper_Factory create(Provider<Context> contextProvider,
      Provider<String> prefFileNameProvider) {
    return new AppPreferenceHelper_Factory(contextProvider, prefFileNameProvider);
  }

  public static AppPreferenceHelper newInstance(Context context, String prefFileName) {
    return new AppPreferenceHelper(context, prefFileName);
  }
}
