package com.sugarcoachpremium.ui.treatment.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoachpremium.databinding.TreatmentItemBinding
import java.util.*

class TreatmentHolder(private val binding: TreatmentItemBinding) : RecyclerView.ViewHolder(binding.root) {


    fun inflateData(item: HorarioItem, position: Int, activity: TreatmentActivity, items: ArrayList<String>) {
        binding.treamentItemLabel.text = item.name
        binding.treatmentItemHorario.isChecked = item.selected
        binding.treatmentItemHorario.setOnCheckedChangeListener { buttonView, isChecked ->
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
        binding.treatmentItemUnidad.setItems(items.toList())
        item.units.let {
            if(it.isNotEmpty() && binding.treatmentItemHorario.isChecked) {
                binding.treatmentItemUnidad.selectItemByIndex(item.units.toInt()-1)
            }
        }

        //ORIGINAL
//        binding.treatmentItemUnidad.setOnSpinnerItemSelectedListener<String> { index, unit ->
//            if (binding.treatmentItemHorario.isChecked){
//                val category = HorarioItem.Builder()
//                    .id(item.id)
//                    .name(item.name)
//                    .selected(true)
//                    .units(unit)
//                    .categoryId(item.categoryId)
//                    .build()
//                activity.presenter.saveCategory(category)
//            }
//        }


        //SUSTITUCION 25/08/2025
        binding.treatmentItemUnidad.setOnSpinnerItemSelectedListener<String> { index, unit, parentIndex, parentText ->
            if (binding.treatmentItemHorario.isChecked){
                val category = HorarioItem.Builder()
                    .id(item.id)
                    .name(item.name)
                    .selected(true)
                    .units(unit ?: "")
                    .categoryId(item.categoryId)
                    .build()
                activity.presenter.saveCategory(category)
            }
        }

    }

    companion object {
        fun create(parent: ViewGroup): TreatmentHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = TreatmentItemBinding.inflate(inflater, parent, false)
            return TreatmentHolder(binding)
        }
    }
}