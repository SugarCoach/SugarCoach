package com.sugarcoachpremium.di.builder;

import com.sugarcoachpremium.ui.daily_detail.DailyDetailActivityModule;
import com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
    subcomponents = ActivityBuilder_BindDailyDetailActivity.DailyDetailActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilder_BindDailyDetailActivity {
  private ActivityBuilder_BindDailyDetailActivity() {
  }

  @Binds
  @IntoMap
  @ClassKey(DailyDetailActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DailyDetailActivitySubcomponent.Factory builder);

  @Subcomponent(
      modules = DailyDetailActivityModule.class
  )
  public interface DailyDetailActivitySubcomponent extends AndroidInjector<DailyDetailActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DailyDetailActivity> {
    }
  }
}
