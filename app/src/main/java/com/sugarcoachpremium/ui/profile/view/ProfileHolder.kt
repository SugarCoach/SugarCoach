package com.sugarcoachpremium.ui.profile.view

import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoachpremium.R
import com.sugarcoachpremium.databinding.ProfileItemBinding
import java.util.*

class ProfileHolder(private val binding: ProfileItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ProfileItem, activity: ProfileActivity) {
        binding.profileAvatar.setImageDrawable(activity.getDrawable(item.image))
        binding.profileAvatar.borderColor = ContextCompat.getColor(activity, R.color.transparent)
        if (item.selected) {
            binding.profileAvatar.borderColor = ContextCompat.getColor(activity, R.color.purple)
        }
        binding.profileAvatar.setOnClickListener { activity.presenter.updateAvatar(position, item) }
    }
}