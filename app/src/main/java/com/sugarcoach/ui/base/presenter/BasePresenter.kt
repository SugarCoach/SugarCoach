package com.sugarcoach.ui.base.presenter

import com.sugarcoach.data.ui.base.interactor.Interactor
import com.sugarcoach.ui.base.view.BaseView
import com.sugarcoach.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import retrofit2.HttpException
import java.io.IOException

abstract class BasePresenter<V : BaseView, I : Interactor> internal constructor(protected var interactor: I?, protected var schedulerProvider: SchedulerProvider, protected val compositeDisposable: CompositeDisposable) : Presenter<V, I> {

    private var view: V? = null
    private val isViewAttached: Boolean get() = view != null

    override fun onAttach(view: V?) {
        this.view = view
    }

    override fun getView(): V? = view

    override fun onDetach() {
        compositeDisposable.dispose()
        view = null
        interactor = null
    }

    fun isEmailValid(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
    fun isPhonelValid(phone: String): Boolean {
        return phone.length == 13
    }
    override fun showException(throwable: Throwable?) {
        val error = throwable as HttpException
        try {
            println(error.message())
            getView()?.showErrorToast()
            //TODO need JsonParser for BackendException
        } catch (e: IOException) {
            println(throwable)
        }
    }
}