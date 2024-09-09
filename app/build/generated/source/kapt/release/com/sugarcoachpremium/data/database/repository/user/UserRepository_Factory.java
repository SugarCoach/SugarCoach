package com.sugarcoachpremium.data.database.repository.user;

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
public final class UserRepository_Factory implements Factory<UserRepository> {
  private final Provider<UserDao> userDaoProvider;

  public UserRepository_Factory(Provider<UserDao> userDaoProvider) {
    this.userDaoProvider = userDaoProvider;
  }

  @Override
  public UserRepository get() {
    return newInstance(userDaoProvider.get());
  }

  public static UserRepository_Factory create(Provider<UserDao> userDaoProvider) {
    return new UserRepository_Factory(userDaoProvider);
  }

  public static UserRepository newInstance(UserDao userDao) {
    return new UserRepository(userDao);
  }
}
