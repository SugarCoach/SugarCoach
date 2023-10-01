package com.sugarcoach.ui.profile.view

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
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aminography.primecalendar.PrimeCalendar
import com.aminography.primecalendar.common.CalendarFactory
import com.aminography.primecalendar.common.CalendarType
import com.aminography.primedatepicker.PickType
import com.aminography.primedatepicker.fragment.PrimeDatePickerBottomSheet
import com.sugarcoach.R
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.ui.base.view.BaseActivity
import com.sugarcoach.ui.daily.interactor.DailyInteractorImp
import com.sugarcoach.ui.daily.presenter.DailyPresenterImp
import com.sugarcoach.ui.daily_detail.view.DailyDetailActivity
import com.sugarcoach.ui.login.view.LoginActivity
import com.sugarcoach.ui.profile.interactor.ProfileInteractorImp
import com.sugarcoach.ui.profile.presenter.ProfilePresenterImp
import com.sugarcoach.util.extensions.resIdByName
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.dialog_sex.view.*
import kotlinx.android.synthetic.main.profile_item.*
import org.joda.time.LocalDate
import org.joda.time.LocalDateTime
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


class ProfileActivity: BaseActivity(), ProfileView, DatePickerDialog.OnDateSetListener {



    lateinit var user: User

    @Inject
    lateinit var presenter: ProfilePresenterImp<ProfileView, ProfileInteractorImp>

    @Inject
    lateinit var manager: GridLayoutManager

    @Inject
    lateinit var adapter: ProfileAdapter

    var isFabOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        presenter.onAttach(this)
        setOnClickListeners()
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun showSuccessToast() {
        Toast.makeText(this, getString(R.string.update_success), Toast.LENGTH_LONG).show()
        finish()
    }

    override fun showErrorToast() {
    }

    override fun openLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        finish()
    }

    private fun setOnClickListeners() {
        profile_sex_tv.setOnClickListener { dialogSex()  }
        profile_debut_tv.setOnClickListener { presenter.showDateDialog(supportFragmentManager, this, "debut", if(user.debut != null) LocalDate(user.debut) else LocalDate.now()) }
        profile_nac_tv.setOnClickListener { presenter.showDateDialog(supportFragmentManager, this, "birthday", if(user.birthday != null) LocalDate(user.birthday) else LocalDate.now()) }
        profile_logout_iv.setOnClickListener { presenter.logout() }
        profile_save.setOnClickListener {
            hideMenu()
            presenter.updateAll(profile_name_tv.text.toString(),profile_weight_tv.text.toString().toFloat(),profile_height_tv.text.toString().toFloat(),profile_username_tv.text.toString(),profile_mail_tv.text.toString() ) }
        profile_shared.setOnClickListener {
            hideMenu()
            presenter.getScreenShot(this, profile_ll)
        }
        profile_menu.setOnClickListener{
            if (isFabOpen){
                hideMenu()
            }else{
                showMenu()
            }
        }
    }


    override fun setDateMedition(date: Date) {
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedDate = formatter.format(date)
        val formattedTime = formatterTime.format(date)
        profile_time_txt.setText(formattedTime)
        profile_date_txt.setText(formattedDate)
    }

    override fun getDrawable(name: String): Drawable? {
        return getDrawable(resIdByName(name, "drawable"))
    }

    override fun setAvatars(avatars: List<ProfileItem>){
        manager.orientation = RecyclerView.VERTICAL
        profile_avatars.layoutManager = manager
        profile_avatars.adapter = adapter
        adapter.setData(avatars)
    }

    override fun setAvatar(id: Int) {
        adapter.edit(id)
    }


    override fun getUserData(user: User) {
        this.user = user
        user.name?.let {
            profile_name_tv.setText(it)
        }
        user.username.let {
            profile_username_txt.setText(it)
            profile_username_tv.setText(it)
        }
        user.email.let {
            profile_mail_tv.setText(it)
        }
        user.weight?.let {
            profile_weight_tv.setText(it.toString())
        }
        user.height?.let {
            profile_height_tv.setText(it.toString())
        }
        user.sex?.let {
            profile_sex_tv.setText(it)
        }
        user.avatar?.let {
           adapter.setAvatar(it)
            profile_userimg_iv.setImageDrawable(getDrawable(resIdByName(it, "drawable")))
        }


    }

    override fun onDateSet(view: DatePickerDialog?, year: Int, monthOfYear: Int, dayOfMonth: Int) {
        when(view!!.tag){
            "birthday" -> {
                presenter.setBirthday(year, monthOfYear+1,dayOfMonth)
            }
            "debut" -> {
                presenter.setDebut(year, monthOfYear+1, dayOfMonth)
            }
        }
    }

    fun dialogSex() {
        val view = LayoutInflater.from(this).inflate(R.layout.dialog_sex, null)
        val builder = AlertDialog.Builder(this)
        builder.setView(view)
        dialog = builder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        view.profile_fem_tv.setOnClickListener {
            presenter.updateSex(getString(R.string.profile_fem_label))
            dialog.dismiss()
        }
        view.profile_mas_tv.setOnClickListener {
            presenter.updateSex(getString(R.string.profile_mas_label))
            dialog.dismiss()
        }
        view.profile_otro_tv.setOnClickListener {
            presenter.updateSex(getString(R.string.profile_otro_label))
            dialog.dismiss()
        }
        view.profile_definir_tv.setOnClickListener {
            presenter.updateSex(getString(R.string.profile_no_definir_label))
            dialog.dismiss()
        }
        dialog.show()
    }

    override fun setBirthday(value: Date) {
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formattedDate = formatter.format(value)
        profile_nac_tv.setText(formattedDate)
    }

    override fun setDebut(value: Date) {
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formattedDate = formatter.format(value)
        profile_debut_tv.setText(formattedDate)
    }



    override fun setSex(sex: String) {
        profile_sex_tv.setText(sex)
    }


    override fun sharedScreenShot(uri: Uri) {
        val shareIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_STREAM, uri)
            type = "image/jpeg"
        }
        startActivity(Intent.createChooser(shareIntent, resources.getText(R.string.daily_detail_share)))
    }

    fun showMenu(){
        isFabOpen = true
        profile_menu.setImageResource(R.drawable.cancel)
        profile_save.visibility = View.VISIBLE
        profile_shared.visibility = View.VISIBLE
    }

    fun hideMenu(){
        isFabOpen = false
        profile_menu.setImageResource(R.drawable.ic_hand)
        profile_save.visibility = View.GONE
        profile_shared.visibility = View.GONE
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        presenter.onRequestPermissionsResult(this, requestCode, permissions, grantResults)
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

}
