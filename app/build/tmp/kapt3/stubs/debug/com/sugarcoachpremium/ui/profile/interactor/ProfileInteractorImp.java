package com.sugarcoachpremium.ui.profile.interactor;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0004H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00a6@\u00a2\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&\u00a8\u0006\u0015\u00c0\u0006\u0003"}, d2 = {"Lcom/sugarcoachpremium/ui/profile/interactor/ProfileInteractorImp;", "Lcom/sugarcoachpremium/data/ui/base/interactor/Interactor;", "getUser", "Lio/reactivex/Single;", "Lcom/sugarcoachpremium/data/database/repository/user/User;", "updateUser", "Lio/reactivex/Observable;", "", "user", "getDataId", "Lkotlin/Result;", "", "getDataId-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateApiUser", "id", "updateApiUser-0E7RQCE", "(Lcom/sugarcoachpremium/data/database/repository/user/User;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUser", "deleteAll", "deleteTreament", "app_debug"})
public abstract interface ProfileInteractorImp extends com.sugarcoachpremium.data.ui.base.interactor.Interactor {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.sugarcoachpremium.data.database.repository.user.User> getUser();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> updateUser(@org.jetbrains.annotations.NotNull()
    com.sugarcoachpremium.data.database.repository.user.User user);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteUser();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteAll();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> deleteTreament();
}