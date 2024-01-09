package com.sugarcoachpremium.di.component

import android.app.Application
import com.sugarcoachpremium.SugarApp
import com.sugarcoachpremium.di.builder.ActivityBuilder
import com.sugarcoachpremium.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [(AndroidInjectionModule::class), (AppModule::class), (ActivityBuilder::class)])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: SugarApp)

}