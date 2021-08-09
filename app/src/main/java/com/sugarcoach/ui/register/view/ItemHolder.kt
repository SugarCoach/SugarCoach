package com.sugarcoach.ui.register.view

import android.view.View
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.emotions_item.view.*

class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun inflateData(item: RegisterItem, activity: RegisterActivity, type: Int) {
            itemView.emotions_item_text.text = activity.getLabel(item.name)
            itemView.emotions_item_img.setImageDrawable(activity.getDrawable(item.image))
            itemView.emotions_item_linear.setOnClickListener{
                when(type){
                    1 -> activity.presenter.setEmocional(item.id)
                    2 -> activity.presenter.setExercises(item.id)
                }

            }
        }
}