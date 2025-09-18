package com.sugarcoachpremium.ui.treatment.view

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoachpremium.databinding.TreatmentBasalItemBinding
import org.joda.time.LocalTime
import java.util.*

class TreatmentBasalHoraHolder(private val binding: TreatmentBasalItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun inflateData(item: BasalHoraItem, position: Int, activity: TreatmentActivity, items: ArrayList<String>) {
        // Asumimos que item.name es una cadena de tiempo como "HH:mm"
        try {
            binding.treamentItemBasalLabel.text = LocalTime.parse(item.name).toString("hh:mm a", Locale.getDefault())
        } catch (e: Exception) {
            Log.e("TreatmentBasalHoraHolder", "Error parsing time string: ${item.name}", e)
            binding.treamentItemBasalLabel.text = item.name // Fallback to raw string
        }

        binding.treatmentItemBasalUnidad.setItems(items.toList())

        // Lógica corregida para pre-seleccionar el spinner
        val unitStringToSelect = item.units // Esto es como "0.0", "1.5", etc.
        if (unitStringToSelect.isNotEmpty()) {
            val unitFloatValue = unitStringToSelect.toFloatOrNull()
            if (unitFloatValue != null) {
                // Asumimos que los ítems en el spinner son como "0.0 U", "0.5 U", "1.0 U", etc.
                val targetSpinnerItemString = String.format(Locale.US, "%.1f U", unitFloatValue)
                var indexToSelect = items.indexOf(targetSpinnerItemString)

                if (indexToSelect == -1) {
                    // Fallback: intentar encontrar sin el sufijo " U"
                    val targetSpinnerItemStringNoSuffix = String.format(Locale.US, "%.1f", unitFloatValue)
                    indexToSelect = items.indexOf(targetSpinnerItemStringNoSuffix)
                }

                if (indexToSelect != -1) {
                    binding.treatmentItemBasalUnidad.selectItemByIndex(indexToSelect)
                } else {
                    Log.w("TreatmentBasalHoraHolder", "Unit value '${unitStringToSelect}' (intentó coincidir con '${targetSpinnerItemString}') no encontrado en los ítems del spinner: $items. El spinner no será preseleccionado.")
                }
            } else {
                Log.e("TreatmentBasalHoraHolder", "No se pudo convertir item.units ('${unitStringToSelect}') a Float para la preselección.")
            }
        }

        // Lógica corregida para el listener del spinner
        binding.treatmentItemBasalUnidad.setOnSpinnerItemSelectedListener<String> { _, selectedSpinnerString, _, _ ->
            // selectedSpinnerString es el texto real del ítem del spinner, ej.: "1.5 U"
            // Necesitamos extraer la parte numérica para guardarla.
            var unitValueToSave = item.units // Valor por defecto al original si el parseo falla o selectedSpinnerString es null

            if (selectedSpinnerString != null) {
                // Regex para extraer números de punto flotante de cadenas como "1.5 U", "1.0", "0.5 units"
                val matchResult = Regex("\\d*\\.?\\d+").find(selectedSpinnerString)
                if (matchResult != null) {
                    unitValueToSave = matchResult.groupValues[0] // groupValues[0] es el texto completo coincidente
                } else {
                    Log.w("TreatmentBasalHoraHolder", "No se pudo extraer el valor numérico de la selección del spinner: '$selectedSpinnerString'. Usando original: '${item.units}'")
                }
            }

            val category = BasalHoraItem.Builder()
                .id(item.id)
                .name(item.name) // item.name es la cadena de tiempo, ej.: "08:00"
                .units(unitValueToSave) // Debería ser "1.5", "1.0", "0.5", etc.
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