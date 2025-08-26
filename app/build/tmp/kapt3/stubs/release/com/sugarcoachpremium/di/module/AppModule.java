package com.sugarcoachpremium.di.module;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001\u00a2\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u00a2\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\tH\u0001\u00a2\u0006\u0002\b\u0011J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0001\u00a2\u0006\u0002\b\u0016J\r\u0010\u0017\u001a\u00020\u0018H\u0001\u00a2\u0006\u0002\b\u0019J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0001\u00a2\u0006\u0002\b\u001dJ\u0015\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0013H\u0001\u00a2\u0006\u0002\b!J\u0015\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001\u00a2\u0006\u0002\b&J\b\u0010\'\u001a\u00020\u000eH\u0007J\r\u0010(\u001a\u00020)H\u0001\u00a2\u0006\u0002\b*J\u0015\u0010+\u001a\u00020,2\u0006\u0010 \u001a\u00020\u0013H\u0001\u00a2\u0006\u0002\b-J\u0015\u0010.\u001a\u00020/2\u0006\u0010 \u001a\u00020\u0013H\u0001\u00a2\u0006\u0002\b0J\r\u00101\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b2R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/sugarcoachpremium/di/module/AppModule;", "", "()V", "DEVELOPAPITOKEN", "", "PRODUCTIONAPITOKEN", "getRepository", "Lcom/sugarcoachpremium/data/api_db/ApiClient;", "client", "Lcom/apollographql/apollo3/ApolloClient;", "getRepository$app_release", "provideApiHelper", "Lcom/sugarcoachpremium/data/network/ApiHelper;", "retrofit", "Lretrofit2/Retrofit;", "provideApiHelper$app_release", "provideApolloClient", "provideApolloClient$app_release", "provideAppDatabase", "Lcom/sugarcoachpremium/data/database/AppDatabase;", "context", "Landroid/content/Context;", "provideAppDatabase$app_release", "provideCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "provideCompositeDisposable$app_release", "provideContext", "application", "Landroid/app/Application;", "provideContext$app_release", "provideDailyRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;", "appDatabase", "provideDailyRepoHelper$app_release", "providePrefHelper", "Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;", "appPreferenceHelper", "Lcom/sugarcoachpremium/data/preferences/AppPreferenceHelper;", "providePrefHelper$app_release", "provideRetrofit", "provideSchedulerProvider", "Lcom/sugarcoachpremium/util/SchedulerProvider;", "provideSchedulerProvider$app_release", "provideTreamentRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;", "provideTreamentRepoHelper$app_release", "provideUserRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;", "provideUserRepoHelper$app_release", "provideprefFileName", "provideprefFileName$app_release", "app_release"})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String PRODUCTIONAPITOKEN = "407f65c84995cb113a6911ba72c0b88d0b1659c74d5bf27fd05dc705631be9d81fde453ba5a5007c008ecefd56cf3f4f67cf9da5a65b9c411d72cf60ffdf1ff04ecff86ea0609259ee57f46dead479a9b85950f8af16e2f0aa3b22bc1cfa3d1a8a26db07f96f238545b6d108bb3956c119376b72066a186eb872cba5a6d654cd";
    @org.jetbrains.annotations.NotNull
    private final java.lang.String DEVELOPAPITOKEN = "5d913c4bd45cefe7702664e36def1d4e3418c2134ea03d283ded5eb1f83c88e3c5a53b2300869810d686f99629e8cfe14a3bd998da6d8178ca19de9aca86a77a3dee5d42f0ecc74b2a1f6fd24b163f3ebd5f6b43dcbedd84dbf4daf28f8764298bf7ebf9eaea8c1b0de87b6211ab1015241b2c78cbe447d0cf251d56090f2a7a";
    
    public AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.apollographql.apollo3.ApolloClient provideApolloClient$app_release() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.api_db.ApiClient getRepository$app_release(@org.jetbrains.annotations.NotNull
    com.apollographql.apollo3.ApolloClient client) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final android.content.Context provideContext$app_release(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.database.AppDatabase provideAppDatabase$app_release(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides
    @com.sugarcoachpremium.di.PreferenceInfo
    @org.jetbrains.annotations.NotNull
    public final java.lang.String provideprefFileName$app_release() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.di.preferences.PreferenceHelper providePrefHelper$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.preferences.AppPreferenceHelper appPreferenceHelper) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provideRetrofit() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.network.ApiHelper provideApiHelper$app_release(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.database.repository.user.UserRepo provideUserRepoHelper$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.AppDatabase appDatabase) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.database.repository.treament.TreamentRepo provideTreamentRepoHelper$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.AppDatabase appDatabase) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo provideDailyRepoHelper$app_release(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.AppDatabase appDatabase) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.disposables.CompositeDisposable provideCompositeDisposable$app_release() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.util.SchedulerProvider provideSchedulerProvider$app_release() {
        return null;
    }
}