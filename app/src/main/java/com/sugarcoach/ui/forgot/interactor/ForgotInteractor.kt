package com.sugarcoach.ui.forgot.interactor

import com.sugarcoach.data.database.repository.dailyregister.DailyRegisterRepo
import com.sugarcoach.data.database.repository.user.UserRepo
import com.sugarcoach.data.network.*
import com.sugarcoach.data.ui.base.interactor.BaseInteractor
import com.sugarcoach.di.preferences.PreferenceHelper
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