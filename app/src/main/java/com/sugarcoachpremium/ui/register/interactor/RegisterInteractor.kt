package com.sugarcoachpremium.ui.register.interactor

import android.util.Log
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.sugarcoachpremium.data.api_db.ApiRepository
import com.sugarcoachpremium.data.database.repository.dailyregister.*
import com.sugarcoachpremium.data.database.repository.treament.*
import com.sugarcoachpremium.data.database.repository.user.UserRepo
import com.sugarcoachpremium.data.network.*
import com.sugarcoachpremium.data.ui.base.interactor.BaseInteractor
import com.sugarcoachpremium.di.preferences.PreferenceHelper
import com.sugarcoachpremium.util.extensions.toDailyInput
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
    override suspend fun saveRegisterCall(dailyRegister: DailyRegister): Observable<RegisterSaveResponse> {
        /*return apiHelper.performSaveRegisters(token = "Bearer "+preferenceHelper.getAccessToken().toString(),
            request = RegisterSaveRequest.RegisterSaveRequest( dailyRegister.glucose, dailyRegister.insulin, dailyRegister.carbohydrates,dailyRegister.emotionalState,  dailyRegister.exercise,dailyRegister.category_id, dailyRegister.basal, dailyRegister.colors, preferenceHelper.getCurrentUserId().toString())
        ).subscribeOn(
            Schedulers.io())
            .map { it }*/
        val userId = Firebase.auth.currentUser?.uid
        Log.i("OnInsertDaily", "El uid del usuario actual: $userId")

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
        //return Observable.just(RegisterSaveResponse(null, null, null))
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