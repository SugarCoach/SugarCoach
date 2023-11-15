package com.sugarcoach.data.api_db

import android.util.Log
import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.api.Optional
import com.sugarcoach.CreateDailyMutation
import com.sugarcoach.CreateUserMutation
import com.sugarcoach.DailyRegisterQuery
import com.sugarcoach.data.api_db.Treatment.TreatmentResponse
import com.sugarcoach.TreatmentQuery
import com.sugarcoach.UpdateDailyRegisterMutation
import com.sugarcoach.data.api_db.DailyRegister.DailyRegisterResponse
import com.sugarcoach.data.api_db.DailyRegister.domain.CreateDailyResponse
import com.sugarcoach.data.api_db.user.UserResponse
import com.sugarcoach.type.DailyRegisterInput
import com.sugarcoach.util.extensions.toDailyRegister
import com.sugarcoach.util.extensions.toTreatment
import com.sugarcoach.util.extensions.toUser
import javax.inject.Inject
import kotlin.Result.Companion.failure
import kotlin.Result.Companion.success

class ApiRepository @Inject constructor(
    private val apolloClient: ApolloClient
): ApiClient {
    override suspend fun getUserTreatment(id: String): TreatmentResponse? {
        val optionalId = Optional.present(id)
        Log.i("onRepository", "Se esta haciendo la request")
        return try {
            val response = apolloClient
                .query(TreatmentQuery(optionalId))
                .execute()
                .data
                ?.treatments
                ?.data
                ?.map { it.attributes.toTreatment() }
            response?.get(0)
        }catch (e: Exception){
            Log.i("OnTreatmentError", "Ocurrió un error: $e")
            null
        }


    }

    override suspend fun createUser(username: String, email: String, FirebaseId: String): Result<UserResponse?> {
        val optionalUser = Optional.present(username)
        val optionalEmail = Optional.present(email)
        val optionalId = Optional.present(FirebaseId)
        return try {
            val response = apolloClient
                .mutation(CreateUserMutation(username = optionalUser, email = optionalEmail, optionalId))
                .execute()
                .data
                ?.createUsersPermissionsUser
                ?.data

            Log.i("OnCreateUser", "$response")
            success(response?.attributes.toUser(response?.id!!))
        }catch (e: Exception){
            Log.i("OnUserError", "Ocurrió un error: $e")
            failure(e)
        }

    }
    override suspend fun getDailyRegisters(id: String): Result<List<DailyRegisterResponse>?> {
        return try{
            val optionalId = Optional.present(id)
            val response = apolloClient
                .query(DailyRegisterQuery(optionalId))
                .execute()
                .data
                ?.dailyRegisters
                ?.data
                ?.map { it.attributes.toDailyRegister() }
            Log.i("OnResponse", response.toString())
            success(response)
        }catch (e: Exception){
            Log.i("OnDailyError", "Ocurrió un error: ${e.initCause(e.cause)}")
            failure(e)
        }
    }

    override suspend fun createDailyRegister(dailyRegister: DailyRegisterInput): Result<CreateDailyResponse> {
        return try{
            val response = apolloClient
                .mutation(CreateDailyMutation(dailyRegister))
                .execute()
                .data
                ?.createDailyRegister
                ?.data

            Log.i("OnResponse", response!!.id!!)
            success(CreateDailyResponse(response.id!!, response.attributes!!.createdAt!!, response.attributes.updatedAt))
        }catch (e: Exception){
            Log.i("OnDailyError", "Ocurrió un error: ${e}")
            failure(e)
        }
    }

    override suspend fun updateDailyRegister(id: String, dailyRegister: DailyRegisterInput): Result<String?> {
        return try{
            val response = apolloClient
                .mutation(UpdateDailyRegisterMutation(id, dailyRegister))
                .execute()
                .data
                ?.updateDailyRegister
                ?.data
                ?.id
            success(response)
        }catch(e: Exception){
            failure(e)
        }
    }
}



