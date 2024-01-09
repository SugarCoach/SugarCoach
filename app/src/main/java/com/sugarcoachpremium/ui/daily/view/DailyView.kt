package com.sugarcoachpremium.ui.daily.view

import android.graphics.drawable.Drawable
import com.hominoid.expandablerecyclerviewlib.models.ExpandableListItem
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.ui.base.view.BaseView
import java.util.*
import kotlin.collections.ArrayList


interface DailyView : BaseView {

    fun showSuccessToast()
    fun getUserData(user: User)
    fun getRegisters(registers: MutableList<ExpandableListItem<DailyHeader, DailyItem>>)
    fun setDateMedition(date: Date)
    fun setUp()
    fun openDailyDetailActivity(id: Int)
    fun getLabel(name: String): String
    fun openTreamentActivity()
    fun openStatisticActivity()
    fun openRegisterActivity()
    fun openMainActivity()
    fun mirrorAccount()
    fun getColorsCategory(): ArrayList<Int>
    fun getDrawable(name: String): Drawable?

}