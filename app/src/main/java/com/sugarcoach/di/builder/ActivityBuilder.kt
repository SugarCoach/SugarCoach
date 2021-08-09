package com.sugarcoach.di.builder

import com.sugarcoach.ui.config.ConfigActivityModule
import com.sugarcoach.ui.config.view.ConfigActivity
import com.sugarcoach.ui.daily.DailyActivityModule
import com.sugarcoach.ui.daily.view.DailyActivity
import com.sugarcoach.ui.daily_detail.DailyDetailActivityModule
import com.sugarcoach.ui.daily_detail.view.DailyDetailActivity
import com.sugarcoach.ui.forgot.ForgotActivityModule
import com.sugarcoach.ui.forgot.view.ForgotActivity
import com.sugarcoach.ui.login.LoginActivityModule
import com.sugarcoach.ui.login.view.LoginActivity
import com.sugarcoach.ui.main.MainActivityModule
import com.sugarcoach.ui.main.view.MainActivity
import com.sugarcoach.ui.onboarding.OnBoardingActivityModule
import com.sugarcoach.ui.onboarding.view.OnBoardingActivity
import com.sugarcoach.ui.profile.ProfileActivityModule
import com.sugarcoach.ui.profile.view.ProfileActivity
import com.sugarcoach.ui.register.RegisterActivityModule
import com.sugarcoach.ui.register.view.RegisterActivity
import com.sugarcoach.ui.sign.SignActivityModule
import com.sugarcoach.ui.sign.view.SignActivity
import com.sugarcoach.ui.signEmail.SignEmailActivityModule
import com.sugarcoach.ui.signEmail.view.SignEmailActivity
import com.sugarcoach.ui.splash.SplashActivityModule
import com.sugarcoach.ui.splash.view.SplashActivity
import com.sugarcoach.ui.statistics.StatisticsActivityModule
import com.sugarcoach.ui.statistics.view.StatisticsActivity
import com.sugarcoach.ui.treatment.TreatmentActivityModule
import com.sugarcoach.ui.treatment.view.TreatmentActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(SplashActivityModule::class)])
    abstract fun bindSplashActivity(): SplashActivity

    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [(RegisterActivityModule::class)])
    abstract fun bindRegisterActivity(): RegisterActivity

    @ContributesAndroidInjector(modules = [(TreatmentActivityModule::class)])
    abstract fun bindTreatmentActivity(): TreatmentActivity
//
    @ContributesAndroidInjector(modules = [(LoginActivityModule::class)])
    abstract fun bindLoginActivity(): LoginActivity

    @ContributesAndroidInjector(modules = [(SignActivityModule::class)])
    abstract fun bindSignActivity(): SignActivity

    @ContributesAndroidInjector(modules = [(SignEmailActivityModule::class)])
    abstract fun bindSignEmailctivity(): SignEmailActivity

    @ContributesAndroidInjector(modules = [(OnBoardingActivityModule::class)])
    abstract fun bindOnBoardingActivity(): OnBoardingActivity


    @ContributesAndroidInjector(modules = [(DailyActivityModule::class)])
    abstract fun bindDailyActivity(): DailyActivity

    @ContributesAndroidInjector(modules = [(DailyDetailActivityModule::class)])
    abstract fun bindDailyDetailActivity(): DailyDetailActivity

    @ContributesAndroidInjector(modules = [(ProfileActivityModule::class)])
    abstract fun bindProfileActivity(): ProfileActivity

    @ContributesAndroidInjector(modules = [(ConfigActivityModule::class)])
    abstract fun bindConfigActivity(): ConfigActivity


    @ContributesAndroidInjector(modules = [(StatisticsActivityModule::class)])
    abstract fun bindStatisticsActivity(): StatisticsActivity

    @ContributesAndroidInjector(modules = [(ForgotActivityModule::class)])
    abstract fun bindForgotActivity(): ForgotActivity
//

//    @ContributesAndroidInjector(modules = [(BlogFragmentProvider::class), (OpenSourceFragmentProvider::class)])
//    abstract fun bindFeedActivity(): FeedActivity

}