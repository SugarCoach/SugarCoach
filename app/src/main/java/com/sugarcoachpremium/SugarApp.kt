package com.sugarcoachpremium

import android.app.Application
//import com.appspector.sdk.AppSpector
import com.sugarcoachpremium.di.component.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject


class SugarApp : Application(), HasAndroidInjector {

    @Inject lateinit var dispatchingAndroidInjector : DispatchingAndroidInjector<Any>

    override fun androidInjector() = dispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
            .application(this)
            .build()
            .inject(this)
        /*AppSpector
            .build(this)
            .withDefaultMonitors()
            .run("android_MTQ4MjQ0ZjEtZjFiNS00MmI3LWJjZWYtMzg2Y2I4OTJjYmY2");*/
    }

}