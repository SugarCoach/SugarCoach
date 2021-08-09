package com.sugarcoach.ui.profile.view

import android.graphics.Color
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoach.R
import kotlinx.android.synthetic.main.activity_treatment.view.*
import kotlinx.android.synthetic.main.profile_item.view.*
import kotlinx.android.synthetic.main.treatment_basal_item.view.*
import kotlinx.android.synthetic.main.treatment_item.view.*
import org.joda.time.LocalTime
import java.util.*

class ProfileHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    fun inflateData(item: ProfileItem, position: Int, activity: ProfileActivity) {
        itemView.profile_avatar.setImageDrawable(activity.getDrawable(item.image))
        itemView.profile_avatar.borderColor = ContextCompat.getColor(activity, R.color.transparent)
        if (item.selected){
            itemView.profile_avatar.borderColor = ContextCompat.getColor(activity, R.color.purple)
        }
        itemView.profile_avatar.setOnClickListener { activity.presenter.updateAvatar(position,item) }
    }
}