package com.sugarcoachpremium.di.module;

import com.sugarcoachpremium.data.database.AppDatabase;
import com.sugarcoachpremium.data.database.repository.user.UserRepo;
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
public final class AppModule_ProvideUserRepoHelper$app_debugFactory implements Factory<UserRepo> {
  private final AppModule module;

  private final Provider<AppDatabase> appDatabaseProvider;

  private AppModule_ProvideUserRepoHelper$app_debugFactory(AppModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    this.module = module;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public UserRepo get() {
    return provideUserRepoHelper$app_debug(module, appDatabaseProvider.get());
  }

  public static AppModule_ProvideUserRepoHelper$app_debugFactory create(AppModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    return new AppModule_ProvideUserRepoHelper$app_debugFactory(module, appDatabaseProvider);
  }

  public static UserRepo provideUserRepoHelper$app_debug(AppModule instance,
      AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(instance.provideUserRepoHelper$app_debug(appDatabase));
  }
}
