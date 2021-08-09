package com.sugarcoach.data.database.repository.treament;

import androidx.room.Embedded
import com.sugarcoach.data.database.repository.dailyregister.Category

data class TreatmentHCorrectoraCategory(
    @Embedded
    var treamentCorrectoraHorarios: TreamentCorrectoraHorarios? = null,
    @Embedded
    var category: Category? = null
)

