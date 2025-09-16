package com.sugarcoachpremium.ui.daily_detail.view

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.sugarcoachpremium.R
import com.sugarcoachpremium.data.database.repository.dailyregister.Category
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister
import com.sugarcoachpremium.databinding.ActivityDailyDetailBinding
import com.sugarcoachpremium.databinding.DialogComentaryBinding
import com.sugarcoachpremium.databinding.DialogConfigDeleteBinding
import com.sugarcoachpremium.databinding.DialogEmotionsBinding
import com.sugarcoachpremium.databinding.DialogTreatmentSaveBinding
import com.sugarcoachpremium.ui.base.view.BaseActivity
import com.sugarcoachpremium.ui.daily_detail.interactor.DailyDetailInteractorImp
import com.sugarcoachpremium.ui.daily_detail.presenter.DailyDetailPresenter
import com.sugarcoachpremium.ui.main.view.MainActivity
import com.sugarcoachpremium.ui.register.view.RegisterActivity
import com.sugarcoachpremium.ui.statistics.view.StatisticsActivity
import com.sugarcoachpremium.ui.treatment.view.TreatmentActivity
import com.sugarcoachpremium.util.extensions.resIdByName
import com.sugarcoachpremium.util.extensions.showKeyboard
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
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

    lateinit var binding: ActivityDailyDetailBinding

    var isEdit = false
    var id: Int? = null
    var daily: DailyRegister? = null
    var isFabOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDailyDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.onAttach(this)
        enableViews()
        setListeners()
        presenter.initChooser(this)
        id = intent.extras!!.getInt("id")
        menuListeners()

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                dialogSave()
            }
        })

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

    override fun showErrorToast(msg:String) {
        Toast.makeText(this, getString(R.string.login_failure), Toast.LENGTH_LONG).show()
        hideProgress()
    }

    override fun showSuccessToastUpdate() {
        Toast.makeText(this, getString(R.string.update_success), Toast.LENGTH_LONG).show()

    }

    override fun getData(daily: DailyRegister) {
        binding.dailyDetailGlucTv.text = Editable.Factory.getInstance().newEditable(daily.glucose.toString())
        binding.dailyDetailGlucTv.setTextColor(ContextCompat.getColor(this, presenter.getColorType(daily.glucose!!)))
        binding.dailyDetailInsul.text = Editable.Factory.getInstance().newEditable(daily.insulin.toString())
        binding.dailyDetailCar.text = Editable.Factory.getInstance().newEditable(daily.carbohydrates.toString())
        binding.dailyDetailBasal.text = Editable.Factory.getInstance().newEditable(daily.basal.toString())
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedDate = formatter.format(daily.created)
        val formattedTime = formatterTime.format(daily.created)
        binding.dailyDetailTimeTv.text = formattedTime
        binding.dailyDetailDateTv.text = formattedDate
        binding.dailyDetailImgEmptyLl.visibility = View.VISIBLE
        binding.dailyDetailImg.visibility = View.GONE
        daily.photo?.let {
            if(it.isNotEmpty()) {
                binding.dailyDetailImgEmptyLl.visibility = View.GONE
                binding.dailyDetailImg.visibility = View.VISIBLE
                Glide.with(this).load(it).into(binding.dailyDetailImg)
            }
        }
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
            binding.dailyDetailComment.text = view.comentaryValue.text.toString()
            dialogComment.dismiss()
        }
        dialogComment.show()
    }
    fun setListeners(){
        binding.dailyDetailEmotionalLl.setOnClickListener {
            showHideEmotionalCard(true)
        }
        binding.dailyDetailExercisesLl.setOnClickListener {
            showHideExerciseCard(true)

        }
        binding.dailyDetailCommentLl.setOnClickListener {
            createDialogComment()
        }
        binding.dailyDetailTimeTv.setOnClickListener {
            presenter.showTimeDialog(supportFragmentManager, this)
        }
        binding.dailyDetailDateTv.setOnClickListener {
            presenter.showDateDialog(supportFragmentManager, this)
        }
        binding.dailyDetailGlucTv.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                presenter.updateGlucose(binding.dailyDetailGlucTv.text.toString().toFloat())
            }
            false
        }
        binding.dailyDetailInsul.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                presenter.updateInsulin(binding.dailyDetailInsul.text.toString().toFloat())
            }
            false
        }
        binding.dailyDetailCar.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                presenter.updateCarb(binding.dailyDetailCar.text.toString().toFloat())
            }
            false
        }
        binding.dailyDetailBasal.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                presenter.updateBasal(binding.dailyDetailBasal.text.toString().toFloat())
            }
            false
        }
        binding.dailyDetailImg.setOnClickListener { presenter.showChooser() }
        binding.dailyDetailImgEmptyLl.setOnClickListener { presenter.showChooser() }
        binding.dailyDetailEdit.setOnClickListener {
            hideMenu()
            isEdit = true
            enableViews()
        }
        binding.dailyDetailDelete.setOnClickListener {
            hideMenu()
            dialogDelete()
        }
        binding.dailyDetailShared.setOnClickListener {
            hideMenu()
            presenter.getScreenShot(this, binding.dailyDetailLl)
        }
        binding.dailyMenu.setOnClickListener{
            if (isFabOpen){
                hideMenu()
            }else{
                showMenu()
            }
        }

    }

    fun showMenu(){
        isFabOpen = true
        binding.dailyMenu.setImageResource(R.drawable.cancel)
        binding.dailyDetailEdit.visibility = View.VISIBLE
        binding.dailyDetailShared.visibility = View.VISIBLE
        binding.dailyDetailDelete.visibility = View.VISIBLE
    }

    fun hideMenu(){
        isFabOpen = false
        binding.dailyMenu.setImageResource(R.drawable.ic_hand)
        binding.dailyDetailEdit.visibility = View.GONE
        binding.dailyDetailShared.visibility = View.GONE
        binding.dailyDetailDelete.visibility = View.GONE
    }

    override fun setEmotional(item: DailyItem) {
        showHideEmotionalCard(false)
        binding.dailyDetailEmotionalTv.text = (getLabel(item.name))
        binding.dailyDetailEmotional.setImageDrawable(getDrawable(item.image))
    }

    override fun setExercise(item: DailyItem) {
        showHideExerciseCard(false)
        binding.dailyDetailExercisesTv.text = (getLabel(item.name))
        binding.dailyDetailExercises.setImageDrawable(getDrawable(item.image))
    }

    override fun setDateMedition(date: Date) {
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedDate = formatter.format(date)
        val formattedTime = formatterTime.format(date)
        binding.dailyTimeTxt.text = formattedTime
        binding.dailyDateTxt.text = formattedDate
    }

    override fun enableViews() {
        binding.dailyDetailGlucTv.isEnabled = isEdit
        binding.dailyDetailInsul.isEnabled = isEdit
        binding.dailyDetailCar.isEnabled = isEdit
        binding.dailyDetailCategoryTv.isEnabled = isEdit
        binding.dailyDetailTimeTv.isEnabled = isEdit
        binding.dailyDetailDateTv.isEnabled = isEdit
        binding.dailyDetailExercisesLl.isEnabled = isEdit
        binding.dailyDetailEmotionalLl.isEnabled = isEdit
        binding.dailyDetailImgEmptyLl.isEnabled = isEdit
        binding.dailyDetailBasal.isEnabled = isEdit
        binding.dailyDetailImg.isEnabled = isEdit
        binding.dailyDetailCommentLl.isEnabled = isEdit
        if (isEdit){
            binding.dailyDetailGlucTv.requestFocus()
            binding.dailyDetailGlucTv.showKeyboard()
        }
    }

    override fun setTime(value: Date) {
        val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedTime = formatterTime.format(value)
        binding.dailyDetailTimeTv.text = formattedTime
    }

    override fun setDate(value: Date) {
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formattedDate = formatter.format(value)
        binding.dailyDetailDateTv.text = formattedDate
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
        Glide.with(this).load(image).into(binding.dailyDetailEdit)
        binding.dailyDetailImgEmptyLl.visibility = View.GONE
        binding.dailyDetailImg.visibility = View.VISIBLE

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
                if (Build.VERSION.SDK_INT >= 9) {
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
        adapter.setPowerView(binding.dailyDetailCategoryTv)
        binding.dailyDetailCategoryTv.setSpinnerAdapter(adapter)
        binding.dailyDetailCategoryTv.getSpinnerRecyclerView().layoutManager = manager
        binding.dailyDetailCategoryTv.setItems(categories)
        binding.dailyDetailCategoryTv.selectItemByIndex(index-1)
        binding.dailyDetailCategoryTv.setOnSpinnerItemSelectedListener<Category> { oldIndex, oldItem, newIndex, newItem ->
            presenter.updateLabel(newItem?.cate_id)
            Toast.makeText(this, getString(R.string.register_category_warning), Toast.LENGTH_SHORT).show()
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
        val view = DialogConfigDeleteBinding.inflate(layoutInflater)
        val builder = AlertDialog.Builder(this)
        builder.setView(view.root)
        dialog = builder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        view.deleteAccept.setOnClickListener {
            presenter.deleteRegister()
            dialog.dismiss()
        }
        view.deleteCancel.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

    override fun setExercicesData(items: List<DailyItem>) {
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

    override fun setEmotionsData(items: List<DailyItem>) {
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
        binding.home.setOnClickListener { presenter.goToActivityMain() }
        binding.statistics.setOnClickListener { presenter.goToActivityStatistic() }
        binding.tratamiento.setOnClickListener { presenter.goToActivityTreament() }
        binding.register.setOnClickListener { presenter.goToActivityRegister() }
    }

    override fun getLabel(name: String): String {
        return getString(resIdByName(name, "string"))
    }

    override fun getDrawable(name: String): Drawable? {
        return getDrawable(resIdByName(name, "drawable"))
    }


    override fun mirrorAccount() {
        binding.dailyDetailEdit.visibility = View.INVISIBLE
        binding.dailyDetailDelete.visibility = View.INVISIBLE
        binding.register.isEnabled = false
    }

    fun dialogSave() {

        val view = DialogTreatmentSaveBinding.inflate(layoutInflater)
        val builder = AlertDialog.Builder(this)
        builder.setView(view.root)
        dialog = builder.create()
        dialog.window?.setBackgroundDrawable(Color.TRANSPARENT.toDrawable())
        view.treamentAccept.setOnClickListener {
            val insulin = binding.dailyDetailInsul.text.toString().toFloatOrNull() ?: 100f
            val glucose = binding.dailyDetailGlucTv.text.toString().toFloatOrNull() ?: 0f
            val basal = binding.dailyDetailBasal.text.toString().toFloatOrNull() ?: 0f
            val carbohydrates = binding.dailyDetailCar.text.toString().toFloatOrNull() ?: 0f
            presenter.updateAll(insulin, glucose, basal, carbohydrates)
            finish()
            dialog.dismiss()
        }
        view.treamentCancel.setOnClickListener {
            finish()
            dialog.dismiss()
        }
        dialog.show()
    }

}
