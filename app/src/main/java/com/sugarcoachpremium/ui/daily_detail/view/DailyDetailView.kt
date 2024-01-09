package com.sugarcoachpremium.ui.daily_detail.view

import android.graphics.drawable.Drawable
import android.net.Uri
import com.sugarcoachpremium.data.database.repository.dailyregister.Category
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister
import com.sugarcoachpremium.ui.base.view.BaseView
import java.util.*


interface DailyDetailView : BaseView {

    fun showSuccessToast()
    fun getData(daily: DailyRegister)
    fun setDateMedition(date: Date)
    fun setEmotional(item: DailyItem)
    fun setExercise(item: DailyItem)
    fun showSuccessToastUpdate()
    fun enableViews()
    fun setImage(image: String)
    fun setTime(value: Date)
    fun setDate(value: Date)
    fun showDialogOK(message: String)
    fun explain(msg: Int)
    fun sharedScreenShot(uri: Uri)
    fun openTreamentActivity()
    fun openStatisticActivity()
    fun openRegisterActivity()
    fun openMainActivity()
    fun getLabel(name: String): String
    fun getDrawable(name: String): Drawable?
    fun setCategories(categories: List<Category>, index: Int)
    fun mirrorAccount()
    fun setExercicesData(items: List<DailyItem>)
    fun setEmotionsData(items: List<DailyItem>)
    fun init()


}