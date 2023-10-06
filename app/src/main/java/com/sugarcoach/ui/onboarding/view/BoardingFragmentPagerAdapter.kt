package com.sugarcoach.ui.onboarding.view

import android.graphics.pdf.PdfDocument.Page
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import kotlin.collections.ArrayList


class BoardingFragmentPagerAdapter(activity: FragmentActivity, private var itemList: ArrayList<BoardingItem>):
    FragmentStateAdapter(activity) {

    //var itemList: MutableList<BoardingItem> = emptyList<BoardingItem>().toMutableList()
    fun setData(itemList: List<BoardingItem>){
        this.itemList = itemList
    }
    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun createFragment(position: Int): Fragment {
        val item = itemList[position]
        return BoardingFragment(item)
    }


}