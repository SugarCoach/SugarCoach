package com.sugarcoach.ui.treatment.view

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.ColorDrawable
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
import com.sugarcoach.R
import com.sugarcoach.data.database.repository.treament.TreatmentBasalCorrectora
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.ui.base.view.BaseActivity
import com.sugarcoach.ui.daily.view.DailyActivity
import com.sugarcoach.ui.main.view.MainActivity
import com.sugarcoach.ui.statistics.view.StatisticsActivity
import com.sugarcoach.ui.treatment.interactor.TreatmentInteractorImp
import com.sugarcoach.ui.treatment.presenter.TreatmentPresenterImp
import com.sugarcoach.util.extensions.resIdByName
import kotlinx.android.synthetic.main.activity_treatment.*
import kotlinx.android.synthetic.main.dialog_congratulation.view.*
import kotlinx.android.synthetic.main.dialog_info.view.*
import kotlinx.android.synthetic.main.dialog_treatment_save.view.*
import org.joda.time.LocalTime
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
    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treatment)
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

    override fun showErrorToast() {
    }


    override fun setData(user: User, date: Date) {
        this.user = user
        treament_username_txt.setText(user.username)
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedDate = formatter.format(date)
        val formattedTime = formatterTime.format(date)
        treament_time_txt.text = (formattedTime)
        treament_date_txt.text = (formattedDate)
        if (user.typeAccount == "3"){
            mirrorAccount()
        }
        user.avatar?.let {
            treament_userimg_iv.setImageDrawable(getDrawable(resIdByName(it, "drawable")))
        }

    }


    override fun setPromedio( promedio: Float) {
        treatment_glu_prom_txt.text = promedio.toInt().toString()
    }

    override fun setPromedioBasal(total: Float) {
        if (total > 0f) {
            treatment_insu_prom_txt.text = total.toInt().toString()
        }
    }

    override fun setPromColor(color: Int) {
        treatment_glu_prom_txt.setTextColor(ContextCompat.getColor(this,color))
    }

    override fun setInsulinasBasales(basalInsuline: List<BasalItem>) {
        adapter.setPowerView(treatment_basal)
        treatment_basal.setSpinnerAdapter(adapter)
        treatment_basal.getSpinnerRecyclerView().layoutManager = linearLayoutManager
        treatment_basal.setItems(basalInsuline)
    }

    override fun setInsulinasCorrectoras(basalInsuline: List<BasalItem>) {
        adapterCorrectora.setPowerView(treatment_correctora)
        treatment_correctora.setSpinnerAdapter(adapterCorrectora)
        treatment_correctora.getSpinnerRecyclerView().layoutManager = cmanager
        treatment_correctora.setItems(basalInsuline)
    }

    override fun setMedidor(basalInsuline: List<BasalItem>) {
        adapterMedidor.setPowerView(treatment_medidor)
        treatment_medidor.setSpinnerAdapter(adapterMedidor)
        treatment_medidor.getSpinnerRecyclerView().layoutManager = medidorManager
        treatment_medidor.setItems(basalInsuline)
    }

    override fun setBomba(basalInsuline: List<BasalItem>) {
        adapterBomba.setPowerView(treatment_bomb_infusora)
        treatment_bomb_infusora.setSpinnerAdapter(adapterBomba)
        treatment_bomb_infusora.getSpinnerRecyclerView().layoutManager = bombaManager
        treatment_bomb_infusora.setItems(basalInsuline)
    }

    override fun showDataSave() {
        createDialogCongratulation()
    }

    private fun createDialogCongratulation(){
        val view = LayoutInflater.from(this).inflate(R.layout.dialog_congratulation, null)
        val builder = androidx.appcompat.app.AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setView(view)
        dialog = builder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        view.congratulation_pts_txt.text = "+100"
        user.avatar?.let {
            view.congratulation_avatar.setImageDrawable(getDrawable(resIdByName(it, "drawable")))
        }
        view.congratulation_close.setOnClickListener { dialog.dismiss() }
        dialog.setOnDismissListener { finish() }
        dialog.show()

    }

    override fun setTreatment(treament: TreatmentBasalCorrectora) {
        var tratamiento = treament.treament!!
        treatment_obj_txt.setText(tratamiento.object_glucose.toInt().toString())
        treatment_hiper_txt.setText(tratamiento.hyperglucose.toInt().toString())
        treatment_hipo_txt.setText(tratamiento.hipoglucose.toInt().toString())
        treatment_bomb.isChecked = tratamiento.bomb!!
        if (tratamiento.correctora_unit > 0f) {
            treatment_glu_mayor_ud.setText(tratamiento.correctora_unit.toInt().toString())
        }
        if (tratamiento.correctora > 0f) {
            treatment_glu_mayor.setText(tratamiento.correctora.toInt().toString())
        }
        if (tratamiento.insulina_unit > 0f) {
            treatment_carbono_ud.setText(tratamiento.insulina_unit.toInt().toString())
        }
        if (tratamiento.carbono > 0f) {
            treatment_carbono.setText(tratamiento.carbono.toInt().toString())
        }
        tratamiento.basal_id?.let {
            initialbasal = true
            treatment_insu_txt.text = treament.basalInsuline?.name
            treatment_basal.selectItemByIndex(it-1)
        }
        tratamiento.correctora_id?.let {
            initial = true
            treatment_correctora.selectItemByIndex(it-1)
        }
        tratamiento.medidor_id?.let {
            initialMedidor = true
            treatment_medidor.selectItemByIndex(it-1)
        }
        tratamiento.bomba_id?.let {
            initialBomba = true
            treatment_bomb_infusora.selectItemByIndex(it-1)
        }
        treatment_correctora.setOnSpinnerItemSelectedListener<BasalItem> { position, item ->
            if (!initial) {
                presenter.saveCorrectora(item)
            }else{
                initial = false
            }
        }
        treatment_basal.setOnSpinnerItemSelectedListener<BasalItem> { position, item ->
            if (!initialbasal) {
                treatment_insu_txt.text = item.name
                presenter.saveBasal(item)
            }else{
                initialbasal = false
            }
        }
        treatment_medidor.setOnSpinnerItemSelectedListener<BasalItem> { position, item ->
            if (!initialMedidor) {
                presenter.saveMedidor(item)
            }else{
                initialMedidor = false
            }
        }
        treatment_bomb_infusora.setOnSpinnerItemSelectedListener<BasalItem> { position, item ->
            if (!initialBomba) {
                presenter.saveBomba(item)
            }else{
                initialBomba = false
            }
        }

    }

    override fun setCategories(category: List<HorarioItem>) {
        lmanager.orientation = RecyclerView.VERTICAL
        treatment_basal_list.layoutManager = lmanager
        treatment_basal_list.adapter = adapterCategory
        var items = ArrayList<String>()
        for (i in 1 until 36){
            items.add(i.toString())
        }
        adapterCategory.setData(category, items)

    }

    override fun setCategoriesCorrectora(category: List<HorarioItem>) {
        manager.orientation = RecyclerView.VERTICAL
        treatment_correctora_list.layoutManager = manager
        treatment_correctora_list.adapter = adapterCategoryCorrectora
        adapterCategoryCorrectora.setData(category)
    }

    override fun setBasalHoras(horas: List<BasalHoraItem>) {
        horamanager.orientation = RecyclerView.VERTICAL
        treatment_hora_list.layoutManager = horamanager
        treatment_hora_list.adapter = adapterBasalHoraAdapter
        adapterBasalHoraAdapter.setData(horas)
    }

    fun setListeners(){
        treatment_obj_txt.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                presenter.saveAll(treatment_obj_txt.text.toString().toFloat(), treatment_hipo_txt.text.toString().toFloat(),treatment_hiper_txt.text.toString().toFloat())
            }
            false
        }
        treatment_hipo_txt.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                presenter.saveAll(treatment_obj_txt.text.toString().toFloat(), treatment_hipo_txt.text.toString().toFloat(),treatment_hiper_txt.text.toString().toFloat())
            }
            false
        }
        treatment_hiper_txt.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                presenter.saveAll(treatment_obj_txt.text.toString().toFloat(), treatment_hipo_txt.text.toString().toFloat(),treatment_hiper_txt.text.toString().toFloat())
            }
            false
        }
        treatment_glu_mayor_ud.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                presenter.saveUnitCorrectora(treatment_glu_mayor_ud.text.toString().toFloat())
            }
            false
        }
        treatment_glu_mayor.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                presenter.saveCorrectoraGlu(treatment_glu_mayor.text.toString().toFloat())
            }
            false
        }
        treatment_carbono_ud.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                presenter.saveUnitInsulina(treatment_carbono_ud.text.toString().toFloat())
            }
            false
        }
        treatment_carbono.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                presenter.saveCarbono(treatment_carbono.text.toString().toFloat())
            }
            false
        }
        treatment_bomb.setOnCheckedChangeListener { buttonView, isChecked -> selectBomb(isChecked) }
        treatment_basal_title.setOnClickListener { v -> createDialogInfo(getString(R.string.info_insuline))  }
        treatment_ranges.setOnClickListener { v -> createDialogInfo(getString(R.string.info_objective))  }
        treatment_basal_units.setOnClickListener { v -> createDialogInfo(getString(R.string.info_insuline_times))  }
        treatment_glu_mayor_ud_title.setOnClickListener { v -> createDialogInfo(getString(R.string.info_insuline_correctora_mayor))  }
        treatment_correctora_title.setOnClickListener { v -> createDialogInfo(getString(R.string.info_insuline_correctora))  }
        treatment_correctora_list_title.setOnClickListener { v -> createDialogInfo(getString(R.string.info_insuline_horary))  }
        treatment_carbono_title.setOnClickListener { v -> createDialogInfo(getString(R.string.info_carbono))  }
        treatment_recordatorio_title.setOnClickListener { v -> createDialogInfo(getString(R.string.info_recordatorio))  }
    }
    fun menuListeners(){
        home.setOnClickListener { presenter.goToActivityMain() }
        statistics.setOnClickListener { presenter.goToActivityStatistic() }
        dailyRegister.setOnClickListener { presenter.goToActivityDaily() }

    }
    private fun createDialogInfo(info: String){
        val view = LayoutInflater.from(this).inflate(R.layout.dialog_info, null)
        val builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setView(view)
        var dialog = builder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        view.info_subtitle.text = info
        view.info_accept.setOnClickListener{
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
            treatment_bomb_no.visibility = View.GONE
            treatment_horario.visibility = View.GONE
            treatment_bomb_si.visibility = View.VISIBLE
        }else{
            treatment_bomb_no.visibility = View.VISIBLE
            treatment_horario.visibility = View.VISIBLE
            treatment_bomb_si.visibility = View.GONE
        }
        presenter.saveBomb(show)
    }
    fun mirrorAccount() {
        add_register.isEnabled = false
        add_register_image.setColorFilter(ContextCompat.getColor(this, R.color.gray), PorterDuff.Mode.MULTIPLY)
    }

    fun dialogSave() {
        val view = LayoutInflater.from(this).inflate(R.layout.dialog_treatment_save, null)
        val builder = AlertDialog.Builder(this)
        builder.setView(view)
        dialog = builder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        view.treament_accept.setOnClickListener {
            presenter.updateAll()
            dialog.dismiss()
        }
        view.treament_cancel.setOnClickListener {
            finish()
            dialog.dismiss()
        }
        dialog.show()
    }

    override fun onBackPressed() {
        dialogSave()
    }
}
