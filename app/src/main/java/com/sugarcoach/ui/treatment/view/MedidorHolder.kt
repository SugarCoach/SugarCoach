package com.sugarcoach.ui.treatment.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoach.data.database.repository.dailyregister.Category
import com.sugarcoach.databinding.BasalItemBinding
import com.sugarcoach.databinding.CategoryItemBinding
import com.sugarcoach.ui.daily_detail.view.DailyDetailActivity
import com.sugarcoach.ui.register.view.CategoriesHolder

class MedidorHolder(private val binding: BasalItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Category, activity: DailyDetailActivity) {
        binding.basalValue.text = activity.getLabel(item.cate_name)
    }

    companion object {
        fun create(parent: ViewGroup): MedidorHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = BasalItemBinding.inflate(inflater, parent, false)
            return MedidorHolder(binding)
        }
    }
}