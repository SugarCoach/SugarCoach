package com.sugarcoachpremium.ui.register;

import androidx.recyclerview.widget.LinearLayoutManager;
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
public final class RegisterActivityModule_ProvideLinearLayoutManager$app_debugFactory implements Factory<LinearLayoutManager> {
  private final RegisterActivityModule module;

  private final Provider<RegisterActivity> contextProvider;

  public RegisterActivityModule_ProvideLinearLayoutManager$app_debugFactory(
      RegisterActivityModule module, Provider<RegisterActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public LinearLayoutManager get() {
    return provideLinearLayoutManager$app_debug(module, contextProvider.get());
  }

  public static RegisterActivityModule_ProvideLinearLayoutManager$app_debugFactory create(
      RegisterActivityModule module, Provider<RegisterActivity> contextProvider) {
    return new RegisterActivityModule_ProvideLinearLayoutManager$app_debugFactory(module, contextProvider);
  }

  public static LinearLayoutManager provideLinearLayoutManager$app_debug(
      RegisterActivityModule instance, RegisterActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideLinearLayoutManager$app_debug(context));
  }
}
