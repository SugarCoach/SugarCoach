package com.sugarcoach.ui.statistics.view

import android.net.Uri
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.ui.base.view.BaseView
import com.sugarcoach.ui.daily.view.DailyItem
import java.util.*
import kotlin.collections.ArrayList


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