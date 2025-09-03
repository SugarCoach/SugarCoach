package com.sugarcoachpremium.ui.treatment.view

import android.net.Uri
import com.sugarcoachpremium.data.api_db.DailyRegister.DailyRegisterResponse
import com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.ui.base.view.BaseView
import java.util.*


interface TreatmentView : BaseView {

    fun showSuccessToast(msg: String)
    fun openTableActivity(dailyRegisters: List<DailyRegisterResponse>)
    fun setData(user: User, date: Date)
    fun setPromedio(prom: Float)
    fun setPromedioBasal(total: Float)
    fun setPromColor(color: Int)
    fun setInsulinasBasales(basalInsuline: List<BasalItem>)
    fun setInsulinasCorrectoras(basalInsuline: List<BasalItem>)
    fun setTreatment(treament: TreatmentBasalCorrectora)
    fun setCategories(category: List<HorarioItem>)
    fun setCategoriesCorrectora(category: List<HorarioItem>)
    fun setBasalHoras(horas: List<BasalHoraItem>)
    fun getLabel(name: String): String
    fun openDailyActivity()
    fun openMainActivity()
    fun openStatisticActivity()
    fun setMedidor(basalInsuline: List<BasalItem>)
    fun setBomba(basalInsuline: List<BasalItem>)
    fun showDataSave(totalPoints: Int, points: Int)
    fun sharedScreenShot(uri: Uri)
    fun openRegisterActivity()

}