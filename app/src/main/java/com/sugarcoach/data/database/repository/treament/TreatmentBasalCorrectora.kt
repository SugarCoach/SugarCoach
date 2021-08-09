package com.sugarcoach.data.database.repository.treament;

import androidx.room.Embedded

data class TreatmentBasalCorrectora(
    @Embedded
    var treament: Treament? = null,
    @Embedded
    var basalInsuline: BasalInsuline? = null,
    @Embedded
    var correctoraInsuline: CorrectoraInsuline? = null
)

