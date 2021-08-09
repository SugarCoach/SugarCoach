package com.sugarcoach.ui.login.interactor

import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.treament.Treament
import com.sugarcoach.data.network.LoginResponse
import com.sugarcoach.data.network.RegistersResponse
import com.sugarcoach.data.ui.base.interactor.Interactor
import io.reactivex.Observable


interface LoginInteractorImp : Interactor {
    fun doServerLoginpiCall(email: String, password: String): Observable<LoginResponse>
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