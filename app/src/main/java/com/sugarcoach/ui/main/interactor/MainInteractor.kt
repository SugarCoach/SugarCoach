package com.sugarcoach.ui.main.interactor

import com.sugarcoach.data.database.AppDatabase
import com.sugarcoach.data.database.repository.dailyregister.Category
import com.sugarcoach.data.database.repository.dailyregister.DailyRegisterRepo
import com.sugarcoach.data.database.repository.treament.TreamentRepo
import com.sugarcoach.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoach.data.database.repository.user.UserRepo
import com.sugarcoach.data.network.ApiHelper
import com.sugarcoach.data.ui.base.interactor.BaseInteractor
import com.sugarcoach.di.preferences.PreferenceHelper
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject


class MainInteractor @Inject constructor(private val treamentRepo: TreamentRepo,private  val dailyRepoHelper: DailyRegisterRepo, private val appDatabase: AppDatabase,userRepoHelper: UserRepo, preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(userRepoHelper,preferenceHelper,apiHelper),MainInteractorImp {
    override fun deleteAll() = dailyRepoHelper.deleteAll()


    override fun deleteUser() = userHelper.deleteUser()


    override
    fun getUser() = userHelper.loadUser()

    override fun isDailyEmpty(): Observable<Boolean> {
        return Observable.just(dailyRepoHelper.isRegisterRepoEmpty())
    }

    override fun getCategories(): Single<List<Category>> {
        return dailyRepoHelper.loadCategories()
    }
    override fun getLastDaily() = dailyRepoHelper.lastDailyRegister()
    override fun getAverages() = dailyRepoHelper.loadAverages()
    override fun getTreatment(): Single<TreatmentBasalCorrectora> = treamentRepo.load()
}