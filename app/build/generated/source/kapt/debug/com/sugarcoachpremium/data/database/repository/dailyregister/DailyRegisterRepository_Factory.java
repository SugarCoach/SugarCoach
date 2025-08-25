package com.sugarcoachpremium.data.database.repository.dailyregister;

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
public final class DailyRegisterRepository_Factory implements Factory<DailyRegisterRepository> {
  private final Provider<DailyRegisterDao> dailyRegisterDaoProvider;

  private DailyRegisterRepository_Factory(Provider<DailyRegisterDao> dailyRegisterDaoProvider) {
    this.dailyRegisterDaoProvider = dailyRegisterDaoProvider;
  }

  @Override
  public DailyRegisterRepository get() {
    return newInstance(dailyRegisterDaoProvider.get());
  }

  public static DailyRegisterRepository_Factory create(
      Provider<DailyRegisterDao> dailyRegisterDaoProvider) {
    return new DailyRegisterRepository_Factory(dailyRegisterDaoProvider);
  }

  public static DailyRegisterRepository newInstance(DailyRegisterDao dailyRegisterDao) {
    return new DailyRegisterRepository(dailyRegisterDao);
  }
}
