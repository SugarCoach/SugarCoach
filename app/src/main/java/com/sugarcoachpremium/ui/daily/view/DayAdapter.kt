package com.sugarcoachpremium.ui.daily.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sugarcoachpremium.databinding.RegisterMonthBinding
import com.sugarcoachpremium.databinding.RegisterMonthItemBinding

class ItemAdapter(private val dayList: MutableList<MutableList<DayItem?>?>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = RegisterMonthBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val day = dayList[position]
        holder.bind(day)
    }

    override fun getItemCount(): Int {
        return dayList.size
    }

    inner class ItemViewHolder(private val binding: RegisterMonthItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(day: MutableList<DayItem?>?) {
            binding.tvDate.text = day!![0]?.day
            binding.tvBreakfastTime.text = day!![0]?.time
            binding.tvBreakfastGlyc.text = day!![0]?.glyc
            binding.tvBreakfastCor.text = day!![0]?.cor
            binding.tvBreakfastBasal.text = day!![0]?.basal

            binding.tvPostBreakfastTime.text = day!![1]?.time
            binding.tvPostBreakfastGlyc.text = day!![1]?.glyc
            binding.tvPostBreakfastCor.text = day!![1]?.cor
            binding.tvPostBreakfastBasal.text = day!![1]?.basal

            binding.tvLunchTime.text = day!![2]?.time
            binding.tvLunchGlyc.text = day!![2]?.glyc
            binding.tvLunchCor.text = day!![2]?.cor
            binding.tvLunchBasal.text = day!![2]?.basal

            binding.tvPostLunchTime.text = day!![3]?.time
            binding.tvPostLunchGlyc.text = day!![3]?.glyc
            binding.tvPostLunchCor.text = day!![3]?.cor
            binding.tvPostLunchBasal.text = day!![3]?.basal

            binding.tvSnackTime.text = day!![4]?.time
            binding.tvSnackGlyc.text = day!![4]?.glyc
            binding.tvSnackCor.text = day!![4]?.cor
            binding.tvSnackBasal.text = day!![4]?.basal

            binding.tvPostSnackTime.text = day!![5]?.time
            binding.tvSPostSnackGlyc.text = day!![5]?.glyc
            binding.tvPostSnackCor.text = day!![5]?.cor
            binding.tvPostSnackBasal.text = day!![5]?.basal

            binding.tvDinnerTime.text = day!![6]?.time
            binding.tvDinnerGlyc.text = day!![6]?.glyc
            binding.tvDinnerCor.text = day!![6]?.cor
            binding.tvDinnerBasal.text = day!![6]?.basal

            binding.tvPostDinnerTime.text = day!![7]?.time
            binding.tvPostDinnerGlyc.text = day!![7]?.glyc
            binding.tvPostDinnerCor.text = day!![7]?.cor
            binding.tvPostDinnerBasal.text = day!![7]?.basal
        }
    }
}