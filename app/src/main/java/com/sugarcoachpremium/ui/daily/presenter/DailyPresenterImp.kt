package com.sugarcoachpremium.ui.daily.presenter

import com.sugarcoachpremium.ui.base.presenter.Presenter
import com.sugarcoachpremium.ui.daily.interactor.DailyInteractorImp
import com.sugarcoachpremium.ui.daily.view.DailyView


interface DailyPresenterImp<V : DailyView, I : DailyInteractorImp> : Presenter<V, I>{
    fun getRegisters()
    fun goToActivityDailyDetail(id: Int)
    fun onResume()
    fun goToActivityTreament()
    fun goToActivityMain()
    fun goToActivityStatistic()
    fun goToActivityRegister()

}