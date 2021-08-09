package com.sugarcoach.ui.treatment.view

class HorarioItem (internal val id: Int, internal val name: String, internal val categoryId: Int, internal val selected: Boolean, internal val units: String){
    data class Builder(private var id: Int = 0, private var name: String = "", private var categoryId: Int = 0,private var selected: Boolean = false, private var units: String = ""){
        fun id(id: Int) = apply{this.id = id}
        fun name(name: String) = apply{this.name = name}
        fun units(units: String) = apply{this.units = units}
        fun categoryId (categoryId: Int) = apply{this.categoryId = categoryId}
        fun selected(selected: Boolean) = apply{this.selected = selected}
        fun build() = HorarioItem(id, name, categoryId,selected, units)
    }
}