package com.sugarcoach.ui.treatment.view

import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_treatment.view.*
import kotlinx.android.synthetic.main.treatment_basal_item.view.*
import kotlinx.android.synthetic.main.treatment_item.view.*
import org.joda.time.LocalTime
import java.util.*

class TreatmentBasalHoraHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    fun inflateData(item: BasalHoraItem, position: Int, activity: TreatmentActivity, items: ArrayList<String>) {
        itemView.treament_item_basal_label.text = LocalTime(item.name).toString("hh:mm a", Locale.getDefault())

        if(item.units.isNotEmpty() && item.units != "0.0")
        {
            itemView.treatment_item_basal_unidad.setText(item.units)
        }

        itemView.treatment_item_basal_unidad.setOnEditorActionListener { v, actionid, event ->
            if(actionid == EditorInfo.IME_ACTION_NEXT){
                var unit = v.treatment_item_basal_unidad.text.toString().replace(",", ".")
                val category = BasalHoraItem.Builder()
                    .id(item.id)
                    .name(item.name)
                    .units(unit)
                    .build()
                activity.presenter.saveHoraBasal(category)
            }
            false
        }
    }
}