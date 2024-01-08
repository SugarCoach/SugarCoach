package com.sugarcoach.ui.profile.interactor

import com.sugarcoach.data.api_db.ApiRepository
import com.sugarcoach.data.database.repository.dailyregister.DailyRegisterRepo
import com.sugarcoach.data.database.repository.treament.TreamentRepo
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.data.database.repository.user.UserRepo
import com.sugarcoach.data.network.ApiHelper
import com.sugarcoach.data.ui.base.interactor.BaseInteractor
import com.sugarcoach.di.preferences.PreferenceHelper
import com.sugarcoach.util.extensions.toDataInput
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
        return apiRepo.updateUserData(user.toDataInput(id), id)
    }

    override
    fun getUser() = userHelper.loadUser()

}