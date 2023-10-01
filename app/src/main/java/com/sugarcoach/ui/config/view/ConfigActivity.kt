package com.sugarcoach.ui.config.view

import android.content.Intent
import android.graphics.Color
import android.graphics.Point
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoach.R
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.ui.base.view.BaseActivity
import com.sugarcoach.ui.config.interactor.ConfigInteractorImp
import com.sugarcoach.ui.config.presenter.ConfigPresenterImp
import com.sugarcoach.ui.daily.interactor.DailyInteractorImp
import com.sugarcoach.ui.daily.presenter.DailyPresenterImp
import com.sugarcoach.ui.daily.view.DailyActivity
import com.sugarcoach.ui.daily_detail.view.DailyDetailActivity
import com.sugarcoach.ui.login.view.LoginActivity
import com.sugarcoach.ui.profile.interactor.ProfileInteractorImp
import com.sugarcoach.ui.profile.presenter.ProfilePresenterImp
import com.sugarcoach.ui.statistics.view.StatisticsActivity
import com.sugarcoach.ui.treatment.view.TreatmentActivity
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import kotlinx.android.synthetic.main.activity_config.*
import kotlinx.android.synthetic.main.activity_config.home
import kotlinx.android.synthetic.main.activity_config.statistics
import kotlinx.android.synthetic.main.activity_config.treament
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.dialog_sex.view.*
import kotlinx.android.synthetic.main.dialog_upgrade.view.*
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import androidmads.library.qrgenearator.QRGContents
import androidmads.library.qrgenearator.QRGEncoder
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.os.Build
import android.os.Environment
import android.text.TextWatcher
import android.view.WindowManager
import androidmads.library.qrgenearator.QRGSaver
import androidx.annotation.NonNull
import androidx.core.content.FileProvider
import com.notbytes.barcode_reader.BarcodeReaderActivity
import com.sugarcoach.ui.main.view.MainActivity
import com.sugarcoach.util.AppConstants
import com.sugarcoach.util.extensions.openNewTabWindow
import com.sugarcoach.util.extensions.resIdByName
import kotlinx.android.synthetic.main.activity_config.view.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.dialog_codigo.view.*
import kotlinx.android.synthetic.main.dialog_congratulation_premium.view.*
import kotlinx.android.synthetic.main.dialog_control.view.*
import kotlinx.android.synthetic.main.dialog_info.view.*
import kotlinx.android.synthetic.main.dialog_upgrade.view.upgrade_accept
import kotlinx.android.synthetic.main.dialog_upgrade.view.upgrade_cancel
import org.joda.time.DateTime
import org.joda.time.LocalDateTime
import java.io.File
import java.util.jar.Manifest
import kotlin.random.Random


