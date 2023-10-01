package com.sugarcoach.ui.treatment.view

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_treatment.view.*
import kotlinx.android.synthetic.main.treatment_basal_item.view.*
import kotlinx.android.synthetic.main.treatment_item.view.*
import org.joda.time.LocalTime
import java.util.*

class TreatmentBasalHoraHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    fun inflateData(item: BasalHoraItem, position: Int, activity: TreatmentActivity, items: ArrayList<String>) {
        itemView.treament_item_basal_label.text = LocalTime(item.name).toString("hh:mm a", Locale.getDefault())
        itemView.treatment_item_basal_unidad.setItems(items.toList())
        item.units.let {
            if(it.isNotEmpty() && it != "0") {
                itemView.treatment_item_basal_unidad.selectItemByIndex(item.units.toInt()-1)
            }
        }
        itemView.treatment_item_basal_unidad.setOnSpinnerItemSelectedListener<String> { index, unit ->
                val category = BasalHoraItem.Builder()
                    .id(item.id)
                    .name(item.name)
                    .units(unit)
                    .build()
                activity.presenter.saveHoraBasal(category)

        }
    }
}