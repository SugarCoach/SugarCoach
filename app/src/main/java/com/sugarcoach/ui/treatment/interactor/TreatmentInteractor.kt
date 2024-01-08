package com.sugarcoach.ui.treatment.interactor

import android.annotation.SuppressLint
import android.util.Log
import com.sugarcoach.data.api_db.ApiRepository
import com.sugarcoach.data.database.repository.dailyregister.DailyRegisterRepo
import com.sugarcoach.data.database.repository.treament.*
import com.sugarcoach.data.database.repository.user.UserRepo
import com.sugarcoach.data.network.ApiHelper
import com.sugarcoach.data.ui.base.interactor.BaseInteractor
import com.sugarcoach.di.preferences.PreferenceHelper
import com.sugarcoach.util.extensions.toTreatmentInput
import io.reactivex.Observable
import io.reactivex.Single
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import javax.inject.Inject


class TreatmentInteractor @Inject constructor(private val treamentRepoHelper: TreamentRepo,
                                              private val dailyRepoHelper: DailyRegisterRepo,userRepoHelper: UserRepo,
                                              preferenceHelper: PreferenceHelper, apiHelper: ApiHelper)
    : BaseInteractor(userRepoHelper,preferenceHelper,apiHelper),
    TreatmentInteractorImp {
    @Inject
    lateinit var apiRepository: ApiRepository

    lateinit var treatment: Treament
    lateinit var basalInsuline: String
    lateinit var correctoraInsuline: String
    @SuppressLint("CheckResult")
    override suspend fun editTreatment(treament: Treament, basalInsuline: String, correctoraInsuline: String): Observable<Boolean> {
        Log.i("OnEditTreatment", "El treatment que se va a subir es: $treament")
        this.basalInsuline = basalInsuline
        this.correctoraInsuline = correctoraInsuline

        val response = editCloudTreatment(treament)
        Log.i("OnEditTreatment", "La response fue: $response")
        return if(response){
            val roomResp = treamentRepoHelper.updateTreatment(treament)
            roomResp.subscribe {
                Log.i("OnEditTreatment", "La respuesta de room fue: $it")
            }
            roomResp
        }else{
            Observable.just(false)
        }

    }

    override suspend fun editCloudTreatment(treatment: Treament): Boolean {
        val response = CoroutineScope(Dispatchers.IO).async {
            var response = false

            apiRepository.getUserTreatment(getCurrentId()!!).fold({
                Log.i("OnEditCloud", "El treatment de este usuario es: $it")

                apiRepository.updateTreatment(it!!.id, treatment.toTreatmentInput(getCurrentId()!!, basalInsuline, correctoraInsuline)).fold({
                    Log.i("OnEditCloud", "Se actualizo correctamente")
                    response = true
                },{
                    Log.i("OnEditCloud", "Ocurrió un error actualizando el Treatment: ${it}")
                })

            },{
                Log.i("OnEditCloud", "Ocurrió un error obteniendo el userTreatment ${it}")
            })
            return@async response
        }
        return response.await()
    }

    override fun editBasalHora(hora: TreamentBasalHora): Observable<Boolean> {
        return treamentRepoHelper.updateTreatmentBasalHora(hora)
    }

    override fun editBasalCategory(horarios: TreamentHorarios): Observable<Boolean> {
        return treamentRepoHelper.updateBasalCategory(horarios)
    }

    override fun editCorrectoraCategory(horarios: TreamentCorrectoraHorarios): Observable<Boolean> {
        return treamentRepoHelper.updateCorrectoraCategory(horarios)
    }

    override fun isDailyEmpty(): Observable<Boolean> {
        return Observable.just(dailyRepoHelper.isRegisterRepoEmpty())
    }

    override
    fun getUser() = userHelper.loadUser()

    override fun getAverages() = dailyRepoHelper.loadAverages()
    override fun getAverageBasal() = treamentRepoHelper.getAverage()


    override fun getCategories(): Single<List<TreatmentHorariosCategory>> =
        treamentRepoHelper.loadAllCategory()

    override fun getCategoriesCorrectora(): Single<List<TreatmentHCorrectoraCategory>> =
        treamentRepoHelper.loadAllCategoryCorrectora()

    override fun getBasals(): Single<List<BasalInsuline>> = treamentRepoHelper.loadAllBasal()
    override fun getMedidores(): Single<List<Medidor>> = treamentRepoHelper.loadAllMedidor()
    override fun getBombas(): Single<List<BombaInfusora>> = treamentRepoHelper.loadAllBombas()
    override fun getBasalHoras(): Single<List<TreamentBasalHora>> =
        treamentRepoHelper.loadAllBasalHora()

    override fun getCorrectora(): Single<List<CorrectoraInsuline>> =
        treamentRepoHelper.loadAllCorrectora()

    override fun getTreatment(): Single<TreatmentBasalCorrectora> = treamentRepoHelper.load()
}