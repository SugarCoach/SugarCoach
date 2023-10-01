package com.sugarcoach.ui.profile.presenter

import android.app.Activity
import android.content.Intent
import android.view.View
import androidx.fragment.app.FragmentManager
import com.sugarcoach.ui.base.presenter.Presenter
import com.sugarcoach.ui.daily.interactor.DailyInteractorImp
import com.sugarcoach.ui.daily.view.DailyView
import com.sugarcoach.ui.profile.interactor.ProfileInteractorImp
import com.sugarcoach.ui.profile.view.ProfileItem
import com.sugarcoach.ui.profile.view.ProfileView
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
import org.joda.time.LocalDate
import java.text.FieldPosition
import java.util.*


interface ProfilePresenterImp<V : ProfileView, I : ProfileInteractorImp> : Presenter<V, I>{
    fun logout()
    fun updateSex(name: String?)
    fun updateAvatar(position: Int, avatar: ProfileItem)
    fun setBirthday(year: Int, monthOfYear: Int, dayOfMonth: Int)
    fun setDebut(year: Int, monthOfYear: Int, dayOfMonth: Int)
    fun updateAll(name: String?,weight: Float?,height: Float?,username: String?,mail: String?)
    fun showDateDialog(fragmentManager: FragmentManager, dateSetListener: DatePickerDialog.OnDateSetListener, tag: String, date: LocalDate)
    fun getScreenShot(context: Activity, view: View)
    fun onRequestPermissionsResult(context: Activity, requestCode: Int, permissions: Array<String>, grantResults: IntArray)
}