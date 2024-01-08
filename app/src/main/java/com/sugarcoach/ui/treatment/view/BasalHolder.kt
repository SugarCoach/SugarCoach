package com.sugarcoach.ui.treatment.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoach.data.database.repository.dailyregister.Category
import com.sugarcoach.databinding.BasalItemBinding
import com.sugarcoach.databinding.CategoryItemBinding
import com.sugarcoach.ui.daily_detail.view.CategoriesHolder
import com.sugarcoach.ui.daily_detail.view.DailyDetailActivity

class BasalHolder(private val binding: BasalItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: BasalItem) {
        binding.basalValue.text = item.name
    }

    companion object {
        fun create(parent: ViewGroup): BasalHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = BasalItemBinding.inflate(inflater, parent, false)
            return BasalHolder(binding)
        }
    }
}