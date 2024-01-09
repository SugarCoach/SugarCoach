package com.sugarcoachpremium.ui.statistics.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoachpremium.databinding.StatisticsItemBinding
import java.util.*

class StatisticsAdapter(private val activity: StatisticsActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var itemList: MutableList<StatisticsItem> = Collections.emptyList()
    lateinit var holder: StatisticsHolder
    lateinit var binding: StatisticsItemBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(activity)
        binding = StatisticsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        var holder = StatisticsHolder(binding)
        this.holder = holder
        return holder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = itemList[position]
        bind(holder as StatisticsHolder, item)
    }


    override fun getItemCount(): Int {
        return itemList.size
    }


    fun setData(itemList: List<StatisticsItem>) {
        this.itemList = itemList.toMutableList()
        notifyDataSetChanged()
    }


    fun edit(position: Int, item: StatisticsItem) {
        itemList[position] = item
        notifyItemChanged(position)
    }

    fun  getItem(position: Int): StatisticsItem {
        return itemList[position]
    }

    private fun bind(holder: StatisticsHolder, item: StatisticsItem) {
        holder.inflateData(item,holder.adapterPosition,activity)
    }

}