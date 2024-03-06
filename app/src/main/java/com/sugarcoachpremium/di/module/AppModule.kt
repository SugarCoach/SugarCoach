package com.sugarcoachpremium.di.module

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.room.Room
import androidx.room.RoomDatabase
import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.network.okHttpClient
import com.sugarcoachpremium.data.api_db.ApiClient
import com.sugarcoachpremium.data.api_db.ApiRepository
import com.sugarcoachpremium.data.database.AppDatabase
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo
import com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepository
import com.sugarcoachpremium.data.database.repository.treament.TreamentRepo
import com.sugarcoachpremium.data.database.repository.treament.TreamentRepository
import com.sugarcoachpremium.data.database.repository.user.UserRepo
import com.sugarcoachpremium.data.database.repository.user.UserRepository
import com.sugarcoachpremium.data.network.ApiHelper
import com.sugarcoachpremium.data.preferences.AppPreferenceHelper
import com.sugarcoachpremium.di.PreferenceInfo
import com.sugarcoachpremium.di.preferences.PreferenceHelper
import com.sugarcoachpremium.util.AppConstants
import com.sugarcoachpremium.util.SchedulerProvider
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

    private val PRODUCTIONAPITOKEN = "407f65c84995cb113a6911ba72c0b88d0b1659c74d5bf27fd05dc705631be9d81fde453ba5a5007c008ecefd56cf3f4f67cf9da5a65b9c411d72cf60ffdf1ff04ecff86ea0609259ee57f46dead479a9b85950f8af16e2f0aa3b22bc1cfa3d1a8a26db07f96f238545b6d108bb3956c119376b72066a186eb872cba5a6d654cd"
    private val DEVELOPAPITOKEN = "5d913c4bd45cefe7702664e36def1d4e3418c2134ea03d283ded5eb1f83c88e3c5a53b2300869810d686f99629e8cfe14a3bd998da6d8178ca19de9aca86a77a3dee5d42f0ecc74b2a1f6fd24b163f3ebd5f6b43dcbedd84dbf4daf28f8764298bf7ebf9eaea8c1b0de87b6211ab1015241b2c78cbe447d0cf251d56090f2a7a"
    @Provides
    @Singleton
    internal fun provideApolloClient(): ApolloClient {
        Log.i("OnProvideApi", "Se esta creando la API")
        return ApolloClient.Builder()
            .serverUrl("https://monkfish-app-nqddj.ondigitalocean.app/graphql")
            .okHttpClient(OkHttpClient.Builder().build())
            //.addHttpHeader("Authorization", PRODUCTIONAPITOKEN)
            .build()
    }
    @Provides
    @Singleton
    internal fun getRepository(client: ApolloClient): ApiClient = ApiRepository(client)

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application

    @Provides
    @Singleton
    internal fun provideAppDatabase(context: Context): AppDatabase {
        val database = Room.databaseBuilder(context, AppDatabase::class.java, AppConstants.APP_DB_NAME)
            .allowMainThreadQueries()
            .setJournalMode(RoomDatabase.JournalMode.TRUNCATE).fallbackToDestructiveMigration()
            .build()
        Log.i("OnDatabase", "Se esta creando la database")
        return database
    }

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
        return Retrofit.Builder()
            .baseUrl("https://monkfish-app-nqddj.ondigitalocean.app/")
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