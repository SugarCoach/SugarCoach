package com.sugarcoachpremium.di.builder;

import com.sugarcoachpremium.ui.statistics.StatisticsActivityModule;
import com.sugarcoachpremium.ui.statistics.view.StatisticsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
    subcomponents = ActivityBuilder_BindStatisticsActivity.StatisticsActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilder_BindStatisticsActivity {
  private ActivityBuilder_BindStatisticsActivity() {
  }

  @Binds
  @IntoMap
  @ClassKey(StatisticsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      StatisticsActivitySubcomponent.Factory builder);

  @Subcomponent(
      modules = StatisticsActivityModule.class
  )
  public interface StatisticsActivitySubcomponent extends AndroidInjector<StatisticsActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<StatisticsActivity> {
    }
  }
}
