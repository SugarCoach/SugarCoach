package com.sugarcoach.ui.treatment.view

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.treatment_item.view.*
import java.util.*

class TreatmentHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    fun inflateData(item: HorarioItem, position: Int, activity: TreatmentActivity, items: ArrayList<String>) {
        itemView.treament_item_label.text = item.name
        itemView.treatment_item_horario.isChecked = item.selected
        itemView.treatment_item_horario.setOnCheckedChangeListener { buttonView, isChecked ->
            if (!isChecked){
                val category = HorarioItem.Builder()
                    .id(item.id)
                    .name(item.name)
                    .selected(false)
                    .units(item.units)
                    .categoryId(item.categoryId)
                    .build()
                activity.presenter.saveCategory(category)
            }
        }
        itemView.treatment_item_unidad.setItems(items.toList())
        item.units.let {
            if(it.isNotEmpty() && itemView.treatment_item_horario.isChecked) {
                itemView.treatment_item_unidad.selectItemByIndex(item.units.toInt()-1)
            }
        }
        itemView.treatment_item_unidad.setOnSpinnerItemSelectedListener<String> { index, unit ->
            if (itemView.treatment_item_horario.isChecked){
                val category = HorarioItem.Builder()
                    .id(item.id)
                    .name(item.name)
                    .selected(true)
                    .units(unit)
                    .categoryId(item.categoryId)
                    .build()
                activity.presenter.saveCategory(category)
            }
        }
    }
}