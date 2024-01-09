package com.sugarcoachpremium.ui.register.view

import androidx.recyclerview.widget.RecyclerView
import com.sugarcoachpremium.databinding.EmotionsItemBinding

class ItemHolder(private val binding: EmotionsItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun inflateData(item: RegisterItem, activity: RegisterActivity, type: Int) {
            binding.emotionsItemText.text = activity.getLabel(item.name)
            binding.emotionsItemImg.setImageDrawable(activity.getDrawable(item.image))
            binding.emotionsItemLinear.setOnClickListener{
                when(type){
                    1 -> activity.presenter.setEmocional(item.id)
                    2 -> activity.presenter.setExercises(item.id)
                }

            }
        }
}