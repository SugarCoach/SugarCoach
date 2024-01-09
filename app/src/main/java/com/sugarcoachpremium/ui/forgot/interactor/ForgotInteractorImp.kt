package com.sugarcoachpremium.ui.forgot.interactor

import com.sugarcoachpremium.data.network.LoginResponse
import com.sugarcoachpremium.data.ui.base.interactor.Interactor
import io.reactivex.Observable


interface ForgotInteractorImp : Interactor {
    fun doServerForgotApiCall(email: String): Observable<LoginResponse>

}