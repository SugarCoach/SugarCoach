package com.sugarcoachpremium.ui.forgot.presenter

import com.sugarcoachpremium.ui.base.presenter.BasePresenter
import com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractorImp
import com.sugarcoachpremium.ui.forgot.view.ForgotView
import com.sugarcoachpremium.util.AppConstants
import com.sugarcoachpremium.util.SchedulerProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
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