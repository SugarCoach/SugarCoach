package com.sugarcoachpremium.ui.onboarding.view

class BoardingItem(internal val bg: Int, internal val image: Int, internal val title: Int, internal val subtitle: Int, internal val showButton: Boolean){
    data class Builder(
        private var bg: Int = 0,
        private var image: Int = 0,
        private var title: Int = 0,
        private var subtitle: Int = 0,
        private var showButton: Boolean = false){

        fun bg(bg: Int) = apply { this.bg = bg }
        fun image(image: Int) = apply { this.image = image }
        fun title(title: Int) = apply { this.title = title }
        fun subtitle(subtitle: Int) = apply { this.subtitle = subtitle }
        fun showButton(showButton: Boolean) = apply { this.showButton = showButton }
        fun build() = BoardingItem(bg, image, title, subtitle, showButton)
    }
}