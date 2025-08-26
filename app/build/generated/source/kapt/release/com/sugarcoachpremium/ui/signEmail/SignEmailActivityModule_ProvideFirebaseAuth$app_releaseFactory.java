package com.sugarcoachpremium.ui.signEmail;

import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
    "KotlinInternalInJava"
})
public final class SignEmailActivityModule_ProvideFirebaseAuth$app_releaseFactory implements Factory<FirebaseAuth> {
  private final SignEmailActivityModule module;

  public SignEmailActivityModule_ProvideFirebaseAuth$app_releaseFactory(
      SignEmailActivityModule module) {
    this.module = module;
  }

  @Override
  public FirebaseAuth get() {
    return provideFirebaseAuth$app_release(module);
  }

  public static SignEmailActivityModule_ProvideFirebaseAuth$app_releaseFactory create(
      SignEmailActivityModule module) {
    return new SignEmailActivityModule_ProvideFirebaseAuth$app_releaseFactory(module);
  }

  public static FirebaseAuth provideFirebaseAuth$app_release(SignEmailActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideFirebaseAuth$app_release());
  }
}
