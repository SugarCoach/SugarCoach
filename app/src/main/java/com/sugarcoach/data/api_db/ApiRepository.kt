package com.sugarcoach.data.api_db

import android.util.Log
import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.api.Optional
import com.sugarcoach.CreateDailyMutation
import com.sugarcoach.CreateTreatmentMutation
import com.sugarcoach.CreateUserDataMutation
import com.sugarcoach.CreateUserMutation
import com.sugarcoach.DailyRegisterQuery
import com.sugarcoach.DeleteDailyRegisterMutation
import com.sugarcoach.GetUserByUIDQuery
import com.sugarcoach.GetUserDataQuery
import com.sugarcoach.data.api_db.Treatment.TreatmentResponse
import com.sugarcoach.TreatmentQuery
import com.sugarcoach.UpdateDailyRegisterMutation
import com.sugarcoach.UpdateTreatmentMutation
import com.sugarcoach.UpdateUserDataMutation
import com.sugarcoach.data.api_db.DailyRegister.DailyRegisterResponse
import com.sugarcoach.data.api_db.DailyRegister.domain.CreateDailyResponse
import com.sugarcoach.data.api_db.Treatment.domain.CreateTreatmentResponse
import com.sugarcoach.data.api_db.user.UserResponse
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.type.DailyRegisterInput
import com.sugarcoach.type.TreatmentInput
import com.sugarcoach.type.UserDataInput
import com.sugarcoach.util.extensions.toDailyRegister
import com.sugarcoach.util.extensions.toTreatment
import com.sugarcoach.util.extensions.toUser
import javax.inject.Inject
import kotlin.Result.Companion.failure
import kotlin.Result.Companion.success

class ApiRepository @Inject constructor(
    private val apolloClient: ApolloClient
): ApiClient {
    override suspend fun getUserTreatment(id: String): Result<TreatmentResponse?> {
        val optionalId = Optional.present(id)
        Log.i("onRepository", "Se esta haciendo la request. Id: $id")
        return try {
            val response = apolloClient
                .query(TreatmentQuery(optionalId))
                .execute()
                .data
                ?.treatments
                ?.data
            Log.i("OnGetUserTreatment", response?.get(0).toString())
            success(response?.get(0)?.attributes.toTreatment(response?.get(0)?.id!!))
        }catch (e: Exception){
            Log.i("OnTreatmentError", "Ocurrió un error: $e")
            failure(e)
        }


    }

    override suspend fun createUser(username: String, email: String, FirebaseId: String): Result<UserResponse?> {
        val optionalUser = Optional.present(username)
        val optionalEmail = Optional.present(email)
        val optionalFirebaseId = Optional.present(FirebaseId)
        return try {
            val response = apolloClient
                .mutation(CreateUserMutation(username = optionalUser, email = optionalEmail, optionalFirebaseId))
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

    override suspend fun getUserDataId(userId: String): Result<String> {

        return try {
            val response = apolloClient
                .query(GetUserDataQuery(userId))
                .execute()
                .data
                ?.usersData
                ?.data
                ?.get(0)

            Log.i("OnGetUserId", "$response")
            success(response?.id!!)
        }catch (e: Exception){
            Log.i("OnGetUserId", "Ocurrió un error: $e")
            failure(e)
        }
    }

    override suspend fun createUserData(userId: String): Result<Boolean> {
        return try {
            val response = apolloClient
                .mutation(CreateUserDataMutation(userId))
                .execute()
                .data
                ?.createUserData
                ?.data

            Log.i("OnCreateUserData", "$response")
            success(!response?.id.isNullOrEmpty())
        }catch (e: Exception){
            Log.i("OnUserError", "Ocurrió un error: $e")
            failure(e)
        }
    }

    override suspend fun updateUserData(user: UserDataInput, id: String): Result<Boolean> {
        return try {
            val response = apolloClient
                .mutation(UpdateUserDataMutation(user, id))
                .execute()
                .data
                ?.updateUserData
                ?.data

            Log.i("OnUpdateUserData", "$response")
            success(response?.id.isNullOrEmpty())
        }catch (e: Exception){
            Log.i("OnUpdateUserError", "Ocurrió un error: $e")
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

            Log.i("OnResponse", response.toString())
            //success(CreateDailyResponse("55", 0, 0))
            success(CreateDailyResponse(response?.id!!, response.attributes!!.createdAt!!, response.attributes.updatedAt))
        }catch (e: Exception){
            Log.i("OnDailyError", "Ocurrió un error: ${e.message}")
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
            Log.i("OnUpdateDailyRegister", "$response")
            success(response)
        }catch(e: Exception){
            failure(e)
        }
    }

    override suspend fun createTreatment(treatment: TreatmentInput): Result<Boolean> {
        return try{
            val response = apolloClient
                .mutation(CreateTreatmentMutation(treatment))
                .execute()
                .data
                ?.createTreatment
                ?.data
            Log.i("OnApiTreatment", "${CreateTreatmentResponse(response?.attributes?.createdAt, response?.attributes?.updatedAt)}")
            if (!response?.id.isNullOrEmpty()){
                success(true)
            }else{
                success(false)
            }
        }catch (e: Exception){
            failure(e)
        }
    }

    override suspend fun updateTreatment(id: String, treatment: TreatmentInput): Result<CreateTreatmentResponse> {
        return try{
            val response = apolloClient
                .mutation(UpdateTreatmentMutation(id, treatment))
                .execute()
                .data
                ?.updateTreatment
                ?.data

            success(CreateTreatmentResponse(response?.attributes?.createdAt,
                response?.attributes?.createdAt))
        }catch(e: Exception){
            failure(e)
        }
    }

    override suspend fun deleteDailyRegister(id: String): Result<String?>{
        return try{
            val response = apolloClient
                .mutation(DeleteDailyRegisterMutation(id))
                .execute()
                .data
                ?.deleteDailyRegister
                ?.data
                ?.id

            success(response)
        }catch(e: Exception){
            failure(e)
        }
    }

    override suspend fun getUserId(firebaseUID: String): String? {
        return try{
            val response = apolloClient
                .query(GetUserByUIDQuery(Optional.present(firebaseUID)))
                .execute()
                .data
                ?.usersPermissionsUsers
                ?.data
                ?.get(0)
                ?.id

            response
        }catch(e: Exception){
            ""
        }
    }
}



