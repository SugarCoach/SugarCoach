package com.sugarcoach.ui.splash.interactor

import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.treament.Treament
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.data.network.RegisterSaveResponse
import com.sugarcoach.data.network.RegistersResponse
import com.sugarcoach.data.ui.base.interactor.Interactor
import io.reactivex.Observable
import io.reactivex.Single

interface SplashInteractorImp : Interactor {

    fun getRegistersCall(): Observable<List<RegistersResponse>>
    fun getUser(): Observable<Boolean>
    fun saveRegisters(registersResponse: List<DailyRegister>): Observable<Boolean>
}