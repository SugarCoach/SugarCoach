package com.sugarcoach.ui.treatment.view

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.play.core.integrity.e
import com.skydoves.powerspinner.PowerSpinnerInterface
import com.sugarcoach.R
import com.sugarcoach.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.databinding.ActivityTreatmentBinding
import com.sugarcoach.databinding.DialogCongratulationBinding
import com.sugarcoach.databinding.DialogInfoBinding
import com.sugarcoach.databinding.DialogTreatmentSaveBinding
import com.sugarcoach.ui.base.view.BaseActivity
import com.sugarcoach.ui.daily.view.DailyActivity
import com.sugarcoach.ui.main.view.MainActivity
import com.sugarcoach.ui.statistics.view.StatisticsActivity
import com.sugarcoach.ui.treatment.interactor.TreatmentInteractorImp
import com.sugarcoach.ui.treatment.presenter.TreatmentPresenterImp
import com.sugarcoach.util.extensions.resIdByName
import org.joda.time.LocalTime
import java.lang.reflect.TypeVariable
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

    override fun showSuccessToast() {
        Toast.makeText(this, getString(R.string.update_success), Toast.LENGTH_LONG).show()
    }

    fun showErrorToast2(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
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

    override fun showDataSave() {
        createDialogCongratulation()
    }

    private fun createDialogCongratulation(){
        val view = DialogCongratulationBinding.inflate(layoutInflater)
        val builder = androidx.appcompat.app.AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setView(view.root)
        dialog = builder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        view.congratulationPtsTxt.text = "+100"
        user.avatar?.let {
            view.congratulationAvatar.setImageDrawable(getDrawable(resIdByName(it, "drawable")))
        }
        view.congratulationClose.setOnClickListener { dialog.dismiss() }
        dialog.setOnDismissListener { finish() }
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
            presenter.getScreenShot(this, binding.treatmentLl)
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
        dialogSave()
    }
}
