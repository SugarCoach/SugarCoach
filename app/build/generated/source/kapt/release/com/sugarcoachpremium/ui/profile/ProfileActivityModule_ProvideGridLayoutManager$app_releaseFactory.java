package com.sugarcoachpremium.ui.profile;

import androidx.recyclerview.widget.GridLayoutManager;
import com.sugarcoachpremium.ui.profile.view.ProfileActivity;
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
public final class ProfileActivityModule_ProvideGridLayoutManager$app_releaseFactory implements Factory<GridLayoutManager> {
  private final ProfileActivityModule module;

  private final Provider<ProfileActivity> contextProvider;

  public ProfileActivityModule_ProvideGridLayoutManager$app_releaseFactory(
      ProfileActivityModule module, Provider<ProfileActivity> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public GridLayoutManager get() {
    return provideGridLayoutManager$app_release(module, contextProvider.get());
  }

  public static ProfileActivityModule_ProvideGridLayoutManager$app_releaseFactory create(
      ProfileActivityModule module, Provider<ProfileActivity> contextProvider) {
    return new ProfileActivityModule_ProvideGridLayoutManager$app_releaseFactory(module, contextProvider);
  }

  public static GridLayoutManager provideGridLayoutManager$app_release(
      ProfileActivityModule instance, ProfileActivity context) {
    return Preconditions.checkNotNullFromProvides(instance.provideGridLayoutManager$app_release(context));
  }
}
