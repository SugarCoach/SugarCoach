package com.sugarcoach.ui.forgot.interactor

import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.network.LoginResponse
import com.sugarcoach.data.network.RegistersResponse
import com.sugarcoach.data.ui.base.interactor.Interactor
import io.reactivex.Observable


interface ForgotInteractorImp : Interactor {
    fun doServerForgotApiCall(email: String): Observable<LoginResponse>

}