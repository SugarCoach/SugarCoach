package com.sugarcoachpremium.ui.daily_detail.view

import androidx.recyclerview.widget.RecyclerView
import com.sugarcoachpremium.databinding.EmotionsItemBinding


class ItemHolder(private val binding: EmotionsItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun inflateData(item: DailyItem, activity: DailyDetailActivity, type: Int) {
            binding.emotionsItemText.text = activity.getLabel(item.name)
            binding.emotionsItemImg.setImageDrawable(activity.getDrawable(item.image))
            binding.emotionsItemLinear.setOnClickListener{
                when(type){
                    1 -> activity.presenter.updateEmotional(item.id)
                    2 -> activity.presenter.updateExercise(item.id)
                }

            }
        }
}