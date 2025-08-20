package com.sugarcoach.ui.register.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoach.data.database.repository.dailyregister.Category
import com.sugarcoach.databinding.CategoryItemBinding

class CategoriesHolder(private val binding: CategoryItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Category, activity: RegisterActivity) {
        binding.categoryName.text = activity.getLabel(item.cate_name)
    }

    /*companion object {
        fun create(parent: ViewGroup): CategoriesHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = CategoryItemBinding.inflate(inflater, parent, false)
            return CategoriesHolder(binding)
        }
    }*/
}