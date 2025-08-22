package com.sugarcoachpremium.di.builder;

@dagger.Module()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0007H\'J\b\u0010\b\u001a\u00020\tH\'J\b\u0010\n\u001a\u00020\u000bH\'J\b\u0010\f\u001a\u00020\rH\'J\b\u0010\u000e\u001a\u00020\u000fH\'J\b\u0010\u0010\u001a\u00020\u0011H\'J\b\u0010\u0012\u001a\u00020\u0013H\'J\b\u0010\u0014\u001a\u00020\u0015H\'J\b\u0010\u0016\u001a\u00020\u0017H\'J\b\u0010\u0018\u001a\u00020\u0019H\'J\b\u0010\u001a\u001a\u00020\u001bH\'J\b\u0010\u001c\u001a\u00020\u001dH\'J\b\u0010\u001e\u001a\u00020\u001fH\'\u00a8\u0006 "}, d2 = {"Lcom/sugarcoachpremium/di/builder/ActivityBuilder;", "", "<init>", "()V", "bindSplashActivity", "Lcom/sugarcoachpremium/ui/splash/view/SplashActivity;", "bindMainActivity", "Lcom/sugarcoachpremium/ui/main/view/MainActivity;", "bindRegisterActivity", "Lcom/sugarcoachpremium/ui/register/view/RegisterActivity;", "bindTreatmentActivity", "Lcom/sugarcoachpremium/ui/treatment/view/TreatmentActivity;", "bindLoginActivity", "Lcom/sugarcoachpremium/ui/login/view/LoginActivity;", "bindSignActivity", "Lcom/sugarcoachpremium/ui/sign/view/SignActivity;", "bindSignEmailctivity", "Lcom/sugarcoachpremium/ui/signEmail/view/SignEmailActivity;", "bindOnBoardingActivity", "Lcom/sugarcoachpremium/ui/onboarding/view/OnBoardingActivity;", "bindDailyActivity", "Lcom/sugarcoachpremium/ui/daily/view/DailyActivity;", "bindDailyDetailActivity", "Lcom/sugarcoachpremium/ui/daily_detail/view/DailyDetailActivity;", "bindProfileActivity", "Lcom/sugarcoachpremium/ui/profile/view/ProfileActivity;", "bindConfigActivity", "Lcom/sugarcoachpremium/ui/config/view/ConfigActivity;", "bindStatisticsActivity", "Lcom/sugarcoachpremium/ui/statistics/view/StatisticsActivity;", "bindForgotActivity", "Lcom/sugarcoachpremium/ui/forgot/view/ForgotActivity;", "app_debug"})
public abstract class ActivityBuilder {
    
    public ActivityBuilder() {
        super();
    }
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.splash.SplashActivityModule.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.sugarcoachpremium.ui.splash.view.SplashActivity bindSplashActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.main.MainActivityModule.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.sugarcoachpremium.ui.main.view.MainActivity bindMainActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.register.RegisterActivityModule.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.sugarcoachpremium.ui.register.view.RegisterActivity bindRegisterActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.treatment.TreatmentActivityModule.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.sugarcoachpremium.ui.treatment.view.TreatmentActivity bindTreatmentActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.login.LoginActivityModule.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.sugarcoachpremium.ui.login.view.LoginActivity bindLoginActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.sign.SignActivityModule.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.sugarcoachpremium.ui.sign.view.SignActivity bindSignActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.signEmail.SignEmailActivityModule.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.sugarcoachpremium.ui.signEmail.view.SignEmailActivity bindSignEmailctivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.onboarding.OnBoardingActivityModule.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.sugarcoachpremium.ui.onboarding.view.OnBoardingActivity bindOnBoardingActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.daily.DailyActivityModule.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.sugarcoachpremium.ui.daily.view.DailyActivity bindDailyActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.daily_detail.DailyDetailActivityModule.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity bindDailyDetailActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.profile.ProfileActivityModule.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.sugarcoachpremium.ui.profile.view.ProfileActivity bindProfileActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.config.ConfigActivityModule.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.sugarcoachpremium.ui.config.view.ConfigActivity bindConfigActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.statistics.StatisticsActivityModule.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.sugarcoachpremium.ui.statistics.view.StatisticsActivity bindStatisticsActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.forgot.ForgotActivityModule.class})
    @org.jetbrains.annotations.NotNull()
    public abstract com.sugarcoachpremium.ui.forgot.view.ForgotActivity bindForgotActivity();
}