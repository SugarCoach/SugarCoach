package com.sugarcoach.ui.config.view

import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.ui.base.view.BaseView
import java.util.*


interface ConfigView : BaseView {

    fun showSuccessToast()
    fun showSuccessQR()
    fun getUserData(user: User)
    fun setType(value: Boolean)
    fun openDailyActivity()
    fun openMainActivity()
    fun openStatisticActivity()
    fun openTreatmentActivity()
    fun explain(msg: Int)
    fun premiumAccount()
    fun showValidationMessage(errorCode: Int)
    fun setControl(value: Boolean)
    fun setControlMedico(value: Boolean)
    fun createDialogCongratulation()

}