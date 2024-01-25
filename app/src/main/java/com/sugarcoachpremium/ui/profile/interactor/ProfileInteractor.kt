package com.sugarcoachpremium.ui.profile.interactor

import com.sugarcoachpremium.data.api_db.ApiRepository
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo
import com.sugarcoachpremium.data.database.repository.treament.TreamentRepo
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.data.database.repository.user.UserRepo
import com.sugarcoachpremium.data.network.ApiHelper
import com.sugarcoachpremium.data.ui.base.interactor.BaseInteractor
import com.sugarcoachpremium.di.preferences.PreferenceHelper
import com.sugarcoachpremium.util.extensions.toDataInput
import io.reactivex.Observable
import javax.inject.Inject


class ProfileInteractor @Inject constructor(private  val dailyRepoHelper: DailyRegisterRepo,private  val treamentRepo: TreamentRepo,
                                            userRepoHelper: UserRepo, preferenceHelper: PreferenceHelper,
                                            apiHelper: ApiHelper)
    : BaseInteractor(userRepoHelper,preferenceHelper,apiHelper),
    ProfileInteractorImp {

    @Inject
    lateinit var apiRepo: ApiRepository
    override fun deleteTreament(): Observable<Boolean> {
        treamentRepo.deleteAllCategory()
        treamentRepo.deleteAllCategoryCorrectora()
        treamentRepo.deleteAllBasalHoras()
        return treamentRepo.deleteAllTreatment()
    }

    override fun deleteAll() = dailyRepoHelper.deleteAll()


    override fun deleteUser() = userHelper.deleteUser()

    override fun updateUser(user: User): Observable<Boolean> {
        return userHelper.updateUser(user)
    }

    override suspend fun getDataId(): Result<String> {
        return apiRepo.getUserDataId(getCurrentId()!!)
    }
    override suspend fun updateApiUser(user: User, id: String): Result<Boolean> {
        return apiRepo.updateUserData(user.toDataInput(getCurrentId()!!), id)
    }

    override
    fun getUser() = userHelper.loadUser()

}