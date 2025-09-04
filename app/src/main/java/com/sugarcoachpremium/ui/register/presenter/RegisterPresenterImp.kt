package com.sugarcoachpremium.ui.register.presenter

import android.app.Activity
import android.content.Intent
import androidx.fragment.app.FragmentManager
import com.sugarcoachpremium.ui.base.presenter.Presenter
import com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp
import com.sugarcoachpremium.ui.register.view.RegisterView
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog


interface RegisterPresenterImp<V : RegisterView, I : RegisterInteractorImp> : Presenter<V, I>{
    fun nextLoad()
    fun prevLoad()
    fun finishLoad()
    fun backLoad()
    fun setEmocional(value: String)
    fun setExercises(value: String)
    fun setMedition(value: Int)
    fun setTime(hourOfDay: Int, minute: Int)
    fun setDate(year: Int, monthOfYear: Int, dayOfMonth: Int)
    fun showDateDialog(fragmentManager: FragmentManager, dateSetListener: DatePickerDialog.OnDateSetListener)
    fun showTimeDialog(fragmentManager: FragmentManager, timeSetListener: TimePickerDialog.OnTimeSetListener)
    fun checkValue(floatValue: Float)
    fun initChooser(context: Activity)
    fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
    fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray)
    fun showChooser()
    fun saveComment(comment: String)
    fun goToActivityDaily()
    fun goToActivityMain()
    fun goToActivityStatistic()
    fun goToActivityTreament()
    fun rollBack()


}