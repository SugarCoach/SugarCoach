package com.sugarcoach.ui.main.presenter

import android.app.Activity
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.ui.base.presenter.Presenter
import com.sugarcoach.ui.main.interactor.MainInteractorImp
import com.sugarcoach.ui.main.view.MainView
import io.reactivex.Observable
import io.reactivex.Single


interface MainPresenterImp<V : MainView, I : MainInteractorImp> : Presenter<V, I>{
    fun goToActivityRegister()
    fun goToActivityTreatment()
    fun goToActivityDaily()
    fun goToActivityProfile()
    fun goToActivityConfig()
    fun goToActivityStatistics()
    fun logOut()
    fun onResume()
    fun onRequestPermissionsResult(context: Activity, requestCode: Int, permissions: Array<String>, grantResults: IntArray)
    fun checkAndRequestPermissions(context: Activity)

}