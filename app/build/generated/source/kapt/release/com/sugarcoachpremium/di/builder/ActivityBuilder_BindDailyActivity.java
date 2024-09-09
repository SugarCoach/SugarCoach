package com.sugarcoachpremium.di.builder;

import com.sugarcoachpremium.ui.daily.DailyActivityModule;
import com.sugarcoachpremium.ui.daily.view.DailyActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
    subcomponents = ActivityBuilder_BindDailyActivity.DailyActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilder_BindDailyActivity {
  private ActivityBuilder_BindDailyActivity() {
  }

  @Binds
  @IntoMap
  @ClassKey(DailyActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DailyActivitySubcomponent.Factory builder);

  @Subcomponent(
      modules = DailyActivityModule.class
  )
  public interface DailyActivitySubcomponent extends AndroidInjector<DailyActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DailyActivity> {
    }
  }
}
