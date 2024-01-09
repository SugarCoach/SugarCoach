package com.sugarcoachpremium.ui.config.presenter

import android.app.Activity
import com.sugarcoachpremium.ui.base.presenter.Presenter
import com.sugarcoachpremium.ui.config.interactor.ConfigInteractorImp
import com.sugarcoachpremium.ui.config.view.ConfigView
import java.util.*


interface ConfigPresenterImp<V : ConfigView, I : ConfigInteractorImp> : Presenter<V, I>{
    fun updateControl(value: Boolean?)
    fun updateControlMedico(value: Boolean?)
    fun updateSms(context: Activity,value: Boolean?)
    fun updateGeo(context: Activity,value: Boolean?)
    fun updateNumber(value: String?)
    fun updateType(value: String?)
    fun goToActivityDaily()
    fun goToActivityMain()
    fun goToActivityStatistic()
    fun goToActivityTreament()
    fun onRequestPermissionsResult(context: Activity, requestCode: Int, permissions: Array<String>, grantResults: IntArray)
    fun checkAndRequestPermissions(context: Activity,  permission: ArrayList<String> )


}