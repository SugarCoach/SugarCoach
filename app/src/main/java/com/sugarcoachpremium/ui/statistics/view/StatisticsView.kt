package com.sugarcoachpremium.ui.statistics.view

import android.net.Uri
import com.sugarcoachpremium.ui.base.view.BaseView
import java.util.*


interface StatisticsView : BaseView {

    fun getData(data: List<StatisticsItem>)
    fun setUp()
    fun setDate(date: Date)
    fun getInsulinaType(): List<String>
    fun getGlucemiaType(): List<String>
    fun getCarType(): List<String>
    fun getExcercisesType(): List<String>
    fun getStatesType(): List<String>
    fun setDataUpdated(position: Int, data: StatisticsItem)
    fun mirrorAccount()
    fun openDailyActivity()
    fun openMainActivity()
    fun openTreatmentActivity()
    fun sharedScreenShot(uri: Uri)
    fun explain(msg: Int)
}