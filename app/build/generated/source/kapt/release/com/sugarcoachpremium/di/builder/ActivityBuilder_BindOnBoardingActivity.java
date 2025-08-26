package com.sugarcoachpremium.di.builder;

import com.sugarcoachpremium.ui.onboarding.OnBoardingActivityModule;
import com.sugarcoachpremium.ui.onboarding.view.OnBoardingActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
    subcomponents = ActivityBuilder_BindOnBoardingActivity.OnBoardingActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilder_BindOnBoardingActivity {
  private ActivityBuilder_BindOnBoardingActivity() {
  }

  @Binds
  @IntoMap
  @ClassKey(OnBoardingActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      OnBoardingActivitySubcomponent.Factory builder);

  @Subcomponent(
      modules = OnBoardingActivityModule.class
  )
  public interface OnBoardingActivitySubcomponent extends AndroidInjector<OnBoardingActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<OnBoardingActivity> {
    }
  }
}
