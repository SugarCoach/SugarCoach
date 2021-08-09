package com.sugarcoach.ui.treatment.view

class BasalItem (internal val id: Int, internal val name: String){
    data class Builder(private var id: Int = 0, private var name: String = ""){
        fun id(id: Int) = apply{this.id = id}
        fun name(name: String) = apply{this.name = name}
        fun build() = BasalItem(id, name)
    }
}