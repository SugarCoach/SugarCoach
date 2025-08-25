package com.sugarcoachpremium.di.module;

import com.sugarcoachpremium.data.database.AppDatabase;
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo;
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
public final class AppModule_ProvideDailyRepoHelper$app_debugFactory implements Factory<DailyRegisterRepo> {
  private final AppModule module;

  private final Provider<AppDatabase> appDatabaseProvider;

  private AppModule_ProvideDailyRepoHelper$app_debugFactory(AppModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    this.module = module;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public DailyRegisterRepo get() {
    return provideDailyRepoHelper$app_debug(module, appDatabaseProvider.get());
  }

  public static AppModule_ProvideDailyRepoHelper$app_debugFactory create(AppModule module,
      Provider<AppDatabase> appDatabaseProvider) {
    return new AppModule_ProvideDailyRepoHelper$app_debugFactory(module, appDatabaseProvider);
  }

  public static DailyRegisterRepo provideDailyRepoHelper$app_debug(AppModule instance,
      AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(instance.provideDailyRepoHelper$app_debug(appDatabase));
  }
}
