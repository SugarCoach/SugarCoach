package com.sugarcoach.ui.forgot.presenter

import com.sugarcoach.BuildConfig
import com.sugarcoach.data.network.LoginResponse
import com.sugarcoach.ui.base.presenter.BasePresenter
import com.sugarcoach.ui.forgot.interactor.ForgotInteractorImp
import com.sugarcoach.ui.forgot.view.ForgotView
import com.sugarcoach.util.AppConstants
import com.sugarcoach.util.SchedulerProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class ForgotPresenter<V : ForgotView, I : ForgotInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider,compositeDisposable = disposable),
    ForgotPresenterImp<V, I> {
    override fun onForgot(email: String) {
        when {
            email.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
            !isEmailValid(email) -> getView()?.showValidationMessage(AppConstants.INVALID_EMAIL_ERROR)
            else -> {
                interactor?.let {
                    compositeDisposable.add(it.doServerForgotApiCall(email)
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnSubscribe { getView()?.showProgress() }
                        .doOnNext { getView()?.hideProgress() }
                        .subscribe({ loginResponse ->
                            getView()?.onForgot()
                        }, { throwable ->
                            getView()?.hideProgress()
                            showException(throwable)
                        })
                    )
                }
            }
        }
    }


}