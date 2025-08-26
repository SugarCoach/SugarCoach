package com.sugarcoachpremium.ui.register.view

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.sugarcoachpremium.R
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.ui.base.view.BaseActivity
import com.sugarcoachpremium.ui.register.interactor.RegisterInteractorImp
import com.sugarcoachpremium.ui.register.presenter.RegisterPresenterImp
import com.sugarcoachpremium.util.AppConstants
import javax.inject.Inject
import android.util.Log
import android.view.inputmethod.EditorInfo
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.sugarcoachpremium.data.database.repository.dailyregister.Category
import com.sugarcoachpremium.databinding.ActivityRegisterBinding
import com.sugarcoachpremium.databinding.DialogComentaryBinding
import com.sugarcoachpremium.databinding.DialogCongratulationBinding
import com.sugarcoachpremium.databinding.DialogEmotionsBinding
import com.sugarcoachpremium.ui.daily.view.DailyActivity
import com.sugarcoachpremium.ui.main.view.MainActivity
import com.sugarcoachpremium.ui.treatment.view.TreatmentActivity
import com.sugarcoachpremium.util.extensions.resIdByName
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
import java.text.SimpleDateFormat
import java.util.*


class RegisterActivity : BaseActivity(), RegisterView, TimePickerDialog.OnTimeSetListener, DatePickerDialog.OnDateSetListener {
    @Inject
    lateinit var presenter: RegisterPresenterImp<RegisterView, RegisterInteractorImp>

    @Inject
    lateinit var manager: LinearLayoutManager

    @Inject
    lateinit var managerEmotions: LinearLayoutManager

    @Inject
    lateinit var managerExercices: LinearLayoutManager

    @Inject
    lateinit var adapterEmotions: ItemAdapter

    @Inject
    lateinit var adapterExercices: ItemAdapter

    @Inject
    lateinit var adapter: CategoryAdapter


    lateinit var dialogEmotions: AlertDialog

    lateinit var dialogExercises: AlertDialog

    lateinit var dialogComment: AlertDialog

    lateinit var user: User

