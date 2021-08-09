package com.sugarcoach.ui.daily.presenter

import com.sugarcoach.ui.base.presenter.Presenter
import com.sugarcoach.ui.daily.interactor.DailyInteractorImp
import com.sugarcoach.ui.daily.view.DailyView


interface DailyPresenterImp<V : DailyView, I : DailyInteractorImp> : Presenter<V, I>{
    fun getRegisters()
    fun goToActivityDailyDetail(id: Int)
    fun onResume()
    fun goToActivityTreament()
    fun goToActivityMain()
    fun goToActivityStatistic()
    fun goToActivityRegister()

}