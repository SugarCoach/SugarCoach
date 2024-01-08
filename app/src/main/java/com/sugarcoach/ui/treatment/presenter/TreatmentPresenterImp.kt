package com.sugarcoach.ui.treatment.presenter

import android.app.Activity
import android.view.View
import com.sugarcoach.ui.base.presenter.Presenter
import com.sugarcoach.ui.treatment.interactor.TreatmentInteractorImp
import com.sugarcoach.ui.treatment.view.BasalHoraItem
import com.sugarcoach.ui.treatment.view.BasalItem
import com.sugarcoach.ui.treatment.view.HorarioItem
import com.sugarcoach.ui.treatment.view.TreatmentView


interface TreatmentPresenterImp<V : TreatmentView, I : TreatmentInteractorImp> : Presenter<V, I> {
    fun saveBasal(item: BasalItem)
    fun getScreenShot(context: Activity, view: View)
    fun checkAndRequestPermissions(context: Activity): Boolean
    fun saveCorrectora(item: BasalItem)
    fun saveCategory(item: HorarioItem)
    fun saveHoraBasal(item: BasalHoraItem)
    fun saveCorrectoraCategory(item: HorarioItem)
    fun saveAll(obj: Float, hipo:Float, hyper:Float)
    fun updateAll()
    fun goToActivityDaily()
    fun goToActivityMain()
    fun goToActivityStatistic()
    fun saveUnitCorrectora(unit: Float)
    fun saveCorrectoraGlu(correctora: Float)
    fun saveUnitInsulina(unit: Float)
    fun saveCarbono(carbono: Float)
    fun saveBomb(bomb: Boolean)
    fun saveMedidor(item: BasalItem)
    fun saveBomba(item: BasalItem)
}
