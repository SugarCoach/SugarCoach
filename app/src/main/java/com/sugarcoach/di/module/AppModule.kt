package com.sugarcoach.di.module

import android.app.Application
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sugarcoach.BuildConfig.*
import com.sugarcoach.data.database.AppDatabase
import com.sugarcoach.data.database.repository.dailyregister.DailyRegisterRepo
import com.sugarcoach.data.database.repository.dailyregister.DailyRegisterRepository
import com.sugarcoach.data.database.repository.treament.TreamentRepo
import com.sugarcoach.data.database.repository.treament.TreamentRepository
import com.sugarcoach.data.database.repository.treament.TreamentRepository_Factory
import com.sugarcoach.data.database.repository.user.UserRepo
import com.sugarcoach.data.database.repository.user.UserRepository
import com.sugarcoach.data.network.ApiHelper
import com.sugarcoach.data.preferences.AppPreferenceHelper
import com.sugarcoach.di.PreferenceInfo
import com.sugarcoach.di.preferences.PreferenceHelper
import com.sugarcoach.util.AppConstants
import com.sugarcoach.util.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application

    @Provides
    @Singleton
    internal fun provideAppDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, AppConstants.APP_DB_NAME).allowMainThreadQueries().setJournalMode(RoomDatabase.JournalMode.TRUNCATE).fallbackToDestructiveMigration().build()


    @Provides
    @PreferenceInfo
    internal fun provideprefFileName(): String = AppConstants.PREF_NAME

    @Provides
    @Singleton
    internal fun providePrefHelper(appPreferenceHelper: AppPreferenceHelper): PreferenceHelper = appPreferenceHelper

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        val okHttpBuilder = OkHttpClient.Builder()
        if (DEBUG) {
            val httpLoggingInterceptor = HttpLoggingInterceptor()
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            okHttpBuilder.addInterceptor(httpLoggingInterceptor)
        }
        okHttpBuilder.addInterceptor {
            val request = it.request()
            val url = request.url.newBuilder()
                .build()
            it.proceed(request.newBuilder().url(url).build())
        }
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpBuilder.build())
            .build()
    }


    @Provides
    @Singleton
    internal fun provideApiHelper(retrofit: Retrofit): ApiHelper =  retrofit.create(ApiHelper::class.java)

    @Provides
    @Singleton
    internal fun provideUserRepoHelper(appDatabase: AppDatabase): UserRepo = UserRepository(appDatabase.userDao())

    @Provides
    @Singleton
    internal fun provideTreamentRepoHelper(appDatabase: AppDatabase): TreamentRepo = TreamentRepository(appDatabase.treamentDao())


    @Provides
    @Singleton
    internal fun provideDailyRepoHelper(appDatabase: AppDatabase): DailyRegisterRepo = DailyRegisterRepository(appDatabase.dailyRegisterDao())

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    internal fun provideSchedulerProvider(): SchedulerProvider = SchedulerProvider()


}