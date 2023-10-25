package com.sugarcoach.data.ApiDB.data

import android.util.Log
import com.apollographql.apollo3.ApolloClient
import com.google.android.gms.common.data.DataBufferObserver.Observable
import com.sugarcoach.data.ApiDB.ApiClient
import com.sugarcoach.data.ApiDB.Treatment.TreatmentResponse
import com.sugarcoach.TreatmentQuery

class ApolloApiClient (
    private val apolloClient: ApolloClient
): ApiClient{

    override suspend fun getUserTreatment(id: String): TreatmentResponse? {
        val response = apolloClient
            .query(TreatmentQuery("1"))
            .execute()
            .data
            ?.treatments
            ?.data
            ?.map { it.attributes }

        Log.i("OnTreatmentResponse:", "La response fue: $response")
        return TreatmentResponse(false, 123F)
    }

    override suspend fun getDailyRegisters() {
        TODO("Not yet implemented")
    }

}