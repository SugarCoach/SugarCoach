package com.sugarcoach.ui.treatment.view

import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_treatment.*
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

        if (item.units.isNotEmpty() && item.units != "0.0")
        {
            itemView.treatment_item_unidad.setText(item.units)
        }

        itemView.treatment_item_unidad.setOnEditorActionListener { v, actionId, event ->
            if(actionId == EditorInfo.IME_ACTION_NEXT && itemView.treatment_item_horario.isChecked){
                var unit = v.treatment_item_unidad.text.toString().replace(",", ".")
                val category = HorarioItem.Builder()
                    .id(item.id)
                    .name(item.name)
                    .selected(true)
                    .units(unit)
                    .categoryId(item.categoryId)
                    .build()
                activity.presenter.saveCategory(category)
            }
            false
        }
    }
}