package com.sugarcoachpremium.ui.forgot.presenter

import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.sugarcoachpremium.ui.base.presenter.BasePresenter
import com.sugarcoachpremium.ui.forgot.interactor.ForgotInteractorImp
import com.sugarcoachpremium.ui.forgot.view.ForgotView
import com.sugarcoachpremium.util.AppConstants
import com.sugarcoachpremium.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class ForgotPresenter<V : ForgotView, I : ForgotInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider,compositeDisposable = disposable),
    ForgotPresenterImp<V, I> {


    override fun onForgot(email: String) {
        getView()?.showProgress()
        when {
            email.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
            !isEmailValid(email) -> getView()?.showValidationMessage(AppConstants.INVALID_EMAIL_ERROR)
            else -> {
                Firebase.auth.sendPasswordResetEmail(email)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            getView()?.onForgot()
                        }
                        getView()?.hideProgress()
                        getView()?.showErrorToast("Su email no esta registrado")
                    }
            }
        }
    }


}