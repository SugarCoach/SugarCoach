package com.sugarcoachpremium.ui.treatment.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoachpremium.databinding.TreatmentCorrectoraItemBinding
import java.util.*

class TreatmentCorrectoraAdapter(private val activity: TreatmentActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var itemList: MutableList<HorarioItem> = Collections.emptyList()
    lateinit var holder: TreatmentCorrectoraHolder
    lateinit var binding: TreatmentCorrectoraItemBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(activity)
        binding = TreatmentCorrectoraItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        var holder = TreatmentCorrectoraHolder(binding)
        this.holder = holder
        return holder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = itemList[holder.adapterPosition]
        bind(holder as TreatmentCorrectoraHolder, item)
    }


    override fun getItemCount(): Int {
        return itemList.size
    }


    fun setData(itemList: List<HorarioItem>) {
        this.itemList = itemList.toMutableList()
        notifyDataSetChanged()
    }


    fun edit(position: Int, item: HorarioItem) {
        itemList[position] = item
        notifyItemChanged(position)
    }

    fun  getItem(position: Int): HorarioItem {
        return itemList[position]
    }

    private fun bind(holder: TreatmentCorrectoraHolder, item: HorarioItem) {
        holder.inflateData(item, activity)
    }

}