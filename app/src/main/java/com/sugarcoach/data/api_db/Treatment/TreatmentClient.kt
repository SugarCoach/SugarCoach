package com.sugarcoach.data.api_db.Treatment

import com.sugarcoach.data.api_db.Treatment.domain.CreateTreatmentResponse
import com.sugarcoach.type.TreatmentInput

interface TreatmentClient {
    suspend fun getUserTreatment(id: String): TreatmentResponse?

    suspend fun createTreatment(treatment: TreatmentInput): Result<CreateTreatmentResponse>

    suspend fun updateTreatment(id: String, treatment: TreatmentInput): Result<CreateTreatmentResponse>
}