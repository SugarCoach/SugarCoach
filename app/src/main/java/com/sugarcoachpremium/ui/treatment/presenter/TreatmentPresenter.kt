package com.sugarcoachpremium.ui.treatment.presenter

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.net.Uri
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.TableRow
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.sugarcoachpremium.R
import com.sugarcoachpremium.data.api_db.DailyRegister.DailyRegisterResponse
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister
import com.sugarcoachpremium.data.database.repository.treament.*
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.type.Treatment
import com.sugarcoachpremium.ui.base.presenter.BasePresenter
import com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractorImp
import com.sugarcoachpremium.ui.treatment.view.BasalHoraItem
import com.sugarcoachpremium.ui.treatment.view.HorarioItem
import com.sugarcoachpremium.ui.treatment.view.BasalItem
import com.sugarcoachpremium.ui.treatment.view.TreatmentView
import com.sugarcoachpremium.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.joda.time.LocalDateTime
import java.io.ByteArrayOutputStream
import java.lang.Exception
import java.util.EnumSet.range
import javax.inject.Inject
import kotlin.reflect.full.memberProperties

class TreatmentPresenter<V : TreatmentView, I : TreatmentInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable),
    TreatmentPresenterImp<V,I> {


    lateinit var treatment: Treament
    lateinit var correctora: TreamentCorrectoraHorarios
    lateinit var basal: TreamentHorarios

    lateinit var basalInsuline: String
    lateinit var correctoraInsuline: String

    lateinit var user: User

    override fun saveAll(obj: Float, hipo: Float, hyper: Float) {
        treatment.object_glucose = obj
        treatment.hipoglucose = hipo
        treatment.hyperglucose = hyper
    }
    override fun updateAll() {
        Log.i("OnUpdateAll", "Se actualizan las bases de datos")
        getView()?.showProgress()
        interactor?.let {
            CoroutineScope(Dispatchers.IO).launch{
                compositeDisposable.add(it.editTreatment(treatment, basalInsuline, correctoraInsuline)
                    .compose(schedulerProvider.ioToMainObservableScheduler())
                    .subscribe({
                        Log.i("OnUpdateAll", "La respuesta de editTreatment fue: $it")
                        updatePoints(cantParametersChanged())
                    }, { throwable ->
                        showException(throwable)
                    })
                )
            }
        }
    }

    private fun updatePoints(points: Int){
        interactor?.let { inte ->
            compositeDisposable.add(inte.updateLocalPoints(user, points)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ userInsert ->
                    Log.i("OnRegisterPresenter", "UserInsert: $userInsert")
                    if(userInsert){
                        getView()?.hideProgress()
                        getView()?.showErrorToast()
                        goToActivityMain()
                    }else {
                        CoroutineScope(Dispatchers.IO).launch {
                            val updatedPoints = inte.updateUserPoints()
                            if (updatedPoints) {
                                withContext(Dispatchers.Main){
                                    getView()?.hideProgress()
                                    getView()?.showDataSave(user.points, points)
                                }
                            }else{
                                withContext(Dispatchers.Main){
                                    getView()?.hideProgress()
                                    getView()?.showErrorToast()
                                    goToActivityMain()
                                }
                            }
                        }
                    }
                },{
                    getView()?.hideProgress()
                    getView()?.showErrorToast()
                    goToActivityMain()
                }))
        }
    }

    private fun cantParametersChanged(): Int{
        val noNull = mutableListOf<String>()

        val properties = Treament::class.memberProperties

        for (property in properties) {
            val valor = property.get(treatment)

            if ((valor != "" && valor != null) && (property.name != "date") ) {
                Log.i("OnTreatmentPresenter", "cantParameterChanged: El valor es: $valor, ${property.name}")
                noNull.add(property.name)
            }
        }
        var points = 0
        var contr = true
        for(v in 1 until noNull.size){
            if(contr){
                points += 100
                contr = false
            }
            points += 50
        }
        return points
    }
    override fun saveCorrectoraGlu(correctora: Float) {
        treatment.correctora = correctora
    }

    override fun saveBomb(bomb: Boolean) {
        treatment.bomb = bomb
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

    override fun goToActivityRegister() {
        getView()?.openRegisterActivity()
    }


    override fun saveBasal(item: BasalItem) {
        treatment.basal_id = item.id
    }

    override fun saveCorrectora(item: BasalItem) {
        treatment.correctora_id = item.id
    }
    override fun saveCategory(item: HorarioItem) {
        basal = TreamentHorarios(item.id, item.categoryId, item.selected, treatment.id, item.units.toFloat())
        interactor?.let {
            compositeDisposable.add(it.editBasalCategory(basal)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ getView()?.showSuccessToast("Actualizo Correctamente")
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }

    override fun saveCorrectoraCategory(item: HorarioItem) {
        correctora = TreamentCorrectoraHorarios(item.id, item.categoryId,  treatment.id, item.selected)
        interactor?.let {
            compositeDisposable.add(it.editCorrectoraCategory(correctora)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ getView()?.showSuccessToast("Actualizo Correctamente")
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }

    override fun saveUnitCorrectora(unit: Float) {
        treatment.correctora_unit = unit
    }
    override fun saveHoraBasal(item: BasalHoraItem) {
        var hora = TreamentBasalHora(item.id, item.name,  treatment.id, item.units.toFloat())
        interactor?.let {
            compositeDisposable.add(it.editBasalHora(hora)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ getView()?.showSuccessToast("Actualizo Correctamente")
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }

    override fun saveMedidor(item: BasalItem) {
        treatment.medidor_id = item.id
    }

    override fun saveBomba(item: BasalItem) {
        treatment.bomba_id = item.id
    }

    override fun saveCarbono(carbono: Float) {
        treatment.carbono = carbono
    }

    override fun saveUnitInsulina(unit: Float) {
        treatment.insulina_unit = unit
        Log.i("OnSaveUnitInsulina", "Se guardo unit = $unit")
    }


    fun getCorrectora() {
        interactor?.let {
            compositeDisposable.add(it.getCorrectora()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ basals ->
                    Log.i("OnGetCorrectora", "Se inicia bien: $basals")
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
                    Log.i("OnGetBasal", "Se inicia")
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
                    Log.i("OnGetMedidores", "Se inicia:$medidores")
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
                    Log.i("OnGetBombas", "Se inicia:$bombas")
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

    override fun showException(throwable: Throwable?) {

    }
    override fun getScreenShot(context: Activity, view: View) {
        if (checkAndRequestPermissions(context)){
            val bitmap = getScreenShotImage(view)
            val uri = getImageUri(context, bitmap)
            getView()?.sharedScreenShot(uri)
        }
    }

    private fun getScreenShotImage(view: View): Bitmap {
        val returnedBitmap = Bitmap.createBitmap(view.width, view.height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(returnedBitmap)
        val bgDrawable = view.background
        if (bgDrawable != null) bgDrawable.draw(canvas)
        else canvas.drawColor(Color.WHITE)
        view.draw(canvas)
        return returnedBitmap
    }
    private fun getImageUri(context: Context, inImage: Bitmap): Uri {
        val bytes = ByteArrayOutputStream()
        inImage.compress(Bitmap.CompressFormat.JPEG, 100, bytes)
        val path = MediaStore.Images.Media.insertImage(context.getContentResolver(), inImage, getRandomString(10), null)
        return Uri.parse(path)
    }
    private fun getRandomString(length: Int) : String {
        val allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz1234567890"
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
    override fun checkAndRequestPermissions(context: Activity): Boolean {
        val readpermission = ContextCompat.checkSelfPermission(context, Manifest.permission.READ_EXTERNAL_STORAGE)
        val writepermission = ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE)


        val listPermissionsNeeded = java.util.ArrayList<String>()

        if (readpermission != PackageManager.PERMISSION_GRANTED) {
            listPermissionsNeeded.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
        }
        if (writepermission != PackageManager.PERMISSION_GRANTED) {
            listPermissionsNeeded.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
        }
        if (!listPermissionsNeeded.isEmpty()) {
            ActivityCompat.requestPermissions(context, listPermissionsNeeded.toTypedArray(), 1)
            return false
        }
        return true
    }
    override fun onAttach(view: V?) {
        super.onAttach(view)
        try{
            getUser()
            getBasal()
            getCategories()
            getCategoriesCorrectora()
            getBasalHoras()
        }catch (e: Exception){
            Log.i("Onattach", "Ocurrio un error en el attach $e")
            getView()?.showErrorToast()
        }
    }
    private fun getTreatment() {
        interactor?.let {
            compositeDisposable.add(it.getTreatment()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ treament ->
                    Log.i("OnGetTreatment", "Se ingresa a treatment:$treament")
                    getView()?.let {
                        treatment = treament.treament!!
                        basalInsuline = treament.basalInsuline?.name.toString()
                        correctoraInsuline = treament.correctoraInsuline?.cname.toString()
                        getPromedio(treament)
                        getTotalBasal()
                        getView()?.setTreatment(treament)
                    }
                }, { err -> Log.i("OnGetTreatment", "Ocurrio un error: $err") })
            )
        }
    }

    private fun getUser() {
        val date = LocalDateTime()
        interactor?.let {
            compositeDisposable.add(it.getUser()
                .subscribeOn(Schedulers.io())
                .subscribe({ userData ->
                    user = userData
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
        Log.i("OnGetDataBasal", "Se inicia")
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
        Log.i("OnGetDataMedidor", "Se inicia")
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
        Log.i("OnGetDataBomba", "Se inicia")
        getCorrectora()

    }
    private fun getDataCorrectora(basal: List<CorrectoraInsuline>) {
        Log.i("OnGetDataCorrectora", "Se inicia")
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

    override suspend fun makePdf(context: Context) {
        interactor?.getDailys()?.fold({
            if (it != null) {
                /*val columns = checkCantColumns(it)
                withContext(Dispatchers.IO){
                    getView()?.openTableActivity(it)
                }
                Log.i("OnTreatmentPresenter", "MakePdf: $columns")
                for(daily in it){
                    Log.i("OnTreatmentPresenter", "MakePDF: $daily")
                }*/
                getView()?.hideProgress()
                getView()?.showSuccessToast("Pdf creado")
            }
            getView()?.hideProgress()
            getView()?.showErrorToast("Realice una carga antes")
        },{
            Log.i("OnTreatmentPresenter", "MakePDF: Ocurrió un error:$it")
            getView()?.hideProgress()
            getView()?.showErrorToast()
        })
    }

    private fun checkCantColumns(dailys: List<DailyRegisterResponse>): MutableMap<String, Int>{
        val cantColumns = mutableMapOf("pbreak" to 0, "plunch" to 0, "psnack" to 0, "pdinner" to 0)

        for(i in 0..dailys.size - 1){
            Log.i("TreatmentPresenter", "CheckCantColumns: ${dailys[i].date}")
            if(i == 0 || dailys[i].date == dailys[i-1].date){
                when(dailys[i].category){
                    "2" -> {
                        cantColumns["pbreak"] = cantColumns["pbreak"]!! + 1
                    }
                    "4" -> {
                        cantColumns["plunch"] = cantColumns["plunch"]!! + 1
                    }
                    "6" -> {
                        cantColumns["psnack"] = cantColumns["psnack"]!! + 1
                    }
                    "8" -> {
                        cantColumns["pdinner"] = cantColumns["pdinner"]!! + 1
                    }
                }
            }

        }
        return cantColumns
    }

    private fun setUpTable(columns: MutableMap<String,Int>, context: Context){
        val tableRow0 = TableRow(context)
        val textView0 = TextView(context)

        textView0.text = "Day"
        textView0.setTextColor(Color.BLACK)
        tableRow0.addView(textView0)

        val textView1 = TextView(context)
        textView1.text = "Breakfast"
        textView1.setTextColor(Color.BLACK)
        tableRow0.addView(textView0)

        val textView2 = TextView(context)
        textView2.text = "Lunch"
        textView2.setTextColor(Color.BLACK)
        tableRow0.addView(textView0)

        val textView3 = TextView(context)
        textView3.text = "Snack"
        textView3.setTextColor(Color.BLACK)
        tableRow0.addView(textView0)

        val textView4 = TextView(context)
        textView4.text = "Dinner"
        textView4.setTextColor(Color.BLACK)
        tableRow0.addView(textView0)
    }
}