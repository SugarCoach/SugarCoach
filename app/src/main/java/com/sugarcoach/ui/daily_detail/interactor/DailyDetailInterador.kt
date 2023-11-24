package com.sugarcoach.ui.daily_detail.interactor

import android.util.Log
import com.sugarcoach.data.api_db.ApiRepository
import com.sugarcoach.data.database.repository.dailyregister.*
import com.sugarcoach.data.database.repository.treament.TreamentRepo
import com.sugarcoach.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoach.data.database.repository.user.UserRepo
import com.sugarcoach.data.network.*
import com.sugarcoach.data.ui.base.interactor.BaseInteractor
import com.sugarcoach.di.preferences.PreferenceHelper
import com.sugarcoach.util.extensions.toDailyInput
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import java.io.File
import javax.inject.Inject

class DailyDetailInterador @Inject constructor(private val treamentRepo: TreamentRepo,
                                               private  val dailyRepoHelper: DailyRegisterRepo, userRepoHelper: UserRepo,
                                               preferenceHelper: PreferenceHelper, apiHelper: ApiHelper)
    : BaseInteractor(userRepoHelper,preferenceHelper,apiHelper),
    DailyDetailInteractorImp {

    @Inject
    lateinit var apiRepository: ApiRepository
    lateinit var onlineId: String

    override fun setIdOnline(id: String) {
        onlineId = id
    }

    override suspend fun updateRegisterCall(dailyRegister: DailyRegister): Result<String?> {
        Log.i("OnUpdateRegisterCall", "Se inserta el dailyRegister: $dailyRegister")
        return apiRepository.updateDailyRegister(onlineId, dailyRegister.toDailyInput(preferenceHelper.getCurrentUserId()) )
    }

    override fun getUser() = userHelper.loadUser()

    override suspend fun deleteRegistersCall(id: String): Result<String?> {
        return apiRepository.deleteDailyRegister(id)
    }

    override fun deleteRegister(id: Int): Observable<Boolean> {
        return dailyRepoHelper.deleteRegister(id)
    }

    override fun updateRegister(dailyRegister: DailyRegister): Observable<Boolean> {
        return  dailyRepoHelper.updateRegister(dailyRegister)
    }

    override fun getRegister(id: Int): Single<DailyRegisterCategory> {
       return dailyRepoHelper.loadDailyRegister(id)
    }

    override fun getCategories(): Single<List<Category>> {
        return dailyRepoHelper.loadCategories()
    }
    override fun getTreatment(): Single<TreatmentBasalCorrectora> = treamentRepo.load()

    override fun saveRegisterPhotoCall(id: String, photo: File): Observable<RegisterSavePhotoResponse> {
        return apiHelper.performSaveRegistersPhoto(token = "Bearer "+ preferenceHelper.getAccessToken().toString(),
            request = RegisterSavePhotoRequest.RegisterSavePhotoRequest(refId = id, ref = "dailyregister", field = "photo", files = photo)
        ).subscribeOn(
            Schedulers.io())
            .map { it }
    }
    override fun getExercises(): Single<List<Exercises>> {
        return dailyRepoHelper.loadExercises()
    }

    override fun getEmotions(): Single<List<States>> {
        return dailyRepoHelper.loadStates()
    }

}