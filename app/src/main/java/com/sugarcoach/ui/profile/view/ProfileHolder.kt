package com.sugarcoach.ui.profile.view

import android.graphics.Color
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoach.R
import com.sugarcoach.databinding.ProfileItemBinding
import com.sugarcoach.ui.treatment.view.TreatmentActivity
import org.joda.time.LocalTime
import java.util.*

class ProfileHolder(private val binding: ProfileItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ProfileItem, activity: ProfileActivity) {
        binding.profileAvatar.setImageDrawable(activity.getDrawable(item.image.toInt()))
        binding.profileAvatar.borderColor = ContextCompat.getColor(activity, R.color.transparent)
        if (item.selected) {
            binding.profileAvatar.borderColor = ContextCompat.getColor(activity, R.color.purple)
        }
        binding.profileAvatar.setOnClickListener { activity.presenter.updateAvatar(position, item) }
    }
}