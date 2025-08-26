package com.sugarcoachpremium.di.builder;

import com.sugarcoachpremium.ui.forgot.ForgotActivityModule;
import com.sugarcoachpremium.ui.forgot.view.ForgotActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
    subcomponents = ActivityBuilder_BindForgotActivity.ForgotActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilder_BindForgotActivity {
  private ActivityBuilder_BindForgotActivity() {
  }

  @Binds
  @IntoMap
  @ClassKey(ForgotActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ForgotActivitySubcomponent.Factory builder);

  @Subcomponent(
      modules = ForgotActivityModule.class
  )
  public interface ForgotActivitySubcomponent extends AndroidInjector<ForgotActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ForgotActivity> {
    }
  }
}
