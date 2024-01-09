package com.sugarcoachpremium.ui.statistics.presenter

import android.app.Activity
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoachpremium.ui.base.presenter.Presenter
import com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp
import com.sugarcoachpremium.ui.statistics.view.StatisticsView


interface StatisticsPresenterImp<V : StatisticsView, I : StatisticsInteractorImp> : Presenter<V, I>{
    fun getData()
    fun getDataUpdated(position: Int, index: Int)
    fun goToActivityDaily()
    fun goToActivityMain()
    fun goToActivityTreament()
    fun getDataGlucoseLast(position: Int)
    fun getDataGlucoseDate(start: String, end: String,position: Int)
    fun getDataInsulineDate(position: Int,date: String, index: Int)
    fun getDataCarDate(position: Int, date: String, index: Int)
    fun getDataExercisesLast( position: Int)
    fun getDataExercisesDates(start: String, end: String, position: Int)
    fun getDataStatesLast(position: Int)
    fun getDataStatesDates(start: String, end: String,position: Int)
    fun getScreenShot(context: Activity, view: RecyclerView)
    fun onRequestPermissionsResult(context: Activity, requestCode: Int, permissions: Array<String>, grantResults: IntArray)

}