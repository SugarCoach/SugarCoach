package com.sugarcoach.ui.onboarding.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.sugarcoach.R
import com.sugarcoach.databinding.ActivityOnboardingBinding
import com.sugarcoach.databinding.FragmentOnboardingItemBinding
import com.sugarcoach.ui.base.view.BaseFragment

private const val ARG_BACKGROUND_COLOR = "param1"
private const val ARG_RESOURCE = "param2"
private const val ARG_TITLE = "param3"
private const val ARG_SUBTITLE = "param4"
private const val ARG_SHOWBUTTON = "param5"

class BoardingFragment() : Fragment() {
    private var param1: Int? = null
    private var param2: Int? = null
    private var param3: Int? = null
    private var param4: Int? = null
    private var param5: Boolean? = null

    private lateinit var binding: FragmentOnboardingItemBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_onboarding_item, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {
            param1 = it.getInt(ARG_BACKGROUND_COLOR)
            param2 = it.getInt(ARG_RESOURCE)
            param3 = it.getInt(ARG_TITLE)
            param4 = it.getInt(ARG_SUBTITLE)
            param5 = it.getBoolean(ARG_SHOWBUTTON)
        }

        val boardingItemTitle: TextView = view.findViewById(R.id.boarding_item_title)
        val boardingLayout: ConstraintLayout = view.findViewById(R.id.boarding_layout)
        val boardingImage: ImageView = view.findViewById(R.id.boarding_image)
        val boardingItemSubtitle: TextView = view.findViewById(R.id.boarding_item_subtitle)
        val boardingBt: Button = view.findViewById(R.id.boarding_bt)
        boardingItemSubtitle.visibility = View.GONE
        boardingBt.visibility = View.GONE

        param1?.let { boardingLayout.setBackgroundResource(it) }
        param2?.let { boardingImage.setImageResource(it) }
        param3?.let { boardingItemTitle.text = getString(it) }

        param4?.let {
            if (it != 0) {
                boardingItemSubtitle.text = getString(it)
                boardingItemSubtitle.visibility = View.VISIBLE
            }
        }

        param5?.let { if (it) boardingBt.visibility = View.VISIBLE }

        boardingBt.setOnClickListener { (activity as OnBoardingActivity).openLoginActivity() }
    }

}