package com.sugarcoachpremium.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.reactivex.disposables.CompositeDisposable;
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
public final class AppModule_ProvideCompositeDisposable$app_debugFactory implements Factory<CompositeDisposable> {
  private final AppModule module;

  public AppModule_ProvideCompositeDisposable$app_debugFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public CompositeDisposable get() {
    return provideCompositeDisposable$app_debug(module);
  }

  public static AppModule_ProvideCompositeDisposable$app_debugFactory create(AppModule module) {
    return new AppModule_ProvideCompositeDisposable$app_debugFactory(module);
  }

  public static CompositeDisposable provideCompositeDisposable$app_debug(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCompositeDisposable$app_debug());
  }
}