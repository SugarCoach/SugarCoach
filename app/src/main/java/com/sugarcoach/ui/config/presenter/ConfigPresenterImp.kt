package com.sugarcoach.ui.config.presenter

import android.app.Activity
import android.content.Intent
import androidx.fragment.app.FragmentManager
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.treament.Treament
import com.sugarcoach.data.network.LoginResponse
import com.sugarcoach.data.network.RegistersResponse
import com.sugarcoach.ui.base.presenter.Presenter
import com.sugarcoach.ui.config.interactor.ConfigInteractorImp
import com.sugarcoach.ui.config.view.ConfigView
import com.sugarcoach.ui.daily.interactor.DailyInteractorImp
import com.sugarcoach.ui.daily.view.DailyView
import com.sugarcoach.ui.profile.interactor.ProfileInteractorImp
import com.sugarcoach.ui.profile.view.ProfileView
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
import io.reactivex.Observable
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