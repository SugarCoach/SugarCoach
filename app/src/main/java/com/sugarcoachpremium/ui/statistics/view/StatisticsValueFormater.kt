package com.sugarcoachpremium.ui.statistics.view

import com.github.mikephil.charting.components.AxisBase
import com.github.mikephil.charting.formatter.ValueFormatter

class StatisticsValueFormater(private val labels: Array<String>): ValueFormatter() {

    override fun getAxisLabel(value: Float, axis: AxisBase?): String {
        return labels[value.toInt()]
    }
}