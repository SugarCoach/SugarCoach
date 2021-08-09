package com.sugarcoach.data.database.repository.treament;

import androidx.room.Embedded
import com.sugarcoach.data.database.repository.dailyregister.Category

data class TreatmentHorariosCategory(
    @Embedded
    var treamentHorarios: TreamentHorarios? = null,
    @Embedded
    var category: Category? = null
)

