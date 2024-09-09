package com.sugarcoachpremium.di.builder;

import com.sugarcoachpremium.ui.splash.SplashActivityModule;
import com.sugarcoachpremium.ui.splash.view.SplashActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
    subcomponents = ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilder_BindSplashActivity {
  private ActivityBuilder_BindSplashActivity() {
  }

  @Binds
  @IntoMap
  @ClassKey(SplashActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SplashActivitySubcomponent.Factory builder);

  @Subcomponent(
      modules = SplashActivityModule.class
  )
  public interface SplashActivitySubcomponent extends AndroidInjector<SplashActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SplashActivity> {
    }
  }
}
