package com.sugarcoach.ui.daily.view

import com.hominoid.expandablerecyclerviewlib.models.Child
import com.sugarcoach.data.database.repository.dailyregister.Exercises
import com.sugarcoach.data.database.repository.dailyregister.States
import java.util.*

class DailyItem(internal val id: Int, internal val bgColor: Int,  internal val gluColor: Int, internal val date: Date?, internal val glucose: String?, internal val carbohydrates: String?, internal val basal: String?, internal val insulin: String?, internal val category: String?, internal val exercise: Exercises?, internal val state: States?): Child<DailyItem>() {

    data class Builder(
        private var id: Int = 0,
        private var bgColor: Int = 0,
        private var gluColor: Int = 0,
        private var date: Date? = null,
        private var glucose: String? = null,
        private var carbohydrates: String? = null,
        private var basal: String? = null,
        private var insulin: String? = null,
        private var category: String? = null,
        private var exercise: Exercises? = null,
        private var state: States? = null) {

        fun id(id: Int) = apply { this.id = id }
        fun gluColor(gluColor: Int) = apply { this.gluColor = gluColor }
        fun bgColor(bgColor: Int) = apply { this.bgColor = bgColor }
        fun date(date: Date?) = apply { this.date = date }
        fun glucose(glucose: String) = apply { this.glucose = glucose }
        fun carbohydrates(carbohydrates: String) = apply { this.carbohydrates = carbohydrates }
        fun basal(basal: String) = apply { this.basal = basal }
        fun insulin(insulin: String) = apply { this.insulin = insulin }
        fun category(category: String) = apply { this.category = category }
        fun exercise(exercise: Exercises?) = apply { this.exercise = exercise }
        fun state(state: States?) = apply { this.state = state }
        fun build() = DailyItem(
            id,
            bgColor,
            gluColor,
            date,
            glucose,
            carbohydrates,
            basal,
            insulin,
            category,
            exercise,
            state
        )
    }
}