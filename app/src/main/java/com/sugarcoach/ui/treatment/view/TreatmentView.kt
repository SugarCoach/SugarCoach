package com.sugarcoach.ui.treatment.view

import android.net.Uri
import com.sugarcoach.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.ui.base.view.BaseView
import java.util.*


interface TreatmentView : BaseView {

    fun showSuccessToast()
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
    fun showDataSave()
    fun sharedScreenShot(uri: Uri)


}