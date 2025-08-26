package com.sugarcoachpremium.ui.treatment.view

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoachpremium.R
import com.sugarcoachpremium.data.api_db.DailyRegister.DailyRegisterResponse
import com.sugarcoachpremium.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.databinding.ActivityTreatmentBinding
import com.sugarcoachpremium.databinding.DialogCongratulationBinding
import com.sugarcoachpremium.databinding.DialogInfoBinding
import com.sugarcoachpremium.databinding.DialogTreatmentSaveBinding
import com.sugarcoachpremium.ui.base.view.BaseActivity
import com.sugarcoachpremium.ui.daily.view.DailyActivity
import com.sugarcoachpremium.ui.main.view.MainActivity
import com.sugarcoachpremium.ui.statistics.view.StatisticsActivity
import com.sugarcoachpremium.ui.table.view.TableActivity
import com.sugarcoachpremium.ui.treatment.interactor.TreatmentInteractorImp
import com.sugarcoachpremium.ui.treatment.presenter.TreatmentPresenterImp
import com.sugarcoachpremium.util.extensions.resIdByName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.Serializable
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class TreatmentActivity : BaseActivity(), TreatmentView {

    @Inject
    lateinit var presenter: TreatmentPresenterImp<TreatmentView, TreatmentInteractorImp>


    @Inject
    lateinit var linearLayoutManager: LinearLayoutManager

    @Inject
    lateinit var manager: LinearLayoutManager

    @Inject
    lateinit var cmanager: LinearLayoutManager

    @Inject
    lateinit var lmanager: LinearLayoutManager

    @Inject
    lateinit var horamanager: LinearLayoutManager

    @Inject
    lateinit var medidorManager: LinearLayoutManager

    @Inject
    lateinit var bombaManager: LinearLayoutManager

    @Inject
    lateinit var adapter: BasalAdapter

    @Inject
    lateinit var adapterCorrectora: BasalAdapter

    @Inject
    lateinit var adapterMedidor: MedidorAdapter

    @Inject
    lateinit var adapterBomba: BombaAdapter

    @Inject
    lateinit var adapterCategory: TreatmentAdapter

    @Inject
    lateinit var adapterCategoryCorrectora: TreatmentCorrectoraAdapter

    @Inject
    lateinit var adapterBasalHoraAdapter: TreatmentBasalHoraAdapter

    var initial = false
    var initialbasal = false
    var initialMedidor = false
    var initialBomba = false
    var isFabOpen = false
    lateinit var user: User

    lateinit var binding: ActivityTreatmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTreatmentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.onAttach(this)
        setListeners()
        menuListeners()
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun showSuccessToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

    override fun showErrorToast(msg: String) {
    }

    override fun setData(user: User, date: Date) {
        this.user = user
        binding.treamentUsernameTxt.setText(user.username)
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedDate = formatter.format(date)
        val formattedTime = formatterTime.format(date)
        binding.treamentTimeTxt.text = formattedTime
        binding.treamentDateTxt.text = formattedDate
        if (user.typeAccount == "3") {
            mirrorAccount()
        }
        user.avatar?.let {
            binding.treamentUserimgIv.setImageDrawable(getDrawable(resIdByName(it, "drawable")))
        }
    }

    override fun setPromedio(promedio: Float) {
        binding.treatmentGluPromTxt.text = promedio.toInt().toString()
    }

    override fun setPromedioBasal(total: Float) {
        if (total > 0f) {
            binding.treatmentInsuPromTxt.text = total.toInt().toString()
        }
    }

    override fun setPromColor(color: Int) {
        binding.treatmentGluPromTxt.setTextColor(ContextCompat.getColor(this, color))
    }

    override fun setInsulinasBasales(basalInsuline: List<BasalItem>) {
        adapter.setPowerView(binding.treatmentBasal)
        binding.treatmentBasal.setSpinnerAdapter(adapter)
        binding.treatmentBasal.getSpinnerRecyclerView().layoutManager = linearLayoutManager
        binding.treatmentBasal.setItems(basalInsuline)
    }

    override fun setInsulinasCorrectoras(basalInsuline: List<BasalItem>) {
        adapterCorrectora.setPowerView(binding.treatmentCorrectora)
        binding.treatmentCorrectora.setSpinnerAdapter(adapterCorrectora)
        binding.treatmentCorrectora.getSpinnerRecyclerView().layoutManager = cmanager
        binding.treatmentCorrectora.setItems(basalInsuline)
    }

    override fun setMedidor(basalInsuline: List<BasalItem>) {
        adapterMedidor.setPowerView(binding.treatmentMedidor)
        binding.treatmentMedidor.setSpinnerAdapter(adapterMedidor)
        binding.treatmentMedidor.getSpinnerRecyclerView().layoutManager = medidorManager
        binding.treatmentMedidor.setItems(basalInsuline)
    }

    override fun setBomba(basalInsuline: List<BasalItem>) {
        adapterBomba.setPowerView(binding.treatmentBombInfusora)
        binding.treatmentBombInfusora.setSpinnerAdapter(adapterBomba)
        binding.treatmentBombInfusora.getSpinnerRecyclerView().layoutManager = bombaManager
        binding.treatmentBombInfusora.setItems(basalInsuline)
    }


    override fun showDataSave(totalPoints: Int, points: Int) {
        createDialogCongratulation(points, totalPoints)
    }

    private fun createDialogCongratulation(points: Int, totalPoints: Int){
        val view = DialogCongratulationBinding.inflate(layoutInflater)
        val builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setView(view.root)
        dialog = builder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        view.congratulationPtsTxt.text = "+" + (points.toString())
        user.avatar?.let {
            view.congratulationAvatar.setImageDrawable(getDrawable(resIdByName(it, "drawable")))
        }
        var text = "1 - Startup Explorer"
        val levelPoints = 43400
        when{
            (totalPoints in levelPoints until levelPoints*2) ->{
                text = "2 - Space Cadet"
            }
            (totalPoints in levelPoints*2 until levelPoints*4) ->{
                text = "3 - Rocket Captain"
            }
            (totalPoints in levelPoints*4 until levelPoints*8 ) ->{
                text = "4 - Startreck Voyayer"
            }
            (totalPoints in levelPoints*8 until levelPoints*16 ) ->{
                text = "5 - Future Traveller"
            }
            (totalPoints >= levelPoints*16) ->{
                text = "6 - Quarks Master"
            }
        }
        view.congratulationLevelTxt.text = text
        view.congratulationPtsTotalTxt.text = totalPoints.toString()
        view.congratulationClose.setOnClickListener { dialog.dismiss() }
        dialog.setOnDismissListener { presenter.goToActivityMain() }
        dialog.show()
    }

    override fun setTreatment(treament: TreatmentBasalCorrectora) {
        val tratamiento = treament.treament!!
        binding.treatmentObjTxt.setText(tratamiento.object_glucose.toInt().toString())
        binding.treatmentHiperTxt.setText(tratamiento.hyperglucose.toInt().toString())
        binding.treatmentHipoTxt.setText(tratamiento.hipoglucose.toInt().toString())
        binding.treatmentBomb.isChecked = tratamiento.bomb!!
        if (tratamiento.correctora_unit > 0f) {
            binding.treatmentGluMayorUd.setText(tratamiento.correctora_unit.toInt().toString())
        }
        if (tratamiento.correctora > 0f) {
            binding.treatmentGluMayor.setText(tratamiento.correctora.toInt().toString())
        }
        if (tratamiento.insulina_unit > 0f) {
            binding.treatmentCarbonoUd.setText(tratamiento.insulina_unit.toInt().toString())
        }
        if (tratamiento.carbono > 0f) {
            binding.treatmentCarbono.setText(tratamiento.carbono.toInt().toString())
        }
        tratamiento.basal_id?.let {
            initialbasal = true
            binding.treatmentInsuTxt.text = treament.basalInsuline?.name
            binding.treatmentBasal.selectItemByIndex(it-1)
        }
        tratamiento.correctora_id?.let {
            initial = true
            binding.treatmentCorrectora.selectItemByIndex(it-1)
        }
        tratamiento.medidor_id?.let {
            initialMedidor = true
            binding.treatmentMedidor.selectItemByIndex(it-1)
        }
        tratamiento.bomba_id?.let {
            initialBomba = true
            binding.treatmentBombInfusora.selectItemByIndex(it-1)
        }
        binding.treatmentCorrectora.setOnSpinnerItemSelectedListener<BasalItem> { position, item ->
            if (!initial) {
                presenter.saveCorrectora(item)
            }else{
                initial = false
            }
        }
        binding.treatmentBasal.setOnSpinnerItemSelectedListener<BasalItem> { position, item ->
            if (!initialbasal) {
                binding.treatmentInsuTxt.text = item.name
                presenter.saveBasal(item)
            }else{
                initialbasal = false
            }
        }
        binding.treatmentMedidor.setOnSpinnerItemSelectedListener<BasalItem> { position, item ->
            if (!initialMedidor) {
                presenter.saveMedidor(item)
            }else{
                initialMedidor = false
            }
        }
        binding.treatmentBombInfusora.setOnSpinnerItemSelectedListener<BasalItem> { position, item ->
            if (!initialBomba) {
                presenter.saveBomba(item)
            }else{
                initialBomba = false
            }
        }
    }

    override fun setCategories(category: List<HorarioItem>) {
        lmanager.orientation = RecyclerView.VERTICAL
        binding.treatmentBasalList.layoutManager = lmanager
        binding.treatmentBasalList.adapter = adapterCategory
        var items = ArrayList<String>()
        for (i in 1 until 36){
            items.add(i.toString())
        }
        adapterCategory.setData(category, items)
    }

    override fun setCategoriesCorrectora(category: List<HorarioItem>) {
        manager.orientation = RecyclerView.VERTICAL
        binding.treatmentCorrectoraList.layoutManager = manager
        binding.treatmentCorrectoraList.adapter = adapterCategoryCorrectora
        adapterCategoryCorrectora.setData(category)
    }

    override fun setBasalHoras(horas: List<BasalHoraItem>) {
        horamanager.orientation = RecyclerView.VERTICAL
        binding.treatmentHoraList.layoutManager = horamanager
        binding.treatmentHoraList.adapter = adapterBasalHoraAdapter
        adapterBasalHoraAdapter.setData(horas)
    }

    fun setListeners(){
        binding.treatmentObjTxt.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                presenter.saveAll(
                    binding.treatmentObjTxt.text.toString().toFloat(),
                    binding.treatmentHipoTxt.text.toString().toFloat(),
                    binding.treatmentHiperTxt.text.toString().toFloat()
                )
            }
            false
        }
        binding.treatmentHipoTxt.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                presenter.saveAll(
                    binding.treatmentObjTxt.text.toString().toFloat(),
                    binding.treatmentHipoTxt.text.toString().toFloat(),
                    binding.treatmentHiperTxt.text.toString().toFloat()
                )
            }
            false
        }
        binding.treatmentHiperTxt.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                presenter.saveAll(
                    binding.treatmentObjTxt.text.toString().toFloat(),
                    binding.treatmentHipoTxt.text.toString().toFloat(),
                    binding.treatmentHiperTxt.text.toString().toFloat()
                )
            }
            false
        }
        binding.treatmentGluMayorUd.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                presenter.saveUnitCorrectora(
                    binding.treatmentGluMayorUd.text.toString().toFloat()
                )
            }
            false
        }
        binding.treatmentGluMayor.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                presenter.saveCorrectoraGlu(binding.treatmentGluMayor.text.toString().toFloat())
            }
            false
        }
        binding.treatmentCarbonoUd.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                presenter.saveUnitInsulina(binding.treatmentCarbonoUd.text.toString().toFloat())
            }
            false
        }
        binding.treatmentCarbono.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                presenter.saveCarbono(binding.treatmentCarbono.text.toString().toFloat())
            }
            false
        }

        binding.treatmentMenu.setOnClickListener{
            if (isFabOpen){
                hideMenu()
            }else{
                showMenu()
            }
        }

        binding.treatmentShared.setOnClickListener {
            hideMenu()
            showProgress()
            CoroutineScope(Dispatchers.IO).launch {
                presenter.makePdf(baseContext)
            }
            //presenter.getScreenShot(this, binding.treatmentLl)
        }

        binding.treatmentEdit.setOnClickListener {
            presenter.updateAll()
        }

        binding.treatmentBomb.setOnCheckedChangeListener { buttonView, isChecked ->
            selectBomb(isChecked)
        }

        binding.treatmentBasalTitle.setOnClickListener { v ->
            createDialogInfo(getString(R.string.info_insuline))
        }

        binding.treatmentRanges.setOnClickListener { v ->
            createDialogInfo(getString(R.string.info_objective))
        }

        binding.treatmentBasalUnits.setOnClickListener { v ->
            createDialogInfo(getString(R.string.info_insuline_times))
        }

        binding.treatmentGluMayorUdTitle.setOnClickListener { v ->
            createDialogInfo(getString(R.string.info_insuline_correctora_mayor))
        }

        binding.treatmentCorrectoraTitle.setOnClickListener { v ->
            createDialogInfo(getString(R.string.info_insuline_correctora))
        }

        binding.treatmentCorrectoraListTitle.setOnClickListener { v ->
            createDialogInfo(getString(R.string.info_insuline_horary))
        }

        binding.treatmentCarbonoTitle.setOnClickListener { v ->
            createDialogInfo(getString(R.string.info_carbono))
        }

        binding.treatmentRecordatorioTitle.setOnClickListener { v ->
            createDialogInfo(getString(R.string.info_recordatorio))
        }

    }
    fun hideMenu(){
        isFabOpen = false
        binding.treatmentMenu.setImageResource(R.drawable.ic_hand)
        binding.treatmentEdit.visibility = View.GONE
        binding.treatmentShared.visibility = View.GONE
    }
    fun showMenu(){
        isFabOpen = true
        binding.treatmentMenu.setImageResource(R.drawable.cancel)
        binding.treatmentEdit.visibility = View.VISIBLE
        binding.treatmentShared.visibility = View.VISIBLE
    }

    override fun sharedScreenShot(uri: Uri) {
        val shareIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_STREAM, uri)
            type = "image/jpeg"
        }
        startActivity(Intent.createChooser(shareIntent, resources.getText(R.string.daily_detail_share)))
    }
    fun menuListeners(){
        binding.home.setOnClickListener { presenter.goToActivityMain() }
        binding.statistics.setOnClickListener { presenter.goToActivityStatistic() }
        binding.dailyRegister.setOnClickListener { presenter.goToActivityDaily() }
    }
    private fun createDialogInfo(info: String){
        val view = DialogInfoBinding.inflate(layoutInflater)
        val builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setView(view.root)
        var dialog = builder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        view.infoSubtitle.text = info
        view.infoAccept.setOnClickListener{
            dialog.dismiss()
        }
        dialog.show()
    }
    override fun openDailyActivity() {
        val intent = Intent(this, DailyActivity::class.java)
        startActivity(intent)
        finish()
    }

     override fun openTableActivity(dailyRegisters: List<DailyRegisterResponse>, ){
         /*val intent = Intent(this, TableActivity::class.java)
         intent.putExtra("DailyRegisters", dailyRegisters.toArray())
         startActivity(intent)
         finish()*/
     }

    override fun openStatisticActivity() {
        val intent = Intent(this, StatisticsActivity::class.java)
        startActivity(intent)
        finish()
    }


    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        finish()
    }
    override fun getLabel(name: String): String {
        return getString(resIdByName(name, "string"))
    }

    fun selectBomb(show: Boolean){
        if (show) {
            binding.treatmentBombNo.visibility = View.GONE
            binding.treatmentHorario.visibility = View.GONE
            binding.treatmentBombSi.visibility = View.VISIBLE
        }else{
            binding.treatmentBombNo.visibility = View.VISIBLE
            binding.treatmentHorario.visibility = View.VISIBLE
            binding.treatmentBombSi.visibility = View.GONE
        }
        presenter.saveBomb(show)
    }
    fun mirrorAccount() {
        binding.addRegister.isEnabled = false
        binding.addRegisterImage.setColorFilter(ContextCompat.getColor(this, R.color.gray), PorterDuff.Mode.MULTIPLY)
    }

    fun dialogSave() {
        val view = DialogTreatmentSaveBinding.inflate(layoutInflater)
        val builder = AlertDialog.Builder(this)
        builder.setView(view.root)
        dialog = builder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        view.treamentAccept.setOnClickListener {
            presenter.updateAll()
            dialog.dismiss()
        }
        view.treamentCancel.setOnClickListener {
            finish()
            dialog.dismiss()
        }
        dialog.show()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        dialogSave()
    }
}
