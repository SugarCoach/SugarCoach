package com.sugarcoach.ui.treatment.view

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoach.databinding.TreatmentCorrectoraItemBinding

class TreatmentCorrectoraHolder(private val binding: TreatmentCorrectoraItemBinding)
    : RecyclerView.ViewHolder(binding.root) {


    fun inflateData(item: HorarioItem, activity: TreatmentActivity) {
        binding.treamentItemCorrectoraLabel.text = item.name
        binding.treamentItemCorrectoraHorario.isChecked = item.selected
        binding.treamentItemCorrectoraHorario.setOnCheckedChangeListener { buttonView, isChecked ->
                val category = HorarioItem.Builder()
                    .id(item.id)
                    .name(item.name)
                    .selected(isChecked)
                    .categoryId(item.categoryId)
                    .build()
                activity.presenter.saveCorrectoraCategory(category)
        }
    }
}