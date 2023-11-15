package com.sugarcoach.ui.signEmail.interactor

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.google.gson.GsonBuilder
import com.google.gson.internal.`$Gson$Types`
import com.sugarcoach.data.api_db.ApiRepository
import com.sugarcoach.data.database.repository.dailyregister.*
import com.sugarcoach.data.database.repository.treament.*
import com.sugarcoach.data.database.repository.user.ParcialUser
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.data.database.repository.user.UserRepo
import com.sugarcoach.data.network.*
import com.sugarcoach.data.ui.base.interactor.BaseInteractor
import com.sugarcoach.di.preferences.PreferenceHelper
import com.sugarcoach.util.AppConstants
import com.sugarcoach.util.FileUtils
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


class SignEmailInteractor @Inject constructor(private val mContext: Context, private val treamentRepoHelper: TreamentRepo,
                                              private  val dailyRepoHelper: DailyRegisterRepo,
                                              userRepoHelper: UserRepo, preferenceHelper: PreferenceHelper,
                                              apiHelper: ApiHelper
) : BaseInteractor(userRepoHelper,preferenceHelper, apiHelper),
    SignEmailInteractorImp {

    @Inject
    lateinit var apiRepository: ApiRepository
    @SuppressLint("CheckResult")
    override fun updateUser(signResponse: FirebaseUser?) {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()

        val parcialUser = ParcialUser(signResponse!!.email!!, signResponse.displayName!!, false,
            signResponse.providerId, true)

        val json = gson.toJson(parcialUser, ParcialUser::class.java)
        Log.i("OnJson", json.toString())
        val user = gson.fromJson(json.toString(), User::class.java)

        user.typeAccount = "2"
        Log.i("OnUser", signResponse.uid)

        CoroutineScope(Dispatchers.IO).launch {
            apiRepository.createUser(user.username, user.email, signResponse.uid).fold({
                Log.i("OnCreateUser", it.toString())
                setUserId(it?.id!!)
            }, {
                Log.i("OnCreateUser", "Ocurrió un error con la API: $it")
            })

            userHelper.insertRegister(user).
            observeOn(Schedulers.io())
                .subscribe({
                    Log.i("OnSuscribe", "Todo fue bien")
                },{
                    Log.i("OnThrow", "Todo fue mal")
                })
        }

        preferenceHelper.let {
            it.setAccessToken(signResponse.uid)
            it.setUserLoged(true)
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
                    treamentRepoHelper.insertTreament(treament)
                } else
                    Observable.just(false)
            }
    }

    override fun category(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return dailyRepoHelper.isCategoriesRepoEmpty().subscribeOn(Schedulers.io())
            .concatMap { isEmpty ->
                if (isEmpty) {
                    val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, Category::class.java)
                    val categoryList = gson.fromJson<List<Category>>(
                        FileUtils.loadJSONFromAsset(
                            mContext,
                            AppConstants.DATABASE_CATEGORY),
                        type)
                    dailyRepoHelper.insertCategories(categoryList)
                } else
                    Observable.just(false)
            }
    }


    override fun exercises(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return dailyRepoHelper.isExercisesRepoEmpty().subscribeOn(Schedulers.io())
            .concatMap { isEmpty ->
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