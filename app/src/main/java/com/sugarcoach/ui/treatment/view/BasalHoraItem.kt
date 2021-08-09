package com.sugarcoach.ui.treatment.view

class BasalHoraItem (internal val id: Int, internal val name: String, internal val units: String){
    data class Builder(private var id: Int = 0, private var name: String = "", private var units: String = ""){
        fun id(id: Int) = apply{this.id = id}
        fun name(name: String) = apply{this.name = name}
        fun units(units: String) = apply{this.units = units}
        fun build() = BasalHoraItem(id, name, units)
    }
}