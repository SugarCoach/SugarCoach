package com.sugarcoachpremium.ui.register.interactor

import android.util.Log
import com.sugarcoachpremium.data.api_db.ApiRepository
import com.sugarcoachpremium.data.database.repository.dailyregister.Category
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo
import com.sugarcoachpremium.data.database.repository.dailyregister.Exercises
import com.sugarcoachpremium.data.database.repository.dailyregister.States
import com.sugarcoachpremium.data.database.repository.treament.TreamentHorarios
import com.sugarcoachpremium.data.database.repository.treament.TreamentRepo
import com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.data.database.repository.user.UserRepo
import com.sugarcoachpremium.data.network.ApiHelper
import com.sugarcoachpremium.data.network.RegisterSavePhotoRequest
import com.sugarcoachpremium.data.network.RegisterSavePhotoResponse
import com.sugarcoachpremium.data.network.RegisterSaveResponse
import com.sugarcoachpremium.data.ui.base.interactor.BaseInteractor
import com.sugarcoachpremium.di.preferences.PreferenceHelper
import com.sugarcoachpremium.util.extensions.toDailyInput
import com.sugarcoachpremium.util.extensions.toDataInput
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
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
    lateinit var user: User
    override suspend fun saveRegisterCall(dailyRegister: DailyRegister): Observable<RegisterSaveResponse> {
        var saveResponse: RegisterSaveResponse?

        val apiRes = CoroutineScope(Dispatchers.IO).async {
            apiRepository.createDailyRegister(dailyRegister.toDailyInput(getCurrentId())).fold({
                response ->
                Log.i("OnInsertDaily", "El id del register es: ${response.id}")
                saveResponse = RegisterSaveResponse().apply {
                    id = response.id
                    createdAt = response.createdAt.toString()
                    updatedAt = response.updatedAt.toString()
                }
                return@async saveResponse
            },{
                Log.i("OnInsertDaily", "Ocurrió un error: ${it}")
                return@async RegisterSaveResponse().apply{
                    id = ""
                    createdAt = ""
                    updatedAt = ""
                }
            })
        }
        saveResponse = apiRes.await()
        return Observable.just(saveResponse)
    }

    override fun saveRegisterPhotoCall(id: String, photo: File): Observable<RegisterSavePhotoResponse> {
        return apiHelper.performSaveRegistersPhoto(token = "Bearer "+ preferenceHelper.getAccessToken().toString(),
            request = RegisterSavePhotoRequest.RegisterSavePhotoRequest(refId = id, ref = "dailyregister", field = "photo", files = photo)
        ).subscribeOn(
            Schedulers.io())
            .map { it }
    }

    override fun updateLocalPoints(user: User, points: Int): Observable<Boolean>{
        this.user = user
        user.points += points
        this.user.points = user.points
        return userHelper.insertRegister(user)
    }
    override suspend fun updateUserPoints(): Boolean {
        apiRepository.getUserDataId(getCurrentId()!!).fold({
            return apiRepository.updateUserData(user.toDataInput(getCurrentId()!!), it).isSuccess
        },{
            Log.i("OnRegisterInteractor", "Error in UpdateUserPoints: $it")
            return false
        })
    }

    override fun isDailyEmpty(): Observable<Boolean> {
        return Observable.just(dailyRepoHelper.isRegisterRepoEmpty())
    }

    override fun insertDaily(dailyRegister: DailyRegister): Observable<Boolean> {

        return dailyRepoHelper.insertRegister(dailyRegister)
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