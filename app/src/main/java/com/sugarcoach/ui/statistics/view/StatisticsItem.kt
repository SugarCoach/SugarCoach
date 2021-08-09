package com.sugarcoach.ui.statistics.view

import org.joda.time.DateTime
import java.time.Instant
import java.util.*
import kotlin.collections.ArrayList

class StatisticsItem(internal val name: Int,internal val index: Int, internal val values: ArrayList<Float>, internal val types: List<String>){
    data class Builder(
        private var name: Int = 0,
        private var index: Int = 0,
        private var values: ArrayList<Float> = ArrayList(),
        private var types: List<String> = ArrayList()){

        fun name(name: Int) = apply { this.name = name }
        fun index(index: Int) = apply { this.index = index }
        fun values(values: ArrayList<Float>) = apply { this.values = values }
        fun types(types: List<String> ) = apply { this.types = types }
        fun build() = StatisticsItem(
            name,
            index,
            values,
            types
        )
    }
}