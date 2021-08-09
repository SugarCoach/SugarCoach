package com.sugarcoach.ui.profile.view

import android.graphics.drawable.Drawable
import android.net.Uri
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.ui.base.view.BaseView
import java.util.*


interface ProfileView : BaseView {

    fun showSuccessToast()
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