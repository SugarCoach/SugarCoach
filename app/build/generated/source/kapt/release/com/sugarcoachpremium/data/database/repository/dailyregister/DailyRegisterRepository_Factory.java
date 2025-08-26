package com.sugarcoachpremium.data.database.repository.dailyregister;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class DailyRegisterRepository_Factory implements Factory<DailyRegisterRepository> {
  private final Provider<DailyRegisterDao> dailyRegisterDaoProvider;

  public DailyRegisterRepository_Factory(Provider<DailyRegisterDao> dailyRegisterDaoProvider) {
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
