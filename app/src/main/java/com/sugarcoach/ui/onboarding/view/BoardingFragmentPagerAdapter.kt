package com.sugarcoach.ui.onboarding.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
import androidx.fragment.app.FragmentStatePagerAdapter
import java.util.*


class BoardingFragmentPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    var itemList: MutableList<BoardingItem> = Collections.emptyList()
    fun setData(itemList: List<BoardingItem>){
        this.itemList = itemList.toMutableList()
    }
    override fun getItem(position: Int): Fragment {
        val item = itemList[position]
        return BoardingFragment.newInstance(item.bg, item.image, item.title, item.subtitle, item.showButton)
    }

    override fun getCount(): Int {
        return itemList.size
    }
}