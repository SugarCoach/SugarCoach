package com.sugarcoachpremium.ui.register;

import com.sugarcoachpremium.ui.register.view.CategoryAdapter;
import com.sugarcoachpremium.ui.register.view.RegisterActivity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RegisterActivityModule_ProvideCategoryAdapter$app_releaseFactory implements Factory<CategoryAdapter> {
  private final RegisterActivityModule module;

  private final Provider<RegisterActivity> contextProvider;

  public RegisterActivityModule_ProvideCategoryAdapter$app_releaseFactory(
      RegisterActivityModule module, Provider<RegisterActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public CategoryAdapter get() {
    return provideCategoryAdapter$app_release(module, contextProvider.get());
  }

  public static RegisterActivityModule_ProvideCategoryAdapter$app_releaseFactory create(
      RegisterActivityModule module, Provider<RegisterActivity> contextProvider) {
    return new RegisterActivityModule_ProvideCategoryAdapter$app_releaseFactory(module, contextProvider);
  }

  public static CategoryAdapter provideCategoryAdapter$app_release(RegisterActivityModule instance,
      RegisterActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideCategoryAdapter$app_release(context));
  }
}
