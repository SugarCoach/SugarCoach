package com.sugarcoachpremium.di.builder;

import com.sugarcoachpremium.ui.sign.SignActivityModule;
import com.sugarcoachpremium.ui.sign.view.SignActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
    subcomponents = ActivityBuilder_BindSignActivity.SignActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilder_BindSignActivity {
  private ActivityBuilder_BindSignActivity() {
  }

  @Binds
  @IntoMap
  @ClassKey(SignActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SignActivitySubcomponent.Factory builder);

  @Subcomponent(
      modules = SignActivityModule.class
  )
  public interface SignActivitySubcomponent extends AndroidInjector<SignActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SignActivity> {
    }
  }
}
