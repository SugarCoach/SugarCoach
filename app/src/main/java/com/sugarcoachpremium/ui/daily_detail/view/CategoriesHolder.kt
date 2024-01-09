package com.sugarcoachpremium.ui.daily_detail.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoachpremium.data.database.repository.dailyregister.Category
import com.sugarcoachpremium.databinding.CategoryItemBinding
import java.util.*

class CategoriesHolder(private val binding: CategoryItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Category, activity: DailyDetailActivity) {
        binding.categoryName.text = activity.getLabel(item.cate_name)
    }

    companion object {
        fun create(parent: ViewGroup): CategoriesHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = CategoryItemBinding.inflate(inflater, parent, false)
            return CategoriesHolder(binding)
        }
    }
}