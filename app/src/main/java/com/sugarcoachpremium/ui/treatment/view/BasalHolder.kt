package com.sugarcoachpremium.ui.treatment.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoachpremium.databinding.BasalItemBinding

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