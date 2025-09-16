package com.sugarcoachpremium.ui.treatment.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoachpremium.R
import com.sugarcoachpremium.databinding.TreatmentItemBinding
import java.util.*

class TreatmentHolder(private val binding: TreatmentItemBinding) : RecyclerView.ViewHolder(binding.root) {

    private var isProgrammaticChange = false

    fun inflateData(item: HorarioItem, position: Int, activity: TreatmentActivity) {
        binding.treamentItemLabel.text = item.name

        isProgrammaticChange = true
        binding.treatmentItemHorario.isChecked = item.selected
        isProgrammaticChange = false

        if (item.units.isNotEmpty() && item.units != "0" && binding.treatmentItemHorario.isChecked) {
            binding.treatmentItemUnidad.setText(item.units)
        } else {
            binding.treatmentItemUnidad.setText("")
        }

        binding.treatmentItemHorario.setOnCheckedChangeListener { _, isChecked ->
            if (isProgrammaticChange) return@setOnCheckedChangeListener

            if (isChecked) {
                isProgrammaticChange = true
                binding.treatmentItemUnidad.setText("1.00")
                isProgrammaticChange = false

                val category = HorarioItem.Builder()
                    .id(item.id)
                    .name(item.name)
                    .selected(true)
                    .units("1.00")
                    .categoryId(item.categoryId)
                    .build()
                activity.presenter.saveCategory(category)
            } else {
                binding.treatmentItemUnidad.setText("")
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

        binding.treatmentItemUnidad.addTextChangedListener { text ->
            val value = text?.toString()?.trim()
            val units = if (value.isNullOrEmpty()) "0" else value
            val number = units.toDoubleOrNull() ?: 0.0

            if (number > 35.0) {
                binding.treatmentItemUnidad.setText("35.00")
                binding.treatmentItemUnidad.setSelection(binding.treatmentItemUnidad.text?.length ?: 0)
            }

            if (!isProgrammaticChange) {
                isProgrammaticChange = true
                binding.treatmentItemHorario.isChecked = true
                isProgrammaticChange = false

                val category = HorarioItem.Builder()
                    .id(item.id)
                    .name(item.name)
                    .selected(true)
                    .units(units)
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