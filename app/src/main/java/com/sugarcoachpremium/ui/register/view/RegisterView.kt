package com.sugarcoachpremium.ui.register.view

import android.graphics.drawable.Drawable
import com.sugarcoachpremium.data.database.repository.dailyregister.Category
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.ui.base.view.BaseView
import java.util.*


interface RegisterView : BaseView {

    fun showSuccessToast()
    fun nextLoad(type: Int,value: Float?, position: String?)
    fun prevLoad(type: Int,value: Float?, position: String?)
    fun finishLoad(points: Int, totalPoints: Int)
    fun backLoad()
    fun showValidationMessage(errorCode: Int)
    fun getUserData(user: User)
    fun setDateMedition(date: Date, medition: Int,categories: List<Category>)
    fun setEmotional(item: RegisterItem)
    fun setExercise(item: RegisterItem)
    fun setExercicesData(items: List<RegisterItem>)
    fun setEmotionsData(items: List<RegisterItem>)
    fun getLabel(name: String): String
    fun getDrawable(name: String): Drawable?
    fun setDialogValue(type: Int, id: String)
    fun setTime(value: Date, medition: Int)
    fun setDate(value: Date)
    fun setImage(image: String)
    fun openDailyActivity()
    fun openMainActivity()
    fun openStatisticActivity()
    fun openTreatmentActivity()
    fun rollBack()


}