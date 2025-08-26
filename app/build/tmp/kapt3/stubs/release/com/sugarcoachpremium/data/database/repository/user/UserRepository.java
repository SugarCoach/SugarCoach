package com.sugarcoachpremium.data.database.repository.user;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/user/UserRepository;", "Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;", "userDao", "Lcom/sugarcoachpremium/data/database/repository/user/UserDao;", "(Lcom/sugarcoachpremium/data/database/repository/user/UserDao;)V", "deleteUser", "Lio/reactivex/Observable;", "", "getUserId", "", "insertRegister", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "isUserLogged", "isUserRepoEmpty", "loadUser", "Lio/reactivex/Single;", "updateUser", "app_release"})
public final class UserRepository implements com.sugarcoachpremium.data.database.repository.user.UserRepo {
    @org.jetbrains.annotations.NotNull
    private final com.sugarcoachpremium.data.database.repository.user.UserDao userDao = null;
    
    @javax.inject.Inject
    public UserRepository(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.UserDao userDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> deleteUser() {
        return null;
    }
    
    @java.lang.Override
    public boolean isUserLogged() {
        return false;
    }
    
    @java.lang.Override
    public int getUserId() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> insertRegister(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User user) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Single<com.sugarcoachpremium.data.database.repository.user.User> loadUser() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> isUserRepoEmpty() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public io.reactivex.Observable<java.lang.Boolean> updateUser(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User user) {
        return null;
    }
}