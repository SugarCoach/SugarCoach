package com.sugarcoach.ui.base.presenter

import com.sugarcoach.data.ui.base.interactor.Interactor
import com.sugarcoach.ui.base.view.BaseView


interface Presenter<V : BaseView, I : Interactor> {

    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?

    fun showException(throwable: Throwable?)

}