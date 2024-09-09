package com.sugarcoachpremium.di.builder;

import com.sugarcoachpremium.ui.config.ConfigActivityModule;
import com.sugarcoachpremium.ui.config.view.ConfigActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
    subcomponents = ActivityBuilder_BindConfigActivity.ConfigActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilder_BindConfigActivity {
  private ActivityBuilder_BindConfigActivity() {
  }

  @Binds
  @IntoMap
  @ClassKey(ConfigActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ConfigActivitySubcomponent.Factory builder);

  @Subcomponent(
      modules = ConfigActivityModule.class
  )
  public interface ConfigActivitySubcomponent extends AndroidInjector<ConfigActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ConfigActivity> {
    }
  }
}
