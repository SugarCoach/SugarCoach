package com.sugarcoachpremium.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.sugarcoachpremium.data.database.repository.dailyregister.*
import com.sugarcoachpremium.data.database.repository.treament.*
import com.sugarcoachpremium.data.database.repository.user.User
import com.sugarcoachpremium.data.database.repository.user.UserDao
import com.sugarcoachpremium.util.Converters


@Database(entities = [(DailyRegister::class), (User::class), (Treament::class), (TreamentHorarios::class),(TreamentCorrectoraHorarios::class), (BasalInsuline::class), (CorrectoraInsuline::class), (Category::class), (States::class), (Exercises::class), (TreamentBasalHora::class), (Medidor::class), (BombaInfusora::class)], version = 50, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun treamentDao(): TreamentDao

    abstract fun userDao(): UserDao

    abstract fun dailyRegisterDao(): DailyRegisterDao
}