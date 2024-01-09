package com.sugarcoachpremium.util.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide

internal fun ImageView.loadImage(url: String) {
    Glide.with(this.context)
            .load(url)
            .centerCrop()
            .into(this)
}