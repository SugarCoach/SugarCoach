package com.sugarcoach.ui.treatment.view

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.basal_item.view.*

class MedidorHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    fun inflateData(item: BasalItem) {
        itemView.basal_value.text = item.name
    }
}