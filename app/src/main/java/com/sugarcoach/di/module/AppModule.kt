package com.sugarcoach.di.module

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.room.Room
import androidx.room.RoomDatabase
import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.network.okHttpClient
import com.sugarcoach.BuildConfig.*
import com.sugarcoach.data.api_db.ApiClient
import com.sugarcoach.data.api_db.ApiRepository
import com.sugarcoach.data.database.AppDatabase
import com.sugarcoach.data.database.repository.dailyregister.DailyRegisterRepo
import com.sugarcoach.data.database.repository.dailyregister.DailyRegisterRepository
import com.sugarcoach.data.database.repository.treament.TreamentRepo
import com.sugarcoach.data.database.repository.treament.TreamentRepository
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

    private val PRODUCTIONAPITOKEN = "64445c5953bc00a2e6039b3acb24d8fc18017180ccc99f29e30610e040dd55da0b7f4d57036ec86e850c8e3ffb5f38bd2bd7a34b5a377852de8939ca4f0e4603f1d724378d6c7d495c879ece2005ff162692b1c4c61d11fd18430511eab32f637f7442322255bbe47a1f828bc433367d99c6a421e3394bba38acc038edf6edaa"
    private val DEVELOPAPITOKEN = "5d913c4bd45cefe7702664e36def1d4e3418c2134ea03d283ded5eb1f83c88e3c5a53b2300869810d686f99629e8cfe14a3bd998da6d8178ca19de9aca86a77a3dee5d42f0ecc74b2a1f6fd24b163f3ebd5f6b43dcbedd84dbf4daf28f8764298bf7ebf9eaea8c1b0de87b6211ab1015241b2c78cbe447d0cf251d56090f2a7a"
    @Provides
    @Singleton
    internal fun provideApolloClient(): ApolloClient {
        Log.i("OnProvideApi", "Se esta creando la API")
        return ApolloClient.Builder()
            .serverUrl("http://loadbalancer-1417729450.us-east-1.elb.amazonaws.com/graphql")
            .okHttpClient(OkHttpClient.Builder().build())
            .addHttpHeader("Authorization", PRODUCTIONAPITOKEN)
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