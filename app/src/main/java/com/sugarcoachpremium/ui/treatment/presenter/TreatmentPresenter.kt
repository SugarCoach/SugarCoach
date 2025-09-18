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
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.sugarcoachpremium.R
import com.sugarcoachpremium.data.database.repository.treament.*
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.ui.base.presenter.BasePresenter
import com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractorImp
import com.sugarcoachpremium.ui.treatment.view.BasalHoraItem
import com.sugarcoachpremium.ui.treatment.view.BasalItem
import com.sugarcoachpremium.ui.treatment.view.HorarioItem
import com.sugarcoachpremium.ui.treatment.view.TreatmentView
import com.sugarcoachpremium.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.joda.time.LocalDateTime
import java.io.ByteArrayOutputStream
import javax.inject.Inject

class TreatmentPresenter<V : TreatmentView, I : TreatmentInteractorImp> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), TreatmentPresenterImp<V, I> {
    lateinit var treatment: Treament
    lateinit var basal: TreamentHorarios
    lateinit var correctora: TreamentCorrectoraHorarios
    lateinit var user: User
    var basalInsuline: String = ""
    var correctoraInsuline: String = ""
    private var medidorName: String = "" 
    private var bombaInfusoraName: String = "" 


    override fun onAttach(view: V?) {
        super.onAttach(view)
        try{
            getUser() 
            getBombas() // Para las listas de selección
            getMedidores() // Para las listas de selección
            getCorrectora() // Para las listas de selección
            getBasal() // Para las listas de selección
            getCategories() // Para las listas de selección
            getCategoriesCorrectora() // Para las listas de selección
            getBasalHoras() // Para las listas de selección
        }catch (e: Exception){
            Log.i("Onattach", "Ocurrio un error en el attach $e")
            getView()?.showErrorToast()
        }
    }
    // El método iniciativa() ya no es necesario si getTreatment() se llama correctamente desde getUser()
    // y los datos iniciales se cargan en onAttach o a través de getUser -> getTreatment.
    // Si se necesita una carga inicial específica de tratamiento que no dependa de getUser,
    // se puede reactivar y ajustar para que use TreatmentBasalCorrectora.
    /*
    fun iniciativa() { 
        interactor?.let {
            compositeDisposable.add(it.getTreatment() // Devuelve TreatmentBasalCorrectora
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ treamentResponse -> // treamentResponse es TreatmentBasalCorrectora
                    if (treamentResponse.treament != null) {
                        treatment = treamentResponse.treament!!
                        getView()?.setTreatment(treamentResponse) // La vista espera TreatmentBasalCorrectora
                    } else {
                        // Manejar el caso donde treamentResponse.treament es null si es posible
                        Log.e("iniciativa", "El objeto Treament dentro de TreatmentBasalCorrectora es null")
                        // Podrías inicializar un Treament vacío o mostrar un error
                    }
                }, { throwable ->
                    showException(throwable)
                })
            )
        }
    }
    */

    override fun updateAll() {
        if (!::treatment.isInitialized) {
            getView()?.showErrorToast("Datos de tratamiento no cargados.")
            return
        }
        CoroutineScope(Dispatchers.Main).launch {
            interactor?.let {
                val treamentToSave = treatment // Es de tipo Treament
                // El interactor.editTreatment espera un objeto Treament, lo cual es correcto.
                compositeDisposable.add(it.editTreatment(treamentToSave, basalInsuline, correctoraInsuline, medidorName, bombaInfusoraName)
                    .compose(schedulerProvider.ioToMainObservableScheduler())
                    .subscribe({
                        getView()?.showSuccessToast("Actualizo Correctamente")
                        getTreatment() // Para refrescar los datos, incluyendo los nombres
                    }, { throwable ->
                        showException(throwable)
                    })
                )
            }
        }
    }

    override fun saveBasal(item: BasalItem) {
        if (!::treatment.isInitialized) return
        treatment.basal_insuline = item.id
        this.basalInsuline = item.name 
        Log.i("OnSaveBasal", "Basal seteada en memoria: ${item.id}, Nombre: ${item.name}")
    }

