package com.sugarcoachpremium.ui.splash.interactor

import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister
import com.sugarcoachpremium.data.network.RegistersResponse
import com.sugarcoachpremium.data.ui.base.interactor.Interactor
import io.reactivex.Observable

interface SplashInteractorImp : Interactor {

    fun getRegistersCall(): Observable<List<RegistersResponse>>
    fun getUser(): Observable<Boolean>
    fun saveRegisters(registersResponse: List<DailyRegister>): Observable<Boolean>
}