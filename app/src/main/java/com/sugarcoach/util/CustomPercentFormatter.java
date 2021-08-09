package com.sugarcoach.util;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;

import java.text.DecimalFormat;

public class CustomPercentFormatter extends ValueFormatter
{

    public DecimalFormat mFormat;
    private PieChart pieChart;

    public CustomPercentFormatter() {
        mFormat = new DecimalFormat("###,###,##0.0");
    }

    // Can be used to remove percent signs if the chart isn't in percent mode
    public CustomPercentFormatter(PieChart pieChart) {
        this();
        this.pieChart = pieChart;
    }

    @Override
    public String getFormattedValue(float value) {
        return mFormat.format(value) + " %";
    }

    @Override
    public String getPieLabel(float value, PieEntry pieEntry) {
        return getFormattedValue(value);
    }
}
