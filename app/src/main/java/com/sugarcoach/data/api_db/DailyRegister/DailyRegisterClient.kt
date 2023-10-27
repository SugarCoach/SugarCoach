package com.sugarcoach.data.api_db.DailyRegister

interface DailyRegisterClient {
    suspend fun getDailyRegisters()
}