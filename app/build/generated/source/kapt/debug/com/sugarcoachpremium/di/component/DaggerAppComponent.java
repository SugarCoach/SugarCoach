package com.sugarcoachpremium.di.component;

import android.app.Application;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.apollographql.apollo3.ApolloClient;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.sugarcoachpremium.SugarApp;
import com.sugarcoachpremium.SugarApp_MembersInjector;
import com.sugarcoachpremium.data.api_db.ApiRepository;
import com.sugarcoachpremium.data.database.AppDatabase;
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo;
import com.sugarcoachpremium.data.database.repository.treament.TreamentRepo;
import com.sugarcoachpremium.data.database.repository.user.UserRepo;
import com.sugarcoachpremium.data.network.ApiHelper;
import com.sugarcoachpremium.data.preferences.AppPreferenceHelper;
import com.sugarcoachpremium.data.preferences.AppPreferenceHelper_Factory;
import com.sugarcoachpremium.di.builder.ActivityBuilder_BindConfigActivity;
import com.sugarcoachpremium.di.builder.ActivityBuilder_BindDailyActivity;
import com.sugarcoachpremium.di.builder.ActivityBuilder_BindDailyDetailActivity;
import com.sugarcoachpremium.di.builder.ActivityBuilder_BindForgotActivity;
import com.sugarcoachpremium.di.builder.ActivityBuilder_BindLoginActivity;
import com.sugarcoachpremium.di.builder.ActivityBuilder_BindMainActivity;
import com.sugarcoachpremium.di.builder.ActivityBuilder_BindOnBoardingActivity;
import com.sugarcoachpremium.di.builder.ActivityBuilder_BindProfileActivity;
import com.sugarcoachpremium.di.builder.ActivityBuilder_BindRegisterActivity;
import com.sugarcoachpremium.di.builder.ActivityBuilder_BindSignActivity;
import com.sugarcoachpremium.di.builder.ActivityBuilder_BindSignEmailctivity;
import com.sugarcoachpremium.di.builder.ActivityBuilder_BindSplashActivity;
import com.sugarcoachpremium.di.builder.ActivityBuilder_BindStatisticsActivity;
import com.sugarcoachpremium.di.builder.ActivityBuilder_BindTreatmentActivity;
import com.sugarcoachpremium.di.module.AppModule;
import com.sugarcoachpremium.di.module.AppModule_ProvideApiHelper$app_debugFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideApolloClient$app_debugFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideAppDatabase$app_debugFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideCompositeDisposable$app_debugFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideContext$app_debugFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideDailyRepoHelper$app_debugFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvidePrefHelper$app_debugFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideRetrofitFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideSchedulerProvider$app_debugFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideTreamentRepoHelper$app_debugFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideUserRepoHelper$app_debugFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideprefFileName$app_debugFactory;
import com.sugarcoachpremium.di.preferences.PreferenceHelper;
import com.sugarcoachpremium.ui.config.ConfigActivityModule;
import com.sugarcoachpremium.ui.config.ConfigActivityModule_ProvideConfigInteractor$app_debugFactory;
import com.sugarcoachpremium.ui.config.ConfigActivityModule_ProvideConfigPresenter$app_debugFactory;
import com.sugarcoachpremium.ui.config.interactor.ConfigInteractor;
import com.sugarcoachpremium.ui.config.interactor.ConfigInteractorImp;
import com.sugarcoachpremium.ui.config.presenter.ConfigPresenter;
import com.sugarcoachpremium.ui.config.presenter.ConfigPresenterImp;
import com.sugarcoachpremium.ui.config.view.ConfigActivity;
import com.sugarcoachpremium.ui.config.view.ConfigActivity_MembersInjector;
import com.sugarcoachpremium.ui.config.view.ConfigView;
import com.sugarcoachpremium.ui.daily.DailyActivityModule;
import com.sugarcoachpremium.ui.daily.DailyActivityModule_ProvideDailyInteractor$app_debugFactory;
import com.sugarcoachpremium.ui.daily.DailyActivityModule_ProvideDailyPresenter$app_debugFactory;
import com.sugarcoachpremium.ui.daily.DailyActivityModule_ProvideLinearLayoutManager$app_debugFactory;
import com.sugarcoachpremium.ui.daily.interactor.DailyInteractor;
import com.sugarcoachpremium.ui.daily.interactor.DailyInteractorImp;
import com.sugarcoachpremium.ui.daily.presenter.DailyPresenter;
import com.sugarcoachpremium.ui.daily.presenter.DailyPresenterImp;
import com.sugarcoachpremium.ui.daily.view.DailyActivity;
import com.sugarcoachpremium.ui.daily.view.DailyActivity_MembersInjector;
import com.sugarcoachpremium.ui.daily.view.DailyView;
import com.sugarcoachpremium.ui.daily_detail.DailyDetailActivityModule;
import com.sugarcoachpremium.ui.daily_detail.DailyDetailActivityModule_ProvideCategoryAdapter$app_debugFactory;
import com.sugarcoachpremium.ui.daily_detail.DailyDetailActivityModule_ProvideDailyDetailInteractor$app_debugFactory;
import com.sugarcoachpremium.ui.daily_detail.DailyDetailActivityModule_ProvideItemAdapter$app_debugFactory;
import com.sugarcoachpremium.ui.daily_detail.DailyDetailActivityModule_ProvideLinearLayoutManager$app_debugFactory;
import com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp;
import com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInterador;
import com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInterador_Factory;
import com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInterador_MembersInjector;
import com.sugarcoachpremium.ui.daily_detail.presenter.DailyDetailPresenter;
import com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity;
import com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity_MembersInjector;
import com.sugarcoachpremium.ui.daily_detail.view.DailyDetailView;
import com.sugarcoachpremium.ui.forgot.ForgotActivityModule;
import com.sugarcoachpremium.ui.forgot.ForgotActivityModule_ProvideforgotInteractor$app_debugFactory;
import com.sugarcoachpremium.ui.forgot.ForgotActivityModule_ProvideforgotPresenter$app_debugFactory;
import com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractor;
import com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractorImp;
import com.sugarcoachpremium.ui.forgot.presenter.ForgotPresenter;
import com.sugarcoachpremium.ui.forgot.presenter.ForgotPresenterImp;
import com.sugarcoachpremium.ui.forgot.view.ForgotActivity;
import com.sugarcoachpremium.ui.forgot.view.ForgotActivity_MembersInjector;
import com.sugarcoachpremium.ui.forgot.view.ForgotView;
import com.sugarcoachpremium.ui.login.LoginActivityModule;
import com.sugarcoachpremium.ui.login.LoginActivityModule_ProvideloginInteractor$app_debugFactory;
import com.sugarcoachpremium.ui.login.LoginActivityModule_ProvideloginPresenter$app_debugFactory;
import com.sugarcoachpremium.ui.login.interactor.LoginInteractor;
import com.sugarcoachpremium.ui.login.interactor.LoginInteractorImp;
import com.sugarcoachpremium.ui.login.interactor.LoginInteractor_Factory;
import com.sugarcoachpremium.ui.login.interactor.LoginInteractor_MembersInjector;
import com.sugarcoachpremium.ui.login.presenter.LoginPresenter;
import com.sugarcoachpremium.ui.login.presenter.LoginPresenterImp;
import com.sugarcoachpremium.ui.login.view.LoginActivity;
import com.sugarcoachpremium.ui.login.view.LoginActivity_MembersInjector;
import com.sugarcoachpremium.ui.login.view.LoginView;
import com.sugarcoachpremium.ui.main.MainActivityModule;
import com.sugarcoachpremium.ui.main.MainActivityModule_ProvideMainInteractor$app_debugFactory;
import com.sugarcoachpremium.ui.main.MainActivityModule_ProvideMainPresenter$app_debugFactory;
import com.sugarcoachpremium.ui.main.interactor.MainInteractor;
import com.sugarcoachpremium.ui.main.interactor.MainInteractorImp;
import com.sugarcoachpremium.ui.main.presenter.MainPresenter;
import com.sugarcoachpremium.ui.main.presenter.MainPresenterImp;
import com.sugarcoachpremium.ui.main.view.MainActivity;
import com.sugarcoachpremium.ui.main.view.MainActivity_MembersInjector;
import com.sugarcoachpremium.ui.main.view.MainView;
import com.sugarcoachpremium.ui.onboarding.OnBoardingActivityModule;
import com.sugarcoachpremium.ui.onboarding.OnBoardingActivityModule_ProvideBoardingFragmentPagerAdapter$app_debugFactory;
import com.sugarcoachpremium.ui.onboarding.OnBoardingActivityModule_ProvideOnBoardingInteractor$app_debugFactory;
import com.sugarcoachpremium.ui.onboarding.OnBoardingActivityModule_ProvideOnBoardingPresenter$app_debugFactory;
import com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractor;
import com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp;
import com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenter;
import com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenterImp;
import com.sugarcoachpremium.ui.onboarding.view.BoardingFragmentPagerAdapter;
import com.sugarcoachpremium.ui.onboarding.view.OnBoardingActivity;
import com.sugarcoachpremium.ui.onboarding.view.OnBoardingActivity_MembersInjector;
import com.sugarcoachpremium.ui.onboarding.view.OnBoardingView;
import com.sugarcoachpremium.ui.profile.ProfileActivityModule;
import com.sugarcoachpremium.ui.profile.ProfileActivityModule_ProvideGridLayoutManager$app_debugFactory;
import com.sugarcoachpremium.ui.profile.ProfileActivityModule_ProvideProfileAdapter$app_debugFactory;
import com.sugarcoachpremium.ui.profile.ProfileActivityModule_ProvideProfileInteractor$app_debugFactory;
import com.sugarcoachpremium.ui.profile.ProfileActivityModule_ProvideProfilePresenter$app_debugFactory;
import com.sugarcoachpremium.ui.profile.interactor.ProfileInteractor;
import com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp;
import com.sugarcoachpremium.ui.profile.interactor.ProfileInteractor_Factory;
import com.sugarcoachpremium.ui.profile.interactor.ProfileInteractor_MembersInjector;
import com.sugarcoachpremium.ui.profile.presenter.ProfilePresenter;
import com.sugarcoachpremium.ui.profile.presenter.ProfilePresenterImp;
import com.sugarcoachpremium.ui.profile.view.ProfileActivity;
import com.sugarcoachpremium.ui.profile.view.ProfileActivity_MembersInjector;
import com.sugarcoachpremium.ui.profile.view.ProfileAdapter;
import com.sugarcoachpremium.ui.profile.view.ProfileView;
import com.sugarcoachpremium.ui.register.RegisterActivityModule;
import com.sugarcoachpremium.ui.register.RegisterActivityModule_ProvideCategoryAdapter$app_debugFactory;
import com.sugarcoachpremium.ui.register.RegisterActivityModule_ProvideCurrentDate$app_debugFactory;
import com.sugarcoachpremium.ui.register.RegisterActivityModule_ProvideItemAdapter$app_debugFactory;
import com.sugarcoachpremium.ui.register.RegisterActivityModule_ProvideLinearLayoutManager$app_debugFactory;
import com.sugarcoachpremium.ui.register.RegisterActivityModule_ProvideRegisterInteractor$app_debugFactory;
import com.sugarcoachpremium.ui.register.RegisterActivityModule_ProvideRegisterPresenter$app_debugFactory;
import com.sugarcoachpremium.ui.register.interactor.RegisterInteractor;
import com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp;
import com.sugarcoachpremium.ui.register.interactor.RegisterInteractor_Factory;
import com.sugarcoachpremium.ui.register.interactor.RegisterInteractor_MembersInjector;
import com.sugarcoachpremium.ui.register.presenter.RegisterPresenter;
import com.sugarcoachpremium.ui.register.presenter.RegisterPresenterImp;
import com.sugarcoachpremium.ui.register.presenter.RegisterPresenter_Factory;
import com.sugarcoachpremium.ui.register.presenter.RegisterPresenter_MembersInjector;
import com.sugarcoachpremium.ui.register.view.CategoryAdapter;
import com.sugarcoachpremium.ui.register.view.ItemAdapter;
import com.sugarcoachpremium.ui.register.view.RegisterActivity;
import com.sugarcoachpremium.ui.register.view.RegisterActivity_MembersInjector;
import com.sugarcoachpremium.ui.register.view.RegisterView;
import com.sugarcoachpremium.ui.sign.SignActivityModule;
import com.sugarcoachpremium.ui.sign.SignActivityModule_ProvidesignInteractor$app_debugFactory;
import com.sugarcoachpremium.ui.sign.SignActivityModule_ProvidesignPresenter$app_debugFactory;
import com.sugarcoachpremium.ui.sign.interactor.SignInteractor;
import com.sugarcoachpremium.ui.sign.interactor.SignInteractorImp;
import com.sugarcoachpremium.ui.sign.presenter.SignPresenter;
import com.sugarcoachpremium.ui.sign.presenter.SignPresenterImp;
import com.sugarcoachpremium.ui.sign.view.SignActivity;
import com.sugarcoachpremium.ui.sign.view.SignActivity_MembersInjector;
import com.sugarcoachpremium.ui.sign.view.SignView;
import com.sugarcoachpremium.ui.signEmail.SignEmailActivityModule;
import com.sugarcoachpremium.ui.signEmail.SignEmailActivityModule_ProvidesignInteractor$app_debugFactory;
import com.sugarcoachpremium.ui.signEmail.SignEmailActivityModule_ProvidesignPresenter$app_debugFactory;
import com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractor;
import com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractorImp;
import com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractor_Factory;
import com.sugarcoachpremium.ui.signEmail.interactor.SignEmailInteractor_MembersInjector;
import com.sugarcoachpremium.ui.signEmail.presenter.SignEmailPresenter;
import com.sugarcoachpremium.ui.signEmail.presenter.SignEmailPresenterImp;
import com.sugarcoachpremium.ui.signEmail.view.SignEmailActivity;
import com.sugarcoachpremium.ui.signEmail.view.SignEmailActivity_MembersInjector;
import com.sugarcoachpremium.ui.signEmail.view.SignEmailView;
import com.sugarcoachpremium.ui.splash.SplashActivityModule;
import com.sugarcoachpremium.ui.splash.SplashActivityModule_ProvideSplashInteractor$app_debugFactory;
import com.sugarcoachpremium.ui.splash.SplashActivityModule_ProvideSplashPresenter$app_debugFactory;
import com.sugarcoachpremium.ui.splash.interactor.SplashInteractor;
import com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp;
import com.sugarcoachpremium.ui.splash.presenter.SplashPresenter;
import com.sugarcoachpremium.ui.splash.presenter.SplashPresenterImp;
import com.sugarcoachpremium.ui.splash.view.SplashActivity;
import com.sugarcoachpremium.ui.splash.view.SplashActivity_MembersInjector;
import com.sugarcoachpremium.ui.splash.view.SplashView;
import com.sugarcoachpremium.ui.statistics.StatisticsActivityModule;
import com.sugarcoachpremium.ui.statistics.StatisticsActivityModule_ProvideLinearLayoutManager$app_debugFactory;
import com.sugarcoachpremium.ui.statistics.StatisticsActivityModule_ProvideStatisticsAdapter$app_debugFactory;
import com.sugarcoachpremium.ui.statistics.StatisticsActivityModule_ProvideStatisticsInteractor$app_debugFactory;
import com.sugarcoachpremium.ui.statistics.StatisticsActivityModule_ProvideStatisticsPresenter$app_debugFactory;
import com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractor;
import com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp;
import com.sugarcoachpremium.ui.statistics.presenter.StatisticsPresenter;
import com.sugarcoachpremium.ui.statistics.presenter.StatisticsPresenterImp;
import com.sugarcoachpremium.ui.statistics.view.StatisticsActivity;
import com.sugarcoachpremium.ui.statistics.view.StatisticsActivity_MembersInjector;
import com.sugarcoachpremium.ui.statistics.view.StatisticsAdapter;
import com.sugarcoachpremium.ui.statistics.view.StatisticsView;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideBasalAdapter$app_debugFactory;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideBombaAdapter$app_debugFactory;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideLinearLayoutManager$app_debugFactory;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideMedidorAdapter$app_debugFactory;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideTreatmentAdapter$app_debugFactory;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideTreatmentBasalHoraAdapter$app_debugFactory;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideTreatmentCorrectoraAdapter$app_debugFactory;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideTreatmentInteractor$app_debugFactory;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideTreatmentPresenter$app_debugFactory;
import com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractor;
import com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractorImp;
import com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractor_Factory;
import com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractor_MembersInjector;
import com.sugarcoachpremium.ui.treatment.presenter.TreatmentPresenter;
import com.sugarcoachpremium.ui.treatment.presenter.TreatmentPresenterImp;
import com.sugarcoachpremium.ui.treatment.view.BasalAdapter;
import com.sugarcoachpremium.ui.treatment.view.BombaAdapter;
import com.sugarcoachpremium.ui.treatment.view.MedidorAdapter;
import com.sugarcoachpremium.ui.treatment.view.TreatmentActivity;
import com.sugarcoachpremium.ui.treatment.view.TreatmentActivity_MembersInjector;
import com.sugarcoachpremium.ui.treatment.view.TreatmentAdapter;
import com.sugarcoachpremium.ui.treatment.view.TreatmentBasalHoraAdapter;
import com.sugarcoachpremium.ui.treatment.view.TreatmentCorrectoraAdapter;
import com.sugarcoachpremium.ui.treatment.view.TreatmentView;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Map;
import javax.annotation.processing.Generated;
import retrofit2.Retrofit;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class DaggerAppComponent {
  private DaggerAppComponent() {
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private static final class Builder implements AppComponent.Builder {
    private Application application;

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(application, Application.class);
      return new AppComponentImpl(new AppModule(), application);
    }
  }

  private static final class SplashActivitySubcomponentFactory implements ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private SplashActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent create(
        SplashActivity instance) {
      Preconditions.checkNotNull(instance);
      return new SplashActivitySubcomponentImpl(appComponentImpl, new SplashActivityModule(), instance);
    }
  }

  private static final class MainActivitySubcomponentFactory implements ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private MainActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindMainActivity.MainActivitySubcomponent create(MainActivity instance) {
      Preconditions.checkNotNull(instance);
      return new MainActivitySubcomponentImpl(appComponentImpl, new MainActivityModule(), instance);
    }
  }

  private static final class RegisterActivitySubcomponentFactory implements ActivityBuilder_BindRegisterActivity.RegisterActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private RegisterActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindRegisterActivity.RegisterActivitySubcomponent create(
        RegisterActivity instance) {
      Preconditions.checkNotNull(instance);
      return new RegisterActivitySubcomponentImpl(appComponentImpl, new RegisterActivityModule(), instance);
    }
  }

  private static final class TreatmentActivitySubcomponentFactory implements ActivityBuilder_BindTreatmentActivity.TreatmentActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private TreatmentActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindTreatmentActivity.TreatmentActivitySubcomponent create(
        TreatmentActivity instance) {
      Preconditions.checkNotNull(instance);
      return new TreatmentActivitySubcomponentImpl(appComponentImpl, new TreatmentActivityModule(), instance);
    }
  }

  private static final class LoginActivitySubcomponentFactory implements ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private LoginActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent create(
        LoginActivity instance) {
      Preconditions.checkNotNull(instance);
      return new LoginActivitySubcomponentImpl(appComponentImpl, new LoginActivityModule(), instance);
    }
  }

  private static final class SignActivitySubcomponentFactory implements ActivityBuilder_BindSignActivity.SignActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private SignActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindSignActivity.SignActivitySubcomponent create(SignActivity instance) {
      Preconditions.checkNotNull(instance);
      return new SignActivitySubcomponentImpl(appComponentImpl, new SignActivityModule(), instance);
    }
  }

  private static final class SignEmailActivitySubcomponentFactory implements ActivityBuilder_BindSignEmailctivity.SignEmailActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private SignEmailActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindSignEmailctivity.SignEmailActivitySubcomponent create(
        SignEmailActivity instance) {
      Preconditions.checkNotNull(instance);
      return new SignEmailActivitySubcomponentImpl(appComponentImpl, new SignEmailActivityModule(), instance);
    }
  }

  private static final class OnBoardingActivitySubcomponentFactory implements ActivityBuilder_BindOnBoardingActivity.OnBoardingActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private OnBoardingActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindOnBoardingActivity.OnBoardingActivitySubcomponent create(
        OnBoardingActivity instance) {
      Preconditions.checkNotNull(instance);
      return new OnBoardingActivitySubcomponentImpl(appComponentImpl, new OnBoardingActivityModule(), instance);
    }
  }

  private static final class DailyActivitySubcomponentFactory implements ActivityBuilder_BindDailyActivity.DailyActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private DailyActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindDailyActivity.DailyActivitySubcomponent create(
        DailyActivity instance) {
      Preconditions.checkNotNull(instance);
      return new DailyActivitySubcomponentImpl(appComponentImpl, new DailyActivityModule(), instance);
    }
  }

  private static final class DailyDetailActivitySubcomponentFactory implements ActivityBuilder_BindDailyDetailActivity.DailyDetailActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private DailyDetailActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindDailyDetailActivity.DailyDetailActivitySubcomponent create(
        DailyDetailActivity instance) {
      Preconditions.checkNotNull(instance);
      return new DailyDetailActivitySubcomponentImpl(appComponentImpl, new DailyDetailActivityModule(), instance);
    }
  }

  private static final class ProfileActivitySubcomponentFactory implements ActivityBuilder_BindProfileActivity.ProfileActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private ProfileActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindProfileActivity.ProfileActivitySubcomponent create(
        ProfileActivity instance) {
      Preconditions.checkNotNull(instance);
      return new ProfileActivitySubcomponentImpl(appComponentImpl, new ProfileActivityModule(), instance);
    }
  }

  private static final class ConfigActivitySubcomponentFactory implements ActivityBuilder_BindConfigActivity.ConfigActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private ConfigActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindConfigActivity.ConfigActivitySubcomponent create(
        ConfigActivity instance) {
      Preconditions.checkNotNull(instance);
      return new ConfigActivitySubcomponentImpl(appComponentImpl, new ConfigActivityModule(), instance);
    }
  }

  private static final class StatisticsActivitySubcomponentFactory implements ActivityBuilder_BindStatisticsActivity.StatisticsActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private StatisticsActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindStatisticsActivity.StatisticsActivitySubcomponent create(
        StatisticsActivity instance) {
      Preconditions.checkNotNull(instance);
      return new StatisticsActivitySubcomponentImpl(appComponentImpl, new StatisticsActivityModule(), instance);
    }
  }

  private static final class ForgotActivitySubcomponentFactory implements ActivityBuilder_BindForgotActivity.ForgotActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private ForgotActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindForgotActivity.ForgotActivitySubcomponent create(
        ForgotActivity instance) {
      Preconditions.checkNotNull(instance);
      return new ForgotActivitySubcomponentImpl(appComponentImpl, new ForgotActivityModule(), instance);
    }
  }

  private static final class SplashActivitySubcomponentImpl implements ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent {
    private final SplashActivityModule splashActivityModule;

    private final AppComponentImpl appComponentImpl;

    private final SplashActivitySubcomponentImpl splashActivitySubcomponentImpl = this;

    SplashActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        SplashActivityModule splashActivityModuleParam, SplashActivity instanceParam) {
      this.appComponentImpl = appComponentImpl;
      this.splashActivityModule = splashActivityModuleParam;

    }

    SplashInteractor splashInteractor() {
      return new SplashInteractor(appComponentImpl.provideContext$app_debugProvider.get(), appComponentImpl.provideDailyRepoHelper$app_debugProvider.get(), appComponentImpl.provideTreamentRepoHelper$app_debugProvider.get(), appComponentImpl.provideUserRepoHelper$app_debugProvider.get(), appComponentImpl.providePrefHelper$app_debugProvider.get(), appComponentImpl.provideApiHelper$app_debugProvider.get());
    }

    SplashInteractorImp splashInteractorImp() {
      return SplashActivityModule_ProvideSplashInteractor$app_debugFactory.provideSplashInteractor$app_debug(splashActivityModule, splashInteractor());
    }

    SplashPresenter<SplashView, SplashInteractorImp> splashPresenterOfSplashViewAndSplashInteractorImp(
        ) {
      return new SplashPresenter<SplashView, SplashInteractorImp>(splashInteractorImp(), AppModule_ProvideSchedulerProvider$app_debugFactory.provideSchedulerProvider$app_debug(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_debugFactory.provideCompositeDisposable$app_debug(appComponentImpl.appModule));
    }

    SplashPresenterImp<SplashView, SplashInteractorImp> splashPresenterImpOfSplashViewAndSplashInteractorImp(
        ) {
      return SplashActivityModule_ProvideSplashPresenter$app_debugFactory.provideSplashPresenter$app_debug(splashActivityModule, splashPresenterOfSplashViewAndSplashInteractorImp());
    }

    @Override
    public void inject(SplashActivity instance) {
      injectSplashActivity(instance);
    }

    @CanIgnoreReturnValue
    private SplashActivity injectSplashActivity(SplashActivity instance) {
      SplashActivity_MembersInjector.injectPresenter(instance, splashPresenterImpOfSplashViewAndSplashInteractorImp());
      return instance;
    }
  }

  private static final class MainActivitySubcomponentImpl implements ActivityBuilder_BindMainActivity.MainActivitySubcomponent {
    private final MainActivityModule mainActivityModule;

    private final AppComponentImpl appComponentImpl;

    private final MainActivitySubcomponentImpl mainActivitySubcomponentImpl = this;

    MainActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        MainActivityModule mainActivityModuleParam, MainActivity instanceParam) {
      this.appComponentImpl = appComponentImpl;
      this.mainActivityModule = mainActivityModuleParam;

    }

    MainInteractor mainInteractor() {
      return new MainInteractor(appComponentImpl.provideTreamentRepoHelper$app_debugProvider.get(), appComponentImpl.provideDailyRepoHelper$app_debugProvider.get(), appComponentImpl.provideAppDatabase$app_debugProvider.get(), appComponentImpl.provideUserRepoHelper$app_debugProvider.get(), appComponentImpl.providePrefHelper$app_debugProvider.get(), appComponentImpl.provideApiHelper$app_debugProvider.get());
    }

    MainInteractorImp mainInteractorImp() {
      return MainActivityModule_ProvideMainInteractor$app_debugFactory.provideMainInteractor$app_debug(mainActivityModule, mainInteractor());
    }

    MainPresenter<MainView, MainInteractorImp> mainPresenterOfMainViewAndMainInteractorImp() {
      return new MainPresenter<MainView, MainInteractorImp>(mainInteractorImp(), AppModule_ProvideSchedulerProvider$app_debugFactory.provideSchedulerProvider$app_debug(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_debugFactory.provideCompositeDisposable$app_debug(appComponentImpl.appModule));
    }

    MainPresenterImp<MainView, MainInteractorImp> mainPresenterImpOfMainViewAndMainInteractorImp() {
      return MainActivityModule_ProvideMainPresenter$app_debugFactory.provideMainPresenter$app_debug(mainActivityModule, mainPresenterOfMainViewAndMainInteractorImp());
    }

    ApiRepository apiRepository() {
      return new ApiRepository(appComponentImpl.provideApolloClient$app_debugProvider.get());
    }

    @Override
    public void inject(MainActivity instance) {
      injectMainActivity(instance);
    }

    @CanIgnoreReturnValue
    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectPresenter(instance, mainPresenterImpOfMainViewAndMainInteractorImp());
      MainActivity_MembersInjector.injectApiRepository(instance, apiRepository());
      return instance;
    }
  }

  private static final class RegisterActivitySubcomponentImpl implements ActivityBuilder_BindRegisterActivity.RegisterActivitySubcomponent {
    private final RegisterActivityModule registerActivityModule;

    private final RegisterActivity instance4;

    private final AppComponentImpl appComponentImpl;

    private final RegisterActivitySubcomponentImpl registerActivitySubcomponentImpl = this;

    RegisterActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        RegisterActivityModule registerActivityModuleParam, RegisterActivity instanceParam) {
      this.appComponentImpl = appComponentImpl;
      this.registerActivityModule = registerActivityModuleParam;
      this.instance4 = instanceParam;

    }

    ApiRepository apiRepository() {
      return new ApiRepository(appComponentImpl.provideApolloClient$app_debugProvider.get());
    }

    RegisterInteractor registerInteractor() {
      return injectRegisterInteractor(RegisterInteractor_Factory.newInstance(appComponentImpl.provideTreamentRepoHelper$app_debugProvider.get(), appComponentImpl.provideDailyRepoHelper$app_debugProvider.get(), appComponentImpl.provideUserRepoHelper$app_debugProvider.get(), appComponentImpl.providePrefHelper$app_debugProvider.get(), appComponentImpl.provideApiHelper$app_debugProvider.get()));
    }

    RegisterInteractorImp registerInteractorImp() {
      return RegisterActivityModule_ProvideRegisterInteractor$app_debugFactory.provideRegisterInteractor$app_debug(registerActivityModule, registerInteractor());
    }

    RegisterPresenter<RegisterView, RegisterInteractorImp> registerPresenterOfRegisterViewAndRegisterInteractorImp(
        ) {
      return injectRegisterPresenter(RegisterPresenter_Factory.newInstance(registerInteractorImp(), AppModule_ProvideSchedulerProvider$app_debugFactory.provideSchedulerProvider$app_debug(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_debugFactory.provideCompositeDisposable$app_debug(appComponentImpl.appModule)));
    }

    RegisterPresenterImp<RegisterView, RegisterInteractorImp> registerPresenterImpOfRegisterViewAndRegisterInteractorImp(
        ) {
      return RegisterActivityModule_ProvideRegisterPresenter$app_debugFactory.provideRegisterPresenter$app_debug(registerActivityModule, registerPresenterOfRegisterViewAndRegisterInteractorImp());
    }

    LinearLayoutManager linearLayoutManager() {
      return RegisterActivityModule_ProvideLinearLayoutManager$app_debugFactory.provideLinearLayoutManager$app_debug(registerActivityModule, instance4);
    }

    ItemAdapter itemAdapter() {
      return RegisterActivityModule_ProvideItemAdapter$app_debugFactory.provideItemAdapter$app_debug(registerActivityModule, instance4);
    }

    CategoryAdapter categoryAdapter() {
      return RegisterActivityModule_ProvideCategoryAdapter$app_debugFactory.provideCategoryAdapter$app_debug(registerActivityModule, instance4);
    }

    @Override
    public void inject(RegisterActivity instance) {
      injectRegisterActivity(instance);
    }

    @CanIgnoreReturnValue
    private RegisterInteractor injectRegisterInteractor(RegisterInteractor instance2) {
      RegisterInteractor_MembersInjector.injectApiRepository(instance2, apiRepository());
      return instance2;
    }

    @CanIgnoreReturnValue
    private RegisterPresenter<RegisterView, RegisterInteractorImp> injectRegisterPresenter(
        RegisterPresenter<RegisterView, RegisterInteractorImp> instance3) {
      RegisterPresenter_MembersInjector.injectDate(instance3, RegisterActivityModule_ProvideCurrentDate$app_debugFactory.provideCurrentDate$app_debug(registerActivityModule));
      return instance3;
    }

    @CanIgnoreReturnValue
    private RegisterActivity injectRegisterActivity(RegisterActivity instance) {
      RegisterActivity_MembersInjector.injectPresenter(instance, registerPresenterImpOfRegisterViewAndRegisterInteractorImp());
      RegisterActivity_MembersInjector.injectManager(instance, linearLayoutManager());
      RegisterActivity_MembersInjector.injectManagerEmotions(instance, linearLayoutManager());
      RegisterActivity_MembersInjector.injectManagerExercices(instance, linearLayoutManager());
      RegisterActivity_MembersInjector.injectAdapterEmotions(instance, itemAdapter());
      RegisterActivity_MembersInjector.injectAdapterExercices(instance, itemAdapter());
      RegisterActivity_MembersInjector.injectAdapter(instance, categoryAdapter());
      return instance;
    }
  }

  private static final class TreatmentActivitySubcomponentImpl implements ActivityBuilder_BindTreatmentActivity.TreatmentActivitySubcomponent {
    private final TreatmentActivityModule treatmentActivityModule;

    private final TreatmentActivity instance3;

    private final AppComponentImpl appComponentImpl;

    private final TreatmentActivitySubcomponentImpl treatmentActivitySubcomponentImpl = this;

    TreatmentActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        TreatmentActivityModule treatmentActivityModuleParam, TreatmentActivity instanceParam) {
      this.appComponentImpl = appComponentImpl;
      this.treatmentActivityModule = treatmentActivityModuleParam;
      this.instance3 = instanceParam;

    }

    ApiRepository apiRepository() {
      return new ApiRepository(appComponentImpl.provideApolloClient$app_debugProvider.get());
    }

    TreatmentInteractor treatmentInteractor() {
      return injectTreatmentInteractor(TreatmentInteractor_Factory.newInstance(appComponentImpl.provideTreamentRepoHelper$app_debugProvider.get(), appComponentImpl.provideDailyRepoHelper$app_debugProvider.get(), appComponentImpl.provideUserRepoHelper$app_debugProvider.get(), appComponentImpl.providePrefHelper$app_debugProvider.get(), appComponentImpl.provideApiHelper$app_debugProvider.get()));
    }

    TreatmentInteractorImp treatmentInteractorImp() {
      return TreatmentActivityModule_ProvideTreatmentInteractor$app_debugFactory.provideTreatmentInteractor$app_debug(treatmentActivityModule, treatmentInteractor());
    }

    TreatmentPresenter<TreatmentView, TreatmentInteractorImp> treatmentPresenterOfTreatmentViewAndTreatmentInteractorImp(
        ) {
      return new TreatmentPresenter<TreatmentView, TreatmentInteractorImp>(treatmentInteractorImp(), AppModule_ProvideSchedulerProvider$app_debugFactory.provideSchedulerProvider$app_debug(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_debugFactory.provideCompositeDisposable$app_debug(appComponentImpl.appModule));
    }

    TreatmentPresenterImp<TreatmentView, TreatmentInteractorImp> treatmentPresenterImpOfTreatmentViewAndTreatmentInteractorImp(
        ) {
      return TreatmentActivityModule_ProvideTreatmentPresenter$app_debugFactory.provideTreatmentPresenter$app_debug(treatmentActivityModule, treatmentPresenterOfTreatmentViewAndTreatmentInteractorImp());
    }

    LinearLayoutManager linearLayoutManager() {
      return TreatmentActivityModule_ProvideLinearLayoutManager$app_debugFactory.provideLinearLayoutManager$app_debug(treatmentActivityModule, instance3);
    }

    BasalAdapter basalAdapter() {
      return TreatmentActivityModule_ProvideBasalAdapter$app_debugFactory.provideBasalAdapter$app_debug(treatmentActivityModule, instance3);
    }

    MedidorAdapter medidorAdapter() {
      return TreatmentActivityModule_ProvideMedidorAdapter$app_debugFactory.provideMedidorAdapter$app_debug(treatmentActivityModule, instance3);
    }

    BombaAdapter bombaAdapter() {
      return TreatmentActivityModule_ProvideBombaAdapter$app_debugFactory.provideBombaAdapter$app_debug(treatmentActivityModule, instance3);
    }

    TreatmentAdapter treatmentAdapter() {
      return TreatmentActivityModule_ProvideTreatmentAdapter$app_debugFactory.provideTreatmentAdapter$app_debug(treatmentActivityModule, instance3);
    }

    TreatmentCorrectoraAdapter treatmentCorrectoraAdapter() {
      return TreatmentActivityModule_ProvideTreatmentCorrectoraAdapter$app_debugFactory.provideTreatmentCorrectoraAdapter$app_debug(treatmentActivityModule, instance3);
    }

    TreatmentBasalHoraAdapter treatmentBasalHoraAdapter() {
      return TreatmentActivityModule_ProvideTreatmentBasalHoraAdapter$app_debugFactory.provideTreatmentBasalHoraAdapter$app_debug(treatmentActivityModule, instance3);
    }

    @Override
    public void inject(TreatmentActivity instance) {
      injectTreatmentActivity(instance);
    }

    @CanIgnoreReturnValue
    private TreatmentInteractor injectTreatmentInteractor(TreatmentInteractor instance2) {
      TreatmentInteractor_MembersInjector.injectApiRepository(instance2, apiRepository());
      return instance2;
    }

    @CanIgnoreReturnValue
    private TreatmentActivity injectTreatmentActivity(TreatmentActivity instance) {
      TreatmentActivity_MembersInjector.injectPresenter(instance, treatmentPresenterImpOfTreatmentViewAndTreatmentInteractorImp());
      TreatmentActivity_MembersInjector.injectLinearLayoutManager(instance, linearLayoutManager());
      TreatmentActivity_MembersInjector.injectManager(instance, linearLayoutManager());
      TreatmentActivity_MembersInjector.injectCmanager(instance, linearLayoutManager());
      TreatmentActivity_MembersInjector.injectLmanager(instance, linearLayoutManager());
      TreatmentActivity_MembersInjector.injectHoramanager(instance, linearLayoutManager());
      TreatmentActivity_MembersInjector.injectMedidorManager(instance, linearLayoutManager());
      TreatmentActivity_MembersInjector.injectBombaManager(instance, linearLayoutManager());
      TreatmentActivity_MembersInjector.injectAdapter(instance, basalAdapter());
      TreatmentActivity_MembersInjector.injectAdapterCorrectora(instance, basalAdapter());
      TreatmentActivity_MembersInjector.injectAdapterMedidor(instance, medidorAdapter());
      TreatmentActivity_MembersInjector.injectAdapterBomba(instance, bombaAdapter());
      TreatmentActivity_MembersInjector.injectAdapterCategory(instance, treatmentAdapter());
      TreatmentActivity_MembersInjector.injectAdapterCategoryCorrectora(instance, treatmentCorrectoraAdapter());
      TreatmentActivity_MembersInjector.injectAdapterBasalHoraAdapter(instance, treatmentBasalHoraAdapter());
      return instance;
    }
  }

  private static final class LoginActivitySubcomponentImpl implements ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent {
    private final LoginActivityModule loginActivityModule;

    private final AppComponentImpl appComponentImpl;

    private final LoginActivitySubcomponentImpl loginActivitySubcomponentImpl = this;

    LoginActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        LoginActivityModule loginActivityModuleParam, LoginActivity instanceParam) {
      this.appComponentImpl = appComponentImpl;
      this.loginActivityModule = loginActivityModuleParam;

    }

    ApiRepository apiRepository() {
      return new ApiRepository(appComponentImpl.provideApolloClient$app_debugProvider.get());
    }

    LoginInteractor loginInteractor() {
      return injectLoginInteractor(LoginInteractor_Factory.newInstance(appComponentImpl.provideContext$app_debugProvider.get(), appComponentImpl.provideDailyRepoHelper$app_debugProvider.get(), appComponentImpl.provideTreamentRepoHelper$app_debugProvider.get(), appComponentImpl.provideUserRepoHelper$app_debugProvider.get(), appComponentImpl.providePrefHelper$app_debugProvider.get(), appComponentImpl.provideApiHelper$app_debugProvider.get()));
    }

    LoginInteractorImp loginInteractorImp() {
      return LoginActivityModule_ProvideloginInteractor$app_debugFactory.provideloginInteractor$app_debug(loginActivityModule, loginInteractor());
    }

    LoginPresenter<LoginView, LoginInteractorImp> loginPresenterOfLoginViewAndLoginInteractorImp() {
      return new LoginPresenter<LoginView, LoginInteractorImp>(loginInteractorImp(), AppModule_ProvideSchedulerProvider$app_debugFactory.provideSchedulerProvider$app_debug(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_debugFactory.provideCompositeDisposable$app_debug(appComponentImpl.appModule));
    }

    LoginPresenterImp<LoginView, LoginInteractorImp> loginPresenterImpOfLoginViewAndLoginInteractorImp(
        ) {
      return LoginActivityModule_ProvideloginPresenter$app_debugFactory.provideloginPresenter$app_debug(loginActivityModule, loginPresenterOfLoginViewAndLoginInteractorImp());
    }

    @Override
    public void inject(LoginActivity instance) {
      injectLoginActivity(instance);
    }

    @CanIgnoreReturnValue
    private LoginInteractor injectLoginInteractor(LoginInteractor instance2) {
      LoginInteractor_MembersInjector.injectApiRepository(instance2, apiRepository());
      return instance2;
    }

    @CanIgnoreReturnValue
    private LoginActivity injectLoginActivity(LoginActivity instance) {
      LoginActivity_MembersInjector.injectPresenter(instance, loginPresenterImpOfLoginViewAndLoginInteractorImp());
      return instance;
    }
  }

  private static final class SignActivitySubcomponentImpl implements ActivityBuilder_BindSignActivity.SignActivitySubcomponent {
    private final SignActivityModule signActivityModule;

    private final AppComponentImpl appComponentImpl;

    private final SignActivitySubcomponentImpl signActivitySubcomponentImpl = this;

    SignActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        SignActivityModule signActivityModuleParam, SignActivity instanceParam) {
      this.appComponentImpl = appComponentImpl;
      this.signActivityModule = signActivityModuleParam;

    }

    SignInteractor signInteractor() {
      return new SignInteractor(appComponentImpl.provideUserRepoHelper$app_debugProvider.get(), appComponentImpl.providePrefHelper$app_debugProvider.get(), appComponentImpl.provideApiHelper$app_debugProvider.get());
    }

    SignInteractorImp signInteractorImp() {
      return SignActivityModule_ProvidesignInteractor$app_debugFactory.providesignInteractor$app_debug(signActivityModule, signInteractor());
    }

    SignPresenter<SignView, SignInteractorImp> signPresenterOfSignViewAndSignInteractorImp() {
      return new SignPresenter<SignView, SignInteractorImp>(signInteractorImp(), AppModule_ProvideSchedulerProvider$app_debugFactory.provideSchedulerProvider$app_debug(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_debugFactory.provideCompositeDisposable$app_debug(appComponentImpl.appModule));
    }

    SignPresenterImp<SignView, SignInteractorImp> signPresenterImpOfSignViewAndSignInteractorImp() {
      return SignActivityModule_ProvidesignPresenter$app_debugFactory.providesignPresenter$app_debug(signActivityModule, signPresenterOfSignViewAndSignInteractorImp());
    }

    @Override
    public void inject(SignActivity instance) {
      injectSignActivity(instance);
    }

    @CanIgnoreReturnValue
    private SignActivity injectSignActivity(SignActivity instance) {
      SignActivity_MembersInjector.injectPresenter(instance, signPresenterImpOfSignViewAndSignInteractorImp());
      return instance;
    }
  }

  private static final class SignEmailActivitySubcomponentImpl implements ActivityBuilder_BindSignEmailctivity.SignEmailActivitySubcomponent {
    private final SignEmailActivityModule signEmailActivityModule;

    private final AppComponentImpl appComponentImpl;

    private final SignEmailActivitySubcomponentImpl signEmailActivitySubcomponentImpl = this;

    SignEmailActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        SignEmailActivityModule signEmailActivityModuleParam, SignEmailActivity instanceParam) {
      this.appComponentImpl = appComponentImpl;
      this.signEmailActivityModule = signEmailActivityModuleParam;

    }

    ApiRepository apiRepository() {
      return new ApiRepository(appComponentImpl.provideApolloClient$app_debugProvider.get());
    }

    SignEmailInteractor signEmailInteractor() {
      return injectSignEmailInteractor(SignEmailInteractor_Factory.newInstance(appComponentImpl.provideContext$app_debugProvider.get(), appComponentImpl.provideTreamentRepoHelper$app_debugProvider.get(), appComponentImpl.provideDailyRepoHelper$app_debugProvider.get(), appComponentImpl.provideUserRepoHelper$app_debugProvider.get(), appComponentImpl.providePrefHelper$app_debugProvider.get(), appComponentImpl.provideApiHelper$app_debugProvider.get()));
    }

    SignEmailInteractorImp signEmailInteractorImp() {
      return SignEmailActivityModule_ProvidesignInteractor$app_debugFactory.providesignInteractor$app_debug(signEmailActivityModule, signEmailInteractor());
    }

    SignEmailPresenter<SignEmailView, SignEmailInteractorImp> signEmailPresenterOfSignEmailViewAndSignEmailInteractorImp(
        ) {
      return new SignEmailPresenter<SignEmailView, SignEmailInteractorImp>(signEmailInteractorImp(), AppModule_ProvideSchedulerProvider$app_debugFactory.provideSchedulerProvider$app_debug(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_debugFactory.provideCompositeDisposable$app_debug(appComponentImpl.appModule));
    }

    SignEmailPresenterImp<SignEmailView, SignEmailInteractorImp> signEmailPresenterImpOfSignEmailViewAndSignEmailInteractorImp(
        ) {
      return SignEmailActivityModule_ProvidesignPresenter$app_debugFactory.providesignPresenter$app_debug(signEmailActivityModule, signEmailPresenterOfSignEmailViewAndSignEmailInteractorImp());
    }

    @Override
    public void inject(SignEmailActivity instance) {
      injectSignEmailActivity(instance);
    }

    @CanIgnoreReturnValue
    private SignEmailInteractor injectSignEmailInteractor(SignEmailInteractor instance2) {
      SignEmailInteractor_MembersInjector.injectApiRepository(instance2, apiRepository());
      return instance2;
    }

    @CanIgnoreReturnValue
    private SignEmailActivity injectSignEmailActivity(SignEmailActivity instance) {
      SignEmailActivity_MembersInjector.injectPresenter(instance, signEmailPresenterImpOfSignEmailViewAndSignEmailInteractorImp());
      return instance;
    }
  }

  private static final class OnBoardingActivitySubcomponentImpl implements ActivityBuilder_BindOnBoardingActivity.OnBoardingActivitySubcomponent {
    private final OnBoardingActivityModule onBoardingActivityModule;

    private final OnBoardingActivity instance2;

    private final AppComponentImpl appComponentImpl;

    private final OnBoardingActivitySubcomponentImpl onBoardingActivitySubcomponentImpl = this;

    OnBoardingActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        OnBoardingActivityModule onBoardingActivityModuleParam, OnBoardingActivity instanceParam) {
      this.appComponentImpl = appComponentImpl;
      this.onBoardingActivityModule = onBoardingActivityModuleParam;
      this.instance2 = instanceParam;

    }

    OnBoardingInteractor onBoardingInteractor() {
      return new OnBoardingInteractor(appComponentImpl.provideUserRepoHelper$app_debugProvider.get(), appComponentImpl.providePrefHelper$app_debugProvider.get(), appComponentImpl.provideApiHelper$app_debugProvider.get());
    }

    OnBoardingInteractorImp onBoardingInteractorImp() {
      return OnBoardingActivityModule_ProvideOnBoardingInteractor$app_debugFactory.provideOnBoardingInteractor$app_debug(onBoardingActivityModule, onBoardingInteractor());
    }

    OnBoardingPresenter<OnBoardingView, OnBoardingInteractorImp> onBoardingPresenterOfOnBoardingViewAndOnBoardingInteractorImp(
        ) {
      return new OnBoardingPresenter<OnBoardingView, OnBoardingInteractorImp>(onBoardingInteractorImp(), AppModule_ProvideSchedulerProvider$app_debugFactory.provideSchedulerProvider$app_debug(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_debugFactory.provideCompositeDisposable$app_debug(appComponentImpl.appModule));
    }

    OnBoardingPresenterImp<OnBoardingView, OnBoardingInteractorImp> onBoardingPresenterImpOfOnBoardingViewAndOnBoardingInteractorImp(
        ) {
      return OnBoardingActivityModule_ProvideOnBoardingPresenter$app_debugFactory.provideOnBoardingPresenter$app_debug(onBoardingActivityModule, onBoardingPresenterOfOnBoardingViewAndOnBoardingInteractorImp());
    }

    BoardingFragmentPagerAdapter boardingFragmentPagerAdapter() {
      return OnBoardingActivityModule_ProvideBoardingFragmentPagerAdapter$app_debugFactory.provideBoardingFragmentPagerAdapter$app_debug(onBoardingActivityModule, instance2);
    }

    @Override
    public void inject(OnBoardingActivity instance) {
      injectOnBoardingActivity(instance);
    }

    @CanIgnoreReturnValue
    private OnBoardingActivity injectOnBoardingActivity(OnBoardingActivity instance) {
      OnBoardingActivity_MembersInjector.injectPresenter(instance, onBoardingPresenterImpOfOnBoardingViewAndOnBoardingInteractorImp());
      OnBoardingActivity_MembersInjector.injectAdapter(instance, boardingFragmentPagerAdapter());
      return instance;
    }
  }

  private static final class DailyActivitySubcomponentImpl implements ActivityBuilder_BindDailyActivity.DailyActivitySubcomponent {
    private final DailyActivityModule dailyActivityModule;

    private final DailyActivity instance2;

    private final AppComponentImpl appComponentImpl;

    private final DailyActivitySubcomponentImpl dailyActivitySubcomponentImpl = this;

    DailyActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        DailyActivityModule dailyActivityModuleParam, DailyActivity instanceParam) {
      this.appComponentImpl = appComponentImpl;
      this.dailyActivityModule = dailyActivityModuleParam;
      this.instance2 = instanceParam;

    }

    DailyInteractor dailyInteractor() {
      return new DailyInteractor(appComponentImpl.provideTreamentRepoHelper$app_debugProvider.get(), appComponentImpl.provideDailyRepoHelper$app_debugProvider.get(), appComponentImpl.provideUserRepoHelper$app_debugProvider.get(), appComponentImpl.providePrefHelper$app_debugProvider.get(), appComponentImpl.provideApiHelper$app_debugProvider.get());
    }

    DailyInteractorImp dailyInteractorImp() {
      return DailyActivityModule_ProvideDailyInteractor$app_debugFactory.provideDailyInteractor$app_debug(dailyActivityModule, dailyInteractor());
    }

    DailyPresenter<DailyView, DailyInteractorImp> dailyPresenterOfDailyViewAndDailyInteractorImp() {
      return new DailyPresenter<DailyView, DailyInteractorImp>(dailyInteractorImp(), AppModule_ProvideSchedulerProvider$app_debugFactory.provideSchedulerProvider$app_debug(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_debugFactory.provideCompositeDisposable$app_debug(appComponentImpl.appModule));
    }

    DailyPresenterImp<DailyView, DailyInteractorImp> dailyPresenterImpOfDailyViewAndDailyInteractorImp(
        ) {
      return DailyActivityModule_ProvideDailyPresenter$app_debugFactory.provideDailyPresenter$app_debug(dailyActivityModule, dailyPresenterOfDailyViewAndDailyInteractorImp());
    }

    LinearLayoutManager linearLayoutManager() {
      return DailyActivityModule_ProvideLinearLayoutManager$app_debugFactory.provideLinearLayoutManager$app_debug(dailyActivityModule, instance2);
    }

    @Override
    public void inject(DailyActivity instance) {
      injectDailyActivity(instance);
    }

    @CanIgnoreReturnValue
    private DailyActivity injectDailyActivity(DailyActivity instance) {
      DailyActivity_MembersInjector.injectPresenter(instance, dailyPresenterImpOfDailyViewAndDailyInteractorImp());
      DailyActivity_MembersInjector.injectLinearLayoutManager(instance, linearLayoutManager());
      return instance;
    }
  }

  private static final class DailyDetailActivitySubcomponentImpl implements ActivityBuilder_BindDailyDetailActivity.DailyDetailActivitySubcomponent {
    private final DailyDetailActivityModule dailyDetailActivityModule;

    private final DailyDetailActivity instance3;

    private final AppComponentImpl appComponentImpl;

    private final DailyDetailActivitySubcomponentImpl dailyDetailActivitySubcomponentImpl = this;

    DailyDetailActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        DailyDetailActivityModule dailyDetailActivityModuleParam,
        DailyDetailActivity instanceParam) {
      this.appComponentImpl = appComponentImpl;
      this.dailyDetailActivityModule = dailyDetailActivityModuleParam;
      this.instance3 = instanceParam;

    }

    ApiRepository apiRepository() {
      return new ApiRepository(appComponentImpl.provideApolloClient$app_debugProvider.get());
    }

    DailyDetailInterador dailyDetailInterador() {
      return injectDailyDetailInterador(DailyDetailInterador_Factory.newInstance(appComponentImpl.provideTreamentRepoHelper$app_debugProvider.get(), appComponentImpl.provideDailyRepoHelper$app_debugProvider.get(), appComponentImpl.provideUserRepoHelper$app_debugProvider.get(), appComponentImpl.providePrefHelper$app_debugProvider.get(), appComponentImpl.provideApiHelper$app_debugProvider.get()));
    }

    DailyDetailInteractorImp dailyDetailInteractorImp() {
      return DailyDetailActivityModule_ProvideDailyDetailInteractor$app_debugFactory.provideDailyDetailInteractor$app_debug(dailyDetailActivityModule, dailyDetailInterador());
    }

    DailyDetailPresenter<DailyDetailView, DailyDetailInteractorImp> dailyDetailPresenterOfDailyDetailViewAndDailyDetailInteractorImp(
        ) {
      return new DailyDetailPresenter<DailyDetailView, DailyDetailInteractorImp>(dailyDetailInteractorImp(), AppModule_ProvideSchedulerProvider$app_debugFactory.provideSchedulerProvider$app_debug(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_debugFactory.provideCompositeDisposable$app_debug(appComponentImpl.appModule));
    }

    LinearLayoutManager linearLayoutManager() {
      return DailyDetailActivityModule_ProvideLinearLayoutManager$app_debugFactory.provideLinearLayoutManager$app_debug(dailyDetailActivityModule, instance3);
    }

    com.sugarcoachpremium.ui.daily_detail.view.CategoryAdapter categoryAdapter() {
      return DailyDetailActivityModule_ProvideCategoryAdapter$app_debugFactory.provideCategoryAdapter$app_debug(dailyDetailActivityModule, instance3);
    }

    com.sugarcoachpremium.ui.daily_detail.view.ItemAdapter itemAdapter() {
      return DailyDetailActivityModule_ProvideItemAdapter$app_debugFactory.provideItemAdapter$app_debug(dailyDetailActivityModule, instance3);
    }

    @Override
    public void inject(DailyDetailActivity instance) {
      injectDailyDetailActivity(instance);
    }

    @CanIgnoreReturnValue
    private DailyDetailInterador injectDailyDetailInterador(DailyDetailInterador instance2) {
      DailyDetailInterador_MembersInjector.injectApiRepository(instance2, apiRepository());
      return instance2;
    }

    @CanIgnoreReturnValue
    private DailyDetailActivity injectDailyDetailActivity(DailyDetailActivity instance) {
      DailyDetailActivity_MembersInjector.injectPresenter(instance, dailyDetailPresenterOfDailyDetailViewAndDailyDetailInteractorImp());
      DailyDetailActivity_MembersInjector.injectManager(instance, linearLayoutManager());
      DailyDetailActivity_MembersInjector.injectAdapter(instance, categoryAdapter());
      DailyDetailActivity_MembersInjector.injectManagerEmotions(instance, linearLayoutManager());
      DailyDetailActivity_MembersInjector.injectManagerExercices(instance, linearLayoutManager());
      DailyDetailActivity_MembersInjector.injectAdapterEmotions(instance, itemAdapter());
      DailyDetailActivity_MembersInjector.injectAdapterExercices(instance, itemAdapter());
      return instance;
    }
  }

  private static final class ProfileActivitySubcomponentImpl implements ActivityBuilder_BindProfileActivity.ProfileActivitySubcomponent {
    private final ProfileActivityModule profileActivityModule;

    private final ProfileActivity instance3;

    private final AppComponentImpl appComponentImpl;

    private final ProfileActivitySubcomponentImpl profileActivitySubcomponentImpl = this;

    ProfileActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        ProfileActivityModule profileActivityModuleParam, ProfileActivity instanceParam) {
      this.appComponentImpl = appComponentImpl;
      this.profileActivityModule = profileActivityModuleParam;
      this.instance3 = instanceParam;

    }

    ApiRepository apiRepository() {
      return new ApiRepository(appComponentImpl.provideApolloClient$app_debugProvider.get());
    }

    ProfileInteractor profileInteractor() {
      return injectProfileInteractor(ProfileInteractor_Factory.newInstance(appComponentImpl.provideDailyRepoHelper$app_debugProvider.get(), appComponentImpl.provideTreamentRepoHelper$app_debugProvider.get(), appComponentImpl.provideUserRepoHelper$app_debugProvider.get(), appComponentImpl.providePrefHelper$app_debugProvider.get(), appComponentImpl.provideApiHelper$app_debugProvider.get()));
    }

    ProfileInteractorImp profileInteractorImp() {
      return ProfileActivityModule_ProvideProfileInteractor$app_debugFactory.provideProfileInteractor$app_debug(profileActivityModule, profileInteractor());
    }

    ProfilePresenter<ProfileView, ProfileInteractorImp> profilePresenterOfProfileViewAndProfileInteractorImp(
        ) {
      return new ProfilePresenter<ProfileView, ProfileInteractorImp>(profileInteractorImp(), AppModule_ProvideSchedulerProvider$app_debugFactory.provideSchedulerProvider$app_debug(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_debugFactory.provideCompositeDisposable$app_debug(appComponentImpl.appModule));
    }

    ProfilePresenterImp<ProfileView, ProfileInteractorImp> profilePresenterImpOfProfileViewAndProfileInteractorImp(
        ) {
      return ProfileActivityModule_ProvideProfilePresenter$app_debugFactory.provideProfilePresenter$app_debug(profileActivityModule, profilePresenterOfProfileViewAndProfileInteractorImp());
    }

    GridLayoutManager gridLayoutManager() {
      return ProfileActivityModule_ProvideGridLayoutManager$app_debugFactory.provideGridLayoutManager$app_debug(profileActivityModule, instance3);
    }

    ProfileAdapter profileAdapter() {
      return ProfileActivityModule_ProvideProfileAdapter$app_debugFactory.provideProfileAdapter$app_debug(profileActivityModule, instance3);
    }

    @Override
    public void inject(ProfileActivity instance) {
      injectProfileActivity(instance);
    }

    @CanIgnoreReturnValue
    private ProfileInteractor injectProfileInteractor(ProfileInteractor instance2) {
      ProfileInteractor_MembersInjector.injectApiRepo(instance2, apiRepository());
      return instance2;
    }

    @CanIgnoreReturnValue
    private ProfileActivity injectProfileActivity(ProfileActivity instance) {
      ProfileActivity_MembersInjector.injectPresenter(instance, profilePresenterImpOfProfileViewAndProfileInteractorImp());
      ProfileActivity_MembersInjector.injectManager(instance, gridLayoutManager());
      ProfileActivity_MembersInjector.injectAdapter(instance, profileAdapter());
      return instance;
    }
  }

  private static final class ConfigActivitySubcomponentImpl implements ActivityBuilder_BindConfigActivity.ConfigActivitySubcomponent {
    private final ConfigActivityModule configActivityModule;

    private final AppComponentImpl appComponentImpl;

    private final ConfigActivitySubcomponentImpl configActivitySubcomponentImpl = this;

    ConfigActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        ConfigActivityModule configActivityModuleParam, ConfigActivity instanceParam) {
      this.appComponentImpl = appComponentImpl;
      this.configActivityModule = configActivityModuleParam;

    }

    ConfigInteractor configInteractor() {
      return new ConfigInteractor(appComponentImpl.provideContext$app_debugProvider.get(), appComponentImpl.provideTreamentRepoHelper$app_debugProvider.get(), appComponentImpl.provideDailyRepoHelper$app_debugProvider.get(), appComponentImpl.provideUserRepoHelper$app_debugProvider.get(), appComponentImpl.providePrefHelper$app_debugProvider.get(), appComponentImpl.provideApiHelper$app_debugProvider.get());
    }

    ConfigInteractorImp configInteractorImp() {
      return ConfigActivityModule_ProvideConfigInteractor$app_debugFactory.provideConfigInteractor$app_debug(configActivityModule, configInteractor());
    }

    ConfigPresenter<ConfigView, ConfigInteractorImp> configPresenterOfConfigViewAndConfigInteractorImp(
        ) {
      return new ConfigPresenter<ConfigView, ConfigInteractorImp>(configInteractorImp(), AppModule_ProvideSchedulerProvider$app_debugFactory.provideSchedulerProvider$app_debug(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_debugFactory.provideCompositeDisposable$app_debug(appComponentImpl.appModule));
    }

    ConfigPresenterImp<ConfigView, ConfigInteractorImp> configPresenterImpOfConfigViewAndConfigInteractorImp(
        ) {
      return ConfigActivityModule_ProvideConfigPresenter$app_debugFactory.provideConfigPresenter$app_debug(configActivityModule, configPresenterOfConfigViewAndConfigInteractorImp());
    }

    @Override
    public void inject(ConfigActivity instance) {
      injectConfigActivity(instance);
    }

    @CanIgnoreReturnValue
    private ConfigActivity injectConfigActivity(ConfigActivity instance) {
      ConfigActivity_MembersInjector.injectPresenter(instance, configPresenterImpOfConfigViewAndConfigInteractorImp());
      return instance;
    }
  }

  private static final class StatisticsActivitySubcomponentImpl implements ActivityBuilder_BindStatisticsActivity.StatisticsActivitySubcomponent {
    private final StatisticsActivityModule statisticsActivityModule;

    private final StatisticsActivity instance2;

    private final AppComponentImpl appComponentImpl;

    private final StatisticsActivitySubcomponentImpl statisticsActivitySubcomponentImpl = this;

    StatisticsActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        StatisticsActivityModule statisticsActivityModuleParam, StatisticsActivity instanceParam) {
      this.appComponentImpl = appComponentImpl;
      this.statisticsActivityModule = statisticsActivityModuleParam;
      this.instance2 = instanceParam;

    }

    StatisticsInteractor statisticsInteractor() {
      return new StatisticsInteractor(appComponentImpl.provideTreamentRepoHelper$app_debugProvider.get(), appComponentImpl.provideDailyRepoHelper$app_debugProvider.get(), appComponentImpl.provideUserRepoHelper$app_debugProvider.get(), appComponentImpl.providePrefHelper$app_debugProvider.get(), appComponentImpl.provideApiHelper$app_debugProvider.get());
    }

    StatisticsInteractorImp statisticsInteractorImp() {
      return StatisticsActivityModule_ProvideStatisticsInteractor$app_debugFactory.provideStatisticsInteractor$app_debug(statisticsActivityModule, statisticsInteractor());
    }

    StatisticsPresenter<StatisticsView, StatisticsInteractorImp> statisticsPresenterOfStatisticsViewAndStatisticsInteractorImp(
        ) {
      return new StatisticsPresenter<StatisticsView, StatisticsInteractorImp>(statisticsInteractorImp(), AppModule_ProvideSchedulerProvider$app_debugFactory.provideSchedulerProvider$app_debug(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_debugFactory.provideCompositeDisposable$app_debug(appComponentImpl.appModule));
    }

    StatisticsPresenterImp<StatisticsView, StatisticsInteractorImp> statisticsPresenterImpOfStatisticsViewAndStatisticsInteractorImp(
        ) {
      return StatisticsActivityModule_ProvideStatisticsPresenter$app_debugFactory.provideStatisticsPresenter$app_debug(statisticsActivityModule, statisticsPresenterOfStatisticsViewAndStatisticsInteractorImp());
    }

    StatisticsAdapter statisticsAdapter() {
      return StatisticsActivityModule_ProvideStatisticsAdapter$app_debugFactory.provideStatisticsAdapter$app_debug(statisticsActivityModule, instance2);
    }

    LinearLayoutManager linearLayoutManager() {
      return StatisticsActivityModule_ProvideLinearLayoutManager$app_debugFactory.provideLinearLayoutManager$app_debug(statisticsActivityModule, instance2);
    }

    @Override
    public void inject(StatisticsActivity instance) {
      injectStatisticsActivity(instance);
    }

    @CanIgnoreReturnValue
    private StatisticsActivity injectStatisticsActivity(StatisticsActivity instance) {
      StatisticsActivity_MembersInjector.injectPresenter(instance, statisticsPresenterImpOfStatisticsViewAndStatisticsInteractorImp());
      StatisticsActivity_MembersInjector.injectAdapter(instance, statisticsAdapter());
      StatisticsActivity_MembersInjector.injectLinearLayoutManager(instance, linearLayoutManager());
      return instance;
    }
  }

  private static final class ForgotActivitySubcomponentImpl implements ActivityBuilder_BindForgotActivity.ForgotActivitySubcomponent {
    private final ForgotActivityModule forgotActivityModule;

    private final AppComponentImpl appComponentImpl;

    private final ForgotActivitySubcomponentImpl forgotActivitySubcomponentImpl = this;

    ForgotActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        ForgotActivityModule forgotActivityModuleParam, ForgotActivity instanceParam) {
      this.appComponentImpl = appComponentImpl;
      this.forgotActivityModule = forgotActivityModuleParam;

    }

    ForgotInteractor forgotInteractor() {
      return new ForgotInteractor(appComponentImpl.provideDailyRepoHelper$app_debugProvider.get(), appComponentImpl.provideUserRepoHelper$app_debugProvider.get(), appComponentImpl.providePrefHelper$app_debugProvider.get(), appComponentImpl.provideApiHelper$app_debugProvider.get());
    }

    ForgotInteractorImp forgotInteractorImp() {
      return ForgotActivityModule_ProvideforgotInteractor$app_debugFactory.provideforgotInteractor$app_debug(forgotActivityModule, forgotInteractor());
    }

    ForgotPresenter<ForgotView, ForgotInteractorImp> forgotPresenterOfForgotViewAndForgotInteractorImp(
        ) {
      return new ForgotPresenter<ForgotView, ForgotInteractorImp>(forgotInteractorImp(), AppModule_ProvideSchedulerProvider$app_debugFactory.provideSchedulerProvider$app_debug(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_debugFactory.provideCompositeDisposable$app_debug(appComponentImpl.appModule));
    }

    ForgotPresenterImp<ForgotView, ForgotInteractorImp> forgotPresenterImpOfForgotViewAndForgotInteractorImp(
        ) {
      return ForgotActivityModule_ProvideforgotPresenter$app_debugFactory.provideforgotPresenter$app_debug(forgotActivityModule, forgotPresenterOfForgotViewAndForgotInteractorImp());
    }

    @Override
    public void inject(ForgotActivity instance) {
      injectForgotActivity(instance);
    }

    @CanIgnoreReturnValue
    private ForgotActivity injectForgotActivity(ForgotActivity instance) {
      ForgotActivity_MembersInjector.injectPresenter(instance, forgotPresenterImpOfForgotViewAndForgotInteractorImp());
      return instance;
    }
  }

  private static final class AppComponentImpl implements AppComponent {
    private final AppModule appModule;

    private final AppComponentImpl appComponentImpl = this;

    Provider<ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent.Factory> splashActivitySubcomponentFactoryProvider;

    Provider<ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Factory> mainActivitySubcomponentFactoryProvider;

    Provider<ActivityBuilder_BindRegisterActivity.RegisterActivitySubcomponent.Factory> registerActivitySubcomponentFactoryProvider;

    Provider<ActivityBuilder_BindTreatmentActivity.TreatmentActivitySubcomponent.Factory> treatmentActivitySubcomponentFactoryProvider;

    Provider<ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Factory> loginActivitySubcomponentFactoryProvider;

    Provider<ActivityBuilder_BindSignActivity.SignActivitySubcomponent.Factory> signActivitySubcomponentFactoryProvider;

    Provider<ActivityBuilder_BindSignEmailctivity.SignEmailActivitySubcomponent.Factory> signEmailActivitySubcomponentFactoryProvider;

    Provider<ActivityBuilder_BindOnBoardingActivity.OnBoardingActivitySubcomponent.Factory> onBoardingActivitySubcomponentFactoryProvider;

    Provider<ActivityBuilder_BindDailyActivity.DailyActivitySubcomponent.Factory> dailyActivitySubcomponentFactoryProvider;

    Provider<ActivityBuilder_BindDailyDetailActivity.DailyDetailActivitySubcomponent.Factory> dailyDetailActivitySubcomponentFactoryProvider;

    Provider<ActivityBuilder_BindProfileActivity.ProfileActivitySubcomponent.Factory> profileActivitySubcomponentFactoryProvider;

    Provider<ActivityBuilder_BindConfigActivity.ConfigActivitySubcomponent.Factory> configActivitySubcomponentFactoryProvider;

    Provider<ActivityBuilder_BindStatisticsActivity.StatisticsActivitySubcomponent.Factory> statisticsActivitySubcomponentFactoryProvider;

    Provider<ActivityBuilder_BindForgotActivity.ForgotActivitySubcomponent.Factory> forgotActivitySubcomponentFactoryProvider;

    Provider<Application> applicationProvider;

    Provider<Context> provideContext$app_debugProvider;

    Provider<AppDatabase> provideAppDatabase$app_debugProvider;

    Provider<DailyRegisterRepo> provideDailyRepoHelper$app_debugProvider;

    Provider<TreamentRepo> provideTreamentRepoHelper$app_debugProvider;

    Provider<UserRepo> provideUserRepoHelper$app_debugProvider;

    Provider<String> provideprefFileName$app_debugProvider;

    Provider<AppPreferenceHelper> appPreferenceHelperProvider;

    Provider<PreferenceHelper> providePrefHelper$app_debugProvider;

    Provider<Retrofit> provideRetrofitProvider;

    Provider<ApiHelper> provideApiHelper$app_debugProvider;

    Provider<ApolloClient> provideApolloClient$app_debugProvider;

    AppComponentImpl(AppModule appModuleParam, Application applicationParam) {
      this.appModule = appModuleParam;
      initialize(appModuleParam, applicationParam);
      initialize2(appModuleParam, applicationParam);

    }

    Map<Class<?>, javax.inject.Provider<dagger.android.AndroidInjector.Factory<?>>> mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
        ) {
      return ImmutableMap.<Class<?>, javax.inject.Provider<dagger.android.AndroidInjector.Factory<?>>>builderWithExpectedSize(14).put(SplashActivity.class, ((Provider) (splashActivitySubcomponentFactoryProvider))).put(MainActivity.class, ((Provider) (mainActivitySubcomponentFactoryProvider))).put(RegisterActivity.class, ((Provider) (registerActivitySubcomponentFactoryProvider))).put(TreatmentActivity.class, ((Provider) (treatmentActivitySubcomponentFactoryProvider))).put(LoginActivity.class, ((Provider) (loginActivitySubcomponentFactoryProvider))).put(SignActivity.class, ((Provider) (signActivitySubcomponentFactoryProvider))).put(SignEmailActivity.class, ((Provider) (signEmailActivitySubcomponentFactoryProvider))).put(OnBoardingActivity.class, ((Provider) (onBoardingActivitySubcomponentFactoryProvider))).put(DailyActivity.class, ((Provider) (dailyActivitySubcomponentFactoryProvider))).put(DailyDetailActivity.class, ((Provider) (dailyDetailActivitySubcomponentFactoryProvider))).put(ProfileActivity.class, ((Provider) (profileActivitySubcomponentFactoryProvider))).put(ConfigActivity.class, ((Provider) (configActivitySubcomponentFactoryProvider))).put(StatisticsActivity.class, ((Provider) (statisticsActivitySubcomponentFactoryProvider))).put(ForgotActivity.class, ((Provider) (forgotActivitySubcomponentFactoryProvider))).build();
    }

    DispatchingAndroidInjector<Object> dispatchingAndroidInjectorOfObject() {
      return DispatchingAndroidInjector_Factory.newInstance(mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), ImmutableMap.<String, javax.inject.Provider<dagger.android.AndroidInjector.Factory<?>>>of());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final AppModule appModuleParam, final Application applicationParam) {
      this.splashActivitySubcomponentFactoryProvider = new Provider<ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent.Factory>() {
        @Override
        public ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent.Factory get() {
          return new SplashActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.mainActivitySubcomponentFactoryProvider = new Provider<ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Factory>() {
        @Override
        public ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Factory get() {
          return new MainActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.registerActivitySubcomponentFactoryProvider = new Provider<ActivityBuilder_BindRegisterActivity.RegisterActivitySubcomponent.Factory>() {
        @Override
        public ActivityBuilder_BindRegisterActivity.RegisterActivitySubcomponent.Factory get() {
          return new RegisterActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.treatmentActivitySubcomponentFactoryProvider = new Provider<ActivityBuilder_BindTreatmentActivity.TreatmentActivitySubcomponent.Factory>() {
        @Override
        public ActivityBuilder_BindTreatmentActivity.TreatmentActivitySubcomponent.Factory get() {
          return new TreatmentActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.loginActivitySubcomponentFactoryProvider = new Provider<ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Factory>() {
        @Override
        public ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Factory get() {
          return new LoginActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.signActivitySubcomponentFactoryProvider = new Provider<ActivityBuilder_BindSignActivity.SignActivitySubcomponent.Factory>() {
        @Override
        public ActivityBuilder_BindSignActivity.SignActivitySubcomponent.Factory get() {
          return new SignActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.signEmailActivitySubcomponentFactoryProvider = new Provider<ActivityBuilder_BindSignEmailctivity.SignEmailActivitySubcomponent.Factory>() {
        @Override
        public ActivityBuilder_BindSignEmailctivity.SignEmailActivitySubcomponent.Factory get() {
          return new SignEmailActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.onBoardingActivitySubcomponentFactoryProvider = new Provider<ActivityBuilder_BindOnBoardingActivity.OnBoardingActivitySubcomponent.Factory>() {
        @Override
        public ActivityBuilder_BindOnBoardingActivity.OnBoardingActivitySubcomponent.Factory get() {
          return new OnBoardingActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.dailyActivitySubcomponentFactoryProvider = new Provider<ActivityBuilder_BindDailyActivity.DailyActivitySubcomponent.Factory>() {
        @Override
        public ActivityBuilder_BindDailyActivity.DailyActivitySubcomponent.Factory get() {
          return new DailyActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.dailyDetailActivitySubcomponentFactoryProvider = new Provider<ActivityBuilder_BindDailyDetailActivity.DailyDetailActivitySubcomponent.Factory>() {
        @Override
        public ActivityBuilder_BindDailyDetailActivity.DailyDetailActivitySubcomponent.Factory get(
            ) {
          return new DailyDetailActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.profileActivitySubcomponentFactoryProvider = new Provider<ActivityBuilder_BindProfileActivity.ProfileActivitySubcomponent.Factory>() {
        @Override
        public ActivityBuilder_BindProfileActivity.ProfileActivitySubcomponent.Factory get() {
          return new ProfileActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.configActivitySubcomponentFactoryProvider = new Provider<ActivityBuilder_BindConfigActivity.ConfigActivitySubcomponent.Factory>() {
        @Override
        public ActivityBuilder_BindConfigActivity.ConfigActivitySubcomponent.Factory get() {
          return new ConfigActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.statisticsActivitySubcomponentFactoryProvider = new Provider<ActivityBuilder_BindStatisticsActivity.StatisticsActivitySubcomponent.Factory>() {
        @Override
        public ActivityBuilder_BindStatisticsActivity.StatisticsActivitySubcomponent.Factory get() {
          return new StatisticsActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.forgotActivitySubcomponentFactoryProvider = new Provider<ActivityBuilder_BindForgotActivity.ForgotActivitySubcomponent.Factory>() {
        @Override
        public ActivityBuilder_BindForgotActivity.ForgotActivitySubcomponent.Factory get() {
          return new ForgotActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.applicationProvider = InstanceFactory.create(applicationParam);
      this.provideContext$app_debugProvider = DoubleCheck.provider(AppModule_ProvideContext$app_debugFactory.create(appModuleParam, applicationProvider));
      this.provideAppDatabase$app_debugProvider = DoubleCheck.provider(AppModule_ProvideAppDatabase$app_debugFactory.create(appModuleParam, provideContext$app_debugProvider));
      this.provideDailyRepoHelper$app_debugProvider = DoubleCheck.provider(AppModule_ProvideDailyRepoHelper$app_debugFactory.create(appModuleParam, provideAppDatabase$app_debugProvider));
      this.provideTreamentRepoHelper$app_debugProvider = DoubleCheck.provider(AppModule_ProvideTreamentRepoHelper$app_debugFactory.create(appModuleParam, provideAppDatabase$app_debugProvider));
      this.provideUserRepoHelper$app_debugProvider = DoubleCheck.provider(AppModule_ProvideUserRepoHelper$app_debugFactory.create(appModuleParam, provideAppDatabase$app_debugProvider));
      this.provideprefFileName$app_debugProvider = AppModule_ProvideprefFileName$app_debugFactory.create(appModuleParam);
      this.appPreferenceHelperProvider = AppPreferenceHelper_Factory.create(provideContext$app_debugProvider, provideprefFileName$app_debugProvider);
      this.providePrefHelper$app_debugProvider = DoubleCheck.provider(AppModule_ProvidePrefHelper$app_debugFactory.create(appModuleParam, appPreferenceHelperProvider));
      this.provideRetrofitProvider = DoubleCheck.provider(AppModule_ProvideRetrofitFactory.create(appModuleParam));
      this.provideApiHelper$app_debugProvider = DoubleCheck.provider(AppModule_ProvideApiHelper$app_debugFactory.create(appModuleParam, provideRetrofitProvider));
    }

    @SuppressWarnings("unchecked")
    private void initialize2(final AppModule appModuleParam, final Application applicationParam) {
      this.provideApolloClient$app_debugProvider = DoubleCheck.provider(AppModule_ProvideApolloClient$app_debugFactory.create(appModuleParam));
    }

    @Override
    public void inject(SugarApp app) {
      injectSugarApp(app);
    }

    @CanIgnoreReturnValue
    private SugarApp injectSugarApp(SugarApp instance) {
      SugarApp_MembersInjector.injectDispatchingAndroidInjector(instance, dispatchingAndroidInjectorOfObject());
      return instance;
    }
  }
}
