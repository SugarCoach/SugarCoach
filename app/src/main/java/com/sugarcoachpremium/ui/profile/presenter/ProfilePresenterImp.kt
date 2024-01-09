package com.sugarcoachpremium.ui.profile.presenter

import android.app.Activity
import android.view.View
import androidx.fragment.app.FragmentManager
import com.sugarcoachpremium.ui.base.presenter.Presenter
import com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp
import com.sugarcoachpremium.ui.profile.view.ProfileItem
import com.sugarcoachpremium.ui.profile.view.ProfileView
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import org.joda.time.LocalDate


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