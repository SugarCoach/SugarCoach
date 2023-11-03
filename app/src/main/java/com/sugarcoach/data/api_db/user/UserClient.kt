package com.sugarcoach.data.api_db.user

interface UserClient {
    suspend fun createUser(username: String, email: String): Result<UserResponse?>
}