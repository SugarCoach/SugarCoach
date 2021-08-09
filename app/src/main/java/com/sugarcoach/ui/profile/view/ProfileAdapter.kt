package com.sugarcoach.ui.profile.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoach.R
import java.util.*

class ProfileAdapter(private val activity: ProfileActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var itemList: MutableList<ProfileItem> = Collections.emptyList()
    lateinit var holder: ProfileHolder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(activity)
        var holder = ProfileHolder(inflater.inflate(R.layout.profile_item, parent, false))
        this.holder = holder
        return holder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = itemList[holder.adapterPosition]
        bind(holder as ProfileHolder, item)
    }


    override fun getItemCount(): Int {
        return itemList.size
    }


    fun setData(itemList: List<ProfileItem>) {
        this.itemList = itemList.toMutableList()
        notifyDataSetChanged()
    }


    fun edit(position: Int) {
        itemList.forEach { it -> it.selected = false }
        itemList[position].selected = true
        notifyDataSetChanged()
    }
    fun setAvatar(name: String) {
        itemList.filter { it.image.equals(name) }.single().selected = true
        notifyDataSetChanged()
    }
    fun  getItem(position: Int): ProfileItem {
        return itemList[position]
    }

    private fun bind(holder: ProfileHolder, item: ProfileItem) {
        holder.inflateData(item,holder.adapterPosition, activity)
    }

}