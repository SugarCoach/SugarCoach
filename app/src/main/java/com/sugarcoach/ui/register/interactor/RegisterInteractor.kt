package com.sugarcoach.ui.register.interactor

import com.sugarcoach.data.api_db.ApiRepository
import com.sugarcoach.data.database.repository.dailyregister.*
import com.sugarcoach.data.database.repository.treament.*
import com.sugarcoach.data.database.repository.user.UserRepo
import com.sugarcoach.data.network.*
import com.sugarcoach.data.ui.base.interactor.BaseInteractor
import com.sugarcoach.di.preferences.PreferenceHelper
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import java.io.File
import javax.inject.Inject


class RegisterInteractor @Inject constructor(private val treamentRepo: TreamentRepo,
                                             private  val dailyRepoHelper: DailyRegisterRepo,
                                             userRepoHelper: UserRepo, preferenceHelper: PreferenceHelper,
                                             apiHelper: ApiHelper)
    : BaseInteractor(userRepoHelper,preferenceHelper,apiHelper),
    RegisterInteractorImp {
    @Inject
    lateinit var apiRepository: ApiRepository
    override suspend fun saveRegisterCall(dailyRegister: DailyRegister): Observable<RegisterSaveResponse> {
        /*return apiHelper.performSaveRegisters(token = "Bearer "+preferenceHelper.getAccessToken().toString(),
            request = RegisterSaveRequest.RegisterSaveRequest( dailyRegister.glucose, dailyRegister.insulin, dailyRegister.carbohydrates,dailyRegister.emotionalState,  dailyRegister.exercise,dailyRegister.category_id, dailyRegister.basal, dailyRegister.colors, preferenceHelper.getCurrentUserId().toString())
        ).subscribeOn(
            Schedulers.io())
            .map { it }*/
        apiRepository
    }

    override fun saveRegisterPhotoCall(id: String, photo: File): Observable<RegisterSavePhotoResponse> {
        return apiHelper.performSaveRegistersPhoto(token = "Bearer "+ preferenceHelper.getAccessToken().toString(),
            request = RegisterSavePhotoRequest.RegisterSavePhotoRequest(refId = id, ref = "dailyregister", field = "photo", files = photo)
        ).subscribeOn(
            Schedulers.io())
            .map { it }
    }

    override fun isDailyEmpty(): Observable<Boolean> {
        return Observable.just(dailyRepoHelper.isRegisterRepoEmpty())
    }

    override fun insertDaily(dailyRegister: DailyRegister): Observable<Boolean> {
        dailyRepoHelper.insertRegister(dailyRegister)
        return Observable.just(true)
    }

    override
    fun getUser() = userHelper.loadUser()

    override fun getLastDaily() = dailyRepoHelper.lastDailyRegister()

    override fun getCategories(): Single<List<Category>> {
        return dailyRepoHelper.loadCategories()
    }

    override fun getExercises(): Single<List<Exercises>> {
        return dailyRepoHelper.loadExercises()
    }

    override fun getEmotions(): Single<List<States>> {
        return dailyRepoHelper.loadStates()
    }

    override fun getTreatment(): Single<TreatmentBasalCorrectora> = treamentRepo.load()
    override fun getTreatmentHorarios(id: Int):Single<TreamentHorarios> = treamentRepo.loadTreatmentByCategory(id)


}