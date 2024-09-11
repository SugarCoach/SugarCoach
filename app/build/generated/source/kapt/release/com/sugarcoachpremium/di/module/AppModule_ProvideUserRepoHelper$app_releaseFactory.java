package com.sugarcoachpremium.di.module;

import com.sugarcoachpremium.data.database.AppDatabase;
import com.sugarcoachpremium.data.database.repository.user.UserRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
    "KotlinInternalInJava"
})
public final class AppModule_ProvideUserRepoHelper$app_releaseFactory implements Factory<UserRepo> {
  private final AppModule module;

  private final Provider<AppDatabase> appDatabaseProvider;

  public AppModule_ProvideUserRepoHelper$app_releaseFactory(AppModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    this.module = module;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public UserRepo get() {
    return provideUserRepoHelper$app_release(module, appDatabaseProvider.get());
  }

  public static AppModule_ProvideUserRepoHelper$app_releaseFactory create(AppModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    return new AppModule_ProvideUserRepoHelper$app_releaseFactory(module, appDatabaseProvider);
  }

  public static UserRepo provideUserRepoHelper$app_release(AppModule instance,
      AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(instance.provideUserRepoHelper$app_release(appDatabase));
  }
}