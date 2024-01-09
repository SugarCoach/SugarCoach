package com.sugarcoachpremium.ui.register.view

import androidx.recyclerview.widget.RecyclerView
import com.sugarcoachpremium.data.database.repository.dailyregister.Category
import com.sugarcoachpremium.databinding.CategoryItemBinding

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