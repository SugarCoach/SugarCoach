package com.sugarcoachpremium.ui.profile;

import androidx.recyclerview.widget.GridLayoutManager;
import com.sugarcoachpremium.ui.profile.view.ProfileActivity;
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
public final class ProfileActivityModule_ProvideGridLayoutManager$app_debugFactory implements Factory<GridLayoutManager> {
  private final ProfileActivityModule module;

  private final Provider<ProfileActivity> contextProvider;

  private ProfileActivityModule_ProvideGridLayoutManager$app_debugFactory(
      ProfileActivityModule module, Provider<ProfileActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public GridLayoutManager get() {
    return provideGridLayoutManager$app_debug(module, contextProvider.get());
  }

  public static ProfileActivityModule_ProvideGridLayoutManager$app_debugFactory create(
      ProfileActivityModule module, Provider<ProfileActivity> contextProvider) {
    return new ProfileActivityModule_ProvideGridLayoutManager$app_debugFactory(module, contextProvider);
  }

  public static GridLayoutManager provideGridLayoutManager$app_debug(ProfileActivityModule instance,
      ProfileActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideGridLayoutManager$app_debug(context));
  }
}
