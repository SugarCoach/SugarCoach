package com.sugarcoachpremium.ui.main.view

import android.content.Intent
import android.graphics.PorterDuff
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import com.sugarcoachpremium.R
import com.sugarcoachpremium.data.api_db.ApiRepository
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.databinding.ActivityMainBinding
import com.sugarcoachpremium.ui.base.view.BaseActivity
import com.sugarcoachpremium.ui.config.view.ConfigActivity
import com.sugarcoachpremium.ui.daily.view.DailyActivity
import com.sugarcoachpremium.ui.login.view.LoginActivity
import com.sugarcoachpremium.ui.main.interactor.MainInteractorImp
import com.sugarcoachpremium.ui.main.presenter.MainPresenterImp
import com.sugarcoachpremium.ui.profile.view.ProfileActivity
import com.sugarcoachpremium.ui.register.view.RegisterActivity
import com.sugarcoachpremium.ui.statistics.view.StatisticsActivity
import com.sugarcoachpremium.ui.treatment.view.TreatmentActivity
import com.sugarcoachpremium.util.extensions.resIdByName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

import javax.inject.Inject

class MainActivity : BaseActivity(), MainView {


    @Inject
    lateinit var presenter: MainPresenterImp<MainView, MainInteractorImp>
    lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var apiRepository: ApiRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.onAttach(this)
        setOnClickListeners()
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun showSuccessToast() {
    }

    override fun showErrorToast(msg: String) {
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
        binding.mainAddRegisterCv.setOnClickListener { presenter.goToActivityRegister() }
        binding.mainTreatmentCv.setOnClickListener { presenter.goToActivityTreatment() }
        binding.mainProfileCv.setOnClickListener { presenter.goToActivityProfile() }
        binding.mainDailyCv.setOnClickListener { presenter.goToActivityDaily() }
        binding.mainConfigCv.setOnClickListener { presenter.goToActivityConfig() }
        binding.mainStatisticsCv.setOnClickListener { presenter.goToActivityStatistics() }
        //binding.callAPI.setOnClickListener { apiCall() }
    }

    private fun apiCall(){
        CoroutineScope(Dispatchers.IO).launch {
            //val response = apiRepository.createUser("asdasd", "asdas@gmail.com")
            //Log.i("OnApiResponse", "$response")
        }
    }

    override fun setMedition(label: String) {
        binding.mainMedTxt.text = getLabel(label)
    }
    override fun setUser(user: User) {
        binding.mainUsernameTxt.text = user.username
        binding.mainPtsTxt.text = user.points.toString()
        user.avatar?.let {
            binding.mainUserimgIv.setImageDrawable(getDrawable(resIdByName(it, "drawable")))
        }
        presenter.checkAndRequestPermissions(this)
        if (user.typeAccount == "3") {
            mirrorAccount()
        }
    }


    override fun setDate(date: Date) {
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedDate = formatter.format(date)
        val formattedTime = formatterTime.format(date)
        binding.mainTimeTxt.text = formattedTime
        binding.mainDateTxt.text = formattedDate
    }

    override fun setPromedios(min: Int, max: Int, promedio: Int) {
        binding.mainPromTxt.text = promedio.toString()
        binding.mainMinTxt.text = min.toString()
        binding.mainMaxTxt.text = max.toString()
    }

    override fun setMinColor(color: Int) {
        binding.mainMinTxt.setTextColor(ContextCompat.getColor(this, color))
    }

    override fun setMaxColor(color: Int) {
        binding.mainMaxTxt.setTextColor(ContextCompat.getColor(this, color))
    }

    override fun setPromColor(color: Int) {
        binding.mainPromTxt.setTextColor(ContextCompat.getColor(this, color))
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
        binding.mainAddRegisterCv.isEnabled = false
        binding.mainRegistoImage.setColorFilter(ContextCompat.getColor(this, R.color.gray), PorterDuff.Mode.MULTIPLY)
        binding.mainRegistoTitle.setTextColor(ContextCompat.getColor(this, R.color.gray))
    }
}
