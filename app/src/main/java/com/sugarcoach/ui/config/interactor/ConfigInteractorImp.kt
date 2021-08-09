package com.sugarcoach.ui.config.interactor

import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.treament.Treament
import com.sugarcoach.data.database.repository.user.User
import com.sugarcoach.data.network.LoginResponse
import com.sugarcoach.data.network.RegistersResponse
import com.sugarcoach.data.ui.base.interactor.Interactor
import io.reactivex.Observable
import io.reactivex.Single


interface ConfigInteractorImp : Interactor {

    fun getUser(): Single<User>
    fun updateUser(user: User): Observable<Boolean>
    fun doServerLoginpiCall(email: String, password: String): Observable<LoginResponse>
    fun updateUserInSharedPref(loginResponse: LoginResponse, mirror: Boolean)
    fun treament(treament: Treament): Observable<Boolean>
    fun category(): Observable<Boolean>
    fun states(): Observable<Boolean>
    fun exercises(): Observable<Boolean>
    fun treamentHorarios(): Observable<Boolean>
    fun treatmentHorariosCorrectora(): Observable<Boolean>
    fun getBasal(): Observable<Boolean>
    fun getCorrectora(): Observable<Boolean>
    fun getRegistersCall(): Observable<List<RegistersResponse>>
    fun saveRegisters(registersResponse: List<DailyRegister>): Observable<Boolean>
    fun deleteUser(): Observable<Boolean>
    fun deleteAll(): Observable<Boolean>
    fun deleteTreament(): Observable<Boolean>
    fun getMedidor(): Observable<Boolean>
}