package com.sugarcoachpremium.ui.daily_detail.presenter

import android.app.Activity
import android.content.Intent
import android.view.View
import androidx.fragment.app.FragmentManager
import com.sugarcoachpremium.ui.base.presenter.Presenter
import com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp
import com.sugarcoachpremium.ui.daily_detail.view.DailyDetailView
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
import java.util.*


interface DailyDetailPresenterImp<V : DailyDetailView, I : DailyDetailInteractorImp> : Presenter<V, I> {
    fun getRegister(id: Int)
    fun getScreenShot(context: Activity,view: View)
    fun deleteRegister()
    fun updateGlucose(glucose: Float?)
    fun updateInsulin(insulin: Float?)
    fun updateBasal(basal: Float?)
    fun updateCarb(carbohydrates: Float?)
    fun updateExercise(exercise: String?)
    fun updateLabel(label: Int?)
    fun updateEmotional(emotional: String?)
    fun updateComment(comment: String?)
    fun updatePhoto(photo: String?)
    fun updateDate(date: Date?)
    fun showDateDialog(fragmentManager: FragmentManager, dateSetListener: DatePickerDialog.OnDateSetListener)
    fun showTimeDialog(fragmentManager: FragmentManager, timeSetListener: TimePickerDialog.OnTimeSetListener)
    fun initChooser(context: Activity)
    fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
    fun onRequestPermissionsResult(context: Activity, requestCode: Int, permissions: Array<String>, grantResults: IntArray)
    fun showChooser()
    fun setTime(hourOfDay: Int, minute: Int)
    fun setDate(year: Int, monthOfYear: Int, dayOfMonth: Int)
    fun checkAndRequestPermissions(context: Activity): Boolean
    fun goToActivityTreament()
    fun goToActivityMain()
    fun goToActivityStatistic()
    fun goToActivityRegister()
    fun getColorType(value: Float): Int
    fun saveComment(comment: String)


}