package com.sugarcoachpremium.ui.base.view

import android.os.Bundle
import androidx.fragment.app.DialogFragment
import dagger.android.support.AndroidSupportInjection

abstract class BaseDialogView : DialogFragment(), DialogView {

    private var parentActivity: BaseActivity? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDependencyInjection()
    }



    override fun hideProgress() {
       //progress
    }

    override fun showProgress() {
        hideProgress()
//        progressDialog = CommonUtil.showLoadingDialog(this.context)
    }

    private fun performDependencyInjection() {
        AndroidSupportInjection.inject(this)
    }

    fun dismissDialog(tag: String) {
        dismiss()
    }

    private fun getBaseActivity(): BaseActivity? {
        return parentActivity
    }

}