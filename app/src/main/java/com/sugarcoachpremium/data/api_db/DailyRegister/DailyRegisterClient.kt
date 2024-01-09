package com.sugarcoachpremium.data.api_db.DailyRegister

import com.sugarcoachpremium.type.DailyRegisterInput
import com.sugarcoachpremium.data.api_db.DailyRegister.domain.CreateDailyResponse

interface DailyRegisterClient {
    suspend fun getDailyRegisters(id: String): Result<List<DailyRegisterResponse>?>

    suspend fun createDailyRegister(dailyRegister: DailyRegisterInput): Result<CreateDailyResponse>

    suspend fun updateDailyRegister(id: String, dailyRegister: DailyRegisterInput): Result<String?>

    suspend fun deleteDailyRegister(id: String): Result<String?>
}