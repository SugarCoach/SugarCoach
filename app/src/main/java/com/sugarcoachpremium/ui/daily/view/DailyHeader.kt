package com.sugarcoachpremium.ui.daily.view

import com.hominoid.expandablerecyclerviewlib.models.Group
import java.util.*

class DailyHeader(internal val date: Date?,internal val bgColor: Int): Group<DailyHeader>() {

    data class Builder(
        private var date: Date? = null,
        private var bgColor: Int = 0) {

        fun date(date: Date?) = apply { this.date = date }
        fun bgColor(bgColor: Int) = apply { this.bgColor = bgColor }
        fun build() = DailyHeader(
            date,
            bgColor
        )
    }
}