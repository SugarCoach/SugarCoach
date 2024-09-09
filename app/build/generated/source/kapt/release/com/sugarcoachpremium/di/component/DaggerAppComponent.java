package com.sugarcoachpremium.di.component;

import android.app.Application;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.apollographql.apollo3.ApolloClient;
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
import com.sugarcoachpremium.di.module.AppModule_ProvideApiHelper$app_releaseFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideApolloClient$app_releaseFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideAppDatabase$app_releaseFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideCompositeDisposable$app_releaseFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideContext$app_releaseFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideDailyRepoHelper$app_releaseFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvidePrefHelper$app_releaseFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideRetrofitFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideSchedulerProvider$app_releaseFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideTreamentRepoHelper$app_releaseFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideUserRepoHelper$app_releaseFactory;
import com.sugarcoachpremium.di.module.AppModule_ProvideprefFileName$app_releaseFactory;
import com.sugarcoachpremium.di.preferences.PreferenceHelper;
import com.sugarcoachpremium.ui.config.ConfigActivityModule;
import com.sugarcoachpremium.ui.config.ConfigActivityModule_ProvideConfigInteractor$app_releaseFactory;
import com.sugarcoachpremium.ui.config.ConfigActivityModule_ProvideConfigPresenter$app_releaseFactory;
import com.sugarcoachpremium.ui.config.interactor.ConfigInteractor;
import com.sugarcoachpremium.ui.config.interactor.ConfigInteractorImp;
import com.sugarcoachpremium.ui.config.presenter.ConfigPresenter;
import com.sugarcoachpremium.ui.config.presenter.ConfigPresenterImp;
import com.sugarcoachpremium.ui.config.view.ConfigActivity;
import com.sugarcoachpremium.ui.config.view.ConfigActivity_MembersInjector;
import com.sugarcoachpremium.ui.config.view.ConfigView;
import com.sugarcoachpremium.ui.daily.DailyActivityModule;
import com.sugarcoachpremium.ui.daily.DailyActivityModule_ProvideDailyInteractor$app_releaseFactory;
import com.sugarcoachpremium.ui.daily.DailyActivityModule_ProvideDailyPresenter$app_releaseFactory;
import com.sugarcoachpremium.ui.daily.DailyActivityModule_ProvideLinearLayoutManager$app_releaseFactory;
import com.sugarcoachpremium.ui.daily.interactor.DailyInteractor;
import com.sugarcoachpremium.ui.daily.interactor.DailyInteractorImp;
import com.sugarcoachpremium.ui.daily.presenter.DailyPresenter;
import com.sugarcoachpremium.ui.daily.presenter.DailyPresenterImp;
import com.sugarcoachpremium.ui.daily.view.DailyActivity;
import com.sugarcoachpremium.ui.daily.view.DailyActivity_MembersInjector;
import com.sugarcoachpremium.ui.daily.view.DailyView;
import com.sugarcoachpremium.ui.daily_detail.DailyDetailActivityModule;
import com.sugarcoachpremium.ui.daily_detail.DailyDetailActivityModule_ProvideCategoryAdapter$app_releaseFactory;
import com.sugarcoachpremium.ui.daily_detail.DailyDetailActivityModule_ProvideDailyDetailInteractor$app_releaseFactory;
import com.sugarcoachpremium.ui.daily_detail.DailyDetailActivityModule_ProvideItemAdapter$app_releaseFactory;
import com.sugarcoachpremium.ui.daily_detail.DailyDetailActivityModule_ProvideLinearLayoutManager$app_releaseFactory;
import com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp;
import com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInterador;
import com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInterador_Factory;
import com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInterador_MembersInjector;
import com.sugarcoachpremium.ui.daily_detail.presenter.DailyDetailPresenter;
import com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity;
import com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity_MembersInjector;
import com.sugarcoachpremium.ui.daily_detail.view.DailyDetailView;
import com.sugarcoachpremium.ui.forgot.ForgotActivityModule;
import com.sugarcoachpremium.ui.forgot.ForgotActivityModule_ProvideforgotInteractor$app_releaseFactory;
import com.sugarcoachpremium.ui.forgot.ForgotActivityModule_ProvideforgotPresenter$app_releaseFactory;
import com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractor;
import com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractorImp;
import com.sugarcoachpremium.ui.forgot.presenter.ForgotPresenter;
import com.sugarcoachpremium.ui.forgot.presenter.ForgotPresenterImp;
import com.sugarcoachpremium.ui.forgot.view.ForgotActivity;
import com.sugarcoachpremium.ui.forgot.view.ForgotActivity_MembersInjector;
import com.sugarcoachpremium.ui.forgot.view.ForgotView;
import com.sugarcoachpremium.ui.login.LoginActivityModule;
import com.sugarcoachpremium.ui.login.LoginActivityModule_ProvideloginInteractor$app_releaseFactory;
import com.sugarcoachpremium.ui.login.LoginActivityModule_ProvideloginPresenter$app_releaseFactory;
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
import com.sugarcoachpremium.ui.main.MainActivityModule_ProvideMainInteractor$app_releaseFactory;
import com.sugarcoachpremium.ui.main.MainActivityModule_ProvideMainPresenter$app_releaseFactory;
import com.sugarcoachpremium.ui.main.interactor.MainInteractor;
import com.sugarcoachpremium.ui.main.interactor.MainInteractorImp;
import com.sugarcoachpremium.ui.main.presenter.MainPresenter;
import com.sugarcoachpremium.ui.main.presenter.MainPresenterImp;
import com.sugarcoachpremium.ui.main.view.MainActivity;
import com.sugarcoachpremium.ui.main.view.MainActivity_MembersInjector;
import com.sugarcoachpremium.ui.main.view.MainView;
import com.sugarcoachpremium.ui.onboarding.OnBoardingActivityModule;
import com.sugarcoachpremium.ui.onboarding.OnBoardingActivityModule_ProvideBoardingFragmentPagerAdapter$app_releaseFactory;
import com.sugarcoachpremium.ui.onboarding.OnBoardingActivityModule_ProvideOnBoardingInteractor$app_releaseFactory;
import com.sugarcoachpremium.ui.onboarding.OnBoardingActivityModule_ProvideOnBoardingPresenter$app_releaseFactory;
import com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractor;
import com.sugarcoachpremium.ui.onboarding.interactor.OnBoardingInteractorImp;
import com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenter;
import com.sugarcoachpremium.ui.onboarding.presenter.OnBoardingPresenterImp;
import com.sugarcoachpremium.ui.onboarding.view.BoardingFragmentPagerAdapter;
import com.sugarcoachpremium.ui.onboarding.view.OnBoardingActivity;
import com.sugarcoachpremium.ui.onboarding.view.OnBoardingActivity_MembersInjector;
import com.sugarcoachpremium.ui.onboarding.view.OnBoardingView;
import com.sugarcoachpremium.ui.profile.ProfileActivityModule;
import com.sugarcoachpremium.ui.profile.ProfileActivityModule_ProvideGridLayoutManager$app_releaseFactory;
import com.sugarcoachpremium.ui.profile.ProfileActivityModule_ProvideProfileAdapter$app_releaseFactory;
import com.sugarcoachpremium.ui.profile.ProfileActivityModule_ProvideProfileInteractor$app_releaseFactory;
import com.sugarcoachpremium.ui.profile.ProfileActivityModule_ProvideProfilePresenter$app_releaseFactory;
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
import com.sugarcoachpremium.ui.register.RegisterActivityModule_ProvideCategoryAdapter$app_releaseFactory;
import com.sugarcoachpremium.ui.register.RegisterActivityModule_ProvideCurrentDate$app_releaseFactory;
import com.sugarcoachpremium.ui.register.RegisterActivityModule_ProvideItemAdapter$app_releaseFactory;
import com.sugarcoachpremium.ui.register.RegisterActivityModule_ProvideLinearLayoutManager$app_releaseFactory;
import com.sugarcoachpremium.ui.register.RegisterActivityModule_ProvideRegisterInteractor$app_releaseFactory;
import com.sugarcoachpremium.ui.register.RegisterActivityModule_ProvideRegisterPresenter$app_releaseFactory;
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
import com.sugarcoachpremium.ui.sign.SignActivityModule_ProvidesignInteractor$app_releaseFactory;
import com.sugarcoachpremium.ui.sign.SignActivityModule_ProvidesignPresenter$app_releaseFactory;
import com.sugarcoachpremium.ui.sign.interactor.SignInteractor;
import com.sugarcoachpremium.ui.sign.interactor.SignInteractorImp;
import com.sugarcoachpremium.ui.sign.presenter.SignPresenter;
import com.sugarcoachpremium.ui.sign.presenter.SignPresenterImp;
import com.sugarcoachpremium.ui.sign.view.SignActivity;
import com.sugarcoachpremium.ui.sign.view.SignActivity_MembersInjector;
import com.sugarcoachpremium.ui.sign.view.SignView;
import com.sugarcoachpremium.ui.signEmail.SignEmailActivityModule;
import com.sugarcoachpremium.ui.signEmail.SignEmailActivityModule_ProvidesignInteractor$app_releaseFactory;
import com.sugarcoachpremium.ui.signEmail.SignEmailActivityModule_ProvidesignPresenter$app_releaseFactory;
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
import com.sugarcoachpremium.ui.splash.SplashActivityModule_ProvideSplashInteractor$app_releaseFactory;
import com.sugarcoachpremium.ui.splash.SplashActivityModule_ProvideSplashPresenter$app_releaseFactory;
import com.sugarcoachpremium.ui.splash.interactor.SplashInteractor;
import com.sugarcoachpremium.ui.splash.interactor.SplashInteractorImp;
import com.sugarcoachpremium.ui.splash.presenter.SplashPresenter;
import com.sugarcoachpremium.ui.splash.presenter.SplashPresenterImp;
import com.sugarcoachpremium.ui.splash.view.SplashActivity;
import com.sugarcoachpremium.ui.splash.view.SplashActivity_MembersInjector;
import com.sugarcoachpremium.ui.splash.view.SplashView;
import com.sugarcoachpremium.ui.statistics.StatisticsActivityModule;
import com.sugarcoachpremium.ui.statistics.StatisticsActivityModule_ProvideLinearLayoutManager$app_releaseFactory;
import com.sugarcoachpremium.ui.statistics.StatisticsActivityModule_ProvideStatisticsAdapter$app_releaseFactory;
import com.sugarcoachpremium.ui.statistics.StatisticsActivityModule_ProvideStatisticsInteractor$app_releaseFactory;
import com.sugarcoachpremium.ui.statistics.StatisticsActivityModule_ProvideStatisticsPresenter$app_releaseFactory;
import com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractor;
import com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp;
import com.sugarcoachpremium.ui.statistics.presenter.StatisticsPresenter;
import com.sugarcoachpremium.ui.statistics.presenter.StatisticsPresenterImp;
import com.sugarcoachpremium.ui.statistics.view.StatisticsActivity;
import com.sugarcoachpremium.ui.statistics.view.StatisticsActivity_MembersInjector;
import com.sugarcoachpremium.ui.statistics.view.StatisticsAdapter;
import com.sugarcoachpremium.ui.statistics.view.StatisticsView;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideBasalAdapter$app_releaseFactory;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideBombaAdapter$app_releaseFactory;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideLinearLayoutManager$app_releaseFactory;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideMedidorAdapter$app_releaseFactory;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideTreatmentAdapter$app_releaseFactory;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideTreatmentBasalHoraAdapter$app_releaseFactory;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideTreatmentCorrectoraAdapter$app_releaseFactory;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideTreatmentInteractor$app_releaseFactory;
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule_ProvideTreatmentPresenter$app_releaseFactory;
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
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
    "KotlinInternalInJava"
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
        SplashActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new SplashActivitySubcomponentImpl(appComponentImpl, new SplashActivityModule(), arg0);
    }
  }

  private static final class MainActivitySubcomponentFactory implements ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private MainActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindMainActivity.MainActivitySubcomponent create(MainActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new MainActivitySubcomponentImpl(appComponentImpl, new MainActivityModule(), arg0);
    }
  }

  private static final class RegisterActivitySubcomponentFactory implements ActivityBuilder_BindRegisterActivity.RegisterActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private RegisterActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindRegisterActivity.RegisterActivitySubcomponent create(
        RegisterActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new RegisterActivitySubcomponentImpl(appComponentImpl, new RegisterActivityModule(), arg0);
    }
  }

  private static final class TreatmentActivitySubcomponentFactory implements ActivityBuilder_BindTreatmentActivity.TreatmentActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private TreatmentActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindTreatmentActivity.TreatmentActivitySubcomponent create(
        TreatmentActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new TreatmentActivitySubcomponentImpl(appComponentImpl, new TreatmentActivityModule(), arg0);
    }
  }

  private static final class LoginActivitySubcomponentFactory implements ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private LoginActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent create(LoginActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new LoginActivitySubcomponentImpl(appComponentImpl, new LoginActivityModule(), arg0);
    }
  }

  private static final class SignActivitySubcomponentFactory implements ActivityBuilder_BindSignActivity.SignActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private SignActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindSignActivity.SignActivitySubcomponent create(SignActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new SignActivitySubcomponentImpl(appComponentImpl, new SignActivityModule(), arg0);
    }
  }

  private static final class SignEmailActivitySubcomponentFactory implements ActivityBuilder_BindSignEmailctivity.SignEmailActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private SignEmailActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindSignEmailctivity.SignEmailActivitySubcomponent create(
        SignEmailActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new SignEmailActivitySubcomponentImpl(appComponentImpl, new SignEmailActivityModule(), arg0);
    }
  }

  private static final class OnBoardingActivitySubcomponentFactory implements ActivityBuilder_BindOnBoardingActivity.OnBoardingActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private OnBoardingActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindOnBoardingActivity.OnBoardingActivitySubcomponent create(
        OnBoardingActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new OnBoardingActivitySubcomponentImpl(appComponentImpl, new OnBoardingActivityModule(), arg0);
    }
  }

  private static final class DailyActivitySubcomponentFactory implements ActivityBuilder_BindDailyActivity.DailyActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private DailyActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindDailyActivity.DailyActivitySubcomponent create(DailyActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new DailyActivitySubcomponentImpl(appComponentImpl, new DailyActivityModule(), arg0);
    }
  }

  private static final class DailyDetailActivitySubcomponentFactory implements ActivityBuilder_BindDailyDetailActivity.DailyDetailActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private DailyDetailActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindDailyDetailActivity.DailyDetailActivitySubcomponent create(
        DailyDetailActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new DailyDetailActivitySubcomponentImpl(appComponentImpl, new DailyDetailActivityModule(), arg0);
    }
  }

  private static final class ProfileActivitySubcomponentFactory implements ActivityBuilder_BindProfileActivity.ProfileActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private ProfileActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindProfileActivity.ProfileActivitySubcomponent create(
        ProfileActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new ProfileActivitySubcomponentImpl(appComponentImpl, new ProfileActivityModule(), arg0);
    }
  }

  private static final class ConfigActivitySubcomponentFactory implements ActivityBuilder_BindConfigActivity.ConfigActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private ConfigActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindConfigActivity.ConfigActivitySubcomponent create(
        ConfigActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new ConfigActivitySubcomponentImpl(appComponentImpl, new ConfigActivityModule(), arg0);
    }
  }

  private static final class StatisticsActivitySubcomponentFactory implements ActivityBuilder_BindStatisticsActivity.StatisticsActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private StatisticsActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindStatisticsActivity.StatisticsActivitySubcomponent create(
        StatisticsActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new StatisticsActivitySubcomponentImpl(appComponentImpl, new StatisticsActivityModule(), arg0);
    }
  }

  private static final class ForgotActivitySubcomponentFactory implements ActivityBuilder_BindForgotActivity.ForgotActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private ForgotActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityBuilder_BindForgotActivity.ForgotActivitySubcomponent create(
        ForgotActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new ForgotActivitySubcomponentImpl(appComponentImpl, new ForgotActivityModule(), arg0);
    }
  }

  private static final class SplashActivitySubcomponentImpl implements ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent {
    private final SplashActivityModule splashActivityModule;

    private final AppComponentImpl appComponentImpl;

    private final SplashActivitySubcomponentImpl splashActivitySubcomponentImpl = this;

    private SplashActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        SplashActivityModule splashActivityModuleParam, SplashActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;
      this.splashActivityModule = splashActivityModuleParam;

    }

    private SplashInteractor splashInteractor() {
      return new SplashInteractor(appComponentImpl.provideContext$app_releaseProvider.get(), appComponentImpl.provideDailyRepoHelper$app_releaseProvider.get(), appComponentImpl.provideTreamentRepoHelper$app_releaseProvider.get(), appComponentImpl.provideUserRepoHelper$app_releaseProvider.get(), appComponentImpl.providePrefHelper$app_releaseProvider.get(), appComponentImpl.provideApiHelper$app_releaseProvider.get());
    }

    private SplashInteractorImp splashInteractorImp() {
      return SplashActivityModule_ProvideSplashInteractor$app_releaseFactory.provideSplashInteractor$app_release(splashActivityModule, splashInteractor());
    }

    private SplashPresenter<SplashView, SplashInteractorImp> splashPresenterOfSplashViewAndSplashInteractorImp(
        ) {
      return new SplashPresenter<SplashView, SplashInteractorImp>(splashInteractorImp(), AppModule_ProvideSchedulerProvider$app_releaseFactory.provideSchedulerProvider$app_release(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_releaseFactory.provideCompositeDisposable$app_release(appComponentImpl.appModule));
    }

    private SplashPresenterImp<SplashView, SplashInteractorImp> splashPresenterImpOfSplashViewAndSplashInteractorImp(
        ) {
      return SplashActivityModule_ProvideSplashPresenter$app_releaseFactory.provideSplashPresenter$app_release(splashActivityModule, splashPresenterOfSplashViewAndSplashInteractorImp());
    }

    @Override
    public void inject(SplashActivity arg0) {
      injectSplashActivity(arg0);
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

    private MainActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        MainActivityModule mainActivityModuleParam, MainActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;
      this.mainActivityModule = mainActivityModuleParam;

    }

    private MainInteractor mainInteractor() {
      return new MainInteractor(appComponentImpl.provideTreamentRepoHelper$app_releaseProvider.get(), appComponentImpl.provideDailyRepoHelper$app_releaseProvider.get(), appComponentImpl.provideAppDatabase$app_releaseProvider.get(), appComponentImpl.provideUserRepoHelper$app_releaseProvider.get(), appComponentImpl.providePrefHelper$app_releaseProvider.get(), appComponentImpl.provideApiHelper$app_releaseProvider.get());
    }

    private MainInteractorImp mainInteractorImp() {
      return MainActivityModule_ProvideMainInteractor$app_releaseFactory.provideMainInteractor$app_release(mainActivityModule, mainInteractor());
    }

    private MainPresenter<MainView, MainInteractorImp> mainPresenterOfMainViewAndMainInteractorImp(
        ) {
      return new MainPresenter<MainView, MainInteractorImp>(mainInteractorImp(), AppModule_ProvideSchedulerProvider$app_releaseFactory.provideSchedulerProvider$app_release(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_releaseFactory.provideCompositeDisposable$app_release(appComponentImpl.appModule));
    }

    private MainPresenterImp<MainView, MainInteractorImp> mainPresenterImpOfMainViewAndMainInteractorImp(
        ) {
      return MainActivityModule_ProvideMainPresenter$app_releaseFactory.provideMainPresenter$app_release(mainActivityModule, mainPresenterOfMainViewAndMainInteractorImp());
    }

    private ApiRepository apiRepository() {
      return new ApiRepository(appComponentImpl.provideApolloClient$app_releaseProvider.get());
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);
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

    private final RegisterActivity arg0;

    private final AppComponentImpl appComponentImpl;

    private final RegisterActivitySubcomponentImpl registerActivitySubcomponentImpl = this;

    private RegisterActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        RegisterActivityModule registerActivityModuleParam, RegisterActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;
      this.registerActivityModule = registerActivityModuleParam;
      this.arg0 = arg0Param;

    }

    private ApiRepository apiRepository() {
      return new ApiRepository(appComponentImpl.provideApolloClient$app_releaseProvider.get());
    }

    private RegisterInteractor registerInteractor() {
      return injectRegisterInteractor(RegisterInteractor_Factory.newInstance(appComponentImpl.provideTreamentRepoHelper$app_releaseProvider.get(), appComponentImpl.provideDailyRepoHelper$app_releaseProvider.get(), appComponentImpl.provideUserRepoHelper$app_releaseProvider.get(), appComponentImpl.providePrefHelper$app_releaseProvider.get(), appComponentImpl.provideApiHelper$app_releaseProvider.get()));
    }

    private RegisterInteractorImp registerInteractorImp() {
      return RegisterActivityModule_ProvideRegisterInteractor$app_releaseFactory.provideRegisterInteractor$app_release(registerActivityModule, registerInteractor());
    }

    private RegisterPresenter<RegisterView, RegisterInteractorImp> registerPresenterOfRegisterViewAndRegisterInteractorImp(
        ) {
      return injectRegisterPresenter(RegisterPresenter_Factory.newInstance(registerInteractorImp(), AppModule_ProvideSchedulerProvider$app_releaseFactory.provideSchedulerProvider$app_release(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_releaseFactory.provideCompositeDisposable$app_release(appComponentImpl.appModule)));
    }

    private RegisterPresenterImp<RegisterView, RegisterInteractorImp> registerPresenterImpOfRegisterViewAndRegisterInteractorImp(
        ) {
      return RegisterActivityModule_ProvideRegisterPresenter$app_releaseFactory.provideRegisterPresenter$app_release(registerActivityModule, registerPresenterOfRegisterViewAndRegisterInteractorImp());
    }

    private LinearLayoutManager linearLayoutManager() {
      return RegisterActivityModule_ProvideLinearLayoutManager$app_releaseFactory.provideLinearLayoutManager$app_release(registerActivityModule, arg0);
    }

    private ItemAdapter itemAdapter() {
      return RegisterActivityModule_ProvideItemAdapter$app_releaseFactory.provideItemAdapter$app_release(registerActivityModule, arg0);
    }

    private CategoryAdapter categoryAdapter() {
      return RegisterActivityModule_ProvideCategoryAdapter$app_releaseFactory.provideCategoryAdapter$app_release(registerActivityModule, arg0);
    }

    @Override
    public void inject(RegisterActivity arg0) {
      injectRegisterActivity(arg0);
    }

    @CanIgnoreReturnValue
    private RegisterInteractor injectRegisterInteractor(RegisterInteractor instance) {
      RegisterInteractor_MembersInjector.injectApiRepository(instance, apiRepository());
      return instance;
    }

    @CanIgnoreReturnValue
    private RegisterPresenter<RegisterView, RegisterInteractorImp> injectRegisterPresenter(
        RegisterPresenter<RegisterView, RegisterInteractorImp> instance) {
      RegisterPresenter_MembersInjector.injectDate(instance, RegisterActivityModule_ProvideCurrentDate$app_releaseFactory.provideCurrentDate$app_release(registerActivityModule));
      return instance;
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

    private final TreatmentActivity arg0;

    private final AppComponentImpl appComponentImpl;

    private final TreatmentActivitySubcomponentImpl treatmentActivitySubcomponentImpl = this;

    private TreatmentActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        TreatmentActivityModule treatmentActivityModuleParam, TreatmentActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;
      this.treatmentActivityModule = treatmentActivityModuleParam;
      this.arg0 = arg0Param;

    }

    private ApiRepository apiRepository() {
      return new ApiRepository(appComponentImpl.provideApolloClient$app_releaseProvider.get());
    }

    private TreatmentInteractor treatmentInteractor() {
      return injectTreatmentInteractor(TreatmentInteractor_Factory.newInstance(appComponentImpl.provideTreamentRepoHelper$app_releaseProvider.get(), appComponentImpl.provideDailyRepoHelper$app_releaseProvider.get(), appComponentImpl.provideUserRepoHelper$app_releaseProvider.get(), appComponentImpl.providePrefHelper$app_releaseProvider.get(), appComponentImpl.provideApiHelper$app_releaseProvider.get()));
    }

    private TreatmentInteractorImp treatmentInteractorImp() {
      return TreatmentActivityModule_ProvideTreatmentInteractor$app_releaseFactory.provideTreatmentInteractor$app_release(treatmentActivityModule, treatmentInteractor());
    }

    private TreatmentPresenter<TreatmentView, TreatmentInteractorImp> treatmentPresenterOfTreatmentViewAndTreatmentInteractorImp(
        ) {
      return new TreatmentPresenter<TreatmentView, TreatmentInteractorImp>(treatmentInteractorImp(), AppModule_ProvideSchedulerProvider$app_releaseFactory.provideSchedulerProvider$app_release(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_releaseFactory.provideCompositeDisposable$app_release(appComponentImpl.appModule));
    }

    private TreatmentPresenterImp<TreatmentView, TreatmentInteractorImp> treatmentPresenterImpOfTreatmentViewAndTreatmentInteractorImp(
        ) {
      return TreatmentActivityModule_ProvideTreatmentPresenter$app_releaseFactory.provideTreatmentPresenter$app_release(treatmentActivityModule, treatmentPresenterOfTreatmentViewAndTreatmentInteractorImp());
    }

    private LinearLayoutManager linearLayoutManager() {
      return TreatmentActivityModule_ProvideLinearLayoutManager$app_releaseFactory.provideLinearLayoutManager$app_release(treatmentActivityModule, arg0);
    }

    private BasalAdapter basalAdapter() {
      return TreatmentActivityModule_ProvideBasalAdapter$app_releaseFactory.provideBasalAdapter$app_release(treatmentActivityModule, arg0);
    }

    private MedidorAdapter medidorAdapter() {
      return TreatmentActivityModule_ProvideMedidorAdapter$app_releaseFactory.provideMedidorAdapter$app_release(treatmentActivityModule, arg0);
    }

    private BombaAdapter bombaAdapter() {
      return TreatmentActivityModule_ProvideBombaAdapter$app_releaseFactory.provideBombaAdapter$app_release(treatmentActivityModule, arg0);
    }

    private TreatmentAdapter treatmentAdapter() {
      return TreatmentActivityModule_ProvideTreatmentAdapter$app_releaseFactory.provideTreatmentAdapter$app_release(treatmentActivityModule, arg0);
    }

    private TreatmentCorrectoraAdapter treatmentCorrectoraAdapter() {
      return TreatmentActivityModule_ProvideTreatmentCorrectoraAdapter$app_releaseFactory.provideTreatmentCorrectoraAdapter$app_release(treatmentActivityModule, arg0);
    }

    private TreatmentBasalHoraAdapter treatmentBasalHoraAdapter() {
      return TreatmentActivityModule_ProvideTreatmentBasalHoraAdapter$app_releaseFactory.provideTreatmentBasalHoraAdapter$app_release(treatmentActivityModule, arg0);
    }

    @Override
    public void inject(TreatmentActivity arg0) {
      injectTreatmentActivity(arg0);
    }

    @CanIgnoreReturnValue
    private TreatmentInteractor injectTreatmentInteractor(TreatmentInteractor instance) {
      TreatmentInteractor_MembersInjector.injectApiRepository(instance, apiRepository());
      return instance;
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

    private LoginActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        LoginActivityModule loginActivityModuleParam, LoginActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;
      this.loginActivityModule = loginActivityModuleParam;

    }

    private ApiRepository apiRepository() {
      return new ApiRepository(appComponentImpl.provideApolloClient$app_releaseProvider.get());
    }

    private LoginInteractor loginInteractor() {
      return injectLoginInteractor(LoginInteractor_Factory.newInstance(appComponentImpl.provideContext$app_releaseProvider.get(), appComponentImpl.provideDailyRepoHelper$app_releaseProvider.get(), appComponentImpl.provideTreamentRepoHelper$app_releaseProvider.get(), appComponentImpl.provideUserRepoHelper$app_releaseProvider.get(), appComponentImpl.providePrefHelper$app_releaseProvider.get(), appComponentImpl.provideApiHelper$app_releaseProvider.get()));
    }

    private LoginInteractorImp loginInteractorImp() {
      return LoginActivityModule_ProvideloginInteractor$app_releaseFactory.provideloginInteractor$app_release(loginActivityModule, loginInteractor());
    }

    private LoginPresenter<LoginView, LoginInteractorImp> loginPresenterOfLoginViewAndLoginInteractorImp(
        ) {
      return new LoginPresenter<LoginView, LoginInteractorImp>(loginInteractorImp(), AppModule_ProvideSchedulerProvider$app_releaseFactory.provideSchedulerProvider$app_release(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_releaseFactory.provideCompositeDisposable$app_release(appComponentImpl.appModule));
    }

    private LoginPresenterImp<LoginView, LoginInteractorImp> loginPresenterImpOfLoginViewAndLoginInteractorImp(
        ) {
      return LoginActivityModule_ProvideloginPresenter$app_releaseFactory.provideloginPresenter$app_release(loginActivityModule, loginPresenterOfLoginViewAndLoginInteractorImp());
    }

    @Override
    public void inject(LoginActivity arg0) {
      injectLoginActivity(arg0);
    }

    @CanIgnoreReturnValue
    private LoginInteractor injectLoginInteractor(LoginInteractor instance) {
      LoginInteractor_MembersInjector.injectApiRepository(instance, apiRepository());
      return instance;
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

    private SignActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        SignActivityModule signActivityModuleParam, SignActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;
      this.signActivityModule = signActivityModuleParam;

    }

    private SignInteractor signInteractor() {
      return new SignInteractor(appComponentImpl.provideUserRepoHelper$app_releaseProvider.get(), appComponentImpl.providePrefHelper$app_releaseProvider.get(), appComponentImpl.provideApiHelper$app_releaseProvider.get());
    }

    private SignInteractorImp signInteractorImp() {
      return SignActivityModule_ProvidesignInteractor$app_releaseFactory.providesignInteractor$app_release(signActivityModule, signInteractor());
    }

    private SignPresenter<SignView, SignInteractorImp> signPresenterOfSignViewAndSignInteractorImp(
        ) {
      return new SignPresenter<SignView, SignInteractorImp>(signInteractorImp(), AppModule_ProvideSchedulerProvider$app_releaseFactory.provideSchedulerProvider$app_release(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_releaseFactory.provideCompositeDisposable$app_release(appComponentImpl.appModule));
    }

    private SignPresenterImp<SignView, SignInteractorImp> signPresenterImpOfSignViewAndSignInteractorImp(
        ) {
      return SignActivityModule_ProvidesignPresenter$app_releaseFactory.providesignPresenter$app_release(signActivityModule, signPresenterOfSignViewAndSignInteractorImp());
    }

    @Override
    public void inject(SignActivity arg0) {
      injectSignActivity(arg0);
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

    private SignEmailActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        SignEmailActivityModule signEmailActivityModuleParam, SignEmailActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;
      this.signEmailActivityModule = signEmailActivityModuleParam;

    }

    private ApiRepository apiRepository() {
      return new ApiRepository(appComponentImpl.provideApolloClient$app_releaseProvider.get());
    }

    private SignEmailInteractor signEmailInteractor() {
      return injectSignEmailInteractor(SignEmailInteractor_Factory.newInstance(appComponentImpl.provideContext$app_releaseProvider.get(), appComponentImpl.provideTreamentRepoHelper$app_releaseProvider.get(), appComponentImpl.provideDailyRepoHelper$app_releaseProvider.get(), appComponentImpl.provideUserRepoHelper$app_releaseProvider.get(), appComponentImpl.providePrefHelper$app_releaseProvider.get(), appComponentImpl.provideApiHelper$app_releaseProvider.get()));
    }

    private SignEmailInteractorImp signEmailInteractorImp() {
      return SignEmailActivityModule_ProvidesignInteractor$app_releaseFactory.providesignInteractor$app_release(signEmailActivityModule, signEmailInteractor());
    }

    private SignEmailPresenter<SignEmailView, SignEmailInteractorImp> signEmailPresenterOfSignEmailViewAndSignEmailInteractorImp(
        ) {
      return new SignEmailPresenter<SignEmailView, SignEmailInteractorImp>(signEmailInteractorImp(), AppModule_ProvideSchedulerProvider$app_releaseFactory.provideSchedulerProvider$app_release(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_releaseFactory.provideCompositeDisposable$app_release(appComponentImpl.appModule));
    }

    private SignEmailPresenterImp<SignEmailView, SignEmailInteractorImp> signEmailPresenterImpOfSignEmailViewAndSignEmailInteractorImp(
        ) {
      return SignEmailActivityModule_ProvidesignPresenter$app_releaseFactory.providesignPresenter$app_release(signEmailActivityModule, signEmailPresenterOfSignEmailViewAndSignEmailInteractorImp());
    }

    @Override
    public void inject(SignEmailActivity arg0) {
      injectSignEmailActivity(arg0);
    }

    @CanIgnoreReturnValue
    private SignEmailInteractor injectSignEmailInteractor(SignEmailInteractor instance) {
      SignEmailInteractor_MembersInjector.injectApiRepository(instance, apiRepository());
      return instance;
    }

    @CanIgnoreReturnValue
    private SignEmailActivity injectSignEmailActivity(SignEmailActivity instance) {
      SignEmailActivity_MembersInjector.injectPresenter(instance, signEmailPresenterImpOfSignEmailViewAndSignEmailInteractorImp());
      return instance;
    }
  }

  private static final class OnBoardingActivitySubcomponentImpl implements ActivityBuilder_BindOnBoardingActivity.OnBoardingActivitySubcomponent {
    private final OnBoardingActivityModule onBoardingActivityModule;

    private final OnBoardingActivity arg0;

    private final AppComponentImpl appComponentImpl;

    private final OnBoardingActivitySubcomponentImpl onBoardingActivitySubcomponentImpl = this;

    private OnBoardingActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        OnBoardingActivityModule onBoardingActivityModuleParam, OnBoardingActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;
      this.onBoardingActivityModule = onBoardingActivityModuleParam;
      this.arg0 = arg0Param;

    }

    private OnBoardingInteractor onBoardingInteractor() {
      return new OnBoardingInteractor(appComponentImpl.provideUserRepoHelper$app_releaseProvider.get(), appComponentImpl.providePrefHelper$app_releaseProvider.get(), appComponentImpl.provideApiHelper$app_releaseProvider.get());
    }

    private OnBoardingInteractorImp onBoardingInteractorImp() {
      return OnBoardingActivityModule_ProvideOnBoardingInteractor$app_releaseFactory.provideOnBoardingInteractor$app_release(onBoardingActivityModule, onBoardingInteractor());
    }

    private OnBoardingPresenter<OnBoardingView, OnBoardingInteractorImp> onBoardingPresenterOfOnBoardingViewAndOnBoardingInteractorImp(
        ) {
      return new OnBoardingPresenter<OnBoardingView, OnBoardingInteractorImp>(onBoardingInteractorImp(), AppModule_ProvideSchedulerProvider$app_releaseFactory.provideSchedulerProvider$app_release(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_releaseFactory.provideCompositeDisposable$app_release(appComponentImpl.appModule));
    }

    private OnBoardingPresenterImp<OnBoardingView, OnBoardingInteractorImp> onBoardingPresenterImpOfOnBoardingViewAndOnBoardingInteractorImp(
        ) {
      return OnBoardingActivityModule_ProvideOnBoardingPresenter$app_releaseFactory.provideOnBoardingPresenter$app_release(onBoardingActivityModule, onBoardingPresenterOfOnBoardingViewAndOnBoardingInteractorImp());
    }

    private BoardingFragmentPagerAdapter boardingFragmentPagerAdapter() {
      return OnBoardingActivityModule_ProvideBoardingFragmentPagerAdapter$app_releaseFactory.provideBoardingFragmentPagerAdapter$app_release(onBoardingActivityModule, arg0);
    }

    @Override
    public void inject(OnBoardingActivity arg0) {
      injectOnBoardingActivity(arg0);
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

    private final DailyActivity arg0;

    private final AppComponentImpl appComponentImpl;

    private final DailyActivitySubcomponentImpl dailyActivitySubcomponentImpl = this;

    private DailyActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        DailyActivityModule dailyActivityModuleParam, DailyActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;
      this.dailyActivityModule = dailyActivityModuleParam;
      this.arg0 = arg0Param;

    }

    private DailyInteractor dailyInteractor() {
      return new DailyInteractor(appComponentImpl.provideTreamentRepoHelper$app_releaseProvider.get(), appComponentImpl.provideDailyRepoHelper$app_releaseProvider.get(), appComponentImpl.provideUserRepoHelper$app_releaseProvider.get(), appComponentImpl.providePrefHelper$app_releaseProvider.get(), appComponentImpl.provideApiHelper$app_releaseProvider.get());
    }

    private DailyInteractorImp dailyInteractorImp() {
      return DailyActivityModule_ProvideDailyInteractor$app_releaseFactory.provideDailyInteractor$app_release(dailyActivityModule, dailyInteractor());
    }

    private DailyPresenter<DailyView, DailyInteractorImp> dailyPresenterOfDailyViewAndDailyInteractorImp(
        ) {
      return new DailyPresenter<DailyView, DailyInteractorImp>(dailyInteractorImp(), AppModule_ProvideSchedulerProvider$app_releaseFactory.provideSchedulerProvider$app_release(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_releaseFactory.provideCompositeDisposable$app_release(appComponentImpl.appModule));
    }

    private DailyPresenterImp<DailyView, DailyInteractorImp> dailyPresenterImpOfDailyViewAndDailyInteractorImp(
        ) {
      return DailyActivityModule_ProvideDailyPresenter$app_releaseFactory.provideDailyPresenter$app_release(dailyActivityModule, dailyPresenterOfDailyViewAndDailyInteractorImp());
    }

    private LinearLayoutManager linearLayoutManager() {
      return DailyActivityModule_ProvideLinearLayoutManager$app_releaseFactory.provideLinearLayoutManager$app_release(dailyActivityModule, arg0);
    }

    @Override
    public void inject(DailyActivity arg0) {
      injectDailyActivity(arg0);
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

    private final DailyDetailActivity arg0;

    private final AppComponentImpl appComponentImpl;

    private final DailyDetailActivitySubcomponentImpl dailyDetailActivitySubcomponentImpl = this;

    private DailyDetailActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        DailyDetailActivityModule dailyDetailActivityModuleParam, DailyDetailActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;
      this.dailyDetailActivityModule = dailyDetailActivityModuleParam;
      this.arg0 = arg0Param;

    }

    private ApiRepository apiRepository() {
      return new ApiRepository(appComponentImpl.provideApolloClient$app_releaseProvider.get());
    }

    private DailyDetailInterador dailyDetailInterador() {
      return injectDailyDetailInterador(DailyDetailInterador_Factory.newInstance(appComponentImpl.provideTreamentRepoHelper$app_releaseProvider.get(), appComponentImpl.provideDailyRepoHelper$app_releaseProvider.get(), appComponentImpl.provideUserRepoHelper$app_releaseProvider.get(), appComponentImpl.providePrefHelper$app_releaseProvider.get(), appComponentImpl.provideApiHelper$app_releaseProvider.get()));
    }

    private DailyDetailInteractorImp dailyDetailInteractorImp() {
      return DailyDetailActivityModule_ProvideDailyDetailInteractor$app_releaseFactory.provideDailyDetailInteractor$app_release(dailyDetailActivityModule, dailyDetailInterador());
    }

    private DailyDetailPresenter<DailyDetailView, DailyDetailInteractorImp> dailyDetailPresenterOfDailyDetailViewAndDailyDetailInteractorImp(
        ) {
      return new DailyDetailPresenter<DailyDetailView, DailyDetailInteractorImp>(dailyDetailInteractorImp(), AppModule_ProvideSchedulerProvider$app_releaseFactory.provideSchedulerProvider$app_release(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_releaseFactory.provideCompositeDisposable$app_release(appComponentImpl.appModule));
    }

    private LinearLayoutManager linearLayoutManager() {
      return DailyDetailActivityModule_ProvideLinearLayoutManager$app_releaseFactory.provideLinearLayoutManager$app_release(dailyDetailActivityModule, arg0);
    }

    private com.sugarcoachpremium.ui.daily_detail.view.CategoryAdapter categoryAdapter() {
      return DailyDetailActivityModule_ProvideCategoryAdapter$app_releaseFactory.provideCategoryAdapter$app_release(dailyDetailActivityModule, arg0);
    }

    private com.sugarcoachpremium.ui.daily_detail.view.ItemAdapter itemAdapter() {
      return DailyDetailActivityModule_ProvideItemAdapter$app_releaseFactory.provideItemAdapter$app_release(dailyDetailActivityModule, arg0);
    }

    @Override
    public void inject(DailyDetailActivity arg0) {
      injectDailyDetailActivity(arg0);
    }

    @CanIgnoreReturnValue
    private DailyDetailInterador injectDailyDetailInterador(DailyDetailInterador instance) {
      DailyDetailInterador_MembersInjector.injectApiRepository(instance, apiRepository());
      return instance;
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

    private final ProfileActivity arg0;

    private final AppComponentImpl appComponentImpl;

    private final ProfileActivitySubcomponentImpl profileActivitySubcomponentImpl = this;

    private ProfileActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        ProfileActivityModule profileActivityModuleParam, ProfileActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;
      this.profileActivityModule = profileActivityModuleParam;
      this.arg0 = arg0Param;

    }

    private ApiRepository apiRepository() {
      return new ApiRepository(appComponentImpl.provideApolloClient$app_releaseProvider.get());
    }

    private ProfileInteractor profileInteractor() {
      return injectProfileInteractor(ProfileInteractor_Factory.newInstance(appComponentImpl.provideDailyRepoHelper$app_releaseProvider.get(), appComponentImpl.provideTreamentRepoHelper$app_releaseProvider.get(), appComponentImpl.provideUserRepoHelper$app_releaseProvider.get(), appComponentImpl.providePrefHelper$app_releaseProvider.get(), appComponentImpl.provideApiHelper$app_releaseProvider.get()));
    }

    private ProfileInteractorImp profileInteractorImp() {
      return ProfileActivityModule_ProvideProfileInteractor$app_releaseFactory.provideProfileInteractor$app_release(profileActivityModule, profileInteractor());
    }

    private ProfilePresenter<ProfileView, ProfileInteractorImp> profilePresenterOfProfileViewAndProfileInteractorImp(
        ) {
      return new ProfilePresenter<ProfileView, ProfileInteractorImp>(profileInteractorImp(), AppModule_ProvideSchedulerProvider$app_releaseFactory.provideSchedulerProvider$app_release(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_releaseFactory.provideCompositeDisposable$app_release(appComponentImpl.appModule));
    }

    private ProfilePresenterImp<ProfileView, ProfileInteractorImp> profilePresenterImpOfProfileViewAndProfileInteractorImp(
        ) {
      return ProfileActivityModule_ProvideProfilePresenter$app_releaseFactory.provideProfilePresenter$app_release(profileActivityModule, profilePresenterOfProfileViewAndProfileInteractorImp());
    }

    private GridLayoutManager gridLayoutManager() {
      return ProfileActivityModule_ProvideGridLayoutManager$app_releaseFactory.provideGridLayoutManager$app_release(profileActivityModule, arg0);
    }

    private ProfileAdapter profileAdapter() {
      return ProfileActivityModule_ProvideProfileAdapter$app_releaseFactory.provideProfileAdapter$app_release(profileActivityModule, arg0);
    }

    @Override
    public void inject(ProfileActivity arg0) {
      injectProfileActivity(arg0);
    }

    @CanIgnoreReturnValue
    private ProfileInteractor injectProfileInteractor(ProfileInteractor instance) {
      ProfileInteractor_MembersInjector.injectApiRepo(instance, apiRepository());
      return instance;
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

    private ConfigActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        ConfigActivityModule configActivityModuleParam, ConfigActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;
      this.configActivityModule = configActivityModuleParam;

    }

    private ConfigInteractor configInteractor() {
      return new ConfigInteractor(appComponentImpl.provideContext$app_releaseProvider.get(), appComponentImpl.provideTreamentRepoHelper$app_releaseProvider.get(), appComponentImpl.provideDailyRepoHelper$app_releaseProvider.get(), appComponentImpl.provideUserRepoHelper$app_releaseProvider.get(), appComponentImpl.providePrefHelper$app_releaseProvider.get(), appComponentImpl.provideApiHelper$app_releaseProvider.get());
    }

    private ConfigInteractorImp configInteractorImp() {
      return ConfigActivityModule_ProvideConfigInteractor$app_releaseFactory.provideConfigInteractor$app_release(configActivityModule, configInteractor());
    }

    private ConfigPresenter<ConfigView, ConfigInteractorImp> configPresenterOfConfigViewAndConfigInteractorImp(
        ) {
      return new ConfigPresenter<ConfigView, ConfigInteractorImp>(configInteractorImp(), AppModule_ProvideSchedulerProvider$app_releaseFactory.provideSchedulerProvider$app_release(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_releaseFactory.provideCompositeDisposable$app_release(appComponentImpl.appModule));
    }

    private ConfigPresenterImp<ConfigView, ConfigInteractorImp> configPresenterImpOfConfigViewAndConfigInteractorImp(
        ) {
      return ConfigActivityModule_ProvideConfigPresenter$app_releaseFactory.provideConfigPresenter$app_release(configActivityModule, configPresenterOfConfigViewAndConfigInteractorImp());
    }

    @Override
    public void inject(ConfigActivity arg0) {
      injectConfigActivity(arg0);
    }

    @CanIgnoreReturnValue
    private ConfigActivity injectConfigActivity(ConfigActivity instance) {
      ConfigActivity_MembersInjector.injectPresenter(instance, configPresenterImpOfConfigViewAndConfigInteractorImp());
      return instance;
    }
  }

  private static final class StatisticsActivitySubcomponentImpl implements ActivityBuilder_BindStatisticsActivity.StatisticsActivitySubcomponent {
    private final StatisticsActivityModule statisticsActivityModule;

    private final StatisticsActivity arg0;

    private final AppComponentImpl appComponentImpl;

    private final StatisticsActivitySubcomponentImpl statisticsActivitySubcomponentImpl = this;

    private StatisticsActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        StatisticsActivityModule statisticsActivityModuleParam, StatisticsActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;
      this.statisticsActivityModule = statisticsActivityModuleParam;
      this.arg0 = arg0Param;

    }

    private StatisticsInteractor statisticsInteractor() {
      return new StatisticsInteractor(appComponentImpl.provideTreamentRepoHelper$app_releaseProvider.get(), appComponentImpl.provideDailyRepoHelper$app_releaseProvider.get(), appComponentImpl.provideUserRepoHelper$app_releaseProvider.get(), appComponentImpl.providePrefHelper$app_releaseProvider.get(), appComponentImpl.provideApiHelper$app_releaseProvider.get());
    }

    private StatisticsInteractorImp statisticsInteractorImp() {
      return StatisticsActivityModule_ProvideStatisticsInteractor$app_releaseFactory.provideStatisticsInteractor$app_release(statisticsActivityModule, statisticsInteractor());
    }

    private StatisticsPresenter<StatisticsView, StatisticsInteractorImp> statisticsPresenterOfStatisticsViewAndStatisticsInteractorImp(
        ) {
      return new StatisticsPresenter<StatisticsView, StatisticsInteractorImp>(statisticsInteractorImp(), AppModule_ProvideSchedulerProvider$app_releaseFactory.provideSchedulerProvider$app_release(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_releaseFactory.provideCompositeDisposable$app_release(appComponentImpl.appModule));
    }

    private StatisticsPresenterImp<StatisticsView, StatisticsInteractorImp> statisticsPresenterImpOfStatisticsViewAndStatisticsInteractorImp(
        ) {
      return StatisticsActivityModule_ProvideStatisticsPresenter$app_releaseFactory.provideStatisticsPresenter$app_release(statisticsActivityModule, statisticsPresenterOfStatisticsViewAndStatisticsInteractorImp());
    }

    private StatisticsAdapter statisticsAdapter() {
      return StatisticsActivityModule_ProvideStatisticsAdapter$app_releaseFactory.provideStatisticsAdapter$app_release(statisticsActivityModule, arg0);
    }

    private LinearLayoutManager linearLayoutManager() {
      return StatisticsActivityModule_ProvideLinearLayoutManager$app_releaseFactory.provideLinearLayoutManager$app_release(statisticsActivityModule, arg0);
    }

    @Override
    public void inject(StatisticsActivity arg0) {
      injectStatisticsActivity(arg0);
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

    private ForgotActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        ForgotActivityModule forgotActivityModuleParam, ForgotActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;
      this.forgotActivityModule = forgotActivityModuleParam;

    }

    private ForgotInteractor forgotInteractor() {
      return new ForgotInteractor(appComponentImpl.provideDailyRepoHelper$app_releaseProvider.get(), appComponentImpl.provideUserRepoHelper$app_releaseProvider.get(), appComponentImpl.providePrefHelper$app_releaseProvider.get(), appComponentImpl.provideApiHelper$app_releaseProvider.get());
    }

    private ForgotInteractorImp forgotInteractorImp() {
      return ForgotActivityModule_ProvideforgotInteractor$app_releaseFactory.provideforgotInteractor$app_release(forgotActivityModule, forgotInteractor());
    }

    private ForgotPresenter<ForgotView, ForgotInteractorImp> forgotPresenterOfForgotViewAndForgotInteractorImp(
        ) {
      return new ForgotPresenter<ForgotView, ForgotInteractorImp>(forgotInteractorImp(), AppModule_ProvideSchedulerProvider$app_releaseFactory.provideSchedulerProvider$app_release(appComponentImpl.appModule), AppModule_ProvideCompositeDisposable$app_releaseFactory.provideCompositeDisposable$app_release(appComponentImpl.appModule));
    }

    private ForgotPresenterImp<ForgotView, ForgotInteractorImp> forgotPresenterImpOfForgotViewAndForgotInteractorImp(
        ) {
      return ForgotActivityModule_ProvideforgotPresenter$app_releaseFactory.provideforgotPresenter$app_release(forgotActivityModule, forgotPresenterOfForgotViewAndForgotInteractorImp());
    }

    @Override
    public void inject(ForgotActivity arg0) {
      injectForgotActivity(arg0);
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

    private Provider<ActivityBuilder_BindSplashActivity.SplashActivitySubcomponent.Factory> splashActivitySubcomponentFactoryProvider;

    private Provider<ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Factory> mainActivitySubcomponentFactoryProvider;

    private Provider<ActivityBuilder_BindRegisterActivity.RegisterActivitySubcomponent.Factory> registerActivitySubcomponentFactoryProvider;

    private Provider<ActivityBuilder_BindTreatmentActivity.TreatmentActivitySubcomponent.Factory> treatmentActivitySubcomponentFactoryProvider;

    private Provider<ActivityBuilder_BindLoginActivity.LoginActivitySubcomponent.Factory> loginActivitySubcomponentFactoryProvider;

    private Provider<ActivityBuilder_BindSignActivity.SignActivitySubcomponent.Factory> signActivitySubcomponentFactoryProvider;

    private Provider<ActivityBuilder_BindSignEmailctivity.SignEmailActivitySubcomponent.Factory> signEmailActivitySubcomponentFactoryProvider;

    private Provider<ActivityBuilder_BindOnBoardingActivity.OnBoardingActivitySubcomponent.Factory> onBoardingActivitySubcomponentFactoryProvider;

    private Provider<ActivityBuilder_BindDailyActivity.DailyActivitySubcomponent.Factory> dailyActivitySubcomponentFactoryProvider;

    private Provider<ActivityBuilder_BindDailyDetailActivity.DailyDetailActivitySubcomponent.Factory> dailyDetailActivitySubcomponentFactoryProvider;

    private Provider<ActivityBuilder_BindProfileActivity.ProfileActivitySubcomponent.Factory> profileActivitySubcomponentFactoryProvider;

    private Provider<ActivityBuilder_BindConfigActivity.ConfigActivitySubcomponent.Factory> configActivitySubcomponentFactoryProvider;

    private Provider<ActivityBuilder_BindStatisticsActivity.StatisticsActivitySubcomponent.Factory> statisticsActivitySubcomponentFactoryProvider;

    private Provider<ActivityBuilder_BindForgotActivity.ForgotActivitySubcomponent.Factory> forgotActivitySubcomponentFactoryProvider;

    private Provider<Application> applicationProvider;

    private Provider<Context> provideContext$app_releaseProvider;

    private Provider<AppDatabase> provideAppDatabase$app_releaseProvider;

    private Provider<DailyRegisterRepo> provideDailyRepoHelper$app_releaseProvider;

    private Provider<TreamentRepo> provideTreamentRepoHelper$app_releaseProvider;

    private Provider<UserRepo> provideUserRepoHelper$app_releaseProvider;

    private Provider<String> provideprefFileName$app_releaseProvider;

    private Provider<AppPreferenceHelper> appPreferenceHelperProvider;

    private Provider<PreferenceHelper> providePrefHelper$app_releaseProvider;

    private Provider<Retrofit> provideRetrofitProvider;

    private Provider<ApiHelper> provideApiHelper$app_releaseProvider;

    private Provider<ApolloClient> provideApolloClient$app_releaseProvider;

    private AppComponentImpl(AppModule appModuleParam, Application applicationParam) {
      this.appModule = appModuleParam;
      initialize(appModuleParam, applicationParam);

    }

    private Map<Class<?>, Provider<dagger.android.AndroidInjector.Factory<?>>> mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
        ) {
      return MapBuilder.<Class<?>, Provider<dagger.android.AndroidInjector.Factory<?>>>newMapBuilder(14).put(SplashActivity.class, ((Provider) splashActivitySubcomponentFactoryProvider)).put(MainActivity.class, ((Provider) mainActivitySubcomponentFactoryProvider)).put(RegisterActivity.class, ((Provider) registerActivitySubcomponentFactoryProvider)).put(TreatmentActivity.class, ((Provider) treatmentActivitySubcomponentFactoryProvider)).put(LoginActivity.class, ((Provider) loginActivitySubcomponentFactoryProvider)).put(SignActivity.class, ((Provider) signActivitySubcomponentFactoryProvider)).put(SignEmailActivity.class, ((Provider) signEmailActivitySubcomponentFactoryProvider)).put(OnBoardingActivity.class, ((Provider) onBoardingActivitySubcomponentFactoryProvider)).put(DailyActivity.class, ((Provider) dailyActivitySubcomponentFactoryProvider)).put(DailyDetailActivity.class, ((Provider) dailyDetailActivitySubcomponentFactoryProvider)).put(ProfileActivity.class, ((Provider) profileActivitySubcomponentFactoryProvider)).put(ConfigActivity.class, ((Provider) configActivitySubcomponentFactoryProvider)).put(StatisticsActivity.class, ((Provider) statisticsActivitySubcomponentFactoryProvider)).put(ForgotActivity.class, ((Provider) forgotActivitySubcomponentFactoryProvider)).build();
    }

    private DispatchingAndroidInjector<Object> dispatchingAndroidInjectorOfObject() {
      return DispatchingAndroidInjector_Factory.newInstance(mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<dagger.android.AndroidInjector.Factory<?>>>emptyMap());
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
      this.provideContext$app_releaseProvider = DoubleCheck.provider(AppModule_ProvideContext$app_releaseFactory.create(appModuleParam, applicationProvider));
      this.provideAppDatabase$app_releaseProvider = DoubleCheck.provider(AppModule_ProvideAppDatabase$app_releaseFactory.create(appModuleParam, provideContext$app_releaseProvider));
      this.provideDailyRepoHelper$app_releaseProvider = DoubleCheck.provider(AppModule_ProvideDailyRepoHelper$app_releaseFactory.create(appModuleParam, provideAppDatabase$app_releaseProvider));
      this.provideTreamentRepoHelper$app_releaseProvider = DoubleCheck.provider(AppModule_ProvideTreamentRepoHelper$app_releaseFactory.create(appModuleParam, provideAppDatabase$app_releaseProvider));
      this.provideUserRepoHelper$app_releaseProvider = DoubleCheck.provider(AppModule_ProvideUserRepoHelper$app_releaseFactory.create(appModuleParam, provideAppDatabase$app_releaseProvider));
      this.provideprefFileName$app_releaseProvider = AppModule_ProvideprefFileName$app_releaseFactory.create(appModuleParam);
      this.appPreferenceHelperProvider = AppPreferenceHelper_Factory.create(provideContext$app_releaseProvider, provideprefFileName$app_releaseProvider);
      this.providePrefHelper$app_releaseProvider = DoubleCheck.provider(AppModule_ProvidePrefHelper$app_releaseFactory.create(appModuleParam, appPreferenceHelperProvider));
      this.provideRetrofitProvider = DoubleCheck.provider(AppModule_ProvideRetrofitFactory.create(appModuleParam));
      this.provideApiHelper$app_releaseProvider = DoubleCheck.provider(AppModule_ProvideApiHelper$app_releaseFactory.create(appModuleParam, provideRetrofitProvider));
      this.provideApolloClient$app_releaseProvider = DoubleCheck.provider(AppModule_ProvideApolloClient$app_releaseFactory.create(appModuleParam));
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
