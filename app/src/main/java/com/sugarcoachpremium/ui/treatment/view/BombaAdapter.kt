package com.sugarcoachpremium.ui.treatment.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.skydoves.powerspinner.OnSpinnerItemSelectedListener
import com.skydoves.powerspinner.PowerSpinnerInterface
import com.skydoves.powerspinner.PowerSpinnerView
import com.sugarcoachpremium.databinding.BasalItemBinding
import java.util.*

class BombaAdapter (private val activity: TreatmentActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>(),
    PowerSpinnerInterface<BasalItem> {
    override lateinit var spinnerView: PowerSpinnerView
    override var onSpinnerItemSelectedListener: OnSpinnerItemSelectedListener<BasalItem>? = null
    private var itemList: MutableList<BasalItem> = Collections.emptyList()
    lateinit var holder: MedidorHolder
    lateinit var binding: BasalItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(activity)
        binding = BasalItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        var holder = MedidorHolder(binding)
        this.holder = holder
        return holder
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = itemList[holder.adapterPosition]
        bind(holder as MedidorHolder, item)

        holder.itemView.setOnClickListener {
            notifyItemSelected(position)
        }
    }

    fun setPowerView(powerSpinnerView: PowerSpinnerView){
        this.spinnerView = powerSpinnerView
    }

    override fun setItems(itemList: List<BasalItem>) {
        this.itemList = itemList.toMutableList()
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    // we must call the spinnerView.notifyItemSelected method to let PowerSpinnerView know about changed information.
    override fun notifyItemSelected(index: Int) {
        this.spinnerView.notifyItemSelected(index, this.itemList[index].name)
        this.onSpinnerItemSelectedListener?.onItemSelected(index, this.itemList[index])
    }
    private fun bind(holder: MedidorHolder, item: BasalItem) {
        holder.bind(item)
    }

}

