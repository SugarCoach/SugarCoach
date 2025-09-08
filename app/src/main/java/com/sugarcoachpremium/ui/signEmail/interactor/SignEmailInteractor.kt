package com.sugarcoachpremium.ui.signEmail.interactor

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import com.google.firebase.auth.FirebaseUser
import com.google.gson.GsonBuilder
import com.google.gson.internal.`$Gson$Types`
import com.sugarcoachpremium.data.api_db.ApiRepository
import com.sugarcoachpremium.data.database.repository.dailyregister.*
import com.sugarcoachpremium.data.database.repository.treament.*
import com.sugarcoachpremium.data.database.repository.user.ParcialUser
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.data.database.repository.user.UserRepo
import com.sugarcoachpremium.data.network.*
import com.sugarcoachpremium.data.ui.base.interactor.BaseInteractor
import com.sugarcoachpremium.di.preferences.PreferenceHelper
import com.sugarcoachpremium.util.AppConstants
import com.sugarcoachpremium.util.FileUtils
import com.sugarcoachpremium.util.extensions.toTreatmentInput
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import java.lang.Exception
import javax.inject.Inject


class SignEmailInteractor @Inject constructor(private val mContext: Context, private val treamentRepoHelper: TreamentRepo,
                                              private  val dailyRepoHelper: DailyRegisterRepo,
                                              userRepoHelper: UserRepo, preferenceHelper: PreferenceHelper,
                                              apiHelper: ApiHelper
) : BaseInteractor(userRepoHelper,preferenceHelper, apiHelper),
    SignEmailInteractorImp {

    @Inject
    lateinit var apiRepository: ApiRepository
    lateinit var user: User

    @SuppressLint("CheckResult")
    override fun updateUser(signResponse: FirebaseUser?): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()

        val parcialUser = ParcialUser(signResponse!!.email!!, signResponse.email!!.substring(0, signResponse.email!!.indexOf('@')), false,
            signResponse.providerId, true)

        val json = gson.toJson(parcialUser, ParcialUser::class.java)
        Log.i("OnJson", json.toString())
        user = gson.fromJson(json.toString(), User::class.java)

        user.typeAccount = "premium"
        user.points = 0

        preferenceHelper.let {
            it.setAccessToken(signResponse.uid)
            it.setUserLoged(true)
        }

        return userHelper.insertRegister(user)
    }


    override suspend fun updateCloudUser(signResponse: FirebaseUser?): Result<Boolean> {
        return if (signResponse != null) {
            apiRepository.createUser(user.username, user.email, signResponse.uid).fold({
                Log.i("OnCreateUser", it.toString()+ ": " + it?.id!!.toString())
                setUserId(it.id)
                return Result.success(true)
            }, {
                return Result.failure(it)
            })
        }else{
            Result.failure(Exception("El signResponse es nulo"))
        }
    }
    override fun saveRegisters(registersResponse: List<DailyRegister>): Observable<Boolean> {
        if (dailyRepoHelper.loadDailyRegistersTotal() > 0 || dailyRepoHelper.isRegisterRepoEmpty()) {
            dailyRepoHelper.deleteAll()
            dailyRepoHelper.insertRegisters(registersResponse)
            return Observable.just(true)
        }else{
            return Observable.just(true)

        }
    }


    override fun updateUserSocial(loginResponse: LoginResponse) {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        var json = gson.toJson(loginResponse.user)
        var user: User = gson.fromJson(json.toString(), User::class.java)
        userHelper.insertRegister(user)
        preferenceHelper.let {
            it.setCurrentUserId(loginResponse.user?.id)
            it.setAccessToken(loginResponse.accessToken)
            it.setUserLoged(true)
        }
    }
    override fun treament(treament: Treament): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()

        return treamentRepoHelper.isTreamentRepoEmpty().subscribeOn(Schedulers.io())
            .concatMap { isEmpty ->
                if (isEmpty) {
                    Log.i("OnApiTreatment", "Se inserta: $treament")
                    treamentRepoHelper.insertTreament(treament)
                } else{
                    Log.i("OnApiTreatment", "El result fue empty")
                    Observable.just(false)
                    throw Exception("Ocurrió un error creando el tratamiento")
                }
            }

    }

    override suspend fun insertTreatment(treament: Treament): Result<Boolean> {
        Log.i("OnApiTreatment", "El treament a subir es: $treament. currentId: ${getCurrentId()!!}")
        return apiRepository.createTreatment(treament.toTreatmentInput(getCurrentId()!!))
    }

    override suspend fun createUserData(): Result<Boolean> {
        return apiRepository.createUserData(getCurrentId()!!)
    }

    override fun category(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return dailyRepoHelper.isCategoriesRepoEmpty().subscribeOn(Schedulers.io())
            .concatMap { isEmpty ->
                Log.i("OnCategory", "Es empty: $isEmpty")
                if (isEmpty) {
                    val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, Category::class.java)
                    val categoryList = gson.fromJson<List<Category>>(
                        FileUtils.loadJSONFromAsset(
                            mContext,
                            AppConstants.DATABASE_CATEGORY),
                        type)
                    dailyRepoHelper.insertCategories(categoryList)
                } else{
                    Observable.just(false)
                }
            }
    }


    override fun exercises(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return dailyRepoHelper.isExercisesRepoEmpty().subscribeOn(Schedulers.io())
            .concatMap { isEmpty ->
                Log.i("OnExcercises", "Es empty: $isEmpty")
                if (isEmpty) {
                    val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, Exercises::class.java)
                    val itemList = gson.fromJson<List<Exercises>>(
                        FileUtils.loadJSONFromAsset(
                            mContext,
                            AppConstants.DATABASE_EXERCISES),
                        type)
                    dailyRepoHelper.insertExercise(itemList)
                } else
                    Observable.just(false)
            }
    }


    override fun states(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return dailyRepoHelper.isStatesRepoEmpty().subscribeOn(Schedulers.io())
            .concatMap { isEmpty ->
                if (isEmpty) {
                    val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, States::class.java)
                    val itemList = gson.fromJson<List<States>>(
                        FileUtils.loadJSONFromAsset(
                            mContext,
                            AppConstants.DATABASE_STATES),
                        type)
                    dailyRepoHelper.insertStates(itemList)
                } else
                    Observable.just(false)
            }
    }

    override fun treamentHorarios(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return treamentRepoHelper.isTreamentCategoryRepoEmpty().subscribeOn(Schedulers.io())
            .concatMap { isEmpty ->
                if (isEmpty) {
                    val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, TreamentHorarios::class.java)
                    val categoryList = gson.fromJson<List<TreamentHorarios>>(
                        FileUtils.loadJSONFromAsset(
                            mContext,
                            AppConstants.DATABASE_TREATMENT_HORARIOS),
                        type)
                    categoryList.forEach{ it.treatment_id = 1 }
                    treamentRepoHelper.insertTreamentCategory(categoryList)
                } else
                    Observable.just(false)
            }
    }

    override fun treamentBasalHora(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return treamentRepoHelper.isTreamentBasalHoraRepoEmpty().subscribeOn(Schedulers.io())
            .concatMap { isEmpty ->
                if (isEmpty) {
                    val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, TreamentBasalHora::class.java)
                    val categoryList = gson.fromJson<List<TreamentBasalHora>>(
                        FileUtils.loadJSONFromAsset(
                            mContext,
                            AppConstants.DATABASE_TREATMENT_BASAL_HORA),
                        type)
                    categoryList.forEach{ it.treatment_id = 1 }
                    treamentRepoHelper.insertTreamentBasalHoras(categoryList)
                } else
                    Observable.just(false)
            }
    }

    override fun treatmentHorariosCorrectora(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return treamentRepoHelper.isTreamentCategoryCorrectoraRepoEmpty().subscribeOn(Schedulers.io())
            .concatMap { isEmpty ->
                if (isEmpty) {
                    val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, TreamentCorrectoraHorarios::class.java)
                    val categoryList = gson.fromJson<List<TreamentCorrectoraHorarios>>(
                        FileUtils.loadJSONFromAsset(
                            mContext,
                            AppConstants.DATABASE_TREATMENT_HORARIOS),
                        type)
                    categoryList.forEach{ it.treatment_id = 1 }
                    treamentRepoHelper.insertTreamentCategoryCorrectora(categoryList)
                } else
                    Observable.just(false)
            }
    }

    override fun getBasal(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return treamentRepoHelper.isBasalRepoEmpty().subscribeOn(Schedulers.io()).concatMap { isEmpty ->
            if (isEmpty) {
                val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, BasalInsuline::class.java)
                val basalList = gson.fromJson<List<BasalInsuline>>(
                    FileUtils.loadJSONFromAsset(
                        mContext,
                        AppConstants.DATABASE_BASAL),
                    type)
                treamentRepoHelper.insertBasal(basalList)
            } else
                Observable.just(false)
        }
    }

    override fun getMedidor(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return treamentRepoHelper.isMedidorRepoEmpty().subscribeOn(Schedulers.io()).concatMap { isEmpty ->
            if (isEmpty) {
                val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, Medidor::class.java)
                val list = gson.fromJson<List<Medidor>>(
                    FileUtils.loadJSONFromAsset(
                        mContext,
                        AppConstants.DATABASE_MEDIDOR),
                    type)
                treamentRepoHelper.insertMedidor(list)
            } else
                Observable.just(false)
        }
    }

    override fun getBombas(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return treamentRepoHelper.isBombasRepoEmpty().subscribeOn(Schedulers.io()).concatMap { isEmpty ->
            if (isEmpty) {
                val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, BombaInfusora::class.java)
                val list = gson.fromJson<List<BombaInfusora>>(
                    FileUtils.loadJSONFromAsset(
                        mContext,
                        AppConstants.DATABASE_BOMBAS),
                    type)
                treamentRepoHelper.insertBombas(list)
            } else
                Observable.just(false)
        }
    }

    override fun getCorrectora(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return treamentRepoHelper.isBasalRepoEmpty().subscribeOn(Schedulers.io()).concatMap { isEmpty ->
            if (isEmpty) {
                val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, CorrectoraInsuline::class.java)
                val basalList = gson.fromJson<List<CorrectoraInsuline>>(
                    FileUtils.loadJSONFromAsset(
                        mContext,
                        AppConstants.DATABASE_Correctora),
                    type)
                treamentRepoHelper.insertCorrectora(basalList)
            } else
                Observable.just(false)
        }
    }
}