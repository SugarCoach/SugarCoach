package com.sugarcoach.ui.treatment.presenter

import com.sugarcoach.R
import com.sugarcoach.data.database.repository.treament.*
import com.sugarcoach.ui.base.presenter.BasePresenter
import com.sugarcoach.ui.treatment.interactor.TreatmentInteractorImp
import com.sugarcoach.ui.treatment.view.BasalHoraItem
import com.sugarcoach.ui.treatment.view.HorarioItem
import com.sugarcoach.ui.treatment.view.BasalItem
import com.sugarcoach.ui.treatment.view.TreatmentView
import com.sugarcoach.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import org.joda.time.LocalDateTime
import org.joda.time.LocalTime
import javax.inject.Inject

class TreatmentPresenter<V : TreatmentView, I : TreatmentInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable),
    TreatmentPresenterImp<V,I> {


    lateinit var treament:Treament
    lateinit var correctora: TreamentCorrectoraHorarios
    lateinit var basal:TreamentHorarios

    override fun saveAll(obj: Float, hipo: Float, hyper: Float) {
        treament.object_glucose = obj
        treament.hipoglucose = hipo
        treament.hyperglucose = hyper
    }
    override fun updateAll() {
        interactor?.let {
            compositeDisposable.add(it.editTreatment(treament)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ getView()?.showDataSave()
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }
    override fun saveCorrectoraGlu(correctora: Float) {
        treament.correctora = correctora
    }

    override fun saveBomb(bomb: Boolean) {
        treament.bomb = bomb
    }
    override fun goToActivityDaily() {
        getView()?.openDailyActivity()
    }

    override fun goToActivityMain() {
        getView()?.openMainActivity()
    }

    override fun goToActivityStatistic() {
        getView()?.openStatisticActivity()
    }


    override fun saveBasal(item: BasalItem) {
        treament.basal_id = item.id
    }

    override fun saveCorrectora(item: BasalItem) {
        treament.correctora_id = item.id
    }
    override fun saveCategory(item: HorarioItem) {
        basal = TreamentHorarios(item.id, item.categoryId, item.selected, treament.id, item.units.toFloat())
            interactor?.let {
            compositeDisposable.add(it.editBasalCategory(basal)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ getView()?.showSuccessToast()
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }

    override fun saveCorrectoraCategory(item: HorarioItem) {
        correctora = TreamentCorrectoraHorarios(item.id, item.categoryId,  treament.id, item.selected)
            interactor?.let {
            compositeDisposable.add(it.editCorrectoraCategory(correctora)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ getView()?.showSuccessToast()
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }

    override fun saveUnitCorrectora(unit: Float) {
        treament.correctora_unit = unit
    }
    override fun saveHoraBasal(item: BasalHoraItem) {
        var hora = TreamentBasalHora(item.id, item.name,  treament.id, item.units.toFloat())
        interactor?.let {
            compositeDisposable.add(it.editBasalHora(hora)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ getView()?.showSuccessToast()
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }

    override fun saveMedidor(item: BasalItem) {
        treament.medidor_id = item.id
    }

    override fun saveBomba(item: BasalItem) {
        treament.bomba_id = item.id
    }

    override fun saveCarbono(carbono: Float) {
        treament.carbono = carbono
    }

    override fun saveUnitInsulina(unit: Float) {
        treament.insulina_unit = unit
    }


    fun getCorrectora() {
        interactor?.let {
            compositeDisposable.add(it.getCorrectora()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ basals ->
                    getDataCorrectora(basals)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }


     fun getBasal() {
        interactor?.let {
            compositeDisposable.add(it.getBasals()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ basals ->
                    getDataBasal(basals)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }
    fun getMedidores() {
        interactor?.let {
            compositeDisposable.add(it.getMedidores()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ medidores ->
                    getDataMedidor(medidores)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }

    fun getBombas() {
        interactor?.let {
            compositeDisposable.add(it.getBombas()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ bombas ->
                    getDataBomba(bombas)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }

    fun getCategories() {
        interactor?.let {
            compositeDisposable.add(it.getCategories()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ categories ->
                    getDataCategories(categories)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }
     fun getCategoriesCorrectora() {
        interactor?.let {
            compositeDisposable.add(it.getCategoriesCorrectora()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ categories ->
                    getDataCategoriesCorrectora(categories)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }
    fun getBasalHoras() {
        interactor?.let {
            compositeDisposable.add(it.getBasalHoras()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ horas ->
                    getDataBasalHora(horas)
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }

    override fun onAttach(view: V?) {
        super.onAttach(view)
        getUser()
        getBasal()
        getCategories()
        getCategoriesCorrectora()
        getBasalHoras()
    }
    private fun getTreatment() {
        interactor?.let {
            compositeDisposable.add(it.getTreatment()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ treament ->
                    getView()?.let {
                        this.treament = treament.treament!!
                        getPromedio(treament)
                        getTotalBasal()
                        getView()?.setTreatment(treament)
                    }
                }, { err -> println(err) })
            )
        }
    }

    private fun getUser() {
        val date = LocalDateTime()
        interactor?.let {
            compositeDisposable.add(it.getUser()
                .subscribeOn(Schedulers.io())
                .subscribe({ userData ->
                    getView()?.let {
                        getView()?.setData(userData,date.toDate())
                    }
                }, { err -> println(err) })
            )
        }
    }
    private fun getPromedio(treament: TreatmentBasalCorrectora) {
        var tratamiento = treament.treament!!
        val danger = tratamiento.hyperglucose
        val good = tratamiento.hipoglucose..tratamiento.hyperglucose
        val low = 20f..tratamiento.hipoglucose
        interactor?.let {
            compositeDisposable.add(it.getAverages()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ average ->
                    getView()?.let {
                        it.setPromedio(average.promedio)
                        when{
                            average.promedio in low -> it.setPromColor(R.color.yellowLight)
                            average.promedio in good -> it.setPromColor(R.color.green)
                            average.promedio > danger -> it.setPromColor(R.color.red)
                        }
                    }
                }, { err -> println(err) })
            )
        }

    }
    private fun getTotalBasal() {
        interactor?.let {
            compositeDisposable.add(it.getAverageBasal()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ average ->
                    getView()?.let {
                        it.setPromedioBasal(average.total)
                    }
                }, { err -> println(err) })
            )
        }

    }
    private fun getDataBasal(basal: List<BasalInsuline>) {
        val ret = ArrayList<BasalItem>()
        for (i in basal.indices) {
            val data = BasalItem.Builder()
                .id(basal[i].bid)
                .name(basal[i].name)
                .build()

            ret.add(data)
        }
        getView()?.setInsulinasBasales(ret)
        getMedidores()

    }
    private fun getDataMedidor(basal: List<Medidor>) {
        val ret = ArrayList<BasalItem>()
        for (i in basal.indices) {
            val data = BasalItem.Builder()
                .id(basal[i].mid)
                .name(basal[i].name)
                .build()

            ret.add(data)
        }
        getView()?.setMedidor(ret)
        getBombas()

    }
    private fun getDataBomba(basal: List<BombaInfusora>) {
        val ret = ArrayList<BasalItem>()
        for (i in basal.indices) {
            val data = BasalItem.Builder()
                .id(basal[i].boid)
                .name(basal[i].name)
                .build()

            ret.add(data)
        }
        getView()?.setBomba(ret)
        getCorrectora()

    }
    private fun getDataCorrectora(basal: List<CorrectoraInsuline>) {
        getTreatment()
        val ret = ArrayList<BasalItem>()
        for (i in basal.indices) {

            val data = BasalItem.Builder()
                .id(basal[i].cid)
                .name(basal[i].cname)
                .build()

            ret.add(data)
        }
        getView()?.setInsulinasCorrectoras(ret)


    }
    private fun getDataCategories(horarios: List<TreatmentHorariosCategory>) {
        val ret = ArrayList<HorarioItem>()
        for (i in horarios.indices) {
            val name = getView()?.getLabel(horarios[i].category!!.cate_name)
            val data = HorarioItem.Builder()
            .id(horarios[i].treamentHorarios!!.id)
            .name(name!!)
            .selected(horarios[i].treamentHorarios!!.selected)
            .categoryId(horarios[i].treamentHorarios!!.category_id)
            .units(horarios[i].treamentHorarios!!.units.toInt().toString())
            .build()

        ret.add(data)
    }
    getView()?.setCategories(ret)

    }


    private fun getDataCategoriesCorrectora(horarios: List<TreatmentHCorrectoraCategory>) {
        val ret = ArrayList<HorarioItem>()
        for (i in horarios.indices) {
            val name = getView()?.getLabel(horarios[i].category!!.cate_name)
            val data = HorarioItem.Builder()
                .id(horarios[i].treamentCorrectoraHorarios!!.id)
                .name(name!!)
                .categoryId(horarios[i].treamentCorrectoraHorarios!!.category_id)
                .selected(horarios[i].treamentCorrectoraHorarios!!.selected)
                .build()

            ret.add(data)
        }
        getView()?.setCategoriesCorrectora(ret)

    }

    private fun getDataBasalHora(horarios: List<TreamentBasalHora>) {
        val ret = ArrayList<BasalHoraItem>()
        for (i in horarios.indices) {
            val name = horarios[i].time
            val data = BasalHoraItem.Builder()
                .id(horarios[i].id)
                .name(name!!)
                .units(horarios[i].units.toInt().toString())
                .build()

            ret.add(data)
        }
        getView()?.setBasalHoras(ret)

    }
}