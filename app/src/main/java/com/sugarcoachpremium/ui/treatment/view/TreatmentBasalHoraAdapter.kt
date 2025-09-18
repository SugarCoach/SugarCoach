package com.sugarcoachpremium.ui.treatment.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoachpremium.databinding.TreatmentBasalItemBinding
import java.util.*

class TreatmentBasalHoraAdapter(private val activity: TreatmentActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var itemList: MutableList<BasalHoraItem> = Collections.emptyList()
    lateinit var holder: TreatmentBasalHoraHolder
    lateinit var binding: TreatmentBasalItemBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(activity)
        binding = TreatmentBasalItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        var holder = TreatmentBasalHoraHolder(binding)
        this.holder = holder
        return holder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = itemList[holder.adapterPosition]
        bind(holder as TreatmentBasalHoraHolder, item)
    }


    override fun getItemCount(): Int {
        return itemList.size
    }


    fun setData(itemList: List<BasalHoraItem>) {
        this.itemList = itemList.toMutableList()
        notifyDataSetChanged()
    }


    fun edit(position: Int, item: BasalHoraItem) {
        itemList[position] = item
        notifyItemChanged(position)
    }

    fun  getItem(position: Int): BasalHoraItem {
        return itemList[position]
    }

    private fun bind(holder: TreatmentBasalHoraHolder, item: BasalHoraItem) {
        val items = ArrayList<String>()
        var currentValue = 0.0f
        val maxValue = 35.0f
        val step = 0.1f // Incremento

        while (currentValue <= maxValue) {
            // Formatea el número a un decimal y añade el sufijo " U"
            items.add(String.format(Locale.US, "%.1f U", currentValue))
            currentValue += step
            // Redondeo simple para mitigar problemas de precisión con floats
            // Para mayor precisión, se podría usar BigDecimal
            currentValue = Math.round(currentValue * 10.0f) / 10.0f
        }
        // Asegurarse de que el último valor (35.0 U) se incluya si el bucle termina justo antes
        // Esto es una salvaguarda, el while (currentValue <= maxValue) debería manejarlo.
        if (!items.contains(String.format(Locale.US, "%.1f U", maxValue)) && maxValue > (currentValue - step)) {
             items.add(String.format(Locale.US, "%.1f U", maxValue))
        }

        holder.inflateData(item, holder.adapterPosition, activity, items)
    }

}