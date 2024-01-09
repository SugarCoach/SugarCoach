package com.sugarcoachpremium.ui.register.view

class RegisterItem (
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
        fun build() = RegisterItem(id,name,image)
        fun set(item: RegisterItem){
            RegisterItem(item.id,item.name,item.image)
        }

    }




}
