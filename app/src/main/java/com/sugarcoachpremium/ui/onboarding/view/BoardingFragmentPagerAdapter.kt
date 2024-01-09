package com.sugarcoachpremium.ui.onboarding.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kotlin.collections.ArrayList


class BoardingFragmentPagerAdapter(activity: FragmentActivity):
    FragmentStateAdapter(activity) {

    companion object{
        private const val ARG_BACKGROUND_COLOR = "param1"
        private const val ARG_RESOURCE = "param2"
        private const val ARG_TITLE = "param3"
        private const val ARG_SUBTITLE = "param4"
        private const val ARG_SHOWBUTTON = "param5"
    }

    var itemList: MutableList<BoardingItem> = emptyList<BoardingItem>().toMutableList()

    override fun getItemCount(): Int {
        return itemList.size
    }

    fun setData(itemList: ArrayList<BoardingItem>){
        this.itemList = itemList
    }
    override fun createFragment(position: Int): Fragment {
        val item = itemList[position]
        val fragment = BoardingFragment()
        fragment.arguments = Bundle().apply {
            putInt(ARG_BACKGROUND_COLOR, item.bg)
            putInt(ARG_RESOURCE, item.image)
            putInt(ARG_TITLE, item.title)
            putInt(ARG_SUBTITLE, item.subtitle)
            putBoolean(ARG_SHOWBUTTON, item.showButton)
        }

        return fragment
    }

}