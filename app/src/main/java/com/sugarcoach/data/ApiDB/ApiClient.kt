package com.sugarcoach.data.ApiDB

import com.sugarcoach.data.ApiDB.DailyRegister.DailyRegisterClient
import com.sugarcoach.data.ApiDB.Treatment.TreatmentClient
interface ApiClient: TreatmentClient, DailyRegisterClient{
}