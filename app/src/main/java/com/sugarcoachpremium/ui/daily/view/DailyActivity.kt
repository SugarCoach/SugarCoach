package com.sugarcoachpremium.ui.daily.view

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hominoid.expandablerecyclerviewlib.models.ExpandableListItem
import com.sugarcoachpremium.R
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.databinding.ActivityDailyBinding
import com.sugarcoachpremium.databinding.RegisterMonthBinding
import com.sugarcoachpremium.ui.base.view.BaseActivity
import com.sugarcoachpremium.ui.daily.interactor.DailyInteractorImp
import com.sugarcoachpremium.ui.daily.presenter.DailyPresenterImp
import com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity
import com.sugarcoachpremium.ui.main.view.MainActivity
import com.sugarcoachpremium.ui.register.view.RegisterActivity
import com.sugarcoachpremium.ui.statistics.view.StatisticsActivity
import com.sugarcoachpremium.ui.treatment.view.TreatmentActivity
import com.sugarcoachpremium.util.extensions.resIdByName
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList


class DailyActivity : BaseActivity(), DailyView {

    lateinit var binding: ActivityDailyBinding

    @Inject
    lateinit var presenter: DailyPresenterImp<DailyView, DailyInteractorImp>

    lateinit var dailyAdapter: DailyAdapter

    @Inject
    lateinit var linearLayoutManager: LinearLayoutManager

    private lateinit var binding2: RegisterMonthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDailyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.onAttach(this)
        setListeners()
        menuListeners()

    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun showSuccessToast() {
    }

    override fun showErrorToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

    override fun getUserData(user: User) {
        binding.dailyUsernameTxt.setText(user.username)
        user.avatar?.let {
            binding.dailyUserimgIv.setImageDrawable(getDrawable(resIdByName(it, "drawable")))
        }
    }

    override fun setDateMedition(date: Date) {
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedDate = formatter.format(date)
        val formattedTime = formatterTime.format(date)
        binding.dailyTimeTxt.setText(formattedTime)
        binding.dailyDateTxt.setText(formattedDate)
    }

    override fun showProgress() {
        binding.loading.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        binding.loading.visibility = View.GONE
        binding.dailyList.visibility = View.VISIBLE
    }

    override fun getRegisters(registers: MutableList<ExpandableListItem<DailyHeader, DailyItem>>) {
        try {
            dailyAdapter = DailyAdapter(this,registers)
            binding.dailyList.adapter = dailyAdapter
            dailyAdapter.toggleGroup(0)
            hideProgress()
        }catch (e: Exception){
            Log.i("OnDailyAdapter", "Ocurrió un error: $e")
            showErrorToast("Haga una carga antes")
            openRegisterActivity()
        }
    }

    override fun setUp() {
        linearLayoutManager.orientation = RecyclerView.VERTICAL
        binding.dailyList.layoutManager = linearLayoutManager
        presenter.getRegisters()
    }

    fun setListeners(){
        binding.dailyPdfIv.setOnClickListener {
            Log.d("gg", "¿Está binding2.root en la jerarquía de vistas?: ${binding2.root.isAttachedToWindow}")
            captureBinding2AsImage()
            //val path=presenter.getPdfPath()
            //Toast.makeText(this, "PDF descargado en: $path", Toast.LENGTH_LONG).show()
        }
    }

    override fun openDailyDetailActivity(id: Int) {
        val intent = Intent(this, DailyDetailActivity::class.java)
        intent.putExtra("id", id)
        startActivity(intent)
    }

    override fun onResume() {
        super.onResume()
        hideList()
        presenter.onResume()
    }
    fun hideList(){
        binding.dailyList.visibility = View.INVISIBLE
    }
    override fun getLabel(name: String): String {
        return getString(resIdByName(name, "string"))
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
        binding.dailyHome.setOnClickListener { presenter.goToActivityMain() }
        binding.dailyStatistics.setOnClickListener { presenter.goToActivityStatistic() }
        binding.dailyTratamiento.setOnClickListener { presenter.goToActivityTreament() }
        binding.dailyRegister.setOnClickListener { presenter.goToActivityRegister() }
    }
    override fun mirrorAccount() {
        binding.dailyRegister.isEnabled = false
    }

    override fun getDrawable(name: String): Drawable? {
        return getDrawable(resIdByName(name, "drawable"))
    }


    override fun getColorsCategory(): ArrayList<Int> {
        val colors = ArrayList<Int>()
        colors.add(ContextCompat.getColor(this, R.color.aqua))
        colors.add(ContextCompat.getColor(this, R.color.pink))
        colors.add(ContextCompat.getColor(this, R.color.yellow))
        colors.add(ContextCompat.getColor(this, R.color.purple))
        return colors
    }
    override fun displayDailyItems(organizedDays: MutableList<MutableList<DayItem?>?>) {
        binding2= RegisterMonthBinding.inflate(layoutInflater)
        val rvDays = binding2.rvDays
        rvDays.layoutManager = LinearLayoutManager(this)
        rvDays.adapter = DayAdapter(organizedDays)
        val rootView = binding2.root

        if (rootView != null) {
            Log.d("gg", "binding2.root se ha inflado correctamente")
        } else {
            Log.e("gg", "Error inflando binding2.root")
        }
    }
    private fun captureBinding2AsImage() {
        Log.d("gg", "Intentando capturar la imagen de la vista oculta...")

        binding2.root.measure(
            View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED),
            View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED)
        )
        binding2.root.layout(0, 0, binding2.root.measuredWidth, binding2.root.measuredHeight)

        Log.d("gg", "Medidas después de layout: ancho = ${binding2.root.measuredWidth}, alto = ${binding2.root.measuredHeight}")

        if (binding2.root.measuredWidth > 0 && binding2.root.measuredHeight > 0) {
            val bitmap = Bitmap.createBitmap(binding2.root.measuredWidth, binding2.root.measuredHeight, Bitmap.Config.ARGB_8888)
            val canvas = Canvas(bitmap)
            binding2.root.draw(canvas)

            saveBitmapAsImage(bitmap)
        } else {
            Log.e("gg", "La vista no tiene dimensiones válidas.")
        }
    }

    private fun saveBitmapAsImage(bitmap: Bitmap) {
        val fileName = "register.png"
        val picturesDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)
        val file = File(picturesDir, fileName)


        try {
            val fileOutputStream = FileOutputStream(file)

            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream)

            fileOutputStream.flush()
            fileOutputStream.close()

            Toast.makeText(this, "Imagen guardada en: ${file.absolutePath}", Toast.LENGTH_LONG).show()
            Log.d("gg", "Imagen guardada en ${file.absolutePath}")
        } catch (e: IOException) {
            // Si ocurre un error, lo mostramos
            Log.e("gg", "Error al guardar la imagen: $e")
        }
    }
}
