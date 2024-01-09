package com.sugarcoachpremium.data.database.repository.user

import androidx.room.*

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(user: User)

    @Query("SELECT * FROM user LIMIT 1")
    fun loadOne(): User

    @Query("SELECT * FROM user")
    fun loadAll(): List<User>

    @Query("DELETE FROM user")
    fun deleteUser()

    @Update()
    fun update(user: User)

}