package com.sugarcoach.ui.main.view

import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.ui.base.view.BaseView
import java.util.*


interface MainView : BaseView {
    //fun performLogOut()
    fun showSuccessToast()
    fun openRegisterActivity()
    fun openTreatmentActivity()
    fun openLoginActivity()
    fun openDailyActivity()
    fun openProfileActivity()
    fun openConfigActivity()
    fun openStatisticsActivity()
    fun setMedition(label: String)
    fun setUser(user: User)
    fun setDate(date: Date)
    fun setPromedios(min: Int, max: Int, promedio:Int)
    fun setMinColor(color: Int)
    fun setMaxColor(color: Int)
    fun setPromColor(color: Int)
    fun explain(msg: Int)
    fun getLabel(name: String): String
    fun mirrorAccount()
}