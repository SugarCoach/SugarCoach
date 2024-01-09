package com.sugarcoachpremium.ui.main.presenter

import android.app.Activity
import com.sugarcoachpremium.ui.base.presenter.Presenter
import com.sugarcoachpremium.ui.main.interactor.MainInteractorImp
import com.sugarcoachpremium.ui.main.view.MainView


interface MainPresenterImp<V : MainView, I : MainInteractorImp> : Presenter<V, I>{
    fun goToActivityRegister()
    fun goToActivityTreatment()
    fun goToActivityDaily()
    fun goToActivityProfile()
    fun goToActivityConfig()
    fun goToActivityStatistics()
    fun onResume()
    fun onRequestPermissionsResult(context: Activity, requestCode: Int, permissions: Array<String>, grantResults: IntArray)
    fun checkAndRequestPermissions(context: Activity)

}