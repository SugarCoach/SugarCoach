package com.sugarcoach.ui.profile.view

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.text.Editable
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
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.sugarcoach.R
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.databinding.ActivityProfileBinding
import com.sugarcoach.databinding.DialogSexBinding
import com.sugarcoach.ui.base.view.BaseActivity
import com.sugarcoach.ui.daily.interactor.DailyInteractorImp
import com.sugarcoach.ui.daily.presenter.DailyPresenterImp
import com.sugarcoach.ui.daily_detail.view.DailyDetailActivity
import com.sugarcoach.ui.login.view.LoginActivity
import com.sugarcoach.ui.profile.interactor.ProfileInteractorImp
import com.sugarcoach.ui.profile.presenter.ProfilePresenterImp
import com.sugarcoach.util.extensions.resIdByName
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
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

    lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.onAttach(this)
        setInformationFromFirebase()
        setOnClickListeners()
    }

    private fun setInformationFromFirebase(){
        binding.profileMailTv.text = Editable.Factory.getInstance().newEditable(Firebase.auth.currentUser?.email)

        if(Firebase.auth.currentUser?.displayName != null){
            binding.profileNameTv.text = Editable.Factory.getInstance().newEditable(Firebase.auth.currentUser?.displayName)
        }

    }
    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun showSuccessToast() {
        Toast.makeText(this, getString(R.string.update_success), Toast.LENGTH_LONG).show()
        finish()
    }

    override fun showErrorToast(msg: String) {
    }

    override fun openLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        finish()
    }

    private fun setOnClickListeners() {
        binding.profileSexTv.setOnClickListener { dialogSex() }
        binding.profileDebutTv.setOnClickListener { presenter.showDateDialog(supportFragmentManager, this, "debut", if (user.debut != null) LocalDate(user.debut) else LocalDate.now()) }
        binding.profileNacTv.setOnClickListener { presenter.showDateDialog(supportFragmentManager, this, "birthday", if (user.birthday != null) LocalDate(user.birthday) else LocalDate.now()) }
        binding.profileLogoutIv.setOnClickListener { presenter.logout() }
        binding.profileSave.setOnClickListener {
            hideMenu()
            try{
                presenter.updateAll(binding.profileNameTv.text.toString(), binding.profileWeightTv.text.toString().toFloat(), binding.profileHeightTv.text.toString().toFloat(), binding.profileUsernameTv.text.toString(), binding.profileMailTv.text.toString())
            }catch (e: Exception){
                showErrorToast()
            }
        }
        binding.profileShared.setOnClickListener {
            hideMenu()
            presenter.getScreenShot(this, binding.profileLl)
        }
        binding.profileMenu.setOnClickListener {
            if (isFabOpen) {
                hideMenu()
            } else {
                showMenu()
            }
        }
    }


    override fun setDateMedition(date: Date) {
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedDate = formatter.format(date)
        val formattedTime = formatterTime.format(date)
        binding.profileTimeTxt.text = formattedTime
        binding.profileDateTxt.text = formattedDate
    }

    override fun getDrawable(name: String): Drawable? {
        return getDrawable(resIdByName(name, "drawable"))
    }

    override fun setAvatars(avatars: List<ProfileItem>){
        manager.orientation = RecyclerView.VERTICAL
        binding.profileAvatars.layoutManager = manager
        binding.profileAvatars.adapter = adapter
        adapter.setData(avatars)
    }

    override fun setAvatar(id: Int) {
        adapter.edit(id)
    }

    override fun getUserData(user: User) {
        this.user = user
        user.name?.let {
            binding.profileNameTv.setText(it)
        }
        user.username.let {
            binding.profileUsernameTxt.setText(it)
            binding.profileUsernameTv.setText(it)
        }
        user.email.let {
            binding.profileMailTv.setText(it)
        }
        user.weight?.let {
            binding.profileWeightTv.setText(it.toString())
        }
        user.height?.let {
            binding.profileHeightTv.setText(it.toString())
        }
        user.sex?.let {
            binding.profileSexTv.setText(it)
        }
        user.avatar?.let {
            adapter.setAvatar(it)
            binding.profileUserimgIv.setImageDrawable(getDrawable(resIdByName(it, "drawable")))
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
        val binding = DialogSexBinding.inflate(LayoutInflater.from(this))
        val builder = AlertDialog.Builder(this)
        builder.setView(binding.root)
        dialog = builder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        binding.profileFemTv.setOnClickListener {
            presenter.updateSex(getString(R.string.profile_fem_label))
            dialog.dismiss()
        }
        binding.profileMasTv.setOnClickListener {
            presenter.updateSex(getString(R.string.profile_mas_label))
            dialog.dismiss()
        }
        binding.profileOtroTv.setOnClickListener {
            presenter.updateSex(getString(R.string.profile_otro_label))
            dialog.dismiss()
        }
        binding.profileDefinirTv.setOnClickListener {
            presenter.updateSex(getString(R.string.profile_no_definir_label))
            dialog.dismiss()
        }
        dialog.show()
    }

    override fun setBirthday(value: Date) {
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formattedDate = formatter.format(value)
        binding.profileNacTv.text = formattedDate
    }

    override fun setDebut(value: Date) {
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formattedDate = formatter.format(value)
        binding.profileDebutTv.text = formattedDate
    }

    override fun setSex(sex: String) {
        binding.profileSexTv.text = sex
    }

    override fun sharedScreenShot(uri: Uri) {
        val shareIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_STREAM, uri)
            type = "image/jpeg"
        }
        startActivity(Intent.createChooser(shareIntent, resources.getText(R.string.daily_detail_share)))
    }

    fun showMenu() {
        isFabOpen = true
        binding.profileMenu.setImageResource(R.drawable.cancel)
        binding.profileSave.visibility = View.VISIBLE
        binding.profileShared.visibility = View.VISIBLE
    }

    fun hideMenu() {
        isFabOpen = false
        binding.profileMenu.setImageResource(R.drawable.ic_hand)
        binding.profileSave.visibility = View.GONE
        binding.profileShared.visibility = View.GONE
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
