package com.sugarcoach.ui.splash.interactor

import android.content.Context
import com.google.gson.GsonBuilder
import com.google.gson.internal.`$Gson$Types`
import com.sugarcoach.data.database.repository.dailyregister.Category
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.dailyregister.DailyRegisterRepo
import com.sugarcoach.data.database.repository.treament.*
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.data.database.repository.user.UserRepo
import com.sugarcoach.data.network.ApiHelper
import com.sugarcoach.data.network.RegistersResponse
import com.sugarcoach.data.ui.base.interactor.BaseInteractor
import com.sugarcoach.di.preferences.PreferenceHelper
import com.sugarcoach.util.AppConstants
import com.sugarcoach.util.FileUtils
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class SplashInteractor @Inject constructor(private val mContext: Context, private  val dailyRepoHelper: DailyRegisterRepo, private val treamentRepoHelper: TreamentRepo, userRepoHelper: UserRepo, preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(userRepoHelper,preferenceHelper,apiHelper), SplashInteractorImp {
    override fun getRegistersCall(): Observable<List<RegistersResponse>> {
        return apiHelper.performGetRegisters(token = "Bearer "+preferenceHelper.getAccessToken().toString()).subscribeOn(
            Schedulers.io())
            .map { it }
    }
    override
    fun getUser() = userHelper.isUserRepoEmpty()

    override fun saveRegisters(registersResponse: List<DailyRegister>): Observable<Boolean> {
        if (dailyRepoHelper.loadDailyRegistersTotal() > 0 || dailyRepoHelper.isRegisterRepoEmpty()) {
            dailyRepoHelper.deleteAll()
            dailyRepoHelper.insertRegisters(registersResponse)
            return Observable.just(true)
        }else{
            return Observable.just(true)

        }
    }

}