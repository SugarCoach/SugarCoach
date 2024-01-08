package com.sugarcoach.data.api_db

import com.sugarcoach.data.api_db.DailyRegister.DailyRegisterClient
import com.sugarcoach.data.api_db.Treatment.TreatmentClient
import com.sugarcoach.data.api_db.user.UserClient

interface ApiClient: TreatmentClient, DailyRegisterClient, UserClient{
}