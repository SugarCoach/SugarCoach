package com.sugarcoach.ui.sign.interactor

import com.facebook.AccessToken
import com.sugarcoach.data.network.LoginResponse
import com.sugarcoach.data.ui.base.interactor.Interactor
import io.reactivex.Observable


interface SignInteractorImp : Interactor {
    fun doFBLoginApiCall(accessToken: AccessToken): Observable<LoginResponse>

    fun doGoogleLoginApiCall(token: String?): Observable<LoginResponse>

    fun updateUser(loginResponse: LoginResponse)


}