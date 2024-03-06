package com.sugarcoachpremium.di.builder

import com.sugarcoachpremium.ui.config.ConfigActivityModule
import com.sugarcoachpremium.ui.config.view.ConfigActivity
import com.sugarcoachpremium.ui.daily.DailyActivityModule
import com.sugarcoachpremium.ui.daily.view.DailyActivity
import com.sugarcoachpremium.ui.daily_detail.DailyDetailActivityModule
import com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity
import com.sugarcoachpremium.ui.forgot.ForgotActivityModule
import com.sugarcoachpremium.ui.forgot.view.ForgotActivity
import com.sugarcoachpremium.ui.login.LoginActivityModule
import com.sugarcoachpremium.ui.login.view.LoginActivity
import com.sugarcoachpremium.ui.main.MainActivityModule
import com.sugarcoachpremium.ui.main.view.MainActivity
import com.sugarcoachpremium.ui.onboarding.OnBoardingActivityModule
import com.sugarcoachpremium.ui.onboarding.view.OnBoardingActivity
import com.sugarcoachpremium.ui.profile.ProfileActivityModule
import com.sugarcoachpremium.ui.profile.view.ProfileActivity
import com.sugarcoachpremium.ui.register.RegisterActivityModule
import com.sugarcoachpremium.ui.register.view.RegisterActivity
import com.sugarcoachpremium.ui.sign.SignActivityModule
import com.sugarcoachpremium.ui.sign.view.SignActivity
import com.sugarcoachpremium.ui.signEmail.SignEmailActivityModule
import com.sugarcoachpremium.ui.signEmail.view.SignEmailActivity
import com.sugarcoachpremium.ui.splash.SplashActivityModule
import com.sugarcoachpremium.ui.splash.view.SplashActivity
import com.sugarcoachpremium.ui.statistics.StatisticsActivityModule
import com.sugarcoachpremium.ui.statistics.view.StatisticsActivity
import com.sugarcoachpremium.ui.table.view.TableActivity
import com.sugarcoachpremium.ui.treatment.TreatmentActivityModule
import com.sugarcoachpremium.ui.treatment.view.TreatmentActivity
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

    /*@ContributesAndroidInjector()
    abstract fun bindMainTableActivity(): TableActivity*/
//

//    @ContributesAndroidInjector(modules = [(BlogFragmentProvider::class), (OpenSourceFragmentProvider::class)])
//    abstract fun bindFeedActivity(): FeedActivity

}