package com.sugarcoach.ui.daily_detail.view

import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aminography.choosephotohelper.ChoosePhotoHelper
import com.bumptech.glide.Glide
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.sugarcoach.R
import com.sugarcoach.data.database.repository.dailyregister.Category
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.ui.base.view.BaseActivity
import com.sugarcoach.ui.daily.interactor.DailyInteractorImp
import com.sugarcoach.ui.daily.presenter.DailyPresenterImp
import com.sugarcoach.ui.daily.view.DailyActivity
import com.sugarcoach.ui.daily_detail.interactor.DailyDetailInteractorImp
import com.sugarcoach.ui.daily_detail.presenter.DailyDetailPresenter
import com.sugarcoach.ui.main.view.MainActivity
import com.sugarcoach.ui.register.view.RegisterActivity
import com.sugarcoach.ui.statistics.view.StatisticsActivity
import com.sugarcoach.ui.treatment.view.BasalItem
import com.sugarcoach.ui.treatment.view.TreatmentActivity
import com.sugarcoach.util.extensions.resIdByName
import com.sugarcoach.util.extensions.showKeyboard
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
import kotlinx.android.synthetic.main.activity_daily.*
import kotlinx.android.synthetic.main.activity_daily.daily_date_txt
import kotlinx.android.synthetic.main.activity_daily.daily_time_txt
import kotlinx.android.synthetic.main.activity_daily_detail.*
import kotlinx.android.synthetic.main.dialog_category.view.*
import kotlinx.android.synthetic.main.dialog_comentary.view.*
import kotlinx.android.synthetic.main.dialog_config_delete.view.*
import kotlinx.android.synthetic.main.dialog_emotions.view.*
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


class DailyDetailActivity : BaseActivity(), DailyDetailView, TimePickerDialog.OnTimeSetListener, DatePickerDialog.OnDateSetListener  {

    @Inject
    lateinit var presenter: DailyDetailPresenter<DailyDetailView, DailyDetailInteractorImp>

    @Inject
    lateinit var manager: LinearLayoutManager

    @Inject
    lateinit var adapter: CategoryAdapter


    @Inject
    lateinit var managerEmotions: LinearLayoutManager

    @Inject
    lateinit var managerExercices: LinearLayoutManager

    @Inject
    lateinit var adapterEmotions: ItemAdapter

    @Inject
    lateinit var adapterExercices: ItemAdapter


    lateinit var dialogEmotions: AlertDialog

    lateinit var dialogExercises: AlertDialog
    lateinit var dialogComment: AlertDialog

