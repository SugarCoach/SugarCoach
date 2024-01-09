package com.sugarcoachpremium.data.api_db

import com.sugarcoachpremium.data.api_db.DailyRegister.DailyRegisterClient
import com.sugarcoachpremium.data.api_db.Treatment.TreatmentClient
import com.sugarcoachpremium.data.api_db.user.UserClient

interface ApiClient: TreatmentClient, DailyRegisterClient, UserClient{
}