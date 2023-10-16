package com.sugarcoach.ui.register.view

import android.view.View
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.sugarcoach.databinding.EmotionsItemBinding

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