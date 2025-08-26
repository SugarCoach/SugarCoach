package com.sugarcoachpremium.ui.statistics.view

import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat.getColor
import androidx.recyclerview.widget.RecyclerView
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.LegendEntry
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.formatter.StackedValueFormatter
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet
import com.sugarcoachpremium.R
import com.sugarcoachpremium.databinding.StatisticsItemBinding
import com.sugarcoachpremium.util.CustomPercentFormatter
import kotlin.collections.ArrayList

class StatisticsHolder(private val binding: StatisticsItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun inflateData(item: StatisticsItem, position: Int, activity: StatisticsActivity ) {

        binding.statisticsItemTitle.text = activity.getString(item.name)
        setUpGlucemia()
        setUpInsulina()

        when(position) {
            0 -> {
                binding.statisticsItemPiechart.visibility = View.VISIBLE
                binding.statisticsItemBarchart.visibility = View.GONE
                binding.statisticsItemTypes.visibility = View.VISIBLE
                binding.statisticsItemTypesInsulina.visibility = View.GONE
                binding.statisticsItemTypesCar.visibility = View.GONE
                binding.statisticsItemTypesExercise.visibility = View.GONE
                binding.statisticsItemTypesState.visibility = View.GONE
                binding.statisticsItemTypes.setItems(item.types)
                binding.statisticsItemTypes.selectItemByIndex(item.index)
                binding.statisticsItemTypes.setOnSpinnerItemSelectedListener<String> { index, item ->
                    activity.showCalendar(position, index)
                }
                showGlucemiaData(activity, item)
            }
            1 -> {
                binding.statisticsItemPiechart.visibility = View.GONE
                binding.statisticsItemBarchart.visibility = View.VISIBLE
                binding.statisticsItemTypes.visibility = View.GONE
                binding.statisticsItemTypesInsulina.visibility = View.VISIBLE
                binding.statisticsItemTypesCar.visibility = View.GONE
                binding.statisticsItemTypesExercise.visibility = View.GONE
                binding.statisticsItemTypesState.visibility = View.GONE
                binding.statisticsItemTypesInsulina.setItems(item.types)
                binding.statisticsItemTypesInsulina.selectItemByIndex(item.index)
                binding.statisticsItemTypesInsulina.setOnSpinnerItemSelectedListener<String> { index, item ->
                    activity.showCalendar(position, index)
                }
                showInsulinaData(activity, item)
            }
            2 -> {
                binding.statisticsItemPiechart.visibility = View.GONE
                binding.statisticsItemBarchart.visibility = View.VISIBLE
                binding.statisticsItemTypes.visibility = View.GONE
                binding.statisticsItemTypesInsulina.visibility = View.GONE
                binding.statisticsItemTypesCar.visibility = View.VISIBLE
                binding.statisticsItemTypesExercise.visibility = View.GONE
                binding.statisticsItemTypesState.visibility = View.GONE
                binding.statisticsItemTypesCar.setItems(item.types)
                binding.statisticsItemTypesCar.selectItemByIndex(item.index)
                binding.statisticsItemTypesCar.setOnSpinnerItemSelectedListener<String> { index, item ->
                    activity.showCalendar(position, index)
                }
                showCarbohidratosData(activity, item)
            }
            3 -> {
                binding.statisticsItemPiechart.visibility = View.GONE
                binding.statisticsItemBarchart.visibility = View.VISIBLE
                binding.statisticsItemTypes.visibility = View.GONE
                binding.statisticsItemTypesInsulina.visibility = View.GONE
                binding.statisticsItemTypesCar.visibility = View.GONE
                binding.statisticsItemTypesExercise.visibility = View.VISIBLE
                binding.statisticsItemTypesState.visibility = View.GONE
                binding.statisticsItemTypesExercise.setItems(item.types)
                binding.statisticsItemTypesExercise.selectItemByIndex(item.index)
                binding.statisticsItemTypesExercise.setOnSpinnerItemSelectedListener<String> { index, item ->
                    activity.showCalendar(position, index)
                }
                showExercisesData(activity, item)
            }
            4 -> {
                binding.statisticsItemPiechart.visibility = View.GONE
                binding.statisticsItemBarchart.visibility = View.VISIBLE
                binding.statisticsItemTypes.visibility = View.GONE
                binding.statisticsItemTypesInsulina.visibility = View.GONE
                binding.statisticsItemTypesCar.visibility = View.GONE
                binding.statisticsItemTypesExercise.visibility = View.GONE
                binding.statisticsItemTypesState.visibility = View.VISIBLE
                binding.statisticsItemTypesState.setItems(item.types)
                binding.statisticsItemTypesState.selectItemByIndex(item.index)
                binding.statisticsItemTypesState.setOnSpinnerItemSelectedListener<String> { index, item ->
                    activity.showCalendar(position, index)
                }
                showStatesData(activity, item)
            }
        }

    }


    fun setUpGlucemia(){
        binding.statisticsItemPiechart.description.isEnabled = false
        binding.statisticsItemPiechart.dragDecelerationFrictionCoef = 0.95f
        binding.statisticsItemPiechart.isDrawHoleEnabled = false
        binding.statisticsItemPiechart.rotationAngle =0f
        binding.statisticsItemPiechart.isRotationEnabled = true
        binding.statisticsItemPiechart.isHighlightPerTapEnabled = true

       // itemView.statistics_item_piechart.animateY(1400, Easing.EaseInOutQuad);
        var l = binding.statisticsItemPiechart.legend
        l.verticalAlignment= Legend.LegendVerticalAlignment.TOP
        l.horizontalAlignment = Legend.LegendHorizontalAlignment.RIGHT
        l.orientation = Legend.LegendOrientation.VERTICAL
        l.setDrawInside(false)
        l.xEntrySpace = 7f
        l.yEntrySpace = 0f
        l.xOffset = 0f
    }

    fun showGlucemiaData(activity: StatisticsActivity, item: StatisticsItem){
        val entries = ArrayList<PieEntry>()
        val lentries = ArrayList<LegendEntry>()
        val colors = ArrayList<Int>()
        colors.add(getColor(activity,  R.color.yellowLight))
        colors.add(getColor(activity,  R.color.green))
        colors.add(getColor(activity,  R.color.red))

        // NOTE: The order of the entries when being added to the entries array determines their position around the center of
        // the chart.
        val labels = arrayOf(activity.getString(R.string.register_glucemia_debajo_label), activity.getString(R.string.register_glucemia_rango_label),activity.getString(R.string.register_glucemia_arriba_label))
        for (i in item.values.indices){
            entries.add(PieEntry(item.values[i]))
            lentries.add(LegendEntry(labels[i],Legend.LegendForm.SQUARE,10f,0f,null, colors[i] ))
        }

        val dataSet = PieDataSet(entries, "")

        dataSet.sliceSpace = 3f

        // add a lot of colors


        dataSet.colors = (colors)


        val data = PieData(dataSet)
        data.setValueFormatter(CustomPercentFormatter(binding.statisticsItemPiechart))
        data.setValueTextSize(11f)
        data.setValueTextColor(Color.BLACK)
        binding.statisticsItemPiechart.data = (data)
        binding.statisticsItemPiechart.legend.setCustom(lentries)

        // undo all highlights
        binding.statisticsItemPiechart.highlightValues(null)
        binding.statisticsItemPiechart.invalidate()
        binding.statisticsItemPiechart.notifyDataSetChanged()
    }

    fun setUpInsulina(){
        binding.statisticsItemBarchart.description.isEnabled = false
        binding.statisticsItemBarchart.isEnabled = false
        binding.statisticsItemBarchart.setPinchZoom(false)
        binding.statisticsItemBarchart.setDrawGridBackground(true)
        binding.statisticsItemBarchart.setDrawBarShadow(false)
        binding.statisticsItemBarchart.isHighlightFullBarEnabled = false

        // change the position of the y-labels
        var leftAxis  = binding.statisticsItemBarchart.axisLeft
        leftAxis.axisMinimum = 0f
        binding.statisticsItemBarchart.axisRight.isEnabled =false

        var xLabels = binding.statisticsItemBarchart.xAxis;
        xLabels.position = XAxis.XAxisPosition.TOP
        xLabels.granularity = 1f

        var l = binding.statisticsItemBarchart.legend;
        l.verticalAlignment = Legend.LegendVerticalAlignment.BOTTOM
        l.horizontalAlignment = Legend.LegendHorizontalAlignment.RIGHT
        l.orientation = Legend.LegendOrientation.HORIZONTAL
        l.setDrawInside(false)
        l.formSize = 8f
        l.formToTextSpace = 4f
        l.xEntrySpace = 6f
    }

    fun showInsulinaData(activity: StatisticsActivity, item: StatisticsItem){
        val insuline = item.values.subList(0, 3)
        val basal = item.values.subList(4, item.values.size)
        Log.e("ba", basal.toString())
        var insulineValues = insuline.toFloatArray()
        var label = activity.getString(R.string.statistics_insulina_basal_label)
        if (insuline.any{ it == 0f }){
            insulineValues = floatArrayOf(0f,0f,0f,0f)
            label = activity.getString(R.string.statistics_sd_label)
        }
        var values = ArrayList<BarEntry>()

        values.add(BarEntry(0f, basal.toFloatArray()))
        values.add(BarEntry(1f, insulineValues))


        var set1: BarDataSet
        set1 = BarDataSet(values, "")

        val colors= getColorsCategory(activity)
        set1.colors = colors
        set1.stackLabels =  arrayOf(activity.getString(R.string.register_breakfast_label), activity.getString(R.string.register_lunch_label),activity.getString(R.string.register_snack_label),activity.getString(R.string.register_dinner_label))

        var dataSets = ArrayList<IBarDataSet>()
        dataSets.add(set1)

        var data =  BarData(dataSets)
        data.setValueFormatter(StackedValueFormatter(true, "", 1))
        data.setValueTextColor(Color.BLACK)

        binding.statisticsItemBarchart.data = (data)
        binding.statisticsItemBarchart.setDrawValueAboveBar(false)
        binding.statisticsItemBarchart.xAxis.valueFormatter = StatisticsValueFormater(arrayOf(activity.getString(R.string.statistics_insulina_basal_label), label))
        binding.statisticsItemBarchart.setFitBars(true)
        binding.statisticsItemBarchart.invalidate()
        binding.statisticsItemBarchart.notifyDataSetChanged()
    }

    fun showCarbohidratosData(activity: StatisticsActivity, item: StatisticsItem){
        var set1= ArrayList<BarDataSet>()
        val colors= getColorsCategory(activity)
        val stackLabels =  arrayOf(activity.getString(R.string.register_breakfast_label), activity.getString(R.string.register_lunch_label),activity.getString(R.string.register_snack_label),activity.getString(R.string.register_dinner_label))
        for (i in item.values.indices){
            var values = ArrayList<BarEntry>()
            values.add(BarEntry(i.toFloat(), item.values[i]))
            var  bar = BarDataSet(values, stackLabels[i])
            bar.color = colors[i]
            set1.add(bar)
        }
        var dataSets = ArrayList<IBarDataSet>()
        dataSets.addAll(set1)

        var data =  BarData(dataSets)
        data.setValueTextColor(Color.BLACK)

        binding.statisticsItemBarchart.data = (data)
        binding.statisticsItemBarchart.setFitBars(true)
        binding.statisticsItemBarchart.invalidate()
        binding.statisticsItemBarchart.notifyDataSetChanged()

    }
    fun showStatesData(activity: StatisticsActivity, item: StatisticsItem){

        var set1= ArrayList<BarDataSet>()
        val colors= getColorsCategory(activity)
        val stackLabels =  arrayOf(activity.getString(R.string.state_happy), activity.getString(R.string.state_worried),activity.getString(R.string.state_relax),activity.getString(R.string.state_angry))
        for (i in item.values.indices){
            var values = ArrayList<BarEntry>()
            values.add(BarEntry(i.toFloat(), item.values[i]))
            var  bar = BarDataSet(values, stackLabels[i])
            bar.color = colors[i]
            set1.add(bar)
        }
        var dataSets = ArrayList<IBarDataSet>()
        dataSets.addAll(set1)

        var data =  BarData(dataSets)
        data.setValueTextColor(Color.BLACK)

        binding.statisticsItemBarchart.data = (data)
        binding.statisticsItemBarchart.setFitBars(true)
        binding.statisticsItemBarchart.invalidate()
    }

    fun showExercisesData(activity: StatisticsActivity, item: StatisticsItem){

        var set1= ArrayList<BarDataSet>()
        val colors= getColorsCategory(activity)
        val stackLabels =  arrayOf(activity.getString(R.string.activity_sedentary), activity.getString(R.string.activity_moderate),activity.getString(R.string.activity_party),activity.getString(R.string.activity_intense))
        for (i in item.values.indices){
            var values = ArrayList<BarEntry>()
            values.add(BarEntry(i.toFloat(), item.values[i]))
            var  bar = BarDataSet(values, stackLabels[i])
            bar.color = colors[i]
            set1.add(bar)
        }
        var dataSets = ArrayList<IBarDataSet>()
        dataSets.addAll(set1)

        var data =  BarData(dataSets)
        data.setValueTextColor(Color.BLACK)

        binding.statisticsItemBarchart.data = (data)
        binding.statisticsItemBarchart.setFitBars(true)
        binding.statisticsItemBarchart.invalidate()
    }
    fun getColorsCategory(context: Context): ArrayList<Int> {
        val colors = ArrayList<Int>()
        colors.add(getColor(context,  R.color.aqua))
        colors.add(getColor(context,  R.color.pink))
        colors.add(getColor(context,  R.color.yellow))
        colors.add(getColor(context,  R.color.purple))
        return colors
    }


}