package com.sugarcoachpremium.ui.base.view

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.sugarcoachpremium.R
import dagger.android.AndroidInjection


abstract class BaseActivity : AppCompatActivity(), BaseView{

    lateinit var dialog: AlertDialog



    override fun onCreate(savedInstanceState: Bundle?) {
        performDI()
        super.onCreate(savedInstanceState)
        createDialog()
    }

    override fun hideProgress() {
        dialog.let { if (it.isShowing) it.dismiss() }
    }

    override fun showProgress() {
        hideProgress()
        dialog.show()

    }

    private fun performDI() = AndroidInjection.inject(this)
    private fun createDialog(){
        val builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setView(R.layout.progress)
        dialog = builder.create()
    }


}