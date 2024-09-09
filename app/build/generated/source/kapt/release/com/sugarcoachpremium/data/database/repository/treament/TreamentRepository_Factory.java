package com.sugarcoachpremium.data.database.repository.treament;

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
public final class TreamentRepository_Factory implements Factory<TreamentRepository> {
  private final Provider<TreamentDao> treamentDaoProvider;

  public TreamentRepository_Factory(Provider<TreamentDao> treamentDaoProvider) {
    this.treamentDaoProvider = treamentDaoProvider;
  }

  @Override
  public TreamentRepository get() {
    return newInstance(treamentDaoProvider.get());
  }

  public static TreamentRepository_Factory create(Provider<TreamentDao> treamentDaoProvider) {
    return new TreamentRepository_Factory(treamentDaoProvider);
  }

  public static TreamentRepository newInstance(TreamentDao treamentDao) {
    return new TreamentRepository(treamentDao);
  }
}
