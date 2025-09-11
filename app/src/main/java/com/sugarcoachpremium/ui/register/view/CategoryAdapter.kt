//CODIGO ORIGINAL


//package com.sugarcoachpremium.ui.register.view
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.skydoves.powerspinner.OnSpinnerItemSelectedListener
//import com.skydoves.powerspinner.PowerSpinnerInterface
//import com.skydoves.powerspinner.PowerSpinnerView
//import com.sugarcoachpremium.data.database.repository.dailyregister.Category
//import com.sugarcoachpremium.databinding.CategoryItemBinding
//import java.util.*
//
//class CategoryAdapter (private val activity: RegisterActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>(),
//    PowerSpinnerInterface<Category> {
//    override lateinit var spinnerView: PowerSpinnerView
//    override var onSpinnerItemSelectedListener: OnSpinnerItemSelectedListener<Category>? = null
//    private var itemList: MutableList<Category> = Collections.emptyList()
//    lateinit var holder: CategoriesHolder
//
//    lateinit var binding: CategoryItemBinding
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        val inflater: LayoutInflater = LayoutInflater.from(activity)
//        binding = CategoryItemBinding.inflate(inflater)
//        val holder = CategoriesHolder(binding)
//        this.holder = holder
//        return holder
//    }
//
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        val item = itemList[holder.bindingAdapterPosition]
//        bind(holder as CategoriesHolder, item)
//
//        holder.itemView.setOnClickListener {
//            notifyItemSelected(position)
//        }
//    }
//
//    fun setPowerView(powerSpinnerView: PowerSpinnerView){
//        this.spinnerView = powerSpinnerView
//    }
//
//    override fun setItems(itemList: List<Category>) {
//        this.itemList = itemList.toMutableList()
//        notifyDataSetChanged()
//    }
//
//    override fun getItemCount(): Int {
//        return itemList.size
//    }
//
//    // we must call the spinnerView.notifyItemSelected method to let PowerSpinnerView know about changed information.
//    override fun notifyItemSelected(index: Int) {
//        this.spinnerView.notifyItemSelected(index, activity.getLabel(this.itemList[index].cate_name))
//        this.onSpinnerItemSelectedListener?.onItemSelected(index, this.itemList[index])
//    }
//    private fun bind(holder: CategoriesHolder, item: Category) {
//        holder.bind(item, activity)
//    }
//
//}
//

//FIN DE CODIGO ORIGINAL


package com.sugarcoachpremium.ui.register.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.skydoves.powerspinner.OnSpinnerItemSelectedListener
import com.skydoves.powerspinner.PowerSpinnerInterface
import com.skydoves.powerspinner.PowerSpinnerView
import com.sugarcoachpremium.data.database.repository.dailyregister.Category
import com.sugarcoachpremium.databinding.CategoryItemBinding
import java.util.*

class CategoryAdapter(private val activity: RegisterActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>(),
    PowerSpinnerInterface<Category> {
    override lateinit var spinnerView: PowerSpinnerView
    override var onSpinnerItemSelectedListener: OnSpinnerItemSelectedListener<Category>? = null
    override var index: Int = 0
    private var itemList: MutableList<Category> = Collections.emptyList()
    lateinit var holder: CategoriesHolder
    lateinit var binding: CategoryItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = CategoryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoriesHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = itemList[holder.bindingAdapterPosition]
        bind(holder as CategoriesHolder, item)

        holder.itemView.setOnClickListener {
            notifyItemSelected(position)
        }
    }

    fun setPowerView(powerSpinnerView: PowerSpinnerView) {
        this.spinnerView = powerSpinnerView
    }

    override fun setItems(itemList: List<Category>) {
        this.itemList = itemList.toMutableList()
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun notifyItemSelected(index: Int) {
        val oldIndex = this.index
        val oldItem = if (oldIndex >= 0 && oldIndex < itemList.size) itemList[oldIndex] else null
        this.index = index
        val newItem = if (index >= 0 && index < itemList.size) itemList[index] else null
        this.spinnerView.notifyItemSelected(index, activity.getLabel(this.itemList[index].cate_name))
        this.onSpinnerItemSelectedListener?.onItemSelected(oldIndex, oldItem, index, newItem!!)
    }

    private fun bind(holder: CategoriesHolder, item: Category) {
        holder.bind(item, activity)
    }
}