class ConfigActivity: BaseActivity(), ConfigView {
    @Inject
    lateinit var presenter: ConfigPresenterImp<ConfigView, ConfigInteractorImp>
    lateinit var user: User
    var isMedicoEnable = false
    var isControlEnable = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_config)
        presenter.onAttach(this)
        menuListeners()
        presenter.checkAndRequestPermissions(this, arrayListOf(android.Manifest.permission.READ_EXTERNAL_STORAGE, android.Manifest.permission.WRITE_EXTERNAL_STORAGE, android.Manifest.permission.ACCESS_FINE_LOCATION))
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun showSuccessToast() {
        Toast.makeText(this, getString(R.string.update_success), Toast.LENGTH_LONG).show()
    }

    override fun showErrorToast() {
        Toast.makeText(this, getString(R.string.empty_codigo_error_message), Toast.LENGTH_LONG).show()
    }

    override fun showSuccessQR() {
        Toast.makeText(this, getString(R.string.qr_success), Toast.LENGTH_LONG).show()
        finish()
    }

    override fun setType(value: Boolean) {
        if (value){
            config_upgrade.visibility = View.INVISIBLE
            config_type.text = getString(R.string.config_premium_label)
            config_control.isEnabled = true
            config_medico.isEnabled = true
            config_sms.isEnabled = true
            config_geo.isEnabled = true
            config_number.isEnabled = true
        }else{
            config_upgrade.visibility = View.VISIBLE
            config_type.text = getString(R.string.config_standard_label)
            config_medico.isEnabled = false
            config_control.isEnabled = false
            config_sms.isEnabled = false
            config_geo.isEnabled = false
            config_number.isEnabled = false
        }
    }
    override fun setControl(value: Boolean) {
        isControlEnable = value
    }
    override fun setControlMedico(value: Boolean) {
        isMedicoEnable= value
    }
    fun sharedScreenShot(name: String) {
        var  manager: WindowManager = windowManager
        var display = manager.defaultDisplay
        var point =  Point()
        display.getSize(point)
        var width:Int = point.x
        var  height:Int = point.y
        var smallerDimension:Int = if (width < height) width else height
        smallerDimension = smallerDimension * 3 / 4
        var qrgEncoder = QRGEncoder(
            name, null,
            QRGContents.Type.TEXT,
            smallerDimension
        )
        var savePath = Environment.getExternalStorageDirectory().path + "/"
        var bitmap = qrgEncoder.bitmap

        var saver = QRGSaver().save(savePath, name, bitmap, QRGContents.ImageType.IMAGE_JPEG)
        if (saver) {
            val path = savePath+name+".jpg"
            val uri = FileProvider.getUriForFile(this, getApplicationContext().getPackageName() + ".provider", File(path))
            val shareIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_STREAM, uri)
                flags = Intent.FLAG_GRANT_READ_URI_PERMISSION
                type = "image/jpeg"
            }
            startActivity(Intent.createChooser(shareIntent, resources.getText(R.string.daily_detail_share)))
        }
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

    fun menuListeners(){
        home.setOnClickListener { presenter.goToActivityMain() }
        statistics.setOnClickListener { presenter.goToActivityStatistic() }
        dailyRegister.setOnClickListener { presenter.goToActivityDaily() }
        treament.setOnClickListener { presenter.goToActivityTreament() }

    }


    private fun setOnClickListeners() {
        config_number.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
                presenter.updateNumber(config_number.text.toString())
            }
            false
        }

        config_sms.setOnCheckedChangeListener { buttonView, isChecked ->
            config_number.isEnabled = isChecked
            presenter.updateSms(this,isChecked)
        }
        config_control.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                dialogControl(getString(R.string.config_control_dialog), false)
            }else{
                presenter.updateControl(isChecked)
            }
        }
        config_medico.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                dialogControl(getString(R.string.config_medico_dialog), true)
            }else{
                presenter.updateControlMedico(isChecked)
            }
        }
        config_geo.setOnCheckedChangeListener { buttonView, isChecked -> presenter.updateGeo(this, isChecked) }

        config_questions.setOnClickListener { openNewTabWindow(getString(R.string.url_preguntas), this) }
        config_upgrade.setOnClickListener { dialogUpgrade()  }
        config_control_qr.setOnClickListener{( if (isControlEnable) sharedScreenShot("sugar"))}
        config_medico_qr.setOnClickListener{( if (isMedicoEnable) sharedScreenShot("sugar_medico"))}
        config_sms_title.setOnClickListener{createDialogInfo(getString(R.string.info_sms))}
        config_sms_info.setOnClickListener{createDialogInfo(getString(R.string.info_sms_number))}
        config_geo_title.setOnClickListener{createDialogInfo(getString(R.string.info_geo))}
        config_control_title.setOnClickListener{createDialogInfo(getString(R.string.info_control))}
        config_medico_title.setOnClickListener{createDialogInfo(getString(R.string.info_medico))}
    }


    override fun getUserData(user: User) {
        this.user = user
        user.control?.let {
            config_control.isChecked = it
            setControl(it)
        }
        user.medico?.let {
            config_medico.isChecked = it
            setControlMedico(it)

        }
        user.geolocalizacion?.let {
            config_geo.isChecked = it
        }
        user.sms?.let {
            config_sms.isChecked = it
            if(it){
                config_number.visibility = View.VISIBLE
            }
        }
        user.username.let {
            config_username_txt.setText(it)
        }
        user.number.let {
            config_number.setText(it)
        }
        if (user.typeAccount == "2"){
            premiumAccount()
        }
        user.avatar?.let {
            config_userimg_iv.setImageDrawable(getDrawable(resIdByName(it, "drawable")))
        }

        setOnClickListeners()

    }

    fun dialogUpgrade() {
        val view = LayoutInflater.from(this).inflate(R.layout.dialog_codigo, null)
        val builder = AlertDialog.Builder(this)
        builder.setView(view)
        dialog = builder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        view.premium_save.setOnClickListener{
            if(view.premium_value.text.toString().isNotEmpty()) {
                presenter.updateType(view.premium_value.text.toString())
                dialog.dismiss()
            }else{
                showErrorToast()
            }
        }
        view.premium_url.setOnClickListener { openNewTabWindow(getString(R.string.url_preguntas), this) }
        dialog.show()
    }

    override fun createDialogCongratulation(){
        val view = LayoutInflater.from(this).inflate(R.layout.dialog_congratulation_premium, null)
        val builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setView(view)
        dialog = builder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        user.avatar?.let {
            view.congratulation_avatar.setImageDrawable(getDrawable(resIdByName(it, "drawable")))
        }
        view.congratulation_close.setOnClickListener { dialog.dismiss() }
        dialog.setOnDismissListener { setType(true) }
        dialog.show()

    }


    fun dialogControl(title: String, isMedico: Boolean) {
        val view = LayoutInflater.from(this).inflate(R.layout.dialog_control, null)
        val builder = AlertDialog.Builder(this)
        builder.setView(view)
        dialog = builder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        view.upgrade_title.text = title
        view.upgrade_accept.setOnClickListener {
            if(isMedico) {
                presenter.updateControlMedico(true)
            }else{
                presenter.updateControl(true)

            }
            dialog.dismiss()
        }
        view.upgrade_cancel.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
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

    private fun createDialogInfo(info: String){
        val view = LayoutInflater.from(this).inflate(R.layout.dialog_info, null)
        val builder = android.app.AlertDialog.Builder(this)
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
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        presenter.onRequestPermissionsResult(this, requestCode, permissions, grantResults)
    }

    override fun premiumAccount() {
        config_upgrade.visibility = View.INVISIBLE
        config_type.text = getString(R.string.config_premium_label)
    }

    override fun showValidationMessage(errorCode: Int) {
        when (errorCode) {
            AppConstants.EMPTY_PHONE_ERROR -> Toast.makeText(this, getString(R.string.invalid_phone_error_message), Toast.LENGTH_LONG).show()
        }
    }

}
