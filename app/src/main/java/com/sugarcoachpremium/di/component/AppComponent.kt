package com.sugarcoachpremium.di.component

import android.app.Application
import com.sugarcoachpremium.SugarApp
import com.sugarcoachpremium.di.builder.ActivityBuilder
import com.sugarcoachpremium.di.module.AppModule
import com.sugarcoachpremium.di.module.DatabaseModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityBuilder::class,
        DatabaseModule::class
    ]
)
interface AppComponent : AndroidInjector<SugarApp> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    override fun inject(app: SugarApp)

}