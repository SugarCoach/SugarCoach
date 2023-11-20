package com.sugarcoach.data.api_db.Treatment

import com.sugarcoach.data.api_db.Treatment.domain.CreateTreatmentResponse
import com.sugarcoach.type.TreatmentInput

interface TreatmentClient {
    suspend fun getUserTreatment(id: String): Result<TreatmentResponse?>

    suspend fun createTreatment(treatment: TreatmentInput): Result<Boolean>

    suspend fun updateTreatment(id:String, treatment: TreatmentInput): Result<CreateTreatmentResponse>
}