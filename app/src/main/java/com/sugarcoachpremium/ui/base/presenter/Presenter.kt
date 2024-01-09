package com.sugarcoachpremium.ui.base.presenter

import com.sugarcoachpremium.data.ui.base.interactor.Interactor
import com.sugarcoachpremium.ui.base.view.BaseView


interface Presenter<V : BaseView, I : Interactor> {

    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?

    fun showException(throwable: Throwable?)

}