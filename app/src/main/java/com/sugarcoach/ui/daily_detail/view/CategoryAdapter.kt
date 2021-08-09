package com.sugarcoach.ui.daily_detail.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.skydoves.powerspinner.OnSpinnerItemSelectedListener
import com.skydoves.powerspinner.PowerSpinnerInterface
import com.skydoves.powerspinner.PowerSpinnerView
import com.sugarcoach.R
import com.sugarcoach.data.database.repository.dailyregister.Category
import java.util.*

class CategoryAdapter (private val activity: DailyDetailActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>(),
    PowerSpinnerInterface<Category> {
    override lateinit var spinnerView: PowerSpinnerView
    override var onSpinnerItemSelectedListener: OnSpinnerItemSelectedListener<Category>? = null
    private var itemList: MutableList<Category> = Collections.emptyList()
    lateinit var holder: CategoriesHolder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(activity)
        var holder = CategoriesHolder(inflater.inflate(R.layout.category_item, parent, false))
        this.holder = holder
        return holder
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = itemList[holder.adapterPosition]
        bind(holder as CategoriesHolder, item)

        holder.itemView.setOnClickListener {
            notifyItemSelected(position)
        }
    }

    fun setPowerView(powerSpinnerView: PowerSpinnerView){
        this.spinnerView = powerSpinnerView
    }

    override fun setItems(itemList: List<Category>) {
        this.itemList = itemList.toMutableList()
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    // we must call the spinnerView.notifyItemSelected method to let PowerSpinnerView know about changed information.
    override fun notifyItemSelected(index: Int) {
        this.spinnerView.notifyItemSelected(index, activity.getLabel(this.itemList[index].cate_name))
        this.onSpinnerItemSelectedListener?.onItemSelected(index, this.itemList[index])
    }
    private fun bind(holder: CategoriesHolder, item: Category) {
        holder.inflateData(item, activity)
    }

}

