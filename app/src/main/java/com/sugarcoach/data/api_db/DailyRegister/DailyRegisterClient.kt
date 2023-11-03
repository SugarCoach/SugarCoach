package com.sugarcoach.data.api_db.DailyRegister

import com.sugarcoach.data.database.repository.dailyregister.DailyRegister

interface DailyRegisterClient {
    suspend fun getDailyRegisters(id: String): Result<List<DailyRegisterResponse>?>

    suspend fun createDailyRegister(dailyRegister: DailyRegister)
}