package com.sugarcoachpremium.data.api_db.user

import com.sugarcoachpremium.GetUserByUIDQuery
import com.sugarcoachpremium.GetUserDataQuery
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.type.UserDataInput

interface UserClient {
    suspend fun createUser(username: String, email: String, FirebaseId: String): Result<UserResponse?>

    suspend fun getUserId(firebaseUID: String): Result<GetUserByUIDQuery.Data1?>

    suspend fun updateUserData(user: UserDataInput, id: String): Result<Boolean>
    suspend fun getUserDataId(userId: String): Result<String>

    suspend fun createUserData(userId: String): Result<Boolean>

    suspend fun getUserData(userId: String): GetUserDataQuery.Attributes?
}