package com.sugarcoachpremium.ui.profile.interactor;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J2\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u001bH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\"\u001a\u00020 H\u0016R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/sugarcoachpremium/ui/profile/interactor/ProfileInteractor;", "Lcom/sugarcoachpremium/data/ui/base/interactor/BaseInteractor;", "Lcom/sugarcoachpremium/ui/profile/interactor/ProfileInteractorImp;", "dailyRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;", "treamentRepo", "Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;", "userRepoHelper", "Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;", "preferenceHelper", "Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;", "apiHelper", "Lcom/sugarcoachpremium/data/network/ApiHelper;", "(Lcom/sugarcoachpremium/data/database/repository/dailyregister/DailyRegisterRepo;Lcom/sugarcoachpremium/data/database/repository/treament/TreamentRepo;Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;Lcom/sugarcoachpremium/di/preferences/PreferenceHelper;Lcom/sugarcoachpremium/data/network/ApiHelper;)V", "apiRepo", "Lcom/sugarcoachpremium/data/api_db/ApiRepository;", "getApiRepo", "()Lcom/sugarcoachpremium/data/api_db/ApiRepository;", "setApiRepo", "(Lcom/sugarcoachpremium/data/api_db/ApiRepository;)V", "deleteAll", "Lio/reactivex/Observable;", "", "deleteTreament", "deleteUser", "getDataId", "Lkotlin/Result;", "", "getDataId-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "Lio/reactivex/Single;", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "updateApiUser", "user", "id", "updateApiUser-0E7RQCE", "(Lcom/sugarcoachpremium/data/database/repository/user/User;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "app_release"})
public final class ProfileInteractor extends com.sugarcoachpremium.data.ui.base.interactor.BaseInteractor implements com.sugarcoachpremium.ui.profile.interactor.ProfileInteractorImp {
    @org.jetbrains.annotations.NotNull
    private final com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo dailyRepoHelper = null;
    @org.jetbrains.annotations.NotNull
    private final com.sugarcoachpremium.data.database.repository.treament.TreamentRepo treamentRepo = null;
    @javax.inject.Inject
    public com.sugarcoachpremium.data.api_db.ApiRepository apiRepo;
    
    @javax.inject.Inject
    public ProfileInteractor(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.dailyregister.DailyRegisterRepo dailyRepoHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.treament.TreamentRepo treamentRepo, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.UserRepo userRepoHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.di.preferences.PreferenceHelper preferenceHelper, @org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.network.ApiHelper apiHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sugarcoachpremium.data.api_db.ApiRepository getApiRepo() {
        return null;
    }
    
    public final void setApiRepo(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.api_db.ApiRepository p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> deleteTreament() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> deleteAll() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> deleteUser() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> updateUser(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User user) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.user.User> getUser() {
        return null;
    }
}