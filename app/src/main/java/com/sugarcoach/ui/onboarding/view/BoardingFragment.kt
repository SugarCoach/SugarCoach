package com.sugarcoach.ui.onboarding.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sugarcoach.R
import com.sugarcoach.databinding.FragmentOnboardingItemBinding
import com.sugarcoach.ui.base.view.BaseFragment

private const val ARG_BACKGROUND_COLOR = "param1"
private const val ARG_RESOURCE = "param2"
private const val ARG_TITLE = "param3"
private const val ARG_SUBTITLE = "param4"
private const val ARG_SHOWBUTTON = "param5"

class BoardingFragment : BaseFragment() {
    private var param1: Int? = null
    private var param2: Int? = null
    private var param3: Int? = null
    private var param4: Int? = null
    private var param5: Boolean? = null

    private lateinit var binding: FragmentOnboardingItemBinding

    override fun setUp() {
        // Inflate the layout using data binding
        binding = FragmentOnboardingItemBinding.inflate(layoutInflater)

        // Set the visibility of views using data binding
        binding.boardingItemSubtitle.visibility = View.GONE
        binding.boardingBt.visibility = View.GONE

        // Set the background resource, image resource, and text using data binding
        param1?.let { binding.boardingLayout.setBackgroundResource(it) }
        param2?.let { binding.boardingImage.setImageResource(it) }
        param3?.let { binding.boardingItemTitle.text = getString(it) }

        // Set the subtitle visibility and text using data binding
        param4?.let {
            if (it != 0) {
                binding.boardingItemSubtitle.text = getString(it)
                binding.boardingItemSubtitle.visibility = View.VISIBLE
            }
        }

        // Set the button visibility using data binding
        param5?.let { if (it) binding.boardingBt.visibility = View.VISIBLE }

        // Set the click listener using data binding
        binding.boardingBt.setOnClickListener { (activity as OnBoardingActivity).openLoginActivity() }

    }

    override fun showProgress() {
        TODO("Not yet implemented")
    }

    override fun hideProgress() {
        TODO("Not yet implemented")
    }

    override fun showErrorToast() {
        TODO("Not yet implemented")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        arguments?.let {
            param1 = it.getInt(ARG_BACKGROUND_COLOR)
            param2 = it.getInt(ARG_RESOURCE)
            param3 = it.getInt(ARG_TITLE)
            param4 = it.getInt(ARG_SUBTITLE)
            param5 = it.getBoolean(ARG_SHOWBUTTON)
        }
        return inflater.inflate(R.layout.fragment_onboarding_item, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: Int, param2: Int, param3: Int, param4: Int, param5: Boolean) =
        BoardingFragment().apply {
            arguments = Bundle().apply {
                putInt(ARG_BACKGROUND_COLOR, param1)
                putInt(ARG_RESOURCE, param2)
                putInt(ARG_TITLE, param3)
                putInt(ARG_SUBTITLE, param4)
                putBoolean(ARG_SHOWBUTTON, param5)
            }
        }
    }

}