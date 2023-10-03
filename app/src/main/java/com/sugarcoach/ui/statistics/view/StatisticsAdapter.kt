package com.sugarcoach.ui.statistics.view

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.github.islamkhsh.CardSliderAdapter
import com.sugarcoach.R
import com.sugarcoach.databinding.StatisticsItemBinding
import java.util.*

class StatisticsAdapter(private val activity: StatisticsActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var itemList: MutableList<StatisticsItem> = Collections.emptyList()
    lateinit var holder: StatisticsHolder
    lateinit var binding: StatisticsItemBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(activity)
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