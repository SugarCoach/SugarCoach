package com.sugarcoachpremium.ui.daily_detail.view

class DailyItem (
    internal val id: String,
    internal val name: String,
    internal val image: String
){
    data class Builder(
         private var id:String = "",
         private var name: String = "",
         private var image: String = ""){
        fun id(id: String) = apply { this.id = id }
        fun name(name: String) = apply { this.name = name }
        fun image(image: String) = apply { this.image = image }
        fun build() = DailyItem(id,name,image)
        fun set(item: DailyItem){
            DailyItem(item.id,item.name,item.image)
        }

    }




}
