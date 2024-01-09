package com.sugarcoachpremium.data.api_db.user

import com.sugarcoachpremium.type.UserDataInput

interface UserClient {
    suspend fun createUser(username: String, email: String, FirebaseId: String): Result<UserResponse?>

    suspend fun getUserId(firebaseUID: String): String?

    suspend fun updateUserData(user: UserDataInput, id: String): Result<Boolean>
    suspend fun getUserDataId(userId: String): Result<String>

    suspend fun createUserData(userId: String): Result<Boolean>
}