package com.sugarcoachpremium.ui.profile.interactor

import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.data.ui.base.interactor.Interactor
import io.reactivex.Observable
import io.reactivex.Single


interface ProfileInteractorImp : Interactor {

    fun getUser(): Single<User>
    fun updateUser(user: User): Observable<Boolean>

    suspend fun getDataId(): Result<String>
    suspend fun updateApiUser(user: User, id: String): Result<Boolean>
    fun deleteUser(): Observable<Boolean>
    fun deleteAll(): Observable<Boolean>
    fun deleteTreament(): Observable<Boolean>
}