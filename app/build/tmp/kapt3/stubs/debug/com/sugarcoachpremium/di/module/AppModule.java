package com.sugarcoachpremium.di.module;

@dagger.Module()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0007\u001a\u00020\bH\u0001\u00a2\u0006\u0002\b\tJ\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0001\u00a2\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001\u00a2\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fH\u0001\u00a2\u0006\u0002\b\u0016J\r\u0010\u0017\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\b\u0018J\u0015\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0001\u00a2\u0006\u0002\b\u001dJ\b\u0010\u001e\u001a\u00020\u001fH\u0007J\u0015\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001fH\u0001\u00a2\u0006\u0002\b#J\u0015\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0014H\u0001\u00a2\u0006\u0002\b\'J\u0015\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020\u0014H\u0001\u00a2\u0006\u0002\b*J\u0015\u0010+\u001a\u00020,2\u0006\u0010&\u001a\u00020\u0014H\u0001\u00a2\u0006\u0002\b-J\r\u0010.\u001a\u00020/H\u0001\u00a2\u0006\u0002\b0J\r\u00101\u001a\u000202H\u0001\u00a2\u0006\u0002\b3R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/sugarcoachpremium/di/module/AppModule;", "", "<init>", "()V", "PRODUCTIONAPITOKEN", "", "DEVELOPAPITOKEN", "provideApolloClient", "Lcom/apollographql/apollo3/ApolloClient;", "provideApolloClient$app_debug", "getRepository", "Lcom/sugarcoachpremium/data/api_db/ApiClient;", "client", "getRepository$app_debug", "provideContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "provideContext$app_debug", "provideAppDatabase", "Lcom/sugarcoachpremium/data/database/AppDatabase;", "context", "provideAppDatabase$app_debug", "provideprefFileName", "provideprefFileName$app_debug", "providePrefHelper", "Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;", "appPreferenceHelper", "Lcom/sugarcoachpremium/data/preferences/AppPreferenceHelper;", "providePrefHelper$app_debug", "provideRetrofit", "Lretrofit2/Retrofit;", "provideApiHelper", "Lcom/sugarcoachpremium/data/network/ApiHelper;", "retrofit", "provideApiHelper$app_debug", "provideUserRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;", "appDatabase", "provideUserRepoHelper$app_debug", "provideTreamentRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;", "provideTreamentRepoHelper$app_debug", "provideDailyRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;", "provideDailyRepoHelper$app_debug", "provideCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "provideCompositeDisposable$app_debug", "provideSchedulerProvider", "Lcom/sugarcoachpremium/util/SchedulerProvider;", "provideSchedulerProvider$app_debug", "app_debug"})
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String PRODUCTIONAPITOKEN = "407f65c84995cb113a6911ba72c0b88d0b1659c74d5bf27fd05dc705631be9d81fde453ba5a5007c008ecefd56cf3f4f67cf9da5a65b9c411d72cf60ffdf1ff04ecff86ea0609259ee57f46dead479a9b85950f8af16e2f0aa3b22bc1cfa3d1a8a26db07f96f238545b6d108bb3956c119376b72066a186eb872cba5a6d654cd";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String DEVELOPAPITOKEN = "5d913c4bd45cefe7702664e36def1d4e3418c2134ea03d283ded5eb1f83c88e3c5a53b2300869810d686f99629e8cfe14a3bd998da6d8178ca19de9aca86a77a3dee5d42f0ecc74b2a1f6fd24b163f3ebd5f6b43dcbedd84dbf4daf28f8764298bf7ebf9eaea8c1b0de87b6211ab1015241b2c78cbe447d0cf251d56090f2a7a";
    
    public AppModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.apollographql.apollo3.ApolloClient provideApolloClient$app_debug() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.api_db.ApiClient getRepository$app_debug(@org.jetbrains.annotations.NotNull()
    com.apollographql.apollo3.ApolloClient client) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context provideContext$app_debug(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.AppDatabase provideAppDatabase$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @com.sugarcoachpremium.di.PreferenceInfo()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String provideprefFileName$app_debug() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.di.preferences.PreferenceHelper providePrefHelper$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.preferences.AppPreferenceHelper appPreferenceHelper) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit provideRetrofit() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.network.ApiHelper provideApiHelper$app_debug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.user.UserRepo provideUserRepoHelper$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.AppDatabase appDatabase) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.treament.TreamentRepo provideTreamentRepoHelper$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.AppDatabase appDatabase) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo provideDailyRepoHelper$app_debug(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.AppDatabase appDatabase) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable provideCompositeDisposable$app_debug() {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.sugarcoachpremium.util.SchedulerProvider provideSchedulerProvider$app_debug() {
        return null;
    }
}