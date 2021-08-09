package com.sugarcoach.ui.daily.view

import android.content.Intent
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getColor
import androidx.recyclerview.widget.RecyclerView
import com.hominoid.expandablerecyclerviewlib.viewholders.ChildViewHolder
import com.hominoid.expandablerecyclerviewlib.viewholders.GroupViewHolder
import com.sugarcoach.R
import com.sugarcoach.ui.daily.presenter.DailyPresenter
import com.sugarcoach.ui.daily_detail.view.DailyDetailActivity
import kotlinx.android.synthetic.main.daily_item.view.*
import java.text.SimpleDateFormat
import java.util.*

class DailyHolder(itemView: View) : ChildViewHolder(itemView) {
    fun setItemClickListener(id: Int) {
        itemView.setOnClickListener {
            val intent = Intent(itemView.context, DailyDetailActivity::class.java)
            intent.putExtra("id", id)
            itemView.context.startActivity(intent)
        }
    }

    fun inflateData(item: DailyItem, activity: DailyActivity) {
        itemView.daily_exercise_iv.visibility = View.GONE
        itemView.daily_emotional_iv.visibility = View.GONE
        itemView.daily_exercise_tv.visibility = View.GONE
        itemView.daily_emotional_tv.visibility = View.GONE
        itemView.daily_cardview.setCardBackgroundColor(item.bgColor)
        itemView.daily_glu_text.setTextColor( item.bgColor)
        itemView.daily_correcto_text.setTextColor( item.bgColor)
        itemView.daily_basal_text.setTextColor( item.bgColor)
        itemView.daily_hc_text.setTextColor(item.bgColor)
        item.glucose?.let {
            itemView.daily_glu_tv.text = it
            itemView.daily_glu_tv.setTextColor(getColor(itemView.context, item.gluColor))
        }
        item.category?.let { itemView.daily_category_tv.text = it }
        item.carbohydrates?.let { itemView.daily_hc_tv.text = it }
        item.date?.let {dateString ->
            val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
            val formattedTime = formatterTime.format(dateString)
            itemView.daily_time_tv.text = formattedTime

        }
        item.basal?.let { itemView.daily_basal_tv.text = it }
        item.insulin?.let { itemView.daily_correcto_tv.text = it }
        item.exercise?.let {
            val intDrawer = activity.getDrawable(it.exercise_icono)
            intDrawer?.let { drawable ->
                itemView.daily_exercise_iv.setImageDrawable(drawable)
                itemView.daily_exercise_tv.text = activity.getLabel(it.exercise_name)
                itemView.daily_exercise_iv.visibility = View.VISIBLE
                itemView.daily_exercise_tv.visibility = View.VISIBLE
            }
        }
        item.state?.let {
            val intDrawer = activity.getDrawable(it.state_icono)
            intDrawer?.let { drawable ->
                itemView.daily_emotional_iv.setImageDrawable(drawable)
                itemView.daily_emotional_tv.text = activity.getLabel(it.state_name)
                itemView.daily_emotional_iv.visibility = View.VISIBLE
                itemView.daily_emotional_tv.visibility = View.VISIBLE
            }
        }
    }


}