    var isEdit = false
    var id: Int? = null
    var daily: DailyRegister? = null
    var isFabOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily_detail)
        presenter.onAttach(this)
        enableViews()
        setListeners()
        presenter.initChooser(this)
        id = intent.extras!!.getInt("id")
        menuListeners()

    }

   override fun init(){
        presenter.getRegister(id!!.toInt())
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun showSuccessToast() {
        Toast.makeText(this, getString(R.string.delete_success), Toast.LENGTH_LONG).show()
        finish()

    }

    override fun showErrorToast() {
        Toast.makeText(this, getString(R.string.login_failure), Toast.LENGTH_LONG).show()
        hideProgress()
    }

    override fun showSuccessToastUpdate() {
        Toast.makeText(this, getString(R.string.update_success), Toast.LENGTH_LONG).show()

    }

    override fun getData(daily: DailyRegister) {
        this.daily = daily
        daily_detail_gluc_tv.setText(daily.glucose.toString())
        daily_detail_gluc_tv.setTextColor(ContextCompat.getColor(this, presenter.getColorType(daily.glucose!!)))
        daily_detail_insul.setText(daily.insulin.toString())
        daily_detail_car.setText(daily.carbohydrates.toString())
        daily_detail_basal.setText(daily.basal.toString())
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedDate = formatter.format(daily.created)
        val formattedTime = formatterTime.format(daily.created)
        daily_detail_time_tv.text =(formattedTime)
        daily_detail_date_tv.text = (formattedDate)
        daily_detail_img_empty_ll.visibility = View.VISIBLE
        daily_detail_img.visibility = View.GONE
        daily.photo?.let {
            if(it.isNotEmpty()) {
                daily_detail_img_empty_ll.visibility = View.GONE
                daily_detail_img.visibility = View.VISIBLE
                Glide.with(this).load(it).into(daily_detail_img)
            }
        }
    }
    private fun createDialogComment(){
        val view = LayoutInflater.from(this).inflate(R.layout.dialog_comentary, null)
        val builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setView(view)
        dialogComment = builder.create()
        dialogComment.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        view.comentary_save.setOnClickListener{
            presenter.saveComment(view.comentary_value.text.toString())
            daily_detail_comment.text = view.comentary_value.text.toString()
            dialogComment.dismiss()
        }
        dialogComment.show()
    }
    fun setListeners(){
        daily_detail_emotional_ll.setOnClickListener {
            showHideEmotionalCard(true)

        }
        daily_detail_exercises_ll.setOnClickListener {
            showHideExerciseCard(true)

        }
        daily_detail_comment_ll.setOnClickListener {
            createDialogComment()
        }
        daily_detail_time_tv.setOnClickListener {
            presenter.showTimeDialog(supportFragmentManager, this) }
        daily_detail_date_tv.setOnClickListener { presenter.showDateDialog(supportFragmentManager, this) }
        daily_detail_gluc_tv.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                presenter.updateGlucose(daily_detail_gluc_tv.text.toString().toFloat())
            }
            false
        }
        daily_detail_insul.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                presenter.updateInsulin(daily_detail_insul.text.toString().toFloat())
            }
            false
        }
        daily_detail_car.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                presenter.updateCarb(daily_detail_car.text.toString().toFloat())
            }
            false
        }
        daily_detail_basal.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                presenter.updateBasal(daily_detail_basal.text.toString().toFloat())
            }
            false
        }
        daily_detail_img.setOnClickListener { presenter.showChooser() }
        daily_detail_img_empty_ll.setOnClickListener { presenter.showChooser() }
        daily_detail_edit.setOnClickListener {
            hideMenu()
            isEdit = true
            enableViews()
        }
        daily_detail_delete.setOnClickListener {
            hideMenu()
            dialogDelete()
        }
        daily_detail_shared.setOnClickListener {
            hideMenu()
            presenter.getScreenShot(this, daily_detail_ll)
        }
        daily_menu.setOnClickListener{
            if (isFabOpen){
                hideMenu()
            }else{
                showMenu()
            }
        }

    }

    fun showMenu(){
        isFabOpen = true
        daily_menu.setImageResource(R.drawable.cancel)
        daily_detail_edit.visibility = View.VISIBLE
        daily_detail_shared.visibility = View.VISIBLE
        daily_detail_delete.visibility = View.VISIBLE
    }

    fun hideMenu(){
        isFabOpen = false
        daily_menu.setImageResource(R.drawable.ic_hand)
        daily_detail_edit.visibility = View.GONE
        daily_detail_shared.visibility = View.GONE
        daily_detail_delete.visibility = View.GONE
    }

    override fun setEmotional(item: DailyItem) {
        showHideEmotionalCard(false)
        daily_detail_emotional_tv.text = (getLabel(item.name))
        daily_detail_emotional.setImageDrawable(getDrawable(item.image))
    }

    override fun setExercise(item: DailyItem) {
        showHideExerciseCard(false)
        daily_detail_exercises_tv.text = (getLabel(item.name))
        daily_detail_exercises.setImageDrawable(getDrawable(item.image))
    }


    override fun setDateMedition(date: Date) {
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedDate = formatter.format(date)
        val formattedTime = formatterTime.format(date)
        daily_time_txt.setText(formattedTime)
        daily_date_txt.setText(formattedDate)
    }

    override fun enableViews() {
        daily_detail_gluc_tv.isEnabled = isEdit
        daily_detail_insul.isEnabled = isEdit
        daily_detail_car.isEnabled = isEdit
        daily_detail_category_tv.isEnabled = isEdit
        daily_detail_time_tv.isEnabled = isEdit
        daily_detail_date_tv.isEnabled = isEdit
        daily_detail_exercises_ll.isEnabled = isEdit
        daily_detail_emotional_ll.isEnabled = isEdit
        daily_detail_img_empty_ll.isEnabled = isEdit
        daily_detail_basal.isEnabled = isEdit
        daily_detail_img.isEnabled = isEdit
        daily_detail_comment_ll.isEnabled = isEdit
        if (isEdit){
            daily_detail_gluc_tv.requestFocus()
            daily_detail_gluc_tv.showKeyboard()
        }

    }

    override fun setTime(value: Date) {
        val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedTime = formatterTime.format(value)
        daily_detail_time_tv.text = formattedTime
    }

    override fun setDate(value: Date) {
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formattedDate = formatter.format(value)
        daily_detail_date_tv.text = formattedDate

    }
    override fun onTimeSet(view: TimePickerDialog?, hourOfDay: Int, minute: Int, second: Int) {
        presenter.setTime(hourOfDay,minute)
    }

    override fun onDateSet(view: DatePickerDialog?, year: Int, monthOfYear: Int, dayOfMonth: Int) {
        presenter.setDate(year, monthOfYear, dayOfMonth)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        presenter.onActivityResult(requestCode, resultCode, data)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        presenter.onRequestPermissionsResult(this, requestCode, permissions, grantResults)
    }

    override fun setImage(image: String) {
        Glide.with(this).load(image).into(daily_detail_img)
        daily_detail_img_empty_ll.visibility = View.GONE
        daily_detail_img.visibility = View.VISIBLE

    }

    override fun showDialogOK(message: String) {
        AlertDialog.Builder(this)
            .setMessage(message)
            .setPositiveButton(getString(R.string.daily_detail_accept), DialogInterface.OnClickListener { dialog, which ->  presenter.checkAndRequestPermissions(this)} )
            .setNegativeButton(getString(R.string.daily_detail_cancel), DialogInterface.OnClickListener { dialog, which ->
                dialog.dismiss()
                finish()
            })
            .create()
            .show()
    }

    override fun explain(msg: Int) {
        val dialog = AlertDialog.Builder(this)
        dialog.setMessage(msg)
            .setPositiveButton(getString(R.string.daily_detail_accept)) { paramDialogInterface, paramInt ->
                var intent: Intent
                if (android.os.Build.VERSION.SDK_INT >= 9) {
                    /* on 2.3 and newer, use APPLICATION_DETAILS_SETTINGS with proper URI */
                    var packageURI = Uri.parse("package:" + packageName);
                    intent = Intent("android.settings.APPLICATION_DETAILS_SETTINGS", packageURI);
                    startActivity(intent);
                }  else  {
                    /* on older Androids, use trick to show app details */
                    intent = Intent(Intent.ACTION_VIEW);
                    intent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
                    intent.putExtra("com.android.settings.ApplicationPkgName", packageName);
                    intent.putExtra("pkg", packageName);
                    startActivity(intent);
                }
            }
            .setNegativeButton(getString(R.string.daily_detail_cancel)) { paramDialogInterface, paramInt -> finish() }
        dialog.show()
    }

    override fun setCategories(categories: List<Category>, index: Int) {
        adapter.setPowerView(daily_detail_category_tv)
        daily_detail_category_tv.setSpinnerAdapter(adapter)
        daily_detail_category_tv.getSpinnerRecyclerView().layoutManager = manager
        daily_detail_category_tv.setItems(categories)
        daily_detail_category_tv.selectItemByIndex(index-1)
        daily_detail_category_tv.setOnSpinnerItemSelectedListener<Category> { position, item ->
            presenter.updateLabel(item.cate_id)
            Toast.makeText(this, getString(R.string.register_category_warning),Toast.LENGTH_SHORT).show()
        }
    }
    private fun showHideEmotionalCard(show: Boolean) {
        if(show) dialogEmotions.show() else dialogEmotions.dismiss()

    }
    private fun showHideExerciseCard(show: Boolean) {
        if(show) dialogExercises.show() else dialogExercises.dismiss()
    }

    override fun sharedScreenShot(uri: Uri) {
        val shareIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_STREAM, uri)
            type = "image/jpeg"
        }
        startActivity(Intent.createChooser(shareIntent, resources.getText(R.string.daily_detail_share)))
    }

    fun dialogDelete() {
        val view = LayoutInflater.from(this).inflate(R.layout.dialog_config_delete, null)
        val builder = AlertDialog.Builder(this)
        builder.setView(view)
        dialog = builder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        view.delete_accept.setOnClickListener {
            presenter.deleteRegister(daily!!)
            dialog.dismiss()
        }
        view.delete_cancel.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

    override fun setExercicesData(items: List<DailyItem>) {
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

    override fun setEmotionsData(items: List<DailyItem>) {
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


    override fun openTreamentActivity() {
        val intent = Intent(this, TreatmentActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun openStatisticActivity() {
        val intent = Intent(this, StatisticsActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun openRegisterActivity() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        finish()
    }

    fun menuListeners(){
        home.setOnClickListener { presenter.goToActivityMain() }
        statistics.setOnClickListener { presenter.goToActivityStatistic() }
        tratamiento.setOnClickListener { presenter.goToActivityTreament() }
        register.setOnClickListener { presenter.goToActivityRegister() }
    }

    override fun getLabel(name: String): String {
        return getString(resIdByName(name, "string"))
    }

    override fun getDrawable(name: String): Drawable? {
        return getDrawable(resIdByName(name, "drawable"))
    }


    override fun mirrorAccount() {
        daily_detail_edit.visibility = View.INVISIBLE
        daily_detail_delete.visibility = View.INVISIBLE
        register.isEnabled = false
    }

}
