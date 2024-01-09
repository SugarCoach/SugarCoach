package com.sugarcoachpremium.ui.forgot.interactor

import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo
import com.sugarcoachpremium.data.database.repository.user.UserRepo
import com.sugarcoachpremium.data.network.*
import com.sugarcoachpremium.data.ui.base.interactor.BaseInteractor
import com.sugarcoachpremium.di.preferences.PreferenceHelper
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class ForgotInteractor @Inject constructor(private  val dailyRepoHelper: DailyRegisterRepo, userRepoHelper: UserRepo, preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(userRepoHelper,preferenceHelper,apiHelper),
    ForgotInteractorImp {

    override fun doServerForgotApiCall(email: String): Observable<LoginResponse> {
       return apiHelper.performServerForgot(ForgotRequest.ServerForgotRequest(email = email)).subscribeOn(
           Schedulers.io())
           .map { it }
    }

}