    lateinit var binding: ActivityRegisterBinding

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.onAttach(this)
        setOnClickListeners()
        setInitView()
        menuListeners()
    }

    override fun onDestroy() {
        counter = 0
        presenter.onDetach()
        super.onDestroy()
    }

    override fun showSuccessToast() {
    }

    override fun showValidationMessage(errorCode: Int) {
        when (errorCode) {
            AppConstants.EMPTY_GLUCOSE -> Toast.makeText(this, getString(R.string.empty_register_range_error_message), Toast.LENGTH_LONG).show()
            AppConstants.EMPTY_INSULIN -> Toast.makeText(this, getString(R.string.empty_register_range_error_message), Toast.LENGTH_LONG).show()
            AppConstants.EMPTY_CAR -> Toast.makeText(this, getString(R.string.empty_register_range_error_message), Toast.LENGTH_LONG).show()
            AppConstants.EMPTY_EMOTIONAL -> Toast.makeText(this, getString(R.string.empty_register_error_message), Toast.LENGTH_LONG).show()
            AppConstants.EMPTY_EXERCISE -> Toast.makeText(this, getString(R.string.empty_register_error_message), Toast.LENGTH_LONG).show()
        }
    }

    override fun showErrorToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

    override fun nextLoad(type: Int,value: Float?, position: String?) {
        when (type) {
            1 -> {
                binding.registerValueTxt.setText("")
                value?.let { if(it > 0) binding.registerValueTxt.setText(value.toInt().toString()) }
                binding.registerType.setText(R.string.register_insulina_label)
                binding.registerUnidadTv.setText(R.string.register_basal_unidad_label)
                binding.registerPlanet.setImageResource(R.drawable.planet_insulina)
                binding.registerPlanetBefore.setImageResource(R.drawable.planet_glucemia)
                binding.registerPlanetAfter.setImageResource(R.drawable.planet_carbohidratos)
                binding.registerDots.setDotSelection(1)
                binding.registerEmotionalTv.visibility = View.GONE
                binding.registerExercicesTv.visibility = View.GONE
                binding.registerUnidadTv.visibility = View.VISIBLE
                showHideExercise(false)
                showHideEmotional(false)
                showHideValue(true)
                showHideImgCar(false)
                showHideComentario(true)
                showHidePrev(true)
                showHideNext(true)

            }
            2 -> {
                binding.registerValueTxt.setText("")
                value?.let { if(it > 0) binding.registerValueTxt.setText(value.toString()) }
                binding.registerType.setText(R.string.register_carbohidratos_label)
                binding.registerUnidadTv.setText(R.string.register_car_unidad_label)
                binding.registerEmotionalTv.visibility = View.GONE
                binding.registerExercicesTv.visibility = View.GONE
                binding.registerUnidadTv.visibility = View.VISIBLE
                binding.registerDots.setDotSelection(2)
                binding.registerPlanet.setImageResource(R.drawable.planet_carbohidratos)
                binding.registerPlanetBefore.setImageResource(R.drawable.planet_insulina)
                binding.registerPlanetAfter.setImageResource(R.drawable.planet_actividad)
                showHideExercise(false)
                showHideEmotional(false)
                showHideValue(true)
                showHideImgCar(true)
                showHideComentario(false)
                showHidePrev(true)
                showHideNext(true)

            }
            3 -> {
                binding.registerPlanet.setImageResource(R.drawable.planet_actividad)
                binding.registerPlanetBefore.setImageResource(R.drawable.planet_carbohidratos)
                binding.registerPlanetAfter.setImageResource(R.drawable.planet_estado)
                binding.registerValueTxt.setText("")
                binding.registerDots.setDotSelection(3)
                binding.registerEmotionalTv.setVisibility(View.GONE)
                binding.registerExercicesTv.setVisibility(View.VISIBLE)
                binding.registerUnidadTv.setVisibility(View.GONE)
                binding.registerValueTxt.setEnabled(false)
                showHideExercise(true)
                showHideEmotional(false)
                showHideValue(false)
                showHideImgCar(false)
                showHideComentario(false)
                showHidePrev(true)
                showHideNext(true)


            }
            4 -> {
                binding.registerValueTxt.setText("")
                binding.registerDots.setDotSelection(4)
                binding.registerEmotionalTv.setVisibility(View.VISIBLE)
                binding.registerExercicesTv.setVisibility(View.GONE)
                binding.registerUnidadTv.setVisibility(View.GONE)
                binding.registerValueTxt.setEnabled(false)
                binding.registerPlanet.setImageResource(R.drawable.planet_estado)
                binding.registerPlanetBefore.setImageResource(R.drawable.planet_actividad)
                showHideExercise(false)
                showHideEmotional(true)
                showHideValue(false)
                showHideImgCar(false)
                showHideComentario(false)
                showHidePrev(true)
                showHideNext(false)

            }
        }
    }

    override fun prevLoad(type: Int, value: Float?, position: String?) {
        when (type) {
            0 -> {
                binding.registerType.setText(R.string.register_glucemia_label)
                binding.registerUnidadTv.setText(R.string.register_gluc_unidad_label)
                binding.registerDots.setDotSelection(0)
                binding.registerPlanet.setImageResource(R.drawable.planet_glucemia)
                binding.registerPlanetAfter.setImageResource(R.drawable.planet_insulina)
                binding.registerValueTxt.setEnabled(true)
                binding.registerEmotionalTv.setVisibility(View.GONE)
                binding.registerExercicesTv.setVisibility(View.GONE)
                binding.registerUnidadTv.setVisibility(View.VISIBLE)
                binding.registerValueTxt.setText("")
                value?.let { if(it > 0) binding.registerValueTxt.setText(value.toInt().toString()) }
                showHideExercise(false)
                showHideEmotional(false)
                showHideValue(true)
                showHideComentario(false)
                showHideImgCar(false)
                showHidePrev(false)
                showHideNext(true)
            }
            1 -> {
                binding.registerType.setText(R.string.register_insulina_label)
                binding.registerUnidadTv.setText(R.string.register_basal_unidad_label)
                binding.registerDots.setDotSelection(1)
                binding.registerPlanet.setImageResource(R.drawable.planet_insulina)
                binding.registerPlanetBefore.setImageResource(R.drawable.planet_glucemia)
                binding.registerPlanetAfter.setImageResource(R.drawable.planet_carbohidratos)
                binding.registerValueTxt.isEnabled = true
                binding.registerEmotionalTv.visibility = View.GONE
                binding.registerExercicesTv.visibility = View.GONE
                binding.registerUnidadTv.visibility = View.VISIBLE
                binding.registerValueTxt.setText("")
                value?.let { if(it > 0) binding.registerValueTxt.setText(value.toString()) }
                showHideExercise(false)
                showHideEmotional(false)
                showHideValue(true)
                showHideComentario(true)
                showHideImgCar(false)
                showHidePrev(true)
                showHideNext(true)
            }
            2 -> {
                binding.registerType.setText(R.string.register_carbohidratos_label)
                binding.registerDots.setDotSelection(2)
                binding.registerPlanet.setImageResource(R.drawable.planet_carbohidratos)
                binding.registerPlanetBefore.setImageResource(R.drawable.planet_insulina)
                binding.registerPlanetAfter.setImageResource(R.drawable.planet_actividad)
                binding.registerUnidadTv.setText(R.string.register_car_unidad_label)
                binding.registerValueTxt.setEnabled(true)
                binding.registerEmotionalTv.setVisibility(View.GONE)
                binding.registerExercicesTv.setVisibility(View.GONE)
                binding.registerUnidadTv.setVisibility(View.VISIBLE)
                value?.let { if(it > 0) binding.registerValueTxt.setText(value.toString()) }
                showHideExercise(false)
                showHideEmotional(false)
                showHideValue(true)
                showHideComentario(false)
                showHideImgCar(true)
                showHidePrev(true)
                showHideNext(true)

            }
            3 -> {
                binding.registerPlanet.setImageResource(R.drawable.planet_actividad)
                binding.registerPlanetBefore.setImageResource(R.drawable.planet_carbohidratos)
                binding.registerPlanetAfter.setImageResource(R.drawable.planet_estado)
                binding.registerEmotionalTv.visibility = View.GONE
                binding.registerExercicesTv.visibility = View.VISIBLE
                binding.registerUnidadTv.visibility = View.GONE
                binding.registerValueTxt.setText("")
                binding.registerDots.setDotSelection(3)
                binding.registerValueTxt.isEnabled = false
                showHideExercise(true)
                showHideEmotional(false)
                showHideValue(false)
                showHideImgCar(false)
                showHideComentario(false)
                showHidePrev(true)
                showHideNext(true)

            }
        }
    }

    override fun finishLoad(points: Int, totalPoints: Int) {
        createDialogCongratulation(points, totalPoints)
    }

    override fun backLoad() {
        finish()
    }

    override fun getUserData(user: User) {
        this.user = user
        binding.registerUsernameTxt.setText(user.username)
        user.avatar?.let {
            binding.registerUserimgIv.setImageDrawable(getDrawable(resIdByName(it, "drawable")))
        }
    }


    private fun showHidePlanet(show: Boolean) {
        if (show)
            binding.registerPlanet.visibility = View.VISIBLE
        else
            binding.registerPlanet.visibility = View.GONE

    }

    private fun showHideEmotional(show: Boolean) {
        if (show) {
            binding.registerType.setText(R.string.register_emotional_label)
            binding.registerEmotionalImg.visibility = View.VISIBLE
        }
        else {
            binding.registerEmotionalImg.visibility = View.GONE
        }

    }

    private fun showHideExercise(show: Boolean) {
        if (show) {
            binding.registerType.setText(R.string.register_exercises_label)
            binding.registerExerciseImg.setVisibility(View.VISIBLE)
        } else {
            binding.registerExerciseImg.setVisibility(View.GONE)
        }
    }

    private fun showHideImgCar(show: Boolean) {
        if (show) {
            binding.registerImgLy.setVisibility(View.VISIBLE)
        } else {
            binding.registerImgLy.setVisibility(View.GONE)
        }
    }

    private fun showHideComentario(show: Boolean) {
        if (show) {
            binding.registerComentario.setVisibility(View.VISIBLE)
        } else {
            binding.registerComentario.setVisibility(View.GONE)
        }
    }

    private fun showHideNext(show: Boolean) {
        if (show) {
            binding.registerNextIv.setVisibility(View.VISIBLE)
            binding.registerPlanetAfter.setVisibility(View.VISIBLE)
        } else {
            binding.registerNextIv.setVisibility(View.INVISIBLE)
            binding.registerPlanetAfter.setVisibility(View.INVISIBLE)
        }
    }

    private fun showHidePrev(show: Boolean) {
        if (show) {
            binding.registerPrevIv.setVisibility(View.VISIBLE)
            binding.registerPlanetBefore.setVisibility(View.VISIBLE)
        } else {
            binding.registerPrevIv.setVisibility(View.INVISIBLE)
            binding.registerPlanetBefore.setVisibility(View.INVISIBLE)
        }
    }

    private fun showHideValue(show: Boolean) {
        if (show) {
            binding.registerValueTxt.setVisibility(View.VISIBLE)
        } else {
            binding.registerValueTxt.setVisibility(View.GONE)
        }
    }
    private fun showHideEmotionalCard(show: Boolean) {
        if(show) dialogEmotions.show() else dialogEmotions.dismiss()

    }
    private fun showHideExerciseCard(show: Boolean) {
        if(show) dialogExercises.show() else dialogExercises.dismiss()
    }


    private fun setOnClickListeners(){
        //counter = 0
        binding.registerNextIv.setOnClickListener {
            if(counter < 2 || counter == 2){
                presenter.checkValue(binding.registerValueTxt.text.toString().toFloat())
                counter ++
            }
            presenter.nextLoad()
        }
        binding.registerPrevIv.setOnClickListener {
            presenter.prevLoad()
            counter --
        }
        binding.registerAgainIv.setOnClickListener {
            presenter.backLoad() }
        binding.registerCompletedIv.setOnClickListener {
            presenter.finishLoad() }
        binding.registerComentario.setOnClickListener { createDialogComment() }
        binding.registerTimeTxt.setOnClickListener { presenter.showTimeDialog(supportFragmentManager, this) }
        binding.registerDateTxt.setOnClickListener { presenter.showDateDialog(supportFragmentManager, this) }
        binding.registerValueTxt.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                presenter.checkValue(binding.registerValueTxt.text.toString().toFloat())
                counter ++
            }
            false
        }
        binding.registerEmotionalImg.setOnClickListener{showHideEmotionalCard(true)}
        binding.registerExerciseImg.setOnClickListener{showHideExerciseCard(true)}
        binding.registerImgLy.setOnClickListener { presenter.showChooser() }
    }

    private fun setInitView(){
        binding.registerType.text = getString(R.string.register_glucemia_label)
        binding.registerUnidadTv.setText(R.string.register_gluc_unidad_label)
        binding.registerPlanet.setImageResource(R.drawable.planet_glucemia)
        binding.registerValueTxt.isEnabled = true
        showHideExercise(false)
        showHideEmotional(false)
        showHidePlanet(true)
        presenter.initChooser(this)

    }


    override fun setDateMedition(date: Date, medition: Int, categories: List<Category>) {

        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedDate = formatter.format(date)
        val formattedTime = formatterTime.format(date)
        binding.registerTimeTxt.text = formattedTime
        binding.registerDateTxt.text = formattedDate
        adapter.setPowerView(binding.registerMedTxt)
        binding.registerMedTxt.setSpinnerAdapter(adapter)
        binding.registerMedTxt.getSpinnerRecyclerView().layoutManager = manager
        binding.registerMedTxt.setItems(categories)
        binding.registerMedTxt.selectItemByIndex(medition-1)
        binding.registerMedTxt.setOnSpinnerItemSelectedListener<Category> { oldIndex, oldItem, newIndex, newItem ->  // original " position, item -> "
            if (newItem != null) {
                presenter.setMedition(newItem.cate_id)
            }
            //presenter.setMedition(newItem?.cate_id?.let { presenter.setMedition(it) }) // original era "(item.cate_id)"
            Toast.makeText(this, getString(R.string.register_category_warning),Toast.LENGTH_SHORT).show()
        }
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
        dialog.setOnDismissListener { presenter.goToActivityDaily() }
        dialog.show()
    }
    private fun createDialogComment(){
        val view = DialogComentaryBinding.inflate(layoutInflater)
        val builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setView(view.root)
        dialogComment = builder.create()
        dialogComment.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        view.comentarySave.setOnClickListener{
            presenter.saveComment(view.comentaryValue.text.toString())
            binding.registerComentarioTv.text = view.comentaryValue.text.toString()
            dialogComment.dismiss()
        }
        dialogComment.show()
    }
    override fun setEmotional(item: RegisterItem) {
        binding.registerEmotionalImg.visibility = View.VISIBLE
        binding.registerEmotionalImg.setImageDrawable(getDrawable(item.image))
        binding.registerEmotionalTv.text = getLabel(item.name)
        showHideEmotionalCard(false)
    }

    override fun setExercise(item: RegisterItem) {
        binding.registerExerciseImg.visibility = View.VISIBLE
        binding.registerExerciseImg.setImageDrawable(getDrawable(item.image))
        binding.registerExercicesTv.text = getLabel(item.name)
        showHideExerciseCard(false)
    }

    override fun setExercicesData(items: List<RegisterItem>) {
        val view = DialogEmotionsBinding.inflate(layoutInflater)
        val builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setView(view.root)
        dialogExercises = builder.create()
        dialogExercises.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        adapterExercices.setData(items,2)
        view.emotionsTitle.text = getString(R.string.register_new_activity_txt)
        view.emotionsList.layoutManager = managerExercices
        view.emotionsList.adapter = adapterExercices
        view.emotionsCancel.setOnClickListener{
            dialogExercises.dismiss()
        }
    }

    override fun setEmotionsData(items: List<RegisterItem>) {
        val view = DialogEmotionsBinding.inflate(layoutInflater)
        val builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setView(view.root)
        dialogEmotions = builder.create()
        dialogEmotions.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        adapterEmotions.setData(items,1)
        view.emotionsList.layoutManager = managerEmotions
        view.emotionsList.adapter = adapterEmotions
        view.emotionsCancel.setOnClickListener{
            dialogEmotions.dismiss()
        }
    }

    override fun setTime(value: Date, medition: Int) {
        binding.registerMedTxt.selectItemByIndex(medition-1)
        val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedTime = formatterTime.format(value)
        binding.registerTimeTxt.text = formattedTime
        Toast.makeText(this, getString(R.string.register_time_warning),Toast.LENGTH_SHORT).show()
    }

    override fun setDate(value: Date) {
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formattedDate = formatter.format(value)
        binding.registerDateTxt.text = formattedDate
        Toast.makeText(this, getString(R.string.register_date_warning),Toast.LENGTH_SHORT).show()

    }
    override fun onTimeSet(view: TimePickerDialog?, hourOfDay: Int, minute: Int, second: Int) {
        presenter.setTime(hourOfDay,minute)
    }

    override fun onDateSet(view: DatePickerDialog?, year: Int, monthOfYear: Int, dayOfMonth: Int) {
        presenter.setDate(year, monthOfYear+1, dayOfMonth)
    }


    override fun setImage(image: String) {
        Glide.with(this).load(image).into(binding.registerImgIv)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        presenter.onActivityResult(requestCode, resultCode, data)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        presenter.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun openDailyActivity() {
        val intent = Intent(this, DailyActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun openStatisticActivity() {
        finish()
    }

    override fun openTreatmentActivity() {
        val intent = Intent(this, TreatmentActivity::class.java)
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

    override fun getDrawable(name: String): Drawable? {
        return getDrawable(resIdByName(name, "drawable"))
    }

    override fun setDialogValue(type: Int, id: String) {
        when(type){
            1 -> presenter.setEmocional(id)
            2 -> presenter.setExercises(id)
        }
    }

    fun menuListeners(){
         binding.home.setOnClickListener { presenter.goToActivityMain() }
         binding.statistics.setOnClickListener { presenter.goToActivityStatistic() }
         binding.dailyRegister.setOnClickListener { presenter.goToActivityDaily() }
         binding.treament.setOnClickListener { presenter.goToActivityTreament() }

    }

}
