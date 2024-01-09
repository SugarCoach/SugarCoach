package com.sugarcoachpremium.ui.register.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoachpremium.databinding.EmotionsItemBinding
import java.util.*

class ItemAdapter(private val activity: RegisterActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var itemList: MutableList<RegisterItem> = Collections.emptyList()
    private var type= 0;
    lateinit var binding: EmotionsItemBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(activity)
        binding = EmotionsItemBinding.inflate(inflater)
        return ItemHolder(binding)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }


    fun setData(itemList: List<RegisterItem>, type: Int) {
        this.type = type;
        this.itemList = itemList.toMutableList()
        notifyDataSetChanged()
    }


    fun edit(position: Int, item: RegisterItem) {
        itemList.set(position, item)
        notifyDataSetChanged()
    }

    fun  getItem(position: Int): RegisterItem {
        return itemList.get(position)
    }

    private fun bind(holder: ItemHolder, item: RegisterItem) {
        holder.inflateData(item,activity,type)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = itemList[holder.adapterPosition]
        bind(holder as ItemHolder, item)
    }

}