package com.sugarcoachpremium.ui.daily.view

import android.content.Intent
import android.view.View
import androidx.core.content.ContextCompat.getColor
import com.hominoid.expandablerecyclerviewlib.viewholders.ChildViewHolder
import com.sugarcoachpremium.ui.daily_detail.view.DailyDetailActivity
import java.text.SimpleDateFormat
import java.util.*

// Import the necessary data binding classes
import com.sugarcoachpremium.databinding.DailyItemBinding

class DailyHolder(private val binding: DailyItemBinding) : ChildViewHolder(binding.root) {
    fun setItemClickListener(id: Int) {
        binding.root.setOnClickListener {
            val intent = Intent(binding.root.context, DailyDetailActivity::class.java)
            intent.putExtra("id", id)
            binding.root.context.startActivity(intent)
        }
    }

    fun inflateData(item: DailyItem, activity: DailyActivity) {
        // Set the visibility of views using data binding
        binding.dailyExerciseIv.visibility = View.GONE
        binding.dailyEmotionalIv.visibility = View.GONE
        binding.dailyExerciseTv.visibility = View.GONE
        binding.dailyEmotionalTv.visibility = View.GONE

        // Set the background color using data binding
        binding.dailyCardview.setCardBackgroundColor(item.bgColor)
        binding.dailyGluText.setTextColor(item.bgColor)
        binding.dailyCorrectoText.setTextColor(item.bgColor)
        binding.dailyBasalText.setTextColor(item.bgColor)
        binding.dailyHcText.setTextColor(item.bgColor)

        // Set the text and color using data binding
        item.glucose?.let {
            binding.dailyGluTv.text = it
            binding.dailyGluTv.setTextColor(getColor(binding.root.context, item.gluColor))
        }
        item.category?.let { binding.dailyCategoryTv.text = it }
        item.carbohydrates?.let { binding.dailyHcTv.text = it }
        item.date?.let { dateString ->
            val formatterTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
            val formattedTime = formatterTime.format(dateString)
            binding.dailyTimeTv.text = formattedTime
        }
        item.basal?.let { binding.dailyBasalTv.text = it }
        item.insulin?.let { binding.dailyCorrectoTv.text = it }
        item.exercise?.let {
            val intDrawer = activity.getDrawable(it.exercise_icono)
            intDrawer?.let { drawable ->
                binding.dailyExerciseIv.setImageDrawable(drawable)
                binding.dailyExerciseTv.text = activity.getLabel(it.exercise_name)
                binding.dailyExerciseIv.visibility = View.VISIBLE
                binding.dailyExerciseTv.visibility = View.VISIBLE
            }
        }
        item.state?.let {
            val intDrawer = activity.getDrawable(it.state_icono)
            intDrawer?.let { drawable ->
                binding.dailyEmotionalIv.setImageDrawable(drawable)
                binding.dailyEmotionalTv.text = activity.getLabel(it.state_name)
                binding.dailyEmotionalIv.visibility = View.VISIBLE
                binding.dailyEmotionalTv.visibility = View.VISIBLE
            }
        }
    }
}
