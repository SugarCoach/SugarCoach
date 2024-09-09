package com.sugarcoachpremium.di.builder;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0016H\'J\b\u0010\u0017\u001a\u00020\u0018H\'J\b\u0010\u0019\u001a\u00020\u001aH\'J\b\u0010\u001b\u001a\u00020\u001cH\'J\b\u0010\u001d\u001a\u00020\u001eH\'\u00a8\u0006\u001f"}, d2 = {"Lcom/sugarcoachpremium/di/builder/ActivityBuilder;", "", "()V", "bindConfigActivity", "Lcom/sugarcoachpremium/ui/config/view/ConfigActivity;", "bindDailyActivity", "Lcom/sugarcoachpremium/ui/daily/view/DailyActivity;", "bindDailyDetailActivity", "Lcom/sugarcoachpremium/ui/daily_detail/view/DailyDetailActivity;", "bindForgotActivity", "Lcom/sugarcoachpremium/ui/forgot/view/ForgotActivity;", "bindLoginActivity", "Lcom/sugarcoachpremium/ui/login/view/LoginActivity;", "bindMainActivity", "Lcom/sugarcoachpremium/ui/main/view/MainActivity;", "bindOnBoardingActivity", "Lcom/sugarcoachpremium/ui/onboarding/view/OnBoardingActivity;", "bindProfileActivity", "Lcom/sugarcoachpremium/ui/profile/view/ProfileActivity;", "bindRegisterActivity", "Lcom/sugarcoachpremium/ui/register/view/RegisterActivity;", "bindSignActivity", "Lcom/sugarcoachpremium/ui/sign/view/SignActivity;", "bindSignEmailctivity", "Lcom/sugarcoachpremium/ui/signEmail/view/SignEmailActivity;", "bindSplashActivity", "Lcom/sugarcoachpremium/ui/splash/view/SplashActivity;", "bindStatisticsActivity", "Lcom/sugarcoachpremium/ui/statistics/view/StatisticsActivity;", "bindTreatmentActivity", "Lcom/sugarcoachpremium/ui/treatment/view/TreatmentActivity;", "app_release"})
public abstract class ActivityBuilder {
    
    public ActivityBuilder() {
        super();
    }
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.splash.SplashActivityModule.class})
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.ui.splash.view.SplashActivity bindSplashActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.main.MainActivityModule.class})
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.ui.main.view.MainActivity bindMainActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.register.RegisterActivityModule.class})
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.ui.register.view.RegisterActivity bindRegisterActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.treatment.TreatmentActivityModule.class})
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.ui.treatment.view.TreatmentActivity bindTreatmentActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.login.LoginActivityModule.class})
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.ui.login.view.LoginActivity bindLoginActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.sign.SignActivityModule.class})
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.ui.sign.view.SignActivity bindSignActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.signEmail.SignEmailActivityModule.class})
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.ui.signEmail.view.SignEmailActivity bindSignEmailctivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.onboarding.OnBoardingActivityModule.class})
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.ui.onboarding.view.OnBoardingActivity bindOnBoardingActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.daily.DailyActivityModule.class})
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.ui.daily.view.DailyActivity bindDailyActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.daily_detail.DailyDetailActivityModule.class})
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity bindDailyDetailActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.profile.ProfileActivityModule.class})
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.ui.profile.view.ProfileActivity bindProfileActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.config.ConfigActivityModule.class})
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.ui.config.view.ConfigActivity bindConfigActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.statistics.StatisticsActivityModule.class})
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.ui.statistics.view.StatisticsActivity bindStatisticsActivity();
    
    @dagger.android.ContributesAndroidInjector(modules = {com.sugarcoachpremium.ui.forgot.ForgotActivityModule.class})
    @org.jetbrains.annotations.NotNull
    public abstract com.sugarcoachpremium.ui.forgot.view.ForgotActivity bindForgotActivity();
}