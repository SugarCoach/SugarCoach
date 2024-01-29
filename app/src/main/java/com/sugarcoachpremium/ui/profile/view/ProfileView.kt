package com.sugarcoachpremium.ui.profile.view

import android.graphics.drawable.Drawable
import android.net.Uri
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.ui.base.view.BaseView
import java.util.*


interface ProfileView : BaseView {

    fun showSuccessToast()

    fun createCongratsDialog(points: Int, totalPoints: Int)
    fun getUserData(user: User)
    fun setBirthday(value: Date)
    fun setDebut(value: Date)
    fun openLoginActivity()
    fun setDateMedition(date: Date)
    fun setSex(sex: String)
    fun sharedScreenShot(uri: Uri)
    fun explain(msg: Int)
    fun getDrawable(name: String): Drawable?
    fun setAvatars(avatars: List<ProfileItem>)
    fun setAvatar(id: Int)


}