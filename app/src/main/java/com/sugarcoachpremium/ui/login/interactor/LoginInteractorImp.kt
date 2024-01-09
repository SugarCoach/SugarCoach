package com.sugarcoachpremium.ui.login.interactor

import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister
import com.sugarcoachpremium.data.database.repository.treament.Treament
import com.sugarcoachpremium.data.network.LoginResponse
import com.sugarcoachpremium.data.network.RegistersResponse
import com.sugarcoachpremium.data.ui.base.interactor.Interactor
import io.reactivex.Observable


interface LoginInteractorImp : Interactor {

    suspend fun getUserData(userUID: String?): Result<String>
    suspend fun doServerLoginpiCall(email: String, password: String): Observable<LoginResponse>
    fun updateUserInSharedPref(loginResponse: LoginResponse, mirror: Boolean, medico: Boolean)
    fun treament(treament: Treament): Observable<Boolean>
    fun category(): Observable<Boolean>
    fun states(): Observable<Boolean>
    fun exercises(): Observable<Boolean>
    fun treamentHorarios(): Observable<Boolean>
    fun treatmentHorariosCorrectora(): Observable<Boolean>
    fun treatmentBasalHora(): Observable<Boolean>
    fun getBasal(): Observable<Boolean>
    fun getCorrectora(): Observable<Boolean>
    fun getRegistersCall(): Observable<List<RegistersResponse>>
    fun saveRegisters(registersResponse: List<DailyRegister>): Observable<Boolean>
    fun getMedidor(): Observable<Boolean>
    fun getBombas(): Observable<Boolean>

}