package com.sugarcoach.ui.signEmail.interactor

import com.facebook.AccessToken
import com.sugarcoach.data.database.repository.dailyregister.DailyRegister
import com.sugarcoach.data.database.repository.treament.Treament
import com.sugarcoach.data.network.LoginResponse
import com.sugarcoach.data.network.RegistersResponse
import com.sugarcoach.data.network.SignResponse
import com.sugarcoach.data.ui.base.interactor.Interactor
import io.reactivex.Observable


interface SignEmailInteractorImp : Interactor {
    fun updateUser(signResponse: SignResponse)
    fun doServerSignApiCall(username: String, email: String, password: String): Observable<SignResponse>
    fun getRegistersCall(): Observable<List<RegistersResponse>>
    fun saveRegisters(registersResponse: List<DailyRegister>): Observable<Boolean>
    fun doFBLoginApiCall(accessToken: AccessToken): Observable<LoginResponse>
    fun doGoogleLoginApiCall(token: String?): Observable<LoginResponse>
    fun updateUserSocial(loginResponse: LoginResponse)
    fun treament(treament: Treament): Observable<Boolean>
    fun category(): Observable<Boolean>
    fun states(): Observable<Boolean>
    fun exercises(): Observable<Boolean>
    fun treamentHorarios(): Observable<Boolean>
    fun treamentBasalHora(): Observable<Boolean>
    fun treatmentHorariosCorrectora(): Observable<Boolean>
    fun getBasal(): Observable<Boolean>
    fun getMedidor(): Observable<Boolean>
    fun getBombas(): Observable<Boolean>
    fun getCorrectora(): Observable<Boolean>



}