package com.sugarcoach.ui.treatment.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoach.R
import com.sugarcoach.databinding.TreatmentBasalItemBinding
import java.util.*

class TreatmentBasalHoraAdapter(private val activity: TreatmentActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var itemList: MutableList<BasalHoraItem> = Collections.emptyList()
    lateinit var holder: TreatmentBasalHoraHolder
    lateinit var binding: TreatmentBasalItemBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(activity)
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
        var items = ArrayList<String>()
        for (i in 1 until 36){
            items.add(i.toString())
        }
        holder.inflateData(item,holder.adapterPosition, activity, items)
    }

}