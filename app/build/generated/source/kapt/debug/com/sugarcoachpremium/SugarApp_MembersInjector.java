package com.sugarcoachpremium;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;

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
public final class SugarApp_MembersInjector implements MembersInjector<SugarApp> {
  private final Provider<DispatchingAndroidInjector<Object>> dispatchingAndroidInjectorProvider;

  private SugarApp_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> dispatchingAndroidInjectorProvider) {
    this.dispatchingAndroidInjectorProvider = dispatchingAndroidInjectorProvider;
  }

  public static MembersInjector<SugarApp> create(
      Provider<DispatchingAndroidInjector<Object>> dispatchingAndroidInjectorProvider) {
    return new SugarApp_MembersInjector(dispatchingAndroidInjectorProvider);
  }

  @Override
  public void injectMembers(SugarApp instance) {
    injectDispatchingAndroidInjector(instance, dispatchingAndroidInjectorProvider.get());
  }

  @InjectedFieldSignature("com.sugarcoachpremium.SugarApp.dispatchingAndroidInjector")
  public static void injectDispatchingAndroidInjector(SugarApp instance,
      DispatchingAndroidInjector<Object> dispatchingAndroidInjector) {
    instance.dispatchingAndroidInjector = dispatchingAndroidInjector;
  }
}
