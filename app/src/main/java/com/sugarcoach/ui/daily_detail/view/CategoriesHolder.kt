package com.sugarcoach.ui.daily_detail.view

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoach.data.database.repository.dailyregister.Category
import com.sugarcoach.ui.treatment.view.BasalItem
import kotlinx.android.synthetic.main.basal_item.view.*
import kotlinx.android.synthetic.main.category_item.view.*
import java.util.*

class CategoriesHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    fun inflateData(item: Category, activity: DailyDetailActivity) {
        itemView.category_name.text = activity.getLabel(item.cate_name)
    }
}