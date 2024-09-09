package com.sugarcoachpremium.di.builder;

import com.sugarcoachpremium.ui.register.RegisterActivityModule;
import com.sugarcoachpremium.ui.register.view.RegisterActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
    subcomponents = ActivityBuilder_BindRegisterActivity.RegisterActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilder_BindRegisterActivity {
  private ActivityBuilder_BindRegisterActivity() {
  }

  @Binds
  @IntoMap
  @ClassKey(RegisterActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RegisterActivitySubcomponent.Factory builder);

  @Subcomponent(
      modules = RegisterActivityModule.class
  )
  public interface RegisterActivitySubcomponent extends AndroidInjector<RegisterActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RegisterActivity> {
    }
  }
}
