package com.sugarcoach.di.component

import android.app.Application
import com.sugarcoach.SugarApp
import com.sugarcoach.di.builder.ActivityBuilder
import com.sugarcoach.di.module.AppModule
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