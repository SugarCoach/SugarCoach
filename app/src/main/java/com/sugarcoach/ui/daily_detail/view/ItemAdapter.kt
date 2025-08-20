package com.sugarcoach.ui.daily_detail.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoach.R
import com.sugarcoach.databinding.EmotionsItemBinding
import java.util.*

class ItemAdapter(private val activity: DailyDetailActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var itemList: MutableList<DailyItem> = Collections.emptyList()
    private var type= 0;
    lateinit var binding: EmotionsItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(activity)
        binding = EmotionsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemHolder(binding)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }


    fun setData(itemList: List<DailyItem>, type: Int) {
        this.type = type;
        this.itemList = itemList.toMutableList()
        notifyDataSetChanged()
    }


    fun edit(position: Int, item: DailyItem) {
        itemList.set(position, item)
        notifyDataSetChanged()
    }

    fun  getItem(position: Int): DailyItem {
        return itemList.get(position)
    }

    private fun bind(holder: ItemHolder, item: DailyItem) {
        holder.inflateData(item,activity,type)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = itemList[holder.adapterPosition]
        bind(holder as ItemHolder, item)
    }

}