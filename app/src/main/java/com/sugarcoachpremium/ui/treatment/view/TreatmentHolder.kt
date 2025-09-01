package com.sugarcoachpremium.ui.treatment.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoachpremium.R
import com.sugarcoachpremium.databinding.TreatmentItemBinding
import java.util.*

class TreatmentHolder(private val binding: TreatmentItemBinding) : RecyclerView.ViewHolder(binding.root) {

    private var isProgrammaticChange = false

    fun inflateData(item: HorarioItem, position: Int, activity: TreatmentActivity, items: ArrayList<String>) {
        binding.treamentItemLabel.text = item.name

        isProgrammaticChange = true
        binding.treatmentItemHorario.isChecked = item.selected
        isProgrammaticChange = false
        binding.treatmentItemUnidad.setItems(items.toList())


        item.units.let {
            if (it.isNotEmpty() && it != "0" && binding.treatmentItemHorario.isChecked) {
                binding.treatmentItemUnidad.selectItemByIndex(it.toInt() - 1)
            }
        }



        binding.treatmentItemHorario.setOnCheckedChangeListener { _, isChecked ->
            if (isProgrammaticChange) {
                return@setOnCheckedChangeListener
            }

            if (isChecked){
                if (items.isNotEmpty()) {
                    isProgrammaticChange = true
                    binding.treatmentItemUnidad.selectItemByIndex(0)
                    isProgrammaticChange = false

                    val category = HorarioItem.Builder()
                        .id(item.id)
                        .name(item.name)
                        .selected(true)
                        .units("1")
                        .categoryId(item.categoryId)
                        .build()
                    activity.presenter.saveCategory(category)
                }
            }else {
                binding.treatmentItemUnidad.text = ""
                binding.treatmentItemUnidad.hint = activity.getString(R.string.treatment_unit_txt)
                val category = HorarioItem.Builder()
                    .id(item.id)
                    .name(item.name)
                    .selected(false)
                    .units("0")
                    .categoryId(item.categoryId)
                    .build()
                activity.presenter.saveCategory(category)
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
        binding.treatmentItemUnidad.setOnSpinnerItemSelectedListener<String> { _, _, _, newItem ->
            isProgrammaticChange = true
            binding.treatmentItemHorario.isChecked = true
            isProgrammaticChange = false

            val category = HorarioItem.Builder()
                    .id(item.id)
                    .name(item.name)
                    .selected(true)
                    .units(newItem ?: "0")
                    .categoryId(item.categoryId)
                    .build()
                activity.presenter.saveCategory(category)

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