package com.sugarcoach.data.api_db.DailyRegister

import com.sugarcoach.data.api_db.DailyRegister.domain.CreateDailyResponse
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.type.DailyRegisterInput

interface DailyRegisterClient {
    suspend fun getDailyRegisters(id: String): Result<List<DailyRegisterResponse>?>

    suspend fun createDailyRegister(dailyRegister: DailyRegisterInput): Result<CreateDailyResponse>

    suspend fun updateDailyRegister(id: String, dailyRegister: DailyRegisterInput): Result<String?>
}