package com.sugarcoach.ui.daily.view

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hominoid.expandablerecyclerviewlib.listener.GroupExpandCollapseListener
import com.hominoid.expandablerecyclerviewlib.models.ExpandableListItem
import com.sugarcoach.R
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.databinding.ActivityConfigBinding
import com.sugarcoach.databinding.ActivityDailyBinding
import com.sugarcoach.ui.base.view.BaseActivity
import com.sugarcoach.ui.daily.interactor.DailyInteractorImp
import com.sugarcoach.ui.daily.presenter.DailyPresenterImp
import com.sugarcoach.ui.daily_detail.view.DailyDetailActivity
import com.sugarcoach.ui.main.view.MainActivity
import com.sugarcoach.ui.register.view.RegisterActivity
import com.sugarcoach.ui.statistics.view.StatisticsActivity
import com.sugarcoach.ui.treatment.view.TreatmentActivity
import com.sugarcoach.util.extensions.resIdByName
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
        binding.dailyPdfIv.setOnClickListener { showErrorToast() }
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
}
