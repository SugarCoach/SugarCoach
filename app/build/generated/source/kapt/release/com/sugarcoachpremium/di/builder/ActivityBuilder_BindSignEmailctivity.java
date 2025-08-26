package com.sugarcoachpremium.di.builder;

import com.sugarcoachpremium.ui.signEmail.SignEmailActivityModule;
import com.sugarcoachpremium.ui.signEmail.view.SignEmailActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
    subcomponents = ActivityBuilder_BindSignEmailctivity.SignEmailActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilder_BindSignEmailctivity {
  private ActivityBuilder_BindSignEmailctivity() {
  }

  @Binds
  @IntoMap
  @ClassKey(SignEmailActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SignEmailActivitySubcomponent.Factory builder);

  @Subcomponent(
      modules = SignEmailActivityModule.class
  )
  public interface SignEmailActivitySubcomponent extends AndroidInjector<SignEmailActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SignEmailActivity> {
    }
  }
}
