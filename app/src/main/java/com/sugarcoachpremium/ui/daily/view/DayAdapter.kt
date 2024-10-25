package com.sugarcoachpremium.ui.daily.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sugarcoachpremium.databinding.RegisterMonthBinding
import com.sugarcoachpremium.databinding.RegisterMonthItemBinding

class DayAdapter(private val dayList: MutableList<MutableList<DayItem?>?>) : RecyclerView.Adapter<DayAdapter.DayViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayViewHolder {
        val binding = RegisterMonthItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DayViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DayViewHolder, position: Int) {
        val day = dayList[position]
        holder.bind(day)
    }

    override fun getItemCount(): Int {
        return dayList.size
    }

    inner class DayViewHolder(private val binding: RegisterMonthItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(day: MutableList<DayItem?>?) {
            if(day!![0]?.day!=null){binding.tvDate.text=day!![0]?.day}
            binding.tvBreakfastTime.text = day!![0]?.time
            binding.tvBreakfastGlyc.text = day!![0]?.glyc
            day!![0]?.let { binding.tvBreakfastGlyc.setTextColor(it.gluColor) }
            binding.tvBreakfastCor.text = day!![0]?.cor
            binding.tvBreakfastBasal.text = day!![0]?.basal

            if((day!![0]?.day==null)&&(day!![1]?.day!=null)){binding.tvDate.text=day!![1]?.day}
            binding.tvPostBreakfastTime.text = day!![1]?.time
            binding.tvPostBreakfastGlyc.text = day!![1]?.glyc
            day!![1]?.let { binding.tvPostBreakfastGlyc.setTextColor(it.gluColor) }
            binding.tvPostBreakfastCor.text = day!![1]?.cor
            binding.tvPostBreakfastBasal.text = day!![1]?.basal

            if((day!![0]?.day==null)&&(day!![1]?.day==null)&&(day!![2]?.day!=null)){binding.tvDate.text=day!![2]?.day}
            binding.tvLunchTime.text = day!![2]?.time
            binding.tvLunchGlyc.text = day!![2]?.glyc
            day!![2]?.let { binding.tvLunchGlyc.setTextColor(it.gluColor) }
            binding.tvLunchCor.text = day!![2]?.cor
            binding.tvLunchBasal.text = day!![2]?.basal

            if((day!![0]?.day==null)&&(day!![1]?.day==null)&&(day!![2]?.day==null)&&(day!![3]?.day!=null)){binding.tvDate.text=day!![3]?.day}
            binding.tvPostLunchTime.text = day!![3]?.time
            binding.tvPostLunchGlyc.text = day!![3]?.glyc
            day!![3]?.let { binding.tvPostLunchGlyc.setTextColor(it.gluColor) }
            binding.tvPostLunchCor.text = day!![3]?.cor
            binding.tvPostLunchBasal.text = day!![3]?.basal

            if((day!![0]?.day==null)&&(day!![1]?.day==null)&&(day!![2]?.day==null)&&(day!![3]?.day==null)&&(day!![4]?.day!=null)){binding.tvDate.text=day!![4]?.day}
            binding.tvSnackTime.text = day!![4]?.time
            binding.tvSnackGlyc.text = day!![4]?.glyc
            day!![4]?.let { binding.tvSnackGlyc.setTextColor(it.gluColor) }
            binding.tvSnackCor.text = day!![4]?.cor
            binding.tvSnackBasal.text = day!![4]?.basal

            if((day!![0]?.day==null)&&(day!![1]?.day==null)&&(day!![2]?.day==null)&&(day!![3]?.day==null)&&(day!![4]?.day==null)&&(day!![5]?.day!=null)){binding.tvDate.text=day!![5]?.day}
            binding.tvPostSnackTime.text = day!![5]?.time
            binding.tvSPostSnackGlyc.text = day!![5]?.glyc
            day!![5]?.let { binding.tvSPostSnackGlyc.setTextColor(it.gluColor) }
            binding.tvPostSnackCor.text = day!![5]?.cor
            binding.tvPostSnackBasal.text = day!![5]?.basal

            if((day!![0]?.day==null)&&(day!![1]?.day==null)&&(day!![2]?.day==null)&&(day!![3]?.day==null)&&(day!![4]?.day==null)&&(day!![5]?.day==null)&&(day!![6]?.day!=null)){binding.tvDate.text=day!![6]?.day}
            binding.tvDinnerTime.text = day!![6]?.time
            binding.tvDinnerGlyc.text = day!![6]?.glyc
            day!![6]?.let { binding.tvDinnerGlyc.setTextColor(it.gluColor) }
            binding.tvDinnerCor.text = day!![6]?.cor
            binding.tvDinnerBasal.text = day!![6]?.basal

            if((day!![0]?.day==null)&&(day!![1]?.day==null)&&(day!![2]?.day==null)&&(day!![3]?.day==null)&&(day!![4]?.day==null)&&(day!![5]?.day==null)&&(day!![6]?.day==null)&&(day!![7]?.day!=null)){binding.tvDate.text=day!![7]?.day}
            binding.tvPostDinnerTime.text = day!![7]?.time
            binding.tvPostDinnerGlyc.text = day!![7]?.glyc
            day!![7]?.let { binding.tvPostDinnerGlyc.setTextColor(it.gluColor) }
            binding.tvPostDinnerCor.text = day!![7]?.cor
            binding.tvPostDinnerBasal.text = day!![7]?.basal
        }
    }
}