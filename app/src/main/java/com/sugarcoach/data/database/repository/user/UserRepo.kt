package com.sugarcoach.data.database.repository.user

import io.reactivex.Observable
import io.reactivex.Single


interface UserRepo {

    fun isUserRepoEmpty(): Observable<Boolean>

    fun insertRegister(user: User): Observable<Boolean>

    fun loadUser(): Single<User>

    fun getUserId(): Int

    fun isUserLogged(): Boolean

    fun deleteUser(): Observable<Boolean>

    fun updateUser(user: User): Observable<Boolean>



}