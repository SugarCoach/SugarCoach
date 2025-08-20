package com.sugarcoach.ui.treatment.view

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.skydoves.powerspinner.OnSpinnerItemSelectedListener
import com.skydoves.powerspinner.PowerSpinnerInterface
import com.skydoves.powerspinner.PowerSpinnerView
import com.sugarcoach.R
import com.sugarcoach.databinding.BasalItemBinding
import com.sugarcoach.ui.daily_detail.view.DailyDetailActivity
import java.util.*

class BasalAdapter (private val activity: TreatmentActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>(),
    PowerSpinnerInterface<BasalItem> {

    override lateinit var spinnerView: PowerSpinnerView
    override var onSpinnerItemSelectedListener: OnSpinnerItemSelectedListener<BasalItem>? = null
    private var itemList: MutableList<BasalItem> = Collections.emptyList()
    lateinit var holder: BasalHolder

    lateinit var binding: BasalItemBinding

    private val items: MutableList<BasalItem> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = BasalItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val holder = BasalHolder(binding)
        this.holder = holder
        return holder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[holder.adapterPosition]
        bind(holder as BasalHolder, item)

        holder.itemView.setOnClickListener {
            notifyItemSelected(position)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setPowerView(powerSpinnerView: PowerSpinnerView){
        this.spinnerView = powerSpinnerView
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun setItems(itemList: List<BasalItem>) {
        items.clear()
        items.addAll(itemList)
        notifyDataSetChanged()
    }

    // we must call the spinnerView.notifyItemSelected method to let PowerSpinnerView know about changed information.
    override fun notifyItemSelected(index: Int) {
        this.spinnerView.notifyItemSelected(index, this.items[index].name)
        this.onSpinnerItemSelectedListener?.onItemSelected(index, this.items[index])
    }
    private fun bind(holder: BasalHolder, item: BasalItem) {
        holder.bind(item)
    }

}

