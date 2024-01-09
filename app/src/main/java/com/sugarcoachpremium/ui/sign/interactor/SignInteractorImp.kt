package com.sugarcoachpremium.ui.sign.interactor

import com.facebook.AccessToken
import com.sugarcoachpremium.data.network.LoginResponse
import com.sugarcoachpremium.data.ui.base.interactor.Interactor
import io.reactivex.Observable


interface SignInteractorImp : Interactor {
    fun doFBLoginApiCall(accessToken: AccessToken): Observable<LoginResponse>

    fun doGoogleLoginApiCall(token: String?): Observable<LoginResponse>

    fun updateUser(loginResponse: LoginResponse)


}