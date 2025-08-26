package com.sugarcoachpremium.di.builder;

import com.sugarcoachpremium.ui.profile.ProfileActivityModule;
import com.sugarcoachpremium.ui.profile.view.ProfileActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
    subcomponents = ActivityBuilder_BindProfileActivity.ProfileActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilder_BindProfileActivity {
  private ActivityBuilder_BindProfileActivity() {
  }

  @Binds
  @IntoMap
  @ClassKey(ProfileActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProfileActivitySubcomponent.Factory builder);

  @Subcomponent(
      modules = ProfileActivityModule.class
  )
  public interface ProfileActivitySubcomponent extends AndroidInjector<ProfileActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ProfileActivity> {
    }
  }
}
