package com.sugarcoachpremium.ui.treatment.view

import android.text.InputFilter
import android.text.Spanned
import java.util.regex.Pattern

class DecimalDigitsInputFilter(
    private val digitsBeforeZero: Int,
    private val digitsAfterZero: Int
) : InputFilter {

    private val regex = Regex("^[0-9]{0,$digitsBeforeZero}+((\\.[0-9]{0,$digitsAfterZero})?)$")

    override fun filter(
        source: CharSequence?,
        start: Int,
        end: Int,
        dest: Spanned?,
        dstart: Int,
        dend: Int
    ): CharSequence? {
        val newString = dest?.substring(0, dstart) +
                (source?.substring(start, end) ?: "") +
                dest?.substring(dend, dest.length)

        return if (regex.matches(newString)) {
            null // Acepta el input
        } else {
            "" // Bloquea el input
        }
    }
}