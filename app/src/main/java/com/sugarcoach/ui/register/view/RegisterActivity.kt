package com.sugarcoach.ui.register.view

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.sugarcoach.R
import com.sugarcoach.data.database.repository.dailyregister.Category
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.ui.base.view.BaseActivity
import com.sugarcoach.ui.daily.view.DailyActivity
import com.sugarcoach.ui.main.view.MainActivity
import com.sugarcoach.ui.register.interactor.RegisterInteractorImp
import com.sugarcoach.ui.register.presenter.RegisterPresenterImp
import com.sugarcoach.ui.treatment.view.TreatmentActivity
import com.sugarcoach.util.AppConstants
import com.sugarcoach.util.extensions.resIdByName
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.dialog_comentary.view.*
import kotlinx.android.synthetic.main.dialog_congratulation.view.*
import kotlinx.android.synthetic.main.dialog_emotions.view.*
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


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

    var enable:Boolean = true



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        presenter.onAttach(this)
        setOnClickListeners()
        setInitView()
        menuListeners()

    }

    override fun onDestroy() {
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

    override fun showErrorToast() {
        Toast.makeText(this, getString(R.string.login_failure), Toast.LENGTH_LONG).show()
    }

    override fun nextLoad(type: Int,value: Float?, position: String?) {
        when (type) {
            1 -> {
                register_value_txt.setText("")
                value?.let { if(it > 0) register_value_txt.setText(value.toInt().toString()) }
                register_type.setText(R.string.register_insulina_label)
                register_unidad_tv.setText(R.string.register_basal_unidad_label)
                register_planet.setImageResource(R.drawable.planet_insulina)
                register_planet_before.setImageResource(R.drawable.planet_glucemia)
                register_planet_after.setImageResource(R.drawable.planet_carbohidratos)
                register_dots.setDotSelection(1)
                register_emotional_tv.visibility = View.GONE
                register_exercices_tv.visibility = View.GONE
                register_unidad_tv.visibility = View.VISIBLE
                showHideExercise(false)
                showHideEmotional(false)
                showHideValue(true)
                showHideImgCar(false)
                showHideComentario(true)
                showHidePrev(true)
                showHideNext(true)

            }
            2 -> {
                register_value_txt.setText("")
                value?.let { if(it > 0) register_value_txt.setText(value.toString()) }
                register_type.setText(R.string.register_carbohidratos_label)
                register_unidad_tv.setText(R.string.register_car_unidad_label)
                register_emotional_tv.visibility = View.GONE
                register_exercices_tv.visibility = View.GONE
                register_unidad_tv.visibility = View.VISIBLE
                register_dots.setDotSelection(2)
                register_planet.setImageResource(R.drawable.planet_carbohidratos)
                register_planet_before.setImageResource(R.drawable.planet_insulina)
                register_planet_after.setImageResource(R.drawable.planet_actividad)
                showHideExercise(false)
                showHideEmotional(false)
                showHideValue(true)
                showHideImgCar(true)
                showHideComentario(false)
                showHidePrev(true)
                showHideNext(true)

            }
            3 -> {
                register_planet.setImageResource(R.drawable.planet_actividad)
                register_planet_before.setImageResource(R.drawable.planet_carbohidratos)
                register_planet_after.setImageResource(R.drawable.planet_estado)
                register_value_txt.setText("")
                register_dots.setDotSelection(3)
                register_emotional_tv.visibility = View.GONE
                register_exercices_tv.visibility = View.VISIBLE
                register_unidad_tv.visibility = View.GONE
                register_value_txt.isEnabled = false
                showHideExercise(true)
                showHideEmotional(false)
                showHideValue(false)
                showHideImgCar(false)
                showHideComentario(false)
                showHidePrev(true)
                showHideNext(true)


            }
            4 -> {
                register_value_txt.setText("")
                register_dots.setDotSelection(4)
                register_emotional_tv.visibility = View.VISIBLE
                register_exercices_tv.visibility = View.GONE
                register_unidad_tv.visibility = View.GONE
                register_value_txt.isEnabled = false
                register_planet.setImageResource(R.drawable.planet_estado)
                register_planet_before.setImageResource(R.drawable.planet_actividad)
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
                register_type.setText(R.string.register_glucemia_label)
                register_unidad_tv.setText(R.string.register_gluc_unidad_label)
                register_dots.setDotSelection(0)
                register_planet.setImageResource(R.drawable.planet_glucemia)
                register_planet_after.setImageResource(R.drawable.planet_insulina)
                register_value_txt.isEnabled = true
                register_emotional_tv.visibility = View.GONE
                register_exercices_tv.visibility = View.GONE
                register_unidad_tv.visibility = View.VISIBLE
                register_value_txt.setText("")
                value?.let { if(it > 0) register_value_txt.setText(value.toInt().toString()) }
                showHideExercise(false)
                showHideEmotional(false)
                showHideValue(true)
                showHideComentario(false)
                showHideImgCar(false)
                showHidePrev(false)
                showHideNext(true)
            }
            1 -> {
                register_type.setText(R.string.register_insulina_label)
                register_unidad_tv.setText(R.string.register_basal_unidad_label)
                register_dots.setDotSelection(1)
                register_planet.setImageResource(R.drawable.planet_insulina)
                register_planet_before.setImageResource(R.drawable.planet_glucemia)
                register_planet_after.setImageResource(R.drawable.planet_carbohidratos)
                register_value_txt.isEnabled = true
                register_emotional_tv.visibility = View.GONE
                register_exercices_tv.visibility = View.GONE
                register_unidad_tv.visibility = View.VISIBLE
                register_value_txt.setText("")
                value?.let { if(it > 0) register_value_txt.setText(value.toString()) }
                showHideExercise(false)
                showHideEmotional(false)
                showHideValue(true)
                showHideComentario(true)
                showHideImgCar(false)
                showHidePrev(true)
                showHideNext(true)
            }
            2 -> {
                register_type.setText(R.string.register_carbohidratos_label)
                register_dots.setDotSelection(2)
                register_planet.setImageResource(R.drawable.planet_carbohidratos)
                register_planet_before.setImageResource(R.drawable.planet_insulina)
                register_planet_after.setImageResource(R.drawable.planet_actividad)
                register_unidad_tv.setText(R.string.register_car_unidad_label)
                register_value_txt.isEnabled = true
                register_emotional_tv.visibility = View.GONE
                register_exercices_tv.visibility = View.GONE
                register_unidad_tv.visibility = View.VISIBLE
                value?.let { if(it > 0) register_value_txt.setText(value.toString()) }
                showHideExercise(false)
                showHideEmotional(false)
                showHideValue(true)
                showHideComentario(false)
                showHideImgCar(true)
                showHidePrev(true)
                showHideNext(true)

            }
            3 -> {
                register_planet.setImageResource(R.drawable.planet_actividad)
                register_planet_before.setImageResource(R.drawable.planet_carbohidratos)
                register_planet_after.setImageResource(R.drawable.planet_estado)
                register_emotional_tv.visibility = View.GONE
                register_exercices_tv.visibility = View.VISIBLE
                register_unidad_tv.visibility = View.GONE
                register_value_txt.setText("")
                register_dots.setDotSelection(3)
                register_value_txt.isEnabled = false
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

    override fun finishLoad() {
        createDialogCongratulation()
    }

    override fun backLoad() {
        finish()
    }

    override fun getUserData(user: User) {
        this.user = user
        register_username_txt.setText(user.username)
        register_pts_txt.setText(user.points)
        register_level_txt.setText(user.level)
        user.avatar?.let {
            register_userimg_iv.setImageDrawable(getDrawable(resIdByName(it, "drawable")))
        }
    }


    private fun showHidePlanet(show: Boolean) {
        if (show)
            register_planet.visibility = View.VISIBLE
        else
            register_planet.visibility = View.GONE

    }

    private fun showHideEmotional(show: Boolean) {
        if (show) {
            register_type.setText(R.string.register_emotional_label)
            register_emotional_img.visibility = View.VISIBLE
        }
        else {
            register_emotional_img.visibility = View.GONE
        }

    }

    private fun showHideExercise(show: Boolean) {
        if (show) {
            register_type.setText(R.string.register_exercises_label)
            register_exercise_img.visibility = View.VISIBLE
        }
        else {
            register_exercise_img.visibility = View.GONE
        }

    }

    private fun showHideImgCar(show: Boolean) {
        if (show) {
            register_img_ly.visibility = View.VISIBLE
        }
        else {
            register_img_ly.visibility = View.GONE
        }

    }

    private fun showHideComentario(show: Boolean) {
        if (show) {
            register_comentario.visibility = View.VISIBLE
        }
        else {
            register_comentario.visibility = View.GONE
        }

    }

    private fun showHideNext(show: Boolean) {
        if (show) {
            register_next_iv.visibility = View.VISIBLE
            register_planet_after.visibility = View.VISIBLE
        }
        else {
            register_next_iv.visibility = View.INVISIBLE
            register_planet_after.visibility = View.INVISIBLE
        }

    }

    private fun showHidePrev(show: Boolean) {
        if (show) {
            register_prev_iv.visibility = View.VISIBLE
            register_planet_before.visibility = View.VISIBLE
        }
        else {
            register_prev_iv.visibility = View.INVISIBLE
            register_planet_before.visibility = View.INVISIBLE
        }

    }
    private fun showHideValue(show: Boolean) {
        if (show) {
            register_value_txt.visibility = View.VISIBLE
        }
        else {
            register_value_txt.visibility = View.GONE
        }

    }
    private fun showHideEmotionalCard(show: Boolean) {
        if(show) dialogEmotions.show() else dialogEmotions.dismiss()

    }
    private fun showHideExerciseCard(show: Boolean) {
        if(show) dialogExercises.show() else dialogExercises.dismiss()
    }


    private fun setOnClickListeners(){

        register_next_iv.setOnClickListener {
            presenter.nextLoad()
        }
        register_prev_iv.setOnClickListener {
            presenter.prevLoad() }
        register_again_iv.setOnClickListener {
            presenter.backLoad() }
        register_completed_iv.setOnClickListener {
            if(enable)
            {
                presenter.finishLoad()
            }
            else{
                Toast.makeText(this, getString(R.string.time_future_warning),Toast.LENGTH_SHORT).show()
            }
        }
        register_comentario.setOnClickListener { createDialogComment() }
        register_time_txt.setOnClickListener { presenter.showTimeDialog(supportFragmentManager, this) }
        register_date_txt.setOnClickListener { presenter.showDateDialog(supportFragmentManager, this) }
        register_value_txt.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                var value =register_value_txt.text.toString().replace(",",".")
                presenter.checkValue(value.toFloat())
            }
            false
        }
        register_emotional_img.setOnClickListener{showHideEmotionalCard(true)}
        register_exercise_img.setOnClickListener{showHideExerciseCard(true)}
        register_img_ly.setOnClickListener { presenter.showChooser() }
    }

    private fun setInitView(){
        register_type.text = getString(R.string.register_glucemia_label)
        register_unidad_tv.setText(R.string.register_gluc_unidad_label)
        register_planet.setImageResource(R.drawable.planet_glucemia)
        register_value_txt.isEnabled = true
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
        register_time_txt.text = formattedTime
        register_date_txt.text = formattedDate
        adapter.setPowerView(register_med_txt)
        register_med_txt.setSpinnerAdapter(adapter)
        register_med_txt.getSpinnerRecyclerView().layoutManager = manager
        register_med_txt.setItems(categories)
        register_med_txt.selectItemByIndex(medition-1)
        register_med_txt.setOnSpinnerItemSelectedListener<Category> { position, item ->
            presenter.setMedition(item.cate_id)
            Toast.makeText(this, getString(R.string.register_category_warning),Toast.LENGTH_SHORT).show()
        }
    }

    private fun createDialogCongratulation(){
        val view = LayoutInflater.from(this).inflate(R.layout.dialog_congratulation, null)
        val builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setView(view)
        dialog = builder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        view.congratulation_pts_txt.text = "+100"

        val totalPoints = user.points!!.toInt() + Integer.valueOf(view.congratulation_pts_txt.text.toString())
        var level = user.level

        view.congratulation_pts_total_txt.text = totalPoints.toString()

        when
        {
            totalPoints > 1850 -> {level = "Space Cadet"}

            totalPoints > 3700 -> {level = "Rocket Captain"}

            totalPoints > 7400 -> {level = "Startrek Voyayer"}

            totalPoints > 14800 -> {level = "Future Traveller"}

            totalPoints > 29600 -> {level = "Quarks Master "}
        }
        presenter.updateUser(totalPoints.toString(), level)

        user.avatar?.let {
            view.congratulation_avatar.setImageDrawable(getDrawable(resIdByName(it, "drawable")))
        }
        view.congratulation_close.setOnClickListener { dialog.dismiss() }
        dialog.setOnDismissListener { presenter.goToActivityDaily() }
        dialog.show()

    }
    private fun createDialogComment(){
        val view = LayoutInflater.from(this).inflate(R.layout.dialog_comentary, null)
        val builder = AlertDialog.Builder(this)
        builder.setView(view)
        dialogComment = builder.create()
        dialogComment.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        view.comentary_save.setOnClickListener{
            presenter.saveComment(view.comentary_value.text.toString())
            dialogComment.dismiss()
        }
        dialogComment.show()
    }
    override fun setEmotional(item: RegisterItem) {
        register_emotional_img.visibility = View.VISIBLE
        register_emotional_img.setImageDrawable(getDrawable(item.image))
        register_emotional_tv.text = getLabel(item.name)
        showHideEmotionalCard(false)
    }

    override fun setExercise(item: RegisterItem) {
        register_exercise_img.visibility = View.VISIBLE
        register_exercise_img.setImageDrawable(getDrawable(item.image))
        register_exercices_tv.text = getLabel(item.name)
        showHideExerciseCard(false)
    }

    override fun setExercicesData(items: List<RegisterItem>) {
        val view = LayoutInflater.from(this).inflate(R.layout.dialog_emotions, null)
        val builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setView(view)
        dialogExercises = builder.create()
        dialogExercises.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        adapterExercices.setData(items,2)
        view.emotions_title.text = getString(R.string.register_new_activity_txt)
        view.emotions_list.layoutManager = managerExercices
        view.emotions_list.adapter = adapterExercices
        view.emotions_cancel.setOnClickListener{
            dialogExercises.dismiss()
        }
    }

    override fun setEmotionsData(items: List<RegisterItem>) {
        val view = LayoutInflater.from(this).inflate(R.layout.dialog_emotions, null)
        val builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setView(view)
        dialogEmotions = builder.create()
        dialogEmotions.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        adapterEmotions.setData(items,1)
        view.emotions_list.layoutManager = managerEmotions
        view.emotions_list.adapter = adapterEmotions
        view.emotions_cancel.setOnClickListener{
            dialogEmotions.dismiss()
        }
    }

    override fun setTime(value: Date, medition: Int) {
        register_med_txt.selectItemByIndex(medition-1)
        val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedTime = formatterTime.format(value)
        val parser = SimpleDateFormat("dd.MM.YYYY HH:mm:ss.SSS", Locale.getDefault())
        val date = parser.format(value)
        val currentDate = SimpleDateFormat("dd.MM.YYYY HH:mm:ss.SSS", Locale.getDefault()).format(Date())
        if(date > currentDate)
        {
            enable= false
            register_time_txt.text = formattedTime
            Toast.makeText(this, getString(R.string.register_time_future),Toast.LENGTH_SHORT).show()
        }
        else {
            enable = true
            register_time_txt.text = formattedTime
            Toast.makeText(this, getString(R.string.register_time_warning),Toast.LENGTH_SHORT).show()
        }
    }

    override fun setDate(value: Date) {
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formattedDate = formatter.format(value)
        register_date_txt.text = formattedDate
        Toast.makeText(this, getString(R.string.register_date_warning),Toast.LENGTH_SHORT).show()

    }
    override fun onTimeSet(view: TimePickerDialog?, hourOfDay: Int, minute: Int, second: Int) {
        presenter.setTime(hourOfDay,minute)
    }

    override fun onDateSet(view: DatePickerDialog?, year: Int, monthOfYear: Int, dayOfMonth: Int) {
        presenter.setDate(year, monthOfYear+1, dayOfMonth)
    }


    override fun setImage(image: String) {
        Glide.with(this).load(image).into(register_img_iv)
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
         home.setOnClickListener { presenter.goToActivityMain() }
         statistics.setOnClickListener { presenter.goToActivityStatistic() }
         dailyRegister.setOnClickListener { presenter.goToActivityDaily() }
         treament.setOnClickListener { presenter.goToActivityTreament() }

    }

}
