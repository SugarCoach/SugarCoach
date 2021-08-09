package com.sugarcoach.ui.daily.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hominoid.expandablerecyclerviewlib.adapter.ExpandableRecyclerViewAdapter
import com.hominoid.expandablerecyclerviewlib.models.ExpandableListItem
import com.hominoid.expandablerecyclerviewlib.viewholders.GroupViewHolder
import com.sugarcoach.R
import java.text.SimpleDateFormat
import java.util.*

class DailyAdapter(private val context: DailyActivity,groups: List<ExpandableListItem<*, *>>) : ExpandableRecyclerViewAdapter<DailyAdapter.HeaderViewHolder, DailyHolder>(groups) {



    class HeaderViewHolder(itemView: View) :GroupViewHolder(itemView) {

        val title: TextView = itemView.findViewById(R.id.daily_parent_date_txt)
    }

    override fun onBindChildViewHolder(holder: DailyHolder, flatPosition: Int, group: ExpandableListItem<*, *>, childIndex: Int) {
        var itemList = group.childDataList
        var item = itemList?.get(childIndex) as DailyItem
        holder.inflateData(item, context)
        holder.setItemClickListener(item.id)
    }

    override fun onBindGroupViewHolder(
        holder: HeaderViewHolder,
        flatPosition: Int,
        group: ExpandableListItem<*, *>
    ) {
        val formatter = SimpleDateFormat("EEEE dd.M.yy", Locale.getDefault())
        var item = group.groupData as DailyHeader
        val formattedDate = formatter.format(item.date)
        holder.title.text = formattedDate
    }

    override fun onCreateChildViewHolder(parent: ViewGroup, viewType: Int): DailyHolder {
        val inflater: LayoutInflater = LayoutInflater.from(context)
        return DailyHolder(inflater.inflate(R.layout.daily_item, parent, false))

    }

    override fun onCreateGroupViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(context)
        return HeaderViewHolder(inflater.inflate(R.layout.daily_parent, parent, false))
    }

}