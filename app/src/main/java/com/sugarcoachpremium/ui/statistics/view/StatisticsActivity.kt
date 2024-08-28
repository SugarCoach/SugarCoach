package com.sugarcoachpremium.ui.statistics.view

import android.content.Intent
import android.graphics.PorterDuff
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aminography.primecalendar.PrimeCalendar
import com.aminography.primecalendar.civil.CivilCalendar
import com.aminography.primecalendar.common.CalendarFactory
import com.aminography.primecalendar.common.CalendarType
import com.aminography.primedatepicker.common.PickType
//import com.aminography.primedatepicker.fragment.PrimeDatePickerBottomSheet
import com.aminography.primedatepicker.picker.PrimeDatePicker
import com.sugarcoachpremium.R
import com.sugarcoachpremium.databinding.ActivityEstadisticasBinding
import com.sugarcoachpremium.ui.base.view.BaseActivity
import com.sugarcoachpremium.ui.daily.view.DailyActivity
import com.sugarcoachpremium.ui.main.view.MainActivity
import com.sugarcoachpremium.ui.statistics.interactor.StatisticsInteractorImp
import com.sugarcoachpremium.ui.statistics.presenter.StatisticsPresenterImp
import com.sugarcoachpremium.ui.treatment.view.TreatmentActivity
import org.joda.time.LocalDate
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


class StatisticsActivity : BaseActivity(), StatisticsView {

    @Inject
    lateinit var presenter: StatisticsPresenterImp<StatisticsView, StatisticsInteractorImp>

    @Inject
    lateinit var adapter: StatisticsAdapter

    @Inject
    lateinit var linearLayoutManager: LinearLayoutManager

    lateinit var binding: ActivityEstadisticasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEstadisticasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.onAttach(this)
        menuListeners()
        setListeners()
    }

    private fun setListeners() {
        binding.statisticsShared.setOnClickListener {
            presenter.getScreenShot(this, binding.statisticsList)
        }
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun showErrorToast(msg: String) {
    }



    override fun setDate(date: Date) {
        val formatter = SimpleDateFormat("dd.M.yy", Locale.getDefault())
        val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val formattedDate = formatter.format(date)
        val formattedTime = formatterTime.format(date)
        binding.statisticsTimeTxt.setText(formattedTime)
        binding.statisticsDateTxt.setText(formattedDate)
    }

    fun menuListeners(){
        binding.home.setOnClickListener { presenter.goToActivityMain() }
        binding.dailyRegister.setOnClickListener { presenter.goToActivityDaily() }
        binding.treament.setOnClickListener { presenter.goToActivityTreament() }

    }

    override fun setUp() {
        linearLayoutManager.orientation = RecyclerView.VERTICAL
        binding.statisticsList.layoutManager = linearLayoutManager
        binding.statisticsList.adapter = adapter
        presenter.getData()
    }
    override fun getData(data: List<StatisticsItem>) {
        adapter.setData(data)
        hideProgress()
    }
    override fun getInsulinaType(): List<String> {
        val arrayList = resources.getStringArray(R.array.statistic_insulina_types)
        return arrayList.toList()
    }

    override fun getGlucemiaType(): List<String> {
        val arrayList = resources.getStringArray(R.array.statistic_glucemia_types)
        return arrayList.toList()
    }

    override fun getCarType(): List<String> {
        val arrayList = resources.getStringArray(R.array.statistic_car_types)
        return arrayList.toList()
    }

    override fun getExcercisesType(): List<String> {
        val arrayList = resources.getStringArray(R.array.statistic_exercises_types)
        return arrayList.toList()
    }

    override fun getStatesType(): List<String> {
        val arrayList = resources.getStringArray(R.array.statistic_state_types)
        return arrayList.toList()
    }
    override fun setDataUpdated(position: Int, data: StatisticsItem) {
        adapter.edit(position, data)
        hideProgress()
    }
    override fun openDailyActivity() {
        val intent = Intent(this, DailyActivity::class.java)
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
    override fun mirrorAccount() {
        binding.addRegister.isEnabled = false
        binding.addRegisterImage.setColorFilter(ContextCompat.getColor(this, R.color.gray), PorterDuff.Mode.MULTIPLY)
    }
    fun showCalendar(position: Int, index: Int){
        val pickType = when(position) {
            0,3,4 -> PickType.RANGE_START
            1,2-> PickType.SINGLE
            else -> PickType.SINGLE
        }
        val today = CivilCalendar()
//
        val datePicker = PrimeDatePicker.bottomSheetWith(today)
            .pickSingleDay { singleDay ->
                when (position) {
                    1 -> presenter.getDataInsulineDate(position, singleDay.toString(), index)
                    2 -> presenter.getDataCarDate(position, singleDay.toString(), index)
                }
            }
            .build()
        datePicker.show(supportFragmentManager, "Calendar")
        //val datePicker = PrimeDatePickerBottomSheet.newInstance(today, null, null, pickType)

        /*datePicker.setOnDateSetListener(object : PrimeDatePickerBottomSheet.OnDayPickedListener {

            override fun onSingleDayPicked(singleDay: PrimeCalendar) {
                val day = singleDay.shortDateString.replace("/", "-")
                when(position){
                    1 -> {
                        presenter.getDataInsulineDate(position,day, index)
                    }
                    2 -> {
                        presenter.getDataCarDate(position,day, index)
                    }
                }
            }

            override fun onRangeDaysPicked(startDay: PrimeCalendar, endDay: PrimeCalendar) {
                val start = startDay.shortDateString.replace("/", "-")
                val end = endDay.shortDateString.replace("/", "-")

                when(position){
                    0 -> {
                        presenter.getDataGlucoseDate(start, end, position)
                    }
                    3 -> {
                        presenter.getDataExercisesDates(start, end, position)
                    }
                    4 -> {
                        presenter.getDataStatesDates(start, end, position)
                    }
                }
            }

            override fun onMultipleDaysPicked(multipleDays: List<PrimeCalendar>) {
                // TODO
            }
        })

        when(position){
            0 -> {
                if (index == 0){
                    presenter.getDataGlucoseLast(position)
                }else{
                    datePicker.show(supportFragmentManager, "Calendar")
                }
            }
            1 -> {
                if (index == 0){
                    val date = LocalDate.now().toString("yyyy-MM-dd")
                    presenter.getDataInsulineDate(position, date, index)
                }else{
                    datePicker.show(supportFragmentManager, "Calendar")
                }
            }
            2 -> {
                if (index == 0){
                    val date = LocalDate.now().toString("yyyy-MM-dd")
                    presenter.getDataCarDate(position, date,index)
                }else{
                    datePicker.show(supportFragmentManager, "Calendar")
                }
            }
            3 -> {
                if (index == 0){
                    presenter.getDataExercisesLast(position)
                }else{
                    datePicker.show(supportFragmentManager, "Calendar")
                }
            }
            4 -> {
                if (index == 0){
                    presenter.getDataStatesLast(position)
                }else{
                    datePicker.show(supportFragmentManager, "Calendar")
                }
            }
        }*/

    }
    override fun sharedScreenShot(uri: Uri) {
        val shareIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_STREAM, uri)
            type = "image/jpeg"
        }
        startActivity(Intent.createChooser(shareIntent, resources.getText(R.string.daily_detail_share)))
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

