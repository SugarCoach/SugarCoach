package com.sugarcoach.ui.statistics.view

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
import com.sugarcoach.R
import com.sugarcoach.util.CustomPercentFormatter
import kotlinx.android.synthetic.main.statistics_item.view.*
import kotlin.collections.ArrayList

class StatisticsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    fun inflateData(item: StatisticsItem, position: Int, activity: StatisticsActivity ) {


        itemView.statistics_item_title.text = activity.getString(item.name)
        setUpGlucemia()
        setUpInsulina()

        when(position){
            0 -> {
                itemView.statistics_item_piechart.visibility = View.VISIBLE
                itemView.statistics_item_barchart.visibility = View.GONE
                itemView.statistics_item_types.visibility = View.VISIBLE
                itemView.statistics_item_types_insulina.visibility = View.GONE
                itemView.statistics_item_types_car.visibility = View.GONE
                itemView.statistics_item_types_exercise.visibility = View.GONE
                itemView.statistics_item_types_state.visibility = View.GONE
                itemView.statistics_item_types.setItems(item.types)
                itemView.statistics_item_types.selectItemByIndex(item.index)
                itemView.statistics_item_types.setOnSpinnerItemSelectedListener<String> { index, item ->
                    activity.showCalendar(position,index)
                }
                showGlucemiaData(activity, item)

            }
            1 -> {
                itemView.statistics_item_piechart.visibility = View.GONE
                itemView.statistics_item_barchart.visibility = View.VISIBLE
                itemView.statistics_item_types.visibility = View.GONE
                itemView.statistics_item_types_insulina.visibility = View.VISIBLE
                itemView.statistics_item_types_car.visibility = View.GONE
                itemView.statistics_item_types_exercise.visibility = View.GONE
                itemView.statistics_item_types_state.visibility = View.GONE
                itemView.statistics_item_types_insulina.setItems(item.types)
                itemView.statistics_item_types_insulina.selectItemByIndex(item.index)
                itemView.statistics_item_types_insulina.setOnSpinnerItemSelectedListener<String> { index, item ->
                    activity.showCalendar(position,index)
                }
                showInsulinaData(activity, item)

            }
            2 -> {
                itemView.statistics_item_piechart.visibility = View.GONE
                itemView.statistics_item_barchart.visibility = View.VISIBLE
                itemView.statistics_item_types.visibility = View.GONE
                itemView.statistics_item_types_insulina.visibility = View.GONE
                itemView.statistics_item_types_car.visibility = View.VISIBLE
                itemView.statistics_item_types_exercise.visibility = View.GONE
                itemView.statistics_item_types_state.visibility = View.GONE
                itemView.statistics_item_types_car.setItems(item.types)
                itemView.statistics_item_types_car.selectItemByIndex(item.index)
                itemView.statistics_item_types_car.setOnSpinnerItemSelectedListener<String> { index, item ->
                    activity.showCalendar(position,index)
                }
                showCarbohidratosData(activity, item)
            }
            3 -> {
                itemView.statistics_item_piechart.visibility = View.GONE
                itemView.statistics_item_barchart.visibility = View.VISIBLE
                itemView.statistics_item_types.visibility = View.GONE
                itemView.statistics_item_types_insulina.visibility = View.GONE
                itemView.statistics_item_types_car.visibility = View.GONE
                itemView.statistics_item_types_exercise.visibility = View.VISIBLE
                itemView.statistics_item_types_state.visibility = View.GONE
                itemView.statistics_item_types_exercise.setItems(item.types)
                itemView.statistics_item_types_exercise.selectItemByIndex(item.index)
                itemView.statistics_item_types_exercise.setOnSpinnerItemSelectedListener<String> { index, item ->
                    activity.showCalendar(position,index)
                }
                showExercisesData(activity, item)
            }
            4 -> {
                itemView.statistics_item_piechart.visibility = View.GONE
                itemView.statistics_item_barchart.visibility = View.VISIBLE
                itemView.statistics_item_types.visibility = View.GONE
                itemView.statistics_item_types_insulina.visibility = View.GONE
                itemView.statistics_item_types_car.visibility = View.GONE
                itemView.statistics_item_types_exercise.visibility = View.GONE
                itemView.statistics_item_types_state.visibility = View.VISIBLE
                itemView.statistics_item_types_state.setItems(item.types)
                itemView.statistics_item_types_state.selectItemByIndex(item.index)
                itemView.statistics_item_types_state.setOnSpinnerItemSelectedListener<String> { index, item ->
                    activity.showCalendar(position,index)
                }
                showStatesData(activity, item)
            }

        }

    }


    fun setUpGlucemia(){
        itemView.statistics_item_piechart.description.isEnabled = false
        itemView.statistics_item_piechart.dragDecelerationFrictionCoef = 0.95f
        itemView.statistics_item_piechart.isDrawHoleEnabled = false
        itemView.statistics_item_piechart.rotationAngle =0f
        itemView.statistics_item_piechart.isRotationEnabled = true
        itemView.statistics_item_piechart.isHighlightPerTapEnabled = true

       // itemView.statistics_item_piechart.animateY(1400, Easing.EaseInOutQuad);
        var l = itemView.statistics_item_piechart.legend
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
        data.setValueFormatter(CustomPercentFormatter(itemView.statistics_item_piechart))
        data.setValueTextSize(11f)
        data.setValueTextColor(Color.BLACK)
        itemView.statistics_item_piechart.data = (data)
        itemView.statistics_item_piechart.legend.setCustom(lentries)

        // undo all highlights
        itemView.statistics_item_piechart.highlightValues(null)
        itemView.statistics_item_piechart.invalidate()
        itemView.statistics_item_piechart.notifyDataSetChanged()
    }

    fun setUpInsulina(){
        itemView.statistics_item_barchart.description.isEnabled = false
        itemView.statistics_item_barchart.isEnabled = false
        itemView.statistics_item_barchart.setPinchZoom(false)
        itemView.statistics_item_barchart.setDrawGridBackground(true)
        itemView.statistics_item_barchart.setDrawBarShadow(false)
        itemView.statistics_item_barchart.isHighlightFullBarEnabled = false

        // change the position of the y-labels
        var leftAxis  = itemView.statistics_item_barchart.axisLeft
        leftAxis.axisMinimum = 0f
        itemView.statistics_item_barchart.axisRight.isEnabled =false

        var xLabels = itemView.statistics_item_barchart.xAxis;
        xLabels.position = XAxis.XAxisPosition.TOP
        xLabels.granularity = 1f

        var l = itemView.statistics_item_barchart.legend;
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

        itemView.statistics_item_barchart.data = (data)
        itemView.statistics_item_barchart.setDrawValueAboveBar(false)
        itemView.statistics_item_barchart.xAxis.valueFormatter = StatisticsValueFormater(arrayOf(activity.getString(R.string.statistics_insulina_basal_label), label))
        itemView.statistics_item_barchart.setFitBars(true)
        itemView.statistics_item_barchart.invalidate()
        itemView.statistics_item_barchart.notifyDataSetChanged()
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

        itemView.statistics_item_barchart.data = (data)
        itemView.statistics_item_barchart.setFitBars(true)
        itemView.statistics_item_barchart.invalidate()
        itemView.statistics_item_barchart.notifyDataSetChanged()

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

        itemView.statistics_item_barchart.data = (data)
        itemView.statistics_item_barchart.setFitBars(true)
        itemView.statistics_item_barchart.invalidate()
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

        itemView.statistics_item_barchart.data = (data)
        itemView.statistics_item_barchart.setFitBars(true)
        itemView.statistics_item_barchart.invalidate()
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