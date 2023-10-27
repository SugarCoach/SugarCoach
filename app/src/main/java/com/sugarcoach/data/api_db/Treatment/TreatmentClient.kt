package com.sugarcoach.data.api_db.Treatment

interface TreatmentClient {
    suspend fun getUserTreatment(id: String): TreatmentResponse?
}