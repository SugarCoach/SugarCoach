package com.sugarcoachpremium.data.api_db.Treatment

import com.sugarcoachpremium.type.TreatmentInput
import com.sugarcoachpremium.data.api_db.Treatment.domain.CreateTreatmentResponse


interface TreatmentClient {
    suspend fun getUserTreatment(id: String): Result<TreatmentResponse?>

    suspend fun createTreatment(treatment: TreatmentInput): Result<Boolean>

    suspend fun updateTreatment(id:String, treatment: TreatmentInput): Result<CreateTreatmentResponse>
}