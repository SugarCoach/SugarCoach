package com.sugarcoach.ui.profile.view

class ProfileItem (internal val id: Int, internal val image: String, internal var selected:Boolean){
    data class Builder(private var id: Int = 0, private var image: String = "", private var selected:Boolean = false){
        fun id(id: Int) = apply{this.id = id}
        fun image(image: String) = apply{this.image = image}
        fun selected(selected: Boolean) = apply{this.selected = selected}
        fun build() = ProfileItem(id, image, selected)
    }
}