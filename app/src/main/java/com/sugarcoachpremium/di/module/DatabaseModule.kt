package com.sugarcoachpremium.di.module

import android.app.Application
import androidx.room.Room
import com.sugarcoachpremium.data.database.AppDatabase
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterDao
import com.sugarcoachpremium.data.database.repository.treament.TreamentDao
import com.sugarcoachpremium.data.database.repository.user.UserDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    fun provideDailyRegisterDao(db: AppDatabase): DailyRegisterDao = db.dailyRegisterDao()

    @Provides
    fun provideUserDao(db: AppDatabase): UserDao = db.userDao()

    @Provides
    fun provideTreamentDao(db: AppDatabase): TreamentDao = db.treamentDao()
}
