package com.sugarcoach.ui.treatment.interactor

import com.sugarcoach.data.database.repository.dailyregister.DailyRegisterRepo
import com.sugarcoach.data.database.repository.treament.*
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.data.database.repository.user.UserRepo
import com.sugarcoach.data.network.ApiHelper
import com.sugarcoach.data.ui.base.interactor.BaseInteractor
import com.sugarcoach.di.preferences.PreferenceHelper
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject


class TreatmentInteractor @Inject constructor(private val treamentRepoHelper: TreamentRepo, private val dailyRepoHelper: DailyRegisterRepo,userRepoHelper: UserRepo, preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(userRepoHelper,preferenceHelper,apiHelper),
    TreatmentInteractorImp {
    override fun editTreatment(treament: Treament): Observable<Boolean> {
        return treamentRepoHelper.updateTreatment(treament)
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

    override fun updateUser(user: User): Observable<Boolean> {
        return userHelper.updateUser(user)
    }

    override
    fun getUser() = userHelper.loadUser()

    override fun getAverages() = dailyRepoHelper.loadAverages()
    override fun getAverageBasal() = treamentRepoHelper.getAverage()


    override fun getCategories(): Single<List<TreatmentHorariosCategory>> = treamentRepoHelper.loadAllCategory()
    override fun getCategoriesCorrectora(): Single<List<TreatmentHCorrectoraCategory>> = treamentRepoHelper.loadAllCategoryCorrectora()

    override fun getBasals(): Single<List<BasalInsuline>> = treamentRepoHelper.loadAllBasal()
    override fun getMedidores(): Single<List<Medidor>> = treamentRepoHelper.loadAllMedidor()
    override fun getBombas(): Single<List<BombaInfusora>> = treamentRepoHelper.loadAllBombas()
    override fun getBasalHoras(): Single<List<TreamentBasalHora>>  = treamentRepoHelper.loadAllBasalHora()
    override fun getCorrectora(): Single<List<CorrectoraInsuline>> = treamentRepoHelper.loadAllCorrectora()

    override fun getTreatment(): Single<TreatmentBasalCorrectora> = treamentRepoHelper.load()

}