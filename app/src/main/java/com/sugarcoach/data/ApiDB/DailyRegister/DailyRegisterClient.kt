package com.sugarcoach.data.ApiDB.DailyRegister

interface DailyRegisterClient {
    suspend fun getDailyRegisters()
}