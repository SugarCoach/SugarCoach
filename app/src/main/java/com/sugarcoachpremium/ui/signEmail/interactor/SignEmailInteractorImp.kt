package com.sugarcoachpremium.ui.signEmail.interactor

import com.google.firebase.auth.FirebaseUser
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegister
import com.sugarcoachpremium.data.database.repository.treament.Treament
import com.sugarcoachpremium.data.network.LoginResponse
import com.sugarcoachpremium.data.ui.base.interactor.Interactor
import io.reactivex.Observable


interface SignEmailInteractorImp : Interactor {
    fun updateUser(signResponse: FirebaseUser?): Observable<Boolean>
    suspend fun updateCloudUser(signResponse: FirebaseUser?): Result<Boolean>
    fun saveRegisters(registersResponse: List<DailyRegister>): Observable<Boolean>
    fun updateUserSocial(loginResponse: LoginResponse)
    fun treament(treament: Treament): Observable<Boolean>
    suspend fun insertTreatment(treament: Treament): Result<Boolean>
    suspend fun createUserData(): Result<Boolean>
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