package com.sugarcoach.data.ApiDB.Treatment

interface TreatmentClient {

    suspend fun getUserTreatment(id: String): TreatmentResponse?


}