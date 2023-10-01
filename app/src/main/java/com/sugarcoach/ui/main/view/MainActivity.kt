package com.sugarcoach.ui.main.view

import android.content.Intent
import android.graphics.PorterDuff
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import com.sugarcoach.R
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.ui.base.view.BaseActivity
import com.sugarcoach.ui.config.view.ConfigActivity
import com.sugarcoach.ui.daily.view.DailyActivity
import com.sugarcoach.ui.login.view.LoginActivity
import com.sugarcoach.ui.main.interactor.MainInteractorImp
import com.sugarcoach.ui.main.presenter.MainPresenterImp
import com.sugarcoach.ui.profile.view.ProfileActivity
import com.sugarcoach.ui.register.view.RegisterActivity
import com.sugarcoach.ui.statistics.view.StatisticsActivity
import com.sugarcoach.ui.treatment.view.TreatmentActivity
import com.sugarcoach.util.extensions.resIdByName
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class MainActivity : BaseActivity(), MainView {


    @Inject
    lateinit var presenter: MainPresenterImp<MainView, MainInteractorImp>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.onAttach(this)
        setOnClickListeners()
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun showSuccessToast() {
    }

    override fun showErrorToast() {
    }

    override fun openLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
    override fun openRegisterActivity() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    override fun openTreatmentActivity() {
        val intent = Intent(this, TreatmentActivity::class.java)
        startActivity(intent)
    }

    override fun openDailyActivity() {
        val intent = Intent(this, DailyActivity::class.java)
        startActivity(intent)
    }
    override fun openConfigActivity() {
        val intent = Intent(this, ConfigActivity::class.java)
        startActivity(intent)
    }
    override fun openProfileActivity() {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }
    override fun openStatisticsActivity() {
        val intent = Intent(this, StatisticsActivity::class.java)
        startActivity(intent)
    }

    private fun setOnClickListeners() {
        main_add_register_cv.setOnClickListener { presenter.goToActivityRegister() }
        main_treatment_cv.setOnClickListener { presenter.goToActivityTreatment() }
        main_profile_cv.setOnClickListener { presenter.goToActivityProfile() }
        main_daily_cv.setOnClickListener { presenter.goToActivityDaily()}
        main_config_cv.setOnClickListener { presenter.goToActivityConfig()}
        main_statistics_cv.setOnClickListener { presenter.goToActivityStatistics()}
    }


    override fun setMedition(label: String) {
        main_med_txt.text = getLabel(label)
    }
    override fun setUser(user: User) {
        main_username_txt.text = user.username
        user.avatar?.let {
            main_userimg_iv.setImageDrawable(getDrawable(resIdByName(it, "drawable")))
        }
        presenter.checkAndRequestPermissions(this)
        if (user.typeAccount == "3"){
            mirrorAccount()
        }
    }


    override fun setDate(date: Date) {
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedDate = formatter.format(date)
        val formattedTime = formatterTime.format(date)
        main_time_txt.text = formattedTime
        main_date_txt.text = formattedDate
    }

    override fun setPromedios(min: Int, max: Int, promedio: Int) {
        main_prom_txt.text = promedio.toString()
        main_min_txt.text = min.toString()
        main_max_txt.text = max.toString()
    }

    override fun setMinColor(color: Int) {
        main_min_txt.setTextColor(ContextCompat.getColor(this,color))
    }

    override fun setMaxColor(color: Int) {
        main_max_txt.setTextColor(ContextCompat.getColor(this,color))
    }

    override fun setPromColor(color: Int) {
        main_prom_txt.setTextColor(ContextCompat.getColor(this,color))
    }

    override fun onResume() {
        super.onResume()
        presenter.getView()?.let {
            presenter.onResume()
        }
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
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        presenter.onRequestPermissionsResult(this, requestCode, permissions, grantResults)
    }
    override fun getLabel(name: String): String {
        return getString(resIdByName(name, "string"))
    }
    override fun mirrorAccount() {
        main_add_register_cv.isEnabled = false
        main_registo_image.setColorFilter(ContextCompat.getColor(this, R.color.gray), PorterDuff.Mode.MULTIPLY)
        main_registo_title.setTextColor(ContextCompat.getColor(this, R.color.gray))
    }
}
