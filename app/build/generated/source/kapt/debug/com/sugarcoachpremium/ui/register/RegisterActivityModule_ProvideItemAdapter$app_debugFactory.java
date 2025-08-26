package com.sugarcoachpremium.ui.register;

import com.sugarcoachpremium.ui.register.view.ItemAdapter;
import com.sugarcoachpremium.ui.register.view.RegisterActivity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RegisterActivityModule_ProvideItemAdapter$app_debugFactory implements Factory<ItemAdapter> {
  private final RegisterActivityModule module;

  private final Provider<RegisterActivity> contextProvider;

  private RegisterActivityModule_ProvideItemAdapter$app_debugFactory(RegisterActivityModule module,
      Provider<RegisterActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public ItemAdapter get() {
    return provideItemAdapter$app_debug(module, contextProvider.get());
  }

  public static RegisterActivityModule_ProvideItemAdapter$app_debugFactory create(
      RegisterActivityModule module, Provider<RegisterActivity> contextProvider) {
    return new RegisterActivityModule_ProvideItemAdapter$app_debugFactory(module, contextProvider);
  }

  public static ItemAdapter provideItemAdapter$app_debug(RegisterActivityModule instance,
      RegisterActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideItemAdapter$app_debug(context));
  }
}
