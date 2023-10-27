package com.sugarcoach.data.api_db

import android.util.Log
import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.api.Optional
import com.sugarcoach.CreateUserMutation
import com.sugarcoach.data.api_db.Treatment.TreatmentResponse
import com.sugarcoach.TreatmentQuery
import com.sugarcoach.data.api_db.user.UserResponse
import com.sugarcoach.util.extensions.toTreatment
import com.sugarcoach.util.extensions.toUser
import javax.inject.Inject

class ApiRepository @Inject constructor(
    private val apolloClient: ApolloClient
): ApiClient {
    override suspend fun getUserTreatment(id: String): TreatmentResponse? {
        val optionalId = Optional.present(id)
        Log.i("onRepository", "Se esta haciendo la request")
        val response = apolloClient
            .query(TreatmentQuery(optionalId))
            .execute()
            .data
            ?.treatments
            ?.data
            ?.map { it.attributes.toTreatment() }

        return response?.get(0)
    }

    override suspend fun createUser(username: String, email: String): UserResponse {
        val response = apolloClient
            .mutation(CreateUserMutation())
            .execute()
            .data
            ?.createUsersPermissionsUser
            ?.data
            ?.attributes
            ?.toUser()

        Log.i("OnCreateUser", "$response")

        return UserResponse("asd","asd", false)
    }
    override suspend fun getDailyRegisters() {
        TODO("Not yet implemented")
    }

}



