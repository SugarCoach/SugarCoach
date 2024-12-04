package com.sugarcoachpremium.ui.config.view

import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.ui.base.view.BaseView


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
    fun showInvalidPromoCodeMessage()

}