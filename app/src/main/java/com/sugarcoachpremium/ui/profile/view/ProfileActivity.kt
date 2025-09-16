package com.sugarcoachpremium.ui.profile.view

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.sugarcoachpremium.R
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.databinding.ActivityProfileBinding
import com.sugarcoachpremium.databinding.DialogCongratulationBinding
import com.sugarcoachpremium.databinding.DialogSexBinding
import com.sugarcoachpremium.databinding.DialogTreatmentSaveBinding
import com.sugarcoachpremium.ui.base.view.BaseActivity
import com.sugarcoachpremium.ui.login.view.LoginActivity
import com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp
import com.sugarcoachpremium.ui.profile.presenter.ProfilePresenterImp
import com.sugarcoachpremium.util.extensions.resIdByName
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import org.joda.time.LocalDate
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
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
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                dialogSave()
            }
        })
    }

    override fun createCongratsDialog(points: Int, totalPoints: Int){
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
        dialog.setOnDismissListener { finish() }
        dialog.show()
    }

    private fun setInformationFromFirebase(){
        Log.i("DEBUG", "setInformationFromFirebase llamado") // Línea nueva 11/09/2025
        if(Firebase.auth.currentUser?.email != null) {
            binding.profileMailTv.text =
                Editable.Factory.getInstance().newEditable(Firebase.auth.currentUser?.email)
        }
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
            Log.i("OnProfile", "Se esta guardando la data")

            /////////////////////////////////////////////////////////////////////////////////////////////
            //DESACTIVADO EL 04/09/2025 PARA VER ERRORES EN LOGCAT
//            try{
//                presenter.updateAll(binding.profileNameTv.text.toString(), binding.profileWeightTv.text.toString().toFloat(), binding.profileHeightTv.text.toString().toFloat(), binding.profileUsernameTv.text.toString(), binding.profileMailTv.text.toString())
//            }catch (e: Exception){
//                showErrorToast()
//            }

            //AGREGADO EL 04/09/2025 PARA VER ERRORES

            // Convierte los textos a Float de manera segura, permitiendo nulos
            val weight = binding.profileWeightTv.text.toString().toFloatOrNull()
            val height = binding.profileHeightTv.text.toString().toFloatOrNull()

            // Llama al presenter. Ahora weight y height son Float? (pueden ser nulos)
            presenter.updateAll(
                binding.profileNameTv.text.toString(),
                weight, // <-- Se pasa el Float? directamente
                height, // <-- Se pasa el Float? directamente
                binding.profileUsernameTv.text.toString(),
                binding.profileMailTv.text.toString()
            )

            /////////////////////////////////////////////////////////////////////////////////////////////

        }
        binding.profileShared.setOnClickListener {
            hideMenu()
            presenter.getScreenShot(this, binding.profileLl)
        }
        binding.profileMenu.setOnClickListener {
            Log.i("OnMenu", "Se toco el menu")
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
        Log.i("DEBUG", "getUserData llamado, username: ${user.username}") // Línea nueva 11/09/2025
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

    fun dialogSave() {
        val view = DialogTreatmentSaveBinding.inflate(layoutInflater)
        val builder = AlertDialog.Builder(this)
        builder.setView(view.root)
        dialog = builder.create()
        dialog.window?.setBackgroundDrawable(Color.TRANSPARENT.toDrawable())
        view.treamentAccept.setOnClickListener {

            val name = binding.profileNameTv.text.toString()
            val weight = binding.profileWeightTv.text.toString().toFloat()
            val height = binding.profileHeightTv.text.toString().toFloat()
            val username = binding.profileUsernameTv.text.toString()
            val mail = binding.profileMailTv.text.toString()

            presenter.commitChanges(name, weight, height, username, mail)
            dialog.dismiss()
        }
        view.treamentCancel.setOnClickListener {
            finish()
            dialog.dismiss()
        }
        dialog.show()
    }

}
