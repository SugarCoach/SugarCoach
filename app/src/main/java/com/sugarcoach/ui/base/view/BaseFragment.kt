package com.sugarcoach.ui.base.view

import android.app.ProgressDialog
import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import dagger.android.support.AndroidSupportInjection


abstract class BaseFragment : Fragment(), BaseView {

    private var parentActivity: BaseActivity? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is BaseActivity) {
            val activity = context as BaseActivity?
            this.parentActivity = activity
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUp()
    }


    fun getBaseActivity() = parentActivity

    interface CallBack {
        fun onFragmentAttached()
        fun onFragmentDetached(tag: String)
    }

    abstract fun setUp()
}