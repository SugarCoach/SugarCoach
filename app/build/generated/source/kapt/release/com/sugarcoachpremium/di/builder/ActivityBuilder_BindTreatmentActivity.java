package com.sugarcoachpremium.di.builder;

import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule;
import com.sugarcoachpremium.ui.treatment.view.TreatmentActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
    subcomponents = ActivityBuilder_BindTreatmentActivity.TreatmentActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilder_BindTreatmentActivity {
  private ActivityBuilder_BindTreatmentActivity() {
  }

  @Binds
  @IntoMap
  @ClassKey(TreatmentActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TreatmentActivitySubcomponent.Factory builder);

  @Subcomponent(
      modules = TreatmentActivityModule.class
  )
  public interface TreatmentActivitySubcomponent extends AndroidInjector<TreatmentActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TreatmentActivity> {
    }
  }
}
