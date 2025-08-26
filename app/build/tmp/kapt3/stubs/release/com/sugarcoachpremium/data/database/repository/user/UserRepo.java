package com.sugarcoachpremium.data.database.repository.user;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0004H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\u000f"}, d2 = {"Lcom/sugarcoachpremium/data/database/repository/user/UserRepo;", "", "deleteUser", "Lio/reactivex/Observable;", "", "getUserId", "", "insertRegister", "user", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "isUserLogged", "isUserRepoEmpty", "loadUser", "Lio/reactivex/Single;", "updateUser", "app_release"})
public abstract interface UserRepo {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> isUserRepoEmpty();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> insertRegister(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User user);
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.user.User> loadUser();
    
    public abstract int getUserId();
    
    public abstract boolean isUserLogged();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteUser();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Boolean> updateUser(@org.jetbrains.annotations.NotNull
    com.sugarcoachpremium.data.database.repository.user.User user);
}