    override fun saveCorrectora(item: BasalItem) {
        if (!::treatment.isInitialized) return
        treatment.correctora_insuline = item.id
        this.correctoraInsuline = item.name 
        Log.i("OnSaveCorrectora", "Correctora seteada en memoria: ${item.id}, Nombre: ${item.name}")
    }
    override fun saveCategory(item: HorarioItem) {
        if (!::treatment.isInitialized) return
        basal = TreamentHorarios(item.id, item.categoryId, item.selected, treatment.id, item.units.toFloat())
        Log.i("OnSaveCategory", "Categoría basal guardada en memoria: ${item.name}")

        interactor?.let {
            compositeDisposable.add(it.editBasalCategory(basal)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ getView()?.showSuccessToast("Actualizo Correctamente")
                }, { throwable ->
                    Log.e("SaveCategory", "Error al guardar categoría basal: ${throwable.message}", throwable)
                    showException(throwable)
                })
            )
        }
    }

    override fun saveCorrectoraCategory(item: HorarioItem) {
        if (!::treatment.isInitialized) return
        // Asegurarse de que treatment.id es válido antes de usarlo
        if (treatment.id == 0) { // O cualquier otro valor que indique "no inicializado" o "inválido"
             Log.e("SaveCorrectoraCategory", "treatment.id es inválido (${treatment.id}) antes de crear TreamentCorrectoraHorarios.")
             getView()?.showErrorToast("Error: No se pudo guardar la categoría correctora debido a datos de tratamiento incompletos.")
             return 
        }
        correctora = TreamentCorrectoraHorarios(item.id, item.categoryId,  treatment.id, item.selected)
        Log.i("OnSaveCorrectoraCategory", "Categoría correctora guardada en memoria: ${item.name} con treatment.id: ${treatment.id}")
        interactor?.let {
            compositeDisposable.add(it.editCorrectoraCategory(correctora)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ getView()?.showSuccessToast("Actualizo Correctamente")
                }, { throwable ->
                    Log.e("SaveCorrectoraCategory", "Error al guardar categoría correctora: ${throwable.message}", throwable)
                    showException(throwable)
                })
            )
        }
    }

    override fun saveUnitCorrectora(unit: Float) {
        if (!::treatment.isInitialized) return
        treatment.correctora_unit = unit
        Log.i("OnSaveUnitCorrectora", "Unidad correctora en memoria: $unit")
    }

    override fun saveHoraBasal(item: BasalHoraItem) {
        if (!::treatment.isInitialized) return
         if (treatment.id == 0) {
            Log.e("SaveHoraBasal", "treatment.id es inválido (${treatment.id}) antes de crear TreamentBasalHora.")
            getView()?.showErrorToast("Error: No se pudo guardar la hora basal debido a datos de tratamiento incompletos.")
            return
        }
        Log.i("OnSaveHoraBasal", "Entré a la función saveHoraBasal")
        Log.i("OnSaveHoraBasal", "El item es: $item, treatment.id: ${treatment.id}")
        val unitsFloat = item.units.toFloatOrNull()
        if (unitsFloat == null) {
            Log.e("OnSaveHoraBasal", "Units vacío o inválido: '${item.units}'")
            getView()?.showErrorToast("La unidad basal no puede estar vacía o ser inválida")
            return
        }
        var hora = TreamentBasalHora(item.id, item.name,  treatment.id, unitsFloat)
        interactor?.let {
            compositeDisposable.add(it.editBasalHora(hora)
                .compose(schedulerProvider.ioToMainObservableScheduler())
                .subscribe({ getView()?.showSuccessToast("Actualizo Correctamente")
                }, { throwable ->
                    Log.e("SaveHoraBasal", "Error al guardar hora basal: ${throwable.message}", throwable)
                    showException(throwable)
                })
            )
        }
    }

    override fun saveMedidor(item: BasalItem) {
        if (!::treatment.isInitialized) return
        treatment.medidor = item.id
        this.medidorName = item.name 
        Log.i("OnSaveMedidor", "Medidor guardado en memoria: ${item.id}, Nombre: ${item.name}")
    }

    override fun saveBomba(item: BasalItem) {
        if (!::treatment.isInitialized) return
        treatment.bomba_infusora = item.id
        this.bombaInfusoraName = item.name 
        Log.i("OnSaveBomba", "Bomba guardada en memoria: ${item.id}, Nombre: ${item.name}")
    }

    override fun saveCarbono(carbono: Float) {
        if (!::treatment.isInitialized) return
        treatment.carbono = carbono
        Log.i("OnSaveCarbono", "Carbono seteado en memoria: $carbono")
    }

    override fun saveUnitInsulina(unit: Float) {
        if (!::treatment.isInitialized) return
        treatment.insulina_unit = unit
        Log.i("OnSaveUnitInsulina", "Unidad insulina en memoria: $unit")
    }


    fun getCorrectora() { 
        interactor?.let {
            compositeDisposable.add(it.getCorrectora()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ correctoras ->
                    Log.i("OnGetCorrectora", "Se inicia bien: $correctoras")
                    getDataCorrectora(correctoras)
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
        Log.e("TreatmentPresenter", "Error: ${throwable?.message}", throwable)
        getView()?.showErrorToast("Ocurrió un error: ${throwable?.message}")
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

    private fun getUser() { 
        val date = LocalDateTime()
        interactor?.let {
            compositeDisposable.add(it.getUser()
                .subscribeOn(Schedulers.io())
                .subscribe({ userData ->
                    user = userData
                    getView()?.setData(userData,date.toDate())
                    getTreatment() 
                }, { err ->
                    Log.e("TreatmentPresenter", "Error obteniendo usuario: $err")
                    getView()?.showErrorToast("Error al cargar datos del usuario.")
                })
            )
        }
    }
    private fun getTreatment() { 
        interactor?.let {
            compositeDisposable.add(it.getTreatment() // Devuelve TreatmentBasalCorrectora
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ treamentResponse -> 
                    Log.i("OnGetTreatment", "Se ingresa a treatment:$treamentResponse")
                    getView()?.let {view -> 
                        if (treamentResponse.treament != null) {
                            treatment = treamentResponse.treament!!
                            Log.i("GetTreatment", "Treatment object set with id: ${treatment.id}")
                            // Guardar nombres directamente si vienen de la API y no son nulos/vacíos
                            if (!treamentResponse.basalInsuline?.name.isNullOrEmpty()){
                                basalInsuline = treamentResponse.basalInsuline?.name.toString()
                            } else {
                                basalInsuline = "" // Asegurar inicialización si no viene de la API
                            }
                            if (!treamentResponse.correctoraInsuline?.cname.isNullOrEmpty()){
                                correctoraInsuline = treamentResponse.correctoraInsuline?.cname.toString()
                            } else {
                                correctoraInsuline = "" // Asegurar inicialización si no viene de la API
                            }
                        
                            // Obtener y guardar nombres para medidor y bomba si los IDs existen
                            // Y si no tenemos ya un nombre (por ejemplo, de una selección previa no guardada)
                            if (treatment.medidor != 0 && medidorName.isEmpty()) { 
                                getMedidores() // Para poblar medidorName si aún no está
                            }
                            if (treatment.bomba_infusora != 0 && bombaInfusoraName.isEmpty()) { 
                                getBombas() // Para poblar bombaInfusoraName si aún no está
                            }

                            getPromedio(treamentResponse)
                            getTotalBasal()
                            view.setTreatment(treamentResponse) // La vista espera TreatmentBasalCorrectora
                        } else {
                            Log.e("getTreatment", "El objeto Treament dentro de TreatmentBasalCorrectora es null")
                            // Considera inicializar un 'treatment' local vacío o mostrar un estado de error/vacío en la UI
                            // Por ejemplo: treatment = Treament(id=0, /* otros valores por defecto */)
                            // view.showEmptyTreatmentState() o similar
                        }
                        
                        // Aseguramos que las llamadas para popular listas para selección se hagan (ya están en onAttach)
                    }
                }, { err ->
                    Log.e("OnGetTreatment", "Ocurrio un error: $err")
                    getView()?.showErrorToast("Error al cargar el tratamiento.")
                })
            )
        }
    }

    private fun getPromedio(treamentResponse: TreatmentBasalCorrectora) { 
        val tratamientoLocal = treamentResponse.treament
        if (tratamientoLocal == null) {
            Log.w("getPromedio", "Tratamiento local es null, no se puede calcular promedio.")
            return
        }
        val danger = tratamientoLocal.hyperglucose
        val good = tratamientoLocal.hipoglucose..tratamientoLocal.hyperglucose
        val low = 20f..tratamientoLocal.hipoglucose
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
    private fun getDataBasal(basales: List<BasalInsuline>) { 
        val ret = ArrayList<BasalItem>()
        for (i in basales.indices) {
            val data = BasalItem.Builder()
                .id(basales[i].bid)
                .name(basales[i].name)
                .build()
            ret.add(data)
        }
        getView()?.setInsulinasBasales(ret) // Corregido
        if (::treatment.isInitialized && treatment.basal_insuline != 0) {
            basales.firstOrNull { it.bid == treatment.basal_insuline }?.let {
                if (this.basalInsuline.isEmpty() || this.basalInsuline != it.name) { // Comprobar con isEmpty
                     this.basalInsuline = it.name
                }
            }
        }
    }
     private fun getDataCorrectora(correctoras: List<CorrectoraInsuline>) { 
        val ret = ArrayList<BasalItem>()
        for (i in correctoras.indices) {
            val data = BasalItem.Builder()
                .id(correctoras[i].cid)
                .name(correctoras[i].cname)
                .build()
            ret.add(data)
        }
        getView()?.setInsulinasCorrectoras(ret) // Corregido
        if (::treatment.isInitialized && treatment.correctora_insuline != 0) {
            correctoras.firstOrNull { it.cid == treatment.correctora_insuline }?.let {
                if (this.correctoraInsuline.isEmpty() || this.correctoraInsuline != it.cname) { // Comprobar con isEmpty
                    this.correctoraInsuline = it.cname
                }
            }
        }
    }
     private fun getDataMedidor(medidores: List<Medidor>) { 
        val ret = ArrayList<BasalItem>()
        for (i in medidores.indices) {
            val data = BasalItem.Builder()
                .id(medidores[i].mid)
                .name(medidores[i].name)
                .build()
            ret.add(data)
        }
        getView()?.setMedidor(ret)
        if (::treatment.isInitialized && treatment.medidor != 0) {
            medidores.firstOrNull { it.mid == treatment.medidor }?.let {
                if (this.medidorName.isEmpty() || this.medidorName != it.name) {
                    this.medidorName = it.name
                    Log.i("getDataMedidor", "Nombre del medidor seteado: ${this.medidorName}")
                }
            }
        }
    }
     private fun getDataBomba(bombas: List<BombaInfusora>) { 
        val ret = ArrayList<BasalItem>()
        for (i in bombas.indices) {
            val data = BasalItem.Builder()
                .id(bombas[i].boid)
                .name(bombas[i].name)
                .build()
            ret.add(data)
        }
        getView()?.setBomba(ret)
        if (::treatment.isInitialized && treatment.bomba_infusora != 0) {
            bombas.firstOrNull { it.boid == treatment.bomba_infusora }?.let {
                if (this.bombaInfusoraName.isEmpty() || this.bombaInfusoraName != it.name ){
                    this.bombaInfusoraName = it.name
                    Log.i("getDataBomba", "Nombre de la bomba seteado: ${this.bombaInfusoraName}")
                }
            }
        }
    }
    private fun getDataCategories(categoriesFromDb: List<TreatmentHorariosCategory>) {
        val ret = ArrayList<HorarioItem>()
        val currentView = getView() // V?

        // La vista (Activity/Fragment) debería ser o proveer un Context
        val context = (currentView as? Context) // Intenta castear la vista a Context

        for(i in categoriesFromDb.indices){
            val categoryItem = categoriesFromDb[i].category
            if (categoryItem != null) {
                var translatedName = categoryItem.cate_name

                context?.let { ctx -> // Usar el contexto obtenido
                    val resourceId = ctx.resources.getIdentifier(categoryItem.cate_name, "string", ctx.packageName)
                    if (resourceId != 0) {
                        try {
                            translatedName = ctx.getString(resourceId)
                        } catch (e: Exception) {
                            Log.e("getDataCategories", "Error al obtener string para ${categoryItem.cate_name}", e)
                        }
                    } else {
                        Log.w("getDataCategories", "No se encontró ID de recurso para: ${categoryItem.cate_name}")
                    }
                }
                
                val data = HorarioItem.Builder()
                    .id(categoryItem.cate_id)
                    .name(translatedName)
                    .build()
                ret.add(data)
            }
        }
        currentView?.setCategories(ret)
    }

     private fun getDataCategoriesCorrectora(categoriesFromDb: List<TreatmentHCorrectoraCategory>) {
        val ret = ArrayList<HorarioItem>()
        val currentView = getView()
        val context = (currentView as? Context) // Intenta castear la vista a Context

        for(i in categoriesFromDb.indices){
             val categoryItem = categoriesFromDb[i].category
            if (categoryItem != null) {
                var translatedName = categoryItem.cate_name

                context?.let { ctx -> // Usar el contexto obtenido
                    val resourceId = ctx.resources.getIdentifier(categoryItem.cate_name, "string", ctx.packageName)
                    if (resourceId != 0) {
                        try {
                            translatedName = ctx.getString(resourceId)
                        } catch (e: Exception) {
                            Log.e("getDataCategoriesCorrectora", "Error al obtener string para ${categoryItem.cate_name}", e)
                        }
                    } else {
                        Log.w("getDataCategoriesCorrectora", "No se encontró ID de recurso para: ${categoryItem.cate_name}")
                    }
                }
                
                val data = HorarioItem.Builder()
                    .id(categoryItem.cate_id)
                    .name(translatedName)
                    .build()
                ret.add(data)
            }
        }
        currentView?.setCategoriesCorrectora(ret)
    }
    private fun getDataBasalHora(horas: List<TreamentBasalHora>) { 
        val ret = ArrayList<BasalHoraItem>()
        for(i in horas.indices){
            val data = BasalHoraItem.Builder()
                .id(horas[i].id)
                .name(horas[i].time) // Corregido
                .units(horas[i].units.toString())
                .build()

            ret.add(data)
        }
        getView()?.setBasalHoras(ret) // Corregido

    }

    // Métodos de la interfaz añadidos como stubs
    override suspend fun makePdf(context: Context) {
        TODO("Not yet implemented")
    }

    override fun saveObj(obj: Float) {
        if (!::treatment.isInitialized) return
        treatment.object_glucose = obj
        Log.i("saveObj", "Objetivo glucosa seteado en memoria: $obj")
        // Considera llamar a updateAll() o commitChanges() si este cambio debe persistir inmediatamente
    }

    override fun saveHipo(hipo: Float) {
        if (!::treatment.isInitialized) return
        treatment.hipoglucose = hipo
        Log.i("saveHipo", "Hipoglucosa seteada en memoria: $hipo")
    }

    override fun saveHyper(hyper: Float) {
        if (!::treatment.isInitialized) return
        treatment.hyperglucose = hyper
        Log.i("saveHyper", "Hiperglucosa seteada en memoria: $hyper")
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

    override fun saveCorrectoraGlu(correctoraValue: Float) { // Renombrado el parámetro para evitar confusión
        if (!::treatment.isInitialized) return
        treatment.correctora = correctoraValue
        Log.i("saveCorrectoraGlu", "Correctora (sensibilidad) seteada en memoria: $correctoraValue")
    }

    override fun saveBomb(bomb: Boolean) {
        if (!::treatment.isInitialized) return
        treatment.bomb = bomb
        Log.i("saveBomb", "Uso de bomba seteado en memoria: $bomb")
    }

    override fun goToActivityRegister() {
        getView()?.openRegisterActivity()
    }

    override fun commitChanges() { // Este podría ser un alias para updateAll o tener una lógica más específica
        updateAll()
        Log.i("commitChanges", "Cambios enviados para actualizar.")
    }
}
