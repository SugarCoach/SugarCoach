package com.sugarcoachpremium.ui.treatment.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoachpremium.databinding.TreatmentBasalItemBinding
import org.joda.time.LocalTime
import java.util.*

class TreatmentBasalHoraHolder(private val binding: TreatmentBasalItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun inflateData(item: BasalHoraItem, position: Int, activity: TreatmentActivity, items: ArrayList<String>) {
        binding.treamentItemBasalLabel.text = LocalTime(item.name).toString("hh:mm a", Locale.getDefault())
        binding.treatmentItemBasalUnidad.setItems(items.toList())
        item.units.let {
            if(it.isNotEmpty() && it != "0") {
                binding.treatmentItemBasalUnidad.selectItemByIndex(item.units.toInt()-1)
            }
        }

        //ORIGINAL
//        binding.treatmentItemBasalUnidad.setOnSpinnerItemSelectedListener<String> { index, unit ->
//                val category = BasalHoraItem.Builder()
//                    .id(item.id)
//                    .name(item.name)
//                    .units(unit)
//                    .build()
//                activity.presenter.saveHoraBasal(category)
//
//        }

        // SUSTITUCION 25/08/2025
        binding.treatmentItemBasalUnidad.setOnSpinnerItemSelectedListener<String> { index, unit, parentIndex, parentText ->
            val category = BasalHoraItem.Builder()
                .id(item.id)
                .name(item.name)
                .units(unit ?: "")
                .build()
            activity.presenter.saveHoraBasal(category)
        }

    }
    companion object {
        fun create(parent: ViewGroup): TreatmentBasalHoraHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = TreatmentBasalItemBinding.inflate(inflater, parent, false)
            return TreatmentBasalHoraHolder(binding)
        }
    }
}