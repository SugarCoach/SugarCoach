package com.sugarcoach.ui.treatment.view

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.treatment_correctora_item.view.*

class TreatmentCorrectoraHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    fun inflateData(item: HorarioItem, activity: TreatmentActivity) {
        itemView.treament_item_correctora_label.text = item.name
        itemView.treament_item_correctora_horario.isChecked = item.selected
        itemView.treament_item_correctora_horario.setOnCheckedChangeListener { buttonView, isChecked ->
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