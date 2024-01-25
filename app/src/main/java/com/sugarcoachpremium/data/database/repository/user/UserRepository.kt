package com.sugarcoachpremium.data.database.repository.user

import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class UserRepository @Inject constructor(private val userDao: UserDao): UserRepo {
    override fun deleteUser(): Observable<Boolean> {
        val dispoded = Observable.just(userDao)
            .subscribeOn(Schedulers.io())
            .subscribe { userDao ->
                userDao.deleteUser()}
            .isDisposed
        return Observable.just(dispoded)
    }

    override fun isUserLogged(): Boolean {
        return userDao.loadAll().isEmpty()
    }

    override fun getUserId(): Int {
        return userDao.loadOne().id
    }


    override fun insertRegister(user: User): Observable<Boolean> {
        val dispoded = Observable.just(userDao)
            .subscribeOn(Schedulers.io())
            .subscribe {
                    userDao ->  userDao.insert(user)
            }
            .isDisposed
        return Observable.just(dispoded)
    }

    override fun loadUser(): Single<User>
            = Single.fromCallable{ userDao.loadOne() }

    override fun isUserRepoEmpty(): Observable<Boolean>
            = Observable.just(userDao.loadAll().isEmpty())


    override fun updateUser(user: User): Observable<Boolean> {
        val dispoded = Observable.just(userDao)
            .subscribeOn(Schedulers.io())
            .subscribe { userDao ->     userDao.update(user)}
            .isDisposed

        return Observable.just(dispoded)
